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
package com.amazonaws.services.logs;

import com.amazonaws.services.logs.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon CloudWatch Logs asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can be
 * used to receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon CloudWatch Logs API Reference</fullname>
 * <p>
 * You can use Amazon CloudWatch Logs to monitor, store, and access your log
 * files from Amazon Elastic Compute Cloud (Amazon EC2) instances, Amazon
 * CloudTrail, or other sources. You can then retrieve the associated log data
 * from CloudWatch Logs using the Amazon CloudWatch console, the CloudWatch Logs
 * commands in the AWS CLI, the CloudWatch Logs API, or the CloudWatch Logs SDK.
 * </p>
 * <p>
 * You can use CloudWatch Logs to:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Monitor Logs from Amazon EC2 Instances in Real-time</b>: You can use
 * CloudWatch Logs to monitor applications and systems using log data. For
 * example, CloudWatch Logs can track the number of errors that occur in your
 * application logs and send you a notification whenever the rate of errors
 * exceeds a threshold you specify. CloudWatch Logs uses your log data for
 * monitoring; so, no code changes are required. For example, you can monitor
 * application logs for specific literal terms (such as
 * "NullReferenceException") or count the number of occurrences of a literal
 * term at a particular position in log data (such as "404" status codes in an
 * Apache access log). When the term you are searching for is found, CloudWatch
 * Logs reports the data to a Amazon CloudWatch metric that you specify.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Monitor Amazon CloudTrail Logged Events</b>: You can create alarms in
 * Amazon CloudWatch and receive notifications of particular API activity as
 * captured by CloudTrail and use the notification to perform troubleshooting.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Archive Log Data</b>: You can use CloudWatch Logs to store your log data
 * in highly durable storage. You can change the log retention setting so that
 * any log events older than this setting are automatically deleted. The
 * CloudWatch Logs agent makes it easy to quickly send both rotated and
 * non-rotated log data off of a host and into the log service. You can then
 * access the raw log data when you need it.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AWSLogsAsyncClient extends AWSLogsClient implements AWSLogsAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs. A credentials provider chain will be used that searches
     * for credentials in this order:
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
    public AWSLogsAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs. A credentials provider chain will be used that searches
     * for credentials in this order:
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
     *        connects to Amazon CloudWatch Logs (ex: proxy settings, retry
     *        counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSLogsAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials.
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
    public AWSLogsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSLogsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials, executor
     * service, and client configuration options.
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
    public AWSLogsAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials provider.
     * Default client settings will be used.
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
    public AWSLogsAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the provided AWS account credentials provider and
     * client configuration options.
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
    public AWSLogsAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials provider and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AWSLogsAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * CloudWatch Logs using the specified AWS account credentials provider,
     * executor service, and client configuration options.
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
    public AWSLogsAsyncClient(
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
    public java.util.concurrent.Future<Void> cancelExportTaskAsync(
            CancelExportTaskRequest request) {

        return cancelExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> cancelExportTaskAsync(
            final CancelExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelExportTaskRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            cancelExportTask(request);
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
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(
            CreateExportTaskRequest request) {

        return createExportTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateExportTaskResult> createExportTaskAsync(
            final CreateExportTaskRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateExportTaskRequest, CreateExportTaskResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateExportTaskResult>() {
                    @Override
                    public CreateExportTaskResult call() throws Exception {
                        CreateExportTaskResult result;

                        try {
                            result = createExportTask(request);
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
    public java.util.concurrent.Future<Void> createLogGroupAsync(
            CreateLogGroupRequest request) {

        return createLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createLogGroupAsync(
            final CreateLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogGroupRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createLogGroup(request);
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
    public java.util.concurrent.Future<Void> createLogStreamAsync(
            CreateLogStreamRequest request) {

        return createLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createLogStreamAsync(
            final CreateLogStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateLogStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createLogStream(request);
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
    public java.util.concurrent.Future<Void> deleteDestinationAsync(
            DeleteDestinationRequest request) {

        return deleteDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDestinationAsync(
            final DeleteDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteDestinationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteDestination(request);
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
    public java.util.concurrent.Future<Void> deleteLogGroupAsync(
            DeleteLogGroupRequest request) {

        return deleteLogGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLogGroupAsync(
            final DeleteLogGroupRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogGroupRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteLogGroup(request);
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
    public java.util.concurrent.Future<Void> deleteLogStreamAsync(
            DeleteLogStreamRequest request) {

        return deleteLogStreamAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLogStreamAsync(
            final DeleteLogStreamRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteLogStreamRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteLogStream(request);
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
    public java.util.concurrent.Future<Void> deleteMetricFilterAsync(
            DeleteMetricFilterRequest request) {

        return deleteMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMetricFilterAsync(
            final DeleteMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMetricFilterRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteMetricFilter(request);
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
    public java.util.concurrent.Future<Void> deleteRetentionPolicyAsync(
            DeleteRetentionPolicyRequest request) {

        return deleteRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRetentionPolicyAsync(
            final DeleteRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteRetentionPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteRetentionPolicy(request);
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
    public java.util.concurrent.Future<Void> deleteSubscriptionFilterAsync(
            DeleteSubscriptionFilterRequest request) {

        return deleteSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSubscriptionFilterAsync(
            final DeleteSubscriptionFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteSubscriptionFilterRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteSubscriptionFilter(request);
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
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            DescribeDestinationsRequest request) {

        return describeDestinationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            final DescribeDestinationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeDestinationsResult>() {
                    @Override
                    public DescribeDestinationsResult call() throws Exception {
                        DescribeDestinationsResult result;

                        try {
                            result = describeDestinations(request);
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
     * Simplified method form for invoking the DescribeDestinations operation.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync() {

        return describeDestinationsAsync(new DescribeDestinationsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDestinations operation
     * with an AsyncHandler.
     *
     * @see #describeDestinationsAsync(DescribeDestinationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDestinationsResult> describeDestinationsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDestinationsRequest, DescribeDestinationsResult> asyncHandler) {

        return describeDestinationsAsync(new DescribeDestinationsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            DescribeExportTasksRequest request) {

        return describeExportTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeExportTasksResult> describeExportTasksAsync(
            final DescribeExportTasksRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeExportTasksRequest, DescribeExportTasksResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeExportTasksResult>() {
                    @Override
                    public DescribeExportTasksResult call() throws Exception {
                        DescribeExportTasksResult result;

                        try {
                            result = describeExportTasks(request);
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
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            DescribeLogGroupsRequest request) {

        return describeLogGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            final DescribeLogGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLogGroupsResult>() {
                    @Override
                    public DescribeLogGroupsResult call() throws Exception {
                        DescribeLogGroupsResult result;

                        try {
                            result = describeLogGroups(request);
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
     * Simplified method form for invoking the DescribeLogGroups operation.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync() {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeLogGroups operation with
     * an AsyncHandler.
     *
     * @see #describeLogGroupsAsync(DescribeLogGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeLogGroupsResult> describeLogGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeLogGroupsRequest, DescribeLogGroupsResult> asyncHandler) {

        return describeLogGroupsAsync(new DescribeLogGroupsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(
            DescribeLogStreamsRequest request) {

        return describeLogStreamsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeLogStreamsResult> describeLogStreamsAsync(
            final DescribeLogStreamsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeLogStreamsRequest, DescribeLogStreamsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeLogStreamsResult>() {
                    @Override
                    public DescribeLogStreamsResult call() throws Exception {
                        DescribeLogStreamsResult result;

                        try {
                            result = describeLogStreams(request);
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
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(
            DescribeMetricFiltersRequest request) {

        return describeMetricFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMetricFiltersResult> describeMetricFiltersAsync(
            final DescribeMetricFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMetricFiltersRequest, DescribeMetricFiltersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMetricFiltersResult>() {
                    @Override
                    public DescribeMetricFiltersResult call() throws Exception {
                        DescribeMetricFiltersResult result;

                        try {
                            result = describeMetricFilters(request);
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
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            DescribeSubscriptionFiltersRequest request) {

        return describeSubscriptionFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSubscriptionFiltersResult> describeSubscriptionFiltersAsync(
            final DescribeSubscriptionFiltersRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeSubscriptionFiltersRequest, DescribeSubscriptionFiltersResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeSubscriptionFiltersResult>() {
                    @Override
                    public DescribeSubscriptionFiltersResult call()
                            throws Exception {
                        DescribeSubscriptionFiltersResult result;

                        try {
                            result = describeSubscriptionFilters(request);
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
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(
            FilterLogEventsRequest request) {

        return filterLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<FilterLogEventsResult> filterLogEventsAsync(
            final FilterLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<FilterLogEventsRequest, FilterLogEventsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<FilterLogEventsResult>() {
                    @Override
                    public FilterLogEventsResult call() throws Exception {
                        FilterLogEventsResult result;

                        try {
                            result = filterLogEvents(request);
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
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(
            GetLogEventsRequest request) {

        return getLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLogEventsResult> getLogEventsAsync(
            final GetLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetLogEventsRequest, GetLogEventsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetLogEventsResult>() {
                    @Override
                    public GetLogEventsResult call() throws Exception {
                        GetLogEventsResult result;

                        try {
                            result = getLogEvents(request);
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
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(
            PutDestinationRequest request) {

        return putDestinationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutDestinationResult> putDestinationAsync(
            final PutDestinationRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDestinationRequest, PutDestinationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutDestinationResult>() {
                    @Override
                    public PutDestinationResult call() throws Exception {
                        PutDestinationResult result;

                        try {
                            result = putDestination(request);
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
    public java.util.concurrent.Future<Void> putDestinationPolicyAsync(
            PutDestinationPolicyRequest request) {

        return putDestinationPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putDestinationPolicyAsync(
            final PutDestinationPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutDestinationPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putDestinationPolicy(request);
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
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(
            PutLogEventsRequest request) {

        return putLogEventsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutLogEventsResult> putLogEventsAsync(
            final PutLogEventsRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutLogEventsRequest, PutLogEventsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PutLogEventsResult>() {
                    @Override
                    public PutLogEventsResult call() throws Exception {
                        PutLogEventsResult result;

                        try {
                            result = putLogEvents(request);
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
    public java.util.concurrent.Future<Void> putMetricFilterAsync(
            PutMetricFilterRequest request) {

        return putMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putMetricFilterAsync(
            final PutMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutMetricFilterRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putMetricFilter(request);
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
    public java.util.concurrent.Future<Void> putRetentionPolicyAsync(
            PutRetentionPolicyRequest request) {

        return putRetentionPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putRetentionPolicyAsync(
            final PutRetentionPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutRetentionPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putRetentionPolicy(request);
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
    public java.util.concurrent.Future<Void> putSubscriptionFilterAsync(
            PutSubscriptionFilterRequest request) {

        return putSubscriptionFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putSubscriptionFilterAsync(
            final PutSubscriptionFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutSubscriptionFilterRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putSubscriptionFilter(request);
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
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(
            TestMetricFilterRequest request) {

        return testMetricFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestMetricFilterResult> testMetricFilterAsync(
            final TestMetricFilterRequest request,
            final com.amazonaws.handlers.AsyncHandler<TestMetricFilterRequest, TestMetricFilterResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<TestMetricFilterResult>() {
                    @Override
                    public TestMetricFilterResult call() throws Exception {
                        TestMetricFilterResult result;

                        try {
                            result = testMetricFilter(request);
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
