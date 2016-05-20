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

package com.amazonaws.services.waf.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetRuleRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     */
    private String ruleId;

    /**
     * <p>
     * The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *        <a>ListRules</a>.
     */

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     * 
     * @return The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     *         <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *         <a>ListRules</a>.
     */

    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * <p>
     * The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     * <code>RuleId</code> is returned by <a>CreateRule</a> and by
     * <a>ListRules</a>.
     * </p>
     * 
     * @param ruleId
     *        The <code>RuleId</code> of the <a>Rule</a> that you want to get.
     *        <code>RuleId</code> is returned by <a>CreateRule</a> and by
     *        <a>ListRules</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRuleRequest withRuleId(String ruleId) {
        setRuleId(ruleId);
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
        if (getRuleId() != null)
            sb.append("RuleId: " + getRuleId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleRequest == false)
            return false;
        GetRuleRequest other = (GetRuleRequest) obj;
        if (other.getRuleId() == null ^ this.getRuleId() == null)
            return false;
        if (other.getRuleId() != null
                && other.getRuleId().equals(this.getRuleId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleRequest clone() {
        return (GetRuleRequest) super.clone();
    }
}