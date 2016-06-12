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
package com.amazonaws.services.sns;

import com.amazonaws.services.sns.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing Amazon SNS asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>Amazon Simple Notification Service</fullname>
 * <p>
 * Amazon Simple Notification Service (Amazon SNS) is a web service that enables
 * you to build distributed web-enabled applications. Applications can use
 * Amazon SNS to easily push real-time notification messages to interested
 * subscribers over multiple delivery protocols. For more information about this
 * product see <a
 * href="http://aws.amazon.com/sns/">http://aws.amazon.com/sns</a>. For detailed
 * information about Amazon SNS features and their associated API calls, see the
 * <a href="http://docs.aws.amazon.com/sns/latest/dg/">Amazon SNS Developer
 * Guide</a>.
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SNS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as: cryptographically signing your service requests,
 * retrying requests, and handling error responses. For a list of available
 * SDKs, go to <a href="http://aws.amazon.com/tools/">Tools for Amazon Web
 * Services</a>.
 * </p>
 */
@ThreadSafe
public class AmazonSNSAsyncClient extends AmazonSNSClient implements
        AmazonSNSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS. A credentials provider chain will be used that searches for
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
    public AmazonSNSAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS. A credentials provider chain will be used that searches for
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
     *        connects to Amazon SNS (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AmazonSNSAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials.
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
    public AmazonSNSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials and executor service.
     * Default client settings will be used.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonSNSAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials, executor service, and
     * client configuration options.
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
    public AmazonSNSAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials provider. Default client
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
    public AmazonSNSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the provided AWS account credentials provider and client
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
    public AmazonSNSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials provider and executor
     * service. Default client settings will be used.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param executorService
     *        The executor service by which all asynchronous requests will be
     *        executed.
     */
    public AmazonSNSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on Amazon
     * SNS using the specified AWS account credentials provider, executor
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
    public AmazonSNSAsyncClient(
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
    public java.util.concurrent.Future<Void> addPermissionAsync(
            AddPermissionRequest request) {

        return addPermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addPermissionAsync(
            final AddPermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            addPermission(request);
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
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> addPermissionAsync(
            String topicArn, String label,
            java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames) {

        return addPermissionAsync(new AddPermissionRequest()
                .withTopicArn(topicArn).withLabel(label)
                .withAWSAccountIds(aWSAccountIds).withActionNames(actionNames));
    }

    /**
     * Simplified method form for invoking the AddPermission operation with an
     * AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> addPermissionAsync(
            String topicArn,
            String label,
            java.util.List<String> aWSAccountIds,
            java.util.List<String> actionNames,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, Void> asyncHandler) {

        return addPermissionAsync(
                new AddPermissionRequest().withTopicArn(topicArn)
                        .withLabel(label).withAWSAccountIds(aWSAccountIds)
                        .withActionNames(actionNames), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            ConfirmSubscriptionRequest request) {

        return confirmSubscriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            final ConfirmSubscriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ConfirmSubscriptionResult>() {
                    @Override
                    public ConfirmSubscriptionResult call() throws Exception {
                        ConfirmSubscriptionResult result;

                        try {
                            result = confirmSubscription(request);
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
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            String topicArn, String token, String authenticateOnUnsubscribe) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation
     * with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            String topicArn,
            String token,
            String authenticateOnUnsubscribe,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token)
                .withAuthenticateOnUnsubscribe(authenticateOnUnsubscribe),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest)
     */
    @Override
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            String topicArn, String token) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token));
    }

    /**
     * Simplified method form for invoking the ConfirmSubscription operation
     * with an AsyncHandler.
     *
     * @see #confirmSubscriptionAsync(ConfirmSubscriptionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ConfirmSubscriptionResult> confirmSubscriptionAsync(
            String topicArn,
            String token,
            com.amazonaws.handlers.AsyncHandler<ConfirmSubscriptionRequest, ConfirmSubscriptionResult> asyncHandler) {

        return confirmSubscriptionAsync(new ConfirmSubscriptionRequest()
                .withTopicArn(topicArn).withToken(token), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            CreatePlatformApplicationRequest request) {

        return createPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformApplicationResult> createPlatformApplicationAsync(
            final CreatePlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlatformApplicationRequest, CreatePlatformApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePlatformApplicationResult>() {
                    @Override
                    public CreatePlatformApplicationResult call()
                            throws Exception {
                        CreatePlatformApplicationResult result;

                        try {
                            result = createPlatformApplication(request);
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
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            CreatePlatformEndpointRequest request) {

        return createPlatformEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePlatformEndpointResult> createPlatformEndpointAsync(
            final CreatePlatformEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreatePlatformEndpointRequest, CreatePlatformEndpointResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreatePlatformEndpointResult>() {
                    @Override
                    public CreatePlatformEndpointResult call() throws Exception {
                        CreatePlatformEndpointResult result;

                        try {
                            result = createPlatformEndpoint(request);
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
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(
            CreateTopicRequest request) {

        return createTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(
            final CreateTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateTopicResult>() {
                    @Override
                    public CreateTopicResult call() throws Exception {
                        CreateTopicResult result;

                        try {
                            result = createTopic(request);
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
     * Simplified method form for invoking the CreateTopic operation.
     *
     * @see #createTopicAsync(CreateTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(
            String name) {

        return createTopicAsync(new CreateTopicRequest().withName(name));
    }

    /**
     * Simplified method form for invoking the CreateTopic operation with an
     * AsyncHandler.
     *
     * @see #createTopicAsync(CreateTopicRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateTopicResult> createTopicAsync(
            String name,
            com.amazonaws.handlers.AsyncHandler<CreateTopicRequest, CreateTopicResult> asyncHandler) {

        return createTopicAsync(new CreateTopicRequest().withName(name),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteEndpointAsync(
            DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteEndpointAsync(
            final DeleteEndpointRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteEndpoint(request);
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
    public java.util.concurrent.Future<Void> deletePlatformApplicationAsync(
            DeletePlatformApplicationRequest request) {

        return deletePlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePlatformApplicationAsync(
            final DeletePlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeletePlatformApplicationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deletePlatformApplication(request);
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
    public java.util.concurrent.Future<Void> deleteTopicAsync(
            DeleteTopicRequest request) {

        return deleteTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteTopicAsync(
            final DeleteTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteTopic(request);
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
     * Simplified method form for invoking the DeleteTopic operation.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> deleteTopicAsync(String topicArn) {

        return deleteTopicAsync(new DeleteTopicRequest().withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the DeleteTopic operation with an
     * AsyncHandler.
     *
     * @see #deleteTopicAsync(DeleteTopicRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> deleteTopicAsync(
            String topicArn,
            com.amazonaws.handlers.AsyncHandler<DeleteTopicRequest, Void> asyncHandler) {

        return deleteTopicAsync(
                new DeleteTopicRequest().withTopicArn(topicArn), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            GetEndpointAttributesRequest request) {

        return getEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetEndpointAttributesResult> getEndpointAttributesAsync(
            final GetEndpointAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetEndpointAttributesRequest, GetEndpointAttributesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetEndpointAttributesResult>() {
                    @Override
                    public GetEndpointAttributesResult call() throws Exception {
                        GetEndpointAttributesResult result;

                        try {
                            result = getEndpointAttributes(request);
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
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            GetPlatformApplicationAttributesRequest request) {

        return getPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPlatformApplicationAttributesResult> getPlatformApplicationAttributesAsync(
            final GetPlatformApplicationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetPlatformApplicationAttributesRequest, GetPlatformApplicationAttributesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetPlatformApplicationAttributesResult>() {
                    @Override
                    public GetPlatformApplicationAttributesResult call()
                            throws Exception {
                        GetPlatformApplicationAttributesResult result;

                        try {
                            result = getPlatformApplicationAttributes(request);
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
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            GetSubscriptionAttributesRequest request) {

        return getSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            final GetSubscriptionAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSubscriptionAttributesResult>() {
                    @Override
                    public GetSubscriptionAttributesResult call()
                            throws Exception {
                        GetSubscriptionAttributesResult result;

                        try {
                            result = getSubscriptionAttributes(request);
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
     * Simplified method form for invoking the GetSubscriptionAttributes
     * operation.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            String subscriptionArn) {

        return getSubscriptionAttributesAsync(new GetSubscriptionAttributesRequest()
                .withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the GetSubscriptionAttributes
     * operation with an AsyncHandler.
     *
     * @see #getSubscriptionAttributesAsync(GetSubscriptionAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetSubscriptionAttributesResult> getSubscriptionAttributesAsync(
            String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<GetSubscriptionAttributesRequest, GetSubscriptionAttributesResult> asyncHandler) {

        return getSubscriptionAttributesAsync(
                new GetSubscriptionAttributesRequest()
                        .withSubscriptionArn(subscriptionArn),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(
            GetTopicAttributesRequest request) {

        return getTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(
            final GetTopicAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetTopicAttributesResult>() {
                    @Override
                    public GetTopicAttributesResult call() throws Exception {
                        GetTopicAttributesResult result;

                        try {
                            result = getTopicAttributes(request);
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
     * Simplified method form for invoking the GetTopicAttributes operation.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(
            String topicArn) {

        return getTopicAttributesAsync(new GetTopicAttributesRequest()
                .withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the GetTopicAttributes operation with
     * an AsyncHandler.
     *
     * @see #getTopicAttributesAsync(GetTopicAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetTopicAttributesResult> getTopicAttributesAsync(
            String topicArn,
            com.amazonaws.handlers.AsyncHandler<GetTopicAttributesRequest, GetTopicAttributesResult> asyncHandler) {

        return getTopicAttributesAsync(
                new GetTopicAttributesRequest().withTopicArn(topicArn),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            ListEndpointsByPlatformApplicationRequest request) {

        return listEndpointsByPlatformApplicationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEndpointsByPlatformApplicationResult> listEndpointsByPlatformApplicationAsync(
            final ListEndpointsByPlatformApplicationRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListEndpointsByPlatformApplicationRequest, ListEndpointsByPlatformApplicationResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListEndpointsByPlatformApplicationResult>() {
                    @Override
                    public ListEndpointsByPlatformApplicationResult call()
                            throws Exception {
                        ListEndpointsByPlatformApplicationResult result;

                        try {
                            result = listEndpointsByPlatformApplication(request);
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
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            ListPlatformApplicationsRequest request) {

        return listPlatformApplicationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            final ListPlatformApplicationsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListPlatformApplicationsResult>() {
                    @Override
                    public ListPlatformApplicationsResult call()
                            throws Exception {
                        ListPlatformApplicationsResult result;

                        try {
                            result = listPlatformApplications(request);
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
     * Simplified method form for invoking the ListPlatformApplications
     * operation.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync() {

        return listPlatformApplicationsAsync(new ListPlatformApplicationsRequest());
    }

    /**
     * Simplified method form for invoking the ListPlatformApplications
     * operation with an AsyncHandler.
     *
     * @see #listPlatformApplicationsAsync(ListPlatformApplicationsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListPlatformApplicationsResult> listPlatformApplicationsAsync(
            com.amazonaws.handlers.AsyncHandler<ListPlatformApplicationsRequest, ListPlatformApplicationsResult> asyncHandler) {

        return listPlatformApplicationsAsync(
                new ListPlatformApplicationsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            ListSubscriptionsRequest request) {

        return listSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            final ListSubscriptionsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSubscriptionsResult>() {
                    @Override
                    public ListSubscriptionsResult call() throws Exception {
                        ListSubscriptionsResult result;

                        try {
                            result = listSubscriptions(request);
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
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync() {

        return listSubscriptionsAsync(new ListSubscriptionsRequest());
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with
     * an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest(),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            String nextToken) {

        return listSubscriptionsAsync(new ListSubscriptionsRequest()
                .withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptions operation with
     * an AsyncHandler.
     *
     * @see #listSubscriptionsAsync(ListSubscriptionsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSubscriptionsResult> listSubscriptionsAsync(
            String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsRequest, ListSubscriptionsResult> asyncHandler) {

        return listSubscriptionsAsync(
                new ListSubscriptionsRequest().withNextToken(nextToken),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            ListSubscriptionsByTopicRequest request) {

        return listSubscriptionsByTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            final ListSubscriptionsByTopicRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListSubscriptionsByTopicResult>() {
                    @Override
                    public ListSubscriptionsByTopicResult call()
                            throws Exception {
                        ListSubscriptionsByTopicResult result;

                        try {
                            result = listSubscriptionsByTopic(request);
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
     * Simplified method form for invoking the ListSubscriptionsByTopic
     * operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            String topicArn) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest()
                .withTopicArn(topicArn));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic
     * operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            String topicArn,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(
                new ListSubscriptionsByTopicRequest().withTopicArn(topicArn),
                asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic
     * operation.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            String topicArn, String nextToken) {

        return listSubscriptionsByTopicAsync(new ListSubscriptionsByTopicRequest()
                .withTopicArn(topicArn).withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListSubscriptionsByTopic
     * operation with an AsyncHandler.
     *
     * @see #listSubscriptionsByTopicAsync(ListSubscriptionsByTopicRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSubscriptionsByTopicResult> listSubscriptionsByTopicAsync(
            String topicArn,
            String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListSubscriptionsByTopicRequest, ListSubscriptionsByTopicResult> asyncHandler) {

        return listSubscriptionsByTopicAsync(
                new ListSubscriptionsByTopicRequest().withTopicArn(topicArn)
                        .withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(
            ListTopicsRequest request) {

        return listTopicsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(
            final ListTopicsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListTopicsResult>() {
                    @Override
                    public ListTopicsResult call() throws Exception {
                        ListTopicsResult result;

                        try {
                            result = listTopics(request);
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
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync() {

        return listTopicsAsync(new ListTopicsRequest());
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an
     * AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(new ListTopicsRequest(), asyncHandler);
    }

    /**
     * Simplified method form for invoking the ListTopics operation.
     *
     * @see #listTopicsAsync(ListTopicsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(
            String nextToken) {

        return listTopicsAsync(new ListTopicsRequest().withNextToken(nextToken));
    }

    /**
     * Simplified method form for invoking the ListTopics operation with an
     * AsyncHandler.
     *
     * @see #listTopicsAsync(ListTopicsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListTopicsResult> listTopicsAsync(
            String nextToken,
            com.amazonaws.handlers.AsyncHandler<ListTopicsRequest, ListTopicsResult> asyncHandler) {

        return listTopicsAsync(
                new ListTopicsRequest().withNextToken(nextToken), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(
            PublishRequest request) {

        return publishAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(
            final PublishRequest request,
            final com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<PublishResult>() {
                    @Override
                    public PublishResult call() throws Exception {
                        PublishResult result;

                        try {
                            result = publish(request);
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
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(
            String topicArn, String message) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn)
                .withMessage(message));
    }

    /**
     * Simplified method form for invoking the Publish operation with an
     * AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PublishResult> publishAsync(
            String topicArn,
            String message,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn)
                .withMessage(message), asyncHandler);
    }

    /**
     * Simplified method form for invoking the Publish operation.
     *
     * @see #publishAsync(PublishRequest)
     */
    @Override
    public java.util.concurrent.Future<PublishResult> publishAsync(
            String topicArn, String message, String subject) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn)
                .withMessage(message).withSubject(subject));
    }

    /**
     * Simplified method form for invoking the Publish operation with an
     * AsyncHandler.
     *
     * @see #publishAsync(PublishRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<PublishResult> publishAsync(
            String topicArn,
            String message,
            String subject,
            com.amazonaws.handlers.AsyncHandler<PublishRequest, PublishResult> asyncHandler) {

        return publishAsync(new PublishRequest().withTopicArn(topicArn)
                .withMessage(message).withSubject(subject), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> removePermissionAsync(
            RemovePermissionRequest request) {

        return removePermissionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removePermissionAsync(
            final RemovePermissionRequest request,
            final com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            removePermission(request);
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
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> removePermissionAsync(
            String topicArn, String label) {

        return removePermissionAsync(new RemovePermissionRequest()
                .withTopicArn(topicArn).withLabel(label));
    }

    /**
     * Simplified method form for invoking the RemovePermission operation with
     * an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> removePermissionAsync(
            String topicArn,
            String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, Void> asyncHandler) {

        return removePermissionAsync(new RemovePermissionRequest()
                .withTopicArn(topicArn).withLabel(label), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> setEndpointAttributesAsync(
            SetEndpointAttributesRequest request) {

        return setEndpointAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setEndpointAttributesAsync(
            final SetEndpointAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetEndpointAttributesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setEndpointAttributes(request);
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
    public java.util.concurrent.Future<Void> setPlatformApplicationAttributesAsync(
            SetPlatformApplicationAttributesRequest request) {

        return setPlatformApplicationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setPlatformApplicationAttributesAsync(
            final SetPlatformApplicationAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetPlatformApplicationAttributesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setPlatformApplicationAttributes(request);
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
    public java.util.concurrent.Future<Void> setSubscriptionAttributesAsync(
            SetSubscriptionAttributesRequest request) {

        return setSubscriptionAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setSubscriptionAttributesAsync(
            final SetSubscriptionAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setSubscriptionAttributes(request);
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
     * Simplified method form for invoking the SetSubscriptionAttributes
     * operation.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> setSubscriptionAttributesAsync(
            String subscriptionArn, String attributeName, String attributeValue) {

        return setSubscriptionAttributesAsync(new SetSubscriptionAttributesRequest()
                .withSubscriptionArn(subscriptionArn)
                .withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetSubscriptionAttributes
     * operation with an AsyncHandler.
     *
     * @see #setSubscriptionAttributesAsync(SetSubscriptionAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> setSubscriptionAttributesAsync(
            String subscriptionArn,
            String attributeName,
            String attributeValue,
            com.amazonaws.handlers.AsyncHandler<SetSubscriptionAttributesRequest, Void> asyncHandler) {

        return setSubscriptionAttributesAsync(
                new SetSubscriptionAttributesRequest()
                        .withSubscriptionArn(subscriptionArn)
                        .withAttributeName(attributeName)
                        .withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> setTopicAttributesAsync(
            SetTopicAttributesRequest request) {

        return setTopicAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setTopicAttributesAsync(
            final SetTopicAttributesRequest request,
            final com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            setTopicAttributes(request);
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
     * Simplified method form for invoking the SetTopicAttributes operation.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> setTopicAttributesAsync(
            String topicArn, String attributeName, String attributeValue) {

        return setTopicAttributesAsync(new SetTopicAttributesRequest()
                .withTopicArn(topicArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue));
    }

    /**
     * Simplified method form for invoking the SetTopicAttributes operation with
     * an AsyncHandler.
     *
     * @see #setTopicAttributesAsync(SetTopicAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> setTopicAttributesAsync(
            String topicArn,
            String attributeName,
            String attributeValue,
            com.amazonaws.handlers.AsyncHandler<SetTopicAttributesRequest, Void> asyncHandler) {

        return setTopicAttributesAsync(new SetTopicAttributesRequest()
                .withTopicArn(topicArn).withAttributeName(attributeName)
                .withAttributeValue(attributeValue), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(
            SubscribeRequest request) {

        return subscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(
            final SubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<SubscribeResult>() {
                    @Override
                    public SubscribeResult call() throws Exception {
                        SubscribeResult result;

                        try {
                            result = subscribe(request);
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
     * Simplified method form for invoking the Subscribe operation.
     *
     * @see #subscribeAsync(SubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(
            String topicArn, String protocol, String endpoint) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn)
                .withProtocol(protocol).withEndpoint(endpoint));
    }

    /**
     * Simplified method form for invoking the Subscribe operation with an
     * AsyncHandler.
     *
     * @see #subscribeAsync(SubscribeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<SubscribeResult> subscribeAsync(
            String topicArn,
            String protocol,
            String endpoint,
            com.amazonaws.handlers.AsyncHandler<SubscribeRequest, SubscribeResult> asyncHandler) {

        return subscribeAsync(new SubscribeRequest().withTopicArn(topicArn)
                .withProtocol(protocol).withEndpoint(endpoint), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> unsubscribeAsync(
            UnsubscribeRequest request) {

        return unsubscribeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unsubscribeAsync(
            final UnsubscribeRequest request,
            final com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            unsubscribe(request);
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
     * Simplified method form for invoking the Unsubscribe operation.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> unsubscribeAsync(
            String subscriptionArn) {

        return unsubscribeAsync(new UnsubscribeRequest()
                .withSubscriptionArn(subscriptionArn));
    }

    /**
     * Simplified method form for invoking the Unsubscribe operation with an
     * AsyncHandler.
     *
     * @see #unsubscribeAsync(UnsubscribeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> unsubscribeAsync(
            String subscriptionArn,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeRequest, Void> asyncHandler) {

        return unsubscribeAsync(
                new UnsubscribeRequest().withSubscriptionArn(subscriptionArn),
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
