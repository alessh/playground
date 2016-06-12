<@LicenseCommentBlockMacro.content />
package ${metadata.packageName};

import ${metadata.packageName}.model.*;
import com.amazonaws.annotation.ThreadSafe;

/**
 * Interface for accessing ${metadata.serviceName} asynchronously. Each
 * asynchronous method will return a Java Future object representing the
 * asynchronous operation; overloads which accept an {@code AsyncHandler} can
 * be used to receive notification when an asynchronous operation completes.
<#if metadata.documentation??>
 * <p>
 * ${metadata.documentation}
</#if>
 */
 @ThreadSafe
public class ${metadata.asyncClient} extends ${metadata.syncClient}
        implements ${metadata.asyncInterface} {

    private static final int DEFAULT_THREAD_POOL_SIZE = 50;

    private final java.util.concurrent.ExecutorService executorService;

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName}. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     * <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     * <li> Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI </li>
     * <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public ${metadata.asyncClient}() {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain());
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName}. A credentials provider chain will be used
     * that searches for credentials in this order:
     * <ul>
     * <li> Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY </li>
     * <li> Java System Properties - aws.accessKeyId and aws.secretKey </li>
     * <li> Credential profiles file at the default location (~/.aws/credentials) shared by all AWS SDKs and the AWS CLI </li>
     * <li> Instance profile credentials delivered through the Amazon EC2 metadata service </li>
     * </ul>
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing a number of threads equal to the maximum number of concurrent
     * connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param clientConfiguration The client configuration options controlling
     *            how this client connects to ${metadata.serviceName}
     *            (ex: proxy settings, retry counts, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public ${metadata.asyncClient}(com.amazonaws.ClientConfiguration clientConfiguration) {
        this(new com.amazonaws.auth.DefaultAWSCredentialsProviderChain(),
                clientConfiguration,
                java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public ${metadata.asyncClient}(com.amazonaws.auth.AWSCredentials awsCredentials) {
        this(awsCredentials, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials and
     * executor service. Default client settings will be used.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public ${metadata.asyncClient}(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentials, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials,
     * executor service, and client configuration options.
     *
     * @param awsCredentials The AWS credentials (access key ID and secret key)
     *            to use when authenticating with AWS services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public ${metadata.asyncClient}(
            com.amazonaws.auth.AWSCredentials awsCredentials,
            com.amazonaws.ClientConfiguration clientConfiguration,
            java.util.concurrent.ExecutorService executorService) {

        super(awsCredentials, clientConfiguration);
        this.executorService = executorService;
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider. Default client settings will be used.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing 50 threads (to match the default maximum number of concurrent
     * connections to the service).
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public ${metadata.asyncClient}(com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, java.util.concurrent.Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the provided AWS account credentials
     * provider and client configuration options.
     * <p>
     * Asynchronous methods are delegated to a fixed-size thread pool
     * containing a number of threads equal to the maximum number of concurrent
     * connections configured via {@code ClientConfiguration.getMaxConnections()}.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     *
     * @see com.amazonaws.auth.DefaultAWSCredentialsProviderChain
     * @see java.util.concurrent.Executors#newFixedThreadPool(int)
     */
    public ${metadata.asyncClient}(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            com.amazonaws.ClientConfiguration clientConfiguration) {

        this(awsCredentialsProvider,
                clientConfiguration,
                java.util.concurrent.Executors.newFixedThreadPool(clientConfiguration.getMaxConnections()));
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider and executor service. Default client settings will be used.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public ${metadata.asyncClient}(
            com.amazonaws.auth.AWSCredentialsProvider awsCredentialsProvider,
            java.util.concurrent.ExecutorService executorService) {

        this(awsCredentialsProvider, configFactory.getConfig(), executorService);
    }

    /**
     * Constructs a new asynchronous client to invoke service methods on
     * ${metadata.serviceName} using the specified AWS account credentials
     * provider, executor service, and client configuration options.
     *
     * @param awsCredentialsProvider The AWS credentials provider which will
     *            provide credentials to authenticate requests with AWS
     *            services.
     * @param clientConfiguration Client configuration options (ex: max retry
     *            limit, proxy settings, etc).
     * @param executorService The executor service by which all asynchronous
     *            requests will be executed.
     */
    public ${metadata.asyncClient}(
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
     *             requests.
     */
    public java.util.concurrent.ExecutorService getExecutorService() {
        return executorService;
    }

  <#list operations?values as operationModel>
    <@AsyncClientMethodForOperation.content operationModel />
    <@AsyncClientMethodForOperationWithSimpleForm.content operationModel />
  </#list>

  <#if AdditionalClientMethodsMacro?has_content>
    <@AdditionalClientMethodsMacro.content .data_model />
  </#if>

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
