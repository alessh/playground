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
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeNatGatewaysRequestMarshaller;

/**
 * 
 */
public class DescribeNatGatewaysRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeNatGatewaysRequest> {

    /**
     * <p>
     * One or more NAT gateway IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> natGatewayIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>nat-gateway-id</code> - The ID of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the NAT gateway (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet in which the NAT gateway
     * resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC in which the NAT gateway resides.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filter;
    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Constraint: If the value specified is greater than 1000, we return only
     * 1000 items.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more NAT gateway IDs.
     * </p>
     * 
     * @return One or more NAT gateway IDs.
     */

    public java.util.List<String> getNatGatewayIds() {
        if (natGatewayIds == null) {
            natGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return natGatewayIds;
    }

    /**
     * <p>
     * One or more NAT gateway IDs.
     * </p>
     * 
     * @param natGatewayIds
     *        One or more NAT gateway IDs.
     */

    public void setNatGatewayIds(java.util.Collection<String> natGatewayIds) {
        if (natGatewayIds == null) {
            this.natGatewayIds = null;
            return;
        }

        this.natGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(
                natGatewayIds);
    }

    /**
     * <p>
     * One or more NAT gateway IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNatGatewayIds(java.util.Collection)} or
     * {@link #withNatGatewayIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param natGatewayIds
     *        One or more NAT gateway IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withNatGatewayIds(String... natGatewayIds) {
        if (this.natGatewayIds == null) {
            setNatGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(
                    natGatewayIds.length));
        }
        for (String ele : natGatewayIds) {
            this.natGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more NAT gateway IDs.
     * </p>
     * 
     * @param natGatewayIds
     *        One or more NAT gateway IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withNatGatewayIds(
            java.util.Collection<String> natGatewayIds) {
        setNatGatewayIds(natGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>nat-gateway-id</code> - The ID of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the NAT gateway (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet in which the NAT gateway
     * resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC in which the NAT gateway resides.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>nat-gateway-id</code> - The ID of the NAT gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>state</code> - The state of the NAT gateway (
     *         <code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>subnet-id</code> - The ID of the subnet in which the NAT
     *         gateway resides.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *         resides.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilter() {
        if (filter == null) {
            filter = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filter;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>nat-gateway-id</code> - The ID of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the NAT gateway (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet in which the NAT gateway
     * resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC in which the NAT gateway resides.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>nat-gateway-id</code> - The ID of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the NAT gateway (
     *        <code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>deleting</code> |
     *        <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet in which the NAT
     *        gateway resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *        resides.
     *        </p>
     *        </li>
     */

    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new com.amazonaws.internal.SdkInternalList<Filter>(filter);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>nat-gateway-id</code> - The ID of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the NAT gateway (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet in which the NAT gateway
     * resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC in which the NAT gateway resides.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilter(java.util.Collection)} or
     * {@link #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>nat-gateway-id</code> - The ID of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the NAT gateway (
     *        <code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>deleting</code> |
     *        <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet in which the NAT
     *        gateway resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *        resides.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withFilter(Filter... filter) {
        if (this.filter == null) {
            setFilter(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filter.length));
        }
        for (Filter ele : filter) {
            this.filter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>nat-gateway-id</code> - The ID of the NAT gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>state</code> - The state of the NAT gateway (<code>pending</code> |
     * <code>failed</code> | <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>subnet-id</code> - The ID of the subnet in which the NAT gateway
     * resides.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>vpc-id</code> - The ID of the VPC in which the NAT gateway resides.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>nat-gateway-id</code> - The ID of the NAT gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>state</code> - The state of the NAT gateway (
     *        <code>pending</code> | <code>failed</code> |
     *        <code>available</code> | <code>deleting</code> |
     *        <code>deleted</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>subnet-id</code> - The ID of the subnet in which the NAT
     *        gateway resides.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *        resides.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withFilter(
            java.util.Collection<Filter> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Constraint: If the value specified is greater than 1000, we return only
     * 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The
     *        request returns a token that you can specify in a subsequent call
     *        to get the next set of results.</p>
     *        <p>
     *        Constraint: If the value specified is greater than 1000, we return
     *        only 1000 items.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Constraint: If the value specified is greater than 1000, we return only
     * 1000 items.
     * </p>
     * 
     * @return The maximum number of items to return for this request. The
     *         request returns a token that you can specify in a subsequent call
     *         to get the next set of results.</p>
     *         <p>
     *         Constraint: If the value specified is greater than 1000, we
     *         return only 1000 items.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * <p>
     * Constraint: If the value specified is greater than 1000, we return only
     * 1000 items.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this request. The
     *        request returns a token that you can specify in a subsequent call
     *        to get the next set of results.</p>
     *        <p>
     *        Constraint: If the value specified is greater than 1000, we return
     *        only 1000 items.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @return The token to retrieve the next page of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     * 
     * @param nextToken
     *        The token to retrieve the next page of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeNatGatewaysRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeNatGatewaysRequest> getDryRunRequest() {
        Request<DescribeNatGatewaysRequest> request = new DescribeNatGatewaysRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getNatGatewayIds() != null)
            sb.append("NatGatewayIds: " + getNatGatewayIds() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
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

        if (obj instanceof DescribeNatGatewaysRequest == false)
            return false;
        DescribeNatGatewaysRequest other = (DescribeNatGatewaysRequest) obj;
        if (other.getNatGatewayIds() == null ^ this.getNatGatewayIds() == null)
            return false;
        if (other.getNatGatewayIds() != null
                && other.getNatGatewayIds().equals(this.getNatGatewayIds()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null
                && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
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
                + ((getNatGatewayIds() == null) ? 0 : getNatGatewayIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeNatGatewaysRequest clone() {
        return (DescribeNatGatewaysRequest) super.clone();
    }
}