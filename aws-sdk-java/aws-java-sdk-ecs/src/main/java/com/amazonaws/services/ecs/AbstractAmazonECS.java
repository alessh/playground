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
package com.amazonaws.services.ecs;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonECS}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonECS implements AmazonECS {

    protected AbstractAmazonECS() {
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
    public CreateClusterResult createCluster(CreateClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateClusterResult createCluster() {
        return createCluster(new CreateClusterRequest());
    }

    @Override
    public CreateServiceResult createService(CreateServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteClusterResult deleteCluster(DeleteClusterRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeleteServiceResult deleteService(DeleteServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterContainerInstanceResult deregisterContainerInstance(
            DeregisterContainerInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeregisterTaskDefinitionResult deregisterTaskDefinition(
            DeregisterTaskDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClustersResult describeClusters(
            DescribeClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeClustersResult describeClusters() {
        return describeClusters(new DescribeClustersRequest());
    }

    @Override
    public DescribeContainerInstancesResult describeContainerInstances(
            DescribeContainerInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeServicesResult describeServices(
            DescribeServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTaskDefinitionResult describeTaskDefinition(
            DescribeTaskDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeTasksResult describeTasks(DescribeTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DiscoverPollEndpointResult discoverPollEndpoint(
            DiscoverPollEndpointRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DiscoverPollEndpointResult discoverPollEndpoint() {
        return discoverPollEndpoint(new DiscoverPollEndpointRequest());
    }

    @Override
    public ListClustersResult listClusters(ListClustersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListClustersResult listClusters() {
        return listClusters(new ListClustersRequest());
    }

    @Override
    public ListContainerInstancesResult listContainerInstances(
            ListContainerInstancesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListContainerInstancesResult listContainerInstances() {
        return listContainerInstances(new ListContainerInstancesRequest());
    }

    @Override
    public ListServicesResult listServices(ListServicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServicesResult listServices() {
        return listServices(new ListServicesRequest());
    }

    @Override
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies(
            ListTaskDefinitionFamiliesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTaskDefinitionFamiliesResult listTaskDefinitionFamilies() {
        return listTaskDefinitionFamilies(new ListTaskDefinitionFamiliesRequest());
    }

    @Override
    public ListTaskDefinitionsResult listTaskDefinitions(
            ListTaskDefinitionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTaskDefinitionsResult listTaskDefinitions() {
        return listTaskDefinitions(new ListTaskDefinitionsRequest());
    }

    @Override
    public ListTasksResult listTasks(ListTasksRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTasksResult listTasks() {
        return listTasks(new ListTasksRequest());
    }

    @Override
    public RegisterContainerInstanceResult registerContainerInstance(
            RegisterContainerInstanceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RegisterTaskDefinitionResult registerTaskDefinition(
            RegisterTaskDefinitionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RunTaskResult runTask(RunTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartTaskResult startTask(StartTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StopTaskResult stopTask(StopTaskRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubmitContainerStateChangeResult submitContainerStateChange(
            SubmitContainerStateChangeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SubmitContainerStateChangeResult submitContainerStateChange() {
        return submitContainerStateChange(new SubmitContainerStateChangeRequest());
    }

    @Override
    public SubmitTaskStateChangeResult submitTaskStateChange(
            SubmitTaskStateChangeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateContainerAgentResult updateContainerAgent(
            UpdateContainerAgentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateServiceResult updateService(UpdateServiceRequest request) {
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
