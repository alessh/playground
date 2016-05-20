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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonConfig}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonConfig implements AmazonConfig {

    protected AbstractAmazonConfig() {
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
    public void deleteConfigRule(DeleteConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteDeliveryChannel(DeleteDeliveryChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DeliverConfigSnapshotResult deliverConfigSnapshot(
            DeliverConfigSnapshotRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule(
            DescribeComplianceByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByConfigRuleResult describeComplianceByConfigRule() {
        return describeComplianceByConfigRule(new DescribeComplianceByConfigRuleRequest());
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource(
            DescribeComplianceByResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeComplianceByResourceResult describeComplianceByResource() {
        return describeComplianceByResource(new DescribeComplianceByResourceRequest());
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus(
            DescribeConfigRuleEvaluationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRuleEvaluationStatusResult describeConfigRuleEvaluationStatus() {
        return describeConfigRuleEvaluationStatus(new DescribeConfigRuleEvaluationStatusRequest());
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules(
            DescribeConfigRulesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigRulesResult describeConfigRules() {
        return describeConfigRules(new DescribeConfigRulesRequest());
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus(
            DescribeConfigurationRecorderStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecorderStatusResult describeConfigurationRecorderStatus() {
        return describeConfigurationRecorderStatus(new DescribeConfigurationRecorderStatusRequest());
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders(
            DescribeConfigurationRecordersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeConfigurationRecordersResult describeConfigurationRecorders() {
        return describeConfigurationRecorders(new DescribeConfigurationRecordersRequest());
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus(
            DescribeDeliveryChannelStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelStatusResult describeDeliveryChannelStatus() {
        return describeDeliveryChannelStatus(new DescribeDeliveryChannelStatusRequest());
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels(
            DescribeDeliveryChannelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeDeliveryChannelsResult describeDeliveryChannels() {
        return describeDeliveryChannels(new DescribeDeliveryChannelsRequest());
    }

    @Override
    public GetComplianceDetailsByConfigRuleResult getComplianceDetailsByConfigRule(
            GetComplianceDetailsByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceDetailsByResourceResult getComplianceDetailsByResource(
            GetComplianceDetailsByResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule(
            GetComplianceSummaryByConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByConfigRuleResult getComplianceSummaryByConfigRule() {
        return getComplianceSummaryByConfigRule(new GetComplianceSummaryByConfigRuleRequest());
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType(
            GetComplianceSummaryByResourceTypeRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetComplianceSummaryByResourceTypeResult getComplianceSummaryByResourceType() {
        return getComplianceSummaryByResourceType(new GetComplianceSummaryByResourceTypeRequest());
    }

    @Override
    public GetResourceConfigHistoryResult getResourceConfigHistory(
            GetResourceConfigHistoryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDiscoveredResourcesResult listDiscoveredResources(
            ListDiscoveredResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putConfigRule(PutConfigRuleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putConfigurationRecorder(PutConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putDeliveryChannel(PutDeliveryChannelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutEvaluationsResult putEvaluations(PutEvaluationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void startConfigurationRecorder(
            StartConfigurationRecorderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void stopConfigurationRecorder(
            StopConfigurationRecorderRequest request) {
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
