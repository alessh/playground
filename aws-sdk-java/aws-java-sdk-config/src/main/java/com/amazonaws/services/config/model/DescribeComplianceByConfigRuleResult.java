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

package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeComplianceByConfigRuleResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether each of the specified AWS Config rules is compliant.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ComplianceByConfigRule> complianceByConfigRules;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Indicates whether each of the specified AWS Config rules is compliant.
     * </p>
     * 
     * @return Indicates whether each of the specified AWS Config rules is
     *         compliant.
     */

    public java.util.List<ComplianceByConfigRule> getComplianceByConfigRules() {
        if (complianceByConfigRules == null) {
            complianceByConfigRules = new com.amazonaws.internal.SdkInternalList<ComplianceByConfigRule>();
        }
        return complianceByConfigRules;
    }

    /**
     * <p>
     * Indicates whether each of the specified AWS Config rules is compliant.
     * </p>
     * 
     * @param complianceByConfigRules
     *        Indicates whether each of the specified AWS Config rules is
     *        compliant.
     */

    public void setComplianceByConfigRules(
            java.util.Collection<ComplianceByConfigRule> complianceByConfigRules) {
        if (complianceByConfigRules == null) {
            this.complianceByConfigRules = null;
            return;
        }

        this.complianceByConfigRules = new com.amazonaws.internal.SdkInternalList<ComplianceByConfigRule>(
                complianceByConfigRules);
    }

    /**
     * <p>
     * Indicates whether each of the specified AWS Config rules is compliant.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setComplianceByConfigRules(java.util.Collection)} or
     * {@link #withComplianceByConfigRules(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param complianceByConfigRules
     *        Indicates whether each of the specified AWS Config rules is
     *        compliant.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeComplianceByConfigRuleResult withComplianceByConfigRules(
            ComplianceByConfigRule... complianceByConfigRules) {
        if (this.complianceByConfigRules == null) {
            setComplianceByConfigRules(new com.amazonaws.internal.SdkInternalList<ComplianceByConfigRule>(
                    complianceByConfigRules.length));
        }
        for (ComplianceByConfigRule ele : complianceByConfigRules) {
            this.complianceByConfigRules.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates whether each of the specified AWS Config rules is compliant.
     * </p>
     * 
     * @param complianceByConfigRules
     *        Indicates whether each of the specified AWS Config rules is
     *        compliant.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeComplianceByConfigRuleResult withComplianceByConfigRules(
            java.util.Collection<ComplianceByConfigRule> complianceByConfigRules) {
        setComplianceByConfigRules(complianceByConfigRules);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next
     *        page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next
     *         page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next
     *        page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeComplianceByConfigRuleResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getComplianceByConfigRules() != null)
            sb.append("ComplianceByConfigRules: "
                    + getComplianceByConfigRules() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeComplianceByConfigRuleResult == false)
            return false;
        DescribeComplianceByConfigRuleResult other = (DescribeComplianceByConfigRuleResult) obj;
        if (other.getComplianceByConfigRules() == null
                ^ this.getComplianceByConfigRules() == null)
            return false;
        if (other.getComplianceByConfigRules() != null
                && other.getComplianceByConfigRules().equals(
                        this.getComplianceByConfigRules()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getComplianceByConfigRules() == null) ? 0
                        : getComplianceByConfigRules().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeComplianceByConfigRuleResult clone() {
        try {
            return (DescribeComplianceByConfigRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
