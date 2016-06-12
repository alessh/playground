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

/**
 * <p>
 * Describes a rule.
 * </p>
 */
public class TopicRulePayload implements Serializable, Cloneable {

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     */
    private String sql;
    /**
     * <p>
     * The description of the rule.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     */
    private java.util.List<Action> actions;
    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     */
    private Boolean ruleDisabled;

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param sql
     *        The SQL statement used to query the topic. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *        >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     */

    public void setSql(String sql) {
        this.sql = sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @return The SQL statement used to query the topic. For more information,
     *         see <a href=
     *         "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *         >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     */

    public String getSql() {
        return this.sql;
    }

    /**
     * <p>
     * The SQL statement used to query the topic. For more information, see <a
     * href=
     * "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     * >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * </p>
     * 
     * @param sql
     *        The SQL statement used to query the topic. For more information,
     *        see <a href=
     *        "http://docs.aws.amazon.com/iot/latest/developerguide/iot-rules.html#aws-iot-sql-reference"
     *        >AWS IoT SQL Reference</a> in the <i>AWS IoT Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TopicRulePayload withSql(String sql) {
        setSql(sql);
        return this;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @return The description of the rule.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the rule.
     * </p>
     * 
     * @param description
     *        The description of the rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TopicRulePayload withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @return The actions associated with the rule.
     */

    public java.util.List<Action> getActions() {
        return actions;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     */

    public void setActions(java.util.Collection<Action> actions) {
        if (actions == null) {
            this.actions = null;
            return;
        }

        this.actions = new java.util.ArrayList<Action>(actions);
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setActions(java.util.Collection)} or
     * {@link #withActions(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TopicRulePayload withActions(Action... actions) {
        if (this.actions == null) {
            setActions(new java.util.ArrayList<Action>(actions.length));
        }
        for (Action ele : actions) {
            this.actions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The actions associated with the rule.
     * </p>
     * 
     * @param actions
     *        The actions associated with the rule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TopicRulePayload withActions(java.util.Collection<Action> actions) {
        setActions(actions);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     */

    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean getRuleDisabled() {
        return this.ruleDisabled;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @param ruleDisabled
     *        Specifies whether the rule is disabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TopicRulePayload withRuleDisabled(Boolean ruleDisabled) {
        setRuleDisabled(ruleDisabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether the rule is disabled.
     * </p>
     * 
     * @return Specifies whether the rule is disabled.
     */

    public Boolean isRuleDisabled() {
        return this.ruleDisabled;
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
        if (getSql() != null)
            sb.append("Sql: " + getSql() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getActions() != null)
            sb.append("Actions: " + getActions() + ",");
        if (getRuleDisabled() != null)
            sb.append("RuleDisabled: " + getRuleDisabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicRulePayload == false)
            return false;
        TopicRulePayload other = (TopicRulePayload) obj;
        if (other.getSql() == null ^ this.getSql() == null)
            return false;
        if (other.getSql() != null
                && other.getSql().equals(this.getSql()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getActions() == null ^ this.getActions() == null)
            return false;
        if (other.getActions() != null
                && other.getActions().equals(this.getActions()) == false)
            return false;
        if (other.getRuleDisabled() == null ^ this.getRuleDisabled() == null)
            return false;
        if (other.getRuleDisabled() != null
                && other.getRuleDisabled().equals(this.getRuleDisabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSql() == null) ? 0 : getSql().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getActions() == null) ? 0 : getActions().hashCode());
        hashCode = prime
                * hashCode
                + ((getRuleDisabled() == null) ? 0 : getRuleDisabled()
                        .hashCode());
        return hashCode;
    }

    @Override
    public TopicRulePayload clone() {
        try {
            return (TopicRulePayload) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
