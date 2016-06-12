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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CloneReceiptRuleSetRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.),
     * underscores (_), or dashes (-).</li>
     * <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li>
     * </ul>
     */
    private String ruleSetName;
    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     */
    private String originalRuleSetName;

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.),
     * underscores (_), or dashes (-).</li>
     * <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li>
     * </ul>
     * 
     * @param ruleSetName
     *        The name of the rule set to create. The name must:</p>
     *        <ul>
     *        <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *        (.), underscores (_), or dashes (-).</li>
     *        <li>Start and end with a letter or number.</li>
     *        <li>Contain less than 64 characters.</li>
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.),
     * underscores (_), or dashes (-).</li>
     * <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li>
     * </ul>
     * 
     * @return The name of the rule set to create. The name must:</p>
     *         <ul>
     *         <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *         (.), underscores (_), or dashes (-).</li>
     *         <li>Start and end with a letter or number.</li>
     *         <li>Contain less than 64 characters.</li>
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the rule set to create. The name must:
     * </p>
     * <ul>
     * <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods (.),
     * underscores (_), or dashes (-).</li>
     * <li>Start and end with a letter or number.</li>
     * <li>Contain less than 64 characters.</li>
     * </ul>
     * 
     * @param ruleSetName
     *        The name of the rule set to create. The name must:</p>
     *        <ul>
     *        <li>Contain only ASCII letters (a-z, A-Z), numbers (0-9), periods
     *        (.), underscores (_), or dashes (-).</li>
     *        <li>Start and end with a letter or number.</li>
     *        <li>Contain less than 64 characters.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloneReceiptRuleSetRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @param originalRuleSetName
     *        The name of the rule set to clone.
     */

    public void setOriginalRuleSetName(String originalRuleSetName) {
        this.originalRuleSetName = originalRuleSetName;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @return The name of the rule set to clone.
     */

    public String getOriginalRuleSetName() {
        return this.originalRuleSetName;
    }

    /**
     * <p>
     * The name of the rule set to clone.
     * </p>
     * 
     * @param originalRuleSetName
     *        The name of the rule set to clone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CloneReceiptRuleSetRequest withOriginalRuleSetName(
            String originalRuleSetName) {
        setOriginalRuleSetName(originalRuleSetName);
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
        if (getRuleSetName() != null)
            sb.append("RuleSetName: " + getRuleSetName() + ",");
        if (getOriginalRuleSetName() != null)
            sb.append("OriginalRuleSetName: " + getOriginalRuleSetName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloneReceiptRuleSetRequest == false)
            return false;
        CloneReceiptRuleSetRequest other = (CloneReceiptRuleSetRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null
                && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getOriginalRuleSetName() == null
                ^ this.getOriginalRuleSetName() == null)
            return false;
        if (other.getOriginalRuleSetName() != null
                && other.getOriginalRuleSetName().equals(
                        this.getOriginalRuleSetName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRuleSetName() == null) ? 0 : getRuleSetName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOriginalRuleSetName() == null) ? 0
                        : getOriginalRuleSetName().hashCode());
        return hashCode;
    }

    @Override
    public CloneReceiptRuleSetRequest clone() {
        return (CloneReceiptRuleSetRequest) super.clone();
    }
}