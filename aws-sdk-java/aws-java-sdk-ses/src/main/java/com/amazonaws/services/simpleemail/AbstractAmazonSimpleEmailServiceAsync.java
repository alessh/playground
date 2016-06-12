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
package com.amazonaws.services.simpleemail;

import com.amazonaws.services.simpleemail.model.*;

/**
 * Abstract implementation of {@code AmazonSimpleEmailServiceAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonSimpleEmailServiceAsync extends
        AbstractAmazonSimpleEmailService implements
        AmazonSimpleEmailServiceAsync {

    protected AbstractAmazonSimpleEmailServiceAsync() {
    }

    @Override
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest request) {

        return cloneReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CloneReceiptRuleSetResult> cloneReceiptRuleSetAsync(
            CloneReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CloneReceiptRuleSetRequest, CloneReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest request) {

        return createReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptFilterResult> createReceiptFilterAsync(
            CreateReceiptFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptFilterRequest, CreateReceiptFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest request) {

        return createReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleResult> createReceiptRuleAsync(
            CreateReceiptRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleRequest, CreateReceiptRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest request) {

        return createReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateReceiptRuleSetResult> createReceiptRuleSetAsync(
            CreateReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateReceiptRuleSetRequest, CreateReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(
            DeleteIdentityRequest request) {

        return deleteIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityResult> deleteIdentityAsync(
            DeleteIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityRequest, DeleteIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest request) {

        return deleteIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteIdentityPolicyResult> deleteIdentityPolicyAsync(
            DeleteIdentityPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteIdentityPolicyRequest, DeleteIdentityPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest request) {

        return deleteReceiptFilterAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptFilterResult> deleteReceiptFilterAsync(
            DeleteReceiptFilterRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptFilterRequest, DeleteReceiptFilterResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest request) {

        return deleteReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleResult> deleteReceiptRuleAsync(
            DeleteReceiptRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleRequest, DeleteReceiptRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest request) {

        return deleteReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DeleteReceiptRuleSetResult> deleteReceiptRuleSetAsync(
            DeleteReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteReceiptRuleSetRequest, DeleteReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest request) {

        return deleteVerifiedEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteVerifiedEmailAddressAsync(
            DeleteVerifiedEmailAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVerifiedEmailAddressRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest request) {

        return describeActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeActiveReceiptRuleSetResult> describeActiveReceiptRuleSetAsync(
            DescribeActiveReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeActiveReceiptRuleSetRequest, DescribeActiveReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest request) {

        return describeReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleResult> describeReceiptRuleAsync(
            DescribeReceiptRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleRequest, DescribeReceiptRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest request) {

        return describeReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeReceiptRuleSetResult> describeReceiptRuleSetAsync(
            DescribeReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeReceiptRuleSetRequest, DescribeReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest request) {

        return getIdentityDkimAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityDkimAttributesResult> getIdentityDkimAttributesAsync(
            GetIdentityDkimAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityDkimAttributesRequest, GetIdentityDkimAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest request) {

        return getIdentityMailFromDomainAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityMailFromDomainAttributesResult> getIdentityMailFromDomainAttributesAsync(
            GetIdentityMailFromDomainAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityMailFromDomainAttributesRequest, GetIdentityMailFromDomainAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest request) {

        return getIdentityNotificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityNotificationAttributesResult> getIdentityNotificationAttributesAsync(
            GetIdentityNotificationAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityNotificationAttributesRequest, GetIdentityNotificationAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest request) {

        return getIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityPoliciesResult> getIdentityPoliciesAsync(
            GetIdentityPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityPoliciesRequest, GetIdentityPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest request) {

        return getIdentityVerificationAttributesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetIdentityVerificationAttributesResult> getIdentityVerificationAttributesAsync(
            GetIdentityVerificationAttributesRequest request,
            com.amazonaws.handlers.AsyncHandler<GetIdentityVerificationAttributesRequest, GetIdentityVerificationAttributesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            GetSendQuotaRequest request) {

        return getSendQuotaAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            GetSendQuotaRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetSendQuota operation.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync() {

        return getSendQuotaAsync(new GetSendQuotaRequest());
    }

    /**
     * Simplified method form for invoking the GetSendQuota operation with an
     * AsyncHandler.
     *
     * @see #getSendQuotaAsync(GetSendQuotaRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetSendQuotaResult> getSendQuotaAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendQuotaRequest, GetSendQuotaResult> asyncHandler) {

        return getSendQuotaAsync(new GetSendQuotaRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest request) {

        return getSendStatisticsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            GetSendStatisticsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetSendStatistics operation.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync() {

        return getSendStatisticsAsync(new GetSendStatisticsRequest());
    }

    /**
     * Simplified method form for invoking the GetSendStatistics operation with
     * an AsyncHandler.
     *
     * @see #getSendStatisticsAsync(GetSendStatisticsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetSendStatisticsResult> getSendStatisticsAsync(
            com.amazonaws.handlers.AsyncHandler<GetSendStatisticsRequest, GetSendStatisticsResult> asyncHandler) {

        return getSendStatisticsAsync(new GetSendStatisticsRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            ListIdentitiesRequest request) {

        return listIdentitiesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            ListIdentitiesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListIdentities operation.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync() {

        return listIdentitiesAsync(new ListIdentitiesRequest());
    }

    /**
     * Simplified method form for invoking the ListIdentities operation with an
     * AsyncHandler.
     *
     * @see #listIdentitiesAsync(ListIdentitiesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListIdentitiesResult> listIdentitiesAsync(
            com.amazonaws.handlers.AsyncHandler<ListIdentitiesRequest, ListIdentitiesResult> asyncHandler) {

        return listIdentitiesAsync(new ListIdentitiesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest request) {

        return listIdentityPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListIdentityPoliciesResult> listIdentityPoliciesAsync(
            ListIdentityPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListIdentityPoliciesRequest, ListIdentityPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest request) {

        return listReceiptFiltersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptFiltersResult> listReceiptFiltersAsync(
            ListReceiptFiltersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReceiptFiltersRequest, ListReceiptFiltersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest request) {

        return listReceiptRuleSetsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListReceiptRuleSetsResult> listReceiptRuleSetsAsync(
            ListReceiptRuleSetsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListReceiptRuleSetsRequest, ListReceiptRuleSetsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest request) {

        return listVerifiedEmailAddressesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            ListVerifiedEmailAddressesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses
     * operation.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync() {

        return listVerifiedEmailAddressesAsync(new ListVerifiedEmailAddressesRequest());
    }

    /**
     * Simplified method form for invoking the ListVerifiedEmailAddresses
     * operation with an AsyncHandler.
     *
     * @see #listVerifiedEmailAddressesAsync(ListVerifiedEmailAddressesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListVerifiedEmailAddressesResult> listVerifiedEmailAddressesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVerifiedEmailAddressesRequest, ListVerifiedEmailAddressesResult> asyncHandler) {

        return listVerifiedEmailAddressesAsync(
                new ListVerifiedEmailAddressesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest request) {

        return putIdentityPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<PutIdentityPolicyResult> putIdentityPolicyAsync(
            PutIdentityPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutIdentityPolicyRequest, PutIdentityPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest request) {

        return reorderReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReorderReceiptRuleSetResult> reorderReceiptRuleSetAsync(
            ReorderReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<ReorderReceiptRuleSetRequest, ReorderReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(
            SendBounceRequest request) {

        return sendBounceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendBounceResult> sendBounceAsync(
            SendBounceRequest request,
            com.amazonaws.handlers.AsyncHandler<SendBounceRequest, SendBounceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(
            SendEmailRequest request) {

        return sendEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendEmailResult> sendEmailAsync(
            SendEmailRequest request,
            com.amazonaws.handlers.AsyncHandler<SendEmailRequest, SendEmailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(
            SendRawEmailRequest request) {

        return sendRawEmailAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SendRawEmailResult> sendRawEmailAsync(
            SendRawEmailRequest request,
            com.amazonaws.handlers.AsyncHandler<SendRawEmailRequest, SendRawEmailResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest request) {

        return setActiveReceiptRuleSetAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetActiveReceiptRuleSetResult> setActiveReceiptRuleSetAsync(
            SetActiveReceiptRuleSetRequest request,
            com.amazonaws.handlers.AsyncHandler<SetActiveReceiptRuleSetRequest, SetActiveReceiptRuleSetResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest request) {

        return setIdentityDkimEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityDkimEnabledResult> setIdentityDkimEnabledAsync(
            SetIdentityDkimEnabledRequest request,
            com.amazonaws.handlers.AsyncHandler<SetIdentityDkimEnabledRequest, SetIdentityDkimEnabledResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest request) {

        return setIdentityFeedbackForwardingEnabledAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityFeedbackForwardingEnabledResult> setIdentityFeedbackForwardingEnabledAsync(
            SetIdentityFeedbackForwardingEnabledRequest request,
            com.amazonaws.handlers.AsyncHandler<SetIdentityFeedbackForwardingEnabledRequest, SetIdentityFeedbackForwardingEnabledResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest request) {

        return setIdentityMailFromDomainAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityMailFromDomainResult> setIdentityMailFromDomainAsync(
            SetIdentityMailFromDomainRequest request,
            com.amazonaws.handlers.AsyncHandler<SetIdentityMailFromDomainRequest, SetIdentityMailFromDomainResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest request) {

        return setIdentityNotificationTopicAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetIdentityNotificationTopicResult> setIdentityNotificationTopicAsync(
            SetIdentityNotificationTopicRequest request,
            com.amazonaws.handlers.AsyncHandler<SetIdentityNotificationTopicRequest, SetIdentityNotificationTopicResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest request) {

        return setReceiptRulePositionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SetReceiptRulePositionResult> setReceiptRulePositionAsync(
            SetReceiptRulePositionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetReceiptRulePositionRequest, SetReceiptRulePositionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest request) {

        return updateReceiptRuleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateReceiptRuleResult> updateReceiptRuleAsync(
            UpdateReceiptRuleRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateReceiptRuleRequest, UpdateReceiptRuleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest request) {

        return verifyDomainDkimAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainDkimResult> verifyDomainDkimAsync(
            VerifyDomainDkimRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainDkimRequest, VerifyDomainDkimResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest request) {

        return verifyDomainIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyDomainIdentityResult> verifyDomainIdentityAsync(
            VerifyDomainIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyDomainIdentityRequest, VerifyDomainIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> verifyEmailAddressAsync(
            VerifyEmailAddressRequest request) {

        return verifyEmailAddressAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> verifyEmailAddressAsync(
            VerifyEmailAddressRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailAddressRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest request) {

        return verifyEmailIdentityAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<VerifyEmailIdentityResult> verifyEmailIdentityAsync(
            VerifyEmailIdentityRequest request,
            com.amazonaws.handlers.AsyncHandler<VerifyEmailIdentityRequest, VerifyEmailIdentityResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
