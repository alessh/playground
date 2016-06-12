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
package com.amazonaws.services.databasemigrationservice;

import com.amazonaws.services.databasemigrationservice.model.*;

/**
 * Abstract implementation of {@code AWSDatabaseMigrationServiceAsync}.
 * Convenient method forms pass through to the corresponding overload that takes
 * a request object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAWSDatabaseMigrationServiceAsync extends
        AbstractAWSDatabaseMigrationService implements
        AWSDatabaseMigrationServiceAsync {

    protected AbstractAWSDatabaseMigrationServiceAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest request) {

        return addTagsToResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddTagsToResourceResult> addTagsToResourceAsync(
            AddTagsToResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<AddTagsToResourceRequest, AddTagsToResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(
            CreateEndpointRequest request) {

        return createEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateEndpointResult> createEndpointAsync(
            CreateEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateEndpointRequest, CreateEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(
            CreateReplicationInstanceRequest request) {

        return createReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationInstanceResult> createReplicationInstanceAsync(
            CreateReplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationInstanceRequest, CreateReplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(
            CreateReplicationSubnetGroupRequest request) {

        return createReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationSubnetGroupResult> createReplicationSubnetGroupAsync(
            CreateReplicationSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationSubnetGroupRequest, CreateReplicationSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(
            CreateReplicationTaskRequest request) {

        return createReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReplicationTaskResult> createReplicationTaskAsync(
            CreateReplicationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReplicationTaskRequest, CreateReplicationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(
            DeleteEndpointRequest request) {

        return deleteEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteEndpointResult> deleteEndpointAsync(
            DeleteEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteEndpointRequest, DeleteEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(
            DeleteReplicationInstanceRequest request) {

        return deleteReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationInstanceResult> deleteReplicationInstanceAsync(
            DeleteReplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationInstanceRequest, DeleteReplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(
            DeleteReplicationSubnetGroupRequest request) {

        return deleteReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationSubnetGroupResult> deleteReplicationSubnetGroupAsync(
            DeleteReplicationSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationSubnetGroupRequest, DeleteReplicationSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(
            DeleteReplicationTaskRequest request) {

        return deleteReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReplicationTaskResult> deleteReplicationTaskAsync(
            DeleteReplicationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReplicationTaskRequest, DeleteReplicationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest request) {

        return describeAccountAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAccountAttributesResult> describeAccountAttributesAsync(
            DescribeAccountAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAccountAttributesRequest, DescribeAccountAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            DescribeConnectionsRequest request) {

        return describeConnectionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConnectionsResult> describeConnectionsAsync(
            DescribeConnectionsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConnectionsRequest, DescribeConnectionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(
            DescribeEndpointTypesRequest request) {

        return describeEndpointTypesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointTypesResult> describeEndpointTypesAsync(
            DescribeEndpointTypesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointTypesRequest, DescribeEndpointTypesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(
            DescribeEndpointsRequest request) {

        return describeEndpointsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeEndpointsResult> describeEndpointsAsync(
            DescribeEndpointsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeEndpointsRequest, DescribeEndpointsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest request) {

        return describeOrderableReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeOrderableReplicationInstancesResult> describeOrderableReplicationInstancesAsync(
            DescribeOrderableReplicationInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeOrderableReplicationInstancesRequest, DescribeOrderableReplicationInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(
            DescribeRefreshSchemasStatusRequest request) {

        return describeRefreshSchemasStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRefreshSchemasStatusResult> describeRefreshSchemasStatusAsync(
            DescribeRefreshSchemasStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRefreshSchemasStatusRequest, DescribeRefreshSchemasStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(
            DescribeReplicationInstancesRequest request) {

        return describeReplicationInstancesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationInstancesResult> describeReplicationInstancesAsync(
            DescribeReplicationInstancesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationInstancesRequest, DescribeReplicationInstancesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest request) {

        return describeReplicationSubnetGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationSubnetGroupsResult> describeReplicationSubnetGroupsAsync(
            DescribeReplicationSubnetGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationSubnetGroupsRequest, DescribeReplicationSubnetGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(
            DescribeReplicationTasksRequest request) {

        return describeReplicationTasksAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReplicationTasksResult> describeReplicationTasksAsync(
            DescribeReplicationTasksRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReplicationTasksRequest, DescribeReplicationTasksResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(
            DescribeSchemasRequest request) {

        return describeSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeSchemasResult> describeSchemasAsync(
            DescribeSchemasRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeSchemasRequest, DescribeSchemasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(
            DescribeTableStatisticsRequest request) {

        return describeTableStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeTableStatisticsResult> describeTableStatisticsAsync(
            DescribeTableStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeTableStatisticsRequest, DescribeTableStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest request) {

        return listTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListTagsForResourceResult> listTagsForResourceAsync(
            ListTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<ListTagsForResourceRequest, ListTagsForResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(
            ModifyEndpointRequest request) {

        return modifyEndpointAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyEndpointResult> modifyEndpointAsync(
            ModifyEndpointRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyEndpointRequest, ModifyEndpointResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(
            ModifyReplicationInstanceRequest request) {

        return modifyReplicationInstanceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationInstanceResult> modifyReplicationInstanceAsync(
            ModifyReplicationInstanceRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationInstanceRequest, ModifyReplicationInstanceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(
            ModifyReplicationSubnetGroupRequest request) {

        return modifyReplicationSubnetGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ModifyReplicationSubnetGroupResult> modifyReplicationSubnetGroupAsync(
            ModifyReplicationSubnetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<ModifyReplicationSubnetGroupRequest, ModifyReplicationSubnetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(
            RefreshSchemasRequest request) {

        return refreshSchemasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RefreshSchemasResult> refreshSchemasAsync(
            RefreshSchemasRequest request,
            com.amazonaws.handlers.AsyncHandler<RefreshSchemasRequest, RefreshSchemasResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest request) {

        return removeTagsFromResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveTagsFromResourceResult> removeTagsFromResourceAsync(
            RemoveTagsFromResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveTagsFromResourceRequest, RemoveTagsFromResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(
            StartReplicationTaskRequest request) {

        return startReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartReplicationTaskResult> startReplicationTaskAsync(
            StartReplicationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StartReplicationTaskRequest, StartReplicationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(
            StopReplicationTaskRequest request) {

        return stopReplicationTaskAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StopReplicationTaskResult> stopReplicationTaskAsync(
            StopReplicationTaskRequest request,
            com.amazonaws.handlers.AsyncHandler<StopReplicationTaskRequest, StopReplicationTaskResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(
            TestConnectionRequest request) {

        return testConnectionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<TestConnectionResult> testConnectionAsync(
            TestConnectionRequest request,
            com.amazonaws.handlers.AsyncHandler<TestConnectionRequest, TestConnectionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
