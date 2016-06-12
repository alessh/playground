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
package com.amazonaws.services.databasemigrationservice;

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

import com.amazonaws.services.databasemigrationservice.model.*;
import com.amazonaws.services.databasemigrationservice.model.transform.*;

/**
 * Client for accessing AWS Database Migration Service. All service calls made
 * using this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>AWS Database Migration Service</fullname>
 * <p>
 * AWS Database Migration Service (AWS DMS) can migrate your data to and from
 * the most widely used commercial and open-source databases such as Oracle,
 * PostgreSQL, Microsoft SQL Server, MariaDB, Amazon Aurora, and MySQL. The
 * service supports homogeneous migrations such as Oracle to Oracle, as well as
 * heterogeneous migrations between different database platforms, such as Oracle
 * to MySQL or SQL Server to PostgreSQL.
 * </p>
 */
@ThreadSafe
public class AWSDatabaseMigrationServiceClient extends AmazonWebServiceClient
        implements AWSDatabaseMigrationService {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AWSDatabaseMigrationService.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dms";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "dms";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all AWS Database Migration Service
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
    public AWSDatabaseMigrationServiceClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service. A credentials provider chain will be used that
     * searches for credentials in this order:
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
     *        connects to AWS Database Migration Service (ex: proxy settings,
     *        retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSDatabaseMigrationServiceClient(
            ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service using the specified AWS account credentials and client
     * configuration options.
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
     *        connects to AWS Database Migration Service (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSDatabaseMigrationServiceClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSDatabaseMigrationServiceClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service using the specified AWS account credentials provider
     * and client configuration options.
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
     *        connects to AWS Database Migration Service (ex: proxy settings,
     *        retry counts, etc.).
     */
    public AWSDatabaseMigrationServiceClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Database
     * Migration Service using the specified AWS account credentials provider,
     * client configuration options, and request metric collector.
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
     *        connects to AWS Database Migration Service (ex: proxy settings,
     *        retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSDatabaseMigrationServiceClient(
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
                        com.amazonaws.services.databasemigrationservice.model.AccessDeniedException.class,
                        "AccessDeniedFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException.class,
                        "InvalidResourceStateFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException.class,
                        "ResourceNotFoundFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.KMSKeyNotAccessibleException.class,
                        "KMSKeyNotAccessibleFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.SubnetAlreadyInUseException.class,
                        "SubnetAlreadyInUse"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.UpgradeDependencyFailureException.class,
                        "UpgradeDependencyFailureFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.ResourceAlreadyExistsException.class,
                        "ResourceAlreadyExistsFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.InvalidSubnetException.class,
                        "InvalidSubnet"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.InsufficientResourceCapacityException.class,
                        "InsufficientResourceCapacityFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.StorageQuotaExceededException.class,
                        "StorageQuotaExceededFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.ResourceQuotaExceededException.class,
                        "ResourceQuotaExceededFault"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.databasemigrationservice.model.ReplicationSubnetGroupDoesNotCoverEnoughAZsException.class,
                        "ReplicationSubnetGroupDoesNotCoverEnoughAZs"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("dms.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/databasemigrationservice/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/databasemigrationservice/request.handler2s"));
    }

    /**
     * <p>
     * Adds metadata tags to a DMS resource, including replication instance,
     * endpoint, security group, and migration task. These tags can also be used
     * with cost allocation reporting to track cost associated with DMS
     * resources, or used in a Condition statement in an IAM policy for DMS.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param addTagsToResourceRequest
     * @return Result of the AddTagsToResource operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.AddTagsToResource
     */
    @Override
    public AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest addTagsToResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsToResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsToResourceRequest> request = null;
        Response<AddTagsToResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsToResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(addTagsToResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddTagsToResourceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new AddTagsToResourceResultJsonUnmarshaller(),
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
     * Creates an endpoint using the provided settings.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param createEndpointRequest
     * @return Result of the CreateEndpoint operation returned by the service.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateEndpoint
     */
    @Override
    public CreateEndpointResult createEndpoint(
            CreateEndpointRequest createEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(createEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateEndpointRequest> request = null;
        Response<CreateEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateEndpointRequestMarshaller().marshall(super
                        .beforeMarshalling(createEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateEndpointResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateEndpointResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Creates the replication instance using the specified parameters.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param createReplicationInstanceRequest
     * @return Result of the CreateReplicationInstance operation returned by the
     *         service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database
     *         migration.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability
     *         Zones (AZs). Edit the replication subnet group and add more AZs.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.CreateReplicationInstance
     */
    @Override
    public CreateReplicationInstanceResult createReplicationInstance(
            CreateReplicationInstanceRequest createReplicationInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationInstanceRequest> request = null;
        Response<CreateReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateReplicationInstanceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateReplicationInstanceResultJsonUnmarshaller(),
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
     * Creates a replication subnet group given a list of the subnet IDs in a
     * VPC.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param createReplicationSubnetGroupRequest
     * @return Result of the CreateReplicationSubnetGroup operation returned by
     *         the service.
     * @throws AccessDeniedException
     *         AWS DMS was denied access to the endpoint.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability
     *         Zones (AZs). Edit the replication subnet group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.CreateReplicationSubnetGroup
     */
    @Override
    public CreateReplicationSubnetGroupResult createReplicationSubnetGroup(
            CreateReplicationSubnetGroupRequest createReplicationSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationSubnetGroupRequest> request = null;
        Response<CreateReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationSubnetGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateReplicationSubnetGroupResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateReplicationSubnetGroupResultJsonUnmarshaller(),
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
     * Creates a replication task using the specified parameters.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param createReplicationTaskRequest
     * @return Result of the CreateReplicationTask operation returned by the
     *         service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.CreateReplicationTask
     */
    @Override
    public CreateReplicationTaskResult createReplicationTask(
            CreateReplicationTaskRequest createReplicationTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(createReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateReplicationTaskRequest> request = null;
        Response<CreateReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateReplicationTaskRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(createReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateReplicationTaskResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateReplicationTaskResultJsonUnmarshaller(),
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
     * Deletes the specified endpoint.
     * </p>
     * <note>All tasks associated with the endpoint must be deleted before you
     * can delete the endpoint.</note>
     * <p/>
     * 
     * @param deleteEndpointRequest
     * @return Result of the DeleteEndpoint operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @sample AWSDatabaseMigrationService.DeleteEndpoint
     */
    @Override
    public DeleteEndpointResult deleteEndpoint(
            DeleteEndpointRequest deleteEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteEndpointRequest> request = null;
        Response<DeleteEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteEndpointRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteEndpointResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteEndpointResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes the specified replication instance.
     * </p>
     * <note>You must delete any migration tasks that are associated with the
     * replication instance before you can delete it.</note>
     * <p/>
     * 
     * @param deleteReplicationInstanceRequest
     * @return Result of the DeleteReplicationInstance operation returned by the
     *         service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationInstance
     */
    @Override
    public DeleteReplicationInstanceResult deleteReplicationInstance(
            DeleteReplicationInstanceRequest deleteReplicationInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationInstanceRequest> request = null;
        Response<DeleteReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteReplicationInstanceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteReplicationInstanceResultJsonUnmarshaller(),
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
     * Deletes a subnet group.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param deleteReplicationSubnetGroupRequest
     * @return Result of the DeleteReplicationSubnetGroup operation returned by
     *         the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DeleteReplicationSubnetGroup
     */
    @Override
    public DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(
            DeleteReplicationSubnetGroupRequest deleteReplicationSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationSubnetGroupRequest> request = null;
        Response<DeleteReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationSubnetGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteReplicationSubnetGroupResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteReplicationSubnetGroupResultJsonUnmarshaller(),
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
     * Deletes the specified replication task.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param deleteReplicationTaskRequest
     * @return Result of the DeleteReplicationTask operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @sample AWSDatabaseMigrationService.DeleteReplicationTask
     */
    @Override
    public DeleteReplicationTaskResult deleteReplicationTask(
            DeleteReplicationTaskRequest deleteReplicationTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteReplicationTaskRequest> request = null;
        Response<DeleteReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteReplicationTaskRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deleteReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteReplicationTaskResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteReplicationTaskResultJsonUnmarshaller(),
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
     * Lists all of the AWS DMS attributes for a customer account. The
     * attributes include AWS DMS quotas for the account, such as the number of
     * replication instances allowed. The description for a quota includes the
     * quota name, current usage toward that quota, and the quota's maximum
     * value.
     * </p>
     * <p>
     * This command does not take any parameters.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeAccountAttributesRequest
     * @return Result of the DescribeAccountAttributes operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationService.DescribeAccountAttributes
     */
    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest describeAccountAttributesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeAccountAttributesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeAccountAttributesRequest> request = null;
        Response<DescribeAccountAttributesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeAccountAttributesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeAccountAttributesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeAccountAttributesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeAccountAttributesResultJsonUnmarshaller(),
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
     * Describes the status of the connections that have been made between the
     * replication instance and an endpoint. Connections are created when you
     * test an endpoint.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeConnectionsRequest
     * @return Result of the DescribeConnections operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeConnections
     */
    @Override
    public DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest describeConnectionsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeConnectionsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeConnectionsRequest> request = null;
        Response<DescribeConnectionsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeConnectionsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeConnectionsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeConnectionsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeConnectionsResultJsonUnmarshaller(),
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
     * Returns information about the type of endpoints available.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeEndpointTypesRequest
     * @return Result of the DescribeEndpointTypes operation returned by the
     *         service.
     * @sample AWSDatabaseMigrationService.DescribeEndpointTypes
     */
    @Override
    public DescribeEndpointTypesResult describeEndpointTypes(
            DescribeEndpointTypesRequest describeEndpointTypesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEndpointTypesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointTypesRequest> request = null;
        Response<DescribeEndpointTypesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointTypesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEndpointTypesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEndpointTypesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeEndpointTypesResultJsonUnmarshaller(),
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
     * Returns information about the endpoints for your account in the current
     * region.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeEndpointsRequest
     * @return Result of the DescribeEndpoints operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeEndpoints
     */
    @Override
    public DescribeEndpointsResult describeEndpoints(
            DescribeEndpointsRequest describeEndpointsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeEndpointsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeEndpointsRequest> request = null;
        Response<DescribeEndpointsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeEndpointsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeEndpointsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeEndpointsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeEndpointsResultJsonUnmarshaller(),
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
     * Returns information about the replication instance types that can be
     * created in the specified region.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeOrderableReplicationInstancesRequest
     * @return Result of the DescribeOrderableReplicationInstances operation
     *         returned by the service.
     * @sample AWSDatabaseMigrationService.DescribeOrderableReplicationInstances
     */
    @Override
    public DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest describeOrderableReplicationInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeOrderableReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeOrderableReplicationInstancesRequest> request = null;
        Response<DescribeOrderableReplicationInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeOrderableReplicationInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeOrderableReplicationInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeOrderableReplicationInstancesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeOrderableReplicationInstancesResultJsonUnmarshaller(),
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
     * Returns the status of the RefreshSchemas operation.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeRefreshSchemasStatusRequest
     * @return Result of the DescribeRefreshSchemasStatus operation returned by
     *         the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeRefreshSchemasStatus
     */
    @Override
    public DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(
            DescribeRefreshSchemasStatusRequest describeRefreshSchemasStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(describeRefreshSchemasStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeRefreshSchemasStatusRequest> request = null;
        Response<DescribeRefreshSchemasStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeRefreshSchemasStatusRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeRefreshSchemasStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeRefreshSchemasStatusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeRefreshSchemasStatusResultJsonUnmarshaller(),
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
     * Returns information about replication instances for your account in the
     * current region.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeReplicationInstancesRequest
     * @return Result of the DescribeReplicationInstances operation returned by
     *         the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationInstances
     */
    @Override
    public DescribeReplicationInstancesResult describeReplicationInstances(
            DescribeReplicationInstancesRequest describeReplicationInstancesRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReplicationInstancesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationInstancesRequest> request = null;
        Response<DescribeReplicationInstancesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationInstancesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeReplicationInstancesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeReplicationInstancesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeReplicationInstancesResultJsonUnmarshaller(),
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
     * Returns information about the replication subnet groups.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeReplicationSubnetGroupsRequest
     * @return Result of the DescribeReplicationSubnetGroups operation returned
     *         by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationSubnetGroups
     */
    @Override
    public DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(
            DescribeReplicationSubnetGroupsRequest describeReplicationSubnetGroupsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReplicationSubnetGroupsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationSubnetGroupsRequest> request = null;
        Response<DescribeReplicationSubnetGroupsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationSubnetGroupsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeReplicationSubnetGroupsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeReplicationSubnetGroupsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeReplicationSubnetGroupsResultJsonUnmarshaller(),
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
     * Returns information about replication tasks for your account in the
     * current region.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeReplicationTasksRequest
     * @return Result of the DescribeReplicationTasks operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeReplicationTasks
     */
    @Override
    public DescribeReplicationTasksResult describeReplicationTasks(
            DescribeReplicationTasksRequest describeReplicationTasksRequest) {
        ExecutionContext executionContext = createExecutionContext(describeReplicationTasksRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeReplicationTasksRequest> request = null;
        Response<DescribeReplicationTasksResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeReplicationTasksRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeReplicationTasksRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeReplicationTasksResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeReplicationTasksResultJsonUnmarshaller(),
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
     * Returns information about the schema for the specified endpoint.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeSchemasRequest
     * @return Result of the DescribeSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.DescribeSchemas
     */
    @Override
    public DescribeSchemasResult describeSchemas(
            DescribeSchemasRequest describeSchemasRequest) {
        ExecutionContext executionContext = createExecutionContext(describeSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeSchemasRequest> request = null;
        Response<DescribeSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeSchemasRequestMarshaller().marshall(super
                        .beforeMarshalling(describeSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeSchemasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeSchemasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns table statistics on the database migration task, including table
     * name, rows inserted, rows updated, and rows deleted.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param describeTableStatisticsRequest
     * @return Result of the DescribeTableStatistics operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @sample AWSDatabaseMigrationService.DescribeTableStatistics
     */
    @Override
    public DescribeTableStatisticsResult describeTableStatistics(
            DescribeTableStatisticsRequest describeTableStatisticsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTableStatisticsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableStatisticsRequest> request = null;
        Response<DescribeTableStatisticsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableStatisticsRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describeTableStatisticsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTableStatisticsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeTableStatisticsResultJsonUnmarshaller(),
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
     * Lists all tags for an AWS DMS resource.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param listTagsForResourceRequest
     * @return Result of the ListTagsForResource operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.ListTagsForResource
     */
    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest listTagsForResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsForResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsForResourceRequest> request = null;
        Response<ListTagsForResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsForResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(listTagsForResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsForResourceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListTagsForResourceResultJsonUnmarshaller(),
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
     * Modifies the specified endpoint.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param modifyEndpointRequest
     * @return Result of the ModifyEndpoint operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @sample AWSDatabaseMigrationService.ModifyEndpoint
     */
    @Override
    public ModifyEndpointResult modifyEndpoint(
            ModifyEndpointRequest modifyEndpointRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyEndpointRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyEndpointRequest> request = null;
        Response<ModifyEndpointResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyEndpointRequestMarshaller().marshall(super
                        .beforeMarshalling(modifyEndpointRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyEndpointResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ModifyEndpointResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Modifies the replication instance to apply new settings. You can change
     * one or more parameters by specifying these parameters and the new values
     * in the request.
     * </p>
     * <note>Some settings are applied during the maintenance window.</note>
     * <p/>
     * <p/>
     * 
     * @param modifyReplicationInstanceRequest
     * @return Result of the ModifyReplicationInstance operation returned by the
     *         service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceAlreadyExistsException
     *         The resource you are attempting to create already exists.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InsufficientResourceCapacityException
     *         There are not enough resources allocated to the database
     *         migration.
     * @throws StorageQuotaExceededException
     *         The storage quota has been exceeded.
     * @throws UpgradeDependencyFailureException
     *         An upgrade dependency is preventing the database migration.
     * @sample AWSDatabaseMigrationService.ModifyReplicationInstance
     */
    @Override
    public ModifyReplicationInstanceResult modifyReplicationInstance(
            ModifyReplicationInstanceRequest modifyReplicationInstanceRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationInstanceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationInstanceRequest> request = null;
        Response<ModifyReplicationInstanceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationInstanceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(modifyReplicationInstanceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyReplicationInstanceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ModifyReplicationInstanceResultJsonUnmarshaller(),
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
     * Modifies the settings for the specified replication subnet group.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param modifyReplicationSubnetGroupRequest
     * @return Result of the ModifyReplicationSubnetGroup operation returned by
     *         the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @throws SubnetAlreadyInUseException
     *         The specified subnet is already in use.
     * @throws ReplicationSubnetGroupDoesNotCoverEnoughAZsException
     *         The replication subnet group does not cover enough Availability
     *         Zones (AZs). Edit the replication subnet group and add more AZs.
     * @throws InvalidSubnetException
     *         The subnet provided is invalid.
     * @sample AWSDatabaseMigrationService.ModifyReplicationSubnetGroup
     */
    @Override
    public ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(
            ModifyReplicationSubnetGroupRequest modifyReplicationSubnetGroupRequest) {
        ExecutionContext executionContext = createExecutionContext(modifyReplicationSubnetGroupRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ModifyReplicationSubnetGroupRequest> request = null;
        Response<ModifyReplicationSubnetGroupResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ModifyReplicationSubnetGroupRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(modifyReplicationSubnetGroupRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ModifyReplicationSubnetGroupResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ModifyReplicationSubnetGroupResultJsonUnmarshaller(),
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
     * Populates the schema for the specified endpoint. This is an asynchronous
     * operation and can take several minutes. You can check the status of this
     * operation by calling the DescribeRefreshSchemasStatus operation.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param refreshSchemasRequest
     * @return Result of the RefreshSchemas operation returned by the service.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.RefreshSchemas
     */
    @Override
    public RefreshSchemasResult refreshSchemas(
            RefreshSchemasRequest refreshSchemasRequest) {
        ExecutionContext executionContext = createExecutionContext(refreshSchemasRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RefreshSchemasRequest> request = null;
        Response<RefreshSchemasResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RefreshSchemasRequestMarshaller().marshall(super
                        .beforeMarshalling(refreshSchemasRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RefreshSchemasResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RefreshSchemasResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes metadata tags from a DMS resource.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param removeTagsFromResourceRequest
     * @return Result of the RemoveTagsFromResource operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @sample AWSDatabaseMigrationService.RemoveTagsFromResource
     */
    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest removeTagsFromResourceRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsFromResourceRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsFromResourceRequest> request = null;
        Response<RemoveTagsFromResourceResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsFromResourceRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(removeTagsFromResourceRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RemoveTagsFromResourceResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RemoveTagsFromResourceResultJsonUnmarshaller(),
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
     * Starts the replication task.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param startReplicationTaskRequest
     * @return Result of the StartReplicationTask operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @sample AWSDatabaseMigrationService.StartReplicationTask
     */
    @Override
    public StartReplicationTaskResult startReplicationTask(
            StartReplicationTaskRequest startReplicationTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(startReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartReplicationTaskRequest> request = null;
        Response<StartReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartReplicationTaskRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(startReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartReplicationTaskResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new StartReplicationTaskResultJsonUnmarshaller(),
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
     * Stops the replication task.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param stopReplicationTaskRequest
     * @return Result of the StopReplicationTask operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @sample AWSDatabaseMigrationService.StopReplicationTask
     */
    @Override
    public StopReplicationTaskResult stopReplicationTask(
            StopReplicationTaskRequest stopReplicationTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(stopReplicationTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopReplicationTaskRequest> request = null;
        Response<StopReplicationTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopReplicationTaskRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(stopReplicationTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StopReplicationTaskResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new StopReplicationTaskResultJsonUnmarshaller(),
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
     * Tests the connection between the replication instance and the endpoint.
     * </p>
     * <note/>
     * <p/>
     * 
     * @param testConnectionRequest
     * @return Result of the TestConnection operation returned by the service.
     * @throws ResourceNotFoundException
     *         The resource could not be found.
     * @throws InvalidResourceStateException
     *         The resource is in a state that prevents it from being used for
     *         database migration.
     * @throws KMSKeyNotAccessibleException
     *         AWS DMS cannot access the KMS key.
     * @throws ResourceQuotaExceededException
     *         The quota for this resource quota has been exceeded.
     * @sample AWSDatabaseMigrationService.TestConnection
     */
    @Override
    public TestConnectionResult testConnection(
            TestConnectionRequest testConnectionRequest) {
        ExecutionContext executionContext = createExecutionContext(testConnectionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<TestConnectionRequest> request = null;
        Response<TestConnectionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new TestConnectionRequestMarshaller().marshall(super
                        .beforeMarshalling(testConnectionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<TestConnectionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new TestConnectionResultJsonUnmarshaller(), false);
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
