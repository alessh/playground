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
package com.amazonaws.services.kms;

import com.amazonaws.services.kms.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing KMS asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Key Management Service</fullname>
 * <p>
 * AWS Key Management Service (AWS KMS) is an encryption and key management web
 * service. This guide describes the AWS KMS operations that you can call
 * programmatically. For general information about AWS KMS, see the <a
 * href="http://docs.aws.amazon.com/kms/latest/developerguide/">AWS Key
 * Management Service Developer Guide</a>.
 * </p>
 * <note>
 * <p>
 * AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .Net, iOS, Android, etc.).
 * The SDKs provide a convenient way to create programmatic access to AWS KMS
 * and other AWS services. For example, the SDKs take care of tasks such as
 * signing requests (see below), managing errors, and retrying requests
 * automatically. For more information about the AWS SDKs, including how to
 * download and install them, see <a href="http://aws.amazon.com/tools/">Tools
 * for Amazon Web Services</a>.
 * </p>
 * </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to AWS
 * KMS.
 * </p>
 * <p>
 * Clients must support TLS (Transport Layer Security) 1.0. We recommend TLS
 * 1.2. Clients must also support cipher suites with Perfect Forward Secrecy
 * (PFS) such as Ephemeral Diffie-Hellman (DHE) or Elliptic Curve Ephemeral
 * Diffie-Hellman (ECDHE). Most modern systems such as Java 7 and later support
 * these modes.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed by using an access key ID and a secret access key. We
 * strongly recommend that you <i>do not</i> use your AWS account access key ID
 * and secret key for everyday work with AWS KMS. Instead, use the access key ID
 * and secret access key for an IAM user, or you can use the AWS Security Token
 * Service to generate temporary security credentials that you can use to sign
 * requests.
 * </p>
 * <p>
 * All AWS KMS operations require <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4</a>.
 * </p>
 * <p>
 * <b>Logging API Requests</b>
 * </p>
 * <p>
 * AWS KMS supports AWS CloudTrail, a service that logs AWS API calls and
 * related events for your AWS account and delivers them to an Amazon S3 bucket
 * that you specify. By using the information collected by CloudTrail, you can
 * determine what requests were made to AWS KMS, who made the request, when it
 * was made, and so on. To learn more about CloudTrail, including how to turn it
 * on and find your log files, see the <a
 * href="http://docs.aws.amazon.com/awscloudtrail/latest/userguide/">AWS
 * CloudTrail User Guide</a>.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information about credentials and request signing, see the
 * following:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a> - This topic provides general information about
 * the types of credentials used for accessing AWS.</li>
 * <li><a href="http://docs.aws.amazon.com/STS/latest/UsingSTS/">AWS Security
 * Token Service</a> - This guide describes how to create and use temporary
 * security credentials.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * >Signing AWS API Requests</a> - This set of topics walks you through the
 * process of signing a request using an access key ID and a secret access key.</li>
 * </ul>
 * <p>
 * <b>Commonly Used APIs</b>
 * </p>
 * <p>
 * Of the APIs discussed in this guide, the following will prove the most useful
 * for most applications. You will likely perform actions other than these, such
 * as creating keys and assigning policies, by using the console.
 * </p>
 * <ul>
 * <li><a>Encrypt</a></li>
 * <li><a>Decrypt</a></li>
 * <li><a>GenerateDataKey</a></li>
 * <li><a>GenerateDataKeyWithoutPlaintext</a></li>
 * </ul>
 */
@ThreadSafe
public class AWSKMSAsyncClient extends AWSKMSClient implements AWSKMSAsync {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS. A
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
    public AWSKMSAsyncClient() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS. A
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
     *        connects to KMS (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public AWSKMSAsyncClient(
            com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration, java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors
                .newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider, clientConfiguration,
                java.util.concurrent.Executors
                        .newFixedThreadPool(clientConfiguration
                                .getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on KMS
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
    public AWSKMSAsyncClient(
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
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            CancelKeyDeletionRequest request) {

        return cancelKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            final CancelKeyDeletionRequest request,
            final com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CancelKeyDeletionResult>() {
                    @Override
                    public CancelKeyDeletionResult call() throws Exception {
                        CancelKeyDeletionResult result;

                        try {
                            result = cancelKeyDeletion(request);
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
    public java.util.concurrent.Future<Void> createAliasAsync(
            CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createAliasAsync(
            final CreateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            createAlias(request);
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
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            CreateGrantRequest request) {

        return createGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            final CreateGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateGrantResult>() {
                    @Override
                    public CreateGrantResult call() throws Exception {
                        CreateGrantResult result;

                        try {
                            result = createGrant(request);
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
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            CreateKeyRequest request) {

        return createKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            final CreateKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<CreateKeyResult>() {
                    @Override
                    public CreateKeyResult call() throws Exception {
                        CreateKeyResult result;

                        try {
                            result = createKey(request);
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
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync() {

        return createKeyAsync(new CreateKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateKey operation with an
     * AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        return createKeyAsync(new CreateKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(
            DecryptRequest request) {

        return decryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(
            final DecryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DecryptResult>() {
                    @Override
                    public DecryptResult call() throws Exception {
                        DecryptResult result;

                        try {
                            result = decrypt(request);
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
    public java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAliasAsync(
            final DeleteAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            deleteAlias(request);
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
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            DescribeKeyRequest request) {

        return describeKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            final DescribeKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<DescribeKeyResult>() {
                    @Override
                    public DescribeKeyResult call() throws Exception {
                        DescribeKeyResult result;

                        try {
                            result = describeKey(request);
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
    public java.util.concurrent.Future<Void> disableKeyAsync(
            DisableKeyRequest request) {

        return disableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyAsync(
            final DisableKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            disableKey(request);
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
    public java.util.concurrent.Future<Void> disableKeyRotationAsync(
            DisableKeyRotationRequest request) {

        return disableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyRotationAsync(
            final DisableKeyRotationRequest request,
            final com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            disableKeyRotation(request);
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
    public java.util.concurrent.Future<Void> enableKeyAsync(
            EnableKeyRequest request) {

        return enableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyAsync(
            final EnableKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            enableKey(request);
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
    public java.util.concurrent.Future<Void> enableKeyRotationAsync(
            EnableKeyRotationRequest request) {

        return enableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyRotationAsync(
            final EnableKeyRotationRequest request,
            final com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            enableKeyRotation(request);
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
    public java.util.concurrent.Future<EncryptResult> encryptAsync(
            EncryptRequest request) {

        return encryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(
            final EncryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<EncryptResult>() {
                    @Override
                    public EncryptResult call() throws Exception {
                        EncryptResult result;

                        try {
                            result = encrypt(request);
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
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            GenerateDataKeyRequest request) {

        return generateDataKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            final GenerateDataKeyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GenerateDataKeyResult>() {
                    @Override
                    public GenerateDataKeyResult call() throws Exception {
                        GenerateDataKeyResult result;

                        try {
                            result = generateDataKey(request);
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
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request) {

        return generateDataKeyWithoutPlaintextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            final GenerateDataKeyWithoutPlaintextRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GenerateDataKeyWithoutPlaintextResult>() {
                    @Override
                    public GenerateDataKeyWithoutPlaintextResult call()
                            throws Exception {
                        GenerateDataKeyWithoutPlaintextResult result;

                        try {
                            result = generateDataKeyWithoutPlaintext(request);
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
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            GenerateRandomRequest request) {

        return generateRandomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            final GenerateRandomRequest request,
            final com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GenerateRandomResult>() {
                    @Override
                    public GenerateRandomResult call() throws Exception {
                        GenerateRandomResult result;

                        try {
                            result = generateRandom(request);
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
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync() {

        return generateRandomAsync(new GenerateRandomRequest());
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation with an
     * AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        return generateRandomAsync(new GenerateRandomRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            GetKeyPolicyRequest request) {

        return getKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            final GetKeyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetKeyPolicyResult>() {
                    @Override
                    public GetKeyPolicyResult call() throws Exception {
                        GetKeyPolicyResult result;

                        try {
                            result = getKeyPolicy(request);
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
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            GetKeyRotationStatusRequest request) {

        return getKeyRotationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            final GetKeyRotationStatusRequest request,
            final com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<GetKeyRotationStatusResult>() {
                    @Override
                    public GetKeyRotationStatusResult call() throws Exception {
                        GetKeyRotationStatusResult result;

                        try {
                            result = getKeyRotationStatus(request);
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
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            final ListAliasesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListAliasesResult>() {
                    @Override
                    public ListAliasesResult call() throws Exception {
                        ListAliasesResult result;

                        try {
                            result = listAliases(request);
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
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync() {

        return listAliasesAsync(new ListAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAliases operation with an
     * AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return listAliasesAsync(new ListAliasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            ListGrantsRequest request) {

        return listGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            final ListGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListGrantsResult>() {
                    @Override
                    public ListGrantsResult call() throws Exception {
                        ListGrantsResult result;

                        try {
                            result = listGrants(request);
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
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            ListKeyPoliciesRequest request) {

        return listKeyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            final ListKeyPoliciesRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListKeyPoliciesResult>() {
                    @Override
                    public ListKeyPoliciesResult call() throws Exception {
                        ListKeyPoliciesResult result;

                        try {
                            result = listKeyPolicies(request);
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
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            final ListKeysRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListKeysResult>() {
                    @Override
                    public ListKeysResult call() throws Exception {
                        ListKeysResult result;

                        try {
                            result = listKeys(request);
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
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync() {

        return listKeysAsync(new ListKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListKeys operation with an
     * AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        return listKeysAsync(new ListKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            ListRetirableGrantsRequest request) {

        return listRetirableGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            final ListRetirableGrantsRequest request,
            final com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ListRetirableGrantsResult>() {
                    @Override
                    public ListRetirableGrantsResult call() throws Exception {
                        ListRetirableGrantsResult result;

                        try {
                            result = listRetirableGrants(request);
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
    public java.util.concurrent.Future<Void> putKeyPolicyAsync(
            PutKeyPolicyRequest request) {

        return putKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putKeyPolicyAsync(
            final PutKeyPolicyRequest request,
            final com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            putKeyPolicy(request);
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
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            ReEncryptRequest request) {

        return reEncryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            final ReEncryptRequest request,
            final com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ReEncryptResult>() {
                    @Override
                    public ReEncryptResult call() throws Exception {
                        ReEncryptResult result;

                        try {
                            result = reEncrypt(request);
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
    public java.util.concurrent.Future<Void> retireGrantAsync(
            RetireGrantRequest request) {

        return retireGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> retireGrantAsync(
            final RetireGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            retireGrant(request);
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
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> retireGrantAsync() {

        return retireGrantAsync(new RetireGrantRequest());
    }

    /**
     * Simplified method form for invoking the RetireGrant operation with an
     * AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> retireGrantAsync(
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler) {

        return retireGrantAsync(new RetireGrantRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> revokeGrantAsync(
            RevokeGrantRequest request) {

        return revokeGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> revokeGrantAsync(
            final RevokeGrantRequest request,
            final com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            revokeGrant(request);
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
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            ScheduleKeyDeletionRequest request) {

        return scheduleKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            final ScheduleKeyDeletionRequest request,
            final com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<ScheduleKeyDeletionResult>() {
                    @Override
                    public ScheduleKeyDeletionResult call() throws Exception {
                        ScheduleKeyDeletionResult result;

                        try {
                            result = scheduleKeyDeletion(request);
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
    public java.util.concurrent.Future<Void> updateAliasAsync(
            UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAliasAsync(
            final UpdateAliasRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateAlias(request);
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
    public java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            UpdateKeyDescriptionRequest request) {

        return updateKeyDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            final UpdateKeyDescriptionRequest request,
            final com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, Void> asyncHandler) {

        return executorService
                .submit(new java.util.concurrent.Callable<Void>() {
                    @Override
                    public Void call() throws Exception {
                        Void result;

                        try {
                            updateKeyDescription(request);
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
