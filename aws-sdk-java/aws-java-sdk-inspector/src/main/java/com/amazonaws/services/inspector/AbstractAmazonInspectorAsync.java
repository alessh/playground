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

/**
 * Abstract implementation of {@code AmazonInspectorAsync}. Convenient method
 * forms pass through to the corresponding overload that takes a request object
 * and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonInspectorAsync extends AbstractAmazonInspector
        implements AmazonInspectorAsync {

    protected AbstractAmazonInspectorAsync() {
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            AddAttributesToFindingsRequest request) {

        return addAttributesToFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<AddAttributesToFindingsResult> addAttributesToFindingsAsync(
            AddAttributesToFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<AddAttributesToFindingsRequest, AddAttributesToFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(
            CreateAssessmentTargetRequest request) {

        return createAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTargetResult> createAssessmentTargetAsync(
            CreateAssessmentTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentTargetRequest, CreateAssessmentTargetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(
            CreateAssessmentTemplateRequest request) {

        return createAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAssessmentTemplateResult> createAssessmentTemplateAsync(
            CreateAssessmentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAssessmentTemplateRequest, CreateAssessmentTemplateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            CreateResourceGroupRequest request) {

        return createResourceGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateResourceGroupResult> createResourceGroupAsync(
            CreateResourceGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateResourceGroupRequest, CreateResourceGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentRunAsync(
            DeleteAssessmentRunRequest request) {

        return deleteAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentRunAsync(
            DeleteAssessmentRunRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentRunRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentTargetAsync(
            DeleteAssessmentTargetRequest request) {

        return deleteAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentTargetAsync(
            DeleteAssessmentTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTargetRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentTemplateAsync(
            DeleteAssessmentTemplateRequest request) {

        return deleteAssessmentTemplateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAssessmentTemplateAsync(
            DeleteAssessmentTemplateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAssessmentTemplateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(
            DescribeAssessmentRunsRequest request) {

        return describeAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentRunsResult> describeAssessmentRunsAsync(
            DescribeAssessmentRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssessmentRunsRequest, DescribeAssessmentRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(
            DescribeAssessmentTargetsRequest request) {

        return describeAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTargetsResult> describeAssessmentTargetsAsync(
            DescribeAssessmentTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTargetsRequest, DescribeAssessmentTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(
            DescribeAssessmentTemplatesRequest request) {

        return describeAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeAssessmentTemplatesResult> describeAssessmentTemplatesAsync(
            DescribeAssessmentTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeAssessmentTemplatesRequest, DescribeAssessmentTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            DescribeCrossAccountAccessRoleRequest request) {

        return describeCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeCrossAccountAccessRoleResult> describeCrossAccountAccessRoleAsync(
            DescribeCrossAccountAccessRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeCrossAccountAccessRoleRequest, DescribeCrossAccountAccessRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(
            DescribeFindingsRequest request) {

        return describeFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeFindingsResult> describeFindingsAsync(
            DescribeFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeFindingsRequest, DescribeFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(
            DescribeResourceGroupsRequest request) {

        return describeResourceGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeResourceGroupsResult> describeResourceGroupsAsync(
            DescribeResourceGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeResourceGroupsRequest, DescribeResourceGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(
            DescribeRulesPackagesRequest request) {

        return describeRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeRulesPackagesResult> describeRulesPackagesAsync(
            DescribeRulesPackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeRulesPackagesRequest, DescribeRulesPackagesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(
            GetTelemetryMetadataRequest request) {

        return getTelemetryMetadataAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetTelemetryMetadataResult> getTelemetryMetadataAsync(
            GetTelemetryMetadataRequest request,
            com.amazonaws.handlers.AsyncHandler<GetTelemetryMetadataRequest, GetTelemetryMetadataResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(
            ListAssessmentRunAgentsRequest request) {

        return listAssessmentRunAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunAgentsResult> listAssessmentRunAgentsAsync(
            ListAssessmentRunAgentsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentRunAgentsRequest, ListAssessmentRunAgentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(
            ListAssessmentRunsRequest request) {

        return listAssessmentRunsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentRunsResult> listAssessmentRunsAsync(
            ListAssessmentRunsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentRunsRequest, ListAssessmentRunsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(
            ListAssessmentTargetsRequest request) {

        return listAssessmentTargetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTargetsResult> listAssessmentTargetsAsync(
            ListAssessmentTargetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentTargetsRequest, ListAssessmentTargetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(
            ListAssessmentTemplatesRequest request) {

        return listAssessmentTemplatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAssessmentTemplatesResult> listAssessmentTemplatesAsync(
            ListAssessmentTemplatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAssessmentTemplatesRequest, ListAssessmentTemplatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(
            ListEventSubscriptionsRequest request) {

        return listEventSubscriptionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEventSubscriptionsResult> listEventSubscriptionsAsync(
            ListEventSubscriptionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEventSubscriptionsRequest, ListEventSubscriptionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            ListFindingsRequest request) {

        return listFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListFindingsResult> listFindingsAsync(
            ListFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListFindingsRequest, ListFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            ListRulesPackagesRequest request) {

        return listRulesPackagesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRulesPackagesResult> listRulesPackagesAsync(
            ListRulesPackagesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRulesPackagesRequest, ListRulesPackagesResult> asyncHandler) {

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
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(
            PreviewAgentsRequest request) {

        return previewAgentsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PreviewAgentsResult> previewAgentsAsync(
            PreviewAgentsRequest request,
            com.amazonaws.handlers.AsyncHandler<PreviewAgentsRequest, PreviewAgentsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> registerCrossAccountAccessRoleAsync(
            RegisterCrossAccountAccessRoleRequest request) {

        return registerCrossAccountAccessRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> registerCrossAccountAccessRoleAsync(
            RegisterCrossAccountAccessRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<RegisterCrossAccountAccessRoleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            RemoveAttributesFromFindingsRequest request) {

        return removeAttributesFromFindingsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<RemoveAttributesFromFindingsResult> removeAttributesFromFindingsAsync(
            RemoveAttributesFromFindingsRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveAttributesFromFindingsRequest, RemoveAttributesFromFindingsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setTagsForResourceAsync(
            SetTagsForResourceRequest request) {

        return setTagsForResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setTagsForResourceAsync(
            SetTagsForResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<SetTagsForResourceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(
            StartAssessmentRunRequest request) {

        return startAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<StartAssessmentRunResult> startAssessmentRunAsync(
            StartAssessmentRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StartAssessmentRunRequest, StartAssessmentRunResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> stopAssessmentRunAsync(
            StopAssessmentRunRequest request) {

        return stopAssessmentRunAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopAssessmentRunAsync(
            StopAssessmentRunRequest request,
            com.amazonaws.handlers.AsyncHandler<StopAssessmentRunRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> subscribeToEventAsync(
            SubscribeToEventRequest request) {

        return subscribeToEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> subscribeToEventAsync(
            SubscribeToEventRequest request,
            com.amazonaws.handlers.AsyncHandler<SubscribeToEventRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> unsubscribeFromEventAsync(
            UnsubscribeFromEventRequest request) {

        return unsubscribeFromEventAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> unsubscribeFromEventAsync(
            UnsubscribeFromEventRequest request,
            com.amazonaws.handlers.AsyncHandler<UnsubscribeFromEventRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAssessmentTargetAsync(
            UpdateAssessmentTargetRequest request) {

        return updateAssessmentTargetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAssessmentTargetAsync(
            UpdateAssessmentTargetRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssessmentTargetRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
