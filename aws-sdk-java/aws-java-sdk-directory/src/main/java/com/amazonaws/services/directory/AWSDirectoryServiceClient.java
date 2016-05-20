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
package com.amazonaws.services.directory;

import org.w3c.dom.*;

import java.net.*;
import java.util.*;
import java.util.Map.Entry;

import org.apache.commons.logging.*;

import com.amazonaws.*;
import com.amazonaws.auth.*;
import com.amazonaws.handlers.*;
import com.amazonaws.http.*;
import com.amazonaws.internal.*;
import com.amazonaws.metrics.*;
import com.amazonaws.regions.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.*;
import com.amazonaws.util.json.*;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.annotation.ThreadSafe;

import com.amazonaws.services.directory.model.*;
import com.amazonaws.services.directory.model.transform.*;

/**
 * Client for accessing Directory Service. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS Directory Service</fullname>
 * <p>
 * This is the <i>AWS Directory Service API Reference</i>. This guide provides
 * detailed information about AWS Directory Service operations, data types,
 * parameters, and errors.
 * </p>
 */
@ThreadSafe
public class AWSDirectoryServiceClient extends AmazonWebServiceClient implements
        AWSDirectoryService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSDirectoryService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "ds";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "ds";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all Directory Service exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Directory Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service. A
     * credentials provider chain will be used that searches for credentials in
     * this order:
     * <ul>
     * <li>Environment Variables - AWS_ACCESS_KEY_ID and AWS_SECRET_KEY</li>
     * <li>Java System Properties - aws.accessKeyId and aws.secretKey</li>
     * <li>Instance profile credentials delivered through the Amazon EC2
     * metadata service</li>
     * </ul>
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDirectoryServiceClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials and client configuration
     * options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSDirectoryServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider and client
     * configuration options.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Directory Service
     * using the specified AWS account credentials provider, client
     * configuration options, and request metric collector.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     * @param clientConfiguration
     *        The client configuration options controlling how this client
     *        connects to Directory Service (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSDirectoryServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.directory.model.ServiceException.class,
                "ServiceException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InvalidParameterException.class,
                        "InvalidParameterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.EntityAlreadyExistsException.class,
                        "EntityAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.SnapshotLimitExceededException.class,
                        "SnapshotLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.UnsupportedOperationException.class,
                        "UnsupportedOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.EntityDoesNotExistException.class,
                        "EntityDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.InsufficientPermissionsException.class,
                        "InsufficientPermissionsException"));
        jsonErrorUnmarshallers.add(new JsonErrorUnmarshallerV2(
                com.amazonaws.services.directory.model.ClientException.class,
                "ClientException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.DirectoryLimitExceededException.class,
                        "DirectoryLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.AuthenticationFailedException.class,
                        "AuthenticationFailedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.directory.model.DirectoryUnavailableException.class,
                        "DirectoryUnavailableException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://ds.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/directory/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/directory/request.handler2s"));
    }

    /**
     * <p>
     * Creates an AD Connector to connect to an on-premises directory.
     * </p>
     * 
     * @param connectDirectoryRequest
     *        Contains the inputs for the <a>ConnectDirectory</a> operation.
     * @return Result of the ConnectDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.ConnectDirectory
     */
    @Override
    public ConnectDirectoryResult connectDirectory(
            ConnectDirectoryRequest connectDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(connectDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ConnectDirectoryRequest> request = null;
        Response<ConnectDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ConnectDirectoryRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(connectDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ConnectDirectoryResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ConnectDirectoryResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates an alias for a directory and assigns the alias to the directory.
     * The alias is used to construct the access URL for the directory, such as
     * <code>http://<![CDATA[&#x3C;]]>alias<![CDATA[&#x3E;]]>.awsapps.com</code>
     * .
     * </p>
     * <important>
     * <p>
     * After an alias has been created, it cannot be deleted or reused, so this
     * operation should only be used when absolutely necessary.
     * </p>
     * </important>
     * 
     * @param createAliasRequest
     *        Contains the inputs for the <a>CreateAlias</a> operation.
     * @return Result of the CreateAlias operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateAlias
     */
    @Override
    public CreateAliasResult createAlias(CreateAliasRequest createAliasRequest) {
        ExecutionContext executionContext = createExecutionContext(createAliasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateAliasRequest> request = null;
        Response<CreateAliasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateAliasRequestMarshaller().marshall(super
                        .beforeMarshalling(createAliasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateAliasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateAliasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a computer account in the specified directory, and joins the
     * computer to the directory.
     * </p>
     * 
     * @param createComputerRequest
     *        Contains the inputs for the <a>CreateComputer</a> operation.
     * @return Result of the CreateComputer operation returned by the service.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateComputer
     */
    @Override
    public CreateComputerResult createComputer(
            CreateComputerRequest createComputerRequest) {
        ExecutionContext executionContext = createExecutionContext(createComputerRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateComputerRequest> request = null;
        Response<CreateComputerResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateComputerRequestMarshaller().marshall(super
                        .beforeMarshalling(createComputerRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateComputerResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateComputerResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a conditional forwarder associated with your AWS directory.
     * Conditional forwarders are required in order to set up a trust
     * relationship with another domain. The conditional forwarder points to the
     * trusted domain.
     * </p>
     * 
     * @param createConditionalForwarderRequest
     *        Initiates the creation of a conditional forwarder for your AWS
     *        Directory Service for Microsoft Active Directory. Conditional
     *        forwarders are required in order to set up a trust relationship
     *        with another domain.
     * @return Result of the CreateConditionalForwarder operation returned by
     *         the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateConditionalForwarder
     */
    @Override
    public CreateConditionalForwarderResult createConditionalForwarder(
            CreateConditionalForwarderRequest createConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(createConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateConditionalForwarderRequest> request = null;
        Response<CreateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateConditionalForwarderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateConditionalForwarderResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateConditionalForwarderResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a Simple AD directory.
     * </p>
     * 
     * @param createDirectoryRequest
     *        Contains the inputs for the <a>CreateDirectory</a> operation.
     * @return Result of the CreateDirectory operation returned by the service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateDirectory
     */
    @Override
    public CreateDirectoryResult createDirectory(
            CreateDirectoryRequest createDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(createDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateDirectoryRequest> request = null;
        Response<CreateDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateDirectoryRequestMarshaller().marshall(super
                        .beforeMarshalling(createDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateDirectoryResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateDirectoryResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Creates a Microsoft AD in the AWS cloud.
     * 
     * @param createMicrosoftADRequest
     *        Creates a Microsoft AD in the AWS cloud.
     * @return Result of the CreateMicrosoftAD operation returned by the
     *         service.
     * @throws DirectoryLimitExceededException
     *         The maximum number of directories in the region has been reached.
     *         You can use the <a>GetDirectoryLimits</a> operation to determine
     *         your directory limits in the region.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateMicrosoftAD
     */
    @Override
    public CreateMicrosoftADResult createMicrosoftAD(
            CreateMicrosoftADRequest createMicrosoftADRequest) {
        ExecutionContext executionContext = createExecutionContext(createMicrosoftADRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateMicrosoftADRequest> request = null;
        Response<CreateMicrosoftADResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateMicrosoftADRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createMicrosoftADRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateMicrosoftADResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateMicrosoftADResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates a snapshot of a Simple AD or Microsoft AD directory in the AWS
     * cloud.
     * </p>
     * <note>
     * <p>
     * You cannot take snapshots of AD Connector directories.
     * </p>
     * </note>
     * 
     * @param createSnapshotRequest
     *        Contains the inputs for the <a>CreateSnapshot</a> operation.
     * @return Result of the CreateSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws SnapshotLimitExceededException
     *         The maximum number of manual snapshots for the directory has been
     *         reached. You can use the <a>GetSnapshotLimits</a> operation to
     *         determine the snapshot limits for a directory.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.CreateSnapshot
     */
    @Override
    public CreateSnapshotResult createSnapshot(
            CreateSnapshotRequest createSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(createSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateSnapshotRequest> request = null;
        Response<CreateSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateSnapshotRequestMarshaller().marshall(super
                        .beforeMarshalling(createSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateSnapshotResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateSnapshotResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to
     * configure trust relationships. For example, you can establish a trust
     * between your Microsoft AD in the AWS cloud, and your existing on-premises
     * Microsoft Active Directory. This would allow you to provide users and
     * groups access to resources in either domain, with a single set of
     * credentials.
     * </p>
     * <p>
     * This action initiates the creation of the AWS side of a trust
     * relationship between a Microsoft AD in the AWS cloud and an external
     * domain.
     * </p>
     * 
     * @param createTrustRequest
     *        AWS Directory Service for Microsoft Active Directory allows you to
     *        configure trust relationships. For example, you can establish a
     *        trust between your Microsoft AD in the AWS cloud, and your
     *        existing on-premises Microsoft Active Directory. This would allow
     *        you to provide users and groups access to resources in either
     *        domain, with a single set of credentials.</p>
     *        <p>
     *        This action initiates the creation of the AWS side of a trust
     *        relationship between a Microsoft AD in the AWS cloud and an
     *        external domain.
     * @return Result of the CreateTrust operation returned by the service.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.CreateTrust
     */
    @Override
    public CreateTrustResult createTrust(CreateTrustRequest createTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrustRequest> request = null;
        Response<CreateTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(createTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateTrustResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateTrustResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a conditional forwarder that has been set up for your AWS
     * directory.
     * </p>
     * 
     * @param deleteConditionalForwarderRequest
     * @return Result of the DeleteConditionalForwarder operation returned by
     *         the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteConditionalForwarder
     */
    @Override
    public DeleteConditionalForwarderResult deleteConditionalForwarder(
            DeleteConditionalForwarderRequest deleteConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteConditionalForwarderRequest> request = null;
        Response<DeleteConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteConditionalForwarderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteConditionalForwarderResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteConditionalForwarderResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes an AWS Directory Service directory.
     * </p>
     * 
     * @param deleteDirectoryRequest
     *        Contains the inputs for the <a>DeleteDirectory</a> operation.
     * @return Result of the DeleteDirectory operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteDirectory
     */
    @Override
    public DeleteDirectoryResult deleteDirectory(
            DeleteDirectoryRequest deleteDirectoryRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteDirectoryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteDirectoryRequest> request = null;
        Response<DeleteDirectoryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteDirectoryRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteDirectoryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteDirectoryResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteDirectoryResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a directory snapshot.
     * </p>
     * 
     * @param deleteSnapshotRequest
     *        Contains the inputs for the <a>DeleteSnapshot</a> operation.
     * @return Result of the DeleteSnapshot operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeleteSnapshot
     */
    @Override
    public DeleteSnapshotResult deleteSnapshot(
            DeleteSnapshotRequest deleteSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteSnapshotRequest> request = null;
        Response<DeleteSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteSnapshotRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteSnapshotResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteSnapshotResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Deletes an existing trust relationship between your Microsoft AD in the
     * AWS cloud and an external domain.
     * 
     * @param deleteTrustRequest
     *        Deletes the local side of an existing trust relationship between
     *        the Microsoft AD in the AWS cloud and the external domain.
     * @return Result of the DeleteTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DeleteTrust
     */
    @Override
    public DeleteTrustResult deleteTrust(DeleteTrustRequest deleteTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrustRequest> request = null;
        Response<DeleteTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTrustResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteTrustResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes the specified directory as a publisher to the specified SNS
     * topic.
     * </p>
     * 
     * @param deregisterEventTopicRequest
     *        Removes the specified directory as a publisher to the specified
     *        SNS topic.
     * @return Result of the DeregisterEventTopic operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DeregisterEventTopic
     */
    @Override
    public DeregisterEventTopicResult deregisterEventTopic(
            DeregisterEventTopicRequest deregisterEventTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(deregisterEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeregisterEventTopicRequest> request = null;
        Response<DeregisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeregisterEventTopicRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deregisterEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeregisterEventTopicResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeregisterEventTopicResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the conditional forwarders for this account.
     * </p>
     * <p>
     * If no input parameters are provided for RemoteDomainNames, this request
     * describes all conditional forwarders for the specified directory ID.
     * </p>
     * 
     * @param describeConditionalForwardersRequest
     * @return Result of the DescribeConditionalForwarders operation returned by
     *         the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeConditionalForwarders
     */
    @Override
    public DescribeConditionalForwardersResult describeConditionalForwarders(
            DescribeConditionalForwardersRequest describeConditionalForwardersRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConditionalForwardersRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConditionalForwardersRequest> request = null;
        Response<DescribeConditionalForwardersResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConditionalForwardersRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConditionalForwardersRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConditionalForwardersResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeConditionalForwardersResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the directories that belong to this account.
     * </p>
     * <p>
     * You can retrieve information about specific directories by passing the
     * directory identifiers in the <i>DirectoryIds</i> parameter. Otherwise,
     * all directories that belong to the current account are returned.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeDirectoriesResult.NextToken</i> member contains a token that
     * you pass in the next call to <a>DescribeDirectories</a> to retrieve the
     * next set of items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeDirectoriesRequest
     *        Contains the inputs for the <a>DescribeDirectories</a> operation.
     * @return Result of the DescribeDirectories operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeDirectories
     */
    @Override
    public DescribeDirectoriesResult describeDirectories(
            DescribeDirectoriesRequest describeDirectoriesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeDirectoriesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeDirectoriesRequest> request = null;
        Response<DescribeDirectoriesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeDirectoriesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeDirectoriesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeDirectoriesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeDirectoriesResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeDirectoriesResult describeDirectories() {
        return describeDirectories(new DescribeDirectoriesRequest());
    }

    /**
     * <p>
     * Obtains information about which SNS topics receive status messages from
     * the specified directory.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TopicName,
     * this request describes all of the associations in the account.
     * </p>
     * 
     * @param describeEventTopicsRequest
     * @return Result of the DescribeEventTopics operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeEventTopics
     */
    @Override
    public DescribeEventTopicsResult describeEventTopics(
            DescribeEventTopicsRequest describeEventTopicsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEventTopicsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEventTopicsRequest> request = null;
        Response<DescribeEventTopicsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEventTopicsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEventTopicsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEventTopicsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeEventTopicsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains information about the directory snapshots that belong to this
     * account.
     * </p>
     * <p>
     * This operation supports pagination with the use of the <i>NextToken</i>
     * request and response parameters. If more results are available, the
     * <i>DescribeSnapshots.NextToken</i> member contains a token that you pass
     * in the next call to <a>DescribeSnapshots</a> to retrieve the next set of
     * items.
     * </p>
     * <p>
     * You can also specify a maximum number of return results with the
     * <i>Limit</i> parameter.
     * </p>
     * 
     * @param describeSnapshotsRequest
     *        Contains the inputs for the <a>DescribeSnapshots</a> operation.
     * @return Result of the DescribeSnapshots operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DescribeSnapshots
     */
    @Override
    public DescribeSnapshotsResult describeSnapshots(
            DescribeSnapshotsRequest describeSnapshotsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSnapshotsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSnapshotsRequest> request = null;
        Response<DescribeSnapshotsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSnapshotsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeSnapshotsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeSnapshotsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeSnapshotsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeSnapshotsResult describeSnapshots() {
        return describeSnapshots(new DescribeSnapshotsRequest());
    }

    /**
     * <p>
     * Obtains information about the trust relationships for this account.
     * </p>
     * <p>
     * If no input parameters are provided, such as DirectoryId or TrustIds,
     * this request describes all the trust relationships belonging to the
     * account.
     * </p>
     * 
     * @param describeTrustsRequest
     *        Describes the trust relationships for a particular Microsoft AD in
     *        the AWS cloud. If no input parameters are are provided, such as
     *        directory ID or trust ID, this request describes all the trust
     *        relationships.
     * @return Result of the DescribeTrusts operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidNextTokenException
     *         The <i>NextToken</i> value is not valid.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.DescribeTrusts
     */
    @Override
    public DescribeTrustsResult describeTrusts(
            DescribeTrustsRequest describeTrustsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrustsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrustsRequest> request = null;
        Response<DescribeTrustsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrustsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeTrustsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTrustsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeTrustsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables multi-factor authentication (MFA) with the Remote Authentication
     * Dial In User Service (RADIUS) server for an AD Connector directory.
     * </p>
     * 
     * @param disableRadiusRequest
     *        Contains the inputs for the <a>DisableRadius</a> operation.
     * @return Result of the DisableRadius operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableRadius
     */
    @Override
    public DisableRadiusResult disableRadius(
            DisableRadiusRequest disableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(disableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableRadiusRequest> request = null;
        Response<DisableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(disableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableRadiusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DisableRadiusResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Disables single-sign on for a directory.
     * </p>
     * 
     * @param disableSsoRequest
     *        Contains the inputs for the <a>DisableSso</a> operation.
     * @return Result of the DisableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the
     *         operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.DisableSso
     */
    @Override
    public DisableSsoResult disableSso(DisableSsoRequest disableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(disableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DisableSsoRequest> request = null;
        Response<DisableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DisableSsoRequestMarshaller().marshall(super
                        .beforeMarshalling(disableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DisableSsoResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DisableSsoResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables multi-factor authentication (MFA) with the Remote Authentication
     * Dial In User Service (RADIUS) server for an AD Connector directory.
     * </p>
     * 
     * @param enableRadiusRequest
     *        Contains the inputs for the <a>EnableRadius</a> operation.
     * @return Result of the EnableRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityAlreadyExistsException
     *         The specified entity already exists.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableRadius
     */
    @Override
    public EnableRadiusResult enableRadius(
            EnableRadiusRequest enableRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(enableRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableRadiusRequest> request = null;
        Response<EnableRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(enableRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableRadiusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new EnableRadiusResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Enables single-sign on for a directory.
     * </p>
     * 
     * @param enableSsoRequest
     *        Contains the inputs for the <a>EnableSso</a> operation.
     * @return Result of the EnableSso operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InsufficientPermissionsException
     *         The account does not have sufficient permission to perform the
     *         operation.
     * @throws AuthenticationFailedException
     *         An authentication error occurred.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.EnableSso
     */
    @Override
    public EnableSsoResult enableSso(EnableSsoRequest enableSsoRequest) {
        ExecutionContext executionContext = createExecutionContext(enableSsoRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EnableSsoRequest> request = null;
        Response<EnableSsoResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EnableSsoRequestMarshaller().marshall(super
                        .beforeMarshalling(enableSsoRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EnableSsoResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new EnableSsoResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Obtains directory limit information for the current region.
     * </p>
     * 
     * @param getDirectoryLimitsRequest
     *        Contains the inputs for the <a>GetDirectoryLimits</a> operation.
     * @return Result of the GetDirectoryLimits operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetDirectoryLimits
     */
    @Override
    public GetDirectoryLimitsResult getDirectoryLimits(
            GetDirectoryLimitsRequest getDirectoryLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getDirectoryLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetDirectoryLimitsRequest> request = null;
        Response<GetDirectoryLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetDirectoryLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getDirectoryLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetDirectoryLimitsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetDirectoryLimitsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetDirectoryLimitsResult getDirectoryLimits() {
        return getDirectoryLimits(new GetDirectoryLimitsRequest());
    }

    /**
     * <p>
     * Obtains the manual snapshot limits for a directory.
     * </p>
     * 
     * @param getSnapshotLimitsRequest
     *        Contains the inputs for the <a>GetSnapshotLimits</a> operation.
     * @return Result of the GetSnapshotLimits operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.GetSnapshotLimits
     */
    @Override
    public GetSnapshotLimitsResult getSnapshotLimits(
            GetSnapshotLimitsRequest getSnapshotLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(getSnapshotLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetSnapshotLimitsRequest> request = null;
        Response<GetSnapshotLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetSnapshotLimitsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getSnapshotLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetSnapshotLimitsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetSnapshotLimitsResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Associates a directory with an SNS topic. This establishes the directory
     * as a publisher to the specified SNS topic. You can then receive email or
     * text (SMS) messages when the status of your directory changes. You get
     * notified if your directory goes from an Active status to an Impaired or
     * Inoperable status. You also receive a notification when the directory
     * returns to an Active status.
     * </p>
     * 
     * @param registerEventTopicRequest
     * @return Result of the RegisterEventTopic operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RegisterEventTopic
     */
    @Override
    public RegisterEventTopicResult registerEventTopic(
            RegisterEventTopicRequest registerEventTopicRequest) {
        ExecutionContext executionContext = createExecutionContext(registerEventTopicRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RegisterEventTopicRequest> request = null;
        Response<RegisterEventTopicResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RegisterEventTopicRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(registerEventTopicRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RegisterEventTopicResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RegisterEventTopicResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Restores a directory using an existing directory snapshot.
     * </p>
     * <p>
     * When you restore a directory from a snapshot, any changes made to the
     * directory after the snapshot date are overwritten.
     * </p>
     * <p>
     * This action returns as soon as the restore operation is initiated. You
     * can monitor the progress of the restore operation by calling the
     * <a>DescribeDirectories</a> operation with the directory identifier. When
     * the <b>DirectoryDescription.Stage</b> value changes to
     * <code>Active</code>, the restore operation is complete.
     * </p>
     * 
     * @param restoreFromSnapshotRequest
     *        An object representing the inputs for the
     *        <a>RestoreFromSnapshot</a> operation.
     * @return Result of the RestoreFromSnapshot operation returned by the
     *         service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.RestoreFromSnapshot
     */
    @Override
    public RestoreFromSnapshotResult restoreFromSnapshot(
            RestoreFromSnapshotRequest restoreFromSnapshotRequest) {
        ExecutionContext executionContext = createExecutionContext(restoreFromSnapshotRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RestoreFromSnapshotRequest> request = null;
        Response<RestoreFromSnapshotResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RestoreFromSnapshotRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(restoreFromSnapshotRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RestoreFromSnapshotResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RestoreFromSnapshotResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates a conditional forwarder that has been set up for your AWS
     * directory.
     * </p>
     * 
     * @param updateConditionalForwarderRequest
     * @return Result of the UpdateConditionalForwarder operation returned by
     *         the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws DirectoryUnavailableException
     *         The specified directory is unavailable or could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateConditionalForwarder
     */
    @Override
    public UpdateConditionalForwarderResult updateConditionalForwarder(
            UpdateConditionalForwarderRequest updateConditionalForwarderRequest) {
        ExecutionContext executionContext = createExecutionContext(updateConditionalForwarderRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateConditionalForwarderRequest> request = null;
        Response<UpdateConditionalForwarderResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateConditionalForwarderRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(updateConditionalForwarderRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateConditionalForwarderResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateConditionalForwarderResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the Remote Authentication Dial In User Service (RADIUS) server
     * information for an AD Connector directory.
     * </p>
     * 
     * @param updateRadiusRequest
     *        Contains the inputs for the <a>UpdateRadius</a> operation.
     * @return Result of the UpdateRadius operation returned by the service.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @sample AWSDirectoryService.UpdateRadius
     */
    @Override
    public UpdateRadiusResult updateRadius(
            UpdateRadiusRequest updateRadiusRequest) {
        ExecutionContext executionContext = createExecutionContext(updateRadiusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateRadiusRequest> request = null;
        Response<UpdateRadiusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateRadiusRequestMarshaller().marshall(super
                        .beforeMarshalling(updateRadiusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateRadiusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateRadiusResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * AWS Directory Service for Microsoft Active Directory allows you to
     * configure and verify trust relationships.
     * </p>
     * <p>
     * This action verifies a trust relationship between your Microsoft AD in
     * the AWS cloud and an external domain.
     * </p>
     * 
     * @param verifyTrustRequest
     *        Initiates the verification of an existing trust relationship
     *        between a Microsoft AD in the AWS cloud and an external domain.
     * @return Result of the VerifyTrust operation returned by the service.
     * @throws EntityDoesNotExistException
     *         The specified entity could not be found.
     * @throws InvalidParameterException
     *         One or more parameters are not valid.
     * @throws ClientException
     *         A client exception has occurred.
     * @throws ServiceException
     *         An exception has occurred in AWS Directory Service.
     * @throws UnsupportedOperationException
     *         The operation is not supported.
     * @sample AWSDirectoryService.VerifyTrust
     */
    @Override
    public VerifyTrustResult verifyTrust(VerifyTrustRequest verifyTrustRequest) {
        ExecutionContext executionContext = createExecutionContext(verifyTrustRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<VerifyTrustRequest> request = null;
        Response<VerifyTrustResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new VerifyTrustRequestMarshaller().marshall(super
                        .beforeMarshalling(verifyTrustRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<VerifyTrustResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new VerifyTrustResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * Returns additional metadata for a previously executed successful,
     * request, typically used for debugging issues where a service isn't acting
     * as expected. This data isn't considered part of the result data returned
     * by an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing the request.
     *
     * @param request
     *        The originally executed request
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    public ResponseMetadata getCachedResponseMetadata(
            AmazonWebServiceRequest request) {
        return client.getResponseMetadataForRequest(request);
    }

    private <X, Y extends AmazonWebServiceRequest> Response<X> invoke(
            Request<Y> request,
            HttpResponseHandler<AmazonWebServiceResponse<X>> responseHandler,
            ExecutionContext executionContext) {
        request.setEndpoint(endpoint);
        request.setTimeOffset(timeOffset);

        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        AWSCredentials credentials;
        awsRequestMetrics.startEvent(Field.CredentialsRequestTime);
        try {
            credentials = awsCredentialsProvider.getCredentials();
        } finally {
            awsRequestMetrics.endEvent(Field.CredentialsRequestTime);
        }

        AmazonWebServiceRequest originalRequest = request.getOriginalRequest();
        if (originalRequest != null
                && originalRequest.getRequestCredentials() != null) {
            credentials = originalRequest.getRequestCredentials();
        }

        executionContext.setCredentials(credentials);

        JsonErrorResponseHandlerV2 errorResponseHandler = SdkJsonProtocolFactory
                .createErrorResponseHandler(jsonErrorUnmarshallers, false);

        return client.execute(request, responseHandler, errorResponseHandler,
                executionContext);
    }

}
