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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the returned data in response to a request action.
 * </p>
 */
public class DescribeFleetCapacityResult implements Serializable, Cloneable {

    /**
     * <p>
     * Collection of objects containing capacity information for each requested
     * fleet ID. Leave this parameter empty to retrieve capacity information for
     * all fleets.
     * </p>
     */
    private java.util.List<FleetCapacity> fleetCapacity;
    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to
     * this action. If no token is returned, these results represent the end of
     * the list.
     * </p>
     * <note>
     * <p>
     * If a request has a limit that exactly matches the number of remaining
     * results, a token is returned even though there are no more results to
     * retrieve.
     * </p>
     * </note>
     */
    private String nextToken;

    /**
     * <p>
     * Collection of objects containing capacity information for each requested
     * fleet ID. Leave this parameter empty to retrieve capacity information for
     * all fleets.
     * </p>
     * 
     * @return Collection of objects containing capacity information for each
     *         requested fleet ID. Leave this parameter empty to retrieve
     *         capacity information for all fleets.
     */

    public java.util.List<FleetCapacity> getFleetCapacity() {
        return fleetCapacity;
    }

    /**
     * <p>
     * Collection of objects containing capacity information for each requested
     * fleet ID. Leave this parameter empty to retrieve capacity information for
     * all fleets.
     * </p>
     * 
     * @param fleetCapacity
     *        Collection of objects containing capacity information for each
     *        requested fleet ID. Leave this parameter empty to retrieve
     *        capacity information for all fleets.
     */

    public void setFleetCapacity(
            java.util.Collection<FleetCapacity> fleetCapacity) {
        if (fleetCapacity == null) {
            this.fleetCapacity = null;
            return;
        }

        this.fleetCapacity = new java.util.ArrayList<FleetCapacity>(
                fleetCapacity);
    }

    /**
     * <p>
     * Collection of objects containing capacity information for each requested
     * fleet ID. Leave this parameter empty to retrieve capacity information for
     * all fleets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFleetCapacity(java.util.Collection)} or
     * {@link #withFleetCapacity(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param fleetCapacity
     *        Collection of objects containing capacity information for each
     *        requested fleet ID. Leave this parameter empty to retrieve
     *        capacity information for all fleets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityResult withFleetCapacity(
            FleetCapacity... fleetCapacity) {
        if (this.fleetCapacity == null) {
            setFleetCapacity(new java.util.ArrayList<FleetCapacity>(
                    fleetCapacity.length));
        }
        for (FleetCapacity ele : fleetCapacity) {
            this.fleetCapacity.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Collection of objects containing capacity information for each requested
     * fleet ID. Leave this parameter empty to retrieve capacity information for
     * all fleets.
     * </p>
     * 
     * @param fleetCapacity
     *        Collection of objects containing capacity information for each
     *        requested fleet ID. Leave this parameter empty to retrieve
     *        capacity information for all fleets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityResult withFleetCapacity(
            java.util.Collection<FleetCapacity> fleetCapacity) {
        setFleetCapacity(fleetCapacity);
        return this;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to
     * this action. If no token is returned, these results represent the end of
     * the list.
     * </p>
     * <note>
     * <p>
     * If a request has a limit that exactly matches the number of remaining
     * results, a token is returned even though there are no more results to
     * retrieve.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next
     *        call to this action. If no token is returned, these results
     *        represent the end of the list.</p> <note>
     *        <p>
     *        If a request has a limit that exactly matches the number of
     *        remaining results, a token is returned even though there are no
     *        more results to retrieve.
     *        </p>
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to
     * this action. If no token is returned, these results represent the end of
     * the list.
     * </p>
     * <note>
     * <p>
     * If a request has a limit that exactly matches the number of remaining
     * results, a token is returned even though there are no more results to
     * retrieve.
     * </p>
     * </note>
     * 
     * @return Token indicating where to resume retrieving results on the next
     *         call to this action. If no token is returned, these results
     *         represent the end of the list.</p> <note>
     *         <p>
     *         If a request has a limit that exactly matches the number of
     *         remaining results, a token is returned even though there are no
     *         more results to retrieve.
     *         </p>
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating where to resume retrieving results on the next call to
     * this action. If no token is returned, these results represent the end of
     * the list.
     * </p>
     * <note>
     * <p>
     * If a request has a limit that exactly matches the number of remaining
     * results, a token is returned even though there are no more results to
     * retrieve.
     * </p>
     * </note>
     * 
     * @param nextToken
     *        Token indicating where to resume retrieving results on the next
     *        call to this action. If no token is returned, these results
     *        represent the end of the list.</p> <note>
     *        <p>
     *        If a request has a limit that exactly matches the number of
     *        remaining results, a token is returned even though there are no
     *        more results to retrieve.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityResult withNextToken(String nextToken) {
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
        if (getFleetCapacity() != null)
            sb.append("FleetCapacity: " + getFleetCapacity() + ",");
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

        if (obj instanceof DescribeFleetCapacityResult == false)
            return false;
        DescribeFleetCapacityResult other = (DescribeFleetCapacityResult) obj;
        if (other.getFleetCapacity() == null ^ this.getFleetCapacity() == null)
            return false;
        if (other.getFleetCapacity() != null
                && other.getFleetCapacity().equals(this.getFleetCapacity()) == false)
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
                + ((getFleetCapacity() == null) ? 0 : getFleetCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetCapacityResult clone() {
        try {
            return (DescribeFleetCapacityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
