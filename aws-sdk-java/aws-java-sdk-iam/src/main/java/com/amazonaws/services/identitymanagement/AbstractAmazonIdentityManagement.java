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
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonIdentityManagement}. Convenient
 * method forms pass through to the corresponding overload that takes a request
 * object, which throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonIdentityManagement implements
        AmazonIdentityManagement {

    protected AbstractAmazonIdentityManagement() {
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
    public void addClientIDToOpenIDConnectProvider(
            AddClientIDToOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addRoleToInstanceProfile(AddRoleToInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void addUserToGroup(AddUserToGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void attachGroupPolicy(AttachGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void attachRolePolicy(AttachRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void attachUserPolicy(AttachUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void changePassword(ChangePasswordRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAccessKeyResult createAccessKey(CreateAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAccessKeyResult createAccessKey() {
        return createAccessKey(new CreateAccessKeyRequest());
    }

    @Override
    public void createAccountAlias(CreateAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateGroupResult createGroup(CreateGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateInstanceProfileResult createInstanceProfile(
            CreateInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateLoginProfileResult createLoginProfile(
            CreateLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateOpenIDConnectProviderResult createOpenIDConnectProvider(
            CreateOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyResult createPolicy(CreatePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreatePolicyVersionResult createPolicyVersion(
            CreatePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRoleResult createRole(CreateRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateSAMLProviderResult createSAMLProvider(
            CreateSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateUserResult createUser(CreateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateVirtualMFADeviceResult createVirtualMFADevice(
            CreateVirtualMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deactivateMFADevice(DeactivateMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAccessKey(DeleteAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAccountAlias(DeleteAccountAliasRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAccountPasswordPolicy(
            DeleteAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAccountPasswordPolicy() {
        deleteAccountPasswordPolicy(new DeleteAccountPasswordPolicyRequest());
    }

    @Override
    public void deleteGroup(DeleteGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteGroupPolicy(DeleteGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteInstanceProfile(DeleteInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteLoginProfile(DeleteLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteOpenIDConnectProvider(
            DeleteOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deletePolicy(DeletePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deletePolicyVersion(DeletePolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteRole(DeleteRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteRolePolicy(DeleteRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteSAMLProvider(DeleteSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteSSHPublicKey(DeleteSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteServerCertificate(DeleteServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteSigningCertificate(DeleteSigningCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUser(DeleteUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteUserPolicy(DeleteUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void detachGroupPolicy(DetachGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void detachRolePolicy(DetachRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void detachUserPolicy(DetachUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void enableMFADevice(EnableMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateCredentialReportResult generateCredentialReport(
            GenerateCredentialReportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateCredentialReportResult generateCredentialReport() {
        return generateCredentialReport(new GenerateCredentialReportRequest());
    }

    @Override
    public GetAccessKeyLastUsedResult getAccessKeyLastUsed(
            GetAccessKeyLastUsedRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails(
            GetAccountAuthorizationDetailsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountAuthorizationDetailsResult getAccountAuthorizationDetails() {
        return getAccountAuthorizationDetails(new GetAccountAuthorizationDetailsRequest());
    }

    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy(
            GetAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountPasswordPolicyResult getAccountPasswordPolicy() {
        return getAccountPasswordPolicy(new GetAccountPasswordPolicyRequest());
    }

    @Override
    public GetAccountSummaryResult getAccountSummary(
            GetAccountSummaryRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountSummaryResult getAccountSummary() {
        return getAccountSummary(new GetAccountSummaryRequest());
    }

    @Override
    public GetContextKeysForCustomPolicyResult getContextKeysForCustomPolicy(
            GetContextKeysForCustomPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetContextKeysForPrincipalPolicyResult getContextKeysForPrincipalPolicy(
            GetContextKeysForPrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCredentialReportResult getCredentialReport(
            GetCredentialReportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetCredentialReportResult getCredentialReport() {
        return getCredentialReport(new GetCredentialReportRequest());
    }

    @Override
    public GetGroupResult getGroup(GetGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetGroupPolicyResult getGroupPolicy(GetGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetInstanceProfileResult getInstanceProfile(
            GetInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetLoginProfileResult getLoginProfile(GetLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetOpenIDConnectProviderResult getOpenIDConnectProvider(
            GetOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyResult getPolicy(GetPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetPolicyVersionResult getPolicyVersion(
            GetPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRoleResult getRole(GetRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRolePolicyResult getRolePolicy(GetRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSAMLProviderResult getSAMLProvider(GetSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSSHPublicKeyResult getSSHPublicKey(GetSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetServerCertificateResult getServerCertificate(
            GetServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserResult getUser(GetUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetUserResult getUser() {
        return getUser(new GetUserRequest());
    }

    @Override
    public GetUserPolicyResult getUserPolicy(GetUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccessKeysResult listAccessKeys(ListAccessKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccessKeysResult listAccessKeys() {
        return listAccessKeys(new ListAccessKeysRequest());
    }

    @Override
    public ListAccountAliasesResult listAccountAliases(
            ListAccountAliasesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAccountAliasesResult listAccountAliases() {
        return listAccountAliases(new ListAccountAliasesRequest());
    }

    @Override
    public ListAttachedGroupPoliciesResult listAttachedGroupPolicies(
            ListAttachedGroupPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedRolePoliciesResult listAttachedRolePolicies(
            ListAttachedRolePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListAttachedUserPoliciesResult listAttachedUserPolicies(
            ListAttachedUserPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListEntitiesForPolicyResult listEntitiesForPolicy(
            ListEntitiesForPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupPoliciesResult listGroupPolicies(
            ListGroupPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupsResult listGroups(ListGroupsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListGroupsResult listGroups() {
        return listGroups(new ListGroupsRequest());
    }

    @Override
    public ListGroupsForUserResult listGroupsForUser(
            ListGroupsForUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstanceProfilesResult listInstanceProfiles(
            ListInstanceProfilesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListInstanceProfilesResult listInstanceProfiles() {
        return listInstanceProfiles(new ListInstanceProfilesRequest());
    }

    @Override
    public ListInstanceProfilesForRoleResult listInstanceProfilesForRole(
            ListInstanceProfilesForRoleRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMFADevicesResult listMFADevices(ListMFADevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListMFADevicesResult listMFADevices() {
        return listMFADevices(new ListMFADevicesRequest());
    }

    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders(
            ListOpenIDConnectProvidersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListOpenIDConnectProvidersResult listOpenIDConnectProviders() {
        return listOpenIDConnectProviders(new ListOpenIDConnectProvidersRequest());
    }

    @Override
    public ListPoliciesResult listPolicies(ListPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListPoliciesResult listPolicies() {
        return listPolicies(new ListPoliciesRequest());
    }

    @Override
    public ListPolicyVersionsResult listPolicyVersions(
            ListPolicyVersionsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolePoliciesResult listRolePolicies(
            ListRolePoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolesResult listRoles(ListRolesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListRolesResult listRoles() {
        return listRoles(new ListRolesRequest());
    }

    @Override
    public ListSAMLProvidersResult listSAMLProviders(
            ListSAMLProvidersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSAMLProvidersResult listSAMLProviders() {
        return listSAMLProviders(new ListSAMLProvidersRequest());
    }

    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys(
            ListSSHPublicKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSSHPublicKeysResult listSSHPublicKeys() {
        return listSSHPublicKeys(new ListSSHPublicKeysRequest());
    }

    @Override
    public ListServerCertificatesResult listServerCertificates(
            ListServerCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListServerCertificatesResult listServerCertificates() {
        return listServerCertificates(new ListServerCertificatesRequest());
    }

    @Override
    public ListSigningCertificatesResult listSigningCertificates(
            ListSigningCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListSigningCertificatesResult listSigningCertificates() {
        return listSigningCertificates(new ListSigningCertificatesRequest());
    }

    @Override
    public ListUserPoliciesResult listUserPolicies(
            ListUserPoliciesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers(ListUsersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListUsersResult listUsers() {
        return listUsers(new ListUsersRequest());
    }

    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices(
            ListVirtualMFADevicesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ListVirtualMFADevicesResult listVirtualMFADevices() {
        return listVirtualMFADevices(new ListVirtualMFADevicesRequest());
    }

    @Override
    public void putGroupPolicy(PutGroupPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putRolePolicy(PutRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void putUserPolicy(PutUserPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removeClientIDFromOpenIDConnectProvider(
            RemoveClientIDFromOpenIDConnectProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removeRoleFromInstanceProfile(
            RemoveRoleFromInstanceProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void removeUserFromGroup(RemoveUserFromGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void resyncMFADevice(ResyncMFADeviceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setDefaultPolicyVersion(SetDefaultPolicyVersionRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SimulateCustomPolicyResult simulateCustomPolicy(
            SimulateCustomPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public SimulatePrincipalPolicyResult simulatePrincipalPolicy(
            SimulatePrincipalPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateAccessKey(UpdateAccessKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateAccountPasswordPolicy(
            UpdateAccountPasswordPolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateAssumeRolePolicy(UpdateAssumeRolePolicyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateGroup(UpdateGroupRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateLoginProfile(UpdateLoginProfileRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateOpenIDConnectProviderThumbprint(
            UpdateOpenIDConnectProviderThumbprintRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateSAMLProviderResult updateSAMLProvider(
            UpdateSAMLProviderRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateSSHPublicKey(UpdateSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateServerCertificate(UpdateServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateSigningCertificate(UpdateSigningCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void updateUser(UpdateUserRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadSSHPublicKeyResult uploadSSHPublicKey(
            UploadSSHPublicKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadServerCertificateResult uploadServerCertificate(
            UploadServerCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UploadSigningCertificateResult uploadSigningCertificate(
            UploadSigningCertificateRequest request) {
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
