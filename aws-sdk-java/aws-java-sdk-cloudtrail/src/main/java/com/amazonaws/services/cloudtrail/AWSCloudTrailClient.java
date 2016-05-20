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
package com.amazonaws.services.cloudtrail;

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

import com.amazonaws.services.cloudtrail.model.*;
import com.amazonaws.services.cloudtrail.model.transform.*;

/**
 * Client for accessing CloudTrail. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>AWS CloudTrail</fullname>
 * <p>
 * This is the CloudTrail API Reference. It provides descriptions of actions,
 * data types, common parameters, and common errors for CloudTrail.
 * </p>
 * <p>
 * CloudTrail is a web service that records AWS API calls for your AWS account
 * and delivers log files to an Amazon S3 bucket. The recorded information
 * includes the identity of the user, the start time of the AWS API call, the
 * source IP address, the request parameters, and the response elements returned
 * by the service.
 * </p>
 * <note> As an alternative to using the API, you can use one of the AWS SDKs,
 * which consist of libraries and sample code for various programming languages
 * and platforms (Java, Ruby, .NET, iOS, Android, etc.). The SDKs provide a
 * convenient way to create programmatic access to AWSCloudTrail. For example,
 * the SDKs take care of cryptographically signing requests, managing errors,
 * and retrying requests automatically. For information about the AWS SDKs,
 * including how to download and install them, see the <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services page</a>.
 * </note>
 * <p>
 * See the CloudTrail User Guide for information about the data that is included
 * with each AWS API call listed in the log files.
 * </p>
 */
@ThreadSafe
public class AWSCloudTrailClient extends AmazonWebServiceClient implements
        AWSCloudTrail {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AWSCloudTrail.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "cloudtrail";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "cloudtrail";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all CloudTrail exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on CloudTrail. A
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
    public AWSCloudTrailClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail. A
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
     *        connects to CloudTrail (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AWSCloudTrailClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the
     * specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AWSCloudTrailClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the
     * specified AWS account credentials and client configuration options.
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
     *        connects to CloudTrail (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudTrailClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the
     * specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the
     * specified AWS account credentials provider and client configuration
     * options.
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
     *        connects to CloudTrail (ex: proxy settings, retry counts, etc.).
     */
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on CloudTrail using the
     * specified AWS account credentials provider, client configuration options,
     * and request metric collector.
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
     *        connects to CloudTrail (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AWSCloudTrailClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidNextTokenException.class,
                        "InvalidNextTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.KmsKeyNotFoundException.class,
                        "KmsKeyNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.TrailNotFoundException.class,
                        "TrailNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.KmsKeyDisabledException.class,
                        "KmsKeyDisabledException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.TrailAlreadyExistsException.class,
                        "TrailAlreadyExistsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.OperationNotPermittedException.class,
                        "OperationNotPermittedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidS3PrefixException.class,
                        "InvalidS3PrefixException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.CloudTrailARNInvalidException.class,
                        "CloudTrailARNInvalidException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidTimeRangeException.class,
                        "InvalidTimeRangeException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.S3BucketDoesNotExistException.class,
                        "S3BucketDoesNotExistException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.ResourceTypeNotSupportedException.class,
                        "ResourceTypeNotSupportedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.UnsupportedOperationException.class,
                        "UnsupportedOperationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InsufficientEncryptionPolicyException.class,
                        "InsufficientEncryptionPolicyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidLookupAttributesException.class,
                        "InvalidLookupAttributesException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidHomeRegionException.class,
                        "InvalidHomeRegionException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.MaximumNumberOfTrailsExceededException.class,
                        "MaximumNumberOfTrailsExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidMaxResultsException.class,
                        "InvalidMaxResultsException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidCloudWatchLogsRoleArnException.class,
                        "InvalidCloudWatchLogsRoleArnException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InsufficientSnsTopicPolicyException.class,
                        "InsufficientSnsTopicPolicyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidSnsTopicNameException.class,
                        "InvalidSnsTopicNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidCloudWatchLogsLogGroupArnException.class,
                        "InvalidCloudWatchLogsLogGroupArnException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidTokenException.class,
                        "InvalidTokenException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.CloudWatchLogsDeliveryUnavailableException.class,
                        "CloudWatchLogsDeliveryUnavailableException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InsufficientS3BucketPolicyException.class,
                        "InsufficientS3BucketPolicyException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidS3BucketNameException.class,
                        "InvalidS3BucketNameException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.TrailNotProvidedException.class,
                        "TrailNotProvidedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidKmsKeyIdException.class,
                        "InvalidKmsKeyIdException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidTagParameterException.class,
                        "InvalidTagParameterException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.TagsLimitExceededException.class,
                        "TagsLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidParameterCombinationException.class,
                        "InvalidParameterCombinationException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.cloudtrail.model.InvalidTrailNameException.class,
                        "InvalidTrailNameException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("cloudtrail.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/cloudtrail/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/cloudtrail/request.handler2s"));
    }

    /**
     * <p>
     * Adds one or more tags to a trail, up to a limit of 10. Tags must be
     * unique per trail. Overwrites an existing tag's value when a new value is
     * specified for an existing tag key. If you specify a key without a value,
     * the tag will be created with the specified key and a value of null. You
     * can tag a trail that applies to all regions only from the region in which
     * the trail was created (that is, from its home region).
     * </p>
     * 
     * @param addTagsRequest
     *        Specifies the tags to add to a trail.
     * @return Result of the AddTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not
     *         found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an
     *         invalid trail ARN. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *         .
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not
     *         supported by CloudTrail.
     * @throws TagsLimitExceededException
     *         The number of tags per trail has exceeded the permitted amount.
     *         Currently, the limit is 10.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the key or value specified for the
     *         tag does not match the regular expression
     *         <code>^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$</code>.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @sample AWSCloudTrail.AddTags
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
     * Creates a trail that specifies the settings for delivery of log data to
     * an Amazon S3 bucket. A maximum of five trails can exist in a region,
     * irrespective of the region in which they were created.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @return Result of the CreateTrail operation returned by the service.
     * @throws MaximumNumberOfTrailsExceededException
     *         This exception is thrown when the maximum number of trails is
     *         reached.
     * @throws TrailAlreadyExistsException
     *         This exception is thrown when the specified trail already exists.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not
     *         exist.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not
     *         sufficient.
     * @throws InsufficientSnsTopicPolicyException
     *         This exception is thrown when the policy on the SNS topic is not
     *         sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS
     *         key is not sufficient.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not
     *         valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not
     *         valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not
     *         valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is invalid.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws TrailNotProvidedException
     *         This exception is deprecated.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters
     *         provided is not valid.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, or when
     *         the S3 bucket and the KMS key are not in the same region.
     * @throws KmsKeyDisabledException
     *         This exception is thrown when the KMS key is disabled.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch log group
     *         is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this region.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @sample AWSCloudTrail.CreateTrail
     */
    @Override
    public CreateTrailResult createTrail(CreateTrailRequest createTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(createTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTrailRequest> request = null;
        Response<CreateTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTrailRequestMarshaller().marshall(super
                        .beforeMarshalling(createTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateTrailResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateTrailResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Deletes a trail. This operation must be called from the region in which
     * the trail was created. <code>DeleteTrail</code> cannot be called on the
     * shadow trails (replicated trails in other regions) of a trail that is
     * enabled in all regions.
     * </p>
     * 
     * @param deleteTrailRequest
     *        The request that specifies the name of a trail to delete.
     * @return Result of the DeleteTrail operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is
     *         not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail
     *         from a region other than the region in which the trail was
     *         created.
     * @sample AWSCloudTrail.DeleteTrail
     */
    @Override
    public DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTrailRequest> request = null;
        Response<DeleteTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTrailRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTrailResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteTrailResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region for
     * your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @return Result of the DescribeTrails operation returned by the service.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @sample AWSCloudTrail.DescribeTrails
     */
    @Override
    public DescribeTrailsResult describeTrails(
            DescribeTrailsRequest describeTrailsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTrailsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTrailsRequest> request = null;
        Response<DescribeTrailsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTrailsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeTrailsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTrailsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeTrailsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTrailsResult describeTrails() {
        return describeTrails(new DescribeTrailsRequest());
    }

    /**
     * <p>
     * Returns a JSON-formatted list of information about the specified trail.
     * Fields include information on delivery errors, Amazon SNS and Amazon S3
     * errors, and start and stop logging times for each trail. This operation
     * returns trail status from a single region. To return trail status from
     * all regions, you must call the operation on each region.
     * </p>
     * 
     * @param getTrailStatusRequest
     *        The name of a trail about which you want the current status.
     * @return Result of the GetTrailStatus operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is
     *         not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @sample AWSCloudTrail.GetTrailStatus
     */
    @Override
    public GetTrailStatusResult getTrailStatus(
            GetTrailStatusRequest getTrailStatusRequest) {
        ExecutionContext executionContext = createExecutionContext(getTrailStatusRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetTrailStatusRequest> request = null;
        Response<GetTrailStatusResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetTrailStatusRequestMarshaller().marshall(super
                        .beforeMarshalling(getTrailStatusRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetTrailStatusResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetTrailStatusResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns all public keys whose private keys were used to sign the digest
     * files within the specified time range. The public key is needed to
     * validate digest files that were signed with its corresponding private
     * key.
     * </p>
     * <note>CloudTrail uses different private/public key pairs per region. Each
     * digest file is signed with a private key unique to its region. Therefore,
     * when you validate a digest file from a particular region, you must look
     * in the same region for its corresponding public key.</note>
     * 
     * @param listPublicKeysRequest
     *        Requests the public keys for a specified time range.
     * @return Result of the ListPublicKeys operation returned by the service.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are invalid. Either the start time
     *         occurs after the end time or the time range is outside the range
     *         of possible values.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @throws InvalidTokenException
     *         Reserved for future use.
     * @sample AWSCloudTrail.ListPublicKeys
     */
    @Override
    public ListPublicKeysResult listPublicKeys(
            ListPublicKeysRequest listPublicKeysRequest) {
        ExecutionContext executionContext = createExecutionContext(listPublicKeysRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListPublicKeysRequest> request = null;
        Response<ListPublicKeysResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListPublicKeysRequestMarshaller().marshall(super
                        .beforeMarshalling(listPublicKeysRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListPublicKeysResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListPublicKeysResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListPublicKeysResult listPublicKeys() {
        return listPublicKeys(new ListPublicKeysRequest());
    }

    /**
     * <p>
     * Lists the tags for the specified trail or trails in the current region.
     * </p>
     * <p>
     * Lists the tags for the trail in the current region.
     * </p>
     * 
     * @param listTagsRequest
     *        Specifies a list of trail tags to return.
     * @return Result of the ListTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not
     *         found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an
     *         invalid trail ARN. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *         .
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not
     *         supported by CloudTrail.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @throws InvalidTokenException
     *         Reserved for future use.
     * @sample AWSCloudTrail.ListTags
     */
    @Override
    public ListTagsResult listTags(ListTagsRequest listTagsRequest) {
        ExecutionContext executionContext = createExecutionContext(listTagsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTagsRequest> request = null;
        Response<ListTagsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTagsRequestMarshaller().marshall(super
                        .beforeMarshalling(listTagsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTagsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListTagsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Looks up API activity events captured by CloudTrail that create, update,
     * or delete resources in your account. Events for a region can be looked up
     * for the times in which you had CloudTrail turned on in that region during
     * the last seven days. Lookup supports five different attributes: time
     * range (defined by a start time and end time), user name, event name,
     * resource type, and resource name. All attributes are optional. The
     * maximum number of attributes that can be specified in any one lookup
     * request are time range and one other attribute. The default number of
     * results returned is 10, with a maximum of 50 possible. The response
     * includes a token that you can use to get the next page of results.
     * </p>
     * <important>The rate of lookup requests is limited to one per second per
     * account. If this limit is exceeded, a throttling error occurs.
     * </important> <important>Events that occurred during the selected time
     * range will not be available for lookup if CloudTrail logging was not
     * enabled when the events occurred.</important>
     * 
     * @param lookupEventsRequest
     *        Contains a request for LookupEvents.
     * @return Result of the LookupEvents operation returned by the service.
     * @throws InvalidLookupAttributesException
     *         Occurs when an invalid lookup attribute is specified.
     * @throws InvalidTimeRangeException
     *         Occurs if the timestamp values are invalid. Either the start time
     *         occurs after the end time or the time range is outside the range
     *         of possible values.
     * @throws InvalidMaxResultsException
     *         This exception is thrown if the limit specified is invalid.
     * @throws InvalidNextTokenException
     *         Invalid token or token that was previously used in a request with
     *         different parameters. This exception is thrown if the token is
     *         invalid.
     * @sample AWSCloudTrail.LookupEvents
     */
    @Override
    public LookupEventsResult lookupEvents(
            LookupEventsRequest lookupEventsRequest) {
        ExecutionContext executionContext = createExecutionContext(lookupEventsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<LookupEventsRequest> request = null;
        Response<LookupEventsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new LookupEventsRequestMarshaller().marshall(super
                        .beforeMarshalling(lookupEventsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<LookupEventsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new LookupEventsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public LookupEventsResult lookupEvents() {
        return lookupEvents(new LookupEventsRequest());
    }

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail.
     * @return Result of the RemoveTags operation returned by the service.
     * @throws ResourceNotFoundException
     *         This exception is thrown when the specified resource is not
     *         found.
     * @throws CloudTrailARNInvalidException
     *         This exception is thrown when an operation is called with an
     *         invalid trail ARN. The format of a trail ARN is
     *         <code>arn:aws:cloudtrail:us-east-1:123456789012:trail/MyTrail</code>
     *         .
     * @throws ResourceTypeNotSupportedException
     *         This exception is thrown when the specified resource type is not
     *         supported by CloudTrail.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws InvalidTagParameterException
     *         This exception is thrown when the key or value specified for the
     *         tag does not match the regular expression
     *         <code>^([\\p{L}\\p{Z}\\p{N}_.:/=+\\-@]*)$</code>.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @sample AWSCloudTrail.RemoveTags
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
     * Starts the recording of AWS API calls and log file delivery for a trail.
     * For a trail that is enabled in all regions, this operation must be called
     * from the region in which the trail was created. This operation cannot be
     * called on the shadow trails (replicated trails in other regions) of a
     * trail that is enabled in all regions.
     * </p>
     * 
     * @param startLoggingRequest
     *        The request to CloudTrail to start logging AWS API calls for an
     *        account.
     * @return Result of the StartLogging operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is
     *         not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail
     *         from a region other than the region in which the trail was
     *         created.
     * @sample AWSCloudTrail.StartLogging
     */
    @Override
    public StartLoggingResult startLogging(
            StartLoggingRequest startLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(startLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StartLoggingRequest> request = null;
        Response<StartLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StartLoggingRequestMarshaller().marshall(super
                        .beforeMarshalling(startLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StartLoggingResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new StartLoggingResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Suspends the recording of AWS API calls and log file delivery for the
     * specified trail. Under most circumstances, there is no need to use this
     * action. You can update a trail without stopping it first. This action is
     * the only way to stop recording. For a trail enabled in all regions, this
     * operation must be called from the region in which the trail was created,
     * or an <code>InvalidHomeRegionException</code> will occur. This operation
     * cannot be called on the shadow trails (replicated trails in other
     * regions) of a trail enabled in all regions.
     * </p>
     * 
     * @param stopLoggingRequest
     *        Passes the request to CloudTrail to stop logging AWS API calls for
     *        the specified account.
     * @return Result of the StopLogging operation returned by the service.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is
     *         not found.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail
     *         from a region other than the region in which the trail was
     *         created.
     * @sample AWSCloudTrail.StopLogging
     */
    @Override
    public StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest) {
        ExecutionContext executionContext = createExecutionContext(stopLoggingRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<StopLoggingRequest> request = null;
        Response<StopLoggingResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new StopLoggingRequestMarshaller().marshall(super
                        .beforeMarshalling(stopLoggingRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<StopLoggingResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new StopLoggingResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Updates the settings that specify delivery of log files. Changes to a
     * trail do not require stopping the CloudTrail service. Use this action to
     * designate an existing bucket for log delivery. If the existing bucket has
     * previously been a target for CloudTrail log files, an IAM policy exists
     * for the bucket. <code>UpdateTrail</code> must be called from the region
     * in which the trail was created; otherwise, an
     * <code>InvalidHomeRegionException</code> is thrown.
     * </p>
     * 
     * @param updateTrailRequest
     *        Specifies settings to update for the trail.
     * @return Result of the UpdateTrail operation returned by the service.
     * @throws S3BucketDoesNotExistException
     *         This exception is thrown when the specified S3 bucket does not
     *         exist.
     * @throws InsufficientS3BucketPolicyException
     *         This exception is thrown when the policy on the S3 bucket is not
     *         sufficient.
     * @throws InsufficientSnsTopicPolicyException
     *         This exception is thrown when the policy on the SNS topic is not
     *         sufficient.
     * @throws InsufficientEncryptionPolicyException
     *         This exception is thrown when the policy on the S3 bucket or KMS
     *         key is not sufficient.
     * @throws TrailNotFoundException
     *         This exception is thrown when the trail with the given name is
     *         not found.
     * @throws InvalidS3BucketNameException
     *         This exception is thrown when the provided S3 bucket name is not
     *         valid.
     * @throws InvalidS3PrefixException
     *         This exception is thrown when the provided S3 prefix is not
     *         valid.
     * @throws InvalidSnsTopicNameException
     *         This exception is thrown when the provided SNS topic name is not
     *         valid.
     * @throws InvalidKmsKeyIdException
     *         This exception is thrown when the KMS key ARN is invalid.
     * @throws InvalidTrailNameException
     *         This exception is thrown when the provided trail name is not
     *         valid. Trail names must meet the following requirements:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-)</li>
     *         <li>Start with a letter or number, and end with a letter or
     *         number</li>
     *         <li>Be between 3 and 128 characters</li>
     *         <li>Have no adjacent periods, underscores or dashes. Names like
     *         <code>my-_namespace</code> and <code>my--namespace</code> are
     *         invalid.</li>
     *         <li>Not be in IP address format (for example, 192.168.5.4)</li>
     * @throws TrailNotProvidedException
     *         This exception is deprecated.
     * @throws InvalidParameterCombinationException
     *         This exception is thrown when the combination of parameters
     *         provided is not valid.
     * @throws InvalidHomeRegionException
     *         This exception is thrown when an operation is called on a trail
     *         from a region other than the region in which the trail was
     *         created.
     * @throws KmsKeyNotFoundException
     *         This exception is thrown when the KMS key does not exist, or when
     *         the S3 bucket and the KMS key are not in the same region.
     * @throws KmsKeyDisabledException
     *         This exception is thrown when the KMS key is disabled.
     * @throws InvalidCloudWatchLogsLogGroupArnException
     *         This exception is thrown when the provided CloudWatch log group
     *         is not valid.
     * @throws InvalidCloudWatchLogsRoleArnException
     *         This exception is thrown when the provided role is not valid.
     * @throws CloudWatchLogsDeliveryUnavailableException
     *         Cannot set a CloudWatch Logs delivery for this region.
     * @throws UnsupportedOperationException
     *         This exception is thrown when the requested operation is not
     *         supported.
     * @throws OperationNotPermittedException
     *         This exception is thrown when the requested operation is not
     *         permitted.
     * @sample AWSCloudTrail.UpdateTrail
     */
    @Override
    public UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTrailRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTrailRequest> request = null;
        Response<UpdateTrailResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTrailRequestMarshaller().marshall(super
                        .beforeMarshalling(updateTrailRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateTrailResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateTrailResultJsonUnmarshaller(), false);
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
