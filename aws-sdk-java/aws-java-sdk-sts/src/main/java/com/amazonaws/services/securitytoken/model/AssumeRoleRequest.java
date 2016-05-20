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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class AssumeRoleRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     */
    private String roleSessionName;
    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size.</note>
     */
    private String policy;
    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds.
     * </p>
     */
    private Integer durationSeconds;
    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String externalId;
    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     */
    private String serialNumber;
    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     */
    private String tokenCode;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to assume.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to assume.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role to assume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. </p>
     *        <p>
     *        Use the role session name to uniquely identify a session when the
     *        same role is assumed by different principals or for different
     *        reasons. In cross-account scenarios, the role session name is
     *        visible to, and can be logged by the account that owns the role.
     *        The role session name is also used in the ARN of the assumed role
     *        principal. This means that subsequent cross-account API requests
     *        using the temporary security credentials will expose the role
     *        session name to the external account in their CloudTrail logs.
     */

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * 
     * @return An identifier for the assumed role session. </p>
     *         <p>
     *         Use the role session name to uniquely identify a session when the
     *         same role is assumed by different principals or for different
     *         reasons. In cross-account scenarios, the role session name is
     *         visible to, and can be logged by the account that owns the role.
     *         The role session name is also used in the ARN of the assumed role
     *         principal. This means that subsequent cross-account API requests
     *         using the temporary security credentials will expose the role
     *         session name to the external account in their CloudTrail logs.
     */

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session.
     * </p>
     * <p>
     * Use the role session name to uniquely identify a session when the same
     * role is assumed by different principals or for different reasons. In
     * cross-account scenarios, the role session name is visible to, and can be
     * logged by the account that owns the role. The role session name is also
     * used in the ARN of the assumed role principal. This means that subsequent
     * cross-account API requests using the temporary security credentials will
     * expose the role session name to the external account in their CloudTrail
     * logs.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. </p>
     *        <p>
     *        Use the role session name to uniquely identify a session when the
     *        same role is assumed by different principals or for different
     *        reasons. In cross-account scenarios, the role session name is
     *        visible to, and can be logged by the account that owns the role.
     *        The role session name is also used in the ARN of the assumed role
     *        principal. This means that subsequent cross-account API requests
     *        using the temporary security credentials will expose the role
     *        session name to the external account in their CloudTrail logs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withRoleSessionName(String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size.</note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        This parameter is optional. If you pass a policy, the temporary
     *        security credentials that are returned by the operation have the
     *        permissions that are allowed by both (the intersection of) the
     *        access policy of the role that is being assumed, <i>and</i> the
     *        policy that you pass. This gives you a way to further restrict the
     *        permissions for the resulting temporary security credentials. You
     *        cannot use the passed policy to grant permissions that are in
     *        excess of those allowed by the access policy of the role that is
     *        being assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *        AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>The policy plain text must be 2048 bytes or shorter.
     *        However, an internal conversion compresses it into a packed binary
     *        format with a separate limit. The PackedPolicySize response
     *        element indicates by percentage how close to the upper size limit
     *        the policy is, with 100% equaling the maximum allowed size.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size.</note>
     * 
     * @return An IAM policy in JSON format.</p>
     *         <p>
     *         This parameter is optional. If you pass a policy, the temporary
     *         security credentials that are returned by the operation have the
     *         permissions that are allowed by both (the intersection of) the
     *         access policy of the role that is being assumed, <i>and</i> the
     *         policy that you pass. This gives you a way to further restrict
     *         the permissions for the resulting temporary security credentials.
     *         You cannot use the passed policy to grant permissions that are in
     *         excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *         AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *         </p>
     *         <note>The policy plain text must be 2048 bytes or shorter.
     *         However, an internal conversion compresses it into a packed
     *         binary format with a separate limit. The PackedPolicySize
     *         response element indicates by percentage how close to the upper
     *         size limit the policy is, with 100% equaling the maximum allowed
     *         size.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * This parameter is optional. If you pass a policy, the temporary security
     * credentials that are returned by the operation have the permissions that
     * are allowed by both (the intersection of) the access policy of the role
     * that is being assumed, <i>and</i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRole, AssumeRoleWithSAML, and
     * AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size.</note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        This parameter is optional. If you pass a policy, the temporary
     *        security credentials that are returned by the operation have the
     *        permissions that are allowed by both (the intersection of) the
     *        access policy of the role that is being assumed, <i>and</i> the
     *        policy that you pass. This gives you a way to further restrict the
     *        permissions for the resulting temporary security credentials. You
     *        cannot use the passed policy to grant permissions that are in
     *        excess of those allowed by the access policy of the role that is
     *        being assumed. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRole, AssumeRoleWithSAML, and
     *        AssumeRoleWithWebIdentity</a> in the <i>IAM User Guide</i>.
     *        </p>
     *        <note>The policy plain text must be 2048 bytes or shorter.
     *        However, an internal conversion compresses it into a packed binary
     *        format with a separate limit. The PackedPolicySize response
     *        element indicates by percentage how close to the upper size limit
     *        the policy is, with 100% equaling the maximum allowed size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range
     *        from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *        default, the value is set to 3600 seconds.
     */

    public void setDurationSeconds(Integer durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds.
     * </p>
     * 
     * @return The duration, in seconds, of the role session. The value can
     *         range from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *         default, the value is set to 3600 seconds.
     */

    public Integer getDurationSeconds() {
        return this.durationSeconds;
    }

    /**
     * <p>
     * The duration, in seconds, of the role session. The value can range from
     * 900 seconds (15 minutes) to 3600 seconds (1 hour). By default, the value
     * is set to 3600 seconds.
     * </p>
     * 
     * @param durationSeconds
     *        The duration, in seconds, of the role session. The value can range
     *        from 900 seconds (15 minutes) to 3600 seconds (1 hour). By
     *        default, the value is set to 3600 seconds.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withDurationSeconds(Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
        return this;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is used by third parties when assuming
     *        roles in their customers' accounts. For each role that the third
     *        party can assume, they should instruct their customers to ensure
     *        the role's trust policy checks for the external ID that the third
     *        party generated. Each time the third party assumes the role, they
     *        should pass the customer's external ID. The external ID is useful
     *        in order to help third parties bind a role to the customer who
     *        created it. For more information about the external ID, see <a
     *        href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *        >How to Use an External ID When Granting Access to Your AWS
     *        Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     */

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return A unique identifier that is used by third parties when assuming
     *         roles in their customers' accounts. For each role that the third
     *         party can assume, they should instruct their customers to ensure
     *         the role's trust policy checks for the external ID that the third
     *         party generated. Each time the third party assumes the role, they
     *         should pass the customer's external ID. The external ID is useful
     *         in order to help third parties bind a role to the customer who
     *         created it. For more information about the external ID, see <a
     *         href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *         >How to Use an External ID When Granting Access to Your AWS
     *         Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     * <p>
     * A unique identifier that is used by third parties when assuming roles in
     * their customers' accounts. For each role that the third party can assume,
     * they should instruct their customers to ensure the role's trust policy
     * checks for the external ID that the third party generated. Each time the
     * third party assumes the role, they should pass the customer's external
     * ID. The external ID is useful in order to help third parties bind a role
     * to the customer who created it. For more information about the external
     * ID, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     * >How to Use an External ID When Granting Access to Your AWS Resources to
     * a Third Party</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param externalId
     *        A unique identifier that is used by third parties when assuming
     *        roles in their customers' accounts. For each role that the third
     *        party can assume, they should instruct their customers to ensure
     *        the role's trust policy checks for the external ID that the third
     *        party generated. Each time the third party assumes the role, they
     *        should pass the customer's external ID. The external ID is useful
     *        in order to help third parties bind a role to the customer who
     *        created it. For more information about the external ID, see <a
     *        href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_create_for-user_externalid.html"
     *        >How to Use an External ID When Granting Access to Your AWS
     *        Resources to a Third Party</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withExternalId(String externalId) {
        setExternalId(externalId);
        return this;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated
     *        with the user who is making the <code>AssumeRole</code> call.
     *        Specify this value if the trust policy of the role being assumed
     *        includes a condition that requires MFA authentication. The value
     *        is either the serial number for a hardware device (such as
     *        <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *        virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>).
     */

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * 
     * @return The identification number of the MFA device that is associated
     *         with the user who is making the <code>AssumeRole</code> call.
     *         Specify this value if the trust policy of the role being assumed
     *         includes a condition that requires MFA authentication. The value
     *         is either the serial number for a hardware device (such as
     *         <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *         virtual device (such as
     *         <code>arn:aws:iam::123456789012:mfa/user</code>).
     */

    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * <p>
     * The identification number of the MFA device that is associated with the
     * user who is making the <code>AssumeRole</code> call. Specify this value
     * if the trust policy of the role being assumed includes a condition that
     * requires MFA authentication. The value is either the serial number for a
     * hardware device (such as <code>GAHT12345678</code>) or an Amazon Resource
     * Name (ARN) for a virtual device (such as
     * <code>arn:aws:iam::123456789012:mfa/user</code>).
     * </p>
     * 
     * @param serialNumber
     *        The identification number of the MFA device that is associated
     *        with the user who is making the <code>AssumeRole</code> call.
     *        Specify this value if the trust policy of the role being assumed
     *        includes a condition that requires MFA authentication. The value
     *        is either the serial number for a hardware device (such as
     *        <code>GAHT12345678</code>) or an Amazon Resource Name (ARN) for a
     *        virtual device (such as
     *        <code>arn:aws:iam::123456789012:mfa/user</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withSerialNumber(String serialNumber) {
        setSerialNumber(serialNumber);
        return this;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if the trust policy of the
     *        role being assumed requires MFA (that is, if the policy includes a
     *        condition that tests for MFA). If the role being assumed requires
     *        MFA and if the <code>TokenCode</code> value is missing or expired,
     *        the <code>AssumeRole</code> call returns an "access denied" error.
     */

    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * 
     * @return The value provided by the MFA device, if the trust policy of the
     *         role being assumed requires MFA (that is, if the policy includes
     *         a condition that tests for MFA). If the role being assumed
     *         requires MFA and if the <code>TokenCode</code> value is missing
     *         or expired, the <code>AssumeRole</code> call returns an
     *         "access denied" error.
     */

    public String getTokenCode() {
        return this.tokenCode;
    }

    /**
     * <p>
     * The value provided by the MFA device, if the trust policy of the role
     * being assumed requires MFA (that is, if the policy includes a condition
     * that tests for MFA). If the role being assumed requires MFA and if the
     * <code>TokenCode</code> value is missing or expired, the
     * <code>AssumeRole</code> call returns an "access denied" error.
     * </p>
     * 
     * @param tokenCode
     *        The value provided by the MFA device, if the trust policy of the
     *        role being assumed requires MFA (that is, if the policy includes a
     *        condition that tests for MFA). If the role being assumed requires
     *        MFA and if the <code>TokenCode</code> value is missing or expired,
     *        the <code>AssumeRole</code> call returns an "access denied" error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleRequest withTokenCode(String tokenCode) {
        setTokenCode(tokenCode);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getRoleSessionName() != null)
            sb.append("RoleSessionName: " + getRoleSessionName() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds() + ",");
        if (getExternalId() != null)
            sb.append("ExternalId: " + getExternalId() + ",");
        if (getSerialNumber() != null)
            sb.append("SerialNumber: " + getSerialNumber() + ",");
        if (getTokenCode() != null)
            sb.append("TokenCode: " + getTokenCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleRequest == false)
            return false;
        AssumeRoleRequest other = (AssumeRoleRequest) obj;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoleSessionName() == null
                ^ this.getRoleSessionName() == null)
            return false;
        if (other.getRoleSessionName() != null
                && other.getRoleSessionName().equals(this.getRoleSessionName()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null
                && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        if (other.getDurationSeconds() == null
                ^ this.getDurationSeconds() == null)
            return false;
        if (other.getDurationSeconds() != null
                && other.getDurationSeconds().equals(this.getDurationSeconds()) == false)
            return false;
        if (other.getExternalId() == null ^ this.getExternalId() == null)
            return false;
        if (other.getExternalId() != null
                && other.getExternalId().equals(this.getExternalId()) == false)
            return false;
        if (other.getSerialNumber() == null ^ this.getSerialNumber() == null)
            return false;
        if (other.getSerialNumber() != null
                && other.getSerialNumber().equals(this.getSerialNumber()) == false)
            return false;
        if (other.getTokenCode() == null ^ this.getTokenCode() == null)
            return false;
        if (other.getTokenCode() != null
                && other.getTokenCode().equals(this.getTokenCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getRoleSessionName() == null) ? 0 : getRoleSessionName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getExternalId() == null) ? 0 : getExternalId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSerialNumber() == null) ? 0 : getSerialNumber()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTokenCode() == null) ? 0 : getTokenCode().hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleRequest clone() {
        return (AssumeRoleRequest) super.clone();
    }
}