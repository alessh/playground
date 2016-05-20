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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AWSKMS}. Convenient method forms pass
 * through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAWSKMS implements AWSKMS {

    protected AbstractAWSKMS() {
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
    public CancelKeyDeletionResult cancelKeyDeletion(
            CancelKeyDeletionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void createAlias(CreateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGrantResult createGrant(CreateGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeyResult createKey(CreateKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateKeyResult createKey() {
        return createKey(new CreateKeyRequest());
    }

    @Override
    public DecryptResult decrypt(DecryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAlias(DeleteAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public DescribeKeyResult describeKey(DescribeKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void disableKey(DisableKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void disableKeyRotation(DisableKeyRotationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void enableKey(EnableKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void enableKeyRotation(EnableKeyRotationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public EncryptResult encrypt(EncryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateDataKeyResult generateDataKey(GenerateDataKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateDataKeyWithoutPlaintextResult generateDataKeyWithoutPlaintext(
            GenerateDataKeyWithoutPlaintextRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateRandomResult generateRandom(GenerateRandomRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateRandomResult generateRandom() {
        return generateRandom(new GenerateRandomRequest());
    }

    @Override
    public GetKeyPolicyResult getKeyPolicy(GetKeyPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetKeyRotationStatusResult getKeyRotationStatus(
            GetKeyRotationStatusRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases(ListAliasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAliasesResult listAliases() {
        return listAliases(new ListAliasesRequest());
    }

    @Override
    public ListGrantsResult listGrants(ListGrantsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeyPoliciesResult listKeyPolicies(ListKeyPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeysResult listKeys(ListKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListKeysResult listKeys() {
        return listKeys(new ListKeysRequest());
    }

    @Override
    public ListRetirableGrantsResult listRetirableGrants(
            ListRetirableGrantsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putKeyPolicy(PutKeyPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ReEncryptResult reEncrypt(ReEncryptRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void retireGrant(RetireGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void retireGrant() {
        retireGrant(new RetireGrantRequest());
    }

    @Override
    public void revokeGrant(RevokeGrantRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ScheduleKeyDeletionResult scheduleKeyDeletion(
            ScheduleKeyDeletionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateAlias(UpdateAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateKeyDescription(UpdateKeyDescriptionRequest request) {
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
