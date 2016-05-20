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
package com.amazonaws.services.elasticfilesystem;

import com.amazonaws.services.elasticfilesystem.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing EFS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Elastic File System</fullname>
 */
@ThreadSafe
public class AmazonElasticFileSystemAsyncClient extends
        AmazonElasticFileSystemClient implements AmazonElasticFileSystemAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
    public AmazonElasticFileSystemAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
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
     *        connects to EFS (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on EFS
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
    public AmazonElasticFileSystemAsyncClient(
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
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            CreateFileSystemRequest request) {

        return createFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateFileSystemResult> createFileSystemAsync(
            final CreateFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateFileSystemRequest, CreateFileSystemResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateFileSystemResult>() {
                    @Override
                    public CreateFileSystemResult call() throws Exception {
                        CreateFileSystemResult result;

                        try {
                            result = createFileSystem(request);
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
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            CreateMountTargetRequest request) {

        return createMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateMountTargetResult> createMountTargetAsync(
            final CreateMountTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateMountTargetRequest, CreateMountTargetResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateMountTargetResult>() {
                    @Override
                    public CreateMountTargetResult call() throws Exception {
                        CreateMountTargetResult result;

                        try {
                            result = createMountTarget(request);
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
    public java.util.concurrent.Future<Void> createTagsAsync(
            CreateTagsRequest request) {

        return createTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createTagsAsync(
            final CreateTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createTags(request);
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
    public java.util.concurrent.Future<Void> deleteFileSystemAsync(
            DeleteFileSystemRequest request) {

        return deleteFileSystemAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteFileSystemAsync(
            final DeleteFileSystemRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteFileSystemRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteFileSystem(request);
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
    public java.util.concurrent.Future<Void> deleteMountTargetAsync(
            DeleteMountTargetRequest request) {

        return deleteMountTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteMountTargetAsync(
            final DeleteMountTargetRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteMountTargetRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteMountTarget(request);
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
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            DeleteTagsRequest request) {

        return deleteTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTagsAsync(
            final DeleteTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTagsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteTags(request);
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
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            DescribeFileSystemsRequest request) {

        return describeFileSystemsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            final DescribeFileSystemsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeFileSystemsResult>() {
                    @Override
                    public DescribeFileSystemsResult call() throws Exception {
                        DescribeFileSystemsResult result;

                        try {
                            result = describeFileSystems(request);
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
     * Simplified method form for invoking the DescribeFileSystems operation.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync() {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeFileSystems operation
     * with an AsyncHandler.
     *
     * @see #describeFileSystemsAsync(DescribeFileSystemsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeFileSystemsResult> describeFileSystemsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeFileSystemsRequest, DescribeFileSystemsResult> asyncHandler) {

        return describeFileSystemsAsync(new DescribeFileSystemsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            DescribeMountTargetSecurityGroupsRequest request) {

        return describeMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetSecurityGroupsResult> describeMountTargetSecurityGroupsAsync(
            final DescribeMountTargetSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetSecurityGroupsRequest, DescribeMountTargetSecurityGroupsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetSecurityGroupsResult>() {
                    @Override
                    public DescribeMountTargetSecurityGroupsResult call()
                            throws Exception {
                        DescribeMountTargetSecurityGroupsResult result;

                        try {
                            result = describeMountTargetSecurityGroups(request);
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
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            DescribeMountTargetsRequest request) {

        return describeMountTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeMountTargetsResult> describeMountTargetsAsync(
            final DescribeMountTargetsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeMountTargetsRequest, DescribeMountTargetsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeMountTargetsResult>() {
                    @Override
                    public DescribeMountTargetsResult call() throws Exception {
                        DescribeMountTargetsResult result;

                        try {
                            result = describeMountTargets(request);
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
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            DescribeTagsRequest request) {

        return describeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTagsResult> describeTagsAsync(
            final DescribeTagsRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeTagsRequest, DescribeTagsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeTagsResult>() {
                    @Override
                    public DescribeTagsResult call() throws Exception {
                        DescribeTagsResult result;

                        try {
                            result = describeTags(request);
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
    public java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            ModifyMountTargetSecurityGroupsRequest request) {

        return modifyMountTargetSecurityGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> modifyMountTargetSecurityGroupsAsync(
            final ModifyMountTargetSecurityGroupsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ModifyMountTargetSecurityGroupsRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            modifyMountTargetSecurityGroups(request);
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
