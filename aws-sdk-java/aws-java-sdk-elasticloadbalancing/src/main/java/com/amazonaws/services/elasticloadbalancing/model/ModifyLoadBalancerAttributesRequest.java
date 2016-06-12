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

package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ModifyLoadBalancerAttributesRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The attributes of the load balancer.
     * </p>
     */
    private LoadBalancerAttributes loadBalancerAttributes;

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     */

    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @return The name of the load balancer.
     */

    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     * 
     * @param loadBalancerName
     *        The name of the load balancer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyLoadBalancerAttributesRequest withLoadBalancerName(
            String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The attributes of the load balancer.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        The attributes of the load balancer.
     */

    public void setLoadBalancerAttributes(
            LoadBalancerAttributes loadBalancerAttributes) {
        this.loadBalancerAttributes = loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes of the load balancer.
     * </p>
     * 
     * @return The attributes of the load balancer.
     */

    public LoadBalancerAttributes getLoadBalancerAttributes() {
        return this.loadBalancerAttributes;
    }

    /**
     * <p>
     * The attributes of the load balancer.
     * </p>
     * 
     * @param loadBalancerAttributes
     *        The attributes of the load balancer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ModifyLoadBalancerAttributesRequest withLoadBalancerAttributes(
            LoadBalancerAttributes loadBalancerAttributes) {
        setLoadBalancerAttributes(loadBalancerAttributes);
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
        if (getLoadBalancerName() != null)
            sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getLoadBalancerAttributes() != null)
            sb.append("LoadBalancerAttributes: " + getLoadBalancerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyLoadBalancerAttributesRequest == false)
            return false;
        ModifyLoadBalancerAttributesRequest other = (ModifyLoadBalancerAttributesRequest) obj;
        if (other.getLoadBalancerName() == null
                ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(
                        this.getLoadBalancerName()) == false)
            return false;
        if (other.getLoadBalancerAttributes() == null
                ^ this.getLoadBalancerAttributes() == null)
            return false;
        if (other.getLoadBalancerAttributes() != null
                && other.getLoadBalancerAttributes().equals(
                        this.getLoadBalancerAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLoadBalancerAttributes() == null) ? 0
                        : getLoadBalancerAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ModifyLoadBalancerAttributesRequest clone() {
        return (ModifyLoadBalancerAttributesRequest) super.clone();
    }
}