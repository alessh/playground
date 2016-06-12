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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a <code>CreateStack</code> request.
 * </p>
 */
public class CreateStackResult implements Serializable, Cloneable {

    /**
     * <p>
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     * </p>
     */
    private String stackId;

    /**
     * <p>
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     * </p>
     * 
     * @param stackId
     *        The stack ID, which is an opaque string that you use to identify
     *        the stack when performing actions such as
     *        <code>DescribeStacks</code>.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     * </p>
     * 
     * @return The stack ID, which is an opaque string that you use to identify
     *         the stack when performing actions such as
     *         <code>DescribeStacks</code>.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The stack ID, which is an opaque string that you use to identify the
     * stack when performing actions such as <code>DescribeStacks</code>.
     * </p>
     * 
     * @param stackId
     *        The stack ID, which is an opaque string that you use to identify
     *        the stack when performing actions such as
     *        <code>DescribeStacks</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateStackResult withStackId(String stackId) {
        setStackId(stackId);
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
        if (getStackId() != null)
            sb.append("StackId: " + getStackId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStackResult == false)
            return false;
        CreateStackResult other = (CreateStackResult) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null
                && other.getStackId().equals(this.getStackId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackId() == null) ? 0 : getStackId().hashCode());
        return hashCode;
    }

    @Override
    public CreateStackResult clone() {
        try {
            return (CreateStackResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
