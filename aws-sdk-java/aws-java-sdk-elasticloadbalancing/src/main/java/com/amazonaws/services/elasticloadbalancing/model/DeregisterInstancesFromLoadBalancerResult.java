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
public class DeregisterInstancesFromLoadBalancerResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The remaining instances registered with the load balancer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Instance> instances;

    /**
     * <p>
     * The remaining instances registered with the load balancer.
     * </p>
     * 
     * @return The remaining instances registered with the load balancer.
     */

    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new com.amazonaws.internal.SdkInternalList<Instance>();
        }
        return instances;
    }

    /**
     * <p>
     * The remaining instances registered with the load balancer.
     * </p>
     * 
     * @param instances
     *        The remaining instances registered with the load balancer.
     */

    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        this.instances = new com.amazonaws.internal.SdkInternalList<Instance>(
                instances);
    }

    /**
     * <p>
     * The remaining instances registered with the load balancer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstances(java.util.Collection)} or
     * {@link #withInstances(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param instances
     *        The remaining instances registered with the load balancer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterInstancesFromLoadBalancerResult withInstances(
            Instance... instances) {
        if (this.instances == null) {
            setInstances(new com.amazonaws.internal.SdkInternalList<Instance>(
                    instances.length));
        }
        for (Instance ele : instances) {
            this.instances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The remaining instances registered with the load balancer.
     * </p>
     * 
     * @param instances
     *        The remaining instances registered with the load balancer.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterInstancesFromLoadBalancerResult withInstances(
            java.util.Collection<Instance> instances) {
        setInstances(instances);
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
        if (getInstances() != null)
            sb.append("Instances: " + getInstances());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterInstancesFromLoadBalancerResult == false)
            return false;
        DeregisterInstancesFromLoadBalancerResult other = (DeregisterInstancesFromLoadBalancerResult) obj;
        if (other.getInstances() == null ^ this.getInstances() == null)
            return false;
        if (other.getInstances() != null
                && other.getInstances().equals(this.getInstances()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstances() == null) ? 0 : getInstances().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterInstancesFromLoadBalancerResult clone() {
        try {
            return (DeregisterInstancesFromLoadBalancerResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
