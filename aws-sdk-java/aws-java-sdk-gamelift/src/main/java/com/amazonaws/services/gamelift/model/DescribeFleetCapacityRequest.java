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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DescribeFleetCapacityRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for the fleet(s) you want to retrieve capacity
     * information for.
     * </p>
     */
    private java.util.List<String> fleetIds;
    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Unique identifier for the fleet(s) you want to retrieve capacity
     * information for.
     * </p>
     * 
     * @return Unique identifier for the fleet(s) you want to retrieve capacity
     *         information for.
     */

    public java.util.List<String> getFleetIds() {
        return fleetIds;
    }

    /**
     * <p>
     * Unique identifier for the fleet(s) you want to retrieve capacity
     * information for.
     * </p>
     * 
     * @param fleetIds
     *        Unique identifier for the fleet(s) you want to retrieve capacity
     *        information for.
     */

    public void setFleetIds(java.util.Collection<String> fleetIds) {
        if (fleetIds == null) {
            this.fleetIds = null;
            return;
        }

        this.fleetIds = new java.util.ArrayList<String>(fleetIds);
    }

    /**
     * <p>
     * Unique identifier for the fleet(s) you want to retrieve capacity
     * information for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFleetIds(java.util.Collection)} or
     * {@link #withFleetIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fleetIds
     *        Unique identifier for the fleet(s) you want to retrieve capacity
     *        information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityRequest withFleetIds(String... fleetIds) {
        if (this.fleetIds == null) {
            setFleetIds(new java.util.ArrayList<String>(fleetIds.length));
        }
        for (String ele : fleetIds) {
            this.fleetIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Unique identifier for the fleet(s) you want to retrieve capacity
     * information for.
     * </p>
     * 
     * @param fleetIds
     *        Unique identifier for the fleet(s) you want to retrieve capacity
     *        information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityRequest withFleetIds(
            java.util.Collection<String> fleetIds) {
        setFleetIds(fleetIds);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     *        This parameter is ignored when the request specifies one or a list
     *        of fleet IDs.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @return Maximum number of results to return. You can use this parameter
     *         with <i>NextToken</i> to get results as a set of sequential
     *         pages. This parameter is ignored when the request specifies one
     *         or a list of fleet IDs.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     *        This parameter is ignored when the request specifies one or a list
     *        of fleet IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        Use the token that is returned with a previous call to this
     *        action. To specify the start of the result set, do not specify a
     *        value. This parameter is ignored when the request specifies one or
     *        a list of fleet IDs.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of
     *         results. Use the token that is returned with a previous call to
     *         this action. To specify the start of the result set, do not
     *         specify a value. This parameter is ignored when the request
     *         specifies one or a list of fleet IDs.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value. This
     * parameter is ignored when the request specifies one or a list of fleet
     * IDs.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        Use the token that is returned with a previous call to this
     *        action. To specify the start of the result set, do not specify a
     *        value. This parameter is ignored when the request specifies one or
     *        a list of fleet IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFleetCapacityRequest withNextToken(String nextToken) {
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
        if (getFleetIds() != null)
            sb.append("FleetIds: " + getFleetIds() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
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

        if (obj instanceof DescribeFleetCapacityRequest == false)
            return false;
        DescribeFleetCapacityRequest other = (DescribeFleetCapacityRequest) obj;
        if (other.getFleetIds() == null ^ this.getFleetIds() == null)
            return false;
        if (other.getFleetIds() != null
                && other.getFleetIds().equals(this.getFleetIds()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
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

        hashCode = prime * hashCode
                + ((getFleetIds() == null) ? 0 : getFleetIds().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFleetCapacityRequest clone() {
        return (DescribeFleetCapacityRequest) super.clone();
    }
}