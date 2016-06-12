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
public class AssumeRoleWithWebIdentityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     */
    private String roleSessionName;
    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     */
    private String webIdentityToken;
    /**
     * <p>
     * The fully qualified host component of the domain name of the identity
     * provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently
     * <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the
     * only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     */
    private String providerId;
    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
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
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is
     *        assuming.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role that the caller is
     *         assuming.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role that the caller is assuming.
     * </p>
     * 
     * @param roleArn
     *        The Amazon Resource Name (ARN) of the role that the caller is
     *        assuming.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleWithWebIdentityRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. Typically, you pass
     *        the name or identifier that is associated with the user who is
     *        using your application. That way, the temporary security
     *        credentials that your application will use are associated with
     *        that user. This session name is included as part of the ARN and
     *        assumed role ID in the <code>AssumedRoleUser</code> response
     *        element.
     */

    public void setRoleSessionName(String roleSessionName) {
        this.roleSessionName = roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * 
     * @return An identifier for the assumed role session. Typically, you pass
     *         the name or identifier that is associated with the user who is
     *         using your application. That way, the temporary security
     *         credentials that your application will use are associated with
     *         that user. This session name is included as part of the ARN and
     *         assumed role ID in the <code>AssumedRoleUser</code> response
     *         element.
     */

    public String getRoleSessionName() {
        return this.roleSessionName;
    }

    /**
     * <p>
     * An identifier for the assumed role session. Typically, you pass the name
     * or identifier that is associated with the user who is using your
     * application. That way, the temporary security credentials that your
     * application will use are associated with that user. This session name is
     * included as part of the ARN and assumed role ID in the
     * <code>AssumedRoleUser</code> response element.
     * </p>
     * 
     * @param roleSessionName
     *        An identifier for the assumed role session. Typically, you pass
     *        the name or identifier that is associated with the user who is
     *        using your application. That way, the temporary security
     *        credentials that your application will use are associated with
     *        that user. This session name is included as part of the ARN and
     *        assumed role ID in the <code>AssumedRoleUser</code> response
     *        element.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleWithWebIdentityRequest withRoleSessionName(
            String roleSessionName) {
        setRoleSessionName(roleSessionName);
        return this;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @param webIdentityToken
     *        The OAuth 2.0 access token or OpenID Connect ID token that is
     *        provided by the identity provider. Your application must get this
     *        token by authenticating the user who is using your application
     *        with a web identity provider before the application makes an
     *        <code>AssumeRoleWithWebIdentity</code> call.
     */

    public void setWebIdentityToken(String webIdentityToken) {
        this.webIdentityToken = webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @return The OAuth 2.0 access token or OpenID Connect ID token that is
     *         provided by the identity provider. Your application must get this
     *         token by authenticating the user who is using your application
     *         with a web identity provider before the application makes an
     *         <code>AssumeRoleWithWebIdentity</code> call.
     */

    public String getWebIdentityToken() {
        return this.webIdentityToken;
    }

    /**
     * <p>
     * The OAuth 2.0 access token or OpenID Connect ID token that is provided by
     * the identity provider. Your application must get this token by
     * authenticating the user who is using your application with a web identity
     * provider before the application makes an
     * <code>AssumeRoleWithWebIdentity</code> call.
     * </p>
     * 
     * @param webIdentityToken
     *        The OAuth 2.0 access token or OpenID Connect ID token that is
     *        provided by the identity provider. Your application must get this
     *        token by authenticating the user who is using your application
     *        with a web identity provider before the application makes an
     *        <code>AssumeRoleWithWebIdentity</code> call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleWithWebIdentityRequest withWebIdentityToken(
            String webIdentityToken) {
        setWebIdentityToken(webIdentityToken);
        return this;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity
     * provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently
     * <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the
     * only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @param providerId
     *        The fully qualified host component of the domain name of the
     *        identity provider.</p>
     *        <p>
     *        Specify this value only for OAuth 2.0 access tokens. Currently
     *        <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     *        are the only supported identity providers for OAuth 2.0 access
     *        tokens. Do not include URL schemes and port numbers.
     *        </p>
     *        <p>
     *        Do not specify this value for OpenID Connect ID tokens.
     */

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity
     * provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently
     * <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the
     * only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @return The fully qualified host component of the domain name of the
     *         identity provider.</p>
     *         <p>
     *         Specify this value only for OAuth 2.0 access tokens. Currently
     *         <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     *         are the only supported identity providers for OAuth 2.0 access
     *         tokens. Do not include URL schemes and port numbers.
     *         </p>
     *         <p>
     *         Do not specify this value for OpenID Connect ID tokens.
     */

    public String getProviderId() {
        return this.providerId;
    }

    /**
     * <p>
     * The fully qualified host component of the domain name of the identity
     * provider.
     * </p>
     * <p>
     * Specify this value only for OAuth 2.0 access tokens. Currently
     * <code>www.amazon.com</code> and <code>graph.facebook.com</code> are the
     * only supported identity providers for OAuth 2.0 access tokens. Do not
     * include URL schemes and port numbers.
     * </p>
     * <p>
     * Do not specify this value for OpenID Connect ID tokens.
     * </p>
     * 
     * @param providerId
     *        The fully qualified host component of the domain name of the
     *        identity provider.</p>
     *        <p>
     *        Specify this value only for OAuth 2.0 access tokens. Currently
     *        <code>www.amazon.com</code> and <code>graph.facebook.com</code>
     *        are the only supported identity providers for OAuth 2.0 access
     *        tokens. Do not include URL schemes and port numbers.
     *        </p>
     *        <p>
     *        Do not specify this value for OpenID Connect ID tokens.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleWithWebIdentityRequest withProviderId(String providerId) {
        setProviderId(providerId);
        return this;
    }

    /**
     * <p>
     * An IAM policy in JSON format.
     * </p>
     * <p>
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the
     *        temporary security credentials that are returned by the operation
     *        have the permissions that are allowed by both the access policy of
     *        the role that is being assumed, <i><b>and</b></i> the policy that
     *        you pass. This gives you a way to further restrict the permissions
     *        for the resulting temporary security credentials. You cannot use
     *        the passed policy to grant permissions that are in excess of those
     *        allowed by the access policy of the role that is being assumed.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *        Guide</i>.
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
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @return An IAM policy in JSON format.</p>
     *         <p>
     *         The policy parameter is optional. If you pass a policy, the
     *         temporary security credentials that are returned by the operation
     *         have the permissions that are allowed by both the access policy
     *         of the role that is being assumed, <i><b>and</b></i> the policy
     *         that you pass. This gives you a way to further restrict the
     *         permissions for the resulting temporary security credentials. You
     *         cannot use the passed policy to grant permissions that are in
     *         excess of those allowed by the access policy of the role that is
     *         being assumed. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *         >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *         Guide</i>.
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
     * The policy parameter is optional. If you pass a policy, the temporary
     * security credentials that are returned by the operation have the
     * permissions that are allowed by both the access policy of the role that
     * is being assumed, <i><b>and</b></i> the policy that you pass. This gives
     * you a way to further restrict the permissions for the resulting temporary
     * security credentials. You cannot use the passed policy to grant
     * permissions that are in excess of those allowed by the access policy of
     * the role that is being assumed. For more information, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     * >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     * Guide</i>.
     * </p>
     * <note>The policy plain text must be 2048 bytes or shorter. However, an
     * internal conversion compresses it into a packed binary format with a
     * separate limit. The PackedPolicySize response element indicates by
     * percentage how close to the upper size limit the policy is, with 100%
     * equaling the maximum allowed size. </note>
     * 
     * @param policy
     *        An IAM policy in JSON format.</p>
     *        <p>
     *        The policy parameter is optional. If you pass a policy, the
     *        temporary security credentials that are returned by the operation
     *        have the permissions that are allowed by both the access policy of
     *        the role that is being assumed, <i><b>and</b></i> the policy that
     *        you pass. This gives you a way to further restrict the permissions
     *        for the resulting temporary security credentials. You cannot use
     *        the passed policy to grant permissions that are in excess of those
     *        allowed by the access policy of the role that is being assumed.
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/id_credentials_temp_control-access_assumerole.html"
     *        >Permissions for AssumeRoleWithWebIdentity</a> in the <i>IAM User
     *        Guide</i>.
     *        </p>
     *        <note>The policy plain text must be 2048 bytes or shorter.
     *        However, an internal conversion compresses it into a packed binary
     *        format with a separate limit. The PackedPolicySize response
     *        element indicates by percentage how close to the upper size limit
     *        the policy is, with 100% equaling the maximum allowed size.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssumeRoleWithWebIdentityRequest withPolicy(String policy) {
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

    public AssumeRoleWithWebIdentityRequest withDurationSeconds(
            Integer durationSeconds) {
        setDurationSeconds(durationSeconds);
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
        if (getWebIdentityToken() != null)
            sb.append("WebIdentityToken: " + getWebIdentityToken() + ",");
        if (getProviderId() != null)
            sb.append("ProviderId: " + getProviderId() + ",");
        if (getPolicy() != null)
            sb.append("Policy: " + getPolicy() + ",");
        if (getDurationSeconds() != null)
            sb.append("DurationSeconds: " + getDurationSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssumeRoleWithWebIdentityRequest == false)
            return false;
        AssumeRoleWithWebIdentityRequest other = (AssumeRoleWithWebIdentityRequest) obj;
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
        if (other.getWebIdentityToken() == null
                ^ this.getWebIdentityToken() == null)
            return false;
        if (other.getWebIdentityToken() != null
                && other.getWebIdentityToken().equals(
                        this.getWebIdentityToken()) == false)
            return false;
        if (other.getProviderId() == null ^ this.getProviderId() == null)
            return false;
        if (other.getProviderId() != null
                && other.getProviderId().equals(this.getProviderId()) == false)
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
        hashCode = prime
                * hashCode
                + ((getWebIdentityToken() == null) ? 0 : getWebIdentityToken()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getProviderId() == null) ? 0 : getProviderId().hashCode());
        hashCode = prime * hashCode
                + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationSeconds() == null) ? 0 : getDurationSeconds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public AssumeRoleWithWebIdentityRequest clone() {
        return (AssumeRoleWithWebIdentityRequest) super.clone();
    }
}