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
package com.amazonaws.services.cloudformation;

import com.amazonaws.services.cloudformation.model.*;

/**
 * Interface for accessing AWS CloudFormation asynchronously. Each asynchronous
 * method will return a Java Future object representing the asynchronous
 * operation; overloads which accept an {@code AsyncHandler} can be used to
 * receive notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS CloudFormation</fullname>
 * <p>
 * AWS CloudFormation enables you to create and manage AWS infrastructure
 * deployments predictably and repeatedly. AWS CloudFormation helps you leverage
 * AWS products such as Amazon EC2, EBS, Amazon SNS, ELB, and Auto Scaling to
 * build highly-reliable, highly scalable, cost effective applications without
 * worrying about creating and configuring the underlying AWS infrastructure.
 * </p>
 * <p>
 * With AWS CloudFormation, you declare all of your resources and dependencies
 * in a template file. The template defines a collection of resources as a
 * single unit called a stack. AWS CloudFormation creates and deletes all member
 * resources of the stack together and manages all dependencies between the
 * resources for you.
 * </p>
 * <p>
 * For more information about this product, go to the <a
 * href="http://aws.amazon.com/cloudformation/">CloudFormation Product Page</a>.
 * </p>
 * <p>
 * Amazon CloudFormation makes use of other AWS products. If you need additional
 * technical information about a specific AWS product, you can find the
 * product's technical documentation at <a
 * href="http://docs.aws.amazon.com/documentation/"
 * >http://docs.aws.amazon.com/documentation/</a>.
 * </p>
 */
public interface AmazonCloudFormationAsync extends AmazonCloudFormation {

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the previous
     * stack configuration.
     * </p>
     * <note>You can cancel only stacks that are in the UPDATE_IN_PROGRESS
     * state.</note> <examples></examples>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @sample AmazonCloudFormationAsync.CancelUpdateStack
     */
    java.util.concurrent.Future<Void> cancelUpdateStackAsync(
            CancelUpdateStackRequest cancelUpdateStackRequest);

    /**
     * <p>
     * Cancels an update on the specified stack. If the call completes
     * successfully, the stack rolls back the update and reverts to the previous
     * stack configuration.
     * </p>
     * <note>You can cancel only stacks that are in the UPDATE_IN_PROGRESS
     * state.</note> <examples></examples>
     * 
     * @param cancelUpdateStackRequest
     *        The input for the <a>CancelUpdateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFormationAsyncHandler.CancelUpdateStack
     */
    java.util.concurrent.Future<Void> cancelUpdateStackAsync(
            CancelUpdateStackRequest cancelUpdateStackRequest,
            com.amazonaws.handlers.AsyncHandler<CancelUpdateStackRequest, Void> asyncHandler);

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code>
     * state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of
     * the failure, you can manually <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the
     * rollback, you can return your stack to a working state (the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the
     * stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS
     * CloudFormation cannot roll back all changes after a failed stack update.
     * For example, you might have a stack that is rolling back to an old
     * database instance that was deleted outside of AWS CloudFormation. Because
     * AWS CloudFormation doesn't know the database was deleted, it assumes that
     * the database instance still exists and attempts to roll back to it,
     * causing the update rollback to fail.
     * </p>
     * <examples></examples>
     * 
     * @param continueUpdateRollbackRequest
     *        The input for the <a>ContinueUpdateRollback</a> action.
     * @return A Java Future containing the result of the ContinueUpdateRollback
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.ContinueUpdateRollback
     */
    java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(
            ContinueUpdateRollbackRequest continueUpdateRollbackRequest);

    /**
     * <p>
     * For a specified stack that is in the <code>UPDATE_ROLLBACK_FAILED</code>
     * state, continues rolling it back to the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state. Depending on the cause of
     * the failure, you can manually <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/troubleshooting.html#troubleshooting-errors-update-rollback-failed"
     * > fix the error</a> and continue the rollback. By continuing the
     * rollback, you can return your stack to a working state (the
     * <code>UPDATE_ROLLBACK_COMPLETE</code> state), and then try to update the
     * stack again.
     * </p>
     * <p>
     * A stack goes into the <code>UPDATE_ROLLBACK_FAILED</code> state when AWS
     * CloudFormation cannot roll back all changes after a failed stack update.
     * For example, you might have a stack that is rolling back to an old
     * database instance that was deleted outside of AWS CloudFormation. Because
     * AWS CloudFormation doesn't know the database was deleted, it assumes that
     * the database instance still exists and attempts to roll back to it,
     * causing the update rollback to fail.
     * </p>
     * <examples></examples>
     * 
     * @param continueUpdateRollbackRequest
     *        The input for the <a>ContinueUpdateRollback</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ContinueUpdateRollback
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ContinueUpdateRollback
     */
    java.util.concurrent.Future<ContinueUpdateRollbackResult> continueUpdateRollbackAsync(
            ContinueUpdateRollbackRequest continueUpdateRollbackRequest,
            com.amazonaws.handlers.AsyncHandler<ContinueUpdateRollbackRequest, ContinueUpdateRollbackResult> asyncHandler);

    /**
     * <p>
     * Creates a list of changes for a stack. AWS CloudFormation generates the
     * change set by comparing the stack's information with the information that
     * you submit. A change set can help you understand which resources AWS
     * CloudFormation will change and how it will change them before you update
     * your stack. Change sets allow you to check before you make a change so
     * that you don't delete or replace critical resources.
     * </p>
     * <p>
     * AWS CloudFormation doesn't make any changes to the stack when you create
     * a change set. To make the specified changes, you must execute the change
     * set by using the <a>ExecuteChangeSet</a> action.
     * </p>
     * <p>
     * After the call successfully completes, AWS CloudFormation starts creating
     * the change set. To check the status of the change set, use the
     * <a>DescribeChangeSet</a> action.
     * </p>
     * <examples></examples>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @return A Java Future containing the result of the CreateChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.CreateChangeSet
     */
    java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(
            CreateChangeSetRequest createChangeSetRequest);

    /**
     * <p>
     * Creates a list of changes for a stack. AWS CloudFormation generates the
     * change set by comparing the stack's information with the information that
     * you submit. A change set can help you understand which resources AWS
     * CloudFormation will change and how it will change them before you update
     * your stack. Change sets allow you to check before you make a change so
     * that you don't delete or replace critical resources.
     * </p>
     * <p>
     * AWS CloudFormation doesn't make any changes to the stack when you create
     * a change set. To make the specified changes, you must execute the change
     * set by using the <a>ExecuteChangeSet</a> action.
     * </p>
     * <p>
     * After the call successfully completes, AWS CloudFormation starts creating
     * the change set. To check the status of the change set, use the
     * <a>DescribeChangeSet</a> action.
     * </p>
     * <examples></examples>
     * 
     * @param createChangeSetRequest
     *        The input for the <a>CreateChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateChangeSet
     */
    java.util.concurrent.Future<CreateChangeSetResult> createChangeSetAsync(
            CreateChangeSetRequest createChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<CreateChangeSetRequest, CreateChangeSetResult> asyncHandler);

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> API.
     * </p>
     * <examples></examples>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @return A Java Future containing the result of the CreateStack operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsync.CreateStack
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest createStackRequest);

    /**
     * <p>
     * Creates a stack as specified in the template. After the call completes
     * successfully, the stack creation starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> API.
     * </p>
     * <examples></examples>
     * 
     * @param createStackRequest
     *        The input for <a>CreateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateStack operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.CreateStack
     */
    java.util.concurrent.Future<CreateStackResult> createStackAsync(
            CreateStackRequest createStackRequest,
            com.amazonaws.handlers.AsyncHandler<CreateStackRequest, CreateStackResult> asyncHandler);

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no
     * one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully
     * deleted the change set.
     * </p>
     * <examples></examples>
     * 
     * @param deleteChangeSetRequest
     *        The input for the <a>DeleteChangeSet</a> action.
     * @return A Java Future containing the result of the DeleteChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DeleteChangeSet
     */
    java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(
            DeleteChangeSetRequest deleteChangeSetRequest);

    /**
     * <p>
     * Deletes the specified change set. Deleting change sets ensures that no
     * one executes the wrong change set.
     * </p>
     * <p>
     * If the call successfully completes, AWS CloudFormation successfully
     * deleted the change set.
     * </p>
     * <examples></examples>
     * 
     * @param deleteChangeSetRequest
     *        The input for the <a>DeleteChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DeleteChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DeleteChangeSet
     */
    java.util.concurrent.Future<DeleteChangeSetResult> deleteChangeSetAsync(
            DeleteChangeSetRequest deleteChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteChangeSetRequest, DeleteChangeSetResult> asyncHandler);

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the
     * <a>DescribeStacks</a> API if the deletion has been completed
     * successfully.
     * </p>
     * <examples></examples>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @sample AmazonCloudFormationAsync.DeleteStack
     */
    java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest deleteStackRequest);

    /**
     * <p>
     * Deletes a specified stack. Once the call completes successfully, stack
     * deletion starts. Deleted stacks do not show up in the
     * <a>DescribeStacks</a> API if the deletion has been completed
     * successfully.
     * </p>
     * <examples></examples>
     * 
     * @param deleteStackRequest
     *        The input for <a>DeleteStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFormationAsyncHandler.DeleteStack
     */
    java.util.concurrent.Future<Void> deleteStackAsync(
            DeleteStackRequest deleteStackRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteStackRequest, Void> asyncHandler);

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum
     * number of stacks that you can create in your account.
     * </p>
     * <examples></examples>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @return A Java Future containing the result of the DescribeAccountLimits
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest);

    /**
     * <p>
     * Retrieves your account's AWS CloudFormation limits, such as the maximum
     * number of stacks that you can create in your account.
     * </p>
     * <examples></examples>
     * 
     * @param describeAccountLimitsRequest
     *        The input for the <a>DescribeAccountLimits</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeAccountLimits
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeAccountLimits
     */
    java.util.concurrent.Future<DescribeAccountLimitsResult> describeAccountLimitsAsync(
            DescribeAccountLimitsRequest describeAccountLimitsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountLimitsRequest, DescribeAccountLimitsResult> asyncHandler);

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS
     * CloudFormation will make if you execute the change set. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * <examples></examples>
     * 
     * @param describeChangeSetRequest
     *        The input for the <a>DescribeChangeSet</a> action.
     * @return A Java Future containing the result of the DescribeChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeChangeSet
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(
            DescribeChangeSetRequest describeChangeSetRequest);

    /**
     * <p>
     * Returns the inputs for the change set and a list of changes that AWS
     * CloudFormation will make if you execute the change set. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks-changesets.html"
     * >Updating Stacks Using Change Sets</a> in the AWS CloudFormation User
     * Guide.
     * </p>
     * <examples></examples>
     * 
     * @param describeChangeSetRequest
     *        The input for the <a>DescribeChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeChangeSet
     */
    java.util.concurrent.Future<DescribeChangeSetResult> describeChangeSetAsync(
            DescribeChangeSetRequest describeChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeChangeSetRequest, DescribeChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"
     * >Stacks</a> in the AWS CloudFormation User Guide.
     * </p>
     * <note>You can list events for stacks that have failed to create or have
     * been deleted by specifying the unique stack identifier (stack ID).</note>
     * <examples></examples>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @return A Java Future containing the result of the DescribeStackEvents
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackEvents
     */
    java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(
            DescribeStackEventsRequest describeStackEventsRequest);

    /**
     * <p>
     * Returns all stack related events for a specified stack. For more
     * information about a stack's event history, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/concept-stack.html"
     * >Stacks</a> in the AWS CloudFormation User Guide.
     * </p>
     * <note>You can list events for stacks that have failed to create or have
     * been deleted by specifying the unique stack identifier (stack ID).</note>
     * <examples></examples>
     * 
     * @param describeStackEventsRequest
     *        The input for <a>DescribeStackEvents</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackEvents
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackEvents
     */
    java.util.concurrent.Future<DescribeStackEventsResult> describeStackEventsAsync(
            DescribeStackEventsRequest describeStackEventsRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackEventsRequest, DescribeStackEventsResult> asyncHandler);

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     * <examples></examples>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @return A Java Future containing the result of the DescribeStackResource
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackResource
     */
    java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(
            DescribeStackResourceRequest describeStackResourceRequest);

    /**
     * <p>
     * Returns a description of the specified resource in the specified stack.
     * </p>
     * <p>
     * For deleted stacks, DescribeStackResource returns resource information
     * for up to 90 days after the stack has been deleted.
     * </p>
     * <examples></examples>
     * 
     * @param describeStackResourceRequest
     *        The input for <a>DescribeStackResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackResource
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackResource
     */
    java.util.concurrent.Future<DescribeStackResourceResult> describeStackResourceAsync(
            DescribeStackResourceRequest describeStackResourceRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourceRequest, DescribeStackResourceResult> asyncHandler);

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code> is
     * specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <note>Only the first 100 resources will be returned. If your stack has
     * more resources than this, you should use <code>ListStackResources</code>
     * instead.</note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code>, but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result. For
     * more information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code>, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS
     * CloudFormation User Guide</a>.
     * </p>
     * <note>A <code>ValidationError</code> is returned if you specify both
     * <code>StackName</code> and <code>PhysicalResourceId</code> in the same
     * request.</note> <examples></examples>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @return A Java Future containing the result of the DescribeStackResources
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStackResources
     */
    java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(
            DescribeStackResourcesRequest describeStackResourcesRequest);

    /**
     * <p>
     * Returns AWS resource descriptions for running and deleted stacks. If
     * <code>StackName</code> is specified, all the associated resources that
     * are part of the stack are returned. If <code>PhysicalResourceId</code> is
     * specified, the associated resources of the stack that the resource
     * belongs to are returned.
     * </p>
     * <note>Only the first 100 resources will be returned. If your stack has
     * more resources than this, you should use <code>ListStackResources</code>
     * instead.</note>
     * <p>
     * For deleted stacks, <code>DescribeStackResources</code> returns resource
     * information for up to 90 days after the stack has been deleted.
     * </p>
     * <p>
     * You must specify either <code>StackName</code> or
     * <code>PhysicalResourceId</code>, but not both. In addition, you can
     * specify <code>LogicalResourceId</code> to filter the returned result. For
     * more information about resources, the <code>LogicalResourceId</code> and
     * <code>PhysicalResourceId</code>, go to the <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/">AWS
     * CloudFormation User Guide</a>.
     * </p>
     * <note>A <code>ValidationError</code> is returned if you specify both
     * <code>StackName</code> and <code>PhysicalResourceId</code> in the same
     * request.</note> <examples></examples>
     * 
     * @param describeStackResourcesRequest
     *        The input for <a>DescribeStackResources</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStackResources
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStackResources
     */
    java.util.concurrent.Future<DescribeStackResourcesResult> describeStackResourcesAsync(
            DescribeStackResourcesRequest describeStackResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStackResourcesRequest, DescribeStackResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * <examples></examples>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @return A Java Future containing the result of the DescribeStacks
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.DescribeStacks
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest describeStacksRequest);

    /**
     * <p>
     * Returns the description for the specified stack; if no stack name was
     * specified, then it returns the description for all the stacks created.
     * </p>
     * <examples></examples>
     * 
     * @param describeStacksRequest
     *        The input for <a>DescribeStacks</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeStacks
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.DescribeStacks
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            DescribeStacksRequest describeStacksRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * Simplified method form for invoking the DescribeStacks operation.
     *
     * @see #describeStacksAsync(DescribeStacksRequest)
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync();

    /**
     * Simplified method form for invoking the DescribeStacks operation with an
     * AsyncHandler.
     *
     * @see #describeStacksAsync(DescribeStacksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<DescribeStacksResult> describeStacksAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeStacksRequest, DescribeStacksResult> asyncHandler);

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an
     * AWS Simple Monthly Calculator URL with a query string that describes the
     * resources required to run the template.
     * </p>
     * <examples></examples>
     * 
     * @param estimateTemplateCostRequest
     * @return A Java Future containing the result of the EstimateTemplateCost
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.EstimateTemplateCost
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            EstimateTemplateCostRequest estimateTemplateCostRequest);

    /**
     * <p>
     * Returns the estimated monthly cost of a template. The return value is an
     * AWS Simple Monthly Calculator URL with a query string that describes the
     * resources required to run the template.
     * </p>
     * <examples></examples>
     * 
     * @param estimateTemplateCostRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the EstimateTemplateCost
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.EstimateTemplateCost
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            EstimateTemplateCostRequest estimateTemplateCostRequest,
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler);

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest)
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync();

    /**
     * Simplified method form for invoking the EstimateTemplateCost operation
     * with an AsyncHandler.
     *
     * @see #estimateTemplateCostAsync(EstimateTemplateCostRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<EstimateTemplateCostResult> estimateTemplateCostAsync(
            com.amazonaws.handlers.AsyncHandler<EstimateTemplateCostRequest, EstimateTemplateCostResult> asyncHandler);

    /**
     * <p>
     * Updates a stack using the input information that was provided when the
     * specified change set was created. After the call successfully completes,
     * AWS CloudFormation starts updating the stack. Use the
     * <a>DescribeStacks</a> action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other
     * change sets associated with the stack because they aren't valid for the
     * updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation
     * enforces the policy during the update. You can't specify a temporary
     * stack policy that overrides the current policy.
     * </p>
     * <examples></examples>
     * 
     * @param executeChangeSetRequest
     *        The input for the <a>ExecuteChangeSet</a> action.
     * @return A Java Future containing the result of the ExecuteChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.ExecuteChangeSet
     */
    java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(
            ExecuteChangeSetRequest executeChangeSetRequest);

    /**
     * <p>
     * Updates a stack using the input information that was provided when the
     * specified change set was created. After the call successfully completes,
     * AWS CloudFormation starts updating the stack. Use the
     * <a>DescribeStacks</a> action to view the status of the update.
     * </p>
     * <p>
     * When you execute a change set, AWS CloudFormation deletes all other
     * change sets associated with the stack because they aren't valid for the
     * updated stack.
     * </p>
     * <p>
     * If a stack policy is associated with the stack, AWS CloudFormation
     * enforces the policy during the update. You can't specify a temporary
     * stack policy that overrides the current policy.
     * </p>
     * <examples></examples>
     * 
     * @param executeChangeSetRequest
     *        The input for the <a>ExecuteChangeSet</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ExecuteChangeSet
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ExecuteChangeSet
     */
    java.util.concurrent.Future<ExecuteChangeSetResult> executeChangeSetAsync(
            ExecuteChangeSetRequest executeChangeSetRequest,
            com.amazonaws.handlers.AsyncHandler<ExecuteChangeSetRequest, ExecuteChangeSetResult> asyncHandler);

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a
     * policy, a null value is returned.
     * </p>
     * <examples></examples>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @return A Java Future containing the result of the GetStackPolicy
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.GetStackPolicy
     */
    java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(
            GetStackPolicyRequest getStackPolicyRequest);

    /**
     * <p>
     * Returns the stack policy for a specified stack. If a stack doesn't have a
     * policy, a null value is returned.
     * </p>
     * <examples></examples>
     * 
     * @param getStackPolicyRequest
     *        The input for the <a>GetStackPolicy</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetStackPolicy
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetStackPolicy
     */
    java.util.concurrent.Future<GetStackPolicyResult> getStackPolicyAsync(
            GetStackPolicyRequest getStackPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetStackPolicyRequest, GetStackPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template
     * for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <note> If the template does not exist, a <code>ValidationError</code> is
     * returned. </note> <examples></examples>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @return A Java Future containing the result of the GetTemplate operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsync.GetTemplate
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(
            GetTemplateRequest getTemplateRequest);

    /**
     * <p>
     * Returns the template body for a specified stack. You can get the template
     * for running or deleted stacks.
     * </p>
     * <p>
     * For deleted stacks, GetTemplate returns the template for up to 90 days
     * after the stack has been deleted.
     * </p>
     * <note> If the template does not exist, a <code>ValidationError</code> is
     * returned. </note> <examples></examples>
     * 
     * @param getTemplateRequest
     *        The input for a <a>GetTemplate</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplate operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetTemplate
     */
    java.util.concurrent.Future<GetTemplateResult> getTemplateAsync(
            GetTemplateRequest getTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateRequest, GetTemplateResult> asyncHandler);

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types, before
     * you create or update a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a
     * template, or you can get template information for a running or deleted
     * stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template
     * information for up to 90 days after the stack has been deleted. If the
     * template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * <examples></examples>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @return A Java Future containing the result of the GetTemplateSummary
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.GetTemplateSummary
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            GetTemplateSummaryRequest getTemplateSummaryRequest);

    /**
     * <p>
     * Returns information about a new or existing template. The
     * <code>GetTemplateSummary</code> action is useful for viewing parameter
     * information, such as default parameter values and parameter types, before
     * you create or update a stack.
     * </p>
     * <p>
     * You can use the <code>GetTemplateSummary</code> action when you submit a
     * template, or you can get template information for a running or deleted
     * stack.
     * </p>
     * <p>
     * For deleted stacks, <code>GetTemplateSummary</code> returns the template
     * information for up to 90 days after the stack has been deleted. If the
     * template does not exist, a <code>ValidationError</code> is returned.
     * </p>
     * <examples></examples>
     * 
     * @param getTemplateSummaryRequest
     *        The input for the <a>GetTemplateSummary</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetTemplateSummary
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.GetTemplateSummary
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            GetTemplateSummaryRequest getTemplateSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetTemplateSummary operation.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest)
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync();

    /**
     * Simplified method form for invoking the GetTemplateSummary operation with
     * an AsyncHandler.
     *
     * @see #getTemplateSummaryAsync(GetTemplateSummaryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetTemplateSummaryResult> getTemplateSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetTemplateSummaryRequest, GetTemplateSummaryResult> asyncHandler);

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For
     * example, AWS CloudFormation lists change sets that are in the
     * <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * <examples></examples>
     * 
     * @param listChangeSetsRequest
     *        The input for the <a>ListChangeSets</a> action.
     * @return A Java Future containing the result of the ListChangeSets
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListChangeSets
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(
            ListChangeSetsRequest listChangeSetsRequest);

    /**
     * <p>
     * Returns the ID and status of each active change set for a stack. For
     * example, AWS CloudFormation lists change sets that are in the
     * <code>CREATE_IN_PROGRESS</code> or <code>CREATE_PENDING</code> state.
     * </p>
     * <examples></examples>
     * 
     * @param listChangeSetsRequest
     *        The input for the <a>ListChangeSets</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListChangeSets
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListChangeSets
     */
    java.util.concurrent.Future<ListChangeSetsResult> listChangeSetsAsync(
            ListChangeSetsRequest listChangeSetsRequest,
            com.amazonaws.handlers.AsyncHandler<ListChangeSetsRequest, ListChangeSetsResult> asyncHandler);

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for
     * up to 90 days after the stack has been deleted.
     * </p>
     * <examples></examples>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @return A Java Future containing the result of the ListStackResources
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.ListStackResources
     */
    java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(
            ListStackResourcesRequest listStackResourcesRequest);

    /**
     * <p>
     * Returns descriptions of all resources of the specified stack.
     * </p>
     * <p>
     * For deleted stacks, ListStackResources returns resource information for
     * up to 90 days after the stack has been deleted.
     * </p>
     * <examples></examples>
     * 
     * @param listStackResourcesRequest
     *        The input for the <a>ListStackResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStackResources
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStackResources
     */
    java.util.concurrent.Future<ListStackResourcesResult> listStackResourcesAsync(
            ListStackResourcesRequest listStackResourcesRequest,
            com.amazonaws.handlers.AsyncHandler<ListStackResourcesRequest, ListStackResourcesResult> asyncHandler);

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been deleted).
     * </p>
     * <examples></examples>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @return A Java Future containing the result of the ListStacks operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsync.ListStacks
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            ListStacksRequest listStacksRequest);

    /**
     * <p>
     * Returns the summary information for stacks whose status matches the
     * specified StackStatusFilter. Summary information for stacks that have
     * been deleted is kept for 90 days after the stack is deleted. If no
     * StackStatusFilter is specified, summary information for all stacks is
     * returned (including existing stacks and stacks that have been deleted).
     * </p>
     * <examples></examples>
     * 
     * @param listStacksRequest
     *        The input for <a>ListStacks</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListStacks operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ListStacks
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            ListStacksRequest listStacksRequest,
            com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListStacks operation.
     *
     * @see #listStacksAsync(ListStacksRequest)
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync();

    /**
     * Simplified method form for invoking the ListStacks operation with an
     * AsyncHandler.
     *
     * @see #listStacksAsync(ListStacksRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListStacksResult> listStacksAsync(
            com.amazonaws.handlers.AsyncHandler<ListStacksRequest, ListStacksResult> asyncHandler);

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * <examples></examples>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @sample AmazonCloudFormationAsync.SetStackPolicy
     */
    java.util.concurrent.Future<Void> setStackPolicyAsync(
            SetStackPolicyRequest setStackPolicyRequest);

    /**
     * <p>
     * Sets a stack policy for a specified stack.
     * </p>
     * <examples></examples>
     * 
     * @param setStackPolicyRequest
     *        The input for the <a>SetStackPolicy</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFormationAsyncHandler.SetStackPolicy
     */
    java.util.concurrent.Future<Void> setStackPolicyAsync(
            SetStackPolicyRequest setStackPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SetStackPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a creation
     * policy or update policy. AWS CloudFormation doesn't proceed with a stack
     * creation or update until resources receive the required number of signals
     * or the timeout period is exceeded. The SignalResource API is useful in
     * cases where you want to send signals from anywhere other than an Amazon
     * EC2 instance.
     * </p>
     * <examples></examples>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @sample AmazonCloudFormationAsync.SignalResource
     */
    java.util.concurrent.Future<Void> signalResourceAsync(
            SignalResourceRequest signalResourceRequest);

    /**
     * <p>
     * Sends a signal to the specified resource with a success or failure
     * status. You can use the SignalResource API in conjunction with a creation
     * policy or update policy. AWS CloudFormation doesn't proceed with a stack
     * creation or update until resources receive the required number of signals
     * or the timeout period is exceeded. The SignalResource API is useful in
     * cases where you want to send signals from anywhere other than an Amazon
     * EC2 instance.
     * </p>
     * <examples></examples>
     * 
     * @param signalResourceRequest
     *        The input for the <a>SignalResource</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonCloudFormationAsyncHandler.SignalResource
     */
    java.util.concurrent.Future<Void> signalResourceAsync(
            SignalResourceRequest signalResourceRequest,
            com.amazonaws.handlers.AsyncHandler<SignalResourceRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack,
     * and monitoring the progress of the update, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
     * >Updating a Stack</a>.
     * </p>
     * <examples></examples>
     * 
     * @param updateStackRequest
     *        The input for <a>UpdateStack</a> action.
     * @return A Java Future containing the result of the UpdateStack operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsync.UpdateStack
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(
            UpdateStackRequest updateStackRequest);

    /**
     * <p>
     * Updates a stack as specified in the template. After the call completes
     * successfully, the stack update starts. You can check the status of the
     * stack via the <a>DescribeStacks</a> action.
     * </p>
     * <p>
     * To get a copy of the template for an existing stack, you can use the
     * <a>GetTemplate</a> action.
     * </p>
     * <p>
     * For more information about creating an update template, updating a stack,
     * and monitoring the progress of the update, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-updating-stacks.html"
     * >Updating a Stack</a>.
     * </p>
     * <examples></examples>
     * 
     * @param updateStackRequest
     *        The input for <a>UpdateStack</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateStack operation
     *         returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.UpdateStack
     */
    java.util.concurrent.Future<UpdateStackResult> updateStackAsync(
            UpdateStackRequest updateStackRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateStackRequest, UpdateStackResult> asyncHandler);

    /**
     * <p>
     * Validates a specified template.
     * </p>
     * <examples></examples>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @return A Java Future containing the result of the ValidateTemplate
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsync.ValidateTemplate
     */
    java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(
            ValidateTemplateRequest validateTemplateRequest);

    /**
     * <p>
     * Validates a specified template.
     * </p>
     * <examples></examples>
     * 
     * @param validateTemplateRequest
     *        The input for <a>ValidateTemplate</a> action.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ValidateTemplate
     *         operation returned by the service.
     * @sample AmazonCloudFormationAsyncHandler.ValidateTemplate
     */
    java.util.concurrent.Future<ValidateTemplateResult> validateTemplateAsync(
            ValidateTemplateRequest validateTemplateRequest,
            com.amazonaws.handlers.AsyncHandler<ValidateTemplateRequest, ValidateTemplateResult> asyncHandler);

}
