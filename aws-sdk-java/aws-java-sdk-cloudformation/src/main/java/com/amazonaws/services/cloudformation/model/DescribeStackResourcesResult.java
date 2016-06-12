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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The output for a <a>DescribeStackResources</a> action.
 * </p>
 */
public class DescribeStackResourcesResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>StackResource</code> structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<StackResource> stackResources;

    /**
     * <p>
     * A list of <code>StackResource</code> structures.
     * </p>
     * 
     * @return A list of <code>StackResource</code> structures.
     */

    public java.util.List<StackResource> getStackResources() {
        if (stackResources == null) {
            stackResources = new com.amazonaws.internal.SdkInternalList<StackResource>();
        }
        return stackResources;
    }

    /**
     * <p>
     * A list of <code>StackResource</code> structures.
     * </p>
     * 
     * @param stackResources
     *        A list of <code>StackResource</code> structures.
     */

    public void setStackResources(
            java.util.Collection<StackResource> stackResources) {
        if (stackResources == null) {
            this.stackResources = null;
            return;
        }

        this.stackResources = new com.amazonaws.internal.SdkInternalList<StackResource>(
                stackResources);
    }

    /**
     * <p>
     * A list of <code>StackResource</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setStackResources(java.util.Collection)} or
     * {@link #withStackResources(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param stackResources
     *        A list of <code>StackResource</code> structures.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeStackResourcesResult withStackResources(
            StackResource... stackResources) {
        if (this.stackResources == null) {
            setStackResources(new com.amazonaws.internal.SdkInternalList<StackResource>(
                    stackResources.length));
        }
        for (StackResource ele : stackResources) {
            this.stackResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>StackResource</code> structures.
     * </p>
     * 
     * @param stackResources
     *        A list of <code>StackResource</code> structures.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeStackResourcesResult withStackResources(
            java.util.Collection<StackResource> stackResources) {
        setStackResources(stackResources);
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
        if (getStackResources() != null)
            sb.append("StackResources: " + getStackResources());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStackResourcesResult == false)
            return false;
        DescribeStackResourcesResult other = (DescribeStackResourcesResult) obj;
        if (other.getStackResources() == null
                ^ this.getStackResources() == null)
            return false;
        if (other.getStackResources() != null
                && other.getStackResources().equals(this.getStackResources()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStackResources() == null) ? 0 : getStackResources()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeStackResourcesResult clone() {
        try {
            return (DescribeStackResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
