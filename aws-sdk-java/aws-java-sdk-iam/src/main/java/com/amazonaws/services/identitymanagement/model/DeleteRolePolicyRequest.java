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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteRolePolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role that the policy is
     * embedded in.
     * </p>
     */
    private String roleName;
    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     */
    private String policyName;

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role that the policy is
     * embedded in.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) identifying the role that the
     *        policy is embedded in.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role that the policy is
     * embedded in.
     * </p>
     * 
     * @return The name (friendly name, not ARN) identifying the role that the
     *         policy is embedded in.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the role that the policy is
     * embedded in.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) identifying the role that the
     *        policy is embedded in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteRolePolicyRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @param policyName
     *        The name identifying the policy document to delete.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @return The name identifying the policy document to delete.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name identifying the policy document to delete.
     * </p>
     * 
     * @param policyName
     *        The name identifying the policy document to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteRolePolicyRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRolePolicyRequest == false)
            return false;
        DeleteRolePolicyRequest other = (DeleteRolePolicyRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null
                && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
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
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRolePolicyRequest clone() {
        return (DeleteRolePolicyRequest) super.clone();
    }
}