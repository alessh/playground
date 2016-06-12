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
package com.amazonaws.services.sqs;

import com.amazonaws.services.sqs.model.*;

/**
 * Interface for accessing Amazon SQS asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <p>
 * Welcome to the <i>Amazon Simple Queue Service API Reference</i>. This section
 * describes who should read this guide, how the guide is organized, and other
 * resources related to the Amazon Simple Queue Service (Amazon SQS).
 * </p>
 * <p>
 * Amazon SQS offers reliable and scalable hosted queues for storing messages as
 * they travel between computers. By using Amazon SQS, you can move data between
 * distributed components of your applications that perform different tasks
 * without losing messages or requiring each component to be always available.
 * </p>
 * <p>
 * Helpful Links:
 * <ul>
 * <li><a
 * href="http://queue.amazonaws.com/doc/2012-11-05/QueueService.wsdl">Current
 * WSDL (2012-11-05)</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/MakingRequestsArticle.html"
 * >Making API Requests</a></li>
 * <li><a href="http://aws.amazon.com/sqs/">Amazon SQS product page</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSMessageAttributes.html"
 * >Using Amazon SQS Message Attributes</a></li>
 * <li><a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
 * >Using Amazon SQS Dead Letter Queues</a></li>
 * <li><a
 * href="http://docs.aws.amazon.com/general/latest/gr/rande.html#sqs_region"
 * >Regions and Endpoints</a></li>
 * </ul>
 * </p>
 * <p>
 * We also provide SDKs that enable you to access Amazon SQS from your preferred
 * programming language. The SDKs contain functionality that automatically takes
 * care of tasks such as:
 * </p>
 * <p>
 * <ul>
 * <li>Cryptographically signing your service requests</li>
 * <li>Retrying requests</li>
 * <li>Handling error responses</li>
 * </ul>
 * </p>
 * <p>
 * For a list of available SDKs, go to <a
 * href="http://aws.amazon.com/tools/">Tools for Amazon Web Services</a>.
 * </p>
 */
public interface AmazonSQSAsync extends AmazonSQS {

    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a>. This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions to
     * the queue. For more information about these permissions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon SQS-generated policy. If you
     * want to write your own policy, use <a>SetQueueAttributes</a> to upload
     * your policy. For more information about writing your own policy, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html"
     * >Using The Access Policy Language</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </note> <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param addPermissionRequest
     * @sample AmazonSQSAsync.AddPermission
     */
    java.util.concurrent.Future<Void> addPermissionAsync(
            AddPermissionRequest addPermissionRequest);

    /**
     * <p>
     * Adds a permission to a queue for a specific <a
     * href="http://docs.aws.amazon.com/general/latest/gr/glos-chap.html#P"
     * >principal</a>. This allows for sharing access to the queue.
     * </p>
     * <p>
     * When you create a queue, you have full control access rights for the
     * queue. Only you (as owner of the queue) can grant or deny permissions to
     * the queue. For more information about these permissions, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * <code>AddPermission</code> writes an Amazon SQS-generated policy. If you
     * want to write your own policy, use <a>SetQueueAttributes</a> to upload
     * your policy. For more information about writing your own policy, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AccessPolicyLanguage.html"
     * >Using The Access Policy Language</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * </note> <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param addPermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.AddPermission
     */
    java.util.concurrent.Future<Void> addPermissionAsync(
            AddPermissionRequest addPermissionRequest,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the AddPermission operation.
     *
     * @see #addPermissionAsync(AddPermissionRequest)
     */
    java.util.concurrent.Future<Void> addPermissionAsync(String queueUrl,
            String label, java.util.List<String> aWSAccountIds,
            java.util.List<String> actions);

    /**
     * Simplified method form for invoking the AddPermission operation with an
     * AsyncHandler.
     *
     * @see #addPermissionAsync(AddPermissionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> addPermissionAsync(
            String queueUrl,
            String label,
            java.util.List<String> aWSAccountIds,
            java.util.List<String> actions,
            com.amazonaws.handlers.AsyncHandler<AddPermissionRequest, Void> asyncHandler);

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new
     * value. The maximum allowed timeout value you can set the value to is 12
     * hours. This means you can't extend the timeout of a message in an
     * existing queue to more than a total visibility timeout of 12 hours. (For
     * more information visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 5 minutes. After 3 minutes, you call
     * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that
     * time, the timeout for the message would be extended by 10 minutes beyond
     * the time of the ChangeMessageVisibility call. This results in a total
     * visibility timeout of 13 minutes. You can continue to call
     * ChangeMessageVisibility to extend the visibility timeout to a maximum of
     * 12 hours. If you try to extend beyond 12 hours, the request will be
     * rejected.
     * </p>
     * <note>
     * <p>
     * There is a 120,000 limit for the number of inflight messages per queue.
     * Messages are inflight after they have been received from the queue by a
     * consuming component, but have not yet been deleted from the queue. If you
     * reach the 120,000 limit, you will receive an OverLimit error message from
     * Amazon SQS. To help avoid reaching the limit, you should delete the
     * messages from the queue after they have been processed. You can also
     * increase the number of queues you use to process the messages.
     * </p>
     * </note> <important>If you attempt to set the
     * <code>VisibilityTimeout</code> to an amount more than the maximum time
     * left, Amazon SQS returns an error. It will not automatically recalculate
     * and increase the timeout to the maximum time remaining.</important>
     * <important>Unlike with a queue, when you change the visibility timeout
     * for a specific message, that timeout value is applied immediately but is
     * not saved in memory for that message. If you don't delete a message after
     * it is received, the visibility timeout for the message the next time it
     * is received reverts to the original timeout value, not the value you set
     * with the <code>ChangeMessageVisibility</code> action.</important>
     * 
     * @param changeMessageVisibilityRequest
     * @sample AmazonSQSAsync.ChangeMessageVisibility
     */
    java.util.concurrent.Future<Void> changeMessageVisibilityAsync(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest);

    /**
     * <p>
     * Changes the visibility timeout of a specified message in a queue to a new
     * value. The maximum allowed timeout value you can set the value to is 12
     * hours. This means you can't extend the timeout of a message in an
     * existing queue to more than a total visibility timeout of 12 hours. (For
     * more information visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.)
     * </p>
     * <p>
     * For example, let's say you have a message and its default message
     * visibility timeout is 5 minutes. After 3 minutes, you call
     * <code>ChangeMessageVisiblity</code> with a timeout of 10 minutes. At that
     * time, the timeout for the message would be extended by 10 minutes beyond
     * the time of the ChangeMessageVisibility call. This results in a total
     * visibility timeout of 13 minutes. You can continue to call
     * ChangeMessageVisibility to extend the visibility timeout to a maximum of
     * 12 hours. If you try to extend beyond 12 hours, the request will be
     * rejected.
     * </p>
     * <note>
     * <p>
     * There is a 120,000 limit for the number of inflight messages per queue.
     * Messages are inflight after they have been received from the queue by a
     * consuming component, but have not yet been deleted from the queue. If you
     * reach the 120,000 limit, you will receive an OverLimit error message from
     * Amazon SQS. To help avoid reaching the limit, you should delete the
     * messages from the queue after they have been processed. You can also
     * increase the number of queues you use to process the messages.
     * </p>
     * </note> <important>If you attempt to set the
     * <code>VisibilityTimeout</code> to an amount more than the maximum time
     * left, Amazon SQS returns an error. It will not automatically recalculate
     * and increase the timeout to the maximum time remaining.</important>
     * <important>Unlike with a queue, when you change the visibility timeout
     * for a specific message, that timeout value is applied immediately but is
     * not saved in memory for that message. If you don't delete a message after
     * it is received, the visibility timeout for the message the next time it
     * is received reverts to the original timeout value, not the value you set
     * with the <code>ChangeMessageVisibility</code> action.</important>
     * 
     * @param changeMessageVisibilityRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.ChangeMessageVisibility
     */
    java.util.concurrent.Future<Void> changeMessageVisibilityAsync(
            ChangeMessageVisibilityRequest changeMessageVisibilityRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the ChangeMessageVisibility
     * operation.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest)
     */
    java.util.concurrent.Future<Void> changeMessageVisibilityAsync(
            String queueUrl, String receiptHandle, Integer visibilityTimeout);

    /**
     * Simplified method form for invoking the ChangeMessageVisibility operation
     * with an AsyncHandler.
     *
     * @see #changeMessageVisibilityAsync(ChangeMessageVisibilityRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> changeMessageVisibilityAsync(
            String queueUrl,
            String receiptHandle,
            Integer visibilityTimeout,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityRequest, Void> asyncHandler);

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of <a>ChangeMessageVisibility</a>. The result of the action on
     * each message is reported individually in the response. You can send up to
     * 10 <a>ChangeMessageVisibility</a> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of 200.</important>
     * <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param changeMessageVisibilityBatchRequest
     * @return A Java Future containing the result of the
     *         ChangeMessageVisibilityBatch operation returned by the service.
     * @sample AmazonSQSAsync.ChangeMessageVisibilityBatch
     */
    java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest);

    /**
     * <p>
     * Changes the visibility timeout of multiple messages. This is a batch
     * version of <a>ChangeMessageVisibility</a>. The result of the action on
     * each message is reported individually in the response. You can send up to
     * 10 <a>ChangeMessageVisibility</a> requests with each
     * <code>ChangeMessageVisibilityBatch</code> action.
     * </p>
     * <important>Because the batch request can result in a combination of
     * successful and unsuccessful actions, you should check for batch errors
     * even when the call returns an HTTP status code of 200.</important>
     * <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param changeMessageVisibilityBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ChangeMessageVisibilityBatch operation returned by the service.
     * @sample AmazonSQSAsyncHandler.ChangeMessageVisibilityBatch
     */
    java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            ChangeMessageVisibilityBatchRequest changeMessageVisibilityBatchRequest,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler);

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch
     * operation.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest)
     */
    java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries);

    /**
     * Simplified method form for invoking the ChangeMessageVisibilityBatch
     * operation with an AsyncHandler.
     *
     * @see #changeMessageVisibilityBatchAsync(ChangeMessageVisibilityBatchRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ChangeMessageVisibilityBatchResult> changeMessageVisibilityBatchAsync(
            String queueUrl,
            java.util.List<ChangeMessageVisibilityBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<ChangeMessageVisibilityBatchRequest, ChangeMessageVisibilityBatchResult> asyncHandler);

    /**
     * <p>
     * Creates a new queue, or returns the URL of an existing one. When you
     * request <code>CreateQueue</code>, you provide a name for the queue. To
     * successfully create a new queue, you must provide a name that is unique
     * within the scope of your own queues.
     * </p>
     * <note>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating
     * a queue with the same name.
     * </p>
     * </note>
     * <p>
     * You may pass one or more attributes in the request. If you do not provide
     * a value for any attribute, the queue will have the default value for that
     * attribute. Permitted attributes are the same that can be set using
     * <a>SetQueueAttributes</a>.
     * </p>
     * <note>
     * <p>
     * Use <a>GetQueueUrl</a> to get a queue's URL. <a>GetQueueUrl</a> requires
     * only the <code>QueueName</code> parameter.
     * </p>
     * </note>
     * <p>
     * If you provide the name of an existing queue, along with the exact names
     * and values of all the queue's attributes, <code>CreateQueue</code>
     * returns the queue URL for the existing queue. If the queue name,
     * attribute names, or attribute values do not match an existing queue,
     * <code>CreateQueue</code> returns an error.
     * </p>
     * <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param createQueueRequest
     * @return A Java Future containing the result of the CreateQueue operation
     *         returned by the service.
     * @sample AmazonSQSAsync.CreateQueue
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(
            CreateQueueRequest createQueueRequest);

    /**
     * <p>
     * Creates a new queue, or returns the URL of an existing one. When you
     * request <code>CreateQueue</code>, you provide a name for the queue. To
     * successfully create a new queue, you must provide a name that is unique
     * within the scope of your own queues.
     * </p>
     * <note>
     * <p>
     * If you delete a queue, you must wait at least 60 seconds before creating
     * a queue with the same name.
     * </p>
     * </note>
     * <p>
     * You may pass one or more attributes in the request. If you do not provide
     * a value for any attribute, the queue will have the default value for that
     * attribute. Permitted attributes are the same that can be set using
     * <a>SetQueueAttributes</a>.
     * </p>
     * <note>
     * <p>
     * Use <a>GetQueueUrl</a> to get a queue's URL. <a>GetQueueUrl</a> requires
     * only the <code>QueueName</code> parameter.
     * </p>
     * </note>
     * <p>
     * If you provide the name of an existing queue, along with the exact names
     * and values of all the queue's attributes, <code>CreateQueue</code>
     * returns the queue URL for the existing queue. If the queue name,
     * attribute names, or attribute values do not match an existing queue,
     * <code>CreateQueue</code> returns an error.
     * </p>
     * <note>Some API actions take lists of parameters. These lists are
     * specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param createQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateQueue operation
     *         returned by the service.
     * @sample AmazonSQSAsyncHandler.CreateQueue
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(
            CreateQueueRequest createQueueRequest,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateQueue operation.
     *
     * @see #createQueueAsync(CreateQueueRequest)
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(
            String queueName);

    /**
     * Simplified method form for invoking the CreateQueue operation with an
     * AsyncHandler.
     *
     * @see #createQueueAsync(CreateQueueRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateQueueResult> createQueueAsync(
            String queueName,
            com.amazonaws.handlers.AsyncHandler<CreateQueueRequest, CreateQueueResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify the
     * message by using the message's <code>receipt handle</code> and not the
     * <code>message ID</code> you received when you sent the message. Even if
     * the message is locked by another reader due to the visibility timeout
     * setting, it is still deleted from the queue. If you leave a message in
     * the queue for longer than the queue's configured retention period, Amazon
     * SQS automatically deletes it.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving
     * the message. If you receive a message more than once, the receipt handle
     * you get each time you receive the message is different. When you request
     * <code>DeleteMessage</code>, if you don't provide the most recently
     * received receipt handle for the message, the request will still succeed,
     * but the message might not be deleted.
     * </p>
     * </note> <important>
     * <p>
     * It is possible you will receive a message even after you have deleted it.
     * This might happen on rare occasions if one of the servers storing a copy
     * of the message is unavailable when you request to delete the message. The
     * copy remains on the server and might be returned to you again on a
     * subsequent receive request. You should create your system to be
     * idempotent so that receiving a particular message more than once is not a
     * problem.
     * </p>
     * </important>
     * 
     * @param deleteMessageRequest
     * @sample AmazonSQSAsync.DeleteMessage
     */
    java.util.concurrent.Future<Void> deleteMessageAsync(
            DeleteMessageRequest deleteMessageRequest);

    /**
     * <p>
     * Deletes the specified message from the specified queue. You specify the
     * message by using the message's <code>receipt handle</code> and not the
     * <code>message ID</code> you received when you sent the message. Even if
     * the message is locked by another reader due to the visibility timeout
     * setting, it is still deleted from the queue. If you leave a message in
     * the queue for longer than the queue's configured retention period, Amazon
     * SQS automatically deletes it.
     * </p>
     * <note>
     * <p>
     * The receipt handle is associated with a specific instance of receiving
     * the message. If you receive a message more than once, the receipt handle
     * you get each time you receive the message is different. When you request
     * <code>DeleteMessage</code>, if you don't provide the most recently
     * received receipt handle for the message, the request will still succeed,
     * but the message might not be deleted.
     * </p>
     * </note> <important>
     * <p>
     * It is possible you will receive a message even after you have deleted it.
     * This might happen on rare occasions if one of the servers storing a copy
     * of the message is unavailable when you request to delete the message. The
     * copy remains on the server and might be returned to you again on a
     * subsequent receive request. You should create your system to be
     * idempotent so that receiving a particular message more than once is not a
     * problem.
     * </p>
     * </important>
     * 
     * @param deleteMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.DeleteMessage
     */
    java.util.concurrent.Future<Void> deleteMessageAsync(
            DeleteMessageRequest deleteMessageRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteMessage operation.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest)
     */
    java.util.concurrent.Future<Void> deleteMessageAsync(String queueUrl,
            String receiptHandle);

    /**
     * Simplified method form for invoking the DeleteMessage operation with an
     * AsyncHandler.
     *
     * @see #deleteMessageAsync(DeleteMessageRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> deleteMessageAsync(
            String queueUrl,
            String receiptHandle,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of <a>DeleteMessage</a>. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>Some API actions take lists of parameters. These lists
     * are specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param deleteMessageBatchRequest
     * @return A Java Future containing the result of the DeleteMessageBatch
     *         operation returned by the service.
     * @sample AmazonSQSAsync.DeleteMessageBatch
     */
    java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            DeleteMessageBatchRequest deleteMessageBatchRequest);

    /**
     * <p>
     * Deletes up to ten messages from the specified queue. This is a batch
     * version of <a>DeleteMessage</a>. The result of the delete action on each
     * message is reported individually in the response.
     * </p>
     * <important>
     * <p>
     * Because the batch request can result in a combination of successful and
     * unsuccessful actions, you should check for batch errors even when the
     * call returns an HTTP status code of 200.
     * </p>
     * </important> <note>Some API actions take lists of parameters. These lists
     * are specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param deleteMessageBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteMessageBatch
     *         operation returned by the service.
     * @sample AmazonSQSAsyncHandler.DeleteMessageBatch
     */
    java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            DeleteMessageBatchRequest deleteMessageBatchRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest)
     */
    java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries);

    /**
     * Simplified method form for invoking the DeleteMessageBatch operation with
     * an AsyncHandler.
     *
     * @see #deleteMessageBatchAsync(DeleteMessageBatchRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DeleteMessageBatchResult> deleteMessageBatchAsync(
            String queueUrl,
            java.util.List<DeleteMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<DeleteMessageBatchRequest, DeleteMessageBatchResult> asyncHandler);

    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b>, regardless of
     * whether the queue is empty. If the specified queue does not exist, Amazon
     * SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteQueue</code> with care; once you delete your queue, any
     * messages in the queue are no longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a <a>SendMessage</a> request might succeed, but
     * after the 60 seconds, the queue and that message you sent no longer
     * exist. Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for more
     * than 30 days. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"
     * >How Amazon SQS Queues Work</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param deleteQueueRequest
     * @sample AmazonSQSAsync.DeleteQueue
     */
    java.util.concurrent.Future<Void> deleteQueueAsync(
            DeleteQueueRequest deleteQueueRequest);

    /**
     * <p>
     * Deletes the queue specified by the <b>queue URL</b>, regardless of
     * whether the queue is empty. If the specified queue does not exist, Amazon
     * SQS returns a successful response.
     * </p>
     * <important>
     * <p>
     * Use <code>DeleteQueue</code> with care; once you delete your queue, any
     * messages in the queue are no longer available.
     * </p>
     * </important>
     * <p>
     * When you delete a queue, the deletion process takes up to 60 seconds.
     * Requests you send involving that queue during the 60 seconds might
     * succeed. For example, a <a>SendMessage</a> request might succeed, but
     * after the 60 seconds, the queue and that message you sent no longer
     * exist. Also, when you delete a queue, you must wait at least 60 seconds
     * before creating a queue with the same name.
     * </p>
     * <p>
     * We reserve the right to delete queues that have had no activity for more
     * than 30 days. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSConcepts.html"
     * >How Amazon SQS Queues Work</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param deleteQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.DeleteQueue
     */
    java.util.concurrent.Future<Void> deleteQueueAsync(
            DeleteQueueRequest deleteQueueRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteQueue operation.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest)
     */
    java.util.concurrent.Future<Void> deleteQueueAsync(String queueUrl);

    /**
     * Simplified method form for invoking the DeleteQueue operation with an
     * AsyncHandler.
     *
     * @see #deleteQueueAsync(DeleteQueueRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> deleteQueueAsync(
            String queueUrl,
            com.amazonaws.handlers.AsyncHandler<DeleteQueueRequest, Void> asyncHandler);

    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li><code>All</code> - returns all values.</li>
     * <li><code>ApproximateNumberOfMessages</code> - returns the approximate
     * number of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.</li>
     * <li><code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.</li>
     * <li><code>VisibilityTimeout</code> - returns the visibility timeout for
     * the queue. For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>CreatedTimestamp</code> - returns the time when the queue was
     * created (epoch time in seconds).</li>
     * <li><code>LastModifiedTimestamp</code> - returns the time when the queue
     * was last changed (epoch time in seconds).</li>
     * <li><code>Policy</code> - returns the queue's policy.</li>
     * <li><code>MaximumMessageSize</code> - returns the limit of how many bytes
     * a message can contain before Amazon SQS rejects it.</li>
     * <li><code>MessageRetentionPeriod</code> - returns the number of seconds
     * Amazon SQS retains a message.</li>
     * <li><code>QueueArn</code> - returns the queue's Amazon resource name
     * (ARN).</li>
     * <li><code>ApproximateNumberOfMessagesDelayed</code> - returns the
     * approximate number of messages that are pending to be added to the queue.
     * </li>
     * <li><code>DelaySeconds</code> - returns the default delay on the queue in
     * seconds.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - returns the time for
     * which a ReceiveMessage call will wait for a message to arrive.</li>
     * <li><code>RedrivePolicy</code> - returns the parameters for dead letter
     * queue functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.</li>
     * </ul>
     * </p>
     * <note>Going forward, new attributes might be added. If you are writing
     * code that calls this action, we recommend that you structure your code so
     * that it can handle new attributes gracefully.</note> <note>Some API
     * actions take lists of parameters. These lists are specified using the
     * <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param getQueueAttributesRequest
     * @return A Java Future containing the result of the GetQueueAttributes
     *         operation returned by the service.
     * @sample AmazonSQSAsync.GetQueueAttributes
     */
    java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(
            GetQueueAttributesRequest getQueueAttributesRequest);

    /**
     * <p>
     * Gets attributes for the specified queue. The following attributes are
     * supported:
     * <ul>
     * <li><code>All</code> - returns all values.</li>
     * <li><code>ApproximateNumberOfMessages</code> - returns the approximate
     * number of visible messages in a queue. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.</li>
     * <li><code>ApproximateNumberOfMessagesNotVisible</code> - returns the
     * approximate number of messages that are not timed-out and not deleted.
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ApproximateNumber.html"
     * >Resources Required to Process Messages</a> in the <i>Amazon SQS
     * Developer Guide</i>.</li>
     * <li><code>VisibilityTimeout</code> - returns the visibility timeout for
     * the queue. For more information about visibility timeout, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.</li>
     * <li><code>CreatedTimestamp</code> - returns the time when the queue was
     * created (epoch time in seconds).</li>
     * <li><code>LastModifiedTimestamp</code> - returns the time when the queue
     * was last changed (epoch time in seconds).</li>
     * <li><code>Policy</code> - returns the queue's policy.</li>
     * <li><code>MaximumMessageSize</code> - returns the limit of how many bytes
     * a message can contain before Amazon SQS rejects it.</li>
     * <li><code>MessageRetentionPeriod</code> - returns the number of seconds
     * Amazon SQS retains a message.</li>
     * <li><code>QueueArn</code> - returns the queue's Amazon resource name
     * (ARN).</li>
     * <li><code>ApproximateNumberOfMessagesDelayed</code> - returns the
     * approximate number of messages that are pending to be added to the queue.
     * </li>
     * <li><code>DelaySeconds</code> - returns the default delay on the queue in
     * seconds.</li>
     * <li><code>ReceiveMessageWaitTimeSeconds</code> - returns the time for
     * which a ReceiveMessage call will wait for a message to arrive.</li>
     * <li><code>RedrivePolicy</code> - returns the parameters for dead letter
     * queue functionality of the source queue. For more information about
     * RedrivePolicy and dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a> in the <i>Amazon SQS Developer
     * Guide</i>.</li>
     * </ul>
     * </p>
     * <note>Going forward, new attributes might be added. If you are writing
     * code that calls this action, we recommend that you structure your code so
     * that it can handle new attributes gracefully.</note> <note>Some API
     * actions take lists of parameters. These lists are specified using the
     * <code>param.n</code> notation. Values of <code>n</code> are integers
     * starting from 1. For example, a parameter list with two elements looks
     * like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param getQueueAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueueAttributes
     *         operation returned by the service.
     * @sample AmazonSQSAsyncHandler.GetQueueAttributes
     */
    java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(
            GetQueueAttributesRequest getQueueAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetQueueAttributes operation.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest)
     */
    java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(
            String queueUrl, java.util.List<String> attributeNames);

    /**
     * Simplified method form for invoking the GetQueueAttributes operation with
     * an AsyncHandler.
     *
     * @see #getQueueAttributesAsync(GetQueueAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetQueueAttributesResult> getQueueAttributesAsync(
            String queueUrl,
            java.util.List<String> attributeNames,
            com.amazonaws.handlers.AsyncHandler<GetQueueAttributesRequest, GetQueueAttributesResult> asyncHandler);

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple way
     * to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account ID
     * of the queue's owner. The queue's owner must grant you permission to
     * access the queue. For more information about shared queue access, see
     * <a>AddPermission</a> or go to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest
     * @return A Java Future containing the result of the GetQueueUrl operation
     *         returned by the service.
     * @sample AmazonSQSAsync.GetQueueUrl
     */
    java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(
            GetQueueUrlRequest getQueueUrlRequest);

    /**
     * <p>
     * Returns the URL of an existing queue. This action provides a simple way
     * to retrieve the URL of an Amazon SQS queue.
     * </p>
     * <p>
     * To access a queue that belongs to another AWS account, use the
     * <code>QueueOwnerAWSAccountId</code> parameter to specify the account ID
     * of the queue's owner. The queue's owner must grant you permission to
     * access the queue. For more information about shared queue access, see
     * <a>AddPermission</a> or go to <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/acp-overview.html"
     * >Shared Queues</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * 
     * @param getQueueUrlRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetQueueUrl operation
     *         returned by the service.
     * @sample AmazonSQSAsyncHandler.GetQueueUrl
     */
    java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(
            GetQueueUrlRequest getQueueUrlRequest,
            com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetQueueUrl operation.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest)
     */
    java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(
            String queueName);

    /**
     * Simplified method form for invoking the GetQueueUrl operation with an
     * AsyncHandler.
     *
     * @see #getQueueUrlAsync(GetQueueUrlRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetQueueUrlResult> getQueueUrlAsync(
            String queueName,
            com.amazonaws.handlers.AsyncHandler<GetQueueUrlRequest, GetQueueUrlResult> asyncHandler);

    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue attribute
     * configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest
     * @return A Java Future containing the result of the
     *         ListDeadLetterSourceQueues operation returned by the service.
     * @sample AmazonSQSAsync.ListDeadLetterSourceQueues
     */
    java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest);

    /**
     * <p>
     * Returns a list of your queues that have the RedrivePolicy queue attribute
     * configured with a dead letter queue.
     * </p>
     * <p>
     * For more information about using dead letter queues, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html"
     * >Using Amazon SQS Dead Letter Queues</a>.
     * </p>
     * 
     * @param listDeadLetterSourceQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListDeadLetterSourceQueues operation returned by the service.
     * @sample AmazonSQSAsyncHandler.ListDeadLetterSourceQueues
     */
    java.util.concurrent.Future<ListDeadLetterSourceQueuesResult> listDeadLetterSourceQueuesAsync(
            ListDeadLetterSourceQueuesRequest listDeadLetterSourceQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListDeadLetterSourceQueuesRequest, ListDeadLetterSourceQueuesResult> asyncHandler);

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param listQueuesRequest
     * @return A Java Future containing the result of the ListQueues operation
     *         returned by the service.
     * @sample AmazonSQSAsync.ListQueues
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(
            ListQueuesRequest listQueuesRequest);

    /**
     * <p>
     * Returns a list of your queues. The maximum number of queues that can be
     * returned is 1000. If you specify a value for the optional
     * <code>QueueNamePrefix</code> parameter, only queues with a name beginning
     * with the specified value are returned.
     * </p>
     * 
     * @param listQueuesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListQueues operation
     *         returned by the service.
     * @sample AmazonSQSAsyncHandler.ListQueues
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(
            ListQueuesRequest listQueuesRequest,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync();

    /**
     * Simplified method form for invoking the ListQueues operation with an
     * AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListQueues operation.
     *
     * @see #listQueuesAsync(ListQueuesRequest)
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(
            String queueNamePrefix);

    /**
     * Simplified method form for invoking the ListQueues operation with an
     * AsyncHandler.
     *
     * @see #listQueuesAsync(ListQueuesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListQueuesResult> listQueuesAsync(
            String queueNamePrefix,
            com.amazonaws.handlers.AsyncHandler<ListQueuesRequest, ListQueuesResult> asyncHandler);

    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b>.
     * </p>
     * <important>When you use the <code>PurgeQueue</code> API, the deleted
     * messages in the queue cannot be retrieved.</important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue while
     * it is being purged may be deleted. While the queue is being purged,
     * messages sent to the queue before <code>PurgeQueue</code> was called may
     * be received, but will be deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest
     * @sample AmazonSQSAsync.PurgeQueue
     */
    java.util.concurrent.Future<Void> purgeQueueAsync(
            PurgeQueueRequest purgeQueueRequest);

    /**
     * <p>
     * Deletes the messages in a queue specified by the <b>queue URL</b>.
     * </p>
     * <important>When you use the <code>PurgeQueue</code> API, the deleted
     * messages in the queue cannot be retrieved.</important>
     * <p>
     * When you purge a queue, the message deletion process takes up to 60
     * seconds. All messages sent to the queue before calling
     * <code>PurgeQueue</code> will be deleted; messages sent to the queue while
     * it is being purged may be deleted. While the queue is being purged,
     * messages sent to the queue before <code>PurgeQueue</code> was called may
     * be received, but will be deleted within the next minute.
     * </p>
     * 
     * @param purgeQueueRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.PurgeQueue
     */
    java.util.concurrent.Future<Void> purgeQueueAsync(
            PurgeQueueRequest purgeQueueRequest,
            com.amazonaws.handlers.AsyncHandler<PurgeQueueRequest, Void> asyncHandler);

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages, from
     * the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
     * >Amazon SQS Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (less than 1000), it is likely you will
     * get fewer messages than you requested per <code>ReceiveMessage</code>
     * call. If the number of messages in the queue is extremely small, you
     * might not receive any messages in a particular
     * <code>ReceiveMessage</code> response; in which case you should repeat the
     * request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Message body
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message body. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html"
     * >http://www.faqs.org/rfcs/rfc1321.html</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the
     * message. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns in
     * the response. If you do not include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest
     * @return A Java Future containing the result of the ReceiveMessage
     *         operation returned by the service.
     * @sample AmazonSQSAsync.ReceiveMessage
     */
    java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(
            ReceiveMessageRequest receiveMessageRequest);

    /**
     * <p>
     * Retrieves one or more messages, with a maximum limit of 10 messages, from
     * the specified queue. Long poll support is enabled by using the
     * <code>WaitTimeSeconds</code> parameter. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-long-polling.html"
     * >Amazon SQS Long Poll</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <p>
     * Short poll is the default behavior where a weighted random set of
     * machines is sampled on a <code>ReceiveMessage</code> call. This means
     * only the messages on the sampled machines are returned. If the number of
     * messages in the queue is small (less than 1000), it is likely you will
     * get fewer messages than you requested per <code>ReceiveMessage</code>
     * call. If the number of messages in the queue is extremely small, you
     * might not receive any messages in a particular
     * <code>ReceiveMessage</code> response; in which case you should repeat the
     * request.
     * </p>
     * <p>
     * For each message returned, the response includes the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Message body
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message body. For information about MD5, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html"
     * >http://www.faqs.org/rfcs/rfc1321.html</a>.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message ID you received when you sent the message to the queue.
     * </p>
     * </li>
     * <li>
     * <p>
     * Receipt handle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Message attributes.
     * </p>
     * </li>
     * <li>
     * <p>
     * MD5 digest of the message attributes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * The receipt handle is the identifier you must provide when deleting the
     * message. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/ImportantIdentifiers.html"
     * >Queue and Message Identifiers</a> in the <i>Amazon SQS Developer
     * Guide</i>.
     * </p>
     * <p>
     * You can provide the <code>VisibilityTimeout</code> parameter in your
     * request, which will be applied to the messages that Amazon SQS returns in
     * the response. If you do not include the parameter, the overall visibility
     * timeout for the queue is used for the returned messages. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html"
     * >Visibility Timeout</a> in the <i>Amazon SQS Developer Guide</i>.
     * </p>
     * <note>
     * <p>
     * Going forward, new attributes might be added. If you are writing code
     * that calls this action, we recommend that you structure your code so that
     * it can handle new attributes gracefully.
     * </p>
     * </note>
     * 
     * @param receiveMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ReceiveMessage
     *         operation returned by the service.
     * @sample AmazonSQSAsyncHandler.ReceiveMessage
     */
    java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(
            ReceiveMessageRequest receiveMessageRequest,
            com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler);

    /**
     * Simplified method form for invoking the ReceiveMessage operation.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest)
     */
    java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(
            String queueUrl);

    /**
     * Simplified method form for invoking the ReceiveMessage operation with an
     * AsyncHandler.
     *
     * @see #receiveMessageAsync(ReceiveMessageRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ReceiveMessageResult> receiveMessageAsync(
            String queueUrl,
            com.amazonaws.handlers.AsyncHandler<ReceiveMessageRequest, ReceiveMessageResult> asyncHandler);

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param removePermissionRequest
     * @sample AmazonSQSAsync.RemovePermission
     */
    java.util.concurrent.Future<Void> removePermissionAsync(
            RemovePermissionRequest removePermissionRequest);

    /**
     * <p>
     * Revokes any permissions in the queue policy that matches the specified
     * <code>Label</code> parameter. Only the owner of the queue can remove
     * permissions.
     * </p>
     * 
     * @param removePermissionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.RemovePermission
     */
    java.util.concurrent.Future<Void> removePermissionAsync(
            RemovePermissionRequest removePermissionRequest,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the RemovePermission operation.
     *
     * @see #removePermissionAsync(RemovePermissionRequest)
     */
    java.util.concurrent.Future<Void> removePermissionAsync(String queueUrl,
            String label);

    /**
     * Simplified method form for invoking the RemovePermission operation with
     * an AsyncHandler.
     *
     * @see #removePermissionAsync(RemovePermissionRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> removePermissionAsync(
            String queueUrl,
            String label,
            com.amazonaws.handlers.AsyncHandler<RemovePermissionRequest, Void> asyncHandler);

    /**
     * <p>
     * Delivers a message to the specified queue. With Amazon SQS, you now have
     * the ability to send large payload messages that are up to 256KB (262,144
     * bytes) in size. To send large payloads, you must use an AWS SDK that
     * supports SigV4 signing. To verify whether SigV4 is supported for an AWS
     * SDK, check the SDK release notes.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) allowed in your
     * message, according to the W3C XML specification. For more information, go
     * to <a
     * href="http://www.w3.org/TR/REC-xml/#charsets">http://www.w3.org/TR/REC
     * -xml/#charsets</a> If you send any characters not included in the list,
     * your request will be rejected.
     * </p>
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to
     * #x10FFFF]
     * </p>
     * </important>
     * 
     * @param sendMessageRequest
     * @return A Java Future containing the result of the SendMessage operation
     *         returned by the service.
     * @sample AmazonSQSAsync.SendMessage
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(
            SendMessageRequest sendMessageRequest);

    /**
     * <p>
     * Delivers a message to the specified queue. With Amazon SQS, you now have
     * the ability to send large payload messages that are up to 256KB (262,144
     * bytes) in size. To send large payloads, you must use an AWS SDK that
     * supports SigV4 signing. To verify whether SigV4 is supported for an AWS
     * SDK, check the SDK release notes.
     * </p>
     * <important>
     * <p>
     * The following list shows the characters (in Unicode) allowed in your
     * message, according to the W3C XML specification. For more information, go
     * to <a
     * href="http://www.w3.org/TR/REC-xml/#charsets">http://www.w3.org/TR/REC
     * -xml/#charsets</a> If you send any characters not included in the list,
     * your request will be rejected.
     * </p>
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to
     * #x10FFFF]
     * </p>
     * </important>
     * 
     * @param sendMessageRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMessage operation
     *         returned by the service.
     * @sample AmazonSQSAsyncHandler.SendMessage
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(
            SendMessageRequest sendMessageRequest,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler);

    /**
     * Simplified method form for invoking the SendMessage operation.
     *
     * @see #sendMessageAsync(SendMessageRequest)
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(
            String queueUrl, String messageBody);

    /**
     * Simplified method form for invoking the SendMessage operation with an
     * AsyncHandler.
     *
     * @see #sendMessageAsync(SendMessageRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SendMessageResult> sendMessageAsync(
            String queueUrl,
            String messageBody,
            com.amazonaws.handlers.AsyncHandler<SendMessageRequest, SendMessageResult> asyncHandler);

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of <a>SendMessage</a>. The result of the send action on each
     * message is reported individually in the response. The maximum allowed
     * individual message size is 256 KB (262,144 bytes).
     * </p>
     * <p>
     * The maximum total payload size (i.e., the sum of all a batch's individual
     * message lengths) is also 256 KB (262,144 bytes).
     * </p>
     * <p>
     * If the <code>DelaySeconds</code> parameter is not specified for an entry,
     * the default for the queue is used.
     * </p>
     * <important>The following list shows the characters (in Unicode) that are
     * allowed in your message, according to the W3C XML specification. For more
     * information, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://
     * www.faqs.org/rfcs/rfc1321.html</a>. If you send any characters that are
     * not included in the list, your request will be rejected.
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to
     * #x10FFFF]
     * </p>
     * </important> <important> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check for
     * batch errors even when the call returns an HTTP status code of 200.
     * </important> <note>Some API actions take lists of parameters. These lists
     * are specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param sendMessageBatchRequest
     * @return A Java Future containing the result of the SendMessageBatch
     *         operation returned by the service.
     * @sample AmazonSQSAsync.SendMessageBatch
     */
    java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(
            SendMessageBatchRequest sendMessageBatchRequest);

    /**
     * <p>
     * Delivers up to ten messages to the specified queue. This is a batch
     * version of <a>SendMessage</a>. The result of the send action on each
     * message is reported individually in the response. The maximum allowed
     * individual message size is 256 KB (262,144 bytes).
     * </p>
     * <p>
     * The maximum total payload size (i.e., the sum of all a batch's individual
     * message lengths) is also 256 KB (262,144 bytes).
     * </p>
     * <p>
     * If the <code>DelaySeconds</code> parameter is not specified for an entry,
     * the default for the queue is used.
     * </p>
     * <important>The following list shows the characters (in Unicode) that are
     * allowed in your message, according to the W3C XML specification. For more
     * information, go to <a
     * href="http://www.faqs.org/rfcs/rfc1321.html">http://
     * www.faqs.org/rfcs/rfc1321.html</a>. If you send any characters that are
     * not included in the list, your request will be rejected.
     * <p>
     * #x9 | #xA | #xD | [#x20 to #xD7FF] | [#xE000 to #xFFFD] | [#x10000 to
     * #x10FFFF]
     * </p>
     * </important> <important> Because the batch request can result in a
     * combination of successful and unsuccessful actions, you should check for
     * batch errors even when the call returns an HTTP status code of 200.
     * </important> <note>Some API actions take lists of parameters. These lists
     * are specified using the <code>param.n</code> notation. Values of
     * <code>n</code> are integers starting from 1. For example, a parameter
     * list with two elements looks like this: </note>
     * <p>
     * <code><![CDATA[&amp;Attribute.1=this]]></code>
     * </p>
     * <p>
     * <code><![CDATA[&amp;Attribute.2=that]]></code>
     * </p>
     * 
     * @param sendMessageBatchRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SendMessageBatch
     *         operation returned by the service.
     * @sample AmazonSQSAsyncHandler.SendMessageBatch
     */
    java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(
            SendMessageBatchRequest sendMessageBatchRequest,
            com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler);

    /**
     * Simplified method form for invoking the SendMessageBatch operation.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest)
     */
    java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(
            String queueUrl,
            java.util.List<SendMessageBatchRequestEntry> entries);

    /**
     * Simplified method form for invoking the SendMessageBatch operation with
     * an AsyncHandler.
     *
     * @see #sendMessageBatchAsync(SendMessageBatchRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<SendMessageBatchResult> sendMessageBatchAsync(
            String queueUrl,
            java.util.List<SendMessageBatchRequestEntry> entries,
            com.amazonaws.handlers.AsyncHandler<SendMessageBatchRequest, SendMessageBatchResult> asyncHandler);

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a queue's
     * attributes, the change can take up to 60 seconds for most of the
     * attributes to propagate throughout the SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>Going forward, new attributes might be added. If you are writing
     * code that calls this action, we recommend that you structure your code so
     * that it can handle new attributes gracefully.</note>
     * 
     * @param setQueueAttributesRequest
     * @sample AmazonSQSAsync.SetQueueAttributes
     */
    java.util.concurrent.Future<Void> setQueueAttributesAsync(
            SetQueueAttributesRequest setQueueAttributesRequest);

    /**
     * <p>
     * Sets the value of one or more queue attributes. When you change a queue's
     * attributes, the change can take up to 60 seconds for most of the
     * attributes to propagate throughout the SQS system. Changes made to the
     * <code>MessageRetentionPeriod</code> attribute can take up to 15 minutes.
     * </p>
     * <note>Going forward, new attributes might be added. If you are writing
     * code that calls this action, we recommend that you structure your code so
     * that it can handle new attributes gracefully.</note>
     * 
     * @param setQueueAttributesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSQSAsyncHandler.SetQueueAttributes
     */
    java.util.concurrent.Future<Void> setQueueAttributesAsync(
            SetQueueAttributesRequest setQueueAttributesRequest,
            com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the SetQueueAttributes operation.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest)
     */
    java.util.concurrent.Future<Void> setQueueAttributesAsync(String queueUrl,
            java.util.Map<String, String> attributes);

    /**
     * Simplified method form for invoking the SetQueueAttributes operation with
     * an AsyncHandler.
     *
     * @see #setQueueAttributesAsync(SetQueueAttributesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> setQueueAttributesAsync(
            String queueUrl,
            java.util.Map<String, String> attributes,
            com.amazonaws.handlers.AsyncHandler<SetQueueAttributesRequest, Void> asyncHandler);

}
