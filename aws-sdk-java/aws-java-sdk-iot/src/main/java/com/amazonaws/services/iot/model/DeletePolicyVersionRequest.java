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

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the DeletePolicyVersion operation.
 * </p>
 */
public class DeletePolicyVersionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the policy.
     * </p>
     */
    private String policyName;
    /**
     * <p>
     * The policy version ID.
     * </p>
     */
    private String policyVersionId;

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

    public DeletePolicyVersionRequest withPolicyName(String policyName) {
        setPolicyName(policyName);
        return this;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param policyVersionId
     *        The policy version ID.
     */

    public void setPolicyVersionId(String policyVersionId) {
        this.policyVersionId = policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @return The policy version ID.
     */

    public String getPolicyVersionId() {
        return this.policyVersionId;
    }

    /**
     * <p>
     * The policy version ID.
     * </p>
     * 
     * @param policyVersionId
     *        The policy version ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeletePolicyVersionRequest withPolicyVersionId(String policyVersionId) {
        setPolicyVersionId(policyVersionId);
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
        if (getPolicyName() != null)
            sb.append("PolicyName: " + getPolicyName() + ",");
        if (getPolicyVersionId() != null)
            sb.append("PolicyVersionId: " + getPolicyVersionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeletePolicyVersionRequest == false)
            return false;
        DeletePolicyVersionRequest other = (DeletePolicyVersionRequest) obj;
        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getPolicyVersionId() == null
                ^ this.getPolicyVersionId() == null)
            return false;
        if (other.getPolicyVersionId() != null
                && other.getPolicyVersionId().equals(this.getPolicyVersionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyVersionId() == null) ? 0 : getPolicyVersionId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeletePolicyVersionRequest clone() {
        return (DeletePolicyVersionRequest) super.clone();
    }
}