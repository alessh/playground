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

/**
 * 
 */
public class GetRuleResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>Rule</a> that you specified in the
     * <code>GetRule</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>Rule</a>: Contains <code>MetricName</code>, <code>Name</code>, an
     * array of <code>Predicate</code> objects, and <code>RuleId</code></li>
     * <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     * <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     * </ul>
     */
    private Rule rule;

    /**
     * <p>
     * Information about the <a>Rule</a> that you specified in the
     * <code>GetRule</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>Rule</a>: Contains <code>MetricName</code>, <code>Name</code>, an
     * array of <code>Predicate</code> objects, and <code>RuleId</code></li>
     * <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     * <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     * </ul>
     * 
     * @param rule
     *        Information about the <a>Rule</a> that you specified in the
     *        <code>GetRule</code> request. For more information, see the
     *        following topics:</p>
     *        <ul>
     *        <li><a>Rule</a>: Contains <code>MetricName</code>,
     *        <code>Name</code>, an array of <code>Predicate</code> objects, and
     *        <code>RuleId</code></li>
     *        <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     *        <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     */

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    /**
     * <p>
     * Information about the <a>Rule</a> that you specified in the
     * <code>GetRule</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>Rule</a>: Contains <code>MetricName</code>, <code>Name</code>, an
     * array of <code>Predicate</code> objects, and <code>RuleId</code></li>
     * <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     * <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     * </ul>
     * 
     * @return Information about the <a>Rule</a> that you specified in the
     *         <code>GetRule</code> request. For more information, see the
     *         following topics:</p>
     *         <ul>
     *         <li><a>Rule</a>: Contains <code>MetricName</code>,
     *         <code>Name</code>, an array of <code>Predicate</code> objects,
     *         and <code>RuleId</code></li>
     *         <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     *         <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     */

    public Rule getRule() {
        return this.rule;
    }

    /**
     * <p>
     * Information about the <a>Rule</a> that you specified in the
     * <code>GetRule</code> request. For more information, see the following
     * topics:
     * </p>
     * <ul>
     * <li><a>Rule</a>: Contains <code>MetricName</code>, <code>Name</code>, an
     * array of <code>Predicate</code> objects, and <code>RuleId</code></li>
     * <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     * <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     * </ul>
     * 
     * @param rule
     *        Information about the <a>Rule</a> that you specified in the
     *        <code>GetRule</code> request. For more information, see the
     *        following topics:</p>
     *        <ul>
     *        <li><a>Rule</a>: Contains <code>MetricName</code>,
     *        <code>Name</code>, an array of <code>Predicate</code> objects, and
     *        <code>RuleId</code></li>
     *        <li><a>Predicate</a>: Each <code>Predicate</code> object contains
     *        <code>DataId</code>, <code>Negated</code>, and <code>Type</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRuleResult withRule(Rule rule) {
        setRule(rule);
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
        if (getRule() != null)
            sb.append("Rule: " + getRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRuleResult == false)
            return false;
        GetRuleResult other = (GetRuleResult) obj;
        if (other.getRule() == null ^ this.getRule() == null)
            return false;
        if (other.getRule() != null
                && other.getRule().equals(this.getRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRule() == null) ? 0 : getRule().hashCode());
        return hashCode;
    }

    @Override
    public GetRuleResult clone() {
        try {
            return (GetRuleResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
