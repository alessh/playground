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
package com.amazonaws.services.cloudfront;

import com.amazonaws.services.cloudfront.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonCloudFront}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonCloudFront implements AmazonCloudFront {

    protected AbstractAmazonCloudFront() {
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
    public CreateCloudFrontOriginAccessIdentityResult createCloudFrontOriginAccessIdentity(
            CreateCloudFrontOriginAccessIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDistributionResult createDistribution(
            CreateDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInvalidationResult createInvalidation(
            CreateInvalidationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStreamingDistributionResult createStreamingDistribution(
            CreateStreamingDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteCloudFrontOriginAccessIdentity(
            DeleteCloudFrontOriginAccessIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteDistribution(DeleteDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteStreamingDistribution(
            DeleteStreamingDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCloudFrontOriginAccessIdentityResult getCloudFrontOriginAccessIdentity(
            GetCloudFrontOriginAccessIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCloudFrontOriginAccessIdentityConfigResult getCloudFrontOriginAccessIdentityConfig(
            GetCloudFrontOriginAccessIdentityConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDistributionResult getDistribution(GetDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDistributionConfigResult getDistributionConfig(
            GetDistributionConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInvalidationResult getInvalidation(GetInvalidationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStreamingDistributionResult getStreamingDistribution(
            GetStreamingDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStreamingDistributionConfigResult getStreamingDistributionConfig(
            GetStreamingDistributionConfigRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListCloudFrontOriginAccessIdentitiesResult listCloudFrontOriginAccessIdentities(
            ListCloudFrontOriginAccessIdentitiesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDistributionsResult listDistributions(
            ListDistributionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListDistributionsByWebACLIdResult listDistributionsByWebACLId(
            ListDistributionsByWebACLIdRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInvalidationsResult listInvalidations(
            ListInvalidationsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListStreamingDistributionsResult listStreamingDistributions(
            ListStreamingDistributionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateCloudFrontOriginAccessIdentityResult updateCloudFrontOriginAccessIdentity(
            UpdateCloudFrontOriginAccessIdentityRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDistributionResult updateDistribution(
            UpdateDistributionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStreamingDistributionResult updateStreamingDistribution(
            UpdateStreamingDistributionRequest request) {
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
