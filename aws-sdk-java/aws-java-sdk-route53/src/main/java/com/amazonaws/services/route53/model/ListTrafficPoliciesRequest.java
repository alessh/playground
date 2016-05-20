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

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains the information about the request to list the
 * traffic policies that are associated with the current AWS account.
 * </p>
 */
public class ListTrafficPoliciesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response.
     * </p>
     * <p>
     * Policies are listed in the order in which they were created.
     * </p>
     */
    private String trafficPolicyIdMarker;
    /**
     * <p>
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response.
     * </p>
     * <p>
     * Policies are listed in the order in which they were created.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        For your first request to <code>ListTrafficPolicies</code>, do not
     *        include the <code>TrafficPolicyIdMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policies than the value of
     *        <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns
     *        only the first <code>MaxItems</code> traffic policies. To get the
     *        next group of <code>MaxItems</code> policies, submit another
     *        request to <code>ListTrafficPolicies</code>. For the value of
     *        <code>TrafficPolicyIdMarker</code>, specify the value of the
     *        <code>TrafficPolicyIdMarker</code> element that was returned in
     *        the previous response.
     *        </p>
     *        <p>
     *        Policies are listed in the order in which they were created.
     */

    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response.
     * </p>
     * <p>
     * Policies are listed in the order in which they were created.
     * </p>
     * 
     * @return For your first request to <code>ListTrafficPolicies</code>, do
     *         not include the <code>TrafficPolicyIdMarker</code> parameter.</p>
     *         <p>
     *         If you have more traffic policies than the value of
     *         <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns
     *         only the first <code>MaxItems</code> traffic policies. To get the
     *         next group of <code>MaxItems</code> policies, submit another
     *         request to <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of the
     *         <code>TrafficPolicyIdMarker</code> element that was returned in
     *         the previous response.
     *         </p>
     *         <p>
     *         Policies are listed in the order in which they were created.
     */

    public String getTrafficPolicyIdMarker() {
        return this.trafficPolicyIdMarker;
    }

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response.
     * </p>
     * <p>
     * Policies are listed in the order in which they were created.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        For your first request to <code>ListTrafficPolicies</code>, do not
     *        include the <code>TrafficPolicyIdMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policies than the value of
     *        <code>MaxItems</code>, <code>ListTrafficPolicies</code> returns
     *        only the first <code>MaxItems</code> traffic policies. To get the
     *        next group of <code>MaxItems</code> policies, submit another
     *        request to <code>ListTrafficPolicies</code>. For the value of
     *        <code>TrafficPolicyIdMarker</code>, specify the value of the
     *        <code>TrafficPolicyIdMarker</code> element that was returned in
     *        the previous response.
     *        </p>
     *        <p>
     *        Policies are listed in the order in which they were created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTrafficPoliciesRequest withTrafficPolicyIdMarker(
            String trafficPolicyIdMarker) {
        setTrafficPolicyIdMarker(trafficPolicyIdMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policies to be included in the
     *        response body for this request. If you have more than
     *        <code>MaxItems</code> traffic policies, the value of the
     *        <code>IsTruncated</code> element in the response is
     *        <code>true</code>, and the value of the
     *        <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *        traffic policy in the next group of <code>MaxItems</code> traffic
     *        policies.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @return The maximum number of traffic policies to be included in the
     *         response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policies, the value of the
     *         <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the value of the
     *         <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *         traffic policy in the next group of <code>MaxItems</code> traffic
     *         policies.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first traffic
     * policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policies to be included in the
     *        response body for this request. If you have more than
     *        <code>MaxItems</code> traffic policies, the value of the
     *        <code>IsTruncated</code> element in the response is
     *        <code>true</code>, and the value of the
     *        <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *        traffic policy in the next group of <code>MaxItems</code> traffic
     *        policies.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTrafficPoliciesRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getTrafficPolicyIdMarker() != null)
            sb.append("TrafficPolicyIdMarker: " + getTrafficPolicyIdMarker()
                    + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPoliciesRequest == false)
            return false;
        ListTrafficPoliciesRequest other = (ListTrafficPoliciesRequest) obj;
        if (other.getTrafficPolicyIdMarker() == null
                ^ this.getTrafficPolicyIdMarker() == null)
            return false;
        if (other.getTrafficPolicyIdMarker() != null
                && other.getTrafficPolicyIdMarker().equals(
                        this.getTrafficPolicyIdMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficPolicyIdMarker() == null) ? 0
                        : getTrafficPolicyIdMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPoliciesRequest clone() {
        return (ListTrafficPoliciesRequest) super.clone();
    }
}