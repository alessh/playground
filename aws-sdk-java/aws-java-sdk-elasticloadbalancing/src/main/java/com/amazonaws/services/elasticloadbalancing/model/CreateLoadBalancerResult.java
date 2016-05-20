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

/**
 * 
 */
public class CreateLoadBalancerResult implements Serializable, Cloneable {

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     */
    private String dNSName;

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The DNS name of the load balancer.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @return The DNS name of the load balancer.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The DNS name of the load balancer.
     * </p>
     * 
     * @param dNSName
     *        The DNS name of the load balancer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLoadBalancerResult withDNSName(String dNSName) {
        setDNSName(dNSName);
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
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLoadBalancerResult == false)
            return false;
        CreateLoadBalancerResult other = (CreateLoadBalancerResult) obj;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null
                && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        return hashCode;
    }

    @Override
    public CreateLoadBalancerResult clone() {
        try {
            return (CreateLoadBalancerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
