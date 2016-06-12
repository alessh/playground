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
import com.amazonaws.services.ec2.model.transform.DescribePrefixListsRequestMarshaller;

/**
 * 
 */
public class DescribePrefixListsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribePrefixListsRequest> {

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> prefixListIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
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
     * The token for the next set of items to return. (You received this token
     * from a prior call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * 
     * @return One or more prefix list IDs.
     */

    public java.util.List<String> getPrefixListIds() {
        if (prefixListIds == null) {
            prefixListIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return prefixListIds;
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * 
     * @param prefixListIds
     *        One or more prefix list IDs.
     */

    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }

        this.prefixListIds = new com.amazonaws.internal.SdkInternalList<String>(
                prefixListIds);
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrefixListIds(java.util.Collection)} or
     * {@link #withPrefixListIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param prefixListIds
     *        One or more prefix list IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsRequest withPrefixListIds(String... prefixListIds) {
        if (this.prefixListIds == null) {
            setPrefixListIds(new com.amazonaws.internal.SdkInternalList<String>(
                    prefixListIds.length));
        }
        for (String ele : prefixListIds) {
            this.prefixListIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more prefix list IDs.
     * </p>
     * 
     * @param prefixListIds
     *        One or more prefix list IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsRequest withPrefixListIds(
            java.util.Collection<String> prefixListIds) {
        setPrefixListIds(prefixListIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>prefix-list-id</code>: The ID of a prefix list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>prefix-list-name</code>: The name of a prefix list.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix-list-id</code>: The ID of a prefix list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>prefix-list-name</code>: The name of a prefix list.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(
                filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix-list-id</code>: The ID of a prefix list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>prefix-list-name</code>: The name of a prefix list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
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
     * <code>prefix-list-id</code>: The ID of a prefix list.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>prefix-list-name</code>: The name of a prefix list.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>prefix-list-id</code>: The ID of a prefix list.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>prefix-list-name</code>: The name of a prefix list.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
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

    public DescribePrefixListsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a prior call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a prior call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a prior call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a prior call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a prior call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePrefixListsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribePrefixListsRequest> getDryRunRequest() {
        Request<DescribePrefixListsRequest> request = new DescribePrefixListsRequestMarshaller()
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
        if (getPrefixListIds() != null)
            sb.append("PrefixListIds: " + getPrefixListIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
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

        if (obj instanceof DescribePrefixListsRequest == false)
            return false;
        DescribePrefixListsRequest other = (DescribePrefixListsRequest) obj;
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null)
            return false;
        if (other.getPrefixListIds() != null
                && other.getPrefixListIds().equals(this.getPrefixListIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
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
                + ((getPrefixListIds() == null) ? 0 : getPrefixListIds()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribePrefixListsRequest clone() {
        return (DescribePrefixListsRequest) super.clone();
    }
}