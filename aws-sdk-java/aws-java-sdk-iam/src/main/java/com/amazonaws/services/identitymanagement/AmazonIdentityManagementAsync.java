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
 * Interface for accessing IAM asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <fullname>AWS Identity and Access Management</fullname>
 * <p>
 * AWS Identity and Access Management (IAM) is a web service that you can use to
 * manage users and user permissions under your AWS account. This guide provides
 * descriptions of IAM actions that you can call programmatically. For general
 * information about IAM, see <a href="http://aws.amazon.com/iam/">AWS Identity
 * and Access Management (IAM)</a>. For the user guide for IAM, see <a
 * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/">Using IAM</a>.
 * </p>
 * <note>AWS provides SDKs that consist of libraries and sample code for various
 * programming languages and platforms (Java, Ruby, .NET, iOS, Android, etc.).
 * The SDKs provide a convenient way to create programmatic access to IAM and
 * AWS. For example, the SDKs take care of tasks such as cryptographically
 * signing requests (see below), managing errors, and retrying requests
 * automatically. For information about the AWS SDKs, including how to download
 * and install them, see the <a href="http://aws.amazon.com/tools/">Tools for
 * Amazon Web Services</a> page. </note>
 * <p>
 * We recommend that you use the AWS SDKs to make programmatic API calls to IAM.
 * However, you can also use the IAM Query API to make direct calls to the IAM
 * web service. To learn more about the IAM Query API, see <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
 * >Making Query Requests</a> in the <i>Using IAM</i> guide. IAM supports GET
 * and POST requests for all actions. That is, the API does not require you to
 * use GET for some actions and POST for others. However, GET requests are
 * subject to the limitation size of a URL. Therefore, for operations that
 * require larger sizes, use a POST request.
 * </p>
 * <p>
 * <b>Signing Requests</b>
 * </p>
 * <p>
 * Requests must be signed using an access key ID and a secret access key. We
 * strongly recommend that you do not use your AWS account access key ID and
 * secret access key for everyday work with IAM. You can use the access key ID
 * and secret access key for an IAM user or you can use the AWS Security Token
 * Service to generate temporary security credentials and use those to sign
 * requests.
 * </p>
 * <p>
 * To sign requests, we recommend that you use <a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
 * >Signature Version 4</a>. If you have an existing application that uses
 * Signature Version 2, you do not have to update it to use Signature Version 4.
 * However, some operations now require Signature Version 4. The documentation
 * for operations that require version 4 indicate this requirement.
 * </p>
 * <p>
 * <b>Additional Resources</b>
 * </p>
 * <p>
 * For more information, see the following:
 * </p>
 * <ul>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/aws-security-credentials.html"
 * >AWS Security Credentials</a>. This topic provides general information about
 * the types of credentials used for accessing AWS.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAMBestPractices.html">IAM
 * Best Practices</a>. This topic presents a list of suggestions for using the
 * IAM service to help secure your AWS resources.</li>
 * <li><a href=
 * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
 * >Signing AWS API Requests</a>. This set of topics walk you through the
 * process of signing a request using an access key ID and secret access key.</li>
 * </ul>
 */
public interface AmazonIdentityManagementAsync extends AmazonIdentityManagement {

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs
     * already registered for the specified IAM OpenID Connect provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you add
     * an existing client ID to the provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @sample AmazonIdentityManagementAsync.AddClientIDToOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> addClientIDToOpenIDConnectProviderAsync(
            AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest);

    /**
     * <p>
     * Adds a new client ID (also known as audience) to the list of client IDs
     * already registered for the specified IAM OpenID Connect provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you add
     * an existing client ID to the provider.
     * </p>
     * 
     * @param addClientIDToOpenIDConnectProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample 
     *         AmazonIdentityManagementAsyncHandler.AddClientIDToOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> addClientIDToOpenIDConnectProviderAsync(
            AddClientIDToOpenIDConnectProviderRequest addClientIDToOpenIDConnectProviderRequest,
            com.amazonaws.handlers.AsyncHandler<AddClientIDToOpenIDConnectProviderRequest, Void> asyncHandler);

    /**
     * <p>
     * Adds the specified role to the specified instance profile. For more
     * information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @sample AmazonIdentityManagementAsync.AddRoleToInstanceProfile
     */
    java.util.concurrent.Future<Void> addRoleToInstanceProfileAsync(
            AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest);

    /**
     * <p>
     * Adds the specified role to the specified instance profile. For more
     * information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param addRoleToInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.AddRoleToInstanceProfile
     */
    java.util.concurrent.Future<Void> addRoleToInstanceProfileAsync(
            AddRoleToInstanceProfileRequest addRoleToInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<AddRoleToInstanceProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * 
     * @param addUserToGroupRequest
     * @sample AmazonIdentityManagementAsync.AddUserToGroup
     */
    java.util.concurrent.Future<Void> addUserToGroupAsync(
            AddUserToGroupRequest addUserToGroupRequest);

    /**
     * <p>
     * Adds the specified user to the specified group.
     * </p>
     * 
     * @param addUserToGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.AddUserToGroup
     */
    java.util.concurrent.Future<Void> addUserToGroupAsync(
            AddUserToGroupRequest addUserToGroupRequest,
            com.amazonaws.handlers.AsyncHandler<AddUserToGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches the specified managed policy to the specified group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an
     * inline policy in a group, use <a>PutGroupPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @sample AmazonIdentityManagementAsync.AttachGroupPolicy
     */
    java.util.concurrent.Future<Void> attachGroupPolicyAsync(
            AttachGroupPolicyRequest attachGroupPolicyRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified group.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a group. To embed an
     * inline policy in a group, use <a>PutGroupPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.AttachGroupPolicy
     */
    java.util.concurrent.Future<Void> attachGroupPolicyAsync(
            AttachGroupPolicyRequest attachGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachGroupPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches the specified managed policy to the specified role.
     * </p>
     * <p>
     * When you attach a managed policy to a role, the managed policy is used as
     * the role's access (permissions) policy. You cannot use a managed policy
     * as the role's trust policy. The role's trust policy is created at the
     * same time as the role, using <a>CreateRole</a>. You can update a role's
     * trust policy using <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * <p>
     * Use this API to attach a managed policy to a role. To embed an inline
     * policy in a role, use <a>PutRolePolicy</a>. For more information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @sample AmazonIdentityManagementAsync.AttachRolePolicy
     */
    java.util.concurrent.Future<Void> attachRolePolicyAsync(
            AttachRolePolicyRequest attachRolePolicyRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified role.
     * </p>
     * <p>
     * When you attach a managed policy to a role, the managed policy is used as
     * the role's access (permissions) policy. You cannot use a managed policy
     * as the role's trust policy. The role's trust policy is created at the
     * same time as the role, using <a>CreateRole</a>. You can update a role's
     * trust policy using <a>UpdateAssumeRolePolicy</a>.
     * </p>
     * <p>
     * Use this API to attach a managed policy to a role. To embed an inline
     * policy in a role, use <a>PutRolePolicy</a>. For more information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.AttachRolePolicy
     */
    java.util.concurrent.Future<Void> attachRolePolicyAsync(
            AttachRolePolicyRequest attachRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachRolePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a user. To embed an inline
     * policy in a user, use <a>PutUserPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @sample AmazonIdentityManagementAsync.AttachUserPolicy
     */
    java.util.concurrent.Future<Void> attachUserPolicyAsync(
            AttachUserPolicyRequest attachUserPolicyRequest);

    /**
     * <p>
     * Attaches the specified managed policy to the specified user.
     * </p>
     * <p>
     * You use this API to attach a managed policy to a user. To embed an inline
     * policy in a user, use <a>PutUserPolicy</a>.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param attachUserPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.AttachUserPolicy
     */
    java.util.concurrent.Future<Void> attachUserPolicyAsync(
            AttachUserPolicyRequest attachUserPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<AttachUserPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Changes the password of the IAM user who is calling this action. The root
     * account password is not affected by this action.
     * </p>
     * <p>
     * To change the password for a different user, see
     * <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @sample AmazonIdentityManagementAsync.ChangePassword
     */
    java.util.concurrent.Future<Void> changePasswordAsync(
            ChangePasswordRequest changePasswordRequest);

    /**
     * <p>
     * Changes the password of the IAM user who is calling this action. The root
     * account password is not affected by this action.
     * </p>
     * <p>
     * To change the password for a different user, see
     * <a>UpdateLoginProfile</a>. For more information about modifying
     * passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param changePasswordRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.ChangePassword
     */
    java.util.concurrent.Future<Void> changePasswordAsync(
            ChangePasswordRequest changePasswordRequest,
            com.amazonaws.handlers.AsyncHandler<ChangePasswordRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key ID
     * for the specified user. The default status for new keys is
     * <code>Active</code>.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important> To ensure the security of your AWS account, the secret access
     * key is accessible only during key and user creation. You must save the
     * key (for example, in a text file) if you want to be able to access it
     * again. If a secret key is lost, you can delete the access keys for the
     * associated user and then create new keys. </important>
     * 
     * @param createAccessKeyRequest
     * @return A Java Future containing the result of the CreateAccessKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateAccessKey
     */
    java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            CreateAccessKeyRequest createAccessKeyRequest);

    /**
     * <p>
     * Creates a new AWS secret access key and corresponding AWS access key ID
     * for the specified user. The default status for new keys is
     * <code>Active</code>.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * <p>
     * For information about limits on the number of keys you can create, see <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important> To ensure the security of your AWS account, the secret access
     * key is accessible only during key and user creation. You must save the
     * key (for example, in a text file) if you want to be able to access it
     * again. If a secret key is lost, you can delete the access keys for the
     * associated user and then create new keys. </important>
     * 
     * @param createAccessKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateAccessKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateAccessKey
     */
    java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            CreateAccessKeyRequest createAccessKeyRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler);

    /**
     * Simplified method form for invoking the CreateAccessKey operation.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest)
     */
    java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync();

    /**
     * Simplified method form for invoking the CreateAccessKey operation with an
     * AsyncHandler.
     *
     * @see #createAccessKeyAsync(CreateAccessKeyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<CreateAccessKeyResult> createAccessKeyAsync(
            com.amazonaws.handlers.AsyncHandler<CreateAccessKeyRequest, CreateAccessKeyResult> asyncHandler);

    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an AWS
     * account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createAccountAliasRequest
     * @sample AmazonIdentityManagementAsync.CreateAccountAlias
     */
    java.util.concurrent.Future<Void> createAccountAliasAsync(
            CreateAccountAliasRequest createAccountAliasRequest);

    /**
     * <p>
     * Creates an alias for your AWS account. For information about using an AWS
     * account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createAccountAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.CreateAccountAlias
     */
    java.util.concurrent.Future<Void> createAccountAliasAsync(
            CreateAccountAliasRequest createAccountAliasRequest,
            com.amazonaws.handlers.AsyncHandler<CreateAccountAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createGroupRequest
     * @return A Java Future containing the result of the CreateGroup operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateGroup
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(
            CreateGroupRequest createGroupRequest);

    /**
     * <p>
     * Creates a new group.
     * </p>
     * <p>
     * For information about the number of groups you can create, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateGroup operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateGroup
     */
    java.util.concurrent.Future<CreateGroupResult> createGroupAsync(
            CreateGroupRequest createGroupRequest,
            com.amazonaws.handlers.AsyncHandler<CreateGroupRequest, CreateGroupResult> asyncHandler);

    /**
     * <p>
     * Creates a new instance profile. For information about instance profiles,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * For information about the number of instance profiles you can create, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @return A Java Future containing the result of the CreateInstanceProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateInstanceProfile
     */
    java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(
            CreateInstanceProfileRequest createInstanceProfileRequest);

    /**
     * <p>
     * Creates a new instance profile. For information about instance profiles,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * For information about the number of instance profiles you can create, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateInstanceProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateInstanceProfile
     */
    java.util.concurrent.Future<CreateInstanceProfileResult> createInstanceProfileAsync(
            CreateInstanceProfileRequest createInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateInstanceProfileRequest, CreateInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability to
     * access AWS services through the AWS Management Console. For more
     * information about managing passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @return A Java Future containing the result of the CreateLoginProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateLoginProfile
     */
    java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(
            CreateLoginProfileRequest createLoginProfileRequest);

    /**
     * <p>
     * Creates a password for the specified user, giving the user the ability to
     * access AWS services through the AWS Management Console. For more
     * information about managing passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param createLoginProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateLoginProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateLoginProfile
     */
    java.util.concurrent.Future<CreateLoginProfileResult> createLoginProfileAsync(
            CreateLoginProfileRequest createLoginProfileRequest,
            com.amazonaws.handlers.AsyncHandler<CreateLoginProfileRequest, CreateLoginProfileResult> asyncHandler);

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports <a href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as a
     * principal in a role's trust policy to establish a trust relationship
     * between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the URL of the OIDC
     * identity provider (IdP) to trust, a list of client IDs (also known as
     * audiences) that identify the application or applications that are allowed
     * to authenticate using the OIDC provider, and a list of thumbprints of the
     * server certificate(s) that the IdP uses. You get all of this information
     * from the OIDC IdP that you want to use for access to AWS.
     * </p>
     * <note>Because trust for the OIDC provider is ultimately derived from the
     * IAM provider that this action creates, it is a best practice to limit
     * access to the <a>CreateOpenIDConnectProvider</a> action to
     * highly-privileged users. </note>
     * 
     * @param createOpenIDConnectProviderRequest
     * @return A Java Future containing the result of the
     *         CreateOpenIDConnectProvider operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateOpenIDConnectProvider
     */
    java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(
            CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest);

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports <a href="http://openid.net/connect/">OpenID Connect (OIDC)</a>.
     * </p>
     * <p>
     * The OIDC provider that you create with this operation can be used as a
     * principal in a role's trust policy to establish a trust relationship
     * between AWS and the OIDC provider.
     * </p>
     * <p>
     * When you create the IAM OIDC provider, you specify the URL of the OIDC
     * identity provider (IdP) to trust, a list of client IDs (also known as
     * audiences) that identify the application or applications that are allowed
     * to authenticate using the OIDC provider, and a list of thumbprints of the
     * server certificate(s) that the IdP uses. You get all of this information
     * from the OIDC IdP that you want to use for access to AWS.
     * </p>
     * <note>Because trust for the OIDC provider is ultimately derived from the
     * IAM provider that this action creates, it is a best practice to limit
     * access to the <a>CreateOpenIDConnectProvider</a> action to
     * highly-privileged users. </note>
     * 
     * @param createOpenIDConnectProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         CreateOpenIDConnectProvider operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateOpenIDConnectProvider
     */
    java.util.concurrent.Future<CreateOpenIDConnectProviderResult> createOpenIDConnectProviderAsync(
            CreateOpenIDConnectProviderRequest createOpenIDConnectProviderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateOpenIDConnectProviderRequest, CreateOpenIDConnectProviderResult> asyncHandler);

    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of
     * <code>v1</code> and sets v1 as the policy's default version. For more
     * information about policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyRequest
     * @return A Java Future containing the result of the CreatePolicy operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest createPolicyRequest);

    /**
     * <p>
     * Creates a new managed policy for your AWS account.
     * </p>
     * <p>
     * This operation creates a policy version with a version identifier of
     * <code>v1</code> and sets v1 as the policy's default version. For more
     * information about policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about managed policies in general, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicy operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreatePolicy
     */
    java.util.concurrent.Future<CreatePolicyResult> createPolicyAsync(
            CreatePolicyRequest createPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyRequest, CreatePolicyResult> asyncHandler);

    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a
     * managed policy, you create a new policy version. A managed policy can
     * have up to five versions. If the policy has five versions, you must
     * delete an existing version using <a>DeletePolicyVersion</a> before you
     * create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version; that is, the version that
     * is in effect for the IAM users, groups, and roles that the policy is
     * attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @return A Java Future containing the result of the CreatePolicyVersion
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest createPolicyVersionRequest);

    /**
     * <p>
     * Creates a new version of the specified managed policy. To update a
     * managed policy, you create a new policy version. A managed policy can
     * have up to five versions. If the policy has five versions, you must
     * delete an existing version using <a>DeletePolicyVersion</a> before you
     * create a new version.
     * </p>
     * <p>
     * Optionally, you can set the new version as the policy's default version.
     * The default version is the operative version; that is, the version that
     * is in effect for the IAM users, groups, and roles that the policy is
     * attached to.
     * </p>
     * <p>
     * For more information about managed policy versions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createPolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreatePolicyVersion
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreatePolicyVersion
     */
    java.util.concurrent.Future<CreatePolicyVersionResult> createPolicyVersionAsync(
            CreatePolicyVersionRequest createPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<CreatePolicyVersionRequest, CreatePolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Creates a new role for your AWS account. For more information about
     * roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For information about limitations on role names
     * and the number of roles you can create, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @return A Java Future containing the result of the CreateRole operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateRole
     */
    java.util.concurrent.Future<CreateRoleResult> createRoleAsync(
            CreateRoleRequest createRoleRequest);

    /**
     * <p>
     * Creates a new role for your AWS account. For more information about
     * roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For information about limitations on role names
     * and the number of roles you can create, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateRole operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateRole
     */
    java.util.concurrent.Future<CreateRoleResult> createRoleAsync(
            CreateRoleRequest createRoleRequest,
            com.amazonaws.handlers.AsyncHandler<CreateRoleRequest, CreateRoleResult> asyncHandler);

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider that you create with this operation can be used as a
     * principal in a role's trust policy to establish a trust relationship
     * between AWS and a SAML identity provider. You can create an IAM role that
     * supports Web-based single sign-on (SSO) to the AWS Management Console or
     * one that supports API access to AWS.
     * </p>
     * <p>
     * When you create the SAML provider, you upload an a SAML metadata document
     * that you get from your IdP and that includes the issuer's name,
     * expiration information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP. You
     * must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html"
     * >Enabling SAML 2.0 Federated Users to Access the AWS Management
     * Console</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html"
     * >About SAML 2.0-based Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createSAMLProviderRequest
     * @return A Java Future containing the result of the CreateSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateSAMLProvider
     */
    java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(
            CreateSAMLProviderRequest createSAMLProviderRequest);

    /**
     * <p>
     * Creates an IAM entity to describe an identity provider (IdP) that
     * supports SAML 2.0.
     * </p>
     * <p>
     * The SAML provider that you create with this operation can be used as a
     * principal in a role's trust policy to establish a trust relationship
     * between AWS and a SAML identity provider. You can create an IAM role that
     * supports Web-based single sign-on (SSO) to the AWS Management Console or
     * one that supports API access to AWS.
     * </p>
     * <p>
     * When you create the SAML provider, you upload an a SAML metadata document
     * that you get from your IdP and that includes the issuer's name,
     * expiration information, and keys that can be used to validate the SAML
     * authentication response (assertions) that are received from the IdP. You
     * must generate the metadata document using the identity management
     * software that is used as your organization's IdP.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_enable-console-saml.html"
     * >Enabling SAML 2.0 Federated Users to Access the AWS Management
     * Console</a> and <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_providers_saml.html"
     * >About SAML 2.0-based Federation</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createSAMLProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateSAMLProvider
     */
    java.util.concurrent.Future<CreateSAMLProviderResult> createSAMLProviderAsync(
            CreateSAMLProviderRequest createSAMLProviderRequest,
            com.amazonaws.handlers.AsyncHandler<CreateSAMLProviderRequest, CreateSAMLProviderResult> asyncHandler);

    /**
     * <p>
     * Creates a new user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of users you can create,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @return A Java Future containing the result of the CreateUser operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateUser
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(
            CreateUserRequest createUserRequest);

    /**
     * <p>
     * Creates a new user for your AWS account.
     * </p>
     * <p>
     * For information about limitations on the number of users you can create,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param createUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateUser operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateUser
     */
    java.util.concurrent.Future<CreateUserResult> createUserAsync(
            CreateUserRequest createUserRequest,
            com.amazonaws.handlers.AsyncHandler<CreateUserRequest, CreateUserResult> asyncHandler);

    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating the
     * virtual MFA, use <a>EnableMFADevice</a> to attach the MFA device to an
     * IAM user. For more information about creating and working with virtual
     * MFA devices, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can create,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on Entities</a> in the <i>Using IAM</i> guide.
     * </p>
     * <important>The seed information contained in the QR code and the Base32
     * string should be treated like any other secret access information, such
     * as your AWS access keys or your passwords. After you provision your
     * virtual device, you should ensure that the information is destroyed
     * following secure procedures. </important>
     * 
     * @param createVirtualMFADeviceRequest
     * @return A Java Future containing the result of the CreateVirtualMFADevice
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.CreateVirtualMFADevice
     */
    java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(
            CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest);

    /**
     * <p>
     * Creates a new virtual MFA device for the AWS account. After creating the
     * virtual MFA, use <a>EnableMFADevice</a> to attach the MFA device to an
     * IAM user. For more information about creating and working with virtual
     * MFA devices, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * For information about limits on the number of MFA devices you can create,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on Entities</a> in the <i>Using IAM</i> guide.
     * </p>
     * <important>The seed information contained in the QR code and the Base32
     * string should be treated like any other secret access information, such
     * as your AWS access keys or your passwords. After you provision your
     * virtual device, you should ensure that the information is destroyed
     * following secure procedures. </important>
     * 
     * @param createVirtualMFADeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CreateVirtualMFADevice
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.CreateVirtualMFADevice
     */
    java.util.concurrent.Future<CreateVirtualMFADeviceResult> createVirtualMFADeviceAsync(
            CreateVirtualMFADeviceRequest createVirtualMFADeviceRequest,
            com.amazonaws.handlers.AsyncHandler<CreateVirtualMFADeviceRequest, CreateVirtualMFADeviceResult> asyncHandler);

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association with
     * the user name for which it was originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @sample AmazonIdentityManagementAsync.DeactivateMFADevice
     */
    java.util.concurrent.Future<Void> deactivateMFADeviceAsync(
            DeactivateMFADeviceRequest deactivateMFADeviceRequest);

    /**
     * <p>
     * Deactivates the specified MFA device and removes it from association with
     * the user name for which it was originally enabled.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param deactivateMFADeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeactivateMFADevice
     */
    java.util.concurrent.Future<Void> deactivateMFADeviceAsync(
            DeactivateMFADeviceRequest deactivateMFADeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeactivateMFADeviceRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the access key associated with the specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @sample AmazonIdentityManagementAsync.DeleteAccessKey
     */
    java.util.concurrent.Future<Void> deleteAccessKeyAsync(
            DeleteAccessKeyRequest deleteAccessKeyRequest);

    /**
     * <p>
     * Deletes the access key associated with the specified user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * 
     * @param deleteAccessKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteAccessKey
     */
    java.util.concurrent.Future<Void> deleteAccessKeyAsync(
            DeleteAccessKeyRequest deleteAccessKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccessKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using an
     * AWS account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @sample AmazonIdentityManagementAsync.DeleteAccountAlias
     */
    java.util.concurrent.Future<Void> deleteAccountAliasAsync(
            DeleteAccountAliasRequest deleteAccountAliasRequest);

    /**
     * <p>
     * Deletes the specified AWS account alias. For information about using an
     * AWS account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteAccountAliasRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteAccountAlias
     */
    java.util.concurrent.Future<Void> deleteAccountAliasAsync(
            DeleteAccountAliasRequest deleteAccountAliasRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountAliasRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
     * 
     * @param deleteAccountPasswordPolicyRequest
     * @sample AmazonIdentityManagementAsync.DeleteAccountPasswordPolicy
     */
    java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest);

    /**
     * <p>
     * Deletes the password policy for the AWS account.
     * </p>
     * 
     * @param deleteAccountPasswordPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteAccountPasswordPolicy
     */
    java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            DeleteAccountPasswordPolicyRequest deleteAccountPasswordPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, Void> asyncHandler);

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy
     * operation.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest)
     */
    java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync();

    /**
     * Simplified method form for invoking the DeleteAccountPasswordPolicy
     * operation with an AsyncHandler.
     *
     * @see #deleteAccountPasswordPolicyAsync(DeleteAccountPasswordPolicyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<Void> deleteAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<DeleteAccountPasswordPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified group. The group must not contain any users or have
     * any attached policies.
     * </p>
     * 
     * @param deleteGroupRequest
     * @sample AmazonIdentityManagementAsync.DeleteGroup
     */
    java.util.concurrent.Future<Void> deleteGroupAsync(
            DeleteGroupRequest deleteGroupRequest);

    /**
     * <p>
     * Deletes the specified group. The group must not contain any users or have
     * any attached policies.
     * </p>
     * 
     * @param deleteGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteGroup
     */
    java.util.concurrent.Future<Void> deleteGroupAsync(
            DeleteGroupRequest deleteGroupRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a
     * managed policy from a group, use <a>DetachGroupPolicy</a>. For more
     * information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @sample AmazonIdentityManagementAsync.DeleteGroupPolicy
     */
    java.util.concurrent.Future<Void> deleteGroupPolicyAsync(
            DeleteGroupPolicyRequest deleteGroupPolicyRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To detach a
     * managed policy from a group, use <a>DetachGroupPolicy</a>. For more
     * information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteGroupPolicy
     */
    java.util.concurrent.Future<Void> deleteGroupPolicyAsync(
            DeleteGroupPolicyRequest deleteGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteGroupPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not
     * have an associated role.
     * </p>
     * <important> Make sure you do not have any Amazon EC2 instances running
     * with the instance profile you are about to delete. Deleting a role or
     * instance profile that is associated with a running instance will break
     * any applications running on the instance. </important>
     * <p>
     * For more information about instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @sample AmazonIdentityManagementAsync.DeleteInstanceProfile
     */
    java.util.concurrent.Future<Void> deleteInstanceProfileAsync(
            DeleteInstanceProfileRequest deleteInstanceProfileRequest);

    /**
     * <p>
     * Deletes the specified instance profile. The instance profile must not
     * have an associated role.
     * </p>
     * <important> Make sure you do not have any Amazon EC2 instances running
     * with the instance profile you are about to delete. Deleting a role or
     * instance profile that is associated with a running instance will break
     * any applications running on the instance. </important>
     * <p>
     * For more information about instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param deleteInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteInstanceProfile
     */
    java.util.concurrent.Future<Void> deleteInstanceProfileAsync(
            DeleteInstanceProfileRequest deleteInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteInstanceProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the password for the specified user, which terminates the user's
     * ability to access AWS services through the AWS Management Console.
     * </p>
     * <important> Deleting a user's password does not prevent a user from
     * accessing IAM through the command line interface or the API. To prevent
     * all user access you must also either make the access key inactive or
     * delete it. For more information about making keys inactive or deleting
     * them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>. </important>
     * 
     * @param deleteLoginProfileRequest
     * @sample AmazonIdentityManagementAsync.DeleteLoginProfile
     */
    java.util.concurrent.Future<Void> deleteLoginProfileAsync(
            DeleteLoginProfileRequest deleteLoginProfileRequest);

    /**
     * <p>
     * Deletes the password for the specified user, which terminates the user's
     * ability to access AWS services through the AWS Management Console.
     * </p>
     * <important> Deleting a user's password does not prevent a user from
     * accessing IAM through the command line interface or the API. To prevent
     * all user access you must also either make the access key inactive or
     * delete it. For more information about making keys inactive or deleting
     * them, see <a>UpdateAccessKey</a> and <a>DeleteAccessKey</a>. </important>
     * 
     * @param deleteLoginProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteLoginProfile
     */
    java.util.concurrent.Future<Void> deleteLoginProfileAsync(
            DeleteLoginProfileRequest deleteLoginProfileRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteLoginProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes an IAM OpenID Connect identity provider.
     * </p>
     * <p>
     * Deleting an OIDC provider does not update any roles that reference the
     * provider as a principal in their trust policies. Any attempt to assume a
     * role that references a provider that has been deleted will fail.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you
     * call the action for a provider that was already deleted.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @sample AmazonIdentityManagementAsync.DeleteOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> deleteOpenIDConnectProviderAsync(
            DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest);

    /**
     * <p>
     * Deletes an IAM OpenID Connect identity provider.
     * </p>
     * <p>
     * Deleting an OIDC provider does not update any roles that reference the
     * provider as a principal in their trust policies. Any attempt to assume a
     * role that references a provider that has been deleted will fail.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you
     * call the action for a provider that was already deleted.
     * </p>
     * 
     * @param deleteOpenIDConnectProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> deleteOpenIDConnectProviderAsync(
            DeleteOpenIDConnectProviderRequest deleteOpenIDConnectProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteOpenIDConnectProviderRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must detach the policy from
     * all users, groups, and roles that it is attached to, and you must delete
     * all of the policy's versions. The following steps describe the process
     * for deleting a managed policy:
     * <ol>
     * <li>Detach the policy from all users, groups, and roles that the policy
     * is attached to, using the <a>DetachUserPolicy</a>,
     * <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a> APIs. To list all
     * the users, groups, and roles that a policy is attached to, use
     * <a>ListEntitiesForPolicy</a>.</li>
     * <li>Delete all versions of the policy using <a>DeletePolicyVersion</a>.
     * To list the policy's versions, use <a>ListPolicyVersions</a>. You cannot
     * use <a>DeletePolicyVersion</a> to delete the version that is marked as
     * the default version. You delete the policy's default version in the next
     * step of the process.</li>
     * <li>Delete the policy (this automatically deletes the policy's default
     * version) using this API.</li>
     * </ol>
     * </p>
     * <p>
     * For information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @sample AmazonIdentityManagementAsync.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest);

    /**
     * <p>
     * Deletes the specified managed policy.
     * </p>
     * <p>
     * Before you can delete a managed policy, you must detach the policy from
     * all users, groups, and roles that it is attached to, and you must delete
     * all of the policy's versions. The following steps describe the process
     * for deleting a managed policy:
     * <ol>
     * <li>Detach the policy from all users, groups, and roles that the policy
     * is attached to, using the <a>DetachUserPolicy</a>,
     * <a>DetachGroupPolicy</a>, or <a>DetachRolePolicy</a> APIs. To list all
     * the users, groups, and roles that a policy is attached to, use
     * <a>ListEntitiesForPolicy</a>.</li>
     * <li>Delete all versions of the policy using <a>DeletePolicyVersion</a>.
     * To list the policy's versions, use <a>ListPolicyVersions</a>. You cannot
     * use <a>DeletePolicyVersion</a> to delete the version that is marked as
     * the default version. You delete the policy's default version in the next
     * step of the process.</li>
     * <li>Delete the policy (this automatically deletes the policy's default
     * version) using this API.</li>
     * </ol>
     * </p>
     * <p>
     * For information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeletePolicy
     */
    java.util.concurrent.Future<Void> deletePolicyAsync(
            DeletePolicyRequest deletePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified version of the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version of a policy using this API. To
     * delete the default version of a policy, use <a>DeletePolicy</a>. To find
     * out which version of a policy is marked as the default version, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * For information about versions for managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @sample AmazonIdentityManagementAsync.DeletePolicyVersion
     */
    java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest deletePolicyVersionRequest);

    /**
     * <p>
     * Deletes the specified version of the specified managed policy.
     * </p>
     * <p>
     * You cannot delete the default version of a policy using this API. To
     * delete the default version of a policy, use <a>DeletePolicy</a>. To find
     * out which version of a policy is marked as the default version, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * For information about versions for managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-versions.html"
     * >Versioning for Managed Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deletePolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeletePolicyVersion
     */
    java.util.concurrent.Future<Void> deletePolicyVersionAsync(
            DeletePolicyVersionRequest deletePolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<DeletePolicyVersionRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified role. The role must not have any policies attached.
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <important>Make sure you do not have any Amazon EC2 instances running
     * with the role you are about to delete. Deleting a role or instance
     * profile that is associated with a running instance will break any
     * applications running on the instance. </important>
     * 
     * @param deleteRoleRequest
     * @sample AmazonIdentityManagementAsync.DeleteRole
     */
    java.util.concurrent.Future<Void> deleteRoleAsync(
            DeleteRoleRequest deleteRoleRequest);

    /**
     * <p>
     * Deletes the specified role. The role must not have any policies attached.
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <important>Make sure you do not have any Amazon EC2 instances running
     * with the role you are about to delete. Deleting a role or instance
     * profile that is associated with a running instance will break any
     * applications running on the instance. </important>
     * 
     * @param deleteRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteRole
     */
    java.util.concurrent.Future<Void> deleteRoleAsync(
            DeleteRoleRequest deleteRoleRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRoleRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a managed
     * policy from a role, use <a>DetachRolePolicy</a>. For more information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @sample AmazonIdentityManagementAsync.DeleteRolePolicy
     */
    java.util.concurrent.Future<Void> deleteRolePolicyAsync(
            DeleteRolePolicyRequest deleteRolePolicyRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To detach a managed
     * policy from a role, use <a>DetachRolePolicy</a>. For more information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteRolePolicy
     */
    java.util.concurrent.Future<Void> deleteRolePolicyAsync(
            DeleteRolePolicyRequest deleteRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteRolePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a SAML provider.
     * </p>
     * <p>
     * Deleting the provider does not update any roles that reference the SAML
     * provider as a principal in their trust policies. Any attempt to assume a
     * role that references a SAML provider that has been deleted will fail.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param deleteSAMLProviderRequest
     * @sample AmazonIdentityManagementAsync.DeleteSAMLProvider
     */
    java.util.concurrent.Future<Void> deleteSAMLProviderAsync(
            DeleteSAMLProviderRequest deleteSAMLProviderRequest);

    /**
     * <p>
     * Deletes a SAML provider.
     * </p>
     * <p>
     * Deleting the provider does not update any roles that reference the SAML
     * provider as a principal in their trust policies. Any attempt to assume a
     * role that references a SAML provider that has been deleted will fail.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param deleteSAMLProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteSAMLProvider
     */
    java.util.concurrent.Future<Void> deleteSAMLProviderAsync(
            DeleteSAMLProviderRequest deleteSAMLProviderRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSAMLProviderRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this action is used only for authenticating
     * the associated IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @sample AmazonIdentityManagementAsync.DeleteSSHPublicKey
     */
    java.util.concurrent.Future<Void> deleteSSHPublicKeyAsync(
            DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest);

    /**
     * <p>
     * Deletes the specified SSH public key.
     * </p>
     * <p>
     * The SSH public key deleted by this action is used only for authenticating
     * the associated IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param deleteSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteSSHPublicKey
     */
    java.util.concurrent.Future<Void> deleteSSHPublicKeyAsync(
            DeleteSSHPublicKeyRequest deleteSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSSHPublicKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important> If you are using a server certificate with Elastic Load
     * Balancing, deleting the certificate could have implications for your
     * application. If Elastic Load Balancing doesn't detect the deletion of
     * bound certificates, it may continue to use the certificates. This could
     * cause Elastic Load Balancing to stop accepting traffic. We recommend that
     * you remove the reference to the certificate from Elastic Load Balancing
     * before using this command to delete the certificate. For more
     * information, go to <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API
     * Reference</i>. </important>
     * 
     * @param deleteServerCertificateRequest
     * @sample AmazonIdentityManagementAsync.DeleteServerCertificate
     */
    java.util.concurrent.Future<Void> deleteServerCertificateAsync(
            DeleteServerCertificateRequest deleteServerCertificateRequest);

    /**
     * <p>
     * Deletes the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important> If you are using a server certificate with Elastic Load
     * Balancing, deleting the certificate could have implications for your
     * application. If Elastic Load Balancing doesn't detect the deletion of
     * bound certificates, it may continue to use the certificates. This could
     * cause Elastic Load Balancing to stop accepting traffic. We recommend that
     * you remove the reference to the certificate from Elastic Load Balancing
     * before using this command to delete the certificate. For more
     * information, go to <a href=
     * "http://docs.aws.amazon.com/ElasticLoadBalancing/latest/APIReference/API_DeleteLoadBalancerListeners.html"
     * >DeleteLoadBalancerListeners</a> in the <i>Elastic Load Balancing API
     * Reference</i>. </important>
     * 
     * @param deleteServerCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteServerCertificate
     */
    java.util.concurrent.Future<Void> deleteServerCertificateAsync(
            DeleteServerCertificateRequest deleteServerCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteServerCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified signing certificate associated with the specified
     * user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @sample AmazonIdentityManagementAsync.DeleteSigningCertificate
     */
    java.util.concurrent.Future<Void> deleteSigningCertificateAsync(
            DeleteSigningCertificateRequest deleteSigningCertificateRequest);

    /**
     * <p>
     * Deletes the specified signing certificate associated with the specified
     * user.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request. Because
     * this action works for access keys under the AWS account, you can use this
     * action to manage root credentials even if the AWS account has no
     * associated users.
     * </p>
     * 
     * @param deleteSigningCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteSigningCertificate
     */
    java.util.concurrent.Future<Void> deleteSigningCertificateAsync(
            DeleteSigningCertificateRequest deleteSigningCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteSigningCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified user. The user must not belong to any groups, have
     * any keys or signing certificates, or have any attached policies.
     * </p>
     * 
     * @param deleteUserRequest
     * @sample AmazonIdentityManagementAsync.DeleteUser
     */
    java.util.concurrent.Future<Void> deleteUserAsync(
            DeleteUserRequest deleteUserRequest);

    /**
     * <p>
     * Deletes the specified user. The user must not belong to any groups, have
     * any keys or signing certificates, or have any attached policies.
     * </p>
     * 
     * @param deleteUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteUser
     */
    java.util.concurrent.Future<Void> deleteUserAsync(
            DeleteUserRequest deleteUserRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a managed
     * policy from a user, use <a>DetachUserPolicy</a>. For more information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @sample AmazonIdentityManagementAsync.DeleteUserPolicy
     */
    java.util.concurrent.Future<Void> deleteUserPolicyAsync(
            DeleteUserPolicyRequest deleteUserPolicyRequest);

    /**
     * <p>
     * Deletes the specified inline policy that is embedded in the specified
     * user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To detach a managed
     * policy from a user, use <a>DetachUserPolicy</a>. For more information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param deleteUserPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteUserPolicy
     */
    java.util.concurrent.Future<Void> deleteUserPolicyAsync(
            DeleteUserPolicyRequest deleteUserPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteUserPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <note> You must deactivate a user's virtual MFA device before you can
     * delete it. For information about deactivating MFA devices, see
     * <a>DeactivateMFADevice</a>. </note>
     * 
     * @param deleteVirtualMFADeviceRequest
     * @sample AmazonIdentityManagementAsync.DeleteVirtualMFADevice
     */
    java.util.concurrent.Future<Void> deleteVirtualMFADeviceAsync(
            DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest);

    /**
     * <p>
     * Deletes a virtual MFA device.
     * </p>
     * <note> You must deactivate a user's virtual MFA device before you can
     * delete it. For information about deactivating MFA devices, see
     * <a>DeactivateMFADevice</a>. </note>
     * 
     * @param deleteVirtualMFADeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DeleteVirtualMFADevice
     */
    java.util.concurrent.Future<Void> deleteVirtualMFADeviceAsync(
            DeleteVirtualMFADeviceRequest deleteVirtualMFADeviceRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteVirtualMFADeviceRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified managed policy from the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteGroupPolicy</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @sample AmazonIdentityManagementAsync.DetachGroupPolicy
     */
    java.util.concurrent.Future<Void> detachGroupPolicyAsync(
            DetachGroupPolicyRequest detachGroupPolicyRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteGroupPolicy</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DetachGroupPolicy
     */
    java.util.concurrent.Future<Void> detachGroupPolicyAsync(
            DetachGroupPolicyRequest detachGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachGroupPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteRolePolicy</a> API. For information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @sample AmazonIdentityManagementAsync.DetachRolePolicy
     */
    java.util.concurrent.Future<Void> detachRolePolicyAsync(
            DetachRolePolicyRequest detachRolePolicyRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteRolePolicy</a> API. For information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DetachRolePolicy
     */
    java.util.concurrent.Future<Void> detachRolePolicyAsync(
            DetachRolePolicyRequest detachRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachRolePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteUserPolicy</a> API. For information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @sample AmazonIdentityManagementAsync.DetachUserPolicy
     */
    java.util.concurrent.Future<Void> detachUserPolicyAsync(
            DetachUserPolicyRequest detachUserPolicyRequest);

    /**
     * <p>
     * Removes the specified managed policy from the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To delete an
     * inline policy, use the <a>DeleteUserPolicy</a> API. For information about
     * policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param detachUserPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.DetachUserPolicy
     */
    java.util.concurrent.Future<Void> detachUserPolicyAsync(
            DetachUserPolicyRequest detachUserPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<DetachUserPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * user name. When enabled, the MFA device is required for every subsequent
     * login by the user name associated with the device.
     * </p>
     * 
     * @param enableMFADeviceRequest
     * @sample AmazonIdentityManagementAsync.EnableMFADevice
     */
    java.util.concurrent.Future<Void> enableMFADeviceAsync(
            EnableMFADeviceRequest enableMFADeviceRequest);

    /**
     * <p>
     * Enables the specified MFA device and associates it with the specified
     * user name. When enabled, the MFA device is required for every subsequent
     * login by the user name associated with the device.
     * </p>
     * 
     * @param enableMFADeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.EnableMFADevice
     */
    java.util.concurrent.Future<Void> enableMFADeviceAsync(
            EnableMFADeviceRequest enableMFADeviceRequest,
            com.amazonaws.handlers.AsyncHandler<EnableMFADeviceRequest, Void> asyncHandler);

    /**
     * <p>
     * Generates a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateCredentialReportRequest
     * @return A Java Future containing the result of the
     *         GenerateCredentialReport operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GenerateCredentialReport
     */
    java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            GenerateCredentialReportRequest generateCredentialReportRequest);

    /**
     * <p>
     * Generates a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param generateCredentialReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GenerateCredentialReport operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GenerateCredentialReport
     */
    java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            GenerateCredentialReportRequest generateCredentialReportRequest,
            com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler);

    /**
     * Simplified method form for invoking the GenerateCredentialReport
     * operation.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest)
     */
    java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync();

    /**
     * Simplified method form for invoking the GenerateCredentialReport
     * operation with an AsyncHandler.
     *
     * @see #generateCredentialReportAsync(GenerateCredentialReportRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GenerateCredentialReportResult> generateCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GenerateCredentialReportRequest, GenerateCredentialReportResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about when the specified access key was last used.
     * The information includes the date and time of last use, along with the
     * AWS service and region that were specified in the last request made with
     * that key.
     * </p>
     * 
     * @param getAccessKeyLastUsedRequest
     * @return A Java Future containing the result of the GetAccessKeyLastUsed
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetAccessKeyLastUsed
     */
    java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(
            GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest);

    /**
     * <p>
     * Retrieves information about when the specified access key was last used.
     * The information includes the date and time of last use, along with the
     * AWS service and region that were specified in the last request made with
     * that key.
     * </p>
     * 
     * @param getAccessKeyLastUsedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccessKeyLastUsed
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetAccessKeyLastUsed
     */
    java.util.concurrent.Future<GetAccessKeyLastUsedResult> getAccessKeyLastUsedAsync(
            GetAccessKeyLastUsedRequest getAccessKeyLastUsedRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccessKeyLastUsedRequest, GetAccessKeyLastUsedResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and policies in
     * your account, including their relationships to one another. Use this API
     * to obtain a snapshot of the configuration of IAM permissions (users,
     * groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code>
     * parameter. You can paginate the results using the <code>MaxItems</code>
     * and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getAccountAuthorizationDetailsRequest
     * @return A Java Future containing the result of the
     *         GetAccountAuthorizationDetails operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetAccountAuthorizationDetails
     */
    java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest);

    /**
     * <p>
     * Retrieves information about all IAM users, groups, roles, and policies in
     * your account, including their relationships to one another. Use this API
     * to obtain a snapshot of the configuration of IAM permissions (users,
     * groups, roles, and policies) in your account.
     * </p>
     * <p>
     * You can optionally filter the results using the <code>Filter</code>
     * parameter. You can paginate the results using the <code>MaxItems</code>
     * and <code>Marker</code> parameters.
     * </p>
     * 
     * @param getAccountAuthorizationDetailsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetAccountAuthorizationDetails operation returned by the service.
     * @sample 
     *         AmazonIdentityManagementAsyncHandler.GetAccountAuthorizationDetails
     */
    java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            GetAccountAuthorizationDetailsRequest getAccountAuthorizationDetailsRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails
     * operation.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest)
     */
    java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync();

    /**
     * Simplified method form for invoking the GetAccountAuthorizationDetails
     * operation with an AsyncHandler.
     *
     * @see #getAccountAuthorizationDetailsAsync(GetAccountAuthorizationDetailsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetAccountAuthorizationDetailsResult> getAccountAuthorizationDetailsAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountAuthorizationDetailsRequest, GetAccountAuthorizationDetailsResult> asyncHandler);

    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more information
     * about using a password policy, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @return A Java Future containing the result of the
     *         GetAccountPasswordPolicy operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetAccountPasswordPolicy
     */
    java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest);

    /**
     * <p>
     * Retrieves the password policy for the AWS account. For more information
     * about using a password policy, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a>.
     * </p>
     * 
     * @param getAccountPasswordPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetAccountPasswordPolicy operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetAccountPasswordPolicy
     */
    java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            GetAccountPasswordPolicyRequest getAccountPasswordPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy
     * operation.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest)
     */
    java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync();

    /**
     * Simplified method form for invoking the GetAccountPasswordPolicy
     * operation with an AsyncHandler.
     *
     * @see #getAccountPasswordPolicyAsync(GetAccountPasswordPolicyRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetAccountPasswordPolicyResult> getAccountPasswordPolicyAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountPasswordPolicyRequest, GetAccountPasswordPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the AWS
     * account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @return A Java Future containing the result of the GetAccountSummary
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetAccountSummary
     */
    java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            GetAccountSummaryRequest getAccountSummaryRequest);

    /**
     * <p>
     * Retrieves information about IAM entity usage and IAM quotas in the AWS
     * account.
     * </p>
     * <p>
     * For information about limitations on IAM entities, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getAccountSummaryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetAccountSummary
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetAccountSummary
     */
    java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            GetAccountSummaryRequest getAccountSummaryRequest,
            com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetAccountSummary operation.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest)
     */
    java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync();

    /**
     * Simplified method form for invoking the GetAccountSummary operation with
     * an AsyncHandler.
     *
     * @see #getAccountSummaryAsync(GetAccountSummaryRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetAccountSummaryResult> getAccountSummaryAsync(
            com.amazonaws.handlers.AsyncHandler<GetAccountSummaryRequest, GetAccountSummaryResult> asyncHandler);

    /**
     * <p>
     * Gets a list of all of the context keys referenced in
     * <code>Condition</code> elements in the input policies. The policies are
     * supplied as a list of one or more strings. To get the context keys from
     * policies associated with an IAM user, group, or role, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM policy.
     * Use GetContextKeysForCustomPolicy to understand what key names and values
     * you must supply when you call <a>SimulateCustomPolicy</a>. Note that all
     * parameters are shown in unencoded form here for clarity, but must be URL
     * encoded to be included as a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @return A Java Future containing the result of the
     *         GetContextKeysForCustomPolicy operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetContextKeysForCustomPolicy
     */
    java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(
            GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest);

    /**
     * <p>
     * Gets a list of all of the context keys referenced in
     * <code>Condition</code> elements in the input policies. The policies are
     * supplied as a list of one or more strings. To get the context keys from
     * policies associated with an IAM user, group, or role, use
     * <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM policy.
     * Use GetContextKeysForCustomPolicy to understand what key names and values
     * you must supply when you call <a>SimulateCustomPolicy</a>. Note that all
     * parameters are shown in unencoded form here for clarity, but must be URL
     * encoded to be included as a part of a real HTML request.
     * </p>
     * 
     * @param getContextKeysForCustomPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetContextKeysForCustomPolicy operation returned by the service.
     * @sample 
     *         AmazonIdentityManagementAsyncHandler.GetContextKeysForCustomPolicy
     */
    java.util.concurrent.Future<GetContextKeysForCustomPolicyResult> getContextKeysForCustomPolicyAsync(
            GetContextKeysForCustomPolicyRequest getContextKeysForCustomPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetContextKeysForCustomPolicyRequest, GetContextKeysForCustomPolicyResult> asyncHandler);

    /**
     * <p>
     * Gets a list of all of the context keys referenced in
     * <code>Condition</code> elements in all of the IAM policies attached to
     * the specified IAM entity. The entity can be an IAM user, group, or role.
     * If you specify a user, then the request also includes all of the policies
     * attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies,
     * specified as strings. If you want to include only a list of policies by
     * string, use <a>GetContextKeysForCustomPolicy</a> instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>GetContextKeysForCustomPolicy</a>
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM policy.
     * Use GetContextKeysForPrincipalPolicy to understand what key names and
     * values you must supply when you call <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @return A Java Future containing the result of the
     *         GetContextKeysForPrincipalPolicy operation returned by the
     *         service.
     * @sample AmazonIdentityManagementAsync.GetContextKeysForPrincipalPolicy
     */
    java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest);

    /**
     * <p>
     * Gets a list of all of the context keys referenced in
     * <code>Condition</code> elements in all of the IAM policies attached to
     * the specified IAM entity. The entity can be an IAM user, group, or role.
     * If you specify a user, then the request also includes all of the policies
     * attached to groups that the user is a member of.
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies,
     * specified as strings. If you want to include only a list of policies by
     * string, use <a>GetContextKeysForCustomPolicy</a> instead.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>GetContextKeysForCustomPolicy</a>
     * instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request, and can be
     * evaluated by using the <code>Condition</code> element of an IAM policy.
     * Use GetContextKeysForPrincipalPolicy to understand what key names and
     * values you must supply when you call <a>SimulatePrincipalPolicy</a>.
     * </p>
     * 
     * @param getContextKeysForPrincipalPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetContextKeysForPrincipalPolicy operation returned by the
     *         service.
     * @sample 
     *         AmazonIdentityManagementAsyncHandler.GetContextKeysForPrincipalPolicy
     */
    java.util.concurrent.Future<GetContextKeysForPrincipalPolicyResult> getContextKeysForPrincipalPolicyAsync(
            GetContextKeysForPrincipalPolicyRequest getContextKeysForPrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetContextKeysForPrincipalPolicyRequest, GetContextKeysForPrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getCredentialReportRequest
     * @return A Java Future containing the result of the GetCredentialReport
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetCredentialReport
     */
    java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            GetCredentialReportRequest getCredentialReportRequest);

    /**
     * <p>
     * Retrieves a credential report for the AWS account. For more information
     * about the credential report, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/credential-reports.html"
     * >Getting Credential Reports</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getCredentialReportRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCredentialReport
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetCredentialReport
     */
    java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            GetCredentialReportRequest getCredentialReportRequest,
            com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetCredentialReport operation.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest)
     */
    java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync();

    /**
     * Simplified method form for invoking the GetCredentialReport operation
     * with an AsyncHandler.
     *
     * @see #getCredentialReportAsync(GetCredentialReportRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetCredentialReportResult> getCredentialReportAsync(
            com.amazonaws.handlers.AsyncHandler<GetCredentialReportRequest, GetCredentialReportResult> asyncHandler);

    /**
     * <p>
     * Returns a list of users that are in the specified group. You can paginate
     * the results using the <code>MaxItems</code> and <code>Marker</code>
     * parameters.
     * </p>
     * 
     * @param getGroupRequest
     * @return A Java Future containing the result of the GetGroup operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.GetGroup
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(
            GetGroupRequest getGroupRequest);

    /**
     * <p>
     * Returns a list of users that are in the specified group. You can paginate
     * the results using the <code>MaxItems</code> and <code>Marker</code>
     * parameters.
     * </p>
     * 
     * @param getGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroup operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetGroup
     */
    java.util.concurrent.Future<GetGroupResult> getGroupAsync(
            GetGroupRequest getGroupRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupRequest, GetGroupResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a group, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @return A Java Future containing the result of the GetGroupPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetGroupPolicy
     */
    java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(
            GetGroupPolicyRequest getGroupPolicyRequest);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a group, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetGroupPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetGroupPolicy
     */
    java.util.concurrent.Future<GetGroupPolicyResult> getGroupPolicyAsync(
            GetGroupPolicyRequest getGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetGroupPolicyRequest, GetGroupPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified instance profile, including the
     * instance profile's path, GUID, ARN, and role. For more information about
     * instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>. For more information about ARNs, go to <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"
     * >ARNs</a>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @return A Java Future containing the result of the GetInstanceProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetInstanceProfile
     */
    java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(
            GetInstanceProfileRequest getInstanceProfileRequest);

    /**
     * <p>
     * Retrieves information about the specified instance profile, including the
     * instance profile's path, GUID, ARN, and role. For more information about
     * instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>. For more information about ARNs, go to <a
     * href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"
     * >ARNs</a>.
     * </p>
     * 
     * @param getInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetInstanceProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetInstanceProfile
     */
    java.util.concurrent.Future<GetInstanceProfileResult> getInstanceProfileAsync(
            GetInstanceProfileRequest getInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetInstanceProfileRequest, GetInstanceProfileResult> asyncHandler);

    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified
     * user. If the user has not been assigned a password, the action returns a
     * 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @return A Java Future containing the result of the GetLoginProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetLoginProfile
     */
    java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(
            GetLoginProfileRequest getLoginProfileRequest);

    /**
     * <p>
     * Retrieves the user name and password-creation date for the specified
     * user. If the user has not been assigned a password, the action returns a
     * 404 (<code>NoSuchEntity</code>) error.
     * </p>
     * 
     * @param getLoginProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetLoginProfile
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetLoginProfile
     */
    java.util.concurrent.Future<GetLoginProfileResult> getLoginProfileAsync(
            GetLoginProfileRequest getLoginProfileRequest,
            com.amazonaws.handlers.AsyncHandler<GetLoginProfileRequest, GetLoginProfileResult> asyncHandler);

    /**
     * <p>
     * Returns information about the specified OpenID Connect provider.
     * </p>
     * 
     * @param getOpenIDConnectProviderRequest
     * @return A Java Future containing the result of the
     *         GetOpenIDConnectProvider operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetOpenIDConnectProvider
     */
    java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(
            GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest);

    /**
     * <p>
     * Returns information about the specified OpenID Connect provider.
     * </p>
     * 
     * @param getOpenIDConnectProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         GetOpenIDConnectProvider operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetOpenIDConnectProvider
     */
    java.util.concurrent.Future<GetOpenIDConnectProviderResult> getOpenIDConnectProviderAsync(
            GetOpenIDConnectProviderRequest getOpenIDConnectProviderRequest,
            com.amazonaws.handlers.AsyncHandler<GetOpenIDConnectProviderRequest, GetOpenIDConnectProviderResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified managed policy, including the
     * policy's default version and the total number of users, groups, and roles
     * that the policy is attached to. For a list of the specific users, groups,
     * and roles that the policy is attached to, use the
     * <a>ListEntitiesForPolicy</a> API. This API returns metadata about the
     * policy. To retrieve the policy document for a specific version of the
     * policy, use <a>GetPolicyVersion</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded with a user, group,
     * or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @return A Java Future containing the result of the GetPolicy operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest getPolicyRequest);

    /**
     * <p>
     * Retrieves information about the specified managed policy, including the
     * policy's default version and the total number of users, groups, and roles
     * that the policy is attached to. For a list of the specific users, groups,
     * and roles that the policy is attached to, use the
     * <a>ListEntitiesForPolicy</a> API. This API returns metadata about the
     * policy. To retrieve the policy document for a specific version of the
     * policy, use <a>GetPolicyVersion</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded with a user, group,
     * or role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicy operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetPolicy
     */
    java.util.concurrent.Future<GetPolicyResult> getPolicyAsync(
            GetPolicyRequest getPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyRequest, GetPolicyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified version of the specified
     * managed policy, including the policy document.
     * </p>
     * <p>
     * To list the available versions for a policy, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded in a user, group, or
     * role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about the types of policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @return A Java Future containing the result of the GetPolicyVersion
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest getPolicyVersionRequest);

    /**
     * <p>
     * Retrieves information about the specified version of the specified
     * managed policy, including the policy document.
     * </p>
     * <p>
     * To list the available versions for a policy, use
     * <a>ListPolicyVersions</a>.
     * </p>
     * <p>
     * This API retrieves information about managed policies. To retrieve
     * information about an inline policy that is embedded in a user, group, or
     * role, use the <a>GetUserPolicy</a>, <a>GetGroupPolicy</a>, or
     * <a>GetRolePolicy</a> API.
     * </p>
     * <p>
     * For more information about the types of policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getPolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetPolicyVersion
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetPolicyVersion
     */
    java.util.concurrent.Future<GetPolicyVersionResult> getPolicyVersionAsync(
            GetPolicyVersionRequest getPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<GetPolicyVersionRequest, GetPolicyVersionResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified role, including the role's
     * path, GUID, ARN, and the policy granting permission to assume the role.
     * For more information about ARNs, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"
     * >ARNs</a>. For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * 
     * @param getRoleRequest
     * @return A Java Future containing the result of the GetRole operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.GetRole
     */
    java.util.concurrent.Future<GetRoleResult> getRoleAsync(
            GetRoleRequest getRoleRequest);

    /**
     * <p>
     * Retrieves information about the specified role, including the role's
     * path, GUID, ARN, and the policy granting permission to assume the role.
     * For more information about ARNs, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html#Identifiers_ARNs"
     * >ARNs</a>. For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * 
     * @param getRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRole operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetRole
     */
    java.util.concurrent.Future<GetRoleResult> getRoleAsync(
            GetRoleRequest getRoleRequest,
            com.amazonaws.handlers.AsyncHandler<GetRoleRequest, GetRoleResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with the
     * specified role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a role, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @return A Java Future containing the result of the GetRolePolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetRolePolicy
     */
    java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(
            GetRolePolicyRequest getRolePolicyRequest);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded with the
     * specified role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a role, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param getRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetRolePolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetRolePolicy
     */
    java.util.concurrent.Future<GetRolePolicyResult> getRolePolicyAsync(
            GetRolePolicyRequest getRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetRolePolicyRequest, GetRolePolicyResult> asyncHandler);

    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the
     * provider was created or updated.
     * </p>
     * <note>This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param getSAMLProviderRequest
     * @return A Java Future containing the result of the GetSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetSAMLProvider
     */
    java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(
            GetSAMLProviderRequest getSAMLProviderRequest);

    /**
     * <p>
     * Returns the SAML provider metadocument that was uploaded when the
     * provider was created or updated.
     * </p>
     * <note>This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param getSAMLProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetSAMLProvider
     */
    java.util.concurrent.Future<GetSAMLProviderResult> getSAMLProviderAsync(
            GetSAMLProviderRequest getSAMLProviderRequest,
            com.amazonaws.handlers.AsyncHandler<GetSAMLProviderRequest, GetSAMLProviderResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the key.
     * </p>
     * <p>
     * The SSH public key retrieved by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @return A Java Future containing the result of the GetSSHPublicKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetSSHPublicKey
     */
    java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(
            GetSSHPublicKeyRequest getSSHPublicKeyRequest);

    /**
     * <p>
     * Retrieves the specified SSH public key, including metadata about the key.
     * </p>
     * <p>
     * The SSH public key retrieved by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param getSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetSSHPublicKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetSSHPublicKey
     */
    java.util.concurrent.Future<GetSSHPublicKeyResult> getSSHPublicKeyAsync(
            GetSSHPublicKeyRequest getSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<GetSSHPublicKeyRequest, GetSSHPublicKeyResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @return A Java Future containing the result of the GetServerCertificate
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetServerCertificate
     */
    java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(
            GetServerCertificateRequest getServerCertificateRequest);

    /**
     * <p>
     * Retrieves information about the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getServerCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetServerCertificate
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetServerCertificate
     */
    java.util.concurrent.Future<GetServerCertificateResult> getServerCertificateAsync(
            GetServerCertificateRequest getServerCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetServerCertificateRequest, GetServerCertificateResult> asyncHandler);

    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID used to sign the request.
     * </p>
     * 
     * @param getUserRequest
     * @return A Java Future containing the result of the GetUser operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.GetUser
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest getUserRequest);

    /**
     * <p>
     * Retrieves information about the specified user, including the user's
     * creation date, path, unique ID, and ARN.
     * </p>
     * <p>
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID used to sign the request.
     * </p>
     * 
     * @param getUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUser operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetUser
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(
            GetUserRequest getUserRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * Simplified method form for invoking the GetUser operation.
     *
     * @see #getUserAsync(GetUserRequest)
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync();

    /**
     * Simplified method form for invoking the GetUser operation with an
     * AsyncHandler.
     *
     * @see #getUserAsync(GetUserRequest, com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<GetUserResult> getUserAsync(
            com.amazonaws.handlers.AsyncHandler<GetUserRequest, GetUserResult> asyncHandler);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a user, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @return A Java Future containing the result of the GetUserPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.GetUserPolicy
     */
    java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(
            GetUserPolicyRequest getUserPolicyRequest);

    /**
     * <p>
     * Retrieves the specified inline policy document that is embedded in the
     * specified user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To retrieve a
     * managed policy document that is attached to a user, use <a>GetPolicy</a>
     * to determine the policy's default version, then use
     * <a>GetPolicyVersion</a> to retrieve the policy document.
     * </p>
     * <p>
     * For more information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param getUserPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetUserPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.GetUserPolicy
     */
    java.util.concurrent.Future<GetUserPolicyResult> getUserPolicyAsync(
            GetUserPolicyRequest getUserPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<GetUserPolicyRequest, GetUserPolicyResult> asyncHandler);

    /**
     * <p>
     * Returns information about the access key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <note>To ensure the security of your AWS account, the secret access key
     * is accessible only during key and user creation. </note>
     * 
     * @param listAccessKeysRequest
     * @return A Java Future containing the result of the ListAccessKeys
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListAccessKeys
     */
    java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            ListAccessKeysRequest listAccessKeysRequest);

    /**
     * <p>
     * Returns information about the access key IDs associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <note>To ensure the security of your AWS account, the secret access key
     * is accessible only during key and user creation. </note>
     * 
     * @param listAccessKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccessKeys
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListAccessKeys
     */
    java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            ListAccessKeysRequest listAccessKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAccessKeys operation.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest)
     */
    java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync();

    /**
     * Simplified method form for invoking the ListAccessKeys operation with an
     * AsyncHandler.
     *
     * @see #listAccessKeysAsync(ListAccessKeysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAccessKeysResult> listAccessKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccessKeysRequest, ListAccessKeysResult> asyncHandler);

    /**
     * <p>
     * Lists the account alias associated with the account (Note: you can have
     * only one). For information about using an AWS account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @return A Java Future containing the result of the ListAccountAliases
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListAccountAliases
     */
    java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            ListAccountAliasesRequest listAccountAliasesRequest);

    /**
     * <p>
     * Lists the account alias associated with the account (Note: you can have
     * only one). For information about using an AWS account alias, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AccountAlias.html">Using
     * an Alias for Your AWS Account ID</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listAccountAliasesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListAccountAliases
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListAccountAliases
     */
    java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            ListAccountAliasesRequest listAccountAliasesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListAccountAliases operation.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest)
     */
    java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync();

    /**
     * Simplified method form for invoking the ListAccountAliases operation with
     * an AsyncHandler.
     *
     * @see #listAccountAliasesAsync(ListAccountAliasesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListAccountAliasesResult> listAccountAliasesAsync(
            com.amazonaws.handlers.AsyncHandler<ListAccountAliasesRequest, ListAccountAliasesResult> asyncHandler);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To list the
     * inline policies for a group, use the <a>ListGroupPolicies</a> API. For
     * information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @return A Java Future containing the result of the
     *         ListAttachedGroupPolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListAttachedGroupPolicies
     */
    java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(
            ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified group.
     * </p>
     * <p>
     * A group can also have inline policies embedded with it. To list the
     * inline policies for a group, use the <a>ListGroupPolicies</a> API. For
     * information about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedGroupPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListAttachedGroupPolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListAttachedGroupPolicies
     */
    java.util.concurrent.Future<ListAttachedGroupPoliciesResult> listAttachedGroupPoliciesAsync(
            ListAttachedGroupPoliciesRequest listAttachedGroupPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedGroupPoliciesRequest, ListAttachedGroupPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To list the inline
     * policies for a role, use the <a>ListRolePolicies</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * role (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @return A Java Future containing the result of the
     *         ListAttachedRolePolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListAttachedRolePolicies
     */
    java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(
            ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified role.
     * </p>
     * <p>
     * A role can also have inline policies embedded with it. To list the inline
     * policies for a role, use the <a>ListRolePolicies</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * role (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedRolePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListAttachedRolePolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListAttachedRolePolicies
     */
    java.util.concurrent.Future<ListAttachedRolePoliciesResult> listAttachedRolePoliciesAsync(
            ListAttachedRolePoliciesRequest listAttachedRolePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedRolePoliciesRequest, ListAttachedRolePoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To list the inline
     * policies for a user, use the <a>ListUserPolicies</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @return A Java Future containing the result of the
     *         ListAttachedUserPolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListAttachedUserPolicies
     */
    java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(
            ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest);

    /**
     * <p>
     * Lists all managed policies that are attached to the specified user.
     * </p>
     * <p>
     * A user can also have inline policies embedded with it. To list the inline
     * policies for a user, use the <a>ListUserPolicies</a> API. For information
     * about policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. You can use the <code>PathPrefix</code>
     * parameter to limit the list of policies to only those matching the
     * specified path prefix. If there are no policies attached to the specified
     * group (or none that match the specified path prefix), the action returns
     * an empty list.
     * </p>
     * 
     * @param listAttachedUserPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListAttachedUserPolicies operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListAttachedUserPolicies
     */
    java.util.concurrent.Future<ListAttachedUserPoliciesResult> listAttachedUserPoliciesAsync(
            ListAttachedUserPoliciesRequest listAttachedUserPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListAttachedUserPoliciesRequest, ListAttachedUserPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists all users, groups, and roles that the specified managed policy is
     * attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit the
     * results to a particular type of entity (users, groups, or roles). For
     * example, to list only the roles that are attached to the specified
     * policy, set <code>EntityFilter</code> to <code>Role</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listEntitiesForPolicyRequest
     * @return A Java Future containing the result of the ListEntitiesForPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListEntitiesForPolicy
     */
    java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(
            ListEntitiesForPolicyRequest listEntitiesForPolicyRequest);

    /**
     * <p>
     * Lists all users, groups, and roles that the specified managed policy is
     * attached to.
     * </p>
     * <p>
     * You can use the optional <code>EntityFilter</code> parameter to limit the
     * results to a particular type of entity (users, groups, or roles). For
     * example, to list only the roles that are attached to the specified
     * policy, set <code>EntityFilter</code> to <code>Role</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listEntitiesForPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListEntitiesForPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListEntitiesForPolicy
     */
    java.util.concurrent.Future<ListEntitiesForPolicyResult> listEntitiesForPolicyAsync(
            ListEntitiesForPolicyRequest listEntitiesForPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<ListEntitiesForPolicyRequest, ListEntitiesForPolicyResult> asyncHandler);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To list the
     * managed policies that are attached to a group, use
     * <a>ListAttachedGroupPolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified group, the action returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @return A Java Future containing the result of the ListGroupPolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListGroupPolicies
     */
    java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(
            ListGroupPoliciesRequest listGroupPoliciesRequest);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * group.
     * </p>
     * <p>
     * A group can also have managed policies attached to it. To list the
     * managed policies that are attached to a group, use
     * <a>ListAttachedGroupPolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified group, the action returns an empty list.
     * </p>
     * 
     * @param listGroupPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupPolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListGroupPolicies
     */
    java.util.concurrent.Future<ListGroupPoliciesResult> listGroupPoliciesAsync(
            ListGroupPoliciesRequest listGroupPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupPoliciesRequest, ListGroupPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsRequest
     * @return A Java Future containing the result of the ListGroups operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.ListGroups
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            ListGroupsRequest listGroupsRequest);

    /**
     * <p>
     * Lists the groups that have the specified path prefix.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroups operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListGroups
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            ListGroupsRequest listGroupsRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListGroups operation.
     *
     * @see #listGroupsAsync(ListGroupsRequest)
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync();

    /**
     * Simplified method form for invoking the ListGroups operation with an
     * AsyncHandler.
     *
     * @see #listGroupsAsync(ListGroupsRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListGroupsResult> listGroupsAsync(
            com.amazonaws.handlers.AsyncHandler<ListGroupsRequest, ListGroupsResult> asyncHandler);

    /**
     * <p>
     * Lists the groups the specified user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsForUserRequest
     * @return A Java Future containing the result of the ListGroupsForUser
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListGroupsForUser
     */
    java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(
            ListGroupsForUserRequest listGroupsForUserRequest);

    /**
     * <p>
     * Lists the groups the specified user belongs to.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listGroupsForUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListGroupsForUser
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListGroupsForUser
     */
    java.util.concurrent.Future<ListGroupsForUserResult> listGroupsForUserAsync(
            ListGroupsForUserRequest listGroupsForUserRequest,
            com.amazonaws.handlers.AsyncHandler<ListGroupsForUserRequest, ListGroupsForUserResult> asyncHandler);

    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If there
     * are none, the action returns an empty list. For more information about
     * instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @return A Java Future containing the result of the ListInstanceProfiles
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListInstanceProfiles
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            ListInstanceProfilesRequest listInstanceProfilesRequest);

    /**
     * <p>
     * Lists the instance profiles that have the specified path prefix. If there
     * are none, the action returns an empty list. For more information about
     * instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListInstanceProfiles
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListInstanceProfiles
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            ListInstanceProfilesRequest listInstanceProfilesRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest)
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync();

    /**
     * Simplified method form for invoking the ListInstanceProfiles operation
     * with an AsyncHandler.
     *
     * @see #listInstanceProfilesAsync(ListInstanceProfilesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListInstanceProfilesResult> listInstanceProfilesAsync(
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesRequest, ListInstanceProfilesResult> asyncHandler);

    /**
     * <p>
     * Lists the instance profiles that have the specified associated role. If
     * there are none, the action returns an empty list. For more information
     * about instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @return A Java Future containing the result of the
     *         ListInstanceProfilesForRole operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListInstanceProfilesForRole
     */
    java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(
            ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest);

    /**
     * <p>
     * Lists the instance profiles that have the specified associated role. If
     * there are none, the action returns an empty list. For more information
     * about instance profiles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listInstanceProfilesForRoleRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListInstanceProfilesForRole operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListInstanceProfilesForRole
     */
    java.util.concurrent.Future<ListInstanceProfilesForRoleResult> listInstanceProfilesForRoleAsync(
            ListInstanceProfilesForRoleRequest listInstanceProfilesForRoleRequest,
            com.amazonaws.handlers.AsyncHandler<ListInstanceProfilesForRoleRequest, ListInstanceProfilesForRoleResult> asyncHandler);

    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then this
     * action lists all the MFA devices associated with the specified user name.
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listMFADevicesRequest
     * @return A Java Future containing the result of the ListMFADevices
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListMFADevices
     */
    java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            ListMFADevicesRequest listMFADevicesRequest);

    /**
     * <p>
     * Lists the MFA devices. If the request includes the user name, then this
     * action lists all the MFA devices associated with the specified user name.
     * If you do not specify a user name, IAM determines the user name
     * implicitly based on the AWS access key ID signing the request.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listMFADevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListMFADevices
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListMFADevices
     */
    java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            ListMFADevicesRequest listMFADevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListMFADevices operation.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest)
     */
    java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync();

    /**
     * Simplified method form for invoking the ListMFADevices operation with an
     * AsyncHandler.
     *
     * @see #listMFADevicesAsync(ListMFADevicesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListMFADevicesResult> listMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListMFADevicesRequest, ListMFADevicesResult> asyncHandler);

    /**
     * <p>
     * Lists information about the OpenID Connect providers in the AWS account.
     * </p>
     * 
     * @param listOpenIDConnectProvidersRequest
     * @return A Java Future containing the result of the
     *         ListOpenIDConnectProviders operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListOpenIDConnectProviders
     */
    java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest);

    /**
     * <p>
     * Lists information about the OpenID Connect providers in the AWS account.
     * </p>
     * 
     * @param listOpenIDConnectProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListOpenIDConnectProviders operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListOpenIDConnectProviders
     */
    java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            ListOpenIDConnectProvidersRequest listOpenIDConnectProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders
     * operation.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest)
     */
    java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync();

    /**
     * Simplified method form for invoking the ListOpenIDConnectProviders
     * operation with an AsyncHandler.
     *
     * @see #listOpenIDConnectProvidersAsync(ListOpenIDConnectProvidersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListOpenIDConnectProvidersResult> listOpenIDConnectProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListOpenIDConnectProvidersRequest, ListOpenIDConnectProvidersResult> asyncHandler);

    /**
     * <p>
     * Lists all the managed policies that are available to your account,
     * including your own customer managed policies and all AWS managed
     * policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the optional
     * <code>OnlyAttached</code>, <code>Scope</code>, and
     * <code>PathPrefix</code> parameters. For example, to list only the
     * customer managed policies in your AWS account, set <code>Scope</code> to
     * <code>Local</code>. To list only AWS managed policies, set
     * <code>Scope</code> to <code>AWS</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @return A Java Future containing the result of the ListPolicies operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest listPoliciesRequest);

    /**
     * <p>
     * Lists all the managed policies that are available to your account,
     * including your own customer managed policies and all AWS managed
     * policies.
     * </p>
     * <p>
     * You can filter the list of policies that is returned using the optional
     * <code>OnlyAttached</code>, <code>Scope</code>, and
     * <code>PathPrefix</code> parameters. For example, to list only the
     * customer managed policies in your AWS account, set <code>Scope</code> to
     * <code>Local</code>. To list only AWS managed policies, set
     * <code>Scope</code> to <code>AWS</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicies operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListPolicies
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            ListPoliciesRequest listPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListPolicies operation.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest)
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync();

    /**
     * Simplified method form for invoking the ListPolicies operation with an
     * AsyncHandler.
     *
     * @see #listPoliciesAsync(ListPoliciesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListPoliciesResult> listPoliciesAsync(
            com.amazonaws.handlers.AsyncHandler<ListPoliciesRequest, ListPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists information about the versions of the specified managed policy,
     * including the version that is set as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @return A Java Future containing the result of the ListPolicyVersions
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest listPolicyVersionsRequest);

    /**
     * <p>
     * Lists information about the versions of the specified managed policy,
     * including the version that is set as the policy's default version.
     * </p>
     * <p>
     * For more information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listPolicyVersionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListPolicyVersions
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListPolicyVersions
     */
    java.util.concurrent.Future<ListPolicyVersionsResult> listPolicyVersionsAsync(
            ListPolicyVersionsRequest listPolicyVersionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListPolicyVersionsRequest, ListPolicyVersionsResult> asyncHandler);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To list the managed
     * policies that are attached to a role, use
     * <a>ListAttachedRolePolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified role, the action returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @return A Java Future containing the result of the ListRolePolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListRolePolicies
     */
    java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(
            ListRolePoliciesRequest listRolePoliciesRequest);

    /**
     * <p>
     * Lists the names of the inline policies that are embedded in the specified
     * role.
     * </p>
     * <p>
     * A role can also have managed policies attached to it. To list the managed
     * policies that are attached to a role, use
     * <a>ListAttachedRolePolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified role, the action returns an empty list.
     * </p>
     * 
     * @param listRolePoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRolePolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListRolePolicies
     */
    java.util.concurrent.Future<ListRolePoliciesResult> listRolePoliciesAsync(
            ListRolePoliciesRequest listRolePoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRolePoliciesRequest, ListRolePoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the roles that have the specified path prefix. If there are none,
     * the action returns an empty list. For more information about roles, go to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listRolesRequest
     * @return A Java Future containing the result of the ListRoles operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.ListRoles
     */
    java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            ListRolesRequest listRolesRequest);

    /**
     * <p>
     * Lists the roles that have the specified path prefix. If there are none,
     * the action returns an empty list. For more information about roles, go to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listRolesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListRoles operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListRoles
     */
    java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            ListRolesRequest listRolesRequest,
            com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListRoles operation.
     *
     * @see #listRolesAsync(ListRolesRequest)
     */
    java.util.concurrent.Future<ListRolesResult> listRolesAsync();

    /**
     * Simplified method form for invoking the ListRoles operation with an
     * AsyncHandler.
     *
     * @see #listRolesAsync(ListRolesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListRolesResult> listRolesAsync(
            com.amazonaws.handlers.AsyncHandler<ListRolesRequest, ListRolesResult> asyncHandler);

    /**
     * <p>
     * Lists the SAML providers in the account.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param listSAMLProvidersRequest
     * @return A Java Future containing the result of the ListSAMLProviders
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListSAMLProviders
     */
    java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            ListSAMLProvidersRequest listSAMLProvidersRequest);

    /**
     * <p>
     * Lists the SAML providers in the account.
     * </p>
     * <note> This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param listSAMLProvidersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSAMLProviders
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListSAMLProviders
     */
    java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            ListSAMLProvidersRequest listSAMLProvidersRequest,
            com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSAMLProviders operation.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest)
     */
    java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync();

    /**
     * Simplified method form for invoking the ListSAMLProviders operation with
     * an AsyncHandler.
     *
     * @see #listSAMLProvidersAsync(ListSAMLProvidersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSAMLProvidersResult> listSAMLProvidersAsync(
            com.amazonaws.handlers.AsyncHandler<ListSAMLProvidersRequest, ListSAMLProvidersResult> asyncHandler);

    /**
     * <p>
     * Returns information about the SSH public keys associated with the
     * specified IAM user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for
     * authenticating the IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listSSHPublicKeysRequest
     * @return A Java Future containing the result of the ListSSHPublicKeys
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListSSHPublicKeys
     */
    java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            ListSSHPublicKeysRequest listSSHPublicKeysRequest);

    /**
     * <p>
     * Returns information about the SSH public keys associated with the
     * specified IAM user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * The SSH public keys returned by this action are used only for
     * authenticating the IAM user to an AWS CodeCommit repository. For more
     * information about using SSH keys to authenticate to an AWS CodeCommit
     * repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * <p>
     * Although each user is limited to a small number of keys, you can still
     * paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listSSHPublicKeysRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListSSHPublicKeys
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListSSHPublicKeys
     */
    java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            ListSSHPublicKeysRequest listSSHPublicKeysRequest,
            com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest)
     */
    java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync();

    /**
     * Simplified method form for invoking the ListSSHPublicKeys operation with
     * an AsyncHandler.
     *
     * @see #listSSHPublicKeysAsync(ListSSHPublicKeysRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSSHPublicKeysResult> listSSHPublicKeysAsync(
            com.amazonaws.handlers.AsyncHandler<ListSSHPublicKeysRequest, ListSSHPublicKeysResult> asyncHandler);

    /**
     * <p>
     * Lists the server certificates that have the specified path prefix. If
     * none exist, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @return A Java Future containing the result of the ListServerCertificates
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListServerCertificates
     */
    java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            ListServerCertificatesRequest listServerCertificatesRequest);

    /**
     * <p>
     * Lists the server certificates that have the specified path prefix. If
     * none exist, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param listServerCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListServerCertificates
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListServerCertificates
     */
    java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            ListServerCertificatesRequest listServerCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListServerCertificates operation.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest)
     */
    java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync();

    /**
     * Simplified method form for invoking the ListServerCertificates operation
     * with an AsyncHandler.
     *
     * @see #listServerCertificatesAsync(ListServerCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListServerCertificatesResult> listServerCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListServerCertificatesRequest, ListServerCertificatesResult> asyncHandler);

    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates,
     * you can still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @return A Java Future containing the result of the
     *         ListSigningCertificates operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListSigningCertificates
     */
    java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            ListSigningCertificatesRequest listSigningCertificatesRequest);

    /**
     * <p>
     * Returns information about the signing certificates associated with the
     * specified user. If there are none, the action returns an empty list.
     * </p>
     * <p>
     * Although each user is limited to a small number of signing certificates,
     * you can still paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * 
     * @param listSigningCertificatesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         ListSigningCertificates operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListSigningCertificates
     */
    java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            ListSigningCertificatesRequest listSigningCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListSigningCertificates
     * operation.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest)
     */
    java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync();

    /**
     * Simplified method form for invoking the ListSigningCertificates operation
     * with an AsyncHandler.
     *
     * @see #listSigningCertificatesAsync(ListSigningCertificatesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListSigningCertificatesResult> listSigningCertificatesAsync(
            com.amazonaws.handlers.AsyncHandler<ListSigningCertificatesRequest, ListSigningCertificatesResult> asyncHandler);

    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To list the managed
     * policies that are attached to a user, use
     * <a>ListAttachedUserPolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified user, the action returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @return A Java Future containing the result of the ListUserPolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListUserPolicies
     */
    java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(
            ListUserPoliciesRequest listUserPoliciesRequest);

    /**
     * <p>
     * Lists the names of the inline policies embedded in the specified user.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To list the managed
     * policies that are attached to a user, use
     * <a>ListAttachedUserPolicies</a>. For more information about policies,
     * refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters. If there are no inline policies embedded
     * with the specified user, the action returns an empty list.
     * </p>
     * 
     * @param listUserPoliciesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUserPolicies
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListUserPolicies
     */
    java.util.concurrent.Future<ListUserPoliciesResult> listUserPoliciesAsync(
            ListUserPoliciesRequest listUserPoliciesRequest,
            com.amazonaws.handlers.AsyncHandler<ListUserPoliciesRequest, ListUserPoliciesResult> asyncHandler);

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path
     * prefix is specified, the action returns all users in the AWS account. If
     * there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listUsersRequest
     * @return A Java Future containing the result of the ListUsers operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsync.ListUsers
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest listUsersRequest);

    /**
     * <p>
     * Lists the IAM users that have the specified path prefix. If no path
     * prefix is specified, the action returns all users in the AWS account. If
     * there are none, the action returns an empty list.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listUsersRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListUsers operation
     *         returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListUsers
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            ListUsersRequest listUsersRequest,
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListUsers operation.
     *
     * @see #listUsersAsync(ListUsersRequest)
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync();

    /**
     * Simplified method form for invoking the ListUsers operation with an
     * AsyncHandler.
     *
     * @see #listUsersAsync(ListUsersRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListUsersResult> listUsersAsync(
            com.amazonaws.handlers.AsyncHandler<ListUsersRequest, ListUsersResult> asyncHandler);

    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment status.
     * If you do not specify an assignment status, the action returns a list of
     * all virtual MFA devices. Assignment status can be <code>Assigned</code>,
     * <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @return A Java Future containing the result of the ListVirtualMFADevices
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.ListVirtualMFADevices
     */
    java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            ListVirtualMFADevicesRequest listVirtualMFADevicesRequest);

    /**
     * <p>
     * Lists the virtual MFA devices under the AWS account by assignment status.
     * If you do not specify an assignment status, the action returns a list of
     * all virtual MFA devices. Assignment status can be <code>Assigned</code>,
     * <code>Unassigned</code>, or <code>Any</code>.
     * </p>
     * <p>
     * You can paginate the results using the <code>MaxItems</code> and
     * <code>Marker</code> parameters.
     * </p>
     * 
     * @param listVirtualMFADevicesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListVirtualMFADevices
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.ListVirtualMFADevices
     */
    java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            ListVirtualMFADevicesRequest listVirtualMFADevicesRequest,
            com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler);

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest)
     */
    java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync();

    /**
     * Simplified method form for invoking the ListVirtualMFADevices operation
     * with an AsyncHandler.
     *
     * @see #listVirtualMFADevicesAsync(ListVirtualMFADevicesRequest,
     *      com.amazonaws.handlers.AsyncHandler)
     */
    java.util.concurrent.Future<ListVirtualMFADevicesResult> listVirtualMFADevicesAsync(
            com.amazonaws.handlers.AsyncHandler<ListVirtualMFADevicesRequest, ListVirtualMFADevicesResult> asyncHandler);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a managed
     * policy to a group, use <a>AttachGroupPolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a group, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutGroupPolicy</code>. For general
     * information about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putGroupPolicyRequest
     * @sample AmazonIdentityManagementAsync.PutGroupPolicy
     */
    java.util.concurrent.Future<Void> putGroupPolicyAsync(
            PutGroupPolicyRequest putGroupPolicyRequest);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified group.
     * </p>
     * <p>
     * A user can also have managed policies attached to it. To attach a managed
     * policy to a group, use <a>AttachGroupPolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a group, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutGroupPolicy</code>. For general
     * information about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putGroupPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.PutGroupPolicy
     */
    java.util.concurrent.Future<Void> putGroupPolicyAsync(
            PutGroupPolicyRequest putGroupPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutGroupPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used as
     * the role's access (permissions) policy. The role's trust policy is
     * created at the same time as the role, using <a>CreateRole</a>. You can
     * update a role's trust policy using <a>UpdateAssumeRolePolicy</a>. For
     * more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed
     * policy to a role, use <a>AttachRolePolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed with a role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutRolePolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putRolePolicyRequest
     * @sample AmazonIdentityManagementAsync.PutRolePolicy
     */
    java.util.concurrent.Future<Void> putRolePolicyAsync(
            PutRolePolicyRequest putRolePolicyRequest);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified role.
     * </p>
     * <p>
     * When you embed an inline policy in a role, the inline policy is used as
     * the role's access (permissions) policy. The role's trust policy is
     * created at the same time as the role, using <a>CreateRole</a>. You can
     * update a role's trust policy using <a>UpdateAssumeRolePolicy</a>. For
     * more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * <p>
     * A role can also have a managed policy attached to it. To attach a managed
     * policy to a role, use <a>AttachRolePolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed with a role, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutRolePolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.PutRolePolicy
     */
    java.util.concurrent.Future<Void> putRolePolicyAsync(
            PutRolePolicyRequest putRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutRolePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified user.
     * </p>
     * <p>
     * A user can also have a managed policy attached to it. To attach a managed
     * policy to a user, use <a>AttachUserPolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a user, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutUserPolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putUserPolicyRequest
     * @sample AmazonIdentityManagementAsync.PutUserPolicy
     */
    java.util.concurrent.Future<Void> putUserPolicyAsync(
            PutUserPolicyRequest putUserPolicyRequest);

    /**
     * <p>
     * Adds (or updates) an inline policy document that is embedded in the
     * specified user.
     * </p>
     * <p>
     * A user can also have a managed policy attached to it. To attach a managed
     * policy to a user, use <a>AttachUserPolicy</a>. To create a new managed
     * policy, use <a>CreatePolicy</a>. For information about policies, refer to
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about limits on the number of inline policies that you
     * can embed in a user, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/LimitationsOnEntities.html"
     * >Limitations on IAM Entities</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>Because policy documents can be large, you should use POST rather
     * than GET when calling <code>PutUserPolicy</code>. For general information
     * about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i> guide. </note>
     * 
     * @param putUserPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.PutUserPolicy
     */
    java.util.concurrent.Future<Void> putUserPolicyAsync(
            PutUserPolicyRequest putUserPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<PutUserPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the list of
     * client IDs registered for the specified IAM OpenID Connect provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you try
     * to remove a client ID that was removed previously.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @sample 
     *         AmazonIdentityManagementAsync.RemoveClientIDFromOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> removeClientIDFromOpenIDConnectProviderAsync(
            RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest);

    /**
     * <p>
     * Removes the specified client ID (also known as audience) from the list of
     * client IDs registered for the specified IAM OpenID Connect provider.
     * </p>
     * <p>
     * This action is idempotent; it does not fail or return an error if you try
     * to remove a client ID that was removed previously.
     * </p>
     * 
     * @param removeClientIDFromOpenIDConnectProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.
     *         RemoveClientIDFromOpenIDConnectProvider
     */
    java.util.concurrent.Future<Void> removeClientIDFromOpenIDConnectProviderAsync(
            RemoveClientIDFromOpenIDConnectProviderRequest removeClientIDFromOpenIDConnectProviderRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveClientIDFromOpenIDConnectProviderRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified role from the specified instance profile.
     * </p>
     * <important> Make sure you do not have any Amazon EC2 instances running
     * with the role you are about to remove from the instance profile. Removing
     * a role from an instance profile that is associated with a running
     * instance will break any applications running on the instance.
     * </important>
     * <p>
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @sample AmazonIdentityManagementAsync.RemoveRoleFromInstanceProfile
     */
    java.util.concurrent.Future<Void> removeRoleFromInstanceProfileAsync(
            RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest);

    /**
     * <p>
     * Removes the specified role from the specified instance profile.
     * </p>
     * <important> Make sure you do not have any Amazon EC2 instances running
     * with the role you are about to remove from the instance profile. Removing
     * a role from an instance profile that is associated with a running
     * instance will break any applications running on the instance.
     * </important>
     * <p>
     * For more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/WorkingWithRoles.html"
     * >Working with Roles</a>. For more information about instance profiles, go
     * to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/AboutInstanceProfiles.html"
     * >About Instance Profiles</a>.
     * </p>
     * 
     * @param removeRoleFromInstanceProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample 
     *         AmazonIdentityManagementAsyncHandler.RemoveRoleFromInstanceProfile
     */
    java.util.concurrent.Future<Void> removeRoleFromInstanceProfileAsync(
            RemoveRoleFromInstanceProfileRequest removeRoleFromInstanceProfileRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveRoleFromInstanceProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * 
     * @param removeUserFromGroupRequest
     * @sample AmazonIdentityManagementAsync.RemoveUserFromGroup
     */
    java.util.concurrent.Future<Void> removeUserFromGroupAsync(
            RemoveUserFromGroupRequest removeUserFromGroupRequest);

    /**
     * <p>
     * Removes the specified user from the specified group.
     * </p>
     * 
     * @param removeUserFromGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.RemoveUserFromGroup
     */
    java.util.concurrent.Future<Void> removeUserFromGroupAsync(
            RemoveUserFromGroupRequest removeUserFromGroupRequest,
            com.amazonaws.handlers.AsyncHandler<RemoveUserFromGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Synchronizes the specified MFA device with AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @sample AmazonIdentityManagementAsync.ResyncMFADevice
     */
    java.util.concurrent.Future<Void> resyncMFADeviceAsync(
            ResyncMFADeviceRequest resyncMFADeviceRequest);

    /**
     * <p>
     * Synchronizes the specified MFA device with AWS servers.
     * </p>
     * <p>
     * For more information about creating and working with virtual MFA devices,
     * go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_VirtualMFA.html"
     * >Using a Virtual MFA Device</a> in the <i>Using IAM</i> guide.
     * </p>
     * 
     * @param resyncMFADeviceRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.ResyncMFADevice
     */
    java.util.concurrent.Future<Void> resyncMFADeviceAsync(
            ResyncMFADeviceRequest resyncMFADeviceRequest,
            com.amazonaws.handlers.AsyncHandler<ResyncMFADeviceRequest, Void> asyncHandler);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version.
     * </p>
     * <p>
     * This action affects all users, groups, and roles that the policy is
     * attached to. To list the users, groups, and roles that the policy is
     * attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @sample AmazonIdentityManagementAsync.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest);

    /**
     * <p>
     * Sets the specified version of the specified policy as the policy's
     * default (operative) version.
     * </p>
     * <p>
     * This action affects all users, groups, and roles that the policy is
     * attached to. To list the users, groups, and roles that the policy is
     * attached to, use the <a>ListEntitiesForPolicy</a> API.
     * </p>
     * <p>
     * For information about managed policies, refer to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
     * >Managed Policies and Inline Policies</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param setDefaultPolicyVersionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.SetDefaultPolicyVersion
     */
    java.util.concurrent.Future<Void> setDefaultPolicyVersionAsync(
            SetDefaultPolicyVersionRequest setDefaultPolicyVersionRequest,
            com.amazonaws.handlers.AsyncHandler<SetDefaultPolicyVersionRequest, Void> asyncHandler);

    /**
     * <p>
     * Simulate how a set of IAM policies and optionally a resource-based policy
     * works with a list of API actions and AWS resources to determine the
     * policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API actions; it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * If you want to simulate existing policies attached to an IAM user, group,
     * or role, use <a>SimulatePrincipalPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. You can use
     * the <code>Condition</code> element of an IAM policy to evaluate context
     * keys. To get the list of context keys that the policies require for
     * correct simulation, use <a>GetContextKeysForCustomPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulateCustomPolicyRequest
     * @return A Java Future containing the result of the SimulateCustomPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.SimulateCustomPolicy
     */
    java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(
            SimulateCustomPolicyRequest simulateCustomPolicyRequest);

    /**
     * <p>
     * Simulate how a set of IAM policies and optionally a resource-based policy
     * works with a list of API actions and AWS resources to determine the
     * policies' effective permissions. The policies are provided as strings.
     * </p>
     * <p>
     * The simulation does not perform the API actions; it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * If you want to simulate existing policies attached to an IAM user, group,
     * or role, use <a>SimulatePrincipalPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. You can use
     * the <code>Condition</code> element of an IAM policy to evaluate context
     * keys. To get the list of context keys that the policies require for
     * correct simulation, use <a>GetContextKeysForCustomPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulateCustomPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the SimulateCustomPolicy
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.SimulateCustomPolicy
     */
    java.util.concurrent.Future<SimulateCustomPolicyResult> simulateCustomPolicyAsync(
            SimulateCustomPolicyRequest simulateCustomPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SimulateCustomPolicyRequest, SimulateCustomPolicyResult> asyncHandler);

    /**
     * <p>
     * Simulate how a set of IAM policies attached to an IAM entity works with a
     * list of API actions and AWS resources to determine the policies'
     * effective permissions. The entity can be an IAM user, group, or role. If
     * you specify a user, then the simulation also includes all of the policies
     * that are attached to groups that the user belongs to .
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies
     * specified as strings to include in the simulation. If you want to
     * simulate only policies specified as strings, use
     * <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * You can also optionally include one resource-based policy to be evaluated
     * with each of the resources included in the simulation.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. You can use
     * the <code>Condition</code> element of an IAM policy to evaluate context
     * keys. To get the list of context keys that the policies require for
     * correct simulation, use <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use the <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulatePrincipalPolicyRequest
     * @return A Java Future containing the result of the
     *         SimulatePrincipalPolicy operation returned by the service.
     * @sample AmazonIdentityManagementAsync.SimulatePrincipalPolicy
     */
    java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(
            SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest);

    /**
     * <p>
     * Simulate how a set of IAM policies attached to an IAM entity works with a
     * list of API actions and AWS resources to determine the policies'
     * effective permissions. The entity can be an IAM user, group, or role. If
     * you specify a user, then the simulation also includes all of the policies
     * that are attached to groups that the user belongs to .
     * </p>
     * <p>
     * You can optionally include a list of one or more additional policies
     * specified as strings to include in the simulation. If you want to
     * simulate only policies specified as strings, use
     * <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * You can also optionally include one resource-based policy to be evaluated
     * with each of the resources included in the simulation.
     * </p>
     * <p>
     * The simulation does not perform the API actions, it only checks the
     * authorization to determine if the simulated policies allow or deny the
     * actions.
     * </p>
     * <p>
     * <b>Note:</b> This API discloses information about the permissions granted
     * to other users. If you do not want users to see other user's permissions,
     * then consider allowing them to use <a>SimulateCustomPolicy</a> instead.
     * </p>
     * <p>
     * Context keys are variables maintained by AWS and its services that
     * provide details about the context of an API query request. You can use
     * the <code>Condition</code> element of an IAM policy to evaluate context
     * keys. To get the list of context keys that the policies require for
     * correct simulation, use <a>GetContextKeysForPrincipalPolicy</a>.
     * </p>
     * <p>
     * If the output is long, you can use the <code>MaxItems</code> and
     * <code>Marker</code> parameters to paginate the results.
     * </p>
     * 
     * @param simulatePrincipalPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         SimulatePrincipalPolicy operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.SimulatePrincipalPolicy
     */
    java.util.concurrent.Future<SimulatePrincipalPolicyResult> simulatePrincipalPolicyAsync(
            SimulatePrincipalPolicyRequest simulatePrincipalPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<SimulatePrincipalPolicyRequest, SimulatePrincipalPolicyResult> asyncHandler);

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive,
     * or vice versa. This action can be used to disable a user's key as part of
     * a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html"
     * >Managing Keys and Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @sample AmazonIdentityManagementAsync.UpdateAccessKey
     */
    java.util.concurrent.Future<Void> updateAccessKeyAsync(
            UpdateAccessKeyRequest updateAccessKeyRequest);

    /**
     * <p>
     * Changes the status of the specified access key from Active to Inactive,
     * or vice versa. This action can be used to disable a user's key as part of
     * a key rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <p>
     * For information about rotating keys, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/ManagingCredentials.html"
     * >Managing Keys and Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccessKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateAccessKey
     */
    java.util.concurrent.Future<Void> updateAccessKeyAsync(
            UpdateAccessKeyRequest updateAccessKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccessKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <note>
     * <p>
     * This action does not support partial updates. No parameters are required,
     * but if you do not specify a parameter, that parameter's value reverts to
     * its default value. See the <b>Request Parameters</b> section for each
     * parameter's default value.
     * </p>
     * </note>
     * <p>
     * For more information about using a password policy, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @sample AmazonIdentityManagementAsync.UpdateAccountPasswordPolicy
     */
    java.util.concurrent.Future<Void> updateAccountPasswordPolicyAsync(
            UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest);

    /**
     * <p>
     * Updates the password policy settings for the AWS account.
     * </p>
     * <note>
     * <p>
     * This action does not support partial updates. No parameters are required,
     * but if you do not specify a parameter, that parameter's value reverts to
     * its default value. See the <b>Request Parameters</b> section for each
     * parameter's default value.
     * </p>
     * </note>
     * <p>
     * For more information about using a password policy, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingPasswordPolicies.html"
     * >Managing an IAM Password Policy</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateAccountPasswordPolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateAccountPasswordPolicy
     */
    java.util.concurrent.Future<Void> updateAccountPasswordPolicyAsync(
            UpdateAccountPasswordPolicyRequest updateAccountPasswordPolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAccountPasswordPolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the policy that grants an entity permission to assume a role. For
     * more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @sample AmazonIdentityManagementAsync.UpdateAssumeRolePolicy
     */
    java.util.concurrent.Future<Void> updateAssumeRolePolicyAsync(
            UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest);

    /**
     * <p>
     * Updates the policy that grants an entity permission to assume a role. For
     * more information about roles, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/roles-toplevel.html"
     * >Using Roles to Delegate Permissions and Federate Identities</a>.
     * </p>
     * 
     * @param updateAssumeRolePolicyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateAssumeRolePolicy
     */
    java.util.concurrent.Future<Void> updateAssumeRolePolicyAsync(
            UpdateAssumeRolePolicyRequest updateAssumeRolePolicyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateAssumeRolePolicyRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the name and/or the path of the specified group.
     * </p>
     * <important> You should understand the implications of changing a group's
     * path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
     * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>. </important>
     * <note>To change a group name the requester must have appropriate
     * permissions on both the source object and the target object. For example,
     * to change Managers to MGRs, the entity making the request must have
     * permission on Managers and MGRs, or must have permission on all (*). For
     * more information about permissions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * target="blank">Permissions and Policies</a>. </note>
     * 
     * @param updateGroupRequest
     * @sample AmazonIdentityManagementAsync.UpdateGroup
     */
    java.util.concurrent.Future<Void> updateGroupAsync(
            UpdateGroupRequest updateGroupRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified group.
     * </p>
     * <important> You should understand the implications of changing a group's
     * path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
     * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>. </important>
     * <note>To change a group name the requester must have appropriate
     * permissions on both the source object and the target object. For example,
     * to change Managers to MGRs, the entity making the request must have
     * permission on Managers and MGRs, or must have permission on all (*). For
     * more information about permissions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * target="blank">Permissions and Policies</a>. </note>
     * 
     * @param updateGroupRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateGroup
     */
    java.util.concurrent.Future<Void> updateGroupAsync(
            UpdateGroupRequest updateGroupRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateGroupRequest, Void> asyncHandler);

    /**
     * <p>
     * Changes the password for the specified user.
     * </p>
     * <p>
     * Users can change their own passwords by calling <a>ChangePassword</a>.
     * For more information about modifying passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateLoginProfileRequest
     * @sample AmazonIdentityManagementAsync.UpdateLoginProfile
     */
    java.util.concurrent.Future<Void> updateLoginProfileAsync(
            UpdateLoginProfileRequest updateLoginProfileRequest);

    /**
     * <p>
     * Changes the password for the specified user.
     * </p>
     * <p>
     * Users can change their own passwords by calling <a>ChangePassword</a>.
     * For more information about modifying passwords, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html"
     * >Managing Passwords</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param updateLoginProfileRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateLoginProfile
     */
    java.util.concurrent.Future<Void> updateLoginProfileAsync(
            UpdateLoginProfileRequest updateLoginProfileRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateLoginProfileRequest, Void> asyncHandler);

    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints with a new
     * list.
     * </p>
     * <p>
     * The list that you pass with this action completely replaces the existing
     * list of thumbprints. (The lists are not merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity
     * provider's certificate changes, which occurs rarely. However, if the
     * provider's certificate <i>does</i> change, any attempt to assume an IAM
     * role that specifies the OIDC provider as a principal will fail until the
     * certificate thumbprint is updated.
     * </p>
     * <note>Because trust for the OpenID Connect provider is ultimately derived
     * from the provider's certificate and is validated by the thumbprint, it is
     * a best practice to limit access to the
     * <code>UpdateOpenIDConnectProviderThumbprint</code> action to
     * highly-privileged users. </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @sample 
     *         AmazonIdentityManagementAsync.UpdateOpenIDConnectProviderThumbprint
     */
    java.util.concurrent.Future<Void> updateOpenIDConnectProviderThumbprintAsync(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest);

    /**
     * <p>
     * Replaces the existing list of server certificate thumbprints with a new
     * list.
     * </p>
     * <p>
     * The list that you pass with this action completely replaces the existing
     * list of thumbprints. (The lists are not merged.)
     * </p>
     * <p>
     * Typically, you need to update a thumbprint only when the identity
     * provider's certificate changes, which occurs rarely. However, if the
     * provider's certificate <i>does</i> change, any attempt to assume an IAM
     * role that specifies the OIDC provider as a principal will fail until the
     * certificate thumbprint is updated.
     * </p>
     * <note>Because trust for the OpenID Connect provider is ultimately derived
     * from the provider's certificate and is validated by the thumbprint, it is
     * a best practice to limit access to the
     * <code>UpdateOpenIDConnectProviderThumbprint</code> action to
     * highly-privileged users. </note>
     * 
     * @param updateOpenIDConnectProviderThumbprintRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.
     *         UpdateOpenIDConnectProviderThumbprint
     */
    java.util.concurrent.Future<Void> updateOpenIDConnectProviderThumbprintAsync(
            UpdateOpenIDConnectProviderThumbprintRequest updateOpenIDConnectProviderThumbprintRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateOpenIDConnectProviderThumbprintRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the metadata document for an existing SAML provider.
     * </p>
     * <note>This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param updateSAMLProviderRequest
     * @return A Java Future containing the result of the UpdateSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.UpdateSAMLProvider
     */
    java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(
            UpdateSAMLProviderRequest updateSAMLProviderRequest);

    /**
     * <p>
     * Updates the metadata document for an existing SAML provider.
     * </p>
     * <note>This operation requires <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signature-version-4.html"
     * >Signature Version 4</a>. </note>
     * 
     * @param updateSAMLProviderRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UpdateSAMLProvider
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateSAMLProvider
     */
    java.util.concurrent.Future<UpdateSAMLProviderResult> updateSAMLProviderAsync(
            UpdateSAMLProviderRequest updateSAMLProviderRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSAMLProviderRequest, UpdateSAMLProviderResult> asyncHandler);

    /**
     * <p>
     * Sets the status of the specified SSH public key to active or inactive.
     * SSH public keys that are inactive cannot be used for authentication. This
     * action can be used to disable a user's SSH public key as part of a key
     * rotation work flow.
     * </p>
     * <p>
     * The SSH public key affected by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @sample AmazonIdentityManagementAsync.UpdateSSHPublicKey
     */
    java.util.concurrent.Future<Void> updateSSHPublicKeyAsync(
            UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest);

    /**
     * <p>
     * Sets the status of the specified SSH public key to active or inactive.
     * SSH public keys that are inactive cannot be used for authentication. This
     * action can be used to disable a user's SSH public key as part of a key
     * rotation work flow.
     * </p>
     * <p>
     * The SSH public key affected by this action is used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param updateSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateSSHPublicKey
     */
    java.util.concurrent.Future<Void> updateSSHPublicKeyAsync(
            UpdateSSHPublicKeyRequest updateSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSSHPublicKeyRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>You should understand the implications of changing a server
     * certificate's path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User
     * Guide</i>.</important> <note>To change a server certificate name the
     * requester must have appropriate permissions on both the source object and
     * the target object. For example, to change the name from ProductionCert to
     * ProdCert, the entity making the request must have permission on
     * ProductionCert and ProdCert, or must have permission on all (*). For more
     * information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     * Management</a> in the <i>IAM User Guide</i>. </note>
     * 
     * @param updateServerCertificateRequest
     * @sample AmazonIdentityManagementAsync.UpdateServerCertificate
     */
    java.util.concurrent.Future<Void> updateServerCertificateAsync(
            UpdateServerCertificateRequest updateServerCertificateRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified server certificate.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <important>You should understand the implications of changing a server
     * certificate's path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs_manage.html#RenamingServerCerts"
     * >Renaming a Server Certificate</a> in the <i>IAM User
     * Guide</i>.</important> <note>To change a server certificate name the
     * requester must have appropriate permissions on both the source object and
     * the target object. For example, to change the name from ProductionCert to
     * ProdCert, the entity making the request must have permission on
     * ProductionCert and ProdCert, or must have permission on all (*). For more
     * information about permissions, see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/access.html">Access
     * Management</a> in the <i>IAM User Guide</i>. </note>
     * 
     * @param updateServerCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateServerCertificate
     */
    java.util.concurrent.Future<Void> updateServerCertificateAsync(
            UpdateServerCertificateRequest updateServerCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateServerCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Changes the status of the specified signing certificate from active to
     * disabled, or vice versa. This action can be used to disable a user's
     * signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @sample AmazonIdentityManagementAsync.UpdateSigningCertificate
     */
    java.util.concurrent.Future<Void> updateSigningCertificateAsync(
            UpdateSigningCertificateRequest updateSigningCertificateRequest);

    /**
     * <p>
     * Changes the status of the specified signing certificate from active to
     * disabled, or vice versa. This action can be used to disable a user's
     * signing certificate as part of a certificate rotation work flow.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the UserName is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * 
     * @param updateSigningCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateSigningCertificate
     */
    java.util.concurrent.Future<Void> updateSigningCertificateAsync(
            UpdateSigningCertificateRequest updateSigningCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateSigningCertificateRequest, Void> asyncHandler);

    /**
     * <p>
     * Updates the name and/or the path of the specified user.
     * </p>
     * <important> You should understand the implications of changing a user's
     * path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
     * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>. </important>
     * <note> To change a user name the requester must have appropriate
     * permissions on both the source object and the target object. For example,
     * to change Bob to Robert, the entity making the request must have
     * permission on Bob and Robert, or must have permission on all (*). For
     * more information about permissions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * target="blank">Permissions and Policies</a>. </note>
     * 
     * @param updateUserRequest
     * @sample AmazonIdentityManagementAsync.UpdateUser
     */
    java.util.concurrent.Future<Void> updateUserAsync(
            UpdateUserRequest updateUserRequest);

    /**
     * <p>
     * Updates the name and/or the path of the specified user.
     * </p>
     * <important> You should understand the implications of changing a user's
     * path or name. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_WorkingWithGroupsAndUsers.html"
     * >Renaming Users and Groups</a> in the <i>IAM User Guide</i>. </important>
     * <note> To change a user name the requester must have appropriate
     * permissions on both the source object and the target object. For example,
     * to change Bob to Robert, the entity making the request must have
     * permission on Bob and Robert, or must have permission on all (*). For
     * more information about permissions, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/PermissionsAndPolicies.html"
     * target="blank">Permissions and Policies</a>. </note>
     * 
     * @param updateUserRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonIdentityManagementAsyncHandler.UpdateUser
     */
    java.util.concurrent.Future<Void> updateUserAsync(
            UpdateUserRequest updateUserRequest,
            com.amazonaws.handlers.AsyncHandler<UpdateUserRequest, Void> asyncHandler);

    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM user.
     * </p>
     * <p>
     * The SSH public key uploaded by this action can be used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @return A Java Future containing the result of the UploadSSHPublicKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsync.UploadSSHPublicKey
     */
    java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(
            UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest);

    /**
     * <p>
     * Uploads an SSH public key and associates it with the specified IAM user.
     * </p>
     * <p>
     * The SSH public key uploaded by this action can be used only for
     * authenticating the associated IAM user to an AWS CodeCommit repository.
     * For more information about using SSH keys to authenticate to an AWS
     * CodeCommit repository, see <a href=
     * "http://docs.aws.amazon.com/codecommit/latest/userguide/setting-up-credentials-ssh.html"
     * >Set up AWS CodeCommit for SSH Connections</a> in the <i>AWS CodeCommit
     * User Guide</i>.
     * </p>
     * 
     * @param uploadSSHPublicKeyRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the UploadSSHPublicKey
     *         operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.UploadSSHPublicKey
     */
    java.util.concurrent.Future<UploadSSHPublicKeyResult> uploadSSHPublicKeyAsync(
            UploadSSHPublicKeyRequest uploadSSHPublicKeyRequest,
            com.amazonaws.handlers.AsyncHandler<UploadSSHPublicKeyRequest, UploadSSHPublicKeyResult> asyncHandler);

    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server
     * certificate entity includes a public key certificate, a private key, and
     * an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html"
     * >Limitations on IAM Entities and Objects</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>Because the body of the public key certificate, private key, and
     * the certificate chain can be large, you should use POST rather than GET
     * when calling <code>UploadServerCertificate</code>. For information about
     * setting up signatures and authorization through the API, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html"
     * >Calling the API by Making HTTP Query Requests</a> in the <i>IAM User
     * Guide</i>. </note>
     * 
     * @param uploadServerCertificateRequest
     * @return A Java Future containing the result of the
     *         UploadServerCertificate operation returned by the service.
     * @sample AmazonIdentityManagementAsync.UploadServerCertificate
     */
    java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(
            UploadServerCertificateRequest uploadServerCertificateRequest);

    /**
     * <p>
     * Uploads a server certificate entity for the AWS account. The server
     * certificate entity includes a public key certificate, a private key, and
     * an optional certificate chain, which should all be PEM-encoded.
     * </p>
     * <p>
     * For more information about working with server certificates, including a
     * list of AWS services that can use the server certificates that you manage
     * with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_server-certs.html"
     * >Working with Server Certificates</a> in the <i>IAM User Guide</i>.
     * </p>
     * <p>
     * For information about the number of server certificates you can upload,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_iam-limits.html"
     * >Limitations on IAM Entities and Objects</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>Because the body of the public key certificate, private key, and
     * the certificate chain can be large, you should use POST rather than GET
     * when calling <code>UploadServerCertificate</code>. For information about
     * setting up signatures and authorization through the API, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/programming.html"
     * >Calling the API by Making HTTP Query Requests</a> in the <i>IAM User
     * Guide</i>. </note>
     * 
     * @param uploadServerCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UploadServerCertificate operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.UploadServerCertificate
     */
    java.util.concurrent.Future<UploadServerCertificateResult> uploadServerCertificateAsync(
            UploadServerCertificateRequest uploadServerCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UploadServerCertificateRequest, UploadServerCertificateResult> asyncHandler);

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the specified
     * user. Some AWS services use X.509 signing certificates to validate
     * requests that are signed with a corresponding private key. When you
     * upload the certificate, its default status is <code>Active</code>.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <note>Because the body of a X.509 certificate can be large, you should
     * use POST rather than GET when calling
     * <code>UploadSigningCertificate</code>. For information about setting up
     * signatures and authorization through the API, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i>guide. </note>
     * 
     * @param uploadSigningCertificateRequest
     * @return A Java Future containing the result of the
     *         UploadSigningCertificate operation returned by the service.
     * @sample AmazonIdentityManagementAsync.UploadSigningCertificate
     */
    java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(
            UploadSigningCertificateRequest uploadSigningCertificateRequest);

    /**
     * <p>
     * Uploads an X.509 signing certificate and associates it with the specified
     * user. Some AWS services use X.509 signing certificates to validate
     * requests that are signed with a corresponding private key. When you
     * upload the certificate, its default status is <code>Active</code>.
     * </p>
     * <p>
     * If the <code>UserName</code> field is not specified, the user name is
     * determined implicitly based on the AWS access key ID used to sign the
     * request. Because this action works for access keys under the AWS account,
     * you can use this action to manage root credentials even if the AWS
     * account has no associated users.
     * </p>
     * <note>Because the body of a X.509 certificate can be large, you should
     * use POST rather than GET when calling
     * <code>UploadSigningCertificate</code>. For information about setting up
     * signatures and authorization through the API, go to <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/signing_aws_api_requests.html"
     * >Signing AWS API Requests</a> in the <i>AWS General Reference</i>. For
     * general information about using the Query API with IAM, go to <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/IAM_UsingQueryAPI.html"
     * >Making Query Requests</a> in the <i>Using IAM</i>guide. </note>
     * 
     * @param uploadSigningCertificateRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the
     *         UploadSigningCertificate operation returned by the service.
     * @sample AmazonIdentityManagementAsyncHandler.UploadSigningCertificate
     */
    java.util.concurrent.Future<UploadSigningCertificateResult> uploadSigningCertificateAsync(
            UploadSigningCertificateRequest uploadSigningCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<UploadSigningCertificateRequest, UploadSigningCertificateResult> asyncHandler);

}
