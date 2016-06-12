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
package com.amazonaws.services.dynamodbv2;

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

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.services.dynamodbv2.model.transform.*;

/**
 * Client for accessing Amazon DynamoDB Streams. All service calls made using
 * this client are blocking, and will not return until the service call
 * completes.
 * <p>
 * <fullname>Amazon DynamoDB Streams</fullname>
 * <p>
 * This is the Amazon DynamoDB Streams API Reference. This guide describes the
 * low-level API actions for accessing streams and processing stream records.
 * For information about application development with DynamoDB Streams, see the
 * <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide//Streams.html"
 * >Amazon DynamoDB Developer Guide</a>.
 * </p>
 * <p>
 * Note that this document is intended for use with the following DynamoDB
 * documentation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/">
 * Amazon DynamoDB Developer Guide</a>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/APIReference/">
 * Amazon DynamoDB API Reference</a>
 * </p>
 * </li>
 * </ul>
 * <p>
 * The following are short descriptions of each low-level DynamoDB Streams API
 * action, organized by function.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>DescribeStream</i> - Returns detailed information about a particular
 * stream.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>GetRecords</i> - Retrieves the stream records from within a shard.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>GetShardIterator</i> - Returns information on how to retrieve the streams
 * record from a shard with a given shard ID.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListStreams</i> - Returns a list of all the streams associated with the
 * current AWS account and endpoint.
 * </p>
 * </li>
 * </ul>
 */
@ThreadSafe
public class AmazonDynamoDBStreamsClient extends AmazonWebServiceClient
        implements AmazonDynamoDBStreams {
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory
            .getLog(AmazonDynamoDBStreams.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dynamodb";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "streams.dynamodb";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final ClientConfigurationFactory configFactory = new ClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all Amazon DynamoDB Streams
     * exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams. A credentials provider chain will be used that searches for
     * credentials in this order:
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
    public AmazonDynamoDBStreamsClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams. A credentials provider chain will be used that searches for
     * credentials in this order:
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
     *        connects to Amazon DynamoDB Streams (ex: proxy settings, retry
     *        counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDynamoDBStreamsClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams using the specified AWS account credentials.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentials
     *        The AWS credentials (access key ID and secret key) to use when
     *        authenticating with AWS services.
     */
    public AmazonDynamoDBStreamsClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams using the specified AWS account credentials and client
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
     *        connects to Amazon DynamoDB Streams (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonDynamoDBStreamsClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams using the specified AWS account credentials provider.
     *
     * <p>
     * All service calls made using this new client object are blocking, and
     * will not return until the service call completes.
     *
     * @param awsCredentialsProvider
     *        The AWS credentials provider which will provide credentials to
     *        authenticate requests with AWS services.
     */
    public AmazonDynamoDBStreamsClient(
            AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams using the specified AWS account credentials provider and client
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
     *        connects to Amazon DynamoDB Streams (ex: proxy settings, retry
     *        counts, etc.).
     */
    public AmazonDynamoDBStreamsClient(
            AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on Amazon DynamoDB
     * Streams using the specified AWS account credentials provider, client
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
     *        connects to Amazon DynamoDB Streams (ex: proxy settings, retry
     *        counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonDynamoDBStreamsClient(
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
                        com.amazonaws.services.dynamodbv2.model.InternalServerErrorException.class,
                        "InternalServerError"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.TrimmedDataAccessException.class,
                        "TrimmedDataAccessException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ExpiredIteratorException.class,
                        "ExpiredIteratorException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://streams.dynamodb.us-east-1.amazonaws.com");
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandlerChain("/com/amazonaws/services/dynamodbv2/request.handlers"));
        requestHandler2s
                .addAll(chainFactory
                        .newRequestHandler2Chain("/com/amazonaws/services/dynamodbv2/request.handler2s"));
    }

    /**
     * <p>
     * Returns information about a stream, including the current status of the
     * stream, its Amazon Resource Name (ARN), the composition of its shards,
     * and its corresponding DynamoDB table.
     * </p>
     * <note>
     * <p>
     * You can call <i>DescribeStream</i> at a maximum rate of 10 times per
     * second.
     * </p>
     * </note>
     * <p>
     * Each shard in the stream has a <code>SequenceNumberRange</code>
     * associated with it. If the <code>SequenceNumberRange</code> has a
     * <code>StartingSequenceNumber</code> but no
     * <code>EndingSequenceNumber</code>, then the shard is still open (able to
     * receive more stream records). If both <code>StartingSequenceNumber</code>
     * and <code>EndingSequenceNumber</code> are present, the that shared is
     * closed and can no longer receive more data.
     * </p>
     * 
     * @param describeStreamRequest
     *        Represents the input of a <i>DescribeStream</i> operation.
     * @return Result of the DescribeStream operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDBStreams.DescribeStream
     */
    @Override
    public DescribeStreamResult describeStream(
            DescribeStreamRequest describeStreamRequest) {
        ExecutionContext executionContext = createExecutionContext(describeStreamRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeStreamRequest> request = null;
        Response<DescribeStreamResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeStreamRequestMarshaller().marshall(super
                        .beforeMarshalling(describeStreamRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeStreamResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeStreamResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Retrieves the stream records from a given shard.
     * </p>
     * <p>
     * Specify a shard iterator using the <code>ShardIterator</code> parameter.
     * The shard iterator specifies the position in the shard from which you
     * want to start reading stream records sequentially. If there are no stream
     * records available in the portion of the shard that the iterator points
     * to, <code>GetRecords</code> returns an empty list. Note that it might
     * take multiple calls to get to a portion of the shard that contains stream
     * records.
     * </p>
     * <note>
     * <p>
     * <function>GetRecords</function> can retrieve a maximum of 1 MB of data or
     * 2000 stream records, whichever comes first.
     * </p>
     * </note>
     * 
     * @param getRecordsRequest
     *        Represents the input of a <i>GetRecords</i> operation.
     * @return Result of the GetRecords operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws LimitExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws ExpiredIteratorException
     *         The shard iterator has expired and can no longer be used to
     *         retrieve stream records. A shard iterator expires 15 minutes
     *         after it is retrieved using the <i>GetShardIterator</i> action.
     * @throws TrimmedDataAccessException
     *         The operation attempted to read past the oldest stream record in
     *         a shard.</p>
     *         <p>
     *         In DynamoDB Streams, there is a 24 hour limit on data retention.
     *         Stream records whose age exceeds this limit are subject to
     *         removal (trimming) from the stream. You might receive a
     *         TrimmedDataAccessException if:
     *         </p>
     *         <ul>
     *         <li>You request a shard iterator with a sequence number older
     *         than the trim point (24 hours).</li>
     *         <li>You obtain a shard iterator, but before you use the iterator
     *         in a <i>GetRecords</i> request, a stream record in the shard
     *         exceeds the 24 hour period and is trimmed. This causes the
     *         iterator to access a record that no longer exists.</li>
     * @sample AmazonDynamoDBStreams.GetRecords
     */
    @Override
    public GetRecordsResult getRecords(GetRecordsRequest getRecordsRequest) {
        ExecutionContext executionContext = createExecutionContext(getRecordsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetRecordsRequest> request = null;
        Response<GetRecordsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetRecordsRequestMarshaller().marshall(super
                        .beforeMarshalling(getRecordsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetRecordsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetRecordsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns a shard iterator. A shard iterator provides information about how
     * to retrieve the stream records from within a shard. Use the shard
     * iterator in a subsequent <code>GetRecords</code> request to read the
     * stream records from the shard.
     * </p>
     * <note>
     * <p>
     * A shard iterator expires 15 minutes after it is returned to the
     * requester.
     * </p>
     * </note>
     * 
     * @param getShardIteratorRequest
     *        Represents the input of a <i>GetShardIterator</i> operation.
     * @return Result of the GetShardIterator operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @throws TrimmedDataAccessException
     *         The operation attempted to read past the oldest stream record in
     *         a shard.</p>
     *         <p>
     *         In DynamoDB Streams, there is a 24 hour limit on data retention.
     *         Stream records whose age exceeds this limit are subject to
     *         removal (trimming) from the stream. You might receive a
     *         TrimmedDataAccessException if:
     *         </p>
     *         <ul>
     *         <li>You request a shard iterator with a sequence number older
     *         than the trim point (24 hours).</li>
     *         <li>You obtain a shard iterator, but before you use the iterator
     *         in a <i>GetRecords</i> request, a stream record in the shard
     *         exceeds the 24 hour period and is trimmed. This causes the
     *         iterator to access a record that no longer exists.</li>
     * @sample AmazonDynamoDBStreams.GetShardIterator
     */
    @Override
    public GetShardIteratorResult getShardIterator(
            GetShardIteratorRequest getShardIteratorRequest) {
        ExecutionContext executionContext = createExecutionContext(getShardIteratorRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetShardIteratorRequest> request = null;
        Response<GetShardIteratorResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetShardIteratorRequestMarshaller()
                        .marshall(super
                                .beforeMarshalling(getShardIteratorRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetShardIteratorResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new GetShardIteratorResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns an array of stream ARNs associated with the current account and
     * endpoint. If the <code>TableName</code> parameter is present, then
     * <i>ListStreams</i> will return only the streams ARNs for that table.
     * </p>
     * <note>
     * <p>
     * You can call <i>ListStreams</i> at a maximum rate of 5 times per second.
     * </p>
     * </note>
     * 
     * @param listStreamsRequest
     *        Represents the input of a <i>ListStreams</i> operation.
     * @return Result of the ListStreams operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent stream.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDBStreams.ListStreams
     */
    @Override
    public ListStreamsResult listStreams(ListStreamsRequest listStreamsRequest) {
        ExecutionContext executionContext = createExecutionContext(listStreamsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListStreamsRequest> request = null;
        Response<ListStreamsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListStreamsRequestMarshaller().marshall(super
                        .beforeMarshalling(listStreamsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListStreamsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListStreamsResultJsonUnmarshaller(), false);
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
