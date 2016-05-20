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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a role that a managed policy is attached to.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>ListEntitiesForPolicy</a> action.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide.
 * </p>
 */
public class PolicyRole implements Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role.
     * </p>
     */
    private String roleName;

    private String roleId;

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) identifying the role.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role.
     * </p>
     * 
     * @return The name (friendly name, not ARN) identifying the role.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) identifying the role.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PolicyRole withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * @param roleId
     */

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    /**
     * @return
     */

    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @param roleId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PolicyRole withRoleId(String roleId) {
        setRoleId(roleId);
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
        if (getRoleName() != null)
            sb.append("RoleName: " + getRoleName() + ",");
        if (getRoleId() != null)
            sb.append("RoleId: " + getRoleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyRole == false)
            return false;
        PolicyRole other = (PolicyRole) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null
                && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getRoleId() == null ^ this.getRoleId() == null)
            return false;
        if (other.getRoleId() != null
                && other.getRoleId().equals(this.getRoleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleName() == null) ? 0 : getRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getRoleId() == null) ? 0 : getRoleId().hashCode());
        return hashCode;
    }

    @Override
    public PolicyRole clone() {
        try {
            return (PolicyRole) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
