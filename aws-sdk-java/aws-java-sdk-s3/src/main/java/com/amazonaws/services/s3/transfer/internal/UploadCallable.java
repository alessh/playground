/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.s3.transfer.internal;

import static com.amazonaws.event.SDKProgressPublisher.publishProgress;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.event.ProgressEventType;
import com.amazonaws.event.ProgressListenerChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Encryption;
import com.amazonaws.services.s3.model.AbortMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadRequest;
import com.amazonaws.services.s3.model.CompleteMultipartUploadResult;
import com.amazonaws.services.s3.model.EncryptedInitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.EncryptedPutObjectRequest;
import com.amazonaws.services.s3.model.InitiateMultipartUploadRequest;
import com.amazonaws.services.s3.model.ListPartsRequest;
import com.amazonaws.services.s3.model.PartETag;
import com.amazonaws.services.s3.model.PartListing;
import com.amazonaws.services.s3.model.PartSummary;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.model.PutObjectResult;
import com.amazonaws.services.s3.model.UploadPartRequest;
import com.amazonaws.services.s3.transfer.PersistableUpload;
import com.amazonaws.services.s3.transfer.Transfer.TransferState;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.TransferManagerConfiguration;
import com.amazonaws.services.s3.transfer.TransferProgress;
import com.amazonaws.services.s3.transfer.model.UploadResult;

public class UploadCallable implements Callable<UploadResult> {
    private final AmazonS3 s3;
    private final ExecutorService threadPool;
    private final PutObjectRequest origReq;
    private String multipartUploadId;
    private final UploadImpl upload;

    private static final Log log = LogFactory.getLog(UploadCallable.class);
    private final TransferManagerConfiguration configuration;
    private final List<Future<PartETag>> futures = new ArrayList<Future<PartETag>>();
    private final ProgressListenerChain listener;
    private final TransferProgress transferProgress;

    /**
     * ETags retrieved from Amazon S3 for a multi-part upload id. These parts
     * will be skipped while resuming a paused upload.
     */
    private final List<PartETag> eTagsToSkip = new ArrayList<PartETag>();

    private PersistableUpload persistableUpload;

    public UploadCallable(TransferManager transferManager,
            ExecutorService threadPool, UploadImpl upload,
            PutObjectRequest origReq,
            ProgressListenerChain progressListenerChain, String uploadId,
            TransferProgress transferProgress) {
        this.s3 = transferManager.getAmazonS3Client();
        this.configuration = transferManager.getConfiguration();

        this.threadPool = threadPool;
        this.origReq = origReq;
        this.listener = progressListenerChain;
        this.upload = upload;
        this.multipartUploadId = uploadId;
        this.transferProgress = transferProgress;
    }

    List<Future<PartETag>> getFutures() {
        return futures;
    }

    /**
     * Returns the ETags retrieved from Amazon S3 for a multi-part upload id.
     * These parts will be skipped while resuming a paused upload.
     */
    List<PartETag> getETags() {
        return eTagsToSkip;
    }

    String getMultipartUploadId() {
        return multipartUploadId;
    }

    /**
     * Returns true if this UploadCallable is processing a multipart upload.
     * @return True if this UploadCallable is processing a multipart upload.
     */
    public boolean isMultipartUpload() {
        return TransferManagerUtils.shouldUseMultipartUpload(origReq, configuration);
    }

    public UploadResult call() throws Exception {
        upload.setState(TransferState.InProgress);
        if ( isMultipartUpload() ) {
            publishProgress(listener, ProgressEventType.TRANSFER_STARTED_EVENT);
            return uploadInParts();
        } else {
            return uploadInOneChunk();
        }
    }

    /**
     * Uploads the given request in a single chunk and returns the result.
     */
    private UploadResult uploadInOneChunk() {
        PutObjectResult putObjectResult = s3.putObject(origReq);

        UploadResult uploadResult = new UploadResult();
        uploadResult.setBucketName(origReq.getBucketName());
        uploadResult.setKey(origReq.getKey());
        uploadResult.setETag(putObjectResult.getETag());
        uploadResult.setVersionId(putObjectResult.getVersionId());
        return uploadResult;
    }

    /**
     * Captures the state of the upload.
     */
    private void captureUploadStateIfPossible() {
        if (origReq.getSSECustomerKey() == null) {
            persistableUpload = new PersistableUpload(origReq.getBucketName(),
                    origReq.getKey(), origReq.getFile()
                            .getAbsolutePath(), multipartUploadId,
                    configuration.getMinimumUploadPartSize(),
                    configuration.getMultipartUploadThreshold());
            notifyPersistableTransferAvailability();
        }
    }

    public PersistableUpload getPersistableUpload() {
        return persistableUpload;
    }

    /**
     * Notifies to the callbacks that state is available
     */
    private void notifyPersistableTransferAvailability() {
        S3ProgressPublisher.publishTransferPersistable(
                listener, persistableUpload);
    }

    /**
     * Uploads the request in multiple chunks, submitting each upload chunk task
     * to the thread pool and recording its corresponding Future object, as well
     * as the multipart upload id.
     */
    private UploadResult uploadInParts() throws Exception {
        boolean isUsingEncryption = s3 instanceof AmazonS3Encryption;
        long optimalPartSize = getOptimalPartSize(isUsingEncryption);

        try {
            if (multipartUploadId == null) {
                multipartUploadId = initiateMultipartUpload(origReq,
                        isUsingEncryption);
            }

            UploadPartRequestFactory requestFactory = new UploadPartRequestFactory(origReq, multipartUploadId, optimalPartSize);

            if (TransferManagerUtils.isUploadParallelizable(origReq, isUsingEncryption)) {
                captureUploadStateIfPossible();
                uploadPartsInParallel(requestFactory, multipartUploadId);
                return null;
            } else {
                return uploadPartsInSeries(requestFactory);
            }
        } catch (Exception e) {
            publishProgress(listener, ProgressEventType.TRANSFER_FAILED_EVENT);
            performAbortMultipartUpload();
            throw e;
        } finally {
            if (origReq.getInputStream() != null) {
                try {origReq.getInputStream().close(); } catch (Exception e) {
                    log.warn("Unable to cleanly close input stream: " + e.getMessage(), e);
                }
            }
        }
    }

    /**
     * Performs an
     * {@link AmazonS3#abortMultipartUpload(AbortMultipartUploadRequest)}
     * operation for the given multi-part upload.
     */
    void performAbortMultipartUpload() {
        try {
            if (multipartUploadId != null)
                s3.abortMultipartUpload(new AbortMultipartUploadRequest(
                        origReq.getBucketName(), origReq
                                .getKey(), multipartUploadId));
        } catch (Exception e2) {
            log.info(
                    "Unable to abort multipart upload, you may need to manually remove uploaded parts: "
                            + e2.getMessage(), e2);
        }
    }

    /**
     * Computes and returns the optimal part size for the upload.
     */
    private long getOptimalPartSize(boolean isUsingEncryption) {
        long optimalPartSize = TransferManagerUtils.calculateOptimalPartSize(origReq, configuration);
        if (isUsingEncryption && optimalPartSize % 32 > 0) {
            // When using encryption, parts must line up correctly along cipher block boundaries
            optimalPartSize = optimalPartSize - (optimalPartSize % 32) + 32 ;
        }
        log.debug("Calculated optimal part size: " + optimalPartSize);
        return optimalPartSize;
    }

    /**
     * Uploads all parts in the request in serial in this thread, then completes
     * the upload and returns the result.
     */
    private UploadResult uploadPartsInSeries(UploadPartRequestFactory requestFactory) {

        final List<PartETag> partETags = new ArrayList<PartETag>();

        while (requestFactory.hasMoreRequests()) {
            if (threadPool.isShutdown()) throw new CancellationException("TransferManager has been shutdown");
            UploadPartRequest uploadPartRequest = requestFactory.getNextUploadPartRequest();
            // Mark the stream in case we need to reset it
            InputStream inputStream = uploadPartRequest.getInputStream();
            if (inputStream != null && inputStream.markSupported()) {
                if (uploadPartRequest.getPartSize() >= Integer.MAX_VALUE) {
                    inputStream.mark(Integer.MAX_VALUE);
                } else {
                    inputStream.mark((int)uploadPartRequest.getPartSize());
                }
            }
            partETags.add(s3.uploadPart(uploadPartRequest).getPartETag());
        }

        CompleteMultipartUploadRequest req =
            new CompleteMultipartUploadRequest(
                origReq.getBucketName(), origReq.getKey(), multipartUploadId,
                    partETags)
            .withGeneralProgressListener(origReq.getGeneralProgressListener())
            .withRequestMetricCollector(origReq.getRequestMetricCollector())
            ;
        CompleteMultipartUploadResult res = s3.completeMultipartUpload(req);

        UploadResult uploadResult = new UploadResult();
        uploadResult.setBucketName(res.getBucketName());
        uploadResult.setKey(res.getKey());
        uploadResult.setETag(res.getETag());
        uploadResult.setVersionId(res.getVersionId());
        return uploadResult;
    }

    /**
     * Submits a callable for each part to upload to our thread pool and records its corresponding Future.
     */
    private void uploadPartsInParallel(UploadPartRequestFactory requestFactory,
            String uploadId) {

        Map<Integer,PartSummary> partNumbers = identifyExistingPartsForResume(uploadId);

        while (requestFactory.hasMoreRequests()) {
            if (threadPool.isShutdown()) throw new CancellationException("TransferManager has been shutdown");
            UploadPartRequest request = requestFactory.getNextUploadPartRequest();
            if (partNumbers.containsKey(request.getPartNumber())) {
                PartSummary summary = partNumbers.get(request.getPartNumber());
                eTagsToSkip.add(new PartETag(request.getPartNumber(), summary
                        .getETag()));
                transferProgress.updateProgress(summary.getSize());
                continue;
            }
            futures.add(threadPool.submit(new UploadPartCallable(s3, request)));
        }
    }

    private Map<Integer, PartSummary> identifyExistingPartsForResume(
            String uploadId) {
        Map<Integer, PartSummary> partNumbers = new HashMap<Integer, PartSummary>();
        if (uploadId == null) {
            return partNumbers;
        }
        int partNumber = 0;

        while (true) {
            PartListing parts = s3.listParts(new ListPartsRequest(
                    origReq.getBucketName(),
                    origReq.getKey(), uploadId)
                    .withPartNumberMarker(partNumber));
            for (PartSummary partSummary : parts.getParts()) {
                partNumbers.put(partSummary.getPartNumber(), partSummary);
            }
            if (!parts.isTruncated()) {
                return partNumbers;
            }
            partNumber = parts.getNextPartNumberMarker();
        }
    }

    /**
     * Initiates a multipart upload and returns the upload id
     * @param isUsingEncryption
     */
    private String initiateMultipartUpload(PutObjectRequest origReq, boolean isUsingEncryption) {

        InitiateMultipartUploadRequest req = null;
        if (isUsingEncryption && origReq instanceof EncryptedPutObjectRequest) {
            req = new EncryptedInitiateMultipartUploadRequest(
                    origReq.getBucketName(), origReq.getKey()).withCannedACL(
                    origReq.getCannedAcl()).withObjectMetadata(origReq.getMetadata());
            ((EncryptedInitiateMultipartUploadRequest) req)
                    .setMaterialsDescription(((EncryptedPutObjectRequest) origReq).getMaterialsDescription());
        } else {
            req = new InitiateMultipartUploadRequest(origReq.getBucketName(), origReq.getKey())
                .withCannedACL(origReq.getCannedAcl())
                .withObjectMetadata(origReq.getMetadata());
        }

        TransferManager.appendMultipartUserAgent(req);

        req.withAccessControlList(origReq.getAccessControlList())
           .withStorageClass(origReq.getStorageClass())
           .withRedirectLocation(origReq.getRedirectLocation())
           .withSSECustomerKey(origReq.getSSECustomerKey())
           .withSSEAwsKeyManagementParams(origReq.getSSEAwsKeyManagementParams())
           .withGeneralProgressListener(origReq.getGeneralProgressListener())
           .withRequestMetricCollector(origReq.getRequestMetricCollector())
           ;

        String uploadId = s3.initiateMultipartUpload(req).getUploadId();
        log.debug("Initiated new multipart upload: " + uploadId);

        return uploadId;
    }
}
