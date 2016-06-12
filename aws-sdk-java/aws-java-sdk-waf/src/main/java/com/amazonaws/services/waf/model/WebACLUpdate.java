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
 * <p>
 * Specifies whether to insert a <code>Rule</code> into or delete a
 * <code>Rule</code> from a <code>WebACL</code>.
 * </p>
 */
public class WebACLUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     */
    private String action;

    private ActivatedRule activatedRule;

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a
     *        <code>Rule</code> from a <code>WebACL</code>.
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @return Specifies whether to insert a <code>Rule</code> into or delete a
     *         <code>Rule</code> from a <code>WebACL</code>.
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a
     *        <code>Rule</code> from a <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public WebACLUpdate withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a
     *        <code>Rule</code> from a <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * Specifies whether to insert a <code>Rule</code> into or delete a
     * <code>Rule</code> from a <code>WebACL</code>.
     * </p>
     * 
     * @param action
     *        Specifies whether to insert a <code>Rule</code> into or delete a
     *        <code>Rule</code> from a <code>WebACL</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public WebACLUpdate withAction(ChangeAction action) {
        setAction(action);
        return this;
    }

    /**
     * @param activatedRule
     */

    public void setActivatedRule(ActivatedRule activatedRule) {
        this.activatedRule = activatedRule;
    }

    /**
     * @return
     */

    public ActivatedRule getActivatedRule() {
        return this.activatedRule;
    }

    /**
     * @param activatedRule
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public WebACLUpdate withActivatedRule(ActivatedRule activatedRule) {
        setActivatedRule(activatedRule);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getActivatedRule() != null)
            sb.append("ActivatedRule: " + getActivatedRule());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WebACLUpdate == false)
            return false;
        WebACLUpdate other = (WebACLUpdate) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null
                && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getActivatedRule() == null ^ this.getActivatedRule() == null)
            return false;
        if (other.getActivatedRule() != null
                && other.getActivatedRule().equals(this.getActivatedRule()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getActivatedRule() == null) ? 0 : getActivatedRule()
                        .hashCode());
        return hashCode;
    }

    @Override
    public WebACLUpdate clone() {
        try {
            return (WebACLUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
