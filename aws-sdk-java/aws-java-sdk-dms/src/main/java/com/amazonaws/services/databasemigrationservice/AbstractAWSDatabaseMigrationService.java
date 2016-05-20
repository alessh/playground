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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSDatabaseMigrationService}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSDatabaseMigrationService implements
        AWSDatabaseMigrationService {

    protected AbstractAWSDatabaseMigrationService() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public AddTagsToResourceResult addTagsToResource(
            AddTagsToResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateEndpointResult createEndpoint(CreateEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReplicationInstanceResult createReplicationInstance(
            CreateReplicationInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReplicationSubnetGroupResult createReplicationSubnetGroup(
            CreateReplicationSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateReplicationTaskResult createReplicationTask(
            CreateReplicationTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteEndpointResult deleteEndpoint(DeleteEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReplicationInstanceResult deleteReplicationInstance(
            DeleteReplicationInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReplicationSubnetGroupResult deleteReplicationSubnetGroup(
            DeleteReplicationSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteReplicationTaskResult deleteReplicationTask(
            DeleteReplicationTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAccountAttributesResult describeAccountAttributes(
            DescribeAccountAttributesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConnectionsResult describeConnections(
            DescribeConnectionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEndpointTypesResult describeEndpointTypes(
            DescribeEndpointTypesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeEndpointsResult describeEndpoints(
            DescribeEndpointsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeOrderableReplicationInstancesResult describeOrderableReplicationInstances(
            DescribeOrderableReplicationInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRefreshSchemasStatusResult describeRefreshSchemasStatus(
            DescribeRefreshSchemasStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReplicationInstancesResult describeReplicationInstances(
            DescribeReplicationInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReplicationSubnetGroupsResult describeReplicationSubnetGroups(
            DescribeReplicationSubnetGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeReplicationTasksResult describeReplicationTasks(
            DescribeReplicationTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeSchemasResult describeSchemas(DescribeSchemasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTableStatisticsResult describeTableStatistics(
            DescribeTableStatisticsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyEndpointResult modifyEndpoint(ModifyEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyReplicationInstanceResult modifyReplicationInstance(
            ModifyReplicationInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ModifyReplicationSubnetGroupResult modifyReplicationSubnetGroup(
            ModifyReplicationSubnetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RefreshSchemasResult refreshSchemas(RefreshSchemasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveTagsFromResourceResult removeTagsFromResource(
            RemoveTagsFromResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartReplicationTaskResult startReplicationTask(
            StartReplicationTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopReplicationTaskResult stopReplicationTask(
            StopReplicationTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestConnectionResult testConnection(TestConnectionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
