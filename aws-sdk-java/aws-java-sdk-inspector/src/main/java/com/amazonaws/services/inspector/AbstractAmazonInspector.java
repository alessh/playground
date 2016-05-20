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
package com.amazonaws.services.inspector;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonInspector}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonInspector implements AmazonInspector {

    protected AbstractAmazonInspector() {
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
    public AddAttributesToFindingsResult addAttributesToFindings(
            AddAttributesToFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAssessmentTargetResult createAssessmentTarget(
            CreateAssessmentTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAssessmentTemplateResult createAssessmentTemplate(
            CreateAssessmentTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateResourceGroupResult createResourceGroup(
            CreateResourceGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAssessmentRun(DeleteAssessmentRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAssessmentTarget(DeleteAssessmentTargetRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAssessmentTemplate(DeleteAssessmentTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentRunsResult describeAssessmentRuns(
            DescribeAssessmentRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentTargetsResult describeAssessmentTargets(
            DescribeAssessmentTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeAssessmentTemplatesResult describeAssessmentTemplates(
            DescribeAssessmentTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeCrossAccountAccessRoleResult describeCrossAccountAccessRole(
            DescribeCrossAccountAccessRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeFindingsResult describeFindings(
            DescribeFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeResourceGroupsResult describeResourceGroups(
            DescribeResourceGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeRulesPackagesResult describeRulesPackages(
            DescribeRulesPackagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetTelemetryMetadataResult getTelemetryMetadata(
            GetTelemetryMetadataRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentRunAgentsResult listAssessmentRunAgents(
            ListAssessmentRunAgentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentRunsResult listAssessmentRuns(
            ListAssessmentRunsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentTargetsResult listAssessmentTargets(
            ListAssessmentTargetsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAssessmentTemplatesResult listAssessmentTemplates(
            ListAssessmentTemplatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEventSubscriptionsResult listEventSubscriptions(
            ListEventSubscriptionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListFindingsResult listFindings(ListFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRulesPackagesResult listRulesPackages(
            ListRulesPackagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListTagsForResourceResult listTagsForResource(
            ListTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PreviewAgentsResult previewAgents(PreviewAgentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void registerCrossAccountAccessRole(
            RegisterCrossAccountAccessRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public RemoveAttributesFromFindingsResult removeAttributesFromFindings(
            RemoveAttributesFromFindingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setTagsForResource(SetTagsForResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public StartAssessmentRunResult startAssessmentRun(
            StartAssessmentRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void stopAssessmentRun(StopAssessmentRunRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void subscribeToEvent(SubscribeToEventRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void unsubscribeFromEvent(UnsubscribeFromEventRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateAssessmentTarget(UpdateAssessmentTargetRequest request) {
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
