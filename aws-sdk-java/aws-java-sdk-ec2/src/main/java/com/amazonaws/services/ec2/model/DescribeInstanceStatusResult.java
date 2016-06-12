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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeInstanceStatusResult implements Serializable, Cloneable {

    /**
     * <p>
     * One or more instance status descriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceStatus> instanceStatuses;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more instance status descriptions.
     * </p>
     * 
     * @return One or more instance status descriptions.
     */

    public java.util.List<InstanceStatus> getInstanceStatuses() {
        if (instanceStatuses == null) {
            instanceStatuses = new com.amazonaws.internal.SdkInternalList<InstanceStatus>();
        }
        return instanceStatuses;
    }

    /**
     * <p>
     * One or more instance status descriptions.
     * </p>
     * 
     * @param instanceStatuses
     *        One or more instance status descriptions.
     */

    public void setInstanceStatuses(
            java.util.Collection<InstanceStatus> instanceStatuses) {
        if (instanceStatuses == null) {
            this.instanceStatuses = null;
            return;
        }

        this.instanceStatuses = new com.amazonaws.internal.SdkInternalList<InstanceStatus>(
                instanceStatuses);
    }

    /**
     * <p>
     * One or more instance status descriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceStatuses(java.util.Collection)} or
     * {@link #withInstanceStatuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param instanceStatuses
     *        One or more instance status descriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceStatusResult withInstanceStatuses(
            InstanceStatus... instanceStatuses) {
        if (this.instanceStatuses == null) {
            setInstanceStatuses(new com.amazonaws.internal.SdkInternalList<InstanceStatus>(
                    instanceStatuses.length));
        }
        for (InstanceStatus ele : instanceStatuses) {
            this.instanceStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance status descriptions.
     * </p>
     * 
     * @param instanceStatuses
     *        One or more instance status descriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceStatusResult withInstanceStatuses(
            java.util.Collection<InstanceStatus> instanceStatuses) {
        setInstanceStatuses(instanceStatuses);
        return this;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value
     *        is <code>null</code> when there are no more results to return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @return The token to use to retrieve the next page of results. This value
     *         is <code>null</code> when there are no more results to return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The token to use to retrieve the next page of results. This value
     *        is <code>null</code> when there are no more results to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceStatusResult withNextToken(String nextToken) {
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
        if (getInstanceStatuses() != null)
            sb.append("InstanceStatuses: " + getInstanceStatuses() + ",");
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

        if (obj instanceof DescribeInstanceStatusResult == false)
            return false;
        DescribeInstanceStatusResult other = (DescribeInstanceStatusResult) obj;
        if (other.getInstanceStatuses() == null
                ^ this.getInstanceStatuses() == null)
            return false;
        if (other.getInstanceStatuses() != null
                && other.getInstanceStatuses().equals(
                        this.getInstanceStatuses()) == false)
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
                + ((getInstanceStatuses() == null) ? 0 : getInstanceStatuses()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceStatusResult clone() {
        try {
            return (DescribeInstanceStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}