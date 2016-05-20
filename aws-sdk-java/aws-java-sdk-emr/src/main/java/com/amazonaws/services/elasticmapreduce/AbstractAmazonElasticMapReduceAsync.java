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
package com.amazonaws.services.elasticmapreduce;

import com.amazonaws.services.elasticmapreduce.model.*;

/**
 * Abstract implementation of {@code AmazonElasticMapReduceAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonElasticMapReduceAsync extends
        AbstractAmazonElasticMapReduce implements AmazonElasticMapReduceAsync {

    protected AbstractAmazonElasticMapReduceAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(
            AddInstanceGroupsRequest request) {

        return addInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddInstanceGroupsResult> addInstanceGroupsAsync(
            AddInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddInstanceGroupsRequest, AddInstanceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(
            AddJobFlowStepsRequest request) {

        return addJobFlowStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddJobFlowStepsResult> addJobFlowStepsAsync(
            AddJobFlowStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddJobFlowStepsRequest, AddJobFlowStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(
            AddTagsRequest request) {

        return addTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsResult> addTagsAsync(
            AddTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsRequest, AddTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(
            DescribeClusterRequest request) {

        return describeClusterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeClusterResult> describeClusterAsync(
            DescribeClusterRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeClusterRequest, DescribeClusterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            DescribeJobFlowsRequest request) {

        return describeJobFlowsAsync(request, null);
    }

    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            DescribeJobFlowsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeJobFlows operation.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest)
     */
    @Override
    @Deprecated
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync() {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeJobFlows operation with
     * an AsyncHandler.
     *
     * @see #describeJobFlowsAsync(DescribeJobFlowsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeJobFlowsResult> describeJobFlowsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeJobFlowsRequest, DescribeJobFlowsResult> asyncHandler) {

        return describeJobFlowsAsync(new DescribeJobFlowsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(
            DescribeStepRequest request) {

        return describeStepAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeStepResult> describeStepAsync(
            DescribeStepRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeStepRequest, DescribeStepResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(
            ListBootstrapActionsRequest request) {

        return listBootstrapActionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListBootstrapActionsResult> listBootstrapActionsAsync(
            ListBootstrapActionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListBootstrapActionsRequest, ListBootstrapActionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            ListClustersRequest request) {

        return listClustersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            ListClustersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListClusters operation.
     *
     * @see #listClustersAsync(ListClustersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync() {

        return listClustersAsync(new ListClustersRequest());
    }

    /**
     * Simplified method form for invoking the ListClusters operation with an
     * AsyncHandler.
     *
     * @see #listClustersAsync(ListClustersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListClustersResult> listClustersAsync(
            com.amazonaws.handlers.AsyncHandler<ListClustersRequest, ListClustersResult> asyncHandler) {

        return listClustersAsync(new ListClustersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(
            ListInstanceGroupsRequest request) {

        return listInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceGroupsResult> listInstanceGroupsAsync(
            ListInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstanceGroupsRequest, ListInstanceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(
            ListInstancesRequest request) {

        return listInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstancesResult> listInstancesAsync(
            ListInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstancesRequest, ListInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(
            ListStepsRequest request) {

        return listStepsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListStepsResult> listStepsAsync(
            ListStepsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListStepsRequest, ListStepsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> modifyInstanceGroupsAsync(
            ModifyInstanceGroupsRequest request) {

        return modifyInstanceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> modifyInstanceGroupsAsync(
            ModifyInstanceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> modifyInstanceGroupsAsync() {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest());
    }

    /**
     * Simplified method form for invoking the ModifyInstanceGroups operation
     * with an AsyncHandler.
     *
     * @see #modifyInstanceGroupsAsync(ModifyInstanceGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> modifyInstanceGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ModifyInstanceGroupsRequest, Void> asyncHandler) {

        return modifyInstanceGroupsAsync(new ModifyInstanceGroupsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(
            RemoveTagsRequest request) {

        return removeTagsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsResult> removeTagsAsync(
            RemoveTagsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsRequest, RemoveTagsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(
            RunJobFlowRequest request) {

        return runJobFlowAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RunJobFlowResult> runJobFlowAsync(
            RunJobFlowRequest request,
            com.amazonaws.handlers.AsyncHandler<RunJobFlowRequest, RunJobFlowResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setTerminationProtectionAsync(
            SetTerminationProtectionRequest request) {

        return setTerminationProtectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setTerminationProtectionAsync(
            SetTerminationProtectionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTerminationProtectionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setVisibleToAllUsersAsync(
            SetVisibleToAllUsersRequest request) {

        return setVisibleToAllUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setVisibleToAllUsersAsync(
            SetVisibleToAllUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<SetVisibleToAllUsersRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> terminateJobFlowsAsync(
            TerminateJobFlowsRequest request) {

        return terminateJobFlowsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> terminateJobFlowsAsync(
            TerminateJobFlowsRequest request,
            com.amazonaws.handlers.AsyncHandler<TerminateJobFlowsRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
