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
public class DescribeReceiptRuleRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the receipt rule set to which the receipt rule belongs.
     * </p>
     */
    private String ruleSetName;
    /**
     * <p>
     * The name of the receipt rule.
     * </p>
     */
    private String ruleName;

    /**
     * <p>
     * The name of the receipt rule set to which the receipt rule belongs.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to which the receipt rule
     *        belongs.
     */

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to which the receipt rule belongs.
     * </p>
     * 
     * @return The name of the receipt rule set to which the receipt rule
     *         belongs.
     */

    public String getRuleSetName() {
        return this.ruleSetName;
    }

    /**
     * <p>
     * The name of the receipt rule set to which the receipt rule belongs.
     * </p>
     * 
     * @param ruleSetName
     *        The name of the receipt rule set to which the receipt rule
     *        belongs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReceiptRuleRequest withRuleSetName(String ruleSetName) {
        setRuleSetName(ruleSetName);
        return this;
    }

    /**
     * <p>
     * The name of the receipt rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the receipt rule.
     */

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    /**
     * <p>
     * The name of the receipt rule.
     * </p>
     * 
     * @return The name of the receipt rule.
     */

    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * <p>
     * The name of the receipt rule.
     * </p>
     * 
     * @param ruleName
     *        The name of the receipt rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeReceiptRuleRequest withRuleName(String ruleName) {
        setRuleName(ruleName);
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
        if (getRuleName() != null)
            sb.append("RuleName: " + getRuleName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeReceiptRuleRequest == false)
            return false;
        DescribeReceiptRuleRequest other = (DescribeReceiptRuleRequest) obj;
        if (other.getRuleSetName() == null ^ this.getRuleSetName() == null)
            return false;
        if (other.getRuleSetName() != null
                && other.getRuleSetName().equals(this.getRuleSetName()) == false)
            return false;
        if (other.getRuleName() == null ^ this.getRuleName() == null)
            return false;
        if (other.getRuleName() != null
                && other.getRuleName().equals(this.getRuleName()) == false)
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
        hashCode = prime * hashCode
                + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        return hashCode;
    }

    @Override
    public DescribeReceiptRuleRequest clone() {
        return (DescribeReceiptRuleRequest) super.clone();
    }
}