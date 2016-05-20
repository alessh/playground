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
package com.amazonaws.services.datapipeline;

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

import com.amazonaws.services.datapipeline.model.*;
import com.amazonaws.services.datapipeline.model.transform.*;

/**
 * Client for accessing AWS Data Pipeline. All service calls made using this
 * client are blocking, and will not return until the service call completes.
 * <p>
 * <p>
 * AWS Data Pipeline configures and manages a data-driven workflow called a
 * pipeline. AWS Data Pipeline handles the details of scheduling and ensuring
 * that data dependencies are met so that your application can focus on
 * processing the data.
 * </p>
 * <p>
 * AWS Data Pipeline provides a JAR implementation of a task runner called AWS
 * Data Pipeline Task Runner. AWS Data Pipeline Task Runner provides logic for
 * common data management scenarios, such as performing database queries and
 * running data analysis using Amazon Elastic MapReduce (Amazon EMR). You can
 * use AWS Data Pipeline Task Runner as your task runner, or you can write your
 * own task runner to provide custom data management.
 * </p>
 * <p>
 * AWS Data Pipeline implements two main sets of functionality. Use the first
 * set to create a pipeline and define data sources, schedules, dependencies,
 * and the transforms to be performed on the data. Use the second set in your
 * task runner application to receive the next task ready for processing. The
 * logic for performing the task, such as querying the data, running data
 * analysis, or converting the data from one format to another, is contained
 * within the task runner. The task runner performs the task assigned to it by
 * the web service, reporting progress to the web service as it does so. When
 * the task is done, the task runner reports the final success or failure of the
 * task to the web service.
 * </p>
 */
@ThreadSafe
public class DataPipelineClient extends AmazonWebServiceClient implements
        DataPipeline {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(DataPipeline.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "datapipeline";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "datapipeline";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all AWS Data Pipeline exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline. A
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
    public DataPipelineClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline. A
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
     *        connects to AWS Data Pipeline (ex: proxy settings, retry counts,
     *        etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public DataPipelineClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline
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
    public DataPipelineClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline
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
     *        connects to AWS Data Pipeline (ex: proxy settings, retry counts,
     *        etc.).
     */
    public DataPipelineClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline
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
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline
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
     *        connects to AWS Data Pipeline (ex: proxy settings, retry counts,
     *        etc.).
     */
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on AWS Data Pipeline
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
     *        connects to AWS Data Pipeline (ex: proxy settings, retry counts,
     *        etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public DataPipelineClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.datapipeline.model.PipelineNotFoundException.class,
                        "PipelineNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.datapipeline.model.TaskNotFoundException.class,
                        "TaskNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.datapipeline.model.InternalServiceErrorException.class,
                        "InternalServiceError"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.datapipeline.model.PipelineDeletedException.class,
                        "PipelineDeletedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.datapipeline.model.InvalidRequestException.class,
                        "InvalidRequestException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("datapipeline.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/datapipeline/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/datapipeline/request.handler2s"));
    }

    /**
     * <p>
     * Validates the specified pipeline and starts processing pipeline tasks. If
     * the pipeline does not pass validation, activation fails.
     * </p>
     * <p>
     * If you need to pause the pipeline to investigate an issue with a
     * component, such as a data source or script, call
     * <a>DeactivatePipeline</a>.
     * </p>
     * <p>
     * To activate a finished pipeline, modify the end date for the pipeline and
     * then activate it.
     * </p>
     * 
     * @param activatePipelineRequest
     *        Contains the parameters for ActivatePipeline.
     * @return Result of the ActivatePipeline operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.ActivatePipeline
     */
    @Override
    public ActivatePipelineResult activatePipeline(
            ActivatePipelineRequest activatePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(activatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ActivatePipelineRequest> request = null;
        Response<ActivatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ActivatePipelineRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(activatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ActivatePipelineResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ActivatePipelineResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds or modifies tags for the specified pipeline.
     * </p>
     * 
     * @param addTagsRequest
     *        Contains the parameters for AddTags.
     * @return Result of the AddTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.AddTags
     */
    @Override
    public AddTagsResult addTags(AddTagsRequest addTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(addTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<AddTagsRequest> request = null;
        Response<AddTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new AddTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(addTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<AddTagsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(new AddTagsResultJsonUnmarshaller(),
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
     * Creates a new, empty pipeline. Use <a>PutPipelineDefinition</a> to
     * populate the pipeline.
     * </p>
     * 
     * @param createPipelineRequest
     *        Contains the parameters for CreatePipeline.
     * @return Result of the CreatePipeline operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.CreatePipeline
     */
    @Override
    public CreatePipelineResult createPipeline(
            CreatePipelineRequest createPipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(createPipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreatePipelineRequest> request = null;
        Response<CreatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreatePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(createPipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreatePipelineResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreatePipelineResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deactivates the specified running pipeline. The pipeline is set to the
     * <code>DEACTIVATING</code> state until the deactivation process completes.
     * </p>
     * <p>
     * To resume a deactivated pipeline, use <a>ActivatePipeline</a>. By
     * default, the pipeline resumes from the last completed execution.
     * Optionally, you can specify the date and time to resume the pipeline.
     * </p>
     * 
     * @param deactivatePipelineRequest
     *        Contains the parameters for DeactivatePipeline.
     * @return Result of the DeactivatePipeline operation returned by the
     *         service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.DeactivatePipeline
     */
    @Override
    public DeactivatePipelineResult deactivatePipeline(
            DeactivatePipelineRequest deactivatePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(deactivatePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeactivatePipelineRequest> request = null;
        Response<DeactivatePipelineResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeactivatePipelineRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(deactivatePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeactivatePipelineResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeactivatePipelineResultJsonUnmarshaller(),
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
     * Deletes a pipeline, its pipeline definition, and its run history. AWS
     * Data Pipeline attempts to cancel instances associated with the pipeline
     * that are currently being processed by task runners.
     * </p>
     * <p>
     * Deleting a pipeline cannot be undone. You cannot query or restore a
     * deleted pipeline. To temporarily pause a pipeline instead of deleting it,
     * call <a>SetStatus</a> with the status set to <code>PAUSE</code> on
     * individual components. Components that are paused by <a>SetStatus</a> can
     * be resumed.
     * </p>
     * 
     * @param deletePipelineRequest
     *        Contains the parameters for DeletePipeline.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.DeletePipeline
     */
    @Override
    public void deletePipeline(DeletePipelineRequest deletePipelineRequest) {
        ExecutionContext executionContext = createExecutionContext(deletePipelineRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeletePipelineRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeletePipelineRequestMarshaller().marshall(super
                        .beforeMarshalling(deletePipelineRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Gets the object definitions for a set of objects associated with the
     * pipeline. Object definitions are composed of a set of fields that define
     * the properties of the object.
     * </p>
     * 
     * @param describeObjectsRequest
     *        Contains the parameters for DescribeObjects.
     * @return Result of the DescribeObjects operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.DescribeObjects
     */
    @Override
    public DescribeObjectsResult describeObjects(
            DescribeObjectsRequest describeObjectsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeObjectsRequest> request = null;
        Response<DescribeObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeObjectsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeObjectsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeObjectsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves metadata about one or more pipelines. The information retrieved
     * includes the name of the pipeline, the pipeline identifier, its current
     * state, and the user account that owns the pipeline. Using account
     * credentials, you can retrieve metadata about pipelines that you or your
     * IAM users have created. If you are using an IAM user account, you can
     * retrieve metadata about only those pipelines for which you have read
     * permissions.
     * </p>
     * <p>
     * To retrieve the full pipeline definition instead of metadata about the
     * pipeline, call <a>GetPipelineDefinition</a>.
     * </p>
     * 
     * @param describePipelinesRequest
     *        Contains the parameters for DescribePipelines.
     * @return Result of the DescribePipelines operation returned by the
     *         service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.DescribePipelines
     */
    @Override
    public DescribePipelinesResult describePipelines(
            DescribePipelinesRequest describePipelinesRequest) {
        ExecutionContext executionContext = createExecutionContext(describePipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribePipelinesRequest> request = null;
        Response<DescribePipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribePipelinesRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(describePipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribePipelinesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribePipelinesResultJsonUnmarshaller(),
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
     * Task runners call <code>EvaluateExpression</code> to evaluate a string in
     * the context of the specified object. For example, a task runner can
     * evaluate SQL queries stored in Amazon S3.
     * </p>
     * 
     * @param evaluateExpressionRequest
     *        Contains the parameters for EvaluateExpression.
     * @return Result of the EvaluateExpression operation returned by the
     *         service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.EvaluateExpression
     */
    @Override
    public EvaluateExpressionResult evaluateExpression(
            EvaluateExpressionRequest evaluateExpressionRequest) {
        ExecutionContext executionContext = createExecutionContext(evaluateExpressionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<EvaluateExpressionRequest> request = null;
        Response<EvaluateExpressionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new EvaluateExpressionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(evaluateExpressionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<EvaluateExpressionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new EvaluateExpressionResultJsonUnmarshaller(),
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
     * Gets the definition of the specified pipeline. You can call
     * <code>GetPipelineDefinition</code> to retrieve the pipeline definition
     * that you provided using <a>PutPipelineDefinition</a>.
     * </p>
     * 
     * @param getPipelineDefinitionRequest
     *        Contains the parameters for GetPipelineDefinition.
     * @return Result of the GetPipelineDefinition operation returned by the
     *         service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.GetPipelineDefinition
     */
    @Override
    public GetPipelineDefinitionResult getPipelineDefinition(
            GetPipelineDefinitionRequest getPipelineDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(getPipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetPipelineDefinitionRequest> request = null;
        Response<GetPipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetPipelineDefinitionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getPipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetPipelineDefinitionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetPipelineDefinitionResultJsonUnmarshaller(),
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
     * Lists the pipeline identifiers for all active pipelines that you have
     * permission to access.
     * </p>
     * 
     * @param listPipelinesRequest
     *        Contains the parameters for ListPipelines.
     * @return Result of the ListPipelines operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.ListPipelines
     */
    @Override
    public ListPipelinesResult listPipelines(
            ListPipelinesRequest listPipelinesRequest) {
        ExecutionContext executionContext = createExecutionContext(listPipelinesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPipelinesRequest> request = null;
        Response<ListPipelinesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPipelinesRequestMarshaller().marshall(super
                        .beforeMarshalling(listPipelinesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPipelinesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListPipelinesResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPipelinesResult listPipelines() {
        return listPipelines(new ListPipelinesRequest());
    }

    /**
     * <p>
     * Task runners call <code>PollForTask</code> to receive a task to perform
     * from AWS Data Pipeline. The task runner specifies which tasks it can
     * perform by setting a value for the <code>workerGroup</code> parameter.
     * The task returned can come from any of the pipelines that match the
     * <code>workerGroup</code> value passed in by the task runner and that was
     * launched using the IAM user credentials specified by the task runner.
     * </p>
     * <p>
     * If tasks are ready in the work queue, <code>PollForTask</code> returns a
     * response immediately. If no tasks are available in the queue,
     * <code>PollForTask</code> uses long-polling and holds on to a poll
     * connection for up to a 90 seconds, during which time the first newly
     * scheduled task is handed to the task runner. To accomodate this, set the
     * socket timeout in your task runner to 90 seconds. The task runner should
     * not call <code>PollForTask</code> again on the same
     * <code>workerGroup</code> until it receives a response, and this can take
     * up to 90 seconds.
     * </p>
     * 
     * @param pollForTaskRequest
     *        Contains the parameters for PollForTask.
     * @return Result of the PollForTask operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @sample DataPipeline.PollForTask
     */
    @Override
    public PollForTaskResult pollForTask(PollForTaskRequest pollForTaskRequest) {
        ExecutionContext executionContext = createExecutionContext(pollForTaskRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PollForTaskRequest> request = null;
        Response<PollForTaskResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PollForTaskRequestMarshaller().marshall(super
                        .beforeMarshalling(pollForTaskRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PollForTaskResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new PollForTaskResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Adds tasks, schedules, and preconditions to the specified pipeline. You
     * can use <code>PutPipelineDefinition</code> to populate a new pipeline.
     * </p>
     * <p>
     * <code>PutPipelineDefinition</code> also validates the configuration as it
     * adds it to the pipeline. Changes to the pipeline are saved unless one of
     * the following three validation errors exists in the pipeline.
     * </p>
     * <ol>
     * <li>An object is missing a name or identifier field.</li>
     * <li>A string or reference field is empty.</li>
     * <li>The number of objects in the pipeline exceeds the maximum allowed
     * objects.</li>
     * <li>The pipeline is in a FINISHED state.</li>
     * </ol>
     * <p>
     * Pipeline object definitions are passed to the
     * <code>PutPipelineDefinition</code> action and returned by the
     * <a>GetPipelineDefinition</a> action.
     * </p>
     * 
     * @param putPipelineDefinitionRequest
     *        Contains the parameters for PutPipelineDefinition.
     * @return Result of the PutPipelineDefinition operation returned by the
     *         service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.PutPipelineDefinition
     */
    @Override
    public PutPipelineDefinitionResult putPipelineDefinition(
            PutPipelineDefinitionRequest putPipelineDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(putPipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutPipelineDefinitionRequest> request = null;
        Response<PutPipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutPipelineDefinitionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(putPipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutPipelineDefinitionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new PutPipelineDefinitionResultJsonUnmarshaller(),
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
     * Queries the specified pipeline for the names of objects that match the
     * specified set of conditions.
     * </p>
     * 
     * @param queryObjectsRequest
     *        Contains the parameters for QueryObjects.
     * @return Result of the QueryObjects operation returned by the service.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.QueryObjects
     */
    @Override
    public QueryObjectsResult queryObjects(
            QueryObjectsRequest queryObjectsRequest) {
        ExecutionContext executionContext = createExecutionContext(queryObjectsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryObjectsRequest> request = null;
        Response<QueryObjectsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryObjectsRequestMarshaller().marshall(super
                        .beforeMarshalling(queryObjectsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<QueryObjectsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new QueryObjectsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Removes existing tags from the specified pipeline.
     * </p>
     * 
     * @param removeTagsRequest
     *        Contains the parameters for RemoveTags.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.RemoveTags
     */
    @Override
    public RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(removeTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<RemoveTagsRequest> request = null;
        Response<RemoveTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new RemoveTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(removeTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<RemoveTagsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new RemoveTagsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>ReportTaskProgress</code> when assigned a task to
     * acknowledge that it has the task. If the web service does not receive
     * this acknowledgement within 2 minutes, it assigns the task in a
     * subsequent <a>PollForTask</a> call. After this initial acknowledgement,
     * the task runner only needs to report progress every 15 minutes to
     * maintain its ownership of the task. You can change this reporting time
     * from 15 minutes by specifying a <code>reportProgressTimeout</code> field
     * in your pipeline.
     * </p>
     * <p>
     * If a task runner does not report its status after 5 minutes, AWS Data
     * Pipeline assumes that the task runner is unable to process the task and
     * reassigns the task in a subsequent response to <a>PollForTask</a>. Task
     * runners should call <code>ReportTaskProgress</code> every 60 seconds.
     * </p>
     * 
     * @param reportTaskProgressRequest
     *        Contains the parameters for ReportTaskProgress.
     * @return Result of the ReportTaskProgress operation returned by the
     *         service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ReportTaskProgress
     */
    @Override
    public ReportTaskProgressResult reportTaskProgress(
            ReportTaskProgressRequest reportTaskProgressRequest) {
        ExecutionContext executionContext = createExecutionContext(reportTaskProgressRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReportTaskProgressRequest> request = null;
        Response<ReportTaskProgressResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReportTaskProgressRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(reportTaskProgressRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReportTaskProgressResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ReportTaskProgressResultJsonUnmarshaller(),
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
     * Task runners call <code>ReportTaskRunnerHeartbeat</code> every 15 minutes
     * to indicate that they are operational. If the AWS Data Pipeline Task
     * Runner is launched on a resource managed by AWS Data Pipeline, the web
     * service can use this call to detect when the task runner application has
     * failed and restart a new instance.
     * </p>
     * 
     * @param reportTaskRunnerHeartbeatRequest
     *        Contains the parameters for ReportTaskRunnerHeartbeat.
     * @return Result of the ReportTaskRunnerHeartbeat operation returned by the
     *         service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.ReportTaskRunnerHeartbeat
     */
    @Override
    public ReportTaskRunnerHeartbeatResult reportTaskRunnerHeartbeat(
            ReportTaskRunnerHeartbeatRequest reportTaskRunnerHeartbeatRequest) {
        ExecutionContext executionContext = createExecutionContext(reportTaskRunnerHeartbeatRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ReportTaskRunnerHeartbeatRequest> request = null;
        Response<ReportTaskRunnerHeartbeatResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ReportTaskRunnerHeartbeatRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(reportTaskRunnerHeartbeatRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ReportTaskRunnerHeartbeatResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ReportTaskRunnerHeartbeatResultJsonUnmarshaller(),
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
     * Requests that the status of the specified physical or logical pipeline
     * objects be updated in the specified pipeline. This update might not occur
     * immediately, but is eventually consistent. The status that can be set
     * depends on the type of object (for example, DataNode or Activity). You
     * cannot perform this operation on <code>FINISHED</code> pipelines and
     * attempting to do so returns <code>InvalidRequestException</code>.
     * </p>
     * 
     * @param setStatusRequest
     *        Contains the parameters for SetStatus.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @sample DataPipeline.SetStatus
     */
    @Override
    public void setStatus(SetStatusRequest setStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(setStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetStatusRequest> request = null;
        Response<Void> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetStatusRequestMarshaller().marshall(super
                        .beforeMarshalling(setStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<Void> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(null, false);
            responseHandler.setIsPayloadJson(true);
            invoke(request, responseHandler, executionContext);

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Task runners call <code>SetTaskStatus</code> to notify AWS Data Pipeline
     * that a task is completed and provide information about the final status.
     * A task runner makes this call regardless of whether the task was
     * sucessful. A task runner does not need to call <code>SetTaskStatus</code>
     * for tasks that are canceled by the web service during a call to
     * <a>ReportTaskProgress</a>.
     * </p>
     * 
     * @param setTaskStatusRequest
     *        Contains the parameters for SetTaskStatus.
     * @return Result of the SetTaskStatus operation returned by the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws TaskNotFoundException
     *         The specified task was not found.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.SetTaskStatus
     */
    @Override
    public SetTaskStatusResult setTaskStatus(
            SetTaskStatusRequest setTaskStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(setTaskStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<SetTaskStatusRequest> request = null;
        Response<SetTaskStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new SetTaskStatusRequestMarshaller().marshall(super
                        .beforeMarshalling(setTaskStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<SetTaskStatusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new SetTaskStatusResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Validates the specified pipeline definition to ensure that it is well
     * formed and can be run without error.
     * </p>
     * 
     * @param validatePipelineDefinitionRequest
     *        Contains the parameters for ValidatePipelineDefinition.
     * @return Result of the ValidatePipelineDefinition operation returned by
     *         the service.
     * @throws InternalServiceErrorException
     *         An internal service error occurred.
     * @throws InvalidRequestException
     *         The request was not valid. Verify that your request was properly
     *         formatted, that the signature was generated with the correct
     *         credentials, and that you haven't exceeded any of the service
     *         limits for your account.
     * @throws PipelineNotFoundException
     *         The specified pipeline was not found. Verify that you used the
     *         correct user and account identifiers.
     * @throws PipelineDeletedException
     *         The specified pipeline has been deleted.
     * @sample DataPipeline.ValidatePipelineDefinition
     */
    @Override
    public ValidatePipelineDefinitionResult validatePipelineDefinition(
            ValidatePipelineDefinitionRequest validatePipelineDefinitionRequest) {
        ExecutionContext executionContext = createExecutionContext(validatePipelineDefinitionRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ValidatePipelineDefinitionRequest> request = null;
        Response<ValidatePipelineDefinitionResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ValidatePipelineDefinitionRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(validatePipelineDefinitionRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ValidatePipelineDefinitionResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ValidatePipelineDefinitionResultJsonUnmarshaller(),
                            false);
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
