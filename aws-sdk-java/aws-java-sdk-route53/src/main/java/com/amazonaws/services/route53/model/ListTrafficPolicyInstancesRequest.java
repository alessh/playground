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
 * A complex type that contains the information about the request to list your
 * traffic policy instances.
 * </p>
 */
public class ListTrafficPolicyInstancesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, you have more traffic policy instances. To get the
     * next group of <code>MaxItems</code> traffic policy instances, submit
     * another <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is the
     * hosted zone ID of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     */
    private String hostedZoneIdMarker;
    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the
     * name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     */
    private String trafficPolicyInstanceNameMarker;
    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     */
    private String trafficPolicyInstanceTypeMarker;
    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, you have more traffic policy instances. To get the
     * next group of <code>MaxItems</code> traffic policy instances, submit
     * another <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is the
     * hosted zone ID of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param hostedZoneIdMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>, you have more traffic policy instances. To
     *        get the next group of <code>MaxItems</code> traffic policy
     *        instances, submit another <code>ListTrafficPolicyInstances</code>
     *        request. For the value of <code>HostedZoneIdMarker</code>, specify
     *        the value of <code>HostedZoneIdMarker</code> from the previous
     *        response, which is the hosted zone ID of the first traffic policy
     *        instance in the next group of <code>MaxItems</code> traffic policy
     *        instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     */

    public void setHostedZoneIdMarker(String hostedZoneIdMarker) {
        this.hostedZoneIdMarker = hostedZoneIdMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, you have more traffic policy instances. To get the
     * next group of <code>MaxItems</code> traffic policy instances, submit
     * another <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is the
     * hosted zone ID of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @return For the first request to <code>ListTrafficPolicyInstances</code>,
     *         omit this value.</p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, you have more traffic policy instances. To
     *         get the next group of <code>MaxItems</code> traffic policy
     *         instances, submit another <code>ListTrafficPolicyInstances</code>
     *         request. For the value of <code>HostedZoneIdMarker</code>,
     *         specify the value of <code>HostedZoneIdMarker</code> from the
     *         previous response, which is the hosted zone ID of the first
     *         traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>false</code>, there are no more traffic policy
     *         instances to get.
     */

    public String getHostedZoneIdMarker() {
        return this.hostedZoneIdMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, you have more traffic policy instances. To get the
     * next group of <code>MaxItems</code> traffic policy instances, submit
     * another <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is the
     * hosted zone ID of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param hostedZoneIdMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>, you have more traffic policy instances. To
     *        get the next group of <code>MaxItems</code> traffic policy
     *        instances, submit another <code>ListTrafficPolicyInstances</code>
     *        request. For the value of <code>HostedZoneIdMarker</code>, specify
     *        the value of <code>HostedZoneIdMarker</code> from the previous
     *        response, which is the hosted zone ID of the first traffic policy
     *        instance in the next group of <code>MaxItems</code> traffic policy
     *        instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTrafficPolicyInstancesRequest withHostedZoneIdMarker(
            String hostedZoneIdMarker) {
        setHostedZoneIdMarker(hostedZoneIdMarker);
        return this;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the
     * name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceNameMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     *        first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     */

    public void setTrafficPolicyInstanceNameMarker(
            String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the
     * name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @return For the first request to <code>ListTrafficPolicyInstances</code>,
     *         omit this value.</p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>false</code>, there are no more traffic policy
     *         instances to get.
     */

    public String getTrafficPolicyInstanceNameMarker() {
        return this.trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the
     * name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceNameMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     *        first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceNameMarker(
            String trafficPolicyInstanceNameMarker) {
        setTrafficPolicyInstanceNameMarker(trafficPolicyInstanceNameMarker);
        return this;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *        the first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @see RRType
     */

    public void setTrafficPolicyInstanceTypeMarker(
            String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @return For the first request to <code>ListTrafficPolicyInstances</code>,
     *         omit this value.</p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *         the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response
     *         was <code>false</code>, there are no more traffic policy
     *         instances to get.
     * @see RRType
     */

    public String getTrafficPolicyInstanceTypeMarker() {
        return this.trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *        the first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceTypeMarker(
            String trafficPolicyInstanceTypeMarker) {
        setTrafficPolicyInstanceTypeMarker(trafficPolicyInstanceTypeMarker);
        return this;
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *        the first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public void setTrafficPolicyInstanceTypeMarker(
            RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker
                .toString();
    }

    /**
     * <p>
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is the
     * DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        For the first request to <code>ListTrafficPolicyInstances</code>,
     *        omit this value.</p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>true</code>,
     *        <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *        the first traffic policy instance in the next group of
     *        <code>MaxItems</code> traffic policy instances.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response
     *        was <code>false</code>, there are no more traffic policy instances
     *        to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceTypeMarker(
            RRType trafficPolicyInstanceTypeMarker) {
        setTrafficPolicyInstanceTypeMarker(trafficPolicyInstanceTypeMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policy instances to be included in
     *        the response body for this request. If you have more than
     *        <code>MaxItems</code> traffic policy instances, the value of the
     *        <code>IsTruncated</code> element in the response is
     *        <code>true</code>, and the values of
     *        <code>HostedZoneIdMarker</code>,
     *        <code>TrafficPolicyInstanceNameMarker</code>, and
     *        <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *        traffic policy instance in the next group of <code>MaxItems</code>
     *        traffic policy instances.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * </p>
     * 
     * @return The maximum number of traffic policy instances to be included in
     *         the response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policy instances, the value of the
     *         <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the values of
     *         <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *         traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first traffic
     * policy instance in the next group of <code>MaxItems</code> traffic policy
     * instances.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policy instances to be included in
     *        the response body for this request. If you have more than
     *        <code>MaxItems</code> traffic policy instances, the value of the
     *        <code>IsTruncated</code> element in the response is
     *        <code>true</code>, and the values of
     *        <code>HostedZoneIdMarker</code>,
     *        <code>TrafficPolicyInstanceNameMarker</code>, and
     *        <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *        traffic policy instance in the next group of <code>MaxItems</code>
     *        traffic policy instances.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListTrafficPolicyInstancesRequest withMaxItems(String maxItems) {
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
        if (getHostedZoneIdMarker() != null)
            sb.append("HostedZoneIdMarker: " + getHostedZoneIdMarker() + ",");
        if (getTrafficPolicyInstanceNameMarker() != null)
            sb.append("TrafficPolicyInstanceNameMarker: "
                    + getTrafficPolicyInstanceNameMarker() + ",");
        if (getTrafficPolicyInstanceTypeMarker() != null)
            sb.append("TrafficPolicyInstanceTypeMarker: "
                    + getTrafficPolicyInstanceTypeMarker() + ",");
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

        if (obj instanceof ListTrafficPolicyInstancesRequest == false)
            return false;
        ListTrafficPolicyInstancesRequest other = (ListTrafficPolicyInstancesRequest) obj;
        if (other.getHostedZoneIdMarker() == null
                ^ this.getHostedZoneIdMarker() == null)
            return false;
        if (other.getHostedZoneIdMarker() != null
                && other.getHostedZoneIdMarker().equals(
                        this.getHostedZoneIdMarker()) == false)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() == null
                ^ this.getTrafficPolicyInstanceNameMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null
                && other.getTrafficPolicyInstanceNameMarker().equals(
                        this.getTrafficPolicyInstanceNameMarker()) == false)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() == null
                ^ this.getTrafficPolicyInstanceTypeMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null
                && other.getTrafficPolicyInstanceTypeMarker().equals(
                        this.getTrafficPolicyInstanceTypeMarker()) == false)
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
                + ((getHostedZoneIdMarker() == null) ? 0
                        : getHostedZoneIdMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceNameMarker() == null) ? 0
                        : getTrafficPolicyInstanceNameMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0
                        : getTrafficPolicyInstanceTypeMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPolicyInstancesRequest clone() {
        return (ListTrafficPolicyInstancesRequest) super.clone();
    }
}