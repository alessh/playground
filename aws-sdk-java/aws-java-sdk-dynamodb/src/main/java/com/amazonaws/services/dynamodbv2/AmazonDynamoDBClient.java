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
 * Client for accessing DynamoDB. All service calls made using this client are
 * blocking, and will not return until the service call completes.
 * <p>
 * <fullname>Amazon DynamoDB</fullname>
 * <p>
 * This is the Amazon DynamoDB API Reference. This guide provides descriptions
 * of the low-level DynamoDB API.
 * </p>
 * <p>
 * This guide is intended for use with the following DynamoDB documentation:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/gettingstartedguide/"
 * >Amazon DynamoDB Getting Started Guide</a> - provides hands-on exercises that
 * help you learn the basics of working with DynamoDB. <i>If you are new to
 * DynamoDB, we recommend that you begin with the Getting Started Guide.</i>
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/">
 * Amazon DynamoDB Developer Guide</a> - contains detailed information about
 * DynamoDB concepts, usage, and best practices.
 * </p>
 * </li>
 * <li>
 * <p>
 * <a href="http://docs.aws.amazon.com/dynamodbstreams/latest/APIReference/">
 * Amazon DynamoDB Streams API Reference</a> - provides descriptions and samples
 * of the DynamoDB Streams API. (For more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Streams.html"
 * >Capturing Table Activity with DynamoDB Streams</a> in the Amazon DynamoDB
 * Developer Guide.)
 * </p>
 * </li>
 * </ul>
 * <p>
 * Instead of making the requests to the low-level DynamoDB API directly from
 * your application, we recommend that you use the AWS Software Development Kits
 * (SDKs). The easy-to-use libraries in the AWS SDKs make it unnecessary to call
 * the low-level DynamoDB API directly from your application. The libraries take
 * care of request authentication, serialization, and connection management. For
 * more information, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/UsingAWSSDK.html"
 * >Using the AWS SDKs with DynamoDB</a> in the Amazon DynamoDB Developer Guide.
 * </p>
 * <p>
 * If you decide to code against the low-level DynamoDB API directly, you will
 * need to write the necessary code to authenticate your requests. For more
 * information on signing your requests, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/API.html"
 * >Using the DynamoDB API</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * The following are short descriptions of each low-level API action, organized
 * by function.
 * </p>
 * <p>
 * <b>Managing Tables</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>CreateTable</i> - Creates a table with user-specified provisioned
 * throughput settings. You must define a primary key for the table - either a
 * simple primary key (partition key), or a composite primary key (partition key
 * and sort key). Optionally, you can create one or more secondary indexes,
 * which provide fast data access using non-key attributes.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DescribeTable</i> - Returns metadata for a table, such as table size,
 * status, and index information.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>UpdateTable</i> - Modifies the provisioned throughput settings for a
 * table. Optionally, you can modify the provisioned throughput settings for
 * global secondary indexes on the table.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>ListTables</i> - Returns a list of all tables associated with the current
 * AWS account and endpoint.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteTable</i> - Deletes a table and all of its indexes.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about managing tables, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html"
 * >Working with Tables</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <b>Reading Data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>GetItem</i> - Returns a set of attributes for the item that has a given
 * primary key. By default, <i>GetItem</i> performs an eventually consistent
 * read; however, applications can request a strongly consistent read instead.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchGetItem</i> - Performs multiple <i>GetItem</i> requests for data
 * items using their primary keys, from one table or multiple tables. The
 * response from <i>BatchGetItem</i> has a size limit of 16 MB and returns a
 * maximum of 100 items. Both eventually consistent and strongly consistent
 * reads can be used.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Query</i> - Returns one or more items from a table or a secondary index.
 * You must provide a specific value for the partition key. You can narrow the
 * scope of the query using comparison operators against a sort key value, or on
 * the index key. <i>Query</i> supports either eventual or strong consistency. A
 * single response has a size limit of 1 MB.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>Scan</i> - Reads every item in a table; the result set is eventually
 * consistent. You can limit the number of items returned by filtering the data
 * attributes, using conditional expressions. <i>Scan</i> can be used to enable
 * ad-hoc querying of a table against non-key attributes; however, since this is
 * a full table scan without using an index, <i>Scan</i> should not be used for
 * any application query use case that requires predictable performance.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about reading data, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
 * >Working with Items</a> and <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
 * >Query and Scan Operations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 * <p>
 * <b>Modifying Data</b>
 * </p>
 * <ul>
 * <li>
 * <p>
 * <i>PutItem</i> - Creates a new item, or replaces an existing item with a new
 * item (including all the attributes). By default, if an item in the table
 * already exists with the same primary key, the new item completely replaces
 * the existing item. You can use conditional operators to replace an item only
 * if its attribute values match certain conditions, or to insert a new item
 * only if that item doesn't already exist.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>UpdateItem</i> - Modifies the attributes of an existing item. You can also
 * use conditional operators to perform an update only if the item's attribute
 * values match certain conditions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>DeleteItem</i> - Deletes an item in a table by primary key. You can use
 * conditional operators to perform a delete an item only if the item's
 * attribute values match certain conditions.
 * </p>
 * </li>
 * <li>
 * <p>
 * <i>BatchWriteItem</i> - Performs multiple <i>PutItem</i> and
 * <i>DeleteItem</i> requests across multiple tables in a single request. A
 * failure of any request(s) in the batch will not cause the entire
 * <i>BatchWriteItem</i> operation to fail. Supports batches of up to 25 items
 * to put or delete, with a maximum total request size of 16 MB.
 * </p>
 * </li>
 * </ul>
 * <p>
 * For conceptual information about modifying data, see <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
 * >Working with Items</a> and <a href=
 * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html"
 * >Query and Scan Operations</a> in the <i>Amazon DynamoDB Developer Guide</i>.
 * </p>
 */
@ThreadSafe
public class AmazonDynamoDBClient extends AmazonWebServiceClient implements
        AmazonDynamoDB {
    // register the service specific set of predefined metrics
    static {
        AwsSdkMetrics
                .addAll(Arrays
                        .asList(com.amazonaws.services.dynamodbv2.metrics.DynamoDBRequestMetric
                                .values()));
    }
    /** Provider for AWS credentials. */
    private AWSCredentialsProvider awsCredentialsProvider;

    private static final Log log = LogFactory.getLog(AmazonDynamoDB.class);

    /** Default signing name for the service. */
    private static final String DEFAULT_SIGNING_NAME = "dynamodb";

    /** The region metadata service name for computing region endpoints. */
    private static final String DEFAULT_ENDPOINT_PREFIX = "dynamodb";

    /**
     * Client configuration factory providing ClientConfigurations tailored to
     * this client
     */
    protected static final com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory configFactory = new com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientConfigurationFactory();

    /**
     * List of exception unmarshallers for all DynamoDB exceptions.
     */
    protected List<JsonErrorUnmarshallerV2> jsonErrorUnmarshallers = new ArrayList<JsonErrorUnmarshallerV2>();

    /**
     * Constructs a new client to invoke service methods on DynamoDB. A
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
    public AmazonDynamoDBClient() {
        this(new DefaultAWSCredentialsProviderChain(), configFactory
                .getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB. A
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
     *        connects to DynamoDB (ex: proxy settings, retry counts, etc.).
     *
     * @see DefaultAWSCredentialsProviderChain
     */
    public AmazonDynamoDBClient(ClientConfiguration clientConfiguration) {
        this(new DefaultAWSCredentialsProviderChain(), clientConfiguration);
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the
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
    public AmazonDynamoDBClient(AWSCredentials awsCredentials) {
        this(awsCredentials, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the
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
     *        connects to DynamoDB (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentials awsCredentials,
            ClientConfiguration clientConfiguration) {
        super(clientConfiguration);
        this.awsCredentialsProvider = new StaticCredentialsProvider(
                awsCredentials);
        init();
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the
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
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider) {
        this(awsCredentialsProvider, configFactory.getConfig());
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the
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
     *        connects to DynamoDB (ex: proxy settings, retry counts, etc.).
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration) {
        this(awsCredentialsProvider, clientConfiguration, null);
    }

    /**
     * Constructs a new client to invoke service methods on DynamoDB using the
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
     *        connects to DynamoDB (ex: proxy settings, retry counts, etc.).
     * @param requestMetricCollector
     *        optional request metric collector
     */
    public AmazonDynamoDBClient(AWSCredentialsProvider awsCredentialsProvider,
            ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        super(clientConfiguration, requestMetricCollector);
        this.awsCredentialsProvider = awsCredentialsProvider;
        init();
    }

    private void init() {
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ResourceInUseException.class,
                        "ResourceInUseException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ItemCollectionSizeLimitExceededException.class,
                        "ItemCollectionSizeLimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.LimitExceededException.class,
                        "LimitExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException.class,
                        "ConditionalCheckFailedException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ProvisionedThroughputExceededException.class,
                        "ProvisionedThroughputExceededException"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.InternalServerErrorException.class,
                        "InternalServerError"));
        jsonErrorUnmarshallers
                .add(new JsonErrorUnmarshallerV2(
                        com.amazonaws.services.dynamodbv2.model.ResourceNotFoundException.class,
                        "ResourceNotFoundException"));
        jsonErrorUnmarshallers
                .add(JsonErrorUnmarshallerV2.DEFAULT_UNMARSHALLER);

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
        // calling this.setEndPoint(...) will also modify the signer accordingly
        setEndpoint("https://dynamodb.us-east-1.amazonaws.com");
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
     * The <i>BatchGetItem</i> operation returns the attributes of one or more
     * items from one or more tables. You identify requested items by primary
     * key.
     * </p>
     * <p>
     * A single operation can retrieve up to 16 MB of data, which can contain as
     * many as 100 items. <i>BatchGetItem</i> will return a partial result if
     * the response size limit is exceeded, the table's provisioned throughput
     * is exceeded, or an internal processing failure occurs. If a partial
     * result is returned, the operation returns a value for
     * <i>UnprocessedKeys</i>. You can use this value to retry the operation
     * starting with the next item to get.
     * </p>
     * <important>
     * <p>
     * If you request more than 100 items <i>BatchGetItem</i> will return a
     * <i>ValidationException</i> with the message
     * "Too many items requested for the BatchGetItem call".
     * </p>
     * </important>
     * <p>
     * For example, if you ask to retrieve 100 items, but each individual item
     * is 300 KB in size, the system returns 52 items (so as not to exceed the
     * 16 MB limit). It also returns an appropriate <i>UnprocessedKeys</i> value
     * so you can get the next page of results. If desired, your application can
     * include its own logic to assemble the pages of results into one data set.
     * </p>
     * <p>
     * If <i>none</i> of the items can be processed due to insufficient
     * provisioned throughput on all of the tables in the request, then
     * <i>BatchGetItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i>. If <i>at least one</i> of
     * the items is successfully processed, then <i>BatchGetItem</i> completes
     * successfully, while returning the keys of the unread items in
     * <i>UnprocessedKeys</i>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * By default, <i>BatchGetItem</i> performs eventually consistent reads on
     * every table in the request. If you want strongly consistent reads
     * instead, you can set <i>ConsistentRead</i> to <code>true</code> for any
     * or all tables.
     * </p>
     * <p>
     * In order to minimize response latency, <i>BatchGetItem</i> retrieves
     * items in parallel.
     * </p>
     * <p>
     * When designing your application, keep in mind that DynamoDB does not
     * return attributes in any particular order. To help parse the response by
     * item, include the primary key values for the items in your request in the
     * <i>AttributesToGet</i> parameter.
     * </p>
     * <p>
     * If a requested item does not exist, it is not returned in the result.
     * Requests for nonexistent items consume the minimum read capacity units
     * according to the type of read. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithTables.html#CapacityUnitCalculations"
     * >Capacity Units Calculations</a> in the <i>Amazon DynamoDB Developer
     * Guide</i>.
     * </p>
     * 
     * @param batchGetItemRequest
     *        Represents the input of a <i>BatchGetItem</i> operation.
     * @return Result of the BatchGetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchGetItem
     */
    @Override
    public BatchGetItemResult batchGetItem(
            BatchGetItemRequest batchGetItemRequest) {
        ExecutionContext executionContext = createExecutionContext(batchGetItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchGetItemRequest> request = null;
        Response<BatchGetItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchGetItemRequestMarshaller().marshall(super
                        .beforeMarshalling(batchGetItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<BatchGetItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new BatchGetItemResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchGetItemResult batchGetItem(
            java.util.Map<String, KeysAndAttributes> requestItems,
            String returnConsumedCapacity) {
        return batchGetItem(new BatchGetItemRequest().withRequestItems(
                requestItems)
                .withReturnConsumedCapacity(returnConsumedCapacity));
    }

    @Override
    public BatchGetItemResult batchGetItem(
            java.util.Map<String, KeysAndAttributes> requestItems) {
        return batchGetItem(new BatchGetItemRequest()
                .withRequestItems(requestItems));
    }

    /**
     * <p>
     * The <i>BatchWriteItem</i> operation puts or deletes multiple items in one
     * or more tables. A single call to <i>BatchWriteItem</i> can write up to 16
     * MB of data, which can comprise as many as 25 put or delete requests.
     * Individual items to be written can be as large as 400 KB.
     * </p>
     * <note>
     * <p>
     * <i>BatchWriteItem</i> cannot update items. To update items, use the
     * <i>UpdateItem</i> API.
     * </p>
     * </note>
     * <p>
     * The individual <i>PutItem</i> and <i>DeleteItem</i> operations specified
     * in <i>BatchWriteItem</i> are atomic; however <i>BatchWriteItem</i> as a
     * whole is not. If any requested operations fail because the table's
     * provisioned throughput is exceeded or an internal processing failure
     * occurs, the failed operations are returned in the <i>UnprocessedItems</i>
     * response parameter. You can investigate and optionally resend the
     * requests. Typically, you would call <i>BatchWriteItem</i> in a loop. Each
     * iteration would check for unprocessed items and submit a new
     * <i>BatchWriteItem</i> request with those unprocessed items until all
     * items have been processed.
     * </p>
     * <p>
     * Note that if <i>none</i> of the items can be processed due to
     * insufficient provisioned throughput on all of the tables in the request,
     * then <i>BatchWriteItem</i> will return a
     * <i>ProvisionedThroughputExceededException</i>.
     * </p>
     * <important>
     * <p>
     * If DynamoDB returns any unprocessed items, you should retry the batch
     * operation on those items. However, <i>we strongly recommend that you use
     * an exponential backoff algorithm</i>. If you retry the batch operation
     * immediately, the underlying read or write requests can still fail due to
     * throttling on the individual tables. If you delay the batch operation
     * using exponential backoff, the individual requests in the batch are much
     * more likely to succeed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#BatchOperations"
     * >Batch Operations and Error Handling</a> in the <i>Amazon DynamoDB
     * Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * With <i>BatchWriteItem</i>, you can efficiently write or delete large
     * amounts of data, such as from Amazon Elastic MapReduce (EMR), or copy
     * data from another database into DynamoDB. In order to improve performance
     * with these large-scale operations, <i>BatchWriteItem</i> does not behave
     * in the same way as individual <i>PutItem</i> and <i>DeleteItem</i> calls
     * would. For example, you cannot specify conditions on individual put and
     * delete requests, and <i>BatchWriteItem</i> does not return deleted items
     * in the response.
     * </p>
     * <p>
     * If you use a programming language that supports concurrency, you can use
     * threads to write items in parallel. Your application must include the
     * necessary logic to manage the threads. With languages that don't support
     * threading, you must update or delete the specified items one at a time.
     * In both situations, <i>BatchWriteItem</i> provides an alternative where
     * the API performs the specified put and delete operations in parallel,
     * giving you the power of the thread pool approach without having to
     * introduce complexity into your application.
     * </p>
     * <p>
     * Parallel processing reduces latency, but each specified put and delete
     * request consumes the same number of write capacity units whether it is
     * processed in parallel or not. Delete operations on nonexistent items
     * consume one write capacity unit.
     * </p>
     * <p>
     * If one or more of the following is true, DynamoDB rejects the entire
     * batch write operation:
     * </p>
     * <ul>
     * <li>
     * <p>
     * One or more tables specified in the <i>BatchWriteItem</i> request does
     * not exist.
     * </p>
     * </li>
     * <li>
     * <p>
     * Primary key attributes specified on an item in the request do not match
     * those in the corresponding table's primary key schema.
     * </p>
     * </li>
     * <li>
     * <p>
     * You try to perform multiple operations on the same item in the same
     * <i>BatchWriteItem</i> request. For example, you cannot put and delete the
     * same item in the same <i>BatchWriteItem</i> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * There are more than 25 requests in the batch.
     * </p>
     * </li>
     * <li>
     * <p>
     * Any individual item in a batch exceeds 400 KB.
     * </p>
     * </li>
     * <li>
     * <p>
     * The total request size exceeds 16 MB.
     * </p>
     * </li>
     * </ul>
     * 
     * @param batchWriteItemRequest
     *        Represents the input of a <i>BatchWriteItem</i> operation.
     * @return Result of the BatchWriteItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned
     *         for tables that have one or more local secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.BatchWriteItem
     */
    @Override
    public BatchWriteItemResult batchWriteItem(
            BatchWriteItemRequest batchWriteItemRequest) {
        ExecutionContext executionContext = createExecutionContext(batchWriteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<BatchWriteItemRequest> request = null;
        Response<BatchWriteItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new BatchWriteItemRequestMarshaller().marshall(super
                        .beforeMarshalling(batchWriteItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<BatchWriteItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new BatchWriteItemResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public BatchWriteItemResult batchWriteItem(
            java.util.Map<String, java.util.List<WriteRequest>> requestItems) {
        return batchWriteItem(new BatchWriteItemRequest()
                .withRequestItems(requestItems));
    }

    /**
     * <p>
     * The <i>CreateTable</i> operation adds a new table to your account. In an
     * AWS account, table names must be unique within each region. That is, you
     * can have two tables with same name if you create the tables in different
     * regions.
     * </p>
     * <p>
     * <i>CreateTable</i> is an asynchronous operation. Upon receiving a
     * <i>CreateTable</i> request, DynamoDB immediately returns a response with
     * a <i>TableStatus</i> of <code>CREATING</code>. After the table is
     * created, DynamoDB sets the <i>TableStatus</i> to <code>ACTIVE</code>. You
     * can perform read and write operations only on an <code>ACTIVE</code>
     * table.
     * </p>
     * <p>
     * You can optionally define secondary indexes on the new table, as part of
     * the <i>CreateTable</i> operation. If you want to create multiple tables
     * with secondary indexes on them, you must create the tables sequentially.
     * Only one table with secondary indexes can be in the <code>CREATING</code>
     * state at any given time.
     * </p>
     * <p>
     * You can use the <i>DescribeTable</i> API to check the table status.
     * </p>
     * 
     * @param createTableRequest
     *        Represents the input of a <i>CreateTable</i> operation.
     * @return Result of the CreateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For
     *         example, you attempted to recreate an existing table, or tried to
     *         delete a table currently in the <code>CREATING</code> state.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of
     *         tables in the <code>CREATING</code>, <code>DELETING</code> or
     *         <code>UPDATING</code> state) exceeds the maximum allowed of
     *         10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables
     *         can be in the <code>CREATING</code> state at any point in time.
     *         Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is
     *         250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.CreateTable
     */
    @Override
    public CreateTableResult createTable(CreateTableRequest createTableRequest) {
        ExecutionContext executionContext = createExecutionContext(createTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<CreateTableRequest> request = null;
        Response<CreateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new CreateTableRequestMarshaller().marshall(super
                        .beforeMarshalling(createTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<CreateTableResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new CreateTableResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public CreateTableResult createTable(
            java.util.List<AttributeDefinition> attributeDefinitions,
            String tableName, java.util.List<KeySchemaElement> keySchema,
            ProvisionedThroughput provisionedThroughput) {
        return createTable(new CreateTableRequest()
                .withAttributeDefinitions(attributeDefinitions)
                .withTableName(tableName).withKeySchema(keySchema)
                .withProvisionedThroughput(provisionedThroughput));
    }

    /**
     * <p>
     * Deletes a single item in a table by primary key. You can perform a
     * conditional delete operation that deletes the item if it exists, or if it
     * has an expected attribute value.
     * </p>
     * <p>
     * In addition to deleting an item, you can also return the item's attribute
     * values in the same operation, using the <i>ReturnValues</i> parameter.
     * </p>
     * <p>
     * Unless you specify conditions, the <i>DeleteItem</i> is an idempotent
     * operation; running it multiple times on the same item or attribute does
     * <i>not</i> result in an error response.
     * </p>
     * <p>
     * Conditional deletes are useful for deleting items only if specific
     * conditions are met. If those conditions are met, DynamoDB performs the
     * delete. Otherwise, the item is not deleted.
     * </p>
     * 
     * @param deleteItemRequest
     *        Represents the input of a <i>DeleteItem</i> operation.
     * @return Result of the DeleteItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned
     *         for tables that have one or more local secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteItem
     */
    @Override
    public DeleteItemResult deleteItem(DeleteItemRequest deleteItemRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteItemRequest> request = null;
        Response<DeleteItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteItemRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteItemResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteItemResult deleteItem(String tableName,
            java.util.Map<String, AttributeValue> key) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName)
                .withKey(key));
    }

    @Override
    public DeleteItemResult deleteItem(String tableName,
            java.util.Map<String, AttributeValue> key, String returnValues) {
        return deleteItem(new DeleteItemRequest().withTableName(tableName)
                .withKey(key).withReturnValues(returnValues));
    }

    /**
     * <p>
     * The <i>DeleteTable</i> operation deletes a table and all of its items.
     * After a <i>DeleteTable</i> request, the specified table is in the
     * <code>DELETING</code> state until DynamoDB completes the deletion. If the
     * table is in the <code>ACTIVE</code> state, you can delete it. If a table
     * is in <code>CREATING</code> or <code>UPDATING</code> states, then
     * DynamoDB returns a <i>ResourceInUseException</i>. If the specified table
     * does not exist, DynamoDB returns a <i>ResourceNotFoundException</i>. If
     * table is already in the <code>DELETING</code> state, no error is
     * returned.
     * </p>
     * <note>
     * <p>
     * DynamoDB might continue to accept data read and write operations, such as
     * <i>GetItem</i> and <i>PutItem</i>, on a table in the
     * <code>DELETING</code> state until the table deletion is complete.
     * </p>
     * </note>
     * <p>
     * When you delete a table, any indexes on that table are also deleted.
     * </p>
     * <p>
     * If you have DynamoDB Streams enabled on the table, then the corresponding
     * stream on that table goes into the <code>DISABLED</code> state, and the
     * stream is automatically deleted after 24 hours.
     * </p>
     * <p>
     * Use the <i>DescribeTable</i> API to check the status of the table.
     * </p>
     * 
     * @param deleteTableRequest
     *        Represents the input of a <i>DeleteTable</i> operation.
     * @return Result of the DeleteTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For
     *         example, you attempted to recreate an existing table, or tried to
     *         delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of
     *         tables in the <code>CREATING</code>, <code>DELETING</code> or
     *         <code>UPDATING</code> state) exceeds the maximum allowed of
     *         10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables
     *         can be in the <code>CREATING</code> state at any point in time.
     *         Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is
     *         250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DeleteTable
     */
    @Override
    public DeleteTableResult deleteTable(DeleteTableRequest deleteTableRequest) {
        ExecutionContext executionContext = createExecutionContext(deleteTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DeleteTableRequest> request = null;
        Response<DeleteTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DeleteTableRequestMarshaller().marshall(super
                        .beforeMarshalling(deleteTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DeleteTableResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DeleteTableResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DeleteTableResult deleteTable(String tableName) {
        return deleteTable(new DeleteTableRequest().withTableName(tableName));
    }

    /**
     * <p>
     * Returns the current provisioned-capacity limits for your AWS account in a
     * region, both for the region as a whole and for any one DynamoDB table
     * that you create there.
     * </p>
     * <p>
     * When you establish an AWS account, the account has initial limits on the
     * maximum read capacity units and write capacity units that you can
     * provision across all of your DynamoDB tables in a given region. Also,
     * there are per-table limits that apply when you create a table there. For
     * more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Limits.html"
     * >Limits</a> page in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * Although you can increase these limits by filing a case at <a
     * href="https://console.aws.amazon.com/support/home#/">AWS Support
     * Center</a>, obtaining the increase is not instantaneous. The
     * <i>DescribeLimits</i> API lets you write code to compare the capacity you
     * are currently using to those limits imposed by your account so that you
     * have enough time to apply for an increase before you hit a limit.
     * </p>
     * <p>
     * For example, you could use one of the AWS SDKs to do the following:
     * </p>
     * <ol>
     * <li>Call <i>DescribeLimits</i> for a particular region to obtain your
     * current account limits on provisioned capacity there.</li>
     * <li>Create a variable to hold the aggregate read capacity units
     * provisioned for all your tables in that region, and one to hold the
     * aggregate write capacity units. Zero them both.</li>
     * <li>Call <i>ListTables</i> to obtain a list of all your DynamoDB tables.</li>
     * <li>
     * <p>
     * For each table name listed by <i>ListTables</i>, do the following:
     * </p>
     * <ul>
     * <li>Call <i>DescribeTable</i> with the table name.</li>
     * <li>Use the data returned by <i>DescribeTable</i> to add the read
     * capacity units and write capacity units provisioned for the table itself
     * to your variables.</li>
     * <li>If the table has one or more global secondary indexes (GSIs), loop
     * over these GSIs and add their provisioned capacity values to your
     * variables as well.</li>
     * </ul>
     * </li>
     * <li>Report the account limits for that region returned by
     * <i>DescribeLimits</i>, along with the total current provisioned capacity
     * levels you have calculated.</li>
     * </ol>
     * <p>
     * This will let you see whether you are getting close to your account-level
     * limits.
     * </p>
     * <p>
     * The per-table limits apply only when you are creating a new table. They
     * restrict the sum of the provisioned capacity of the new table itself and
     * all its global secondary indexes.
     * </p>
     * <p>
     * For existing tables and their GSIs, DynamoDB will not let you increase
     * provisioned capacity extremely rapidly, but the only upper limit that
     * applies is that the aggregate provisioned capacity over all your tables
     * and GSIs cannot exceed either of the per-account limits.
     * </p>
     * <note>
     * <p>
     * <i>DescribeLimits</i> should only be called periodically. You can expect
     * throttling errors if you call it more than once in a minute.
     * </p>
     * </note>
     * <p>
     * The <i>DescribeLimits</i> Request element has no content.
     * </p>
     * 
     * @param describeLimitsRequest
     *        Represents the input of a <i>DescribeLimits</i> operation. Has no
     *        content.
     * @return Result of the DescribeLimits operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeLimits
     */
    @Override
    public DescribeLimitsResult describeLimits(
            DescribeLimitsRequest describeLimitsRequest) {
        ExecutionContext executionContext = createExecutionContext(describeLimitsRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeLimitsRequest> request = null;
        Response<DescribeLimitsResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeLimitsRequestMarshaller().marshall(super
                        .beforeMarshalling(describeLimitsRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeLimitsResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeLimitsResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    /**
     * <p>
     * Returns information about the table, including the current status of the
     * table, when it was created, the primary key schema, and any indexes on
     * the table.
     * </p>
     * <note>
     * <p>
     * If you issue a <i>DescribeTable</i> request immediately after a
     * <i>CreateTable</i> request, DynamoDB might return a
     * <i>ResourceNotFoundException</i>. This is because <i>DescribeTable</i>
     * uses an eventually consistent query, and the metadata for your table
     * might not be available at that moment. Wait for a few seconds, and then
     * try the <i>DescribeTable</i> request again.
     * </p>
     * </note>
     * 
     * @param describeTableRequest
     *        Represents the input of a <i>DescribeTable</i> operation.
     * @return Result of the DescribeTable operation returned by the service.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.DescribeTable
     */
    @Override
    public DescribeTableResult describeTable(
            DescribeTableRequest describeTableRequest) {
        ExecutionContext executionContext = createExecutionContext(describeTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<DescribeTableRequest> request = null;
        Response<DescribeTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new DescribeTableRequestMarshaller().marshall(super
                        .beforeMarshalling(describeTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<DescribeTableResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new DescribeTableResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public DescribeTableResult describeTable(String tableName) {
        return describeTable(new DescribeTableRequest()
                .withTableName(tableName));
    }

    /**
     * <p>
     * The <i>GetItem</i> operation returns a set of attributes for the item
     * with the given primary key. If there is no matching item, <i>GetItem</i>
     * does not return any data.
     * </p>
     * <p>
     * <i>GetItem</i> provides an eventually consistent read by default. If your
     * application requires a strongly consistent read, set
     * <i>ConsistentRead</i> to <code>true</code>. Although a strongly
     * consistent read might take more time than an eventually consistent read,
     * it always returns the last updated value.
     * </p>
     * 
     * @param getItemRequest
     *        Represents the input of a <i>GetItem</i> operation.
     * @return Result of the GetItem operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.GetItem
     */
    @Override
    public GetItemResult getItem(GetItemRequest getItemRequest) {
        ExecutionContext executionContext = createExecutionContext(getItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<GetItemRequest> request = null;
        Response<GetItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new GetItemRequestMarshaller().marshall(super
                        .beforeMarshalling(getItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<GetItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(new GetItemResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public GetItemResult getItem(String tableName,
            java.util.Map<String, AttributeValue> key) {
        return getItem(new GetItemRequest().withTableName(tableName).withKey(
                key));
    }

    @Override
    public GetItemResult getItem(String tableName,
            java.util.Map<String, AttributeValue> key, Boolean consistentRead) {
        return getItem(new GetItemRequest().withTableName(tableName)
                .withKey(key).withConsistentRead(consistentRead));
    }

    /**
     * <p>
     * Returns an array of table names associated with the current account and
     * endpoint. The output from <i>ListTables</i> is paginated, with each page
     * returning a maximum of 100 table names.
     * </p>
     * 
     * @param listTablesRequest
     *        Represents the input of a <i>ListTables</i> operation.
     * @return Result of the ListTables operation returned by the service.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.ListTables
     */
    @Override
    public ListTablesResult listTables(ListTablesRequest listTablesRequest) {
        ExecutionContext executionContext = createExecutionContext(listTablesRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ListTablesRequest> request = null;
        Response<ListTablesResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ListTablesRequestMarshaller().marshall(super
                        .beforeMarshalling(listTablesRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ListTablesResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new ListTablesResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ListTablesResult listTables() {
        return listTables(new ListTablesRequest());
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName) {
        return listTables(new ListTablesRequest()
                .withExclusiveStartTableName(exclusiveStartTableName));
    }

    @Override
    public ListTablesResult listTables(String exclusiveStartTableName,
            Integer limit) {
        return listTables(new ListTablesRequest().withExclusiveStartTableName(
                exclusiveStartTableName).withLimit(limit));
    }

    @Override
    public ListTablesResult listTables(Integer limit) {
        return listTables(new ListTablesRequest().withLimit(limit));
    }

    /**
     * <p>
     * Creates a new item, or replaces an old item with a new item. If an item
     * that has the same primary key as the new item already exists in the
     * specified table, the new item completely replaces the existing item. You
     * can perform a conditional put operation (add a new item if one with the
     * specified primary key doesn't exist), or replace an existing item if it
     * has certain attribute values.
     * </p>
     * <p>
     * In addition to putting an item, you can also return the item's attribute
     * values in the same operation, using the <i>ReturnValues</i> parameter.
     * </p>
     * <p>
     * When you add an item, the primary key attribute(s) are the only required
     * attributes. Attribute values cannot be null. String and Binary type
     * attributes must have lengths greater than zero. Set type attributes
     * cannot be empty. Requests with empty values will be rejected with a
     * <i>ValidationException</i> exception.
     * </p>
     * <p>
     * You can request that <i>PutItem</i> return either a copy of the original
     * item (before the update) or a copy of the updated item (after the
     * update). For more information, see the <i>ReturnValues</i> description
     * below.
     * </p>
     * <note>
     * <p>
     * To prevent a new item from replacing an existing item, use a conditional
     * expression that contains the <code>attribute_not_exists</code> function
     * with the name of the attribute being used as the partition key for the
     * table. Since every record must contain that attribute, the
     * <code>attribute_not_exists</code> function will only succeed if no
     * matching item exists.
     * </p>
     * </note>
     * <p>
     * For more information about using this API, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/WorkingWithItems.html"
     * >Working with Items</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * 
     * @param putItemRequest
     *        Represents the input of a <i>PutItem</i> operation.
     * @return Result of the PutItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned
     *         for tables that have one or more local secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.PutItem
     */
    @Override
    public PutItemResult putItem(PutItemRequest putItemRequest) {
        ExecutionContext executionContext = createExecutionContext(putItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<PutItemRequest> request = null;
        Response<PutItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new PutItemRequestMarshaller().marshall(super
                        .beforeMarshalling(putItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<PutItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(new PutItemResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public PutItemResult putItem(String tableName,
            java.util.Map<String, AttributeValue> item) {
        return putItem(new PutItemRequest().withTableName(tableName).withItem(
                item));
    }

    @Override
    public PutItemResult putItem(String tableName,
            java.util.Map<String, AttributeValue> item, String returnValues) {
        return putItem(new PutItemRequest().withTableName(tableName)
                .withItem(item).withReturnValues(returnValues));
    }

    /**
     * <p>
     * A <i>Query</i> operation uses the primary key of a table or a secondary
     * index to directly access items from that table or index.
     * </p>
     * <p>
     * Use the <i>KeyConditionExpression</i> parameter to provide a specific
     * value for the partition key. The <i>Query</i> operation will return all
     * of the items from the table or index with that partition key value. You
     * can optionally narrow the scope of the <i>Query</i> operation by
     * specifying a sort key value and a comparison operator in
     * <i>KeyConditionExpression</i>. You can use the <i>ScanIndexForward</i>
     * parameter to get results in forward or reverse order, by sort key.
     * </p>
     * <p>
     * Queries that do not return results consume the minimum number of read
     * capacity units for that type of read operation.
     * </p>
     * <p>
     * If the total number of items meeting the query criteria exceeds the
     * result set size limit of 1 MB, the query stops and results are returned
     * to the user with the <i>LastEvaluatedKey</i> element to continue the
     * query in a subsequent operation. Unlike a <i>Scan</i> operation, a
     * <i>Query</i> operation never returns both an empty result set and a
     * <i>LastEvaluatedKey</i> value. <i>LastEvaluatedKey</i> is only provided
     * if the results exceed 1 MB, or if you have used the <i>Limit</i>
     * parameter.
     * </p>
     * <p>
     * You can query a table, a local secondary index, or a global secondary
     * index. For a query on a table or on a local secondary index, you can set
     * the <i>ConsistentRead</i> parameter to <code>true</code> and obtain a
     * strongly consistent result. Global secondary indexes support eventually
     * consistent reads only, so do not specify <i>ConsistentRead</i> when
     * querying a global secondary index.
     * </p>
     * 
     * @param queryRequest
     *        Represents the input of a <i>Query</i> operation.
     * @return Result of the Query operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Query
     */
    @Override
    public QueryResult query(QueryRequest queryRequest) {
        ExecutionContext executionContext = createExecutionContext(queryRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<QueryRequest> request = null;
        Response<QueryResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new QueryRequestMarshaller().marshall(super
                        .beforeMarshalling(queryRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<QueryResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(new QueryResultJsonUnmarshaller(),
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
     * The <i>Scan</i> operation returns one or more items and item attributes
     * by accessing every item in a table or a secondary index. To have DynamoDB
     * return fewer items, you can provide a <i>ScanFilter</i> operation.
     * </p>
     * <p>
     * If the total number of scanned items exceeds the maximum data set size
     * limit of 1 MB, the scan stops and results are returned to the user as a
     * <i>LastEvaluatedKey</i> value to continue the scan in a subsequent
     * operation. The results also include the number of items exceeding the
     * limit. A scan can result in no table data meeting the filter criteria.
     * </p>
     * <p>
     * By default, <i>Scan</i> operations proceed sequentially; however, for
     * faster performance on a large table or secondary index, applications can
     * request a parallel <i>Scan</i> operation by providing the <i>Segment</i>
     * and <i>TotalSegments</i> parameters. For more information, see <a href=
     * "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/QueryAndScan.html#QueryAndScanParallelScan"
     * >Parallel Scan</a> in the <i>Amazon DynamoDB Developer Guide</i>.
     * </p>
     * <p>
     * By default, <i>Scan</i> uses eventually consistent reads when accessing
     * the data in a table; therefore, the result set might not include the
     * changes to data in the table immediately before the operation began. If
     * you need a consistent copy of the data, as of the time that the Scan
     * begins, you can set the <i>ConsistentRead</i> parameter to <i>true</i>.
     * </p>
     * 
     * @param scanRequest
     *        Represents the input of a <i>Scan</i> operation.
     * @return Result of the Scan operation returned by the service.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.Scan
     */
    @Override
    public ScanResult scan(ScanRequest scanRequest) {
        ExecutionContext executionContext = createExecutionContext(scanRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<ScanRequest> request = null;
        Response<ScanResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new ScanRequestMarshaller().marshall(super
                        .beforeMarshalling(scanRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<ScanResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(new ScanResultJsonUnmarshaller(),
                            false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public ScanResult scan(String tableName,
            java.util.List<String> attributesToGet) {
        return scan(new ScanRequest().withTableName(tableName)
                .withAttributesToGet(attributesToGet));
    }

    @Override
    public ScanResult scan(String tableName,
            java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName).withScanFilter(
                scanFilter));
    }

    @Override
    public ScanResult scan(String tableName,
            java.util.List<String> attributesToGet,
            java.util.Map<String, Condition> scanFilter) {
        return scan(new ScanRequest().withTableName(tableName)
                .withAttributesToGet(attributesToGet)
                .withScanFilter(scanFilter));
    }

    /**
     * <p>
     * Edits an existing item's attributes, or adds a new item to the table if
     * it does not already exist. You can put, delete, or add attribute values.
     * You can also perform a conditional update on an existing item (insert a
     * new attribute name-value pair if it doesn't exist, or replace an existing
     * name-value pair if it has certain expected attribute values).
     * </p>
     * <p>
     * You can also return the item's attribute values in the same
     * <i>UpdateItem</i> operation using the <i>ReturnValues</i> parameter.
     * </p>
     * 
     * @param updateItemRequest
     *        Represents the input of an <i>UpdateItem</i> operation.
     * @return Result of the UpdateItem operation returned by the service.
     * @throws ConditionalCheckFailedException
     *         A condition specified in the operation could not be evaluated.
     * @throws ProvisionedThroughputExceededException
     *         Your request rate is too high. The AWS SDKs for DynamoDB
     *         automatically retry requests that receive this exception. Your
     *         request is eventually successful, unless your retry queue is too
     *         large to finish. Reduce the frequency of requests and use
     *         exponential backoff. For more information, go to <a href=
     *         "http://docs.aws.amazon.com/amazondynamodb/latest/developerguide/ErrorHandling.html#APIRetries"
     *         >Error Retries and Exponential Backoff</a> in the <i>Amazon
     *         DynamoDB Developer Guide</i>.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws ItemCollectionSizeLimitExceededException
     *         An item collection is too large. This exception is only returned
     *         for tables that have one or more local secondary indexes.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateItem
     */
    @Override
    public UpdateItemResult updateItem(UpdateItemRequest updateItemRequest) {
        ExecutionContext executionContext = createExecutionContext(updateItemRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateItemRequest> request = null;
        Response<UpdateItemResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateItemRequestMarshaller().marshall(super
                        .beforeMarshalling(updateItemRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateItemResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateItemResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UpdateItemResult updateItem(String tableName,
            java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates) {
        return updateItem(new UpdateItemRequest().withTableName(tableName)
                .withKey(key).withAttributeUpdates(attributeUpdates));
    }

    @Override
    public UpdateItemResult updateItem(String tableName,
            java.util.Map<String, AttributeValue> key,
            java.util.Map<String, AttributeValueUpdate> attributeUpdates,
            String returnValues) {
        return updateItem(new UpdateItemRequest().withTableName(tableName)
                .withKey(key).withAttributeUpdates(attributeUpdates)
                .withReturnValues(returnValues));
    }

    /**
     * <p>
     * Modifies the provisioned throughput settings, global secondary indexes,
     * or DynamoDB Streams settings for a given table.
     * </p>
     * <p>
     * You can only perform one of the following operations at once:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Modify the provisioned throughput settings of the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Enable or disable Streams on the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Remove a global secondary index from the table.
     * </p>
     * </li>
     * <li>
     * <p>
     * Create a new global secondary index on the table. Once the index begins
     * backfilling, you can use <i>UpdateTable</i> to perform other operations.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <i>UpdateTable</i> is an asynchronous operation; while it is executing,
     * the table status changes from <code>ACTIVE</code> to
     * <code>UPDATING</code>. While it is <code>UPDATING</code>, you cannot
     * issue another <i>UpdateTable</i> request. When the table returns to the
     * <code>ACTIVE</code> state, the <i>UpdateTable</i> operation is complete.
     * </p>
     * 
     * @param updateTableRequest
     *        Represents the input of an <i>UpdateTable</i> operation.
     * @return Result of the UpdateTable operation returned by the service.
     * @throws ResourceInUseException
     *         The operation conflicts with the resource's availability. For
     *         example, you attempted to recreate an existing table, or tried to
     *         delete a table currently in the <code>CREATING</code> state.
     * @throws ResourceNotFoundException
     *         The operation tried to access a nonexistent table or index. The
     *         resource might not be specified correctly, or its status might
     *         not be <code>ACTIVE</code>.
     * @throws LimitExceededException
     *         The number of concurrent table requests (cumulative number of
     *         tables in the <code>CREATING</code>, <code>DELETING</code> or
     *         <code>UPDATING</code> state) exceeds the maximum allowed of
     *         10.</p>
     *         <p>
     *         Also, for tables with secondary indexes, only one of those tables
     *         can be in the <code>CREATING</code> state at any point in time.
     *         Do not attempt to create more than one such table simultaneously.
     *         </p>
     *         <p>
     *         The total limit of tables in the <code>ACTIVE</code> state is
     *         250.
     * @throws InternalServerErrorException
     *         An error occurred on the server side.
     * @sample AmazonDynamoDB.UpdateTable
     */
    @Override
    public UpdateTableResult updateTable(UpdateTableRequest updateTableRequest) {
        ExecutionContext executionContext = createExecutionContext(updateTableRequest);
        AWSRequestMetrics awsRequestMetrics = executionContext
                .getAwsRequestMetrics();
        awsRequestMetrics.startEvent(Field.ClientExecuteTime);
        Request<UpdateTableRequest> request = null;
        Response<UpdateTableResult> response = null;

        try {
            awsRequestMetrics.startEvent(Field.RequestMarshallTime);
            try {
                request = new UpdateTableRequestMarshaller().marshall(super
                        .beforeMarshalling(updateTableRequest));
                // Binds the request metrics to the current request.
                request.setAWSRequestMetrics(awsRequestMetrics);
            } finally {
                awsRequestMetrics.endEvent(Field.RequestMarshallTime);
            }

            JsonResponseHandler<UpdateTableResult> responseHandler = SdkJsonProtocolFactory
                    .createResponseHandler(
                            new UpdateTableResultJsonUnmarshaller(), false);
            responseHandler.setIsPayloadJson(true);
            response = invoke(request, responseHandler, executionContext);

            return response.getAwsResponse();

        } finally {

            endClientExecution(awsRequestMetrics, request, response);
        }
    }

    @Override
    public UpdateTableResult updateTable(String tableName,
            ProvisionedThroughput provisionedThroughput) {
        return updateTable(new UpdateTableRequest().withTableName(tableName)
                .withProvisionedThroughput(provisionedThroughput));
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
