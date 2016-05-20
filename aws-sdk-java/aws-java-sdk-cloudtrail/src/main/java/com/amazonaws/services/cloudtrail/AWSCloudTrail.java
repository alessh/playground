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

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.cloudtrail.model.*;

/**
 * Interface for accessing CloudTrail.
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
public interface AWSCloudTrail {

    /**
     * Overrides the default endpoint for this client
     * ("cloudtrail.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "cloudtrail.us-east-1.amazonaws.com") or a full URL, including the
     * protocol (ex: "cloudtrail.us-east-1.amazonaws.com"). If the protocol is
     * not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "cloudtrail.us-east-1.amazonaws.com") or a full
     *        URL, including the protocol (ex:
     *        "cloudtrail.us-east-1.amazonaws.com") of the region specific AWS
     *        endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCloudTrail#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

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
    AddTagsResult addTags(AddTagsRequest addTagsRequest);

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
    CreateTrailResult createTrail(CreateTrailRequest createTrailRequest);

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
    DeleteTrailResult deleteTrail(DeleteTrailRequest deleteTrailRequest);

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
    DescribeTrailsResult describeTrails(
            DescribeTrailsRequest describeTrailsRequest);

    /**
     * Simplified method form for invoking the DescribeTrails operation.
     *
     * @see #describeTrails(DescribeTrailsRequest)
     */
    DescribeTrailsResult describeTrails();

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
    GetTrailStatusResult getTrailStatus(
            GetTrailStatusRequest getTrailStatusRequest);

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
    ListPublicKeysResult listPublicKeys(
            ListPublicKeysRequest listPublicKeysRequest);

    /**
     * Simplified method form for invoking the ListPublicKeys operation.
     *
     * @see #listPublicKeys(ListPublicKeysRequest)
     */
    ListPublicKeysResult listPublicKeys();

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
    ListTagsResult listTags(ListTagsRequest listTagsRequest);

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
    LookupEventsResult lookupEvents(LookupEventsRequest lookupEventsRequest);

    /**
     * Simplified method form for invoking the LookupEvents operation.
     *
     * @see #lookupEvents(LookupEventsRequest)
     */
    LookupEventsResult lookupEvents();

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
    RemoveTagsResult removeTags(RemoveTagsRequest removeTagsRequest);

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
    StartLoggingResult startLogging(StartLoggingRequest startLoggingRequest);

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
    StopLoggingResult stopLogging(StopLoggingRequest stopLoggingRequest);

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
    UpdateTrailResult updateTrail(UpdateTrailRequest updateTrailRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
