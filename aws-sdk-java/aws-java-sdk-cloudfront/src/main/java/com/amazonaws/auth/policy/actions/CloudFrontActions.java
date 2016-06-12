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

package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for CloudFront.
 */

public enum CloudFrontActions implements Action {

    /** Represents any action executed on CloudFront. */
    AllCloudFrontActions("cloudfront:*"),

    /** Action for the CreateCloudFrontOriginAccessIdentity operation. */
    CreateCloudFrontOriginAccessIdentity(
            "cloudfront:CreateCloudFrontOriginAccessIdentity"),
    /** Action for the CreateDistribution operation. */
    CreateDistribution("cloudfront:CreateDistribution"),
    /** Action for the CreateInvalidation operation. */
    CreateInvalidation("cloudfront:CreateInvalidation"),
    /** Action for the CreateStreamingDistribution operation. */
    CreateStreamingDistribution("cloudfront:CreateStreamingDistribution"),
    /** Action for the DeleteCloudFrontOriginAccessIdentity operation. */
    DeleteCloudFrontOriginAccessIdentity(
            "cloudfront:DeleteCloudFrontOriginAccessIdentity"),
    /** Action for the DeleteDistribution operation. */
    DeleteDistribution("cloudfront:DeleteDistribution"),
    /** Action for the DeleteStreamingDistribution operation. */
    DeleteStreamingDistribution("cloudfront:DeleteStreamingDistribution"),
    /** Action for the GetCloudFrontOriginAccessIdentity operation. */
    GetCloudFrontOriginAccessIdentity(
            "cloudfront:GetCloudFrontOriginAccessIdentity"),
    /** Action for the GetCloudFrontOriginAccessIdentityConfig operation. */
    GetCloudFrontOriginAccessIdentityConfig(
            "cloudfront:GetCloudFrontOriginAccessIdentityConfig"),
    /** Action for the GetDistribution operation. */
    GetDistribution("cloudfront:GetDistribution"),
    /** Action for the GetDistributionConfig operation. */
    GetDistributionConfig("cloudfront:GetDistributionConfig"),
    /** Action for the GetInvalidation operation. */
    GetInvalidation("cloudfront:GetInvalidation"),
    /** Action for the GetStreamingDistribution operation. */
    GetStreamingDistribution("cloudfront:GetStreamingDistribution"),
    /** Action for the GetStreamingDistributionConfig operation. */
    GetStreamingDistributionConfig("cloudfront:GetStreamingDistributionConfig"),
    /** Action for the ListCloudFrontOriginAccessIdentities operation. */
    ListCloudFrontOriginAccessIdentities(
            "cloudfront:ListCloudFrontOriginAccessIdentities"),
    /** Action for the ListDistributions operation. */
    ListDistributions("cloudfront:ListDistributions"),
    /** Action for the ListDistributionsByWebACLId operation. */
    ListDistributionsByWebACLId("cloudfront:ListDistributionsByWebACLId"),
    /** Action for the ListInvalidations operation. */
    ListInvalidations("cloudfront:ListInvalidations"),
    /** Action for the ListStreamingDistributions operation. */
    ListStreamingDistributions("cloudfront:ListStreamingDistributions"),
    /** Action for the UpdateCloudFrontOriginAccessIdentity operation. */
    UpdateCloudFrontOriginAccessIdentity(
            "cloudfront:UpdateCloudFrontOriginAccessIdentity"),
    /** Action for the UpdateDistribution operation. */
    UpdateDistribution("cloudfront:UpdateDistribution"),
    /** Action for the UpdateStreamingDistribution operation. */
    UpdateStreamingDistribution("cloudfront:UpdateStreamingDistribution"),

    ;

    private final String action;

    private CloudFrontActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}