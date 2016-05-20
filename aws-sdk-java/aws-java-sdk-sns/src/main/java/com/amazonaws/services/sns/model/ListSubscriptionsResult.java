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

package com.amazonaws.services.sns.model;

import java.io.Serializable;

/**
 * <p>
 * Response for ListSubscriptions action
 * </p>
 */
public class ListSubscriptionsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of subscriptions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Subscription> subscriptions;
    /**
     * <p>
     * Token to pass along to the next <code>ListSubscriptions</code> request.
     * This element is returned if there are more subscriptions to retrieve.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of subscriptions.
     * </p>
     * 
     * @return A list of subscriptions.
     */

    public java.util.List<Subscription> getSubscriptions() {
        if (subscriptions == null) {
            subscriptions = new com.amazonaws.internal.SdkInternalList<Subscription>();
        }
        return subscriptions;
    }

    /**
     * <p>
     * A list of subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        A list of subscriptions.
     */

    public void setSubscriptions(
            java.util.Collection<Subscription> subscriptions) {
        if (subscriptions == null) {
            this.subscriptions = null;
            return;
        }

        this.subscriptions = new com.amazonaws.internal.SdkInternalList<Subscription>(
                subscriptions);
    }

    /**
     * <p>
     * A list of subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSubscriptions(java.util.Collection)} or
     * {@link #withSubscriptions(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subscriptions
     *        A list of subscriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSubscriptionsResult withSubscriptions(
            Subscription... subscriptions) {
        if (this.subscriptions == null) {
            setSubscriptions(new com.amazonaws.internal.SdkInternalList<Subscription>(
                    subscriptions.length));
        }
        for (Subscription ele : subscriptions) {
            this.subscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of subscriptions.
     * </p>
     * 
     * @param subscriptions
     *        A list of subscriptions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSubscriptionsResult withSubscriptions(
            java.util.Collection<Subscription> subscriptions) {
        setSubscriptions(subscriptions);
        return this;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListSubscriptions</code> request.
     * This element is returned if there are more subscriptions to retrieve.
     * </p>
     * 
     * @param nextToken
     *        Token to pass along to the next <code>ListSubscriptions</code>
     *        request. This element is returned if there are more subscriptions
     *        to retrieve.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListSubscriptions</code> request.
     * This element is returned if there are more subscriptions to retrieve.
     * </p>
     * 
     * @return Token to pass along to the next <code>ListSubscriptions</code>
     *         request. This element is returned if there are more subscriptions
     *         to retrieve.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token to pass along to the next <code>ListSubscriptions</code> request.
     * This element is returned if there are more subscriptions to retrieve.
     * </p>
     * 
     * @param nextToken
     *        Token to pass along to the next <code>ListSubscriptions</code>
     *        request. This element is returned if there are more subscriptions
     *        to retrieve.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSubscriptionsResult withNextToken(String nextToken) {
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
        if (getSubscriptions() != null)
            sb.append("Subscriptions: " + getSubscriptions() + ",");
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

        if (obj instanceof ListSubscriptionsResult == false)
            return false;
        ListSubscriptionsResult other = (ListSubscriptionsResult) obj;
        if (other.getSubscriptions() == null ^ this.getSubscriptions() == null)
            return false;
        if (other.getSubscriptions() != null
                && other.getSubscriptions().equals(this.getSubscriptions()) == false)
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
                + ((getSubscriptions() == null) ? 0 : getSubscriptions()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListSubscriptionsResult clone() {
        try {
            return (ListSubscriptionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
