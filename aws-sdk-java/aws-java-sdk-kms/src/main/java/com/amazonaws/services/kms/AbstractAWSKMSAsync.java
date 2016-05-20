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
package com.amazonaws.services.kms;

import com.amazonaws.services.kms.model.*;

/**
 * Abstract implementation of {@code AWSKMSAsync}. Convenient method forms pass
 * through to the corresponding overload that takes a request object and an
 * {@code AsyncHandler}, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSKMSAsync extends AbstractAWSKMS implements AWSKMSAsync {

    protected AbstractAWSKMSAsync() {
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            CancelKeyDeletionRequest request) {

        return cancelKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CancelKeyDeletionResult> cancelKeyDeletionAsync(
            CancelKeyDeletionRequest request,
            com.amazonaws.handlers.AsyncHandler<CancelKeyDeletionRequest, CancelKeyDeletionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> createAliasAsync(
            CreateAliasRequest request) {

        return createAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createAliasAsync(
            CreateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAliasRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            CreateGrantRequest request) {

        return createGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGrantResult> createGrantAsync(
            CreateGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGrantRequest, CreateGrantResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            CreateKeyRequest request) {

        return createKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            CreateKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateKey operation.
     *
     * @see #createKeyAsync(CreateKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync() {

        return createKeyAsync(new CreateKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateKey operation with an
     * AsyncHandler.
     *
     * @see #createKeyAsync(CreateKeyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateKeyResult> createKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateKeyRequest, CreateKeyResult> asyncHandler) {

        return createKeyAsync(new CreateKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(
            DecryptRequest request) {

        return decryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DecryptResult> decryptAsync(
            DecryptRequest request,
            com.amazonaws.handlers.AsyncHandler<DecryptRequest, DecryptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest request) {

        return deleteAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAliasAsync(
            DeleteAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAliasRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            DescribeKeyRequest request) {

        return describeKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<DescribeKeyResult> describeKeyAsync(
            DescribeKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DescribeKeyRequest, DescribeKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyAsync(
            DisableKeyRequest request) {

        return disableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyAsync(
            DisableKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyRotationAsync(
            DisableKeyRotationRequest request) {

        return disableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> disableKeyRotationAsync(
            DisableKeyRotationRequest request,
            com.amazonaws.handlers.AsyncHandler<DisableKeyRotationRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyAsync(
            EnableKeyRequest request) {

        return enableKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyAsync(
            EnableKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyRotationAsync(
            EnableKeyRotationRequest request) {

        return enableKeyRotationAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableKeyRotationAsync(
            EnableKeyRotationRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableKeyRotationRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(
            EncryptRequest request) {

        return encryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<EncryptResult> encryptAsync(
            EncryptRequest request,
            com.amazonaws.handlers.AsyncHandler<EncryptRequest, EncryptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            GenerateDataKeyRequest request) {

        return generateDataKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyResult> generateDataKeyAsync(
            GenerateDataKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyRequest, GenerateDataKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request) {

        return generateDataKeyWithoutPlaintextAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateDataKeyWithoutPlaintextResult> generateDataKeyWithoutPlaintextAsync(
            GenerateDataKeyWithoutPlaintextRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateDataKeyWithoutPlaintextRequest, GenerateDataKeyWithoutPlaintextResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            GenerateRandomRequest request) {

        return generateRandomAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            GenerateRandomRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation.
     *
     * @see #generateRandomAsync(GenerateRandomRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync() {

        return generateRandomAsync(new GenerateRandomRequest());
    }

    /**
     * Simplified method form for invoking the GenerateRandom operation with an
     * AsyncHandler.
     *
     * @see #generateRandomAsync(GenerateRandomRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GenerateRandomResult> generateRandomAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateRandomRequest, GenerateRandomResult> asyncHandler) {

        return generateRandomAsync(new GenerateRandomRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            GetKeyPolicyRequest request) {

        return getKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyPolicyResult> getKeyPolicyAsync(
            GetKeyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyPolicyRequest, GetKeyPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            GetKeyRotationStatusRequest request) {

        return getKeyRotationStatusAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetKeyRotationStatusResult> getKeyRotationStatusAsync(
            GetKeyRotationStatusRequest request,
            com.amazonaws.handlers.AsyncHandler<GetKeyRotationStatusRequest, GetKeyRotationStatusResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest request) {

        return listAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            ListAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAliases operation.
     *
     * @see #listAliasesAsync(ListAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync() {

        return listAliasesAsync(new ListAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAliases operation with an
     * AsyncHandler.
     *
     * @see #listAliasesAsync(ListAliasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAliasesResult> listAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAliasesRequest, ListAliasesResult> asyncHandler) {

        return listAliasesAsync(new ListAliasesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            ListGrantsRequest request) {

        return listGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGrantsResult> listGrantsAsync(
            ListGrantsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGrantsRequest, ListGrantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            ListKeyPoliciesRequest request) {

        return listKeyPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeyPoliciesResult> listKeyPoliciesAsync(
            ListKeyPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeyPoliciesRequest, ListKeyPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            ListKeysRequest request) {

        return listKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            ListKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListKeys operation.
     *
     * @see #listKeysAsync(ListKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync() {

        return listKeysAsync(new ListKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListKeys operation with an
     * AsyncHandler.
     *
     * @see #listKeysAsync(ListKeysRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListKeysResult> listKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListKeysRequest, ListKeysResult> asyncHandler) {

        return listKeysAsync(new ListKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            ListRetirableGrantsRequest request) {

        return listRetirableGrantsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRetirableGrantsResult> listRetirableGrantsAsync(
            ListRetirableGrantsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRetirableGrantsRequest, ListRetirableGrantsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putKeyPolicyAsync(
            PutKeyPolicyRequest request) {

        return putKeyPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putKeyPolicyAsync(
            PutKeyPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutKeyPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            ReEncryptRequest request) {

        return reEncryptAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ReEncryptResult> reEncryptAsync(
            ReEncryptRequest request,
            com.amazonaws.handlers.AsyncHandler<ReEncryptRequest, ReEncryptResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> retireGrantAsync(
            RetireGrantRequest request) {

        return retireGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> retireGrantAsync(
            RetireGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the RetireGrant operation.
     *
     * @see #retireGrantAsync(RetireGrantRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> retireGrantAsync() {

        return retireGrantAsync(new RetireGrantRequest());
    }

    /**
     * Simplified method form for invoking the RetireGrant operation with an
     * AsyncHandler.
     *
     * @see #retireGrantAsync(RetireGrantRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> retireGrantAsync(
            com.amazonaws.handlers.AsyncHandler<RetireGrantRequest, Void> asyncHandler) {

        return retireGrantAsync(new RetireGrantRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> revokeGrantAsync(
            RevokeGrantRequest request) {

        return revokeGrantAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> revokeGrantAsync(
            RevokeGrantRequest request,
            com.amazonaws.handlers.AsyncHandler<RevokeGrantRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            ScheduleKeyDeletionRequest request) {

        return scheduleKeyDeletionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ScheduleKeyDeletionResult> scheduleKeyDeletionAsync(
            ScheduleKeyDeletionRequest request,
            com.amazonaws.handlers.AsyncHandler<ScheduleKeyDeletionRequest, ScheduleKeyDeletionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAliasAsync(
            UpdateAliasRequest request) {

        return updateAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAliasAsync(
            UpdateAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAliasRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            UpdateKeyDescriptionRequest request) {

        return updateKeyDescriptionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateKeyDescriptionAsync(
            UpdateKeyDescriptionRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateKeyDescriptionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
