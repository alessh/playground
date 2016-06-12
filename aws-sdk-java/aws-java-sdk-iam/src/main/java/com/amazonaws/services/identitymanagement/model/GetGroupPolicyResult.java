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
 * Contains the response to a successful <a>GetGroupPolicy</a> request.
 * </p>
 */
public class GetGroupPolicyResult implements Serializable, Cloneable {

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy document.
     * </p>
     */
    private String policyDocument;

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The group the policy is associated with.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @return The group the policy is associated with.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The group the policy is associated with.
     * </p>
     * 
     * @param groupName
     *        The group the policy is associated with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetGroupPolicyResult withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     */

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @return The name of the policy.
     */

    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * <p>
     * The name of the policy.
     * </p>
     * 
     * @param policyName
     *        The name of the policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetGroupPolicyResult withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     */

    public void setPolicyDocument(String policyDocument) {
        this.policyDocument = policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @return The policy document.
     */

    public String getPolicyDocument() {
        return this.policyDocument;
    }

    /**
     * <p>
     * The policy document.
     * </p>
     * 
     * @param policyDocument
     *        The policy document.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetGroupPolicyResult withPolicyDocument(String policyDocument) {
        setPolicyDocument(policyDocument);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyDocument() != null)
            sb.append("PolicyDocument: " + getPolicyDocument());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGroupPolicyResult == false)
            return false;
        GetGroupPolicyResult other = (GetGroupPolicyResult) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyDocument() == null
                ^ this.getPolicyDocument() == null)
            return false;
        if (other.getPolicyDocument() != null
                && other.getPolicyDocument().equals(this.getPolicyDocument()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyDocument() == null) ? 0 : getPolicyDocument()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetGroupPolicyResult clone() {
        try {
            return (GetGroupPolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
