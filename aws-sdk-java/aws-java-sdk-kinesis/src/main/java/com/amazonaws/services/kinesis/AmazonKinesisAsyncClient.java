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
package com.amazonaws.services.kinesis;

import com.amazonaws.services.kinesis.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Kinesis asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Kinesis Service API Reference</fullname>
 * <p>
 * Amazon Kinesis is a managed service that scales elastically for real time
 * processing of streaming big data.
 * </p>
 */
@ThreadSafe
public class AmazonKinesisAsyncClient extends AmazonKinesisClient implements
        AmazonKinesisAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Kinesis. A credentials provider chain will be used that searches for
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
    public AmazonKinesisAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * Kinesis. A credentials provider chain will be used that searches for
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
     *        connects to Kinesis (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonKinesisAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials.
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
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials and executor service. Default
     * client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials, executor service, and client
     * configuration options.
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
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials provider. Default client
     * settings will be used.
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
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the provided AWS account credentials provider and client
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
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonKinesisAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Kinesis
     * using the specified AWS account credentials provider, executor service,
     * and client configuration options.
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
    public AmazonKinesisAsyncClient(
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
    public java.util.concurrent.Future<Void> addTagsToStreamAsync(
            AddTagsToStreamRequest request) {

        return addTagsToStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addTagsToStreamAsync(
            final AddTagsToStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddTagsToStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            addTagsToStream(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> createStreamAsync(
            CreateStreamRequest request) {

        return createStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createStreamAsync(
            final CreateStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createStream(request);
                            result = null;
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
     * Simplified method form for invoking the CreateStream operation.
     *
     * @see #createStreamAsync(CreateStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> createStreamAsync(
            String streamName, Integer shardCount) {

        return createStreamAsync(new CreateStreamRequest().withStreamName(
                streamName).withShardCount(shardCount));
    }

    /**
     * Simplified method form for invoking the CreateStream operation with an
     * AsyncHandler.
     *
     * @see #createStreamAsync(CreateStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> createStreamAsync(
            String streamName,
            Integer shardCount,
            com.amazonaws.handlers.AsyncHandler<CreateStreamRequest, Void> asyncHandler) {

        return createStreamAsync(
                new CreateStreamRequest().withStreamName(streamName)
                        .withShardCount(shardCount), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> decreaseStreamRetentionPeriodAsync(
            DecreaseStreamRetentionPeriodRequest request) {

        return decreaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> decreaseStreamRetentionPeriodAsync(
            final DecreaseStreamRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecreaseStreamRetentionPeriodRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            decreaseStreamRetentionPeriod(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            DeleteStreamRequest request) {

        return deleteStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            final DeleteStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteStream(request);
                            result = null;
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
     * Simplified method form for invoking the DeleteStream operation.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> deleteStreamAsync(String streamName) {

        return deleteStreamAsync(new DeleteStreamRequest()
                .withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DeleteStream operation with an
     * AsyncHandler.
     *
     * @see #deleteStreamAsync(DeleteStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> deleteStreamAsync(
            String streamName,
            com.amazonaws.handlers.AsyncHandler<DeleteStreamRequest, Void> asyncHandler) {

        return deleteStreamAsync(
                new DeleteStreamRequest().withStreamName(streamName),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            DescribeStreamRequest request) {

        return describeStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            final DescribeStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeStreamResult>() {
                    @Override
                    public DescribeStreamResult call() throws Exception {
                        DescribeStreamResult result;

                        try {
                            result = describeStream(request);
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
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName) {

        return describeStreamAsync(new DescribeStreamRequest()
                .withStreamName(streamName));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest().withStreamName(
                streamName).withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName)
                        .withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the DescribeStream operation.
     *
     * @see #describeStreamAsync(DescribeStreamRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName, Integer limit, String exclusiveStartShardId) {

        return describeStreamAsync(new DescribeStreamRequest()
                .withStreamName(streamName).withLimit(limit)
                .withExclusiveStartShardId(exclusiveStartShardId));
    }

    /**
     * Simplified method form for invoking the DescribeStream operation with an
     * AsyncHandler.
     *
     * @see #describeStreamAsync(DescribeStreamRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeStreamResult> describeStreamAsync(
            String streamName,
            Integer limit,
            String exclusiveStartShardId,
            com.amazonaws.handlers.AsyncHandler<DescribeStreamRequest, DescribeStreamResult> asyncHandler) {

        return describeStreamAsync(
                new DescribeStreamRequest().withStreamName(streamName)
                        .withLimit(limit)
                        .withExclusiveStartShardId(exclusiveStartShardId),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(
            GetRecordsRequest request) {

        return getRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRecordsResult> getRecordsAsync(
            final GetRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetRecordsRequest, GetRecordsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetRecordsResult>() {
                    @Override
                    public GetRecordsResult call() throws Exception {
                        GetRecordsResult result;

                        try {
                            result = getRecords(request);
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
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            GetShardIteratorRequest request) {

        return getShardIteratorAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            final GetShardIteratorRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetShardIteratorResult>() {
                    @Override
                    public GetShardIteratorResult call() throws Exception {
                        GetShardIteratorResult result;

                        try {
                            result = getShardIterator(request);
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
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName, String shardId, String shardIteratorType) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with
     * an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName,
            String shardId,
            String shardIteratorType,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType), asyncHandler);
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest)
     */
    @Override
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName, String shardId, String shardIteratorType,
            String startingSequenceNumber) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber));
    }

    /**
     * Simplified method form for invoking the GetShardIterator operation with
     * an AsyncHandler.
     *
     * @see #getShardIteratorAsync(GetShardIteratorRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetShardIteratorResult> getShardIteratorAsync(
            String streamName,
            String shardId,
            String shardIteratorType,
            String startingSequenceNumber,
            com.amazonaws.handlers.AsyncHandler<GetShardIteratorRequest, GetShardIteratorResult> asyncHandler) {

        return getShardIteratorAsync(new GetShardIteratorRequest()
                .withStreamName(streamName).withShardId(shardId)
                .withShardIteratorType(shardIteratorType)
                .withStartingSequenceNumber(startingSequenceNumber),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> increaseStreamRetentionPeriodAsync(
            IncreaseStreamRetentionPeriodRequest request) {

        return increaseStreamRetentionPeriodAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> increaseStreamRetentionPeriodAsync(
            final IncreaseStreamRetentionPeriodRequest request,
            final com.amazonaws.handlers.AsyncHandler<IncreaseStreamRetentionPeriodRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            increaseStreamRetentionPeriod(request);
                            result = null;
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
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            ListStreamsRequest request) {

        return listStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            final ListStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListStreamsResult>() {
                    @Override
                    public ListStreamsResult call() throws Exception {
                        ListStreamsResult result;

                        try {
                            result = listStreams(request);
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
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync() {

        return listStreamsAsync(new ListStreamsRequest());
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest()
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(
                new ListStreamsRequest()
                        .withExclusiveStartStreamName(exclusiveStartStreamName),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListStreams operation.
     *
     * @see #listStreamsAsync(ListStreamsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            Integer limit, String exclusiveStartStreamName) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit)
                .withExclusiveStartStreamName(exclusiveStartStreamName));
    }

    /**
     * Simplified method form for invoking the ListStreams operation with an
     * AsyncHandler.
     *
     * @see #listStreamsAsync(ListStreamsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListStreamsResult> listStreamsAsync(
            Integer limit,
            String exclusiveStartStreamName,
            com.amazonaws.handlers.AsyncHandler<ListStreamsRequest, ListStreamsResult> asyncHandler) {

        return listStreamsAsync(new ListStreamsRequest().withLimit(limit)
                .withExclusiveStartStreamName(exclusiveStartStreamName),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(
            ListTagsForStreamRequest request) {

        return listTagsForStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForStreamResult> listTagsForStreamAsync(
            final ListTagsForStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTagsForStreamRequest, ListTagsForStreamResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTagsForStreamResult>() {
                    @Override
                    public ListTagsForStreamResult call() throws Exception {
                        ListTagsForStreamResult result;

                        try {
                            result = listTagsForStream(request);
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
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            MergeShardsRequest request) {

        return mergeShardsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            final MergeShardsRequest request,
            final com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            mergeShards(request);
                            result = null;
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
     * Simplified method form for invoking the MergeShards operation.
     *
     * @see #mergeShardsAsync(MergeShardsRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            String streamName, String shardToMerge, String adjacentShardToMerge) {

        return mergeShardsAsync(new MergeShardsRequest()
                .withStreamName(streamName).withShardToMerge(shardToMerge)
                .withAdjacentShardToMerge(adjacentShardToMerge));
    }

    /**
     * Simplified method form for invoking the MergeShards operation with an
     * AsyncHandler.
     *
     * @see #mergeShardsAsync(MergeShardsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> mergeShardsAsync(
            String streamName,
            String shardToMerge,
            String adjacentShardToMerge,
            com.amazonaws.handlers.AsyncHandler<MergeShardsRequest, Void> asyncHandler) {

        return mergeShardsAsync(
                new MergeShardsRequest().withStreamName(streamName)
                        .withShardToMerge(shardToMerge)
                        .withAdjacentShardToMerge(adjacentShardToMerge),
                asyncHandler);
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

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName, java.nio.ByteBuffer data, String partitionKey) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an
     * AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName,
            java.nio.ByteBuffer data,
            String partitionKey,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey), asyncHandler);
    }

    /**
     * Simplified method form for invoking the PutRecord operation.
     *
     * @see #putRecordAsync(PutRecordRequest)
     */
    @Override
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName, java.nio.ByteBuffer data, String partitionKey,
            String sequenceNumberForOrdering) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering));
    }

    /**
     * Simplified method form for invoking the PutRecord operation with an
     * AsyncHandler.
     *
     * @see #putRecordAsync(PutRecordRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PutRecordResult> putRecordAsync(
            String streamName,
            java.nio.ByteBuffer data,
            String partitionKey,
            String sequenceNumberForOrdering,
            com.amazonaws.handlers.AsyncHandler<PutRecordRequest, PutRecordResult> asyncHandler) {

        return putRecordAsync(new PutRecordRequest().withStreamName(streamName)
                .withData(data).withPartitionKey(partitionKey)
                .withSequenceNumberForOrdering(sequenceNumberForOrdering),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(
            PutRecordsRequest request) {

        return putRecordsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutRecordsResult> putRecordsAsync(
            final PutRecordsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRecordsRequest, PutRecordsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutRecordsResult>() {
                    @Override
                    public PutRecordsResult call() throws Exception {
                        PutRecordsResult result;

                        try {
                            result = putRecords(request);
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
    public java.util.concurrent.Future<Void> removeTagsFromStreamAsync(
            RemoveTagsFromStreamRequest request) {

        return removeTagsFromStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removeTagsFromStreamAsync(
            final RemoveTagsFromStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemoveTagsFromStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            removeTagsFromStream(request);
                            result = null;
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
    public java.util.concurrent.Future<Void> splitShardAsync(
            SplitShardRequest request) {

        return splitShardAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> splitShardAsync(
            final SplitShardRequest request,
            final com.amazonaws.handlers.AsyncHandler<SplitShardRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            splitShard(request);
                            result = null;
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
     * Simplified method form for invoking the SplitShard operation.
     *
     * @see #splitShardAsync(SplitShardRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> splitShardAsync(String streamName,
            String shardToSplit, String newStartingHashKey) {

        return splitShardAsync(new SplitShardRequest()
                .withStreamName(streamName).withShardToSplit(shardToSplit)
                .withNewStartingHashKey(newStartingHashKey));
    }

    /**
     * Simplified method form for invoking the SplitShard operation with an
     * AsyncHandler.
     *
     * @see #splitShardAsync(SplitShardRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> splitShardAsync(
            String streamName,
            String shardToSplit,
            String newStartingHashKey,
            com.amazonaws.handlers.AsyncHandler<SplitShardRequest, Void> asyncHandler) {

        return splitShardAsync(
                new SplitShardRequest().withStreamName(streamName)
                        .withShardToSplit(shardToSplit)
                        .withNewStartingHashKey(newStartingHashKey),
                asyncHandler);
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
