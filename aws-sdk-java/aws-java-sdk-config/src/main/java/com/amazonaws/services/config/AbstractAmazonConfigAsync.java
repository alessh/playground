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
package com.amazonaws.services.config;

import com.amazonaws.services.config.model.*;

/**
 * Abstract implementation of {@code AmazonConfigAsync}. Convenient method forms
 * pass through to the corresponding overload that takes a request object and an
 * {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonConfigAsync extends AbstractAmazonConfig implements
        AmazonConfigAsync {

    protected AbstractAmazonConfigAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> deleteConfigRuleAsync(
            DeleteConfigRuleRequest request) {

        return deleteConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteConfigRuleAsync(
            DeleteConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteConfigRuleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeliveryChannelAsync(
            DeleteDeliveryChannelRequest request) {

        return deleteDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteDeliveryChannelAsync(
            DeleteDeliveryChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteDeliveryChannelRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(
            DeliverConfigSnapshotRequest request) {

        return deliverConfigSnapshotAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeliverConfigSnapshotResult> deliverConfigSnapshotAsync(
            DeliverConfigSnapshotRequest request,
            com.amazonaws.handlers.AsyncHandler<DeliverConfigSnapshotRequest, DeliverConfigSnapshotResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest request) {

        return describeComplianceByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            DescribeComplianceByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule
     * operation.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync() {

        return describeComplianceByConfigRuleAsync(new DescribeComplianceByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByConfigRule
     * operation with an AsyncHandler.
     *
     * @see #describeComplianceByConfigRuleAsync(DescribeComplianceByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeComplianceByConfigRuleResult> describeComplianceByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByConfigRuleRequest, DescribeComplianceByConfigRuleResult> asyncHandler) {

        return describeComplianceByConfigRuleAsync(
                new DescribeComplianceByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest request) {

        return describeComplianceByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            DescribeComplianceByResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource
     * operation.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync() {

        return describeComplianceByResourceAsync(new DescribeComplianceByResourceRequest());
    }

    /**
     * Simplified method form for invoking the DescribeComplianceByResource
     * operation with an AsyncHandler.
     *
     * @see #describeComplianceByResourceAsync(DescribeComplianceByResourceRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeComplianceByResourceResult> describeComplianceByResourceAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeComplianceByResourceRequest, DescribeComplianceByResourceResult> asyncHandler) {

        return describeComplianceByResourceAsync(
                new DescribeComplianceByResourceRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request) {

        return describeConfigRuleEvaluationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            DescribeConfigRuleEvaluationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigRuleEvaluationStatus operation.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync() {

        return describeConfigRuleEvaluationStatusAsync(new DescribeConfigRuleEvaluationStatusRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigRuleEvaluationStatus operation with an AsyncHandler.
     *
     * @see #describeConfigRuleEvaluationStatusAsync(DescribeConfigRuleEvaluationStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigRuleEvaluationStatusResult> describeConfigRuleEvaluationStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRuleEvaluationStatusRequest, DescribeConfigRuleEvaluationStatusResult> asyncHandler) {

        return describeConfigRuleEvaluationStatusAsync(
                new DescribeConfigRuleEvaluationStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            DescribeConfigRulesRequest request) {

        return describeConfigRulesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            DescribeConfigRulesRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync() {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigRules operation
     * with an AsyncHandler.
     *
     * @see #describeConfigRulesAsync(DescribeConfigRulesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigRulesResult> describeConfigRulesAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigRulesRequest, DescribeConfigRulesResult> asyncHandler) {

        return describeConfigRulesAsync(new DescribeConfigRulesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request) {

        return describeConfigurationRecorderStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            DescribeConfigurationRecorderStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigurationRecorderStatus operation.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync() {

        return describeConfigurationRecorderStatusAsync(new DescribeConfigurationRecorderStatusRequest());
    }

    /**
     * Simplified method form for invoking the
     * DescribeConfigurationRecorderStatus operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecorderStatusAsync(DescribeConfigurationRecorderStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigurationRecorderStatusResult> describeConfigurationRecorderStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecorderStatusRequest, DescribeConfigurationRecorderStatusResult> asyncHandler) {

        return describeConfigurationRecorderStatusAsync(
                new DescribeConfigurationRecorderStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest request) {

        return describeConfigurationRecordersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            DescribeConfigurationRecordersRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders
     * operation.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync() {

        return describeConfigurationRecordersAsync(new DescribeConfigurationRecordersRequest());
    }

    /**
     * Simplified method form for invoking the DescribeConfigurationRecorders
     * operation with an AsyncHandler.
     *
     * @see #describeConfigurationRecordersAsync(DescribeConfigurationRecordersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeConfigurationRecordersResult> describeConfigurationRecordersAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeConfigurationRecordersRequest, DescribeConfigurationRecordersResult> asyncHandler) {

        return describeConfigurationRecordersAsync(
                new DescribeConfigurationRecordersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest request) {

        return describeDeliveryChannelStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            DescribeDeliveryChannelStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus
     * operation.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync() {

        return describeDeliveryChannelStatusAsync(new DescribeDeliveryChannelStatusRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannelStatus
     * operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelStatusAsync(DescribeDeliveryChannelStatusRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDeliveryChannelStatusResult> describeDeliveryChannelStatusAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelStatusRequest, DescribeDeliveryChannelStatusResult> asyncHandler) {

        return describeDeliveryChannelStatusAsync(
                new DescribeDeliveryChannelStatusRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            DescribeDeliveryChannelsRequest request) {

        return describeDeliveryChannelsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            DescribeDeliveryChannelsRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels
     * operation.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest)
     */
    @Override
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync() {

        return describeDeliveryChannelsAsync(new DescribeDeliveryChannelsRequest());
    }

    /**
     * Simplified method form for invoking the DescribeDeliveryChannels
     * operation with an AsyncHandler.
     *
     * @see #describeDeliveryChannelsAsync(DescribeDeliveryChannelsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<DescribeDeliveryChannelsResult> describeDeliveryChannelsAsync(
            com.amazonaws.handlers.AsyncHandler<DescribeDeliveryChannelsRequest, DescribeDeliveryChannelsResult> asyncHandler) {

        return describeDeliveryChannelsAsync(
                new DescribeDeliveryChannelsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request) {

        return getComplianceDetailsByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByConfigRuleResult> getComplianceDetailsByConfigRuleAsync(
            GetComplianceDetailsByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByConfigRuleRequest, GetComplianceDetailsByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest request) {

        return getComplianceDetailsByResourceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceDetailsByResourceResult> getComplianceDetailsByResourceAsync(
            GetComplianceDetailsByResourceRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceDetailsByResourceRequest, GetComplianceDetailsByResourceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request) {

        return getComplianceSummaryByConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            GetComplianceSummaryByConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule
     * operation.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync() {

        return getComplianceSummaryByConfigRuleAsync(new GetComplianceSummaryByConfigRuleRequest());
    }

    /**
     * Simplified method form for invoking the GetComplianceSummaryByConfigRule
     * operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByConfigRuleAsync(GetComplianceSummaryByConfigRuleRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetComplianceSummaryByConfigRuleResult> getComplianceSummaryByConfigRuleAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByConfigRuleRequest, GetComplianceSummaryByConfigRuleResult> asyncHandler) {

        return getComplianceSummaryByConfigRuleAsync(
                new GetComplianceSummaryByConfigRuleRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request) {

        return getComplianceSummaryByResourceTypeAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            GetComplianceSummaryByResourceTypeRequest request,
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the
     * GetComplianceSummaryByResourceType operation.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest)
     */
    @Override
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync() {

        return getComplianceSummaryByResourceTypeAsync(new GetComplianceSummaryByResourceTypeRequest());
    }

    /**
     * Simplified method form for invoking the
     * GetComplianceSummaryByResourceType operation with an AsyncHandler.
     *
     * @see #getComplianceSummaryByResourceTypeAsync(GetComplianceSummaryByResourceTypeRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetComplianceSummaryByResourceTypeResult> getComplianceSummaryByResourceTypeAsync(
            com.amazonaws.handlers.AsyncHandler<GetComplianceSummaryByResourceTypeRequest, GetComplianceSummaryByResourceTypeResult> asyncHandler) {

        return getComplianceSummaryByResourceTypeAsync(
                new GetComplianceSummaryByResourceTypeRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(
            GetResourceConfigHistoryRequest request) {

        return getResourceConfigHistoryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetResourceConfigHistoryResult> getResourceConfigHistoryAsync(
            GetResourceConfigHistoryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetResourceConfigHistoryRequest, GetResourceConfigHistoryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(
            ListDiscoveredResourcesRequest request) {

        return listDiscoveredResourcesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListDiscoveredResourcesResult> listDiscoveredResourcesAsync(
            ListDiscoveredResourcesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListDiscoveredResourcesRequest, ListDiscoveredResourcesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigRuleAsync(
            PutConfigRuleRequest request) {

        return putConfigRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigRuleAsync(
            PutConfigRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<PutConfigRuleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigurationRecorderAsync(
            PutConfigurationRecorderRequest request) {

        return putConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putConfigurationRecorderAsync(
            PutConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<PutConfigurationRecorderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putDeliveryChannelAsync(
            PutDeliveryChannelRequest request) {

        return putDeliveryChannelAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putDeliveryChannelAsync(
            PutDeliveryChannelRequest request,
            com.amazonaws.handlers.AsyncHandler<PutDeliveryChannelRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(
            PutEvaluationsRequest request) {

        return putEvaluationsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutEvaluationsResult> putEvaluationsAsync(
            PutEvaluationsRequest request,
            com.amazonaws.handlers.AsyncHandler<PutEvaluationsRequest, PutEvaluationsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest request) {

        return startConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> startConfigurationRecorderAsync(
            StartConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<StartConfigurationRecorderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest request) {

        return stopConfigurationRecorderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> stopConfigurationRecorderAsync(
            StopConfigurationRecorderRequest request,
            com.amazonaws.handlers.AsyncHandler<StopConfigurationRecorderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
