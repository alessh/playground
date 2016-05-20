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
public class AttachRolePolicyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to attach the policy to.
     * </p>
     */
    private String roleName;

    private String policyArn;

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to attach the policy to.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) of the role to attach the policy
     *        to.
     */

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to attach the policy to.
     * </p>
     * 
     * @return The name (friendly name, not ARN) of the role to attach the
     *         policy to.
     */

    public String getRoleName() {
        return this.roleName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) of the role to attach the policy to.
     * </p>
     * 
     * @param roleName
     *        The name (friendly name, not ARN) of the role to attach the policy
     *        to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AttachRolePolicyRequest withRoleName(String roleName) {
        setRoleName(roleName);
        return this;
    }

    /**
     * @param policyArn
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * @return
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * @param policyArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AttachRolePolicyRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachRolePolicyRequest == false)
            return false;
        AttachRolePolicyRequest other = (AttachRolePolicyRequest) obj;
        if (other.getRoleName() == null ^ this.getRoleName() == null)
            return false;
        if (other.getRoleName() != null
                && other.getRoleName().equals(this.getRoleName()) == false)
            return false;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
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
                + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        return hashCode;
    }

    @Override
    public AttachRolePolicyRequest clone() {
        return (AttachRolePolicyRequest) super.clone();
    }
}