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
public class SetLoadBalancerPoliciesForBackendServerRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer.
     * </p>
     */
    private String loadBalancerName;
    /**
     * <p>
     * The port number associated with the back-end server.
     * </p>
     */
    private Integer instancePort;
    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the back-end server.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> policyNames;

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

    public SetLoadBalancerPoliciesForBackendServerRequest withLoadBalancerName(
            String loadBalancerName) {
        setLoadBalancerName(loadBalancerName);
        return this;
    }

    /**
     * <p>
     * The port number associated with the back-end server.
     * </p>
     * 
     * @param instancePort
     *        The port number associated with the back-end server.
     */

    public void setInstancePort(Integer instancePort) {
        this.instancePort = instancePort;
    }

    /**
     * <p>
     * The port number associated with the back-end server.
     * </p>
     * 
     * @return The port number associated with the back-end server.
     */

    public Integer getInstancePort() {
        return this.instancePort;
    }

    /**
     * <p>
     * The port number associated with the back-end server.
     * </p>
     * 
     * @param instancePort
     *        The port number associated with the back-end server.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetLoadBalancerPoliciesForBackendServerRequest withInstancePort(
            Integer instancePort) {
        setInstancePort(instancePort);
        return this;
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the back-end server.
     * </p>
     * 
     * @return The names of the policies. If the list is empty, then all current
     *         polices are removed from the back-end server.
     */

    public java.util.List<String> getPolicyNames() {
        if (policyNames == null) {
            policyNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return policyNames;
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the back-end server.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. If the list is empty, then all current
     *        polices are removed from the back-end server.
     */

    public void setPolicyNames(java.util.Collection<String> policyNames) {
        if (policyNames == null) {
            this.policyNames = null;
            return;
        }

        this.policyNames = new com.amazonaws.internal.SdkInternalList<String>(
                policyNames);
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the back-end server.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPolicyNames(java.util.Collection)} or
     * {@link #withPolicyNames(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. If the list is empty, then all current
     *        polices are removed from the back-end server.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(
            String... policyNames) {
        if (this.policyNames == null) {
            setPolicyNames(new com.amazonaws.internal.SdkInternalList<String>(
                    policyNames.length));
        }
        for (String ele : policyNames) {
            this.policyNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The names of the policies. If the list is empty, then all current polices
     * are removed from the back-end server.
     * </p>
     * 
     * @param policyNames
     *        The names of the policies. If the list is empty, then all current
     *        polices are removed from the back-end server.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetLoadBalancerPoliciesForBackendServerRequest withPolicyNames(
            java.util.Collection<String> policyNames) {
        setPolicyNames(policyNames);
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
        if (getInstancePort() != null)
            sb.append("InstancePort: " + getInstancePort() + ",");
        if (getPolicyNames() != null)
            sb.append("PolicyNames: " + getPolicyNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetLoadBalancerPoliciesForBackendServerRequest == false)
            return false;
        SetLoadBalancerPoliciesForBackendServerRequest other = (SetLoadBalancerPoliciesForBackendServerRequest) obj;
        if (other.getLoadBalancerName() == null
                ^ this.getLoadBalancerName() == null)
            return false;
        if (other.getLoadBalancerName() != null
                && other.getLoadBalancerName().equals(
                        this.getLoadBalancerName()) == false)
            return false;
        if (other.getInstancePort() == null ^ this.getInstancePort() == null)
            return false;
        if (other.getInstancePort() != null
                && other.getInstancePort().equals(this.getInstancePort()) == false)
            return false;
        if (other.getPolicyNames() == null ^ this.getPolicyNames() == null)
            return false;
        if (other.getPolicyNames() != null
                && other.getPolicyNames().equals(this.getPolicyNames()) == false)
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
                + ((getInstancePort() == null) ? 0 : getInstancePort()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getPolicyNames() == null) ? 0 : getPolicyNames().hashCode());
        return hashCode;
    }

    @Override
    public SetLoadBalancerPoliciesForBackendServerRequest clone() {
        return (SetLoadBalancerPoliciesForBackendServerRequest) super.clone();
    }
}