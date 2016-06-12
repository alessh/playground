/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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
package com.amazonaws.services.kinesisfirehose;

import com.amazonaws.services.kinesisfirehose.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Firehose asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Kinesis Firehose API Reference</fullname>
 * <p>
 * Amazon Kinesis Firehose is a fully-managed service that delivers real-time
 * streaming data to destinations such as Amazon S3 and Amazon Redshift.
 * </p>
 */
@ThreadSafe
public class AmazonKinesisFirehoseAsyncClient extends
        AmazonKinesisFirehoseClient implements AmazonKinesisFirehoseAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisFirehoseAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose. A credentials provider chain will be used that searches for
     * credentials in this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Credential profiles file at the default location (~/.aws/credentials)
     * shared by all AWS SDKs and the AWS CLI</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Firehose (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials, executor service,
     * and client configuration options.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials provider. Default
     * client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * 50 threads (to match the default maximum number of concurrent connections
     * to the service).
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the provided AWS account credentials provider and client
     * configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool containing
     * a number of threads equal to the maximum number of concurrent connections
     * configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Firehose using the specified AWS account credentials provider, executor
     * service, and client configuration options.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        Client configuration options (ex: max retry limit, proxy settings,
     *        etc).
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisFirehoseAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentialsProvider, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Returns the executor service used by this client to execute async
     * requests.
     *
     * @return The executor service used by this client to execute async
     *         requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(
            CreateDeliveryStreamRequest request) {

        return createDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateDeliveryStreamResult> createDeliveryStreamAsync(
            final CreateDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateDeliveryStreamRequest, CreateDeliveryStreamResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateDeliveryStreamResult>() {
                    @Override
                    public CreateDeliveryStreamResult call() throws Exception {
                        CreateDeliveryStreamResult result;

                        try {
                            result = createDeliveryStream(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(
            DeleteDeliveryStreamRequest request) {

        return deleteDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteDeliveryStreamResult> deleteDeliveryStreamAsync(
            final DeleteDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDeliveryStreamRequest, DeleteDeliveryStreamResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DeleteDeliveryStreamResult>() {
                    @Override
                    public DeleteDeliveryStreamResult call() throws Exception {
                        DeleteDeliveryStreamResult result;

                        try {
                            result = deleteDeliveryStream(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(
            DescribeDeliveryStreamRequest request) {

        return describeDeliveryStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryStreamResult> describeDeliveryStreamAsync(
            final DescribeDeliveryStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDeliveryStreamRequest, DescribeDeliveryStreamResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDeliveryStreamResult>() {
                    @Override
                    public DescribeDeliveryStreamResult call() throws Exception {
                        DescribeDeliveryStreamResult result;

                        try {
                            result = describeDeliveryStream(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(
            ListDeliveryStreamsRequest request) {

        return listDeliveryStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDeliveryStreamsResult> listDeliveryStreamsAsync(
            final ListDeliveryStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListDeliveryStreamsRequest, ListDeliveryStreamsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListDeliveryStreamsResult>() {
                    @Override
                    public ListDeliveryStreamsResult call() throws Exception {
                        ListDeliveryStreamsResult result;

                        try {
                            result = listDeliveryStreams(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            PutRecordRequest request) {

        return putRecordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            final PutRecordRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutRecordResult>() {
                    @Override
                    public PutRecordResult call() throws Exception {
                        PutRecordResult result;

                        try {
                            result = putRecord(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(
            PutRecordBatchRequest request) {

        return putRecordBatchAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordBatchResult> putRecordBatchAsync(
            final PutRecordBatchRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordBatchRequest, PutRecordBatchResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutRecordBatchResult>() {
                    @Override
                    public PutRecordBatchResult call() throws Exception {
                        PutRecordBatchResult result;

                        try {
                            result = putRecordBatch(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(
            UpdateDestinationRequest request) {

        return updateDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateDestinationResult> updateDestinationAsync(
            final UpdateDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateDestinationRequest, UpdateDestinationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<UpdateDestinationResult>() {
                    @Override
                    public UpdateDestinationResult call() throws Exception {
                        UpdateDestinationResult result;

                        try {
                            result = updateDestination(request);
                        } catch (Exception ex) {
                            if (asyncHandler != null) {
                                asyncHandler.onError(ex);
                            }
                            throw ex;
                        }

                        if (asyncHandler != null) {
                            asyncHandler.onSuccess(request, result);
                        }
                        return result;
                    }
                });
    }

    /**
     * Shuts down the client, releasing all managed resources. This includes
     * forcibly terminating all pending asynchronous service calls. Clients who
     * wish to give pending asynchronous service calls time to complete should
     * call {@code getExecutorService().shutdown()} followed by
     * {@code getExecutorService().awaitTermination()} prior to calling this
     * method.
     */
    @Override
    public void shutdown() {
        super.shutdown();
        executorService.shutdownNow();
    }
}
