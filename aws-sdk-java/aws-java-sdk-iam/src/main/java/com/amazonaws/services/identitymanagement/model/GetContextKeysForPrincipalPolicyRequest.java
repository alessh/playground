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
public class GetContextKeysForPrincipalPolicyRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies attached to the user as well as to
     * all groups that the user is a member of. If you pick a group or a role,
     * then it includes only those context keys that are found in policies
     * attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part
     * of a real HTML request.
     * </p>
     */
    private String policySourceArn;
    /**
     * <p>
     * A optional list of additional policies for which you want list of context
     * keys used in <code>Condition</code> elements.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyInputList;

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies attached to the user as well as to
     * all groups that the user is a member of. If you pick a group or a role,
     * then it includes only those context keys that are found in policies
     * attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part
     * of a real HTML request.
     * </p>
     * 
     * @param policySourceArn
     *        The ARN of a user, group, or role whose policies contain the
     *        context keys that you want listed. If you specify a user, the list
     *        includes context keys that are found in all policies attached to
     *        the user as well as to all groups that the user is a member of. If
     *        you pick a group or a role, then it includes only those context
     *        keys that are found in policies attached to that entity. Note that
     *        all parameters are shown in unencoded form here for clarity, but
     *        must be URL encoded to be included as a part of a real HTML
     *        request.
     */

    public void setPolicySourceArn(String policySourceArn) {
        this.policySourceArn = policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies attached to the user as well as to
     * all groups that the user is a member of. If you pick a group or a role,
     * then it includes only those context keys that are found in policies
     * attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part
     * of a real HTML request.
     * </p>
     * 
     * @return The ARN of a user, group, or role whose policies contain the
     *         context keys that you want listed. If you specify a user, the
     *         list includes context keys that are found in all policies
     *         attached to the user as well as to all groups that the user is a
     *         member of. If you pick a group or a role, then it includes only
     *         those context keys that are found in policies attached to that
     *         entity. Note that all parameters are shown in unencoded form here
     *         for clarity, but must be URL encoded to be included as a part of
     *         a real HTML request.
     */

    public String getPolicySourceArn() {
        return this.policySourceArn;
    }

    /**
     * <p>
     * The ARN of a user, group, or role whose policies contain the context keys
     * that you want listed. If you specify a user, the list includes context
     * keys that are found in all policies attached to the user as well as to
     * all groups that the user is a member of. If you pick a group or a role,
     * then it includes only those context keys that are found in policies
     * attached to that entity. Note that all parameters are shown in unencoded
     * form here for clarity, but must be URL encoded to be included as a part
     * of a real HTML request.
     * </p>
     * 
     * @param policySourceArn
     *        The ARN of a user, group, or role whose policies contain the
     *        context keys that you want listed. If you specify a user, the list
     *        includes context keys that are found in all policies attached to
     *        the user as well as to all groups that the user is a member of. If
     *        you pick a group or a role, then it includes only those context
     *        keys that are found in policies attached to that entity. Note that
     *        all parameters are shown in unencoded form here for clarity, but
     *        must be URL encoded to be included as a part of a real HTML
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetContextKeysForPrincipalPolicyRequest withPolicySourceArn(
            String policySourceArn) {
        setPolicySourceArn(policySourceArn);
        return this;
    }

    /**
     * <p>
     * A optional list of additional policies for which you want list of context
     * keys used in <code>Condition</code> elements.
     * </p>
     * 
     * @return A optional list of additional policies for which you want list of
     *         context keys used in <code>Condition</code> elements.
     */

    public java.util.List<String> getPolicyInputList() {
        if (policyInputList == null) {
            policyInputList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyInputList;
    }

    /**
     * <p>
     * A optional list of additional policies for which you want list of context
     * keys used in <code>Condition</code> elements.
     * </p>
     * 
     * @param policyInputList
     *        A optional list of additional policies for which you want list of
     *        context keys used in <code>Condition</code> elements.
     */

    public void setPolicyInputList(java.util.Collection<String> policyInputList) {
        if (policyInputList == null) {
            this.policyInputList = null;
            return;
        }

        this.policyInputList = new com.amazonaws.internal.SdkInternalList<String>(
                policyInputList);
    }

    /**
     * <p>
     * A optional list of additional policies for which you want list of context
     * keys used in <code>Condition</code> elements.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyInputList(java.util.Collection)} or
     * {@link #withPolicyInputList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param policyInputList
     *        A optional list of additional policies for which you want list of
     *        context keys used in <code>Condition</code> elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(
            String... policyInputList) {
        if (this.policyInputList == null) {
            setPolicyInputList(new com.amazonaws.internal.SdkInternalList<String>(
                    policyInputList.length));
        }
        for (String ele : policyInputList) {
            this.policyInputList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A optional list of additional policies for which you want list of context
     * keys used in <code>Condition</code> elements.
     * </p>
     * 
     * @param policyInputList
     *        A optional list of additional policies for which you want list of
     *        context keys used in <code>Condition</code> elements.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetContextKeysForPrincipalPolicyRequest withPolicyInputList(
            java.util.Collection<String> policyInputList) {
        setPolicyInputList(policyInputList);
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
        if (getPolicySourceArn() != null)
            sb.append("PolicySourceArn: " + getPolicySourceArn() + ",");
        if (getPolicyInputList() != null)
            sb.append("PolicyInputList: " + getPolicyInputList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetContextKeysForPrincipalPolicyRequest == false)
            return false;
        GetContextKeysForPrincipalPolicyRequest other = (GetContextKeysForPrincipalPolicyRequest) obj;
        if (other.getPolicySourceArn() == null
                ^ this.getPolicySourceArn() == null)
            return false;
        if (other.getPolicySourceArn() != null
                && other.getPolicySourceArn().equals(this.getPolicySourceArn()) == false)
            return false;
        if (other.getPolicyInputList() == null
                ^ this.getPolicyInputList() == null)
            return false;
        if (other.getPolicyInputList() != null
                && other.getPolicyInputList().equals(this.getPolicyInputList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPolicySourceArn() == null) ? 0 : getPolicySourceArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyInputList() == null) ? 0 : getPolicyInputList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetContextKeysForPrincipalPolicyRequest clone() {
        return (GetContextKeysForPrincipalPolicyRequest) super.clone();
    }
}