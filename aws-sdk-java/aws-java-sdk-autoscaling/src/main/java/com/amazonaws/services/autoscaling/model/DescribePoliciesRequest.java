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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribePoliciesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * One or more policy names or policy ARNs to be described. If you omit this
     * list, all policy names are described. If an group name is provided, the
     * results are limited to that group. This list is limited to 50 items. If
     * you specify an unknown policy name, it is ignored with no error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;
    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyTypes;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of items to be returned with each call.
     * </p>
     */
    private Integer maxRecords;

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @return The name of the group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * One or more policy names or policy ARNs to be described. If you omit this
     * list, all policy names are described. If an group name is provided, the
     * results are limited to that group. This list is limited to 50 items. If
     * you specify an unknown policy name, it is ignored with no error.
     * </p>
     * 
     * @return One or more policy names or policy ARNs to be described. If you
     *         omit this list, all policy names are described. If an group name
     *         is provided, the results are limited to that group. This list is
     *         limited to 50 items. If you specify an unknown policy name, it is
     *         ignored with no error.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * One or more policy names or policy ARNs to be described. If you omit this
     * list, all policy names are described. If an group name is provided, the
     * results are limited to that group. This list is limited to 50 items. If
     * you specify an unknown policy name, it is ignored with no error.
     * </p>
     * 
     * @param policyNames
     *        One or more policy names or policy ARNs to be described. If you
     *        omit this list, all policy names are described. If an group name
     *        is provided, the results are limited to that group. This list is
     *        limited to 50 items. If you specify an unknown policy name, it is
     *        ignored with no error.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(
                policyNames);
    }

    /**
     * <p>
     * One or more policy names or policy ARNs to be described. If you omit this
     * list, all policy names are described. If an group name is provided, the
     * results are limited to that group. This list is limited to 50 items. If
     * you specify an unknown policy name, it is ignored with no error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyNames(java.util.Collection)} or
     * {@link #withPolicyNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policyNames
     *        One or more policy names or policy ARNs to be described. If you
     *        omit this list, all policy names are described. If an group name
     *        is provided, the results are limited to that group. This list is
     *        limited to 50 items. If you specify an unknown policy name, it is
     *        ignored with no error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withPolicyNames(String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(
                    policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more policy names or policy ARNs to be described. If you omit this
     * list, all policy names are described. If an group name is provided, the
     * results are limited to that group. This list is limited to 50 items. If
     * you specify an unknown policy name, it is ignored with no error.
     * </p>
     * 
     * @param policyNames
     *        One or more policy names or policy ARNs to be described. If you
     *        omit this list, all policy names are described. If an group name
     *        is provided, the results are limited to that group. This list is
     *        limited to 50 items. If you specify an unknown policy name, it is
     *        ignored with no error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withPolicyNames(
            java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
        return this;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @return One or more policy types. Valid values are
     *         <code>SimpleScaling</code> and <code>StepScaling</code>.
     */

    public java.util.List<String> getPolicyTypes() {
        if (policyTypes == null) {
            policyTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyTypes;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. Valid values are
     *        <code>SimpleScaling</code> and <code>StepScaling</code>.
     */

    public void setPolicyTypes(java.util.Collection<String> policyTypes) {
        if (policyTypes == null) {
            this.policyTypes = null;
            return;
        }

        this.policyTypes = new com.amazonaws.internal.SdkInternalList<String>(
                policyTypes);
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyTypes(java.util.Collection)} or
     * {@link #withPolicyTypes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. Valid values are
     *        <code>SimpleScaling</code> and <code>StepScaling</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withPolicyTypes(String... policyTypes) {
        if (this.policyTypes == null) {
            setPolicyTypes(new com.amazonaws.internal.SdkInternalList<String>(
                    policyTypes.length));
        }
        for (String ele : policyTypes) {
            this.policyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more policy types. Valid values are <code>SimpleScaling</code> and
     * <code>StepScaling</code>.
     * </p>
     * 
     * @param policyTypes
     *        One or more policy types. Valid values are
     *        <code>SimpleScaling</code> and <code>StepScaling</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withPolicyTypes(
            java.util.Collection<String> policyTypes) {
        setPolicyTypes(policyTypes);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to be returned with each call.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call.
     * </p>
     * 
     * @return The maximum number of items to be returned with each call.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to be returned with each call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to be returned with each call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePoliciesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName()
                    + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames() + ",");
        if (getPolicyTypes() != null)
            sb.append("PolicyTypes: " + getPolicyTypes() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePoliciesRequest == false)
            return false;
        DescribePoliciesRequest other = (DescribePoliciesRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
            return false;
        if (other.getPolicyTypes() == null ^ this.getPolicyTypes() == null)
            return false;
        if (other.getPolicyTypes() != null
                && other.getPolicyTypes().equals(this.getPolicyTypes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupName() == null) ? 0
                        : getAutoScalingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyTypes() == null) ? 0 : getPolicyTypes().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        return hashCode;
    }

    @Override
    public DescribePoliciesRequest clone() {
        return (DescribePoliciesRequest) super.clone();
    }
}