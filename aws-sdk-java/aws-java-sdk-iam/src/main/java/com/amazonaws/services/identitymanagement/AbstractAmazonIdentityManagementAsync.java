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
package com.amazonaws.services.identitymanagement;

import com.amazonaws.services.identitymanagement.model.*;

/**
 * Abstract implementation of {@code AmazonIdentityManagementAsync}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object and an {@code AsyncHandler}, which throws an
 * {@code UnsupportedOperationException}.
 */
public class AbstractAmazonIdentityManagementAsync extends
        AbstractAmazonIdentityManagement implements
        AmazonIdentityManagementAsync {

    protected AbstractAmazonIdentityManagementAsync() {
    }

    @Override
    public java.util.concurrent.Future<Void> addClientIDToOpenIDConnectProviderAsync(
            AddClientIDToOpenIDConnectProviderRequest request) {

        return addClientIDToOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addClientIDToOpenIDConnectProviderAsync(
            AddClientIDToOpenIDConnectProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<AddClientIDToOpenIDConnectProviderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> addRoleToInstanceProfileAsync(
            AddRoleToInstanceProfileRequest request) {

        return addRoleToInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addRoleToInstanceProfileAsync(
            AddRoleToInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<AddRoleToInstanceProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> addUserToGroupAsync(
            AddUserToGroupRequest request) {

        return addUserToGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> addUserToGroupAsync(
            AddUserToGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<AddUserToGroupRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> attachGroupPolicyAsync(
            AttachGroupPolicyRequest request) {

        return attachGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachGroupPolicyAsync(
            AttachGroupPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachGroupPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> attachRolePolicyAsync(
            AttachRolePolicyRequest request) {

        return attachRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachRolePolicyAsync(
            AttachRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachRolePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> attachUserPolicyAsync(
            AttachUserPolicyRequest request) {

        return attachUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> attachUserPolicyAsync(
            AttachUserPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<AttachUserPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> changePasswordAsync(
            ChangePasswordRequest request) {

        return changePasswordAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> changePasswordAsync(
            ChangePasswordRequest request,
            com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            CreateAccessKeyRequest request) {

        return createAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            CreateAccessKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the CreateAccessKey operation.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest)
     */
    @Override
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync() {

        return createAccessKeyAsync(new CreateAccessKeyRequest());
    }

    /**
     * Simplified method form for invoking the CreateAccessKey operation with an
     * AsyncHandler.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler) {

        return createAccessKeyAsync(new CreateAccessKeyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> createAccountAliasAsync(
            CreateAccountAliasRequest request) {

        return createAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> createAccountAliasAsync(
            CreateAccountAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateAccountAliasRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(
            CreateGroupRequest request) {

        return createGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateGroupResult> createGroupAsync(
            CreateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(
            CreateInstanceProfileRequest request) {

        return createInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(
            CreateInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(
            CreateLoginProfileRequest request) {

        return createLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(
            CreateLoginProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateLoginProfileRequest, CreateLoginProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(
            CreateOpenIDConnectProviderRequest request) {

        return createOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(
            CreateOpenIDConnectProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateOpenIDConnectProviderRequest, CreateOpenIDConnectProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest request) {

        return createPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest request) {

        return createPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateRoleResult> createRoleAsync(
            CreateRoleRequest request) {

        return createRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateRoleResult> createRoleAsync(
            CreateRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateRoleRequest, CreateRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(
            CreateSAMLProviderRequest request) {

        return createSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(
            CreateSAMLProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateSAMLProviderRequest, CreateSAMLProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(
            CreateUserRequest request) {

        return createUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateUserResult> createUserAsync(
            CreateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(
            CreateVirtualMFADeviceRequest request) {

        return createVirtualMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(
            CreateVirtualMFADeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualMFADeviceRequest, CreateVirtualMFADeviceResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deactivateMFADeviceAsync(
            DeactivateMFADeviceRequest request) {

        return deactivateMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deactivateMFADeviceAsync(
            DeactivateMFADeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeactivateMFADeviceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccessKeyAsync(
            DeleteAccessKeyRequest request) {

        return deleteAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccessKeyAsync(
            DeleteAccessKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccountAliasAsync(
            DeleteAccountAliasRequest request) {

        return deleteAccountAliasAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccountAliasAsync(
            DeleteAccountAliasRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            DeleteAccountPasswordPolicyRequest request) {

        return deleteAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            DeleteAccountPasswordPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy
     * operation.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest)
     */
    @Override
    public java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync() {

        return deleteAccountPasswordPolicyAsync(new DeleteAccountPasswordPolicyRequest());
    }

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy
     * operation with an AsyncHandler.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, Void> asyncHandler) {

        return deleteAccountPasswordPolicyAsync(
                new DeleteAccountPasswordPolicyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteGroupAsync(
            DeleteGroupRequest request) {

        return deleteGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteGroupAsync(
            DeleteGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteGroupPolicyAsync(
            DeleteGroupPolicyRequest request) {

        return deleteGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteGroupPolicyAsync(
            DeleteGroupPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteInstanceProfileAsync(
            DeleteInstanceProfileRequest request) {

        return deleteInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteInstanceProfileAsync(
            DeleteInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLoginProfileAsync(
            DeleteLoginProfileRequest request) {

        return deleteLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteLoginProfileAsync(
            DeleteLoginProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteLoginProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteOpenIDConnectProviderAsync(
            DeleteOpenIDConnectProviderRequest request) {

        return deleteOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteOpenIDConnectProviderAsync(
            DeleteOpenIDConnectProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteOpenIDConnectProviderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request) {

        return deletePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest request) {

        return deletePolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRoleAsync(
            DeleteRoleRequest request) {

        return deleteRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRoleAsync(
            DeleteRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRoleRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRolePolicyAsync(
            DeleteRolePolicyRequest request) {

        return deleteRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteRolePolicyAsync(
            DeleteRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteRolePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSAMLProviderAsync(
            DeleteSAMLProviderRequest request) {

        return deleteSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSAMLProviderAsync(
            DeleteSAMLProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSAMLProviderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSSHPublicKeyAsync(
            DeleteSSHPublicKeyRequest request) {

        return deleteSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSSHPublicKeyAsync(
            DeleteSSHPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSSHPublicKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteServerCertificateAsync(
            DeleteServerCertificateRequest request) {

        return deleteServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteServerCertificateAsync(
            DeleteServerCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteServerCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSigningCertificateAsync(
            DeleteSigningCertificateRequest request) {

        return deleteSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteSigningCertificateAsync(
            DeleteSigningCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteSigningCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserAsync(
            DeleteUserRequest request) {

        return deleteUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserAsync(
            DeleteUserRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserPolicyAsync(
            DeleteUserPolicyRequest request) {

        return deleteUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteUserPolicyAsync(
            DeleteUserPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> deleteVirtualMFADeviceAsync(
            DeleteVirtualMFADeviceRequest request) {

        return deleteVirtualMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> deleteVirtualMFADeviceAsync(
            DeleteVirtualMFADeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualMFADeviceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> detachGroupPolicyAsync(
            DetachGroupPolicyRequest request) {

        return detachGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachGroupPolicyAsync(
            DetachGroupPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachGroupPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> detachRolePolicyAsync(
            DetachRolePolicyRequest request) {

        return detachRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachRolePolicyAsync(
            DetachRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachRolePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> detachUserPolicyAsync(
            DetachUserPolicyRequest request) {

        return detachUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> detachUserPolicyAsync(
            DetachUserPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<DetachUserPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> enableMFADeviceAsync(
            EnableMFADeviceRequest request) {

        return enableMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> enableMFADeviceAsync(
            EnableMFADeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<EnableMFADeviceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            GenerateCredentialReportRequest request) {

        return generateCredentialReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            GenerateCredentialReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GenerateCredentialReport
     * operation.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest)
     */
    @Override
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync() {

        return generateCredentialReportAsync(new GenerateCredentialReportRequest());
    }

    /**
     * Simplified method form for invoking the GenerateCredentialReport
     * operation with an AsyncHandler.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler) {

        return generateCredentialReportAsync(
                new GenerateCredentialReportRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(
            GetAccessKeyLastUsedRequest request) {

        return getAccessKeyLastUsedAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(
            GetAccessKeyLastUsedRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccessKeyLastUsedRequest, GetAccessKeyLastUsedResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            GetAccountAuthorizationDetailsRequest request) {

        return getAccountAuthorizationDetailsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            GetAccountAuthorizationDetailsRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails
     * operation.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync() {

        return getAccountAuthorizationDetailsAsync(new GetAccountAuthorizationDetailsRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails
     * operation with an AsyncHandler.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler) {

        return getAccountAuthorizationDetailsAsync(
                new GetAccountAuthorizationDetailsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            GetAccountPasswordPolicyRequest request) {

        return getAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            GetAccountPasswordPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy
     * operation.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync() {

        return getAccountPasswordPolicyAsync(new GetAccountPasswordPolicyRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy
     * operation with an AsyncHandler.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler) {

        return getAccountPasswordPolicyAsync(
                new GetAccountPasswordPolicyRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            GetAccountSummaryRequest request) {

        return getAccountSummaryAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            GetAccountSummaryRequest request,
            com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetAccountSummary operation.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest)
     */
    @Override
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync() {

        return getAccountSummaryAsync(new GetAccountSummaryRequest());
    }

    /**
     * Simplified method form for invoking the GetAccountSummary operation with
     * an AsyncHandler.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler) {

        return getAccountSummaryAsync(new GetAccountSummaryRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(
            GetContextKeysForCustomPolicyRequest request) {

        return getContextKeysForCustomPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(
            GetContextKeysForCustomPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContextKeysForCustomPolicyRequest, GetContextKeysForCustomPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            GetContextKeysForPrincipalPolicyRequest request) {

        return getContextKeysForPrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            GetContextKeysForPrincipalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetContextKeysForPrincipalPolicyRequest, GetContextKeysForPrincipalPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            GetCredentialReportRequest request) {

        return getCredentialReportAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            GetCredentialReportRequest request,
            com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetCredentialReport operation.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest)
     */
    @Override
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync() {

        return getCredentialReportAsync(new GetCredentialReportRequest());
    }

    /**
     * Simplified method form for invoking the GetCredentialReport operation
     * with an AsyncHandler.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler) {

        return getCredentialReportAsync(new GetCredentialReportRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(
            GetGroupRequest request) {

        return getGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupResult> getGroupAsync(
            GetGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(
            GetGroupPolicyRequest request) {

        return getGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(
            GetGroupPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetGroupPolicyRequest, GetGroupPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(
            GetInstanceProfileRequest request) {

        return getInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(
            GetInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetInstanceProfileRequest, GetInstanceProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(
            GetLoginProfileRequest request) {

        return getLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(
            GetLoginProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<GetLoginProfileRequest, GetLoginProfileResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(
            GetOpenIDConnectProviderRequest request) {

        return getOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(
            GetOpenIDConnectProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<GetOpenIDConnectProviderRequest, GetOpenIDConnectProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest request) {

        return getPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest request) {

        return getPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRoleResult> getRoleAsync(
            GetRoleRequest request) {

        return getRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRoleResult> getRoleAsync(
            GetRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRoleRequest, GetRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(
            GetRolePolicyRequest request) {

        return getRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(
            GetRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetRolePolicyRequest, GetRolePolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(
            GetSAMLProviderRequest request) {

        return getSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(
            GetSAMLProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSAMLProviderRequest, GetSAMLProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(
            GetSSHPublicKeyRequest request) {

        return getSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(
            GetSSHPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetSSHPublicKeyRequest, GetSSHPublicKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(
            GetServerCertificateRequest request) {

        return getServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(
            GetServerCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<GetServerCertificateRequest, GetServerCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest request) {

        return getUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the GetUser operation.
     *
     * @see #getUserAsync(GetUserRequest)
     */
    @Override
    public java.util.concurrent.Future<GetUserResult> getUserAsync() {

        return getUserAsync(new GetUserRequest());
    }

    /**
     * Simplified method form for invoking the GetUser operation with an
     * AsyncHandler.
     *
     * @see #getUserAsync(GetUserRequest, com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<GetUserResult> getUserAsync(
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler) {

        return getUserAsync(new GetUserRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(
            GetUserPolicyRequest request) {

        return getUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(
            GetUserPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<GetUserPolicyRequest, GetUserPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            ListAccessKeysRequest request) {

        return listAccessKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            ListAccessKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAccessKeys operation.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync() {

        return listAccessKeysAsync(new ListAccessKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListAccessKeys operation with an
     * AsyncHandler.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler) {

        return listAccessKeysAsync(new ListAccessKeysRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            ListAccountAliasesRequest request) {

        return listAccountAliasesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            ListAccountAliasesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListAccountAliases operation.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync() {

        return listAccountAliasesAsync(new ListAccountAliasesRequest());
    }

    /**
     * Simplified method form for invoking the ListAccountAliases operation with
     * an AsyncHandler.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler) {

        return listAccountAliasesAsync(new ListAccountAliasesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(
            ListAttachedGroupPoliciesRequest request) {

        return listAttachedGroupPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(
            ListAttachedGroupPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedGroupPoliciesRequest, ListAttachedGroupPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(
            ListAttachedRolePoliciesRequest request) {

        return listAttachedRolePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(
            ListAttachedRolePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedRolePoliciesRequest, ListAttachedRolePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(
            ListAttachedUserPoliciesRequest request) {

        return listAttachedUserPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(
            ListAttachedUserPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListAttachedUserPoliciesRequest, ListAttachedUserPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(
            ListEntitiesForPolicyRequest request) {

        return listEntitiesForPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(
            ListEntitiesForPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(
            ListGroupPoliciesRequest request) {

        return listGroupPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(
            ListGroupPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupPoliciesRequest, ListGroupPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            ListGroupsRequest request) {

        return listGroupsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            ListGroupsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListGroups operation.
     *
     * @see #listGroupsAsync(ListGroupsRequest)
     */
    @Override
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync() {

        return listGroupsAsync(new ListGroupsRequest());
    }

    /**
     * Simplified method form for invoking the ListGroups operation with an
     * AsyncHandler.
     *
     * @see #listGroupsAsync(ListGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler) {

        return listGroupsAsync(new ListGroupsRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(
            ListGroupsForUserRequest request) {

        return listGroupsForUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(
            ListGroupsForUserRequest request,
            com.amazonaws.handlers.AsyncHandler<ListGroupsForUserRequest, ListGroupsForUserResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            ListInstanceProfilesRequest request) {

        return listInstanceProfilesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            ListInstanceProfilesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync() {

        return listInstanceProfilesAsync(new ListInstanceProfilesRequest());
    }

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation
     * with an AsyncHandler.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler) {

        return listInstanceProfilesAsync(new ListInstanceProfilesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(
            ListInstanceProfilesForRoleRequest request) {

        return listInstanceProfilesForRoleAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(
            ListInstanceProfilesForRoleRequest request,
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesForRoleRequest, ListInstanceProfilesForRoleResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            ListMFADevicesRequest request) {

        return listMFADevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            ListMFADevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListMFADevices operation.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync() {

        return listMFADevicesAsync(new ListMFADevicesRequest());
    }

    /**
     * Simplified method form for invoking the ListMFADevices operation with an
     * AsyncHandler.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler) {

        return listMFADevicesAsync(new ListMFADevicesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            ListOpenIDConnectProvidersRequest request) {

        return listOpenIDConnectProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            ListOpenIDConnectProvidersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders
     * operation.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync() {

        return listOpenIDConnectProvidersAsync(new ListOpenIDConnectProvidersRequest());
    }

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders
     * operation with an AsyncHandler.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler) {

        return listOpenIDConnectProvidersAsync(
                new ListOpenIDConnectProvidersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest request) {

        return listPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListPolicies operation.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync() {

        return listPoliciesAsync(new ListPoliciesRequest());
    }

    /**
     * Simplified method form for invoking the ListPolicies operation with an
     * AsyncHandler.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler) {

        return listPoliciesAsync(new ListPoliciesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest request) {

        return listPolicyVersionsAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest request,
            com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(
            ListRolePoliciesRequest request) {

        return listRolePoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(
            ListRolePoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRolePoliciesRequest, ListRolePoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            ListRolesRequest request) {

        return listRolesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            ListRolesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListRoles operation.
     *
     * @see #listRolesAsync(ListRolesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync() {

        return listRolesAsync(new ListRolesRequest());
    }

    /**
     * Simplified method form for invoking the ListRoles operation with an
     * AsyncHandler.
     *
     * @see #listRolesAsync(ListRolesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler) {

        return listRolesAsync(new ListRolesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            ListSAMLProvidersRequest request) {

        return listSAMLProvidersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            ListSAMLProvidersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListSAMLProviders operation.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync() {

        return listSAMLProvidersAsync(new ListSAMLProvidersRequest());
    }

    /**
     * Simplified method form for invoking the ListSAMLProviders operation with
     * an AsyncHandler.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler) {

        return listSAMLProvidersAsync(new ListSAMLProvidersRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            ListSSHPublicKeysRequest request) {

        return listSSHPublicKeysAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            ListSSHPublicKeysRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync() {

        return listSSHPublicKeysAsync(new ListSSHPublicKeysRequest());
    }

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation with
     * an AsyncHandler.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler) {

        return listSSHPublicKeysAsync(new ListSSHPublicKeysRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            ListServerCertificatesRequest request) {

        return listServerCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            ListServerCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListServerCertificates operation.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync() {

        return listServerCertificatesAsync(new ListServerCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the ListServerCertificates operation
     * with an AsyncHandler.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler) {

        return listServerCertificatesAsync(new ListServerCertificatesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            ListSigningCertificatesRequest request) {

        return listSigningCertificatesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            ListSigningCertificatesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListSigningCertificates
     * operation.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync() {

        return listSigningCertificatesAsync(new ListSigningCertificatesRequest());
    }

    /**
     * Simplified method form for invoking the ListSigningCertificates operation
     * with an AsyncHandler.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler) {

        return listSigningCertificatesAsync(
                new ListSigningCertificatesRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(
            ListUserPoliciesRequest request) {

        return listUserPoliciesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(
            ListUserPoliciesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUserPoliciesRequest, ListUserPoliciesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest request) {

        return listUsersAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest request,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListUsers operation.
     *
     * @see #listUsersAsync(ListUsersRequest)
     */
    @Override
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync() {

        return listUsersAsync(new ListUsersRequest());
    }

    /**
     * Simplified method form for invoking the ListUsers operation with an
     * AsyncHandler.
     *
     * @see #listUsersAsync(ListUsersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler) {

        return listUsersAsync(new ListUsersRequest(), asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            ListVirtualMFADevicesRequest request) {

        return listVirtualMFADevicesAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            ListVirtualMFADevicesRequest request,
            com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest)
     */
    @Override
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync() {

        return listVirtualMFADevicesAsync(new ListVirtualMFADevicesRequest());
    }

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation
     * with an AsyncHandler.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    public java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler) {

        return listVirtualMFADevicesAsync(new ListVirtualMFADevicesRequest(),
                asyncHandler);
    }

    @Override
    public java.util.concurrent.Future<Void> putGroupPolicyAsync(
            PutGroupPolicyRequest request) {

        return putGroupPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putGroupPolicyAsync(
            PutGroupPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutGroupPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putRolePolicyAsync(
            PutRolePolicyRequest request) {

        return putRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putRolePolicyAsync(
            PutRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutRolePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> putUserPolicyAsync(
            PutUserPolicyRequest request) {

        return putUserPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> putUserPolicyAsync(
            PutUserPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<PutUserPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> removeClientIDFromOpenIDConnectProviderAsync(
            RemoveClientIDFromOpenIDConnectProviderRequest request) {

        return removeClientIDFromOpenIDConnectProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removeClientIDFromOpenIDConnectProviderAsync(
            RemoveClientIDFromOpenIDConnectProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveClientIDFromOpenIDConnectProviderRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> removeRoleFromInstanceProfileAsync(
            RemoveRoleFromInstanceProfileRequest request) {

        return removeRoleFromInstanceProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removeRoleFromInstanceProfileAsync(
            RemoveRoleFromInstanceProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromInstanceProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> removeUserFromGroupAsync(
            RemoveUserFromGroupRequest request) {

        return removeUserFromGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> removeUserFromGroupAsync(
            RemoveUserFromGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<RemoveUserFromGroupRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> resyncMFADeviceAsync(
            ResyncMFADeviceRequest request) {

        return resyncMFADeviceAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> resyncMFADeviceAsync(
            ResyncMFADeviceRequest request,
            com.amazonaws.handlers.AsyncHandler<ResyncMFADeviceRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest request) {

        return setDefaultPolicyVersionAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest request,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(
            SimulateCustomPolicyRequest request) {

        return simulateCustomPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(
            SimulateCustomPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SimulateCustomPolicyRequest, SimulateCustomPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(
            SimulatePrincipalPolicyRequest request) {

        return simulatePrincipalPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(
            SimulatePrincipalPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<SimulatePrincipalPolicyRequest, SimulatePrincipalPolicyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAccessKeyAsync(
            UpdateAccessKeyRequest request) {

        return updateAccessKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAccessKeyAsync(
            UpdateAccessKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAccountPasswordPolicyAsync(
            UpdateAccountPasswordPolicyRequest request) {

        return updateAccountPasswordPolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAccountPasswordPolicyAsync(
            UpdateAccountPasswordPolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountPasswordPolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateAssumeRolePolicyAsync(
            UpdateAssumeRolePolicyRequest request) {

        return updateAssumeRolePolicyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateAssumeRolePolicyAsync(
            UpdateAssumeRolePolicyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateAssumeRolePolicyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateGroupAsync(
            UpdateGroupRequest request) {

        return updateGroupAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateGroupAsync(
            UpdateGroupRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateLoginProfileAsync(
            UpdateLoginProfileRequest request) {

        return updateLoginProfileAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateLoginProfileAsync(
            UpdateLoginProfileRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateLoginProfileRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateOpenIDConnectProviderThumbprintAsync(
            UpdateOpenIDConnectProviderThumbprintRequest request) {

        return updateOpenIDConnectProviderThumbprintAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateOpenIDConnectProviderThumbprintAsync(
            UpdateOpenIDConnectProviderThumbprintRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateOpenIDConnectProviderThumbprintRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(
            UpdateSAMLProviderRequest request) {

        return updateSAMLProviderAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(
            UpdateSAMLProviderRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSAMLProviderRequest, UpdateSAMLProviderResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateSSHPublicKeyAsync(
            UpdateSSHPublicKeyRequest request) {

        return updateSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateSSHPublicKeyAsync(
            UpdateSSHPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSSHPublicKeyRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateServerCertificateAsync(
            UpdateServerCertificateRequest request) {

        return updateServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateServerCertificateAsync(
            UpdateServerCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateServerCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateSigningCertificateAsync(
            UpdateSigningCertificateRequest request) {

        return updateSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateSigningCertificateAsync(
            UpdateSigningCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateSigningCertificateRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<Void> updateUserAsync(
            UpdateUserRequest request) {

        return updateUserAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<Void> updateUserAsync(
            UpdateUserRequest request,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, Void> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(
            UploadSSHPublicKeyRequest request) {

        return uploadSSHPublicKeyAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(
            UploadSSHPublicKeyRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadSSHPublicKeyRequest, UploadSSHPublicKeyResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(
            UploadServerCertificateRequest request) {

        return uploadServerCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(
            UploadServerCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadServerCertificateRequest, UploadServerCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(
            UploadSigningCertificateRequest request) {

        return uploadSigningCertificateAsync(request, null);
    }

    @Override
    public java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(
            UploadSigningCertificateRequest request,
            com.amazonaws.handlers.AsyncHandler<UploadSigningCertificateRequest, UploadSigningCertificateResult> asyncHandler) {

        throw new java.lang.UnsupportedOperationException();
    }

}
