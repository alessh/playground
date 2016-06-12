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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeSubscriptionFiltersResult implements Serializable,
        Cloneable {

    private com.amazonaws.internal.SdkInternalList<SubscriptionFilter> subscriptionFilters;

    private String nextToken;

    /**
     * @return
     */

    public java.util.List<SubscriptionFilter> getSubscriptionFilters() {
        if (subscriptionFilters == null) {
            subscriptionFilters = new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>();
        }
        return subscriptionFilters;
    }

    /**
     * @param subscriptionFilters
     */

    public void setSubscriptionFilters(
            java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        if (subscriptionFilters == null) {
            this.subscriptionFilters = null;
            return;
        }

        this.subscriptionFilters = new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>(
                subscriptionFilters);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubscriptionFilters(java.util.Collection)} or
     * {@link #withSubscriptionFilters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscriptionFilters
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(
            SubscriptionFilter... subscriptionFilters) {
        if (this.subscriptionFilters == null) {
            setSubscriptionFilters(new com.amazonaws.internal.SdkInternalList<SubscriptionFilter>(
                    subscriptionFilters.length));
        }
        for (SubscriptionFilter ele : subscriptionFilters) {
            this.subscriptionFilters.add(ele);
        }
        return this;
    }

    /**
     * @param subscriptionFilters
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubscriptionFiltersResult withSubscriptionFilters(
            java.util.Collection<SubscriptionFilter> subscriptionFilters) {
        setSubscriptionFilters(subscriptionFilters);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSubscriptionFiltersResult withNextToken(String nextToken) {
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
        if (getSubscriptionFilters() != null)
            sb.append("SubscriptionFilters: " + getSubscriptionFilters() + ",");
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

        if (obj instanceof DescribeSubscriptionFiltersResult == false)
            return false;
        DescribeSubscriptionFiltersResult other = (DescribeSubscriptionFiltersResult) obj;
        if (other.getSubscriptionFilters() == null
                ^ this.getSubscriptionFilters() == null)
            return false;
        if (other.getSubscriptionFilters() != null
                && other.getSubscriptionFilters().equals(
                        this.getSubscriptionFilters()) == false)
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
                + ((getSubscriptionFilters() == null) ? 0
                        : getSubscriptionFilters().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeSubscriptionFiltersResult clone() {
        try {
            return (DescribeSubscriptionFiltersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
