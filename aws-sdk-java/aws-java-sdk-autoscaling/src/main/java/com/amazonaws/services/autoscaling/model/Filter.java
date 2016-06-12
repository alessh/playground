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

/**
 * <p>
 * Describes a filter.
 * </p>
 */
public class Filter implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the filter. The valid values are:
     * <code>"auto-scaling-group"</code>, <code>"key"</code>,
     * <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The value of the filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> values;

    /**
     * <p>
     * The name of the filter. The valid values are:
     * <code>"auto-scaling-group"</code>, <code>"key"</code>,
     * <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     * </p>
     * 
     * @param name
     *        The name of the filter. The valid values are:
     *        <code>"auto-scaling-group"</code>, <code>"key"</code>,
     *        <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the filter. The valid values are:
     * <code>"auto-scaling-group"</code>, <code>"key"</code>,
     * <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     * </p>
     * 
     * @return The name of the filter. The valid values are:
     *         <code>"auto-scaling-group"</code>, <code>"key"</code>,
     *         <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the filter. The valid values are:
     * <code>"auto-scaling-group"</code>, <code>"key"</code>,
     * <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     * </p>
     * 
     * @param name
     *        The name of the filter. The valid values are:
     *        <code>"auto-scaling-group"</code>, <code>"key"</code>,
     *        <code>"value"</code>, and <code>"propagate-at-launch"</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Filter withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * 
     * @return The value of the filter.
     */

    public java.util.List<String> getValues() {
        if (values == null) {
            values = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return values;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * 
     * @param values
     *        The value of the filter.
     */

    public void setValues(java.util.Collection<String> values) {
        if (values == null) {
            this.values = null;
            return;
        }

        this.values = new com.amazonaws.internal.SdkInternalList<String>(values);
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setValues(java.util.Collection)} or
     * {@link #withValues(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param values
     *        The value of the filter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Filter withValues(String... values) {
        if (this.values == null) {
            setValues(new com.amazonaws.internal.SdkInternalList<String>(
                    values.length));
        }
        for (String ele : values) {
            this.values.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value of the filter.
     * </p>
     * 
     * @param values
     *        The value of the filter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Filter withValues(java.util.Collection<String> values) {
        setValues(values);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getValues() != null)
            sb.append("Values: " + getValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filter == false)
            return false;
        Filter other = (Filter) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getValues() == null ^ this.getValues() == null)
            return false;
        if (other.getValues() != null
                && other.getValues().equals(this.getValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getValues() == null) ? 0 : getValues().hashCode());
        return hashCode;
    }

    @Override
    public Filter clone() {
        try {
            return (Filter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
