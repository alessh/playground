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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SetPermissionRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The stack ID.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     */
    private String iamUserArn;
    /**
     * <p>
     * The user is allowed to use SSH to communicate with the instance.
     * </p>
     */
    private Boolean allowSsh;
    /**
     * <p>
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * </p>
     */
    private Boolean allowSudo;
    /**
     * <p>
     * The user's permission level, which must be set to one of the following
     * strings. You cannot set your own permissions level.
     * </p>
     * <ul>
     * <li> <code>deny</code></li>
     * <li> <code>show</code></li>
     * <li> <code>deploy</code></li>
     * <li> <code>manage</code></li>
     * <li> <code>iam_only</code></li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     */
    private String level;

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @return The stack ID.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID.
     * </p>
     * 
     * @param stackId
     *        The stack ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetPermissionRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     */

    public void setIamUserArn(String iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @return The user's IAM ARN.
     */

    public String getIamUserArn() {
        return this.iamUserArn;
    }

    /**
     * <p>
     * The user's IAM ARN.
     * </p>
     * 
     * @param iamUserArn
     *        The user's IAM ARN.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetPermissionRequest withIamUserArn(String iamUserArn) {
        setIamUserArn(iamUserArn);
        return this;
    }

    /**
     * <p>
     * The user is allowed to use SSH to communicate with the instance.
     * </p>
     * 
     * @param allowSsh
     *        The user is allowed to use SSH to communicate with the instance.
     */

    public void setAllowSsh(Boolean allowSsh) {
        this.allowSsh = allowSsh;
    }

    /**
     * <p>
     * The user is allowed to use SSH to communicate with the instance.
     * </p>
     * 
     * @return The user is allowed to use SSH to communicate with the instance.
     */

    public Boolean getAllowSsh() {
        return this.allowSsh;
    }

    /**
     * <p>
     * The user is allowed to use SSH to communicate with the instance.
     * </p>
     * 
     * @param allowSsh
     *        The user is allowed to use SSH to communicate with the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetPermissionRequest withAllowSsh(Boolean allowSsh) {
        setAllowSsh(allowSsh);
        return this;
    }

    /**
     * <p>
     * The user is allowed to use SSH to communicate with the instance.
     * </p>
     * 
     * @return The user is allowed to use SSH to communicate with the instance.
     */

    public Boolean isAllowSsh() {
        return this.allowSsh;
    }

    /**
     * <p>
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * </p>
     * 
     * @param allowSudo
     *        The user is allowed to use <b>sudo</b> to elevate privileges.
     */

    public void setAllowSudo(Boolean allowSudo) {
        this.allowSudo = allowSudo;
    }

    /**
     * <p>
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * </p>
     * 
     * @return The user is allowed to use <b>sudo</b> to elevate privileges.
     */

    public Boolean getAllowSudo() {
        return this.allowSudo;
    }

    /**
     * <p>
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * </p>
     * 
     * @param allowSudo
     *        The user is allowed to use <b>sudo</b> to elevate privileges.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetPermissionRequest withAllowSudo(Boolean allowSudo) {
        setAllowSudo(allowSudo);
        return this;
    }

    /**
     * <p>
     * The user is allowed to use <b>sudo</b> to elevate privileges.
     * </p>
     * 
     * @return The user is allowed to use <b>sudo</b> to elevate privileges.
     */

    public Boolean isAllowSudo() {
        return this.allowSudo;
    }

    /**
     * <p>
     * The user's permission level, which must be set to one of the following
     * strings. You cannot set your own permissions level.
     * </p>
     * <ul>
     * <li> <code>deny</code></li>
     * <li> <code>show</code></li>
     * <li> <code>deploy</code></li>
     * <li> <code>manage</code></li>
     * <li> <code>iam_only</code></li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param level
     *        The user's permission level, which must be set to one of the
     *        following strings. You cannot set your own permissions level.</p>
     *        <ul>
     *        <li> <code>deny</code></li>
     *        <li> <code>show</code></li>
     *        <li> <code>deploy</code></li>
     *        <li> <code>manage</code></li>
     *        <li> <code>iam_only</code></li>
     *        </ul>
     *        <p>
     *        For more information on the permissions associated with these
     *        levels, see <a href=
     *        "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     *        >Managing User Permissions</a>.
     */

    public void setLevel(String level) {
        this.level = level;
    }

    /**
     * <p>
     * The user's permission level, which must be set to one of the following
     * strings. You cannot set your own permissions level.
     * </p>
     * <ul>
     * <li> <code>deny</code></li>
     * <li> <code>show</code></li>
     * <li> <code>deploy</code></li>
     * <li> <code>manage</code></li>
     * <li> <code>iam_only</code></li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @return The user's permission level, which must be set to one of the
     *         following strings. You cannot set your own permissions level.</p>
     *         <ul>
     *         <li> <code>deny</code></li>
     *         <li> <code>show</code></li>
     *         <li> <code>deploy</code></li>
     *         <li> <code>manage</code></li>
     *         <li> <code>iam_only</code></li>
     *         </ul>
     *         <p>
     *         For more information on the permissions associated with these
     *         levels, see <a href=
     *         "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     *         >Managing User Permissions</a>.
     */

    public String getLevel() {
        return this.level;
    }

    /**
     * <p>
     * The user's permission level, which must be set to one of the following
     * strings. You cannot set your own permissions level.
     * </p>
     * <ul>
     * <li> <code>deny</code></li>
     * <li> <code>show</code></li>
     * <li> <code>deploy</code></li>
     * <li> <code>manage</code></li>
     * <li> <code>iam_only</code></li>
     * </ul>
     * <p>
     * For more information on the permissions associated with these levels, see
     * <a href=
     * "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     * >Managing User Permissions</a>.
     * </p>
     * 
     * @param level
     *        The user's permission level, which must be set to one of the
     *        following strings. You cannot set your own permissions level.</p>
     *        <ul>
     *        <li> <code>deny</code></li>
     *        <li> <code>show</code></li>
     *        <li> <code>deploy</code></li>
     *        <li> <code>manage</code></li>
     *        <li> <code>iam_only</code></li>
     *        </ul>
     *        <p>
     *        For more information on the permissions associated with these
     *        levels, see <a href=
     *        "http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html"
     *        >Managing User Permissions</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetPermissionRequest withLevel(String level) {
        setLevel(level);
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getIamUserArn() != null)
            sb.append("IamUserArn: " + getIamUserArn() + ",");
        if (getAllowSsh() != null)
            sb.append("AllowSsh: " + getAllowSsh() + ",");
        if (getAllowSudo() != null)
            sb.append("AllowSudo: " + getAllowSudo() + ",");
        if (getLevel() != null)
            sb.append("Level: " + getLevel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetPermissionRequest == false)
            return false;
        SetPermissionRequest other = (SetPermissionRequest) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null
                && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getIamUserArn() == null ^ this.getIamUserArn() == null)
            return false;
        if (other.getIamUserArn() != null
                && other.getIamUserArn().equals(this.getIamUserArn()) == false)
            return false;
        if (other.getAllowSsh() == null ^ this.getAllowSsh() == null)
            return false;
        if (other.getAllowSsh() != null
                && other.getAllowSsh().equals(this.getAllowSsh()) == false)
            return false;
        if (other.getAllowSudo() == null ^ this.getAllowSudo() == null)
            return false;
        if (other.getAllowSudo() != null
                && other.getAllowSudo().equals(this.getAllowSudo()) == false)
            return false;
        if (other.getLevel() == null ^ this.getLevel() == null)
            return false;
        if (other.getLevel() != null
                && other.getLevel().equals(this.getLevel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode
                + ((getIamUserArn() == null) ? 0 : getIamUserArn().hashCode());
        hashCode = prime * hashCode
                + ((getAllowSsh() == null) ? 0 : getAllowSsh().hashCode());
        hashCode = prime * hashCode
                + ((getAllowSudo() == null) ? 0 : getAllowSudo().hashCode());
        hashCode = prime * hashCode
                + ((getLevel() == null) ? 0 : getLevel().hashCode());
        return hashCode;
    }

    @Override
    public SetPermissionRequest clone() {
        return (SetPermissionRequest) super.clone();
    }
}