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
package com.amazonaws.services.securitytoken;

import com.amazonaws.services.securitytoken.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing AWS STS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Security Token Service</fullname>
 * <p>
 * The AWS Security Token Service (STS) is a web service that enables you to
 * request temporary, limited-privilege credentials for AWS Identity and Access
 * Management (IAM) users or for users that you authenticate (federated users).
 * This guide provides descriptions of the STS API. For more detailed
 * information about using this service, go to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp.html"
 * >Temporary Security Credentials</a>.
 * </p>
 * <note> As an alternative to using the API, you can use one of the AWS SDKs,
 * which consist of libraries and sample code for various programming languages
 * and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a
 * convenient way to create programmatic access to STS. For example, the SDKs
 * take care of cryptographically signing requests, managing errors, and
 * retrying requests automatically. For information about the AWS SDKs,
 * including how to download and install them, see the <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services page</a>.
 * </note>
 * <p>
 * For information about setting up signatures and authorization through the
 * API, go to <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * target="_blank">Signing AWS API Requests</a> in the <i>AWS General
 * Reference</i>. For general information about the Query API, go to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
 * target="_blank">Making Query Requests</a> in <i>Using IAM</i>. For
 * information about using security tokens with other AWS products, go to <a
 * href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_aws-services-that-work-with-iam.html"
 * >AWS Services That Work with IAM</a> in the <i>IAM User Guide</i>.
 * </p>
 * <p>
 * If you're new to AWS and need additional technical information about a
 * specific AWS product, you can find the product's technical documentation at
 * <a href="http://aws.amazon.com/documentation/"
 * target="_blank">http://aws.amazon.com/documentation/</a>.
 * </p>
 * <p>
 * <b>Endpoints</b>
 * </p>
 * <p>
 * The AWS Security Token Service (STS) has a default endpoint of
 * https://sts.amazonaws.com that maps to the US East (N. Virginia) region.
 * Additional regions are available and are activated by default. For more
 * information, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_enable-regions.html"
 * >Activating and Deactivating AWS STS in an AWS Region</a> in the <i>IAM User
 * Guide</i>.
 * </p>
 * <p>
 * For information about STS endpoints, see <a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sts_region"
 * >Regions and Endpoints</a> in the <i>AWS General Reference</i>.
 * </p>
 * <p>
 * <b>Recording API requests</b>
 * </p>
 * <p>
 * STS supports AWS CloudTrail, which is a service that records AWS calls for
 * your AWS account and delivers log files to an Amazon S3 bucket. By using
 * information collected by CloudTrail, you can determine what requests were
 * successfully made to STS, who made the request, when it was made, and so on.
 * To learn more about CloudTrail, including how to turn it on and find your log
 * files, see the <a href=
 * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/what_is_cloud_trail_top_level.html"
 * >AWS CloudTrail User Guide</a>.
 * </p>
 */
@ThreadSafe
public class AWSSecurityTokenServiceAsyncClient extends
        AWSSecurityTokenServiceClient implements AWSSecurityTokenServiceAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * STS. A credentials provider chain will be used that searches for
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
    public AWSSecurityTokenServiceAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS
     * STS. A credentials provider chain will be used that searches for
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
     *        connects to AWS STS (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on AWS STS
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
    public AWSSecurityTokenServiceAsyncClient(
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
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(
            AssumeRoleRequest request) {

        return assumeRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleResult> assumeRoleAsync(
            final AssumeRoleRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleRequest, AssumeRoleResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AssumeRoleResult>() {
                    @Override
                    public AssumeRoleResult call() throws Exception {
                        AssumeRoleResult result;

                        try {
                            result = assumeRole(request);
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
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(
            AssumeRoleWithSAMLRequest request) {

        return assumeRoleWithSAMLAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithSAMLResult> assumeRoleWithSAMLAsync(
            final AssumeRoleWithSAMLRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleWithSAMLRequest, AssumeRoleWithSAMLResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AssumeRoleWithSAMLResult>() {
                    @Override
                    public AssumeRoleWithSAMLResult call() throws Exception {
                        AssumeRoleWithSAMLResult result;

                        try {
                            result = assumeRoleWithSAML(request);
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
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(
            AssumeRoleWithWebIdentityRequest request) {

        return assumeRoleWithWebIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AssumeRoleWithWebIdentityResult> assumeRoleWithWebIdentityAsync(
            final AssumeRoleWithWebIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<AssumeRoleWithWebIdentityRequest, AssumeRoleWithWebIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<AssumeRoleWithWebIdentityResult>() {
                    @Override
                    public AssumeRoleWithWebIdentityResult call()
                            throws Exception {
                        AssumeRoleWithWebIdentityResult result;

                        try {
                            result = assumeRoleWithWebIdentity(request);
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
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(
            DecodeAuthorizationMessageRequest request) {

        return decodeAuthorizationMessageAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecodeAuthorizationMessageResult> decodeAuthorizationMessageAsync(
            final DecodeAuthorizationMessageRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecodeAuthorizationMessageRequest, DecodeAuthorizationMessageResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DecodeAuthorizationMessageResult>() {
                    @Override
                    public DecodeAuthorizationMessageResult call()
                            throws Exception {
                        DecodeAuthorizationMessageResult result;

                        try {
                            result = decodeAuthorizationMessage(request);
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
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(
            GetCallerIdentityRequest request) {

        return getCallerIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCallerIdentityResult> getCallerIdentityAsync(
            final GetCallerIdentityRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetCallerIdentityRequest, GetCallerIdentityResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetCallerIdentityResult>() {
                    @Override
                    public GetCallerIdentityResult call() throws Exception {
                        GetCallerIdentityResult result;

                        try {
                            result = getCallerIdentity(request);
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
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(
            GetFederationTokenRequest request) {

        return getFederationTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetFederationTokenResult> getFederationTokenAsync(
            final GetFederationTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetFederationTokenRequest, GetFederationTokenResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetFederationTokenResult>() {
                    @Override
                    public GetFederationTokenResult call() throws Exception {
                        GetFederationTokenResult result;

                        try {
                            result = getFederationToken(request);
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
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(
            GetSessionTokenRequest request) {

        return getSessionTokenAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(
            final GetSessionTokenRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetSessionTokenResult>() {
                    @Override
                    public GetSessionTokenResult call() throws Exception {
                        GetSessionTokenResult result;

                        try {
                            result = getSessionToken(request);
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
     * Simplified method form for invoking the GetSessionToken operation.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync() {

        return getSessionTokenAsync(new GetSessionTokenRequest());
    }

    /**
     * Simplified method form for invoking the GetSessionToken operation with an
     * AsyncHandler.
     *
     * @see #getSessionTokenAsync(GetSessionTokenRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetSessionTokenResult> getSessionTokenAsync(
            com.amazonaws.handlers.AsyncHandler<GetSessionTokenRequest, GetSessionTokenResult> asyncHandler) {

        return getSessionTokenAsync(new GetSessionTokenRequest(), asyncHandler);
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
