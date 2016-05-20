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

package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>GetResourceConfigHistory</a> action.
 * </p>
 */
public class GetResourceConfigHistoryRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The resource type.
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     * </p>
     */
    private java.util.Date laterTime;
    /**
     * <p>
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     * </p>
     */
    private java.util.Date earlierTime;
    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     */
    private String chronologicalOrder;
    /**
     * <p>
     * The maximum number of configuration items returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @see ResourceType
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @return The resource type.
     * @see ResourceType
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */

    public GetResourceConfigHistoryRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */

    public void setResourceType(ResourceType resourceType) {
        this.resourceType = resourceType.toString();
    }

    /**
     * <p>
     * The resource type.
     * </p>
     * 
     * @param resourceType
     *        The resource type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceType
     */

    public GetResourceConfigHistoryRequest withResourceType(
            ResourceType resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @return The ID of the resource (for example., <code>sg-xxxxxx</code>).
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * </p>
     * 
     * @param resourceId
     *        The ID of the resource (for example., <code>sg-xxxxxx</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     * </p>
     * 
     * @param laterTime
     *        The time stamp that indicates a later time. If not specified,
     *        current time is taken.
     */

    public void setLaterTime(java.util.Date laterTime) {
        this.laterTime = laterTime;
    }

    /**
     * <p>
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     * </p>
     * 
     * @return The time stamp that indicates a later time. If not specified,
     *         current time is taken.
     */

    public java.util.Date getLaterTime() {
        return this.laterTime;
    }

    /**
     * <p>
     * The time stamp that indicates a later time. If not specified, current
     * time is taken.
     * </p>
     * 
     * @param laterTime
     *        The time stamp that indicates a later time. If not specified,
     *        current time is taken.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryRequest withLaterTime(
            java.util.Date laterTime) {
        setLaterTime(laterTime);
        return this;
    }

    /**
     * <p>
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     * </p>
     * 
     * @param earlierTime
     *        The time stamp that indicates an earlier time. If not specified,
     *        the action returns paginated results that contain configuration
     *        items that start from when the first configuration item was
     *        recorded.
     */

    public void setEarlierTime(java.util.Date earlierTime) {
        this.earlierTime = earlierTime;
    }

    /**
     * <p>
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     * </p>
     * 
     * @return The time stamp that indicates an earlier time. If not specified,
     *         the action returns paginated results that contain configuration
     *         items that start from when the first configuration item was
     *         recorded.
     */

    public java.util.Date getEarlierTime() {
        return this.earlierTime;
    }

    /**
     * <p>
     * The time stamp that indicates an earlier time. If not specified, the
     * action returns paginated results that contain configuration items that
     * start from when the first configuration item was recorded.
     * </p>
     * 
     * @param earlierTime
     *        The time stamp that indicates an earlier time. If not specified,
     *        the action returns paginated results that contain configuration
     *        items that start from when the first configuration item was
     *        recorded.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryRequest withEarlierTime(
            java.util.Date earlierTime) {
        setEarlierTime(earlierTime);
        return this;
    }

    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     * 
     * @param chronologicalOrder
     *        The chronological order for configuration items listed. By default
     *        the results are listed in reverse chronological order.
     * @see ChronologicalOrder
     */

    public void setChronologicalOrder(String chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder;
    }

    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     * 
     * @return The chronological order for configuration items listed. By
     *         default the results are listed in reverse chronological order.
     * @see ChronologicalOrder
     */

    public String getChronologicalOrder() {
        return this.chronologicalOrder;
    }

    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     * 
     * @param chronologicalOrder
     *        The chronological order for configuration items listed. By default
     *        the results are listed in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChronologicalOrder
     */

    public GetResourceConfigHistoryRequest withChronologicalOrder(
            String chronologicalOrder) {
        setChronologicalOrder(chronologicalOrder);
        return this;
    }

    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     * 
     * @param chronologicalOrder
     *        The chronological order for configuration items listed. By default
     *        the results are listed in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChronologicalOrder
     */

    public void setChronologicalOrder(ChronologicalOrder chronologicalOrder) {
        this.chronologicalOrder = chronologicalOrder.toString();
    }

    /**
     * <p>
     * The chronological order for configuration items listed. By default the
     * results are listed in reverse chronological order.
     * </p>
     * 
     * @param chronologicalOrder
     *        The chronological order for configuration items listed. By default
     *        the results are listed in reverse chronological order.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChronologicalOrder
     */

    public GetResourceConfigHistoryRequest withChronologicalOrder(
            ChronologicalOrder chronologicalOrder) {
        setChronologicalOrder(chronologicalOrder);
        return this;
    }

    /**
     * <p>
     * The maximum number of configuration items returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of configuration items returned on each page.
     *        The default is 10. You cannot specify a limit greater than 100. If
     *        you specify 0, AWS Config uses the default.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of configuration items returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * </p>
     * 
     * @return The maximum number of configuration items returned on each page.
     *         The default is 10. You cannot specify a limit greater than 100.
     *         If you specify 0, AWS Config uses the default.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of configuration items returned on each page. The
     * default is 10. You cannot specify a limit greater than 100. If you
     * specify 0, AWS Config uses the default.
     * </p>
     * 
     * @param limit
     *        The maximum number of configuration items returned on each page.
     *        The default is 10. You cannot specify a limit greater than 100. If
     *        you specify 0, AWS Config uses the default.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that
     *        you use to get the next page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * </p>
     * 
     * @return The <code>nextToken</code> string returned on a previous page
     *         that you use to get the next page of results in a paginated
     *         response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>nextToken</code> string returned on a previous page that you
     * use to get the next page of results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The <code>nextToken</code> string returned on a previous page that
     *        you use to get the next page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryRequest withNextToken(String nextToken) {
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
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getResourceId() != null)
            sb.append("ResourceId: " + getResourceId() + ",");
        if (getLaterTime() != null)
            sb.append("LaterTime: " + getLaterTime() + ",");
        if (getEarlierTime() != null)
            sb.append("EarlierTime: " + getEarlierTime() + ",");
        if (getChronologicalOrder() != null)
            sb.append("ChronologicalOrder: " + getChronologicalOrder() + ",");
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

        if (obj instanceof GetResourceConfigHistoryRequest == false)
            return false;
        GetResourceConfigHistoryRequest other = (GetResourceConfigHistoryRequest) obj;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null
                && other.getResourceId().equals(this.getResourceId()) == false)
            return false;
        if (other.getLaterTime() == null ^ this.getLaterTime() == null)
            return false;
        if (other.getLaterTime() != null
                && other.getLaterTime().equals(this.getLaterTime()) == false)
            return false;
        if (other.getEarlierTime() == null ^ this.getEarlierTime() == null)
            return false;
        if (other.getEarlierTime() != null
                && other.getEarlierTime().equals(this.getEarlierTime()) == false)
            return false;
        if (other.getChronologicalOrder() == null
                ^ this.getChronologicalOrder() == null)
            return false;
        if (other.getChronologicalOrder() != null
                && other.getChronologicalOrder().equals(
                        this.getChronologicalOrder()) == false)
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

        hashCode = prime
                * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode
                + ((getLaterTime() == null) ? 0 : getLaterTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getEarlierTime() == null) ? 0 : getEarlierTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getChronologicalOrder() == null) ? 0
                        : getChronologicalOrder().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceConfigHistoryRequest clone() {
        return (GetResourceConfigHistoryRequest) super.clone();
    }
}