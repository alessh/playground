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
package com.amazonaws.services.support;

import com.amazonaws.services.support.model.*;

/**
 * Interface for accessing AWS Support asynchronously. Each asynchronous method
 * will return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Support</fullname>
 * <p>
 * The AWS Support API reference is intended for programmers who need detailed
 * information about the AWS Support operations and data types. This service
 * enables you to manage your AWS Support cases programmatically. It uses HTTP
 * methods that return results in JSON format.
 * </p>
 * <p>
 * The AWS Support service also exposes a set of <a
 * href="https://aws.amazon.com/premiumsupport/trustedadvisor/">Trusted
 * Advisor</a> features. You can retrieve a list of checks and their
 * descriptions, get check results, specify checks to refresh, and get the
 * refresh status of checks.
 * </p>
 * <p>
 * The following list describes the AWS Support case management operations:
 * </p>
 * <ul>
 * <li><b>Service names, issue categories, and available severity levels.
 * </b>The <a>DescribeServices</a> and <a>DescribeSeverityLevels</a> operations
 * return AWS service names, service codes, service categories, and problem
 * severity levels. You use these values when you call the <a>CreateCase</a>
 * operation.</li>
 * <li><b>Case creation, case details, and case resolution.</b> The
 * <a>CreateCase</a>, <a>DescribeCases</a>, <a>DescribeAttachment</a>, and
 * <a>ResolveCase</a> operations create AWS Support cases, retrieve information
 * about cases, and resolve cases.</li>
 * <li><b>Case communication.</b> The <a>DescribeCommunications</a>,
 * <a>AddCommunicationToCase</a>, and <a>AddAttachmentsToSet</a> operations
 * retrieve and add communications and attachments to AWS Support cases.</li>
 * </ul>
 * <p>
 * The following list describes the operations available from the AWS Support
 * service for Trusted Advisor:
 * </p>
 * <ul>
 * <li><a>DescribeTrustedAdvisorChecks</a> returns the list of checks that run
 * against your AWS resources.</li>
 * <li>Using the <code>CheckId</code> for a specific check returned by
 * <a>DescribeTrustedAdvisorChecks</a>, you can call
 * <a>DescribeTrustedAdvisorCheckResult</a> to obtain the results for the check
 * you specified.</li>
 * <li><a>DescribeTrustedAdvisorCheckSummaries</a> returns summarized results
 * for one or more Trusted Advisor checks.</li>
 * <li><a>RefreshTrustedAdvisorCheck</a> requests that Trusted Advisor rerun a
 * specified check.</li>
 * <li><a>DescribeTrustedAdvisorCheckRefreshStatuses</a> reports the refresh
 * status of one or more checks.</li>
 * </ul>
 * <p>
 * For authentication of requests, AWS Support uses <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4 Signing Process</a>.
 * </p>
 * <p>
 * See <a
 * href="http://docs.aws.amazon.com/awssupport/latest/user/Welcome.html">About
 * the AWS Support API</a> in the <i>AWS Support User Guide</i> for information
 * about how to use this service to create and manage your support cases, and
 * how to call Trusted Advisor for results of checks on your resources.
 * </p>
 */
public interface AWSSupportAsync extends AWSSupport {

    /**
     * <p>
     * Adds one or more attachments to an attachment set. If an
     * <code>AttachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an
     * <code>AttachmentSetId</code> is specified, the attachments are added to
     * the specified set, if it exists.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that are to be
     * added to a case or case communication. The set is available for one hour
     * after it is created; the <code>ExpiryTime</code> returned in the response
     * indicates when the set expires. The maximum number of attachments in a
     * set is 3, and the maximum size of any attachment in the set is 5 MB.
     * </p>
     * 
     * @param addAttachmentsToSetRequest
     * @return A Java Future containing the result of the AddAttachmentsToSet
     *         operation returned by the service.
     * @sample AWSSupportAsync.AddAttachmentsToSet
     */
    java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(
            AddAttachmentsToSetRequest addAttachmentsToSetRequest);

    /**
     * <p>
     * Adds one or more attachments to an attachment set. If an
     * <code>AttachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an
     * <code>AttachmentSetId</code> is specified, the attachments are added to
     * the specified set, if it exists.
     * </p>
     * <p>
     * An attachment set is a temporary container for attachments that are to be
     * added to a case or case communication. The set is available for one hour
     * after it is created; the <code>ExpiryTime</code> returned in the response
     * indicates when the set expires. The maximum number of attachments in a
     * set is 3, and the maximum size of any attachment in the set is 5 MB.
     * </p>
     * 
     * @param addAttachmentsToSetRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddAttachmentsToSet
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.AddAttachmentsToSet
     */
    java.util.concurrent.Future<AddAttachmentsToSetResult> addAttachmentsToSetAsync(
            AddAttachmentsToSetRequest addAttachmentsToSetRequest,
            com.amazonaws.handlers.AsyncHandler<AddAttachmentsToSetRequest, AddAttachmentsToSetResult> asyncHandler);

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. You use
     * the <code>CaseId</code> value to identify the case to add communication
     * to. You can list a set of email addresses to copy on the communication
     * using the <code>CcEmailAddresses</code> value. The
     * <code>CommunicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <p>
     * The response indicates the success or failure of the request.
     * </p>
     * <p>
     * This operation implements a subset of the features of the AWS Support
     * Center.
     * </p>
     * 
     * @param addCommunicationToCaseRequest
     *        To be written.
     * @return A Java Future containing the result of the AddCommunicationToCase
     *         operation returned by the service.
     * @sample AWSSupportAsync.AddCommunicationToCase
     */
    java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(
            AddCommunicationToCaseRequest addCommunicationToCaseRequest);

    /**
     * <p>
     * Adds additional customer communication to an AWS Support case. You use
     * the <code>CaseId</code> value to identify the case to add communication
     * to. You can list a set of email addresses to copy on the communication
     * using the <code>CcEmailAddresses</code> value. The
     * <code>CommunicationBody</code> value contains the text of the
     * communication.
     * </p>
     * <p>
     * The response indicates the success or failure of the request.
     * </p>
     * <p>
     * This operation implements a subset of the features of the AWS Support
     * Center.
     * </p>
     * 
     * @param addCommunicationToCaseRequest
     *        To be written.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the AddCommunicationToCase
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.AddCommunicationToCase
     */
    java.util.concurrent.Future<AddCommunicationToCaseResult> addCommunicationToCaseAsync(
            AddCommunicationToCaseRequest addCommunicationToCaseRequest,
            com.amazonaws.handlers.AsyncHandler<AddCommunicationToCaseRequest, AddCommunicationToCaseResult> asyncHandler);

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol>
     * <li><b>IssueType.</b> The type of issue for the case. You can specify
     * either "customer-service" or "technical." If you do not indicate a value,
     * the default is "technical."</li>
     * <li><b>ServiceCode.</b> The code for an AWS service. You obtain the
     * <code>ServiceCode</code> by calling <a>DescribeServices</a>.</li>
     * <li><b>CategoryCode.</b> The category for the service defined for the
     * <code>ServiceCode</code> value. You also obtain the category code for a
     * service by calling <a>DescribeServices</a>. Each AWS service defines its
     * own set of category codes.</li>
     * <li><b>SeverityCode.</b> A value that indicates the urgency of the case,
     * which in turn determines the response time according to your service
     * level agreement with AWS Support. You obtain the SeverityCode by calling
     * <a>DescribeSeverityLevels</a>.</li>
     * <li><b>Subject.</b> The <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.</li>
     * <li><b>CommunicationBody.</b> The <b>Description</b> field on the AWS
     * Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.</li>
     * <li><b>AttachmentSetId.</b> The ID of a set of attachments that has been
     * created by using <a>AddAttachmentsToSet</a>.</li>
     * <li><b>Language.</b> The human language in which AWS Support handles the
     * case. English and Japanese are currently supported.</li>
     * <li><b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field on
     * the <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. You can list email addresses to be copied on any
     * correspondence about the case. The account that opens the case is already
     * identified by passing the AWS Credentials in the HTTP POST method or in a
     * method or function call from one of the programming languages supported
     * by an <a href="http://aws.amazon.com/tools/">AWS SDK</a>.</li>
     * </ol>
     * <note>
     * <p>
     * To add additional communication or attachments to an existing case, use
     * <a>AddCommunicationToCase</a>.
     * </p>
     * </note>
     * <p>
     * A successful <a>CreateCase</a> request returns an AWS Support case
     * number. Case numbers are used by the <a>DescribeCases</a> operation to
     * retrieve existing AWS Support cases.
     * </p>
     * 
     * @param createCaseRequest
     * @return A Java Future containing the result of the CreateCase operation
     *         returned by the service.
     * @sample AWSSupportAsync.CreateCase
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(
            CreateCaseRequest createCaseRequest);

    /**
     * <p>
     * Creates a new case in the AWS Support Center. This operation is modeled
     * on the behavior of the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. Its parameters require you to specify the following
     * information:
     * </p>
     * <ol>
     * <li><b>IssueType.</b> The type of issue for the case. You can specify
     * either "customer-service" or "technical." If you do not indicate a value,
     * the default is "technical."</li>
     * <li><b>ServiceCode.</b> The code for an AWS service. You obtain the
     * <code>ServiceCode</code> by calling <a>DescribeServices</a>.</li>
     * <li><b>CategoryCode.</b> The category for the service defined for the
     * <code>ServiceCode</code> value. You also obtain the category code for a
     * service by calling <a>DescribeServices</a>. Each AWS service defines its
     * own set of category codes.</li>
     * <li><b>SeverityCode.</b> A value that indicates the urgency of the case,
     * which in turn determines the response time according to your service
     * level agreement with AWS Support. You obtain the SeverityCode by calling
     * <a>DescribeSeverityLevels</a>.</li>
     * <li><b>Subject.</b> The <b>Subject</b> field on the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.</li>
     * <li><b>CommunicationBody.</b> The <b>Description</b> field on the AWS
     * Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page.</li>
     * <li><b>AttachmentSetId.</b> The ID of a set of attachments that has been
     * created by using <a>AddAttachmentsToSet</a>.</li>
     * <li><b>Language.</b> The human language in which AWS Support handles the
     * case. English and Japanese are currently supported.</li>
     * <li><b>CcEmailAddresses.</b> The AWS Support Center <b>CC</b> field on
     * the <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. You can list email addresses to be copied on any
     * correspondence about the case. The account that opens the case is already
     * identified by passing the AWS Credentials in the HTTP POST method or in a
     * method or function call from one of the programming languages supported
     * by an <a href="http://aws.amazon.com/tools/">AWS SDK</a>.</li>
     * </ol>
     * <note>
     * <p>
     * To add additional communication or attachments to an existing case, use
     * <a>AddCommunicationToCase</a>.
     * </p>
     * </note>
     * <p>
     * A successful <a>CreateCase</a> request returns an AWS Support case
     * number. Case numbers are used by the <a>DescribeCases</a> operation to
     * retrieve existing AWS Support cases.
     * </p>
     * 
     * @param createCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateCase operation
     *         returned by the service.
     * @sample AWSSupportAsyncHandler.CreateCase
     */
    java.util.concurrent.Future<CreateCaseResult> createCaseAsync(
            CreateCaseRequest createCaseRequest,
            com.amazonaws.handlers.AsyncHandler<CreateCaseRequest, CreateCaseResult> asyncHandler);

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachment IDs are
     * generated by the case management system when you add an attachment to a
     * case or case communication. Attachment IDs are returned in the
     * <a>AttachmentDetails</a> objects that are returned by the
     * <a>DescribeCommunications</a> operation.
     * </p>
     * 
     * @param describeAttachmentRequest
     * @return A Java Future containing the result of the DescribeAttachment
     *         operation returned by the service.
     * @sample AWSSupportAsync.DescribeAttachment
     */
    java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(
            DescribeAttachmentRequest describeAttachmentRequest);

    /**
     * <p>
     * Returns the attachment that has the specified ID. Attachment IDs are
     * generated by the case management system when you add an attachment to a
     * case or case communication. Attachment IDs are returned in the
     * <a>AttachmentDetails</a> objects that are returned by the
     * <a>DescribeCommunications</a> operation.
     * </p>
     * 
     * @param describeAttachmentRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAttachment
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeAttachment
     */
    java.util.concurrent.Future<DescribeAttachmentResult> describeAttachmentAsync(
            DescribeAttachmentRequest describeAttachmentRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAttachmentRequest, DescribeAttachmentResult> asyncHandler);

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs.
     * In addition, you can filter the cases by date by setting values for the
     * <code>AfterTime</code> and <code>BeforeTime</code> request parameters.
     * You can set values for the <code>IncludeResolvedCases</code> and
     * <code>IncludeCommunications</code> request parameters to control how much
     * information is returned.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an error.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol>
     * <li>One or more <a>CaseDetails</a> data types.</li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the <code>CaseDetails</code>
     * objects.</li>
     * </ol>
     * 
     * @param describeCasesRequest
     * @return A Java Future containing the result of the DescribeCases
     *         operation returned by the service.
     * @sample AWSSupportAsync.DescribeCases
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            DescribeCasesRequest describeCasesRequest);

    /**
     * <p>
     * Returns a list of cases that you specify by passing one or more case IDs.
     * In addition, you can filter the cases by date by setting values for the
     * <code>AfterTime</code> and <code>BeforeTime</code> request parameters.
     * You can set values for the <code>IncludeResolvedCases</code> and
     * <code>IncludeCommunications</code> request parameters to control how much
     * information is returned.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an error.
     * </p>
     * <p>
     * The response returns the following in JSON format:
     * </p>
     * <ol>
     * <li>One or more <a>CaseDetails</a> data types.</li>
     * <li>One or more <code>NextToken</code> values, which specify where to
     * paginate the returned records represented by the <code>CaseDetails</code>
     * objects.</li>
     * </ol>
     * 
     * @param describeCasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCases
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeCases
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            DescribeCasesRequest describeCasesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeCases operation.
     *
     * @see #describeCasesAsync(DescribeCasesRequest)
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync();

    /**
     * Simplified method form for invoking the DescribeCases operation with an
     * AsyncHandler.
     *
     * @see #describeCasesAsync(DescribeCasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeCasesResult> describeCasesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeCasesRequest, DescribeCasesResult> asyncHandler);

    /**
     * <p>
     * Returns communications (and attachments) for one or more support cases.
     * You can use the <code>AfterTime</code> and <code>BeforeTime</code>
     * parameters to filter by date. You can use the <code>CaseId</code>
     * parameter to restrict the results to a particular case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an error.
     * </p>
     * <p>
     * You can use the <code>MaxResults</code> and <code>NextToken</code>
     * parameters to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on each
     * page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     * 
     * @param describeCommunicationsRequest
     * @return A Java Future containing the result of the DescribeCommunications
     *         operation returned by the service.
     * @sample AWSSupportAsync.DescribeCommunications
     */
    java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(
            DescribeCommunicationsRequest describeCommunicationsRequest);

    /**
     * <p>
     * Returns communications (and attachments) for one or more support cases.
     * You can use the <code>AfterTime</code> and <code>BeforeTime</code>
     * parameters to filter by date. You can use the <code>CaseId</code>
     * parameter to restrict the results to a particular case.
     * </p>
     * <p>
     * Case data is available for 12 months after creation. If a case was
     * created more than 12 months ago, a request for data might cause an error.
     * </p>
     * <p>
     * You can use the <code>MaxResults</code> and <code>NextToken</code>
     * parameters to control the pagination of the result set. Set
     * <code>MaxResults</code> to the number of cases you want displayed on each
     * page, and use <code>NextToken</code> to specify the resumption of
     * pagination.
     * </p>
     * 
     * @param describeCommunicationsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCommunications
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeCommunications
     */
    java.util.concurrent.Future<DescribeCommunicationsResult> describeCommunicationsAsync(
            DescribeCommunicationsRequest describeCommunicationsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCommunicationsRequest, DescribeCommunicationsResult> asyncHandler);

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories
     * that applies to each one. You then use service names and categories in
     * your <a>CreateCase</a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. The values in those fields, however, do not necessarily
     * match the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes and
     * categories obtained programmatically. This practice ensures that you
     * always have the most recent set of service and category codes.
     * </p>
     * 
     * @param describeServicesRequest
     * @return A Java Future containing the result of the DescribeServices
     *         operation returned by the service.
     * @sample AWSSupportAsync.DescribeServices
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            DescribeServicesRequest describeServicesRequest);

    /**
     * <p>
     * Returns the current list of AWS services and a list of service categories
     * that applies to each one. You then use service names and categories in
     * your <a>CreateCase</a> requests. Each AWS service has its own set of
     * categories.
     * </p>
     * <p>
     * The service codes and category codes correspond to the values that are
     * displayed in the <b>Service</b> and <b>Category</b> drop-down lists on
     * the AWS Support Center <a
     * href="https://console.aws.amazon.com/support/home#/case/create">Create
     * Case</a> page. The values in those fields, however, do not necessarily
     * match the service codes and categories returned by the
     * <code>DescribeServices</code> request. Always use the service codes and
     * categories obtained programmatically. This practice ensures that you
     * always have the most recent set of service and category codes.
     * </p>
     * 
     * @param describeServicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeServices
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeServices
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            DescribeServicesRequest describeServicesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeServices operation.
     *
     * @see #describeServicesAsync(DescribeServicesRequest)
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync();

    /**
     * Simplified method form for invoking the DescribeServices operation with
     * an AsyncHandler.
     *
     * @see #describeServicesAsync(DescribeServicesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeServicesResult> describeServicesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeServicesRequest, DescribeServicesResult> asyncHandler);

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS Support
     * case. The severity level for a case is also a field in the
     * <a>CaseDetails</a> data type included in any <a>CreateCase</a> request.
     * </p>
     * 
     * @param describeSeverityLevelsRequest
     * @return A Java Future containing the result of the DescribeSeverityLevels
     *         operation returned by the service.
     * @sample AWSSupportAsync.DescribeSeverityLevels
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            DescribeSeverityLevelsRequest describeSeverityLevelsRequest);

    /**
     * <p>
     * Returns the list of severity levels that you can assign to an AWS Support
     * case. The severity level for a case is also a field in the
     * <a>CaseDetails</a> data type included in any <a>CreateCase</a> request.
     * </p>
     * 
     * @param describeSeverityLevelsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeSeverityLevels
     *         operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeSeverityLevels
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            DescribeSeverityLevelsRequest describeSeverityLevelsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest)
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync();

    /**
     * Simplified method form for invoking the DescribeSeverityLevels operation
     * with an AsyncHandler.
     *
     * @see #describeSeverityLevelsAsync(DescribeSeverityLevelsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeSeverityLevelsResult> describeSeverityLevelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeSeverityLevelsRequest, DescribeSeverityLevelsResult> asyncHandler);

    /**
     * <p>
     * Returns the refresh status of the Trusted Advisor checks that have the
     * specified check IDs. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckRefreshStatuses operation returned by
     *         the service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckRefreshStatuses
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest);

    /**
     * <p>
     * Returns the refresh status of the Trusted Advisor checks that have the
     * specified check IDs. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * 
     * @param describeTrustedAdvisorCheckRefreshStatusesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckRefreshStatuses operation returned by
     *         the service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckRefreshStatuses
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckRefreshStatusesResult> describeTrustedAdvisorCheckRefreshStatusesAsync(
            DescribeTrustedAdvisorCheckRefreshStatusesRequest describeTrustedAdvisorCheckRefreshStatusesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckRefreshStatusesRequest, DescribeTrustedAdvisorCheckRefreshStatusesResult> asyncHandler);

    /**
     * <p>
     * Returns the results of the Trusted Advisor check that has the specified
     * check ID. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which
     * contains these three objects:
     * </p>
     * <ul>
     * <li><a>TrustedAdvisorCategorySpecificSummary</a></li>
     * <li><a>TrustedAdvisorResourceDetail</a></li>
     * <li><a>TrustedAdvisorResourcesSummary</a></li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li><b>Status.</b> The alert status of the check: "ok" (green), "warning"
     * (yellow), "error" (red), or "not_available".</li>
     * <li><b>Timestamp.</b> The time of the last refresh of the check.</li>
     * <li><b>CheckId.</b> The unique identifier for the check.</li>
     * </ul>
     * 
     * @param describeTrustedAdvisorCheckResultRequest
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckResult operation returned by the
     *         service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckResult
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest);

    /**
     * <p>
     * Returns the results of the Trusted Advisor check that has the specified
     * check ID. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckResult</a> object, which
     * contains these three objects:
     * </p>
     * <ul>
     * <li><a>TrustedAdvisorCategorySpecificSummary</a></li>
     * <li><a>TrustedAdvisorResourceDetail</a></li>
     * <li><a>TrustedAdvisorResourcesSummary</a></li>
     * </ul>
     * <p>
     * In addition, the response contains these fields:
     * </p>
     * <ul>
     * <li><b>Status.</b> The alert status of the check: "ok" (green), "warning"
     * (yellow), "error" (red), or "not_available".</li>
     * <li><b>Timestamp.</b> The time of the last refresh of the check.</li>
     * <li><b>CheckId.</b> The unique identifier for the check.</li>
     * </ul>
     * 
     * @param describeTrustedAdvisorCheckResultRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckResult operation returned by the
     *         service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckResult
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckResultResult> describeTrustedAdvisorCheckResultAsync(
            DescribeTrustedAdvisorCheckResultRequest describeTrustedAdvisorCheckResultRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckResultRequest, DescribeTrustedAdvisorCheckResultResult> asyncHandler);

    /**
     * <p>
     * Returns the summaries of the results of the Trusted Advisor checks that
     * have the specified check IDs. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a>
     * objects.
     * </p>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckSummaries operation returned by the
     *         service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorCheckSummaries
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest);

    /**
     * <p>
     * Returns the summaries of the results of the Trusted Advisor checks that
     * have the specified check IDs. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains an array of <a>TrustedAdvisorCheckSummary</a>
     * objects.
     * </p>
     * 
     * @param describeTrustedAdvisorCheckSummariesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorCheckSummaries operation returned by the
     *         service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorCheckSummaries
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorCheckSummariesResult> describeTrustedAdvisorCheckSummariesAsync(
            DescribeTrustedAdvisorCheckSummariesRequest describeTrustedAdvisorCheckSummariesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorCheckSummariesRequest, DescribeTrustedAdvisorCheckSummariesResult> asyncHandler);

    /**
     * <p>
     * Returns information about all available Trusted Advisor checks, including
     * name, ID, category, description, and metadata. You must specify a
     * language code; English ("en") and Japanese ("ja") are currently
     * supported. The response contains a <a>TrustedAdvisorCheckDescription</a>
     * for each check.
     * </p>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorChecks operation returned by the service.
     * @sample AWSSupportAsync.DescribeTrustedAdvisorChecks
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(
            DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest);

    /**
     * <p>
     * Returns information about all available Trusted Advisor checks, including
     * name, ID, category, description, and metadata. You must specify a
     * language code; English ("en") and Japanese ("ja") are currently
     * supported. The response contains a <a>TrustedAdvisorCheckDescription</a>
     * for each check.
     * </p>
     * 
     * @param describeTrustedAdvisorChecksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         DescribeTrustedAdvisorChecks operation returned by the service.
     * @sample AWSSupportAsyncHandler.DescribeTrustedAdvisorChecks
     */
    java.util.concurrent.Future<DescribeTrustedAdvisorChecksResult> describeTrustedAdvisorChecksAsync(
            DescribeTrustedAdvisorChecksRequest describeTrustedAdvisorChecksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeTrustedAdvisorChecksRequest, DescribeTrustedAdvisorChecksResult> asyncHandler);

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the specified
     * check ID. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object,
     * which contains these fields:
     * </p>
     * <ul>
     * <li><b>Status.</b> The refresh status of the check: "none", "enqueued",
     * "processing", "success", or "abandoned".</li>
     * <li><b>MillisUntilNextRefreshable.</b> The amount of time, in
     * milliseconds, until the check is eligible for refresh.</li>
     * <li><b>CheckId.</b> The unique identifier for the check.</li>
     * </ul>
     * 
     * @param refreshTrustedAdvisorCheckRequest
     * @return A Java Future containing the result of the
     *         RefreshTrustedAdvisorCheck operation returned by the service.
     * @sample AWSSupportAsync.RefreshTrustedAdvisorCheck
     */
    java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(
            RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest);

    /**
     * <p>
     * Requests a refresh of the Trusted Advisor check that has the specified
     * check ID. Check IDs can be obtained by calling
     * <a>DescribeTrustedAdvisorChecks</a>.
     * </p>
     * <p>
     * The response contains a <a>TrustedAdvisorCheckRefreshStatus</a> object,
     * which contains these fields:
     * </p>
     * <ul>
     * <li><b>Status.</b> The refresh status of the check: "none", "enqueued",
     * "processing", "success", or "abandoned".</li>
     * <li><b>MillisUntilNextRefreshable.</b> The amount of time, in
     * milliseconds, until the check is eligible for refresh.</li>
     * <li><b>CheckId.</b> The unique identifier for the check.</li>
     * </ul>
     * 
     * @param refreshTrustedAdvisorCheckRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         RefreshTrustedAdvisorCheck operation returned by the service.
     * @sample AWSSupportAsyncHandler.RefreshTrustedAdvisorCheck
     */
    java.util.concurrent.Future<RefreshTrustedAdvisorCheckResult> refreshTrustedAdvisorCheckAsync(
            RefreshTrustedAdvisorCheckRequest refreshTrustedAdvisorCheckRequest,
            com.amazonaws.handlers.AsyncHandler<RefreshTrustedAdvisorCheckRequest, RefreshTrustedAdvisorCheckResult> asyncHandler);

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to <a>ResolveCase</a>
     * completed.
     * </p>
     * 
     * @param resolveCaseRequest
     * @return A Java Future containing the result of the ResolveCase operation
     *         returned by the service.
     * @sample AWSSupportAsync.ResolveCase
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(
            ResolveCaseRequest resolveCaseRequest);

    /**
     * <p>
     * Takes a <code>CaseId</code> and returns the initial state of the case
     * along with the state of the case after the call to <a>ResolveCase</a>
     * completed.
     * </p>
     * 
     * @param resolveCaseRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ResolveCase operation
     *         returned by the service.
     * @sample AWSSupportAsyncHandler.ResolveCase
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(
            ResolveCaseRequest resolveCaseRequest,
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler);

    /**
     * Simplified method form for invoking the ResolveCase operation.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest)
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync();

    /**
     * Simplified method form for invoking the ResolveCase operation with an
     * AsyncHandler.
     *
     * @see #resolveCaseAsync(ResolveCaseRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ResolveCaseResult> resolveCaseAsync(
            com.amazonaws.handlers.AsyncHandler<ResolveCaseRequest, ResolveCaseResult> asyncHandler);

}
