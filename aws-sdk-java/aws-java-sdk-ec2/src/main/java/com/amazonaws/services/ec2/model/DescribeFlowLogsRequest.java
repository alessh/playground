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
import com.amazonaws.services.ec2.model.transform.DescribeFlowLogsRequestMarshaller;

/**
 * 
 */
public class DescribeFlowLogsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable,
        DryRunSupportedRequest<DescribeFlowLogsRequest> {

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> flowLogIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>)
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filter;
    /**
     * <p>
     * The token to retrieve the next page of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>NextToken</code> value. This value can be between 5 and
     * 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     * 1000 results are returned. You cannot specify this parameter and the flow
     * log IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @return One or more flow log IDs.
     */

    public java.util.List<String> getFlowLogIds() {
        if (flowLogIds == null) {
            flowLogIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return flowLogIds;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     */

    public void setFlowLogIds(java.util.Collection<String> flowLogIds) {
        if (flowLogIds == null) {
            this.flowLogIds = null;
            return;
        }

        this.flowLogIds = new com.amazonaws.internal.SdkInternalList<String>(
                flowLogIds);
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFlowLogIds(java.util.Collection)} or
     * {@link #withFlowLogIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFlowLogsRequest withFlowLogIds(String... flowLogIds) {
        if (this.flowLogIds == null) {
            setFlowLogIds(new com.amazonaws.internal.SdkInternalList<String>(
                    flowLogIds.length));
        }
        for (String ele : flowLogIds) {
            this.flowLogIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more flow log IDs.
     * </p>
     * 
     * @param flowLogIds
     *        One or more flow log IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFlowLogsRequest withFlowLogIds(
            java.util.Collection<String> flowLogIds) {
        setFlowLogIds(flowLogIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>deliver-log-status</code> - The status of the logs delivery
     *         (<code>SUCCESS</code> | <code>FAILED</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>flow-log-id</code> - The ID of the flow log.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>log-group-name</code> - The name of the log group.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>resource-id</code> - The ID of the VPC, subnet, or network
     *         interface.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>traffic-type</code> - The type of traffic (
     *         <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)
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
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deliver-log-status</code> - The status of the logs delivery
     *        (<code>SUCCESS</code> | <code>FAILED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>flow-log-id</code> - The ID of the flow log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>log-group-name</code> - The name of the log group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the VPC, subnet, or network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-type</code> - The type of traffic (
     *        <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)
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
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>)
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
     *        <code>deliver-log-status</code> - The status of the logs delivery
     *        (<code>SUCCESS</code> | <code>FAILED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>flow-log-id</code> - The ID of the flow log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>log-group-name</code> - The name of the log group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the VPC, subnet, or network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-type</code> - The type of traffic (
     *        <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFlowLogsRequest withFilter(Filter... filter) {
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
     * <code>deliver-log-status</code> - The status of the logs delivery (
     * <code>SUCCESS</code> | <code>FAILED</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>flow-log-id</code> - The ID of the flow log.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>log-group-name</code> - The name of the log group.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>resource-id</code> - The ID of the VPC, subnet, or network
     * interface.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>traffic-type</code> - The type of traffic (<code>ACCEPT</code> |
     * <code>REJECT</code> | <code>ALL</code>)
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>deliver-log-status</code> - The status of the logs delivery
     *        (<code>SUCCESS</code> | <code>FAILED</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>flow-log-id</code> - The ID of the flow log.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>log-group-name</code> - The name of the log group.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>resource-id</code> - The ID of the VPC, subnet, or network
     *        interface.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>traffic-type</code> - The type of traffic (
     *        <code>ACCEPT</code> | <code>REJECT</code> | <code>ALL</code>)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFlowLogsRequest withFilter(
            java.util.Collection<Filter> filter) {
        setFilter(filter);
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

    public DescribeFlowLogsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>NextToken</code> value. This value can be between 5 and
     * 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     * 1000 results are returned. You cannot specify this parameter and the flow
     * log IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a
     *        single page. The remaining results can be seen by sending another
     *        request with the returned <code>NextToken</code> value. This value
     *        can be between 5 and 1000; if <code>MaxResults</code> is given a
     *        value larger than 1000, only 1000 results are returned. You cannot
     *        specify this parameter and the flow log IDs parameter in the same
     *        request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>NextToken</code> value. This value can be between 5 and
     * 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     * 1000 results are returned. You cannot specify this parameter and the flow
     * log IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of results to return for the request in a
     *         single page. The remaining results can be seen by sending another
     *         request with the returned <code>NextToken</code> value. This
     *         value can be between 5 and 1000; if <code>MaxResults</code> is
     *         given a value larger than 1000, only 1000 results are returned.
     *         You cannot specify this parameter and the flow log IDs parameter
     *         in the same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return for the request in a single page.
     * The remaining results can be seen by sending another request with the
     * returned <code>NextToken</code> value. This value can be between 5 and
     * 1000; if <code>MaxResults</code> is given a value larger than 1000, only
     * 1000 results are returned. You cannot specify this parameter and the flow
     * log IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return for the request in a
     *        single page. The remaining results can be seen by sending another
     *        request with the returned <code>NextToken</code> value. This value
     *        can be between 5 and 1000; if <code>MaxResults</code> is given a
     *        value larger than 1000, only 1000 results are returned. You cannot
     *        specify this parameter and the flow log IDs parameter in the same
     *        request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeFlowLogsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeFlowLogsRequest> getDryRunRequest() {
        Request<DescribeFlowLogsRequest> request = new DescribeFlowLogsRequestMarshaller()
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
        if (getFlowLogIds() != null)
            sb.append("FlowLogIds: " + getFlowLogIds() + ",");
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeFlowLogsRequest == false)
            return false;
        DescribeFlowLogsRequest other = (DescribeFlowLogsRequest) obj;
        if (other.getFlowLogIds() == null ^ this.getFlowLogIds() == null)
            return false;
        if (other.getFlowLogIds() != null
                && other.getFlowLogIds().equals(this.getFlowLogIds()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null
                && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFlowLogIds() == null) ? 0 : getFlowLogIds().hashCode());
        hashCode = prime * hashCode
                + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeFlowLogsRequest clone() {
        return (DescribeFlowLogsRequest) super.clone();
    }
}