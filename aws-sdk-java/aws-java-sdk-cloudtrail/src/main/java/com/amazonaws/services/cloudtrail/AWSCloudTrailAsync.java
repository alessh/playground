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

import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing CloudTrail asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public interface AWSCloudTrailAsync extends AWSCloudTrail {

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
     * @return A Java Future containing the result of the AddTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(
            AddTagsRequest addTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.AddTags
     */
    java.util.concurrent.Future<AddTagsResult> addTagsAsync(
            AddTagsRequest addTagsRequest,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to
     * an Amazon S3 bucket. A maximum of five trails can exist in a region,
     * irrespective of the region in which they were created.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @return A Java Future containing the result of the CreateTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.CreateTrail
     */
    java.util.concurrent.Future<CreateTrailResult> createTrailAsync(
            CreateTrailRequest createTrailRequest);

    /**
     * <p>
     * Creates a trail that specifies the settings for delivery of log data to
     * an Amazon S3 bucket. A maximum of five trails can exist in a region,
     * irrespective of the region in which they were created.
     * </p>
     * 
     * @param createTrailRequest
     *        Specifies the settings for each trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.CreateTrail
     */
    java.util.concurrent.Future<CreateTrailResult> createTrailAsync(
            CreateTrailRequest createTrailRequest,
            com.amazonaws.handlers.AsyncHandler<CreateTrailRequest, CreateTrailResult> asyncHandler);

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
     * @return A Java Future containing the result of the DeleteTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.DeleteTrail
     */
    java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(
            DeleteTrailRequest deleteTrailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DeleteTrail
     */
    java.util.concurrent.Future<DeleteTrailResult> deleteTrailAsync(
            DeleteTrailRequest deleteTrailRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteTrailRequest, DeleteTrailResult> asyncHandler);

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region for
     * your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @return A Java Future containing the result of the DescribeTrails
     *         operation returned by the service.
     * @sample AWSCloudTrailAsync.DescribeTrails
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            DescribeTrailsRequest describeTrailsRequest);

    /**
     * <p>
     * Retrieves settings for the trail associated with the current region for
     * your account.
     * </p>
     * 
     * @param describeTrailsRequest
     *        Returns information about the trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeTrails
     *         operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.DescribeTrails
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            DescribeTrailsRequest describeTrailsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest)
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync();

    /**
     * Simplified method form for invoking the DescribeTrails operation with an
     * AsyncHandler.
     *
     * @see #describeTrailsAsync(DescribeTrailsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeTrailsResult> describeTrailsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeTrailsRequest, DescribeTrailsResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetTrailStatus
     *         operation returned by the service.
     * @sample AWSCloudTrailAsync.GetTrailStatus
     */
    java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(
            GetTrailStatusRequest getTrailStatusRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTrailStatus
     *         operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.GetTrailStatus
     */
    java.util.concurrent.Future<GetTrailStatusResult> getTrailStatusAsync(
            GetTrailStatusRequest getTrailStatusRequest,
            com.amazonaws.handlers.AsyncHandler<GetTrailStatusRequest, GetTrailStatusResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListPublicKeys
     *         operation returned by the service.
     * @sample AWSCloudTrailAsync.ListPublicKeys
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            ListPublicKeysRequest listPublicKeysRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPublicKeys
     *         operation returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListPublicKeys
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            ListPublicKeysRequest listPublicKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest)
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync();

    /**
     * Simplified method form for invoking the ListPublicKeys operation with an
     * AsyncHandler.
     *
     * @see #listPublicKeysAsync(ListPublicKeysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPublicKeysResult> listPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListPublicKeysRequest, ListPublicKeysResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(
            ListTagsRequest listTagsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.ListTags
     */
    java.util.concurrent.Future<ListTagsResult> listTagsAsync(
            ListTagsRequest listTagsRequest,
            com.amazonaws.handlers.AsyncHandler<ListTagsRequest, ListTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the LookupEvents operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.LookupEvents
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(
            LookupEventsRequest lookupEventsRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the LookupEvents operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.LookupEvents
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(
            LookupEventsRequest lookupEventsRequest,
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler);

    /**
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEventsAsync(LookupEventsRequest)
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync();

    /**
     * Simplified method form for invoking the LookupEvents operation with an
     * AsyncHandler.
     *
     * @see #lookupEventsAsync(LookupEventsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<LookupEventsResult> lookupEventsAsync(
            com.amazonaws.handlers.AsyncHandler<LookupEventsRequest, LookupEventsResult> asyncHandler);

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail.
     * @return A Java Future containing the result of the RemoveTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(
            RemoveTagsRequest removeTagsRequest);

    /**
     * <p>
     * Removes the specified tags from a trail.
     * </p>
     * 
     * @param removeTagsRequest
     *        Specifies the tags to remove from a trail.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RemoveTags operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.RemoveTags
     */
    java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(
            RemoveTagsRequest removeTagsRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler);

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
     * @return A Java Future containing the result of the StartLogging operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.StartLogging
     */
    java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(
            StartLoggingRequest startLoggingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartLogging operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StartLogging
     */
    java.util.concurrent.Future<StartLoggingResult> startLoggingAsync(
            StartLoggingRequest startLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StartLoggingRequest, StartLoggingResult> asyncHandler);

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
     * @return A Java Future containing the result of the StopLogging operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.StopLogging
     */
    java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(
            StopLoggingRequest stopLoggingRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StopLogging operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.StopLogging
     */
    java.util.concurrent.Future<StopLoggingResult> stopLoggingAsync(
            StopLoggingRequest stopLoggingRequest,
            com.amazonaws.handlers.AsyncHandler<StopLoggingRequest, StopLoggingResult> asyncHandler);

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
     * @return A Java Future containing the result of the UpdateTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsync.UpdateTrail
     */
    java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(
            UpdateTrailRequest updateTrailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateTrail operation
     *         returned by the service.
     * @sample AWSCloudTrailAsyncHandler.UpdateTrail
     */
    java.util.concurrent.Future<UpdateTrailResult> updateTrailAsync(
            UpdateTrailRequest updateTrailRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateTrailRequest, UpdateTrailResult> asyncHandler);

}
