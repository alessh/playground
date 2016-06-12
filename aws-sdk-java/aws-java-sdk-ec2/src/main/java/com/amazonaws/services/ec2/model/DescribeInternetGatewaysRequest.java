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
import com.amazonaws.services.ec2.model.transform.DescribeInternetGatewaysRequestMarshaller;

/**
 * 
 */
public class DescribeInternetGatewaysRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInternetGatewaysRequest> {

    /**
     * <p>
     * One or more Internet gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your Internet gateways.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> internetGatewayIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>available</code>). Present only if
     * a VPC is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>internet-gateway-id</code> - The ID of the Internet gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;

    /**
     * <p>
     * One or more Internet gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your Internet gateways.
     * </p>
     * 
     * @return One or more Internet gateway IDs.</p>
     *         <p>
     *         Default: Describes all your Internet gateways.
     */

    public java.util.List<String> getInternetGatewayIds() {
        if (internetGatewayIds == null) {
            internetGatewayIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return internetGatewayIds;
    }

    /**
     * <p>
     * One or more Internet gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your Internet gateways.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more Internet gateway IDs.</p>
     *        <p>
     *        Default: Describes all your Internet gateways.
     */

    public void setInternetGatewayIds(
            java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
            return;
        }

        this.internetGatewayIds = new com.amazonaws.internal.SdkInternalList<String>(
                internetGatewayIds);
    }

    /**
     * <p>
     * One or more Internet gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your Internet gateways.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInternetGatewayIds(java.util.Collection)} or
     * {@link #withInternetGatewayIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more Internet gateway IDs.</p>
     *        <p>
     *        Default: Describes all your Internet gateways.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withInternetGatewayIds(
            String... internetGatewayIds) {
        if (this.internetGatewayIds == null) {
            setInternetGatewayIds(new com.amazonaws.internal.SdkInternalList<String>(
                    internetGatewayIds.length));
        }
        for (String ele : internetGatewayIds) {
            this.internetGatewayIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Internet gateway IDs.
     * </p>
     * <p>
     * Default: Describes all your Internet gateways.
     * </p>
     * 
     * @param internetGatewayIds
     *        One or more Internet gateway IDs.</p>
     *        <p>
     *        Default: Describes all your Internet gateways.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withInternetGatewayIds(
            java.util.Collection<String> internetGatewayIds) {
        setInternetGatewayIds(internetGatewayIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>available</code>). Present only if
     * a VPC is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>internet-gateway-id</code> - The ID of the Internet gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attachment.state</code> - The current state of the
     *         attachment between the gateway and the VPC (
     *         <code>available</code>). Present only if a VPC is attached.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>internet-gateway-id</code> - The ID of the Internet
     *         gateway.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter.
     *         For example, if you use both the filter "tag-key=Purpose" and the
     *         filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag
     *         value X (regardless of what the tag's key is). If you want to
     *         list only resources where Purpose is X, see the <code>tag</code>
     *         :<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter.
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
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>available</code>). Present only if
     * a VPC is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>internet-gateway-id</code> - The ID of the Internet gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.state</code> - The current state of the
     *        attachment between the gateway and the VPC (<code>available</code>
     *        ). Present only if a VPC is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>internet-gateway-id</code> - The ID of the Internet gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
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
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>available</code>). Present only if
     * a VPC is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>internet-gateway-id</code> - The ID of the Internet gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
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
     *        <code>attachment.state</code> - The current state of the
     *        attachment between the gateway and the VPC (<code>available</code>
     *        ). Present only if a VPC is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>internet-gateway-id</code> - The ID of the Internet gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withFilters(Filter... filters) {
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
     * <code>attachment.state</code> - The current state of the attachment
     * between the gateway and the VPC (<code>available</code>). Present only if
     * a VPC is attached.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.vpc-id</code> - The ID of an attached VPC.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>internet-gateway-id</code> - The ID of the Internet gateway.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.state</code> - The current state of the
     *        attachment between the gateway and the VPC (<code>available</code>
     *        ). Present only if a VPC is attached.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.vpc-id</code> - The ID of an attached VPC.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>internet-gateway-id</code> - The ID of the Internet gateway.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInternetGatewaysRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeInternetGatewaysRequest> getDryRunRequest() {
        Request<DescribeInternetGatewaysRequest> request = new DescribeInternetGatewaysRequestMarshaller()
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
        if (getInternetGatewayIds() != null)
            sb.append("InternetGatewayIds: " + getInternetGatewayIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInternetGatewaysRequest == false)
            return false;
        DescribeInternetGatewaysRequest other = (DescribeInternetGatewaysRequest) obj;
        if (other.getInternetGatewayIds() == null
                ^ this.getInternetGatewayIds() == null)
            return false;
        if (other.getInternetGatewayIds() != null
                && other.getInternetGatewayIds().equals(
                        this.getInternetGatewayIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInternetGatewayIds() == null) ? 0
                        : getInternetGatewayIds().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInternetGatewaysRequest clone() {
        return (DescribeInternetGatewaysRequest) super.clone();
    }
}