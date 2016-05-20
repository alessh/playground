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
public class DescribeInstancesResult implements Serializable, Cloneable {

    /**
     * <p>
     * Zero or more reservations.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Reservation> reservations;
    /**
     * <p>
     * The token to use to retrieve the next page of results. This value is
     * <code>null</code> when there are no more results to return.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Zero or more reservations.
     * </p>
     * 
     * @return Zero or more reservations.
     */

    public java.util.List<Reservation> getReservations() {
        if (reservations == null) {
            reservations = new com.amazonaws.internal.SdkInternalList<Reservation>();
        }
        return reservations;
    }

    /**
     * <p>
     * Zero or more reservations.
     * </p>
     * 
     * @param reservations
     *        Zero or more reservations.
     */

    public void setReservations(java.util.Collection<Reservation> reservations) {
        if (reservations == null) {
            this.reservations = null;
            return;
        }

        this.reservations = new com.amazonaws.internal.SdkInternalList<Reservation>(
                reservations);
    }

    /**
     * <p>
     * Zero or more reservations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setReservations(java.util.Collection)} or
     * {@link #withReservations(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param reservations
     *        Zero or more reservations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstancesResult withReservations(Reservation... reservations) {
        if (this.reservations == null) {
            setReservations(new com.amazonaws.internal.SdkInternalList<Reservation>(
                    reservations.length));
        }
        for (Reservation ele : reservations) {
            this.reservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Zero or more reservations.
     * </p>
     * 
     * @param reservations
     *        Zero or more reservations.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstancesResult withReservations(
            java.util.Collection<Reservation> reservations) {
        setReservations(reservations);
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

    public DescribeInstancesResult withNextToken(String nextToken) {
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
        if (getReservations() != null)
            sb.append("Reservations: " + getReservations() + ",");
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

        if (obj instanceof DescribeInstancesResult == false)
            return false;
        DescribeInstancesResult other = (DescribeInstancesResult) obj;
        if (other.getReservations() == null ^ this.getReservations() == null)
            return false;
        if (other.getReservations() != null
                && other.getReservations().equals(this.getReservations()) == false)
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
                + ((getReservations() == null) ? 0 : getReservations()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstancesResult clone() {
        try {
            return (DescribeInstancesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}