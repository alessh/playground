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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeElasticIpsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses associated with the specified instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses that are registered with the specified stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of the
     * specified Elastic IP addresses. Otherwise, it returns a description of
     * every Elastic IP address.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> ips;

    /**
     * <p>
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you include this parameter,
     *        <code>DescribeElasticIps</code> returns a description of the
     *        Elastic IP addresses associated with the specified instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses associated with the specified instance.
     * </p>
     * 
     * @return The instance ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the
     *         Elastic IP addresses associated with the specified instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses associated with the specified instance.
     * </p>
     * 
     * @param instanceId
     *        The instance ID. If you include this parameter,
     *        <code>DescribeElasticIps</code> returns a description of the
     *        Elastic IP addresses associated with the specified instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeElasticIpsRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses that are registered with the specified stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. If you include this parameter,
     *        <code>DescribeElasticIps</code> returns a description of the
     *        Elastic IP addresses that are registered with the specified stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses that are registered with the specified stack.
     * </p>
     * 
     * @return A stack ID. If you include this parameter,
     *         <code>DescribeElasticIps</code> returns a description of the
     *         Elastic IP addresses that are registered with the specified
     *         stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * A stack ID. If you include this parameter,
     * <code>DescribeElasticIps</code> returns a description of the Elastic IP
     * addresses that are registered with the specified stack.
     * </p>
     * 
     * @param stackId
     *        A stack ID. If you include this parameter,
     *        <code>DescribeElasticIps</code> returns a description of the
     *        Elastic IP addresses that are registered with the specified stack.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeElasticIpsRequest withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of the
     * specified Elastic IP addresses. Otherwise, it returns a description of
     * every Elastic IP address.
     * </p>
     * 
     * @return An array of Elastic IP addresses to be described. If you include
     *         this parameter, <code>DescribeElasticIps</code> returns a
     *         description of the specified Elastic IP addresses. Otherwise, it
     *         returns a description of every Elastic IP address.
     */

    public java.util.List<String> getIps() {
        if (ips == null) {
            ips = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return ips;
    }

    /**
     * <p>
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of the
     * specified Elastic IP addresses. Otherwise, it returns a description of
     * every Elastic IP address.
     * </p>
     * 
     * @param ips
     *        An array of Elastic IP addresses to be described. If you include
     *        this parameter, <code>DescribeElasticIps</code> returns a
     *        description of the specified Elastic IP addresses. Otherwise, it
     *        returns a description of every Elastic IP address.
     */

    public void setIps(java.util.Collection<String> ips) {
        if (ips == null) {
            this.ips = null;
            return;
        }

        this.ips = new com.amazonaws.internal.SdkInternalList<String>(ips);
    }

    /**
     * <p>
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of the
     * specified Elastic IP addresses. Otherwise, it returns a description of
     * every Elastic IP address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIps(java.util.Collection)} or
     * {@link #withIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param ips
     *        An array of Elastic IP addresses to be described. If you include
     *        this parameter, <code>DescribeElasticIps</code> returns a
     *        description of the specified Elastic IP addresses. Otherwise, it
     *        returns a description of every Elastic IP address.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeElasticIpsRequest withIps(String... ips) {
        if (this.ips == null) {
            setIps(new com.amazonaws.internal.SdkInternalList<String>(
                    ips.length));
        }
        for (String ele : ips) {
            this.ips.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Elastic IP addresses to be described. If you include this
     * parameter, <code>DescribeElasticIps</code> returns a description of the
     * specified Elastic IP addresses. Otherwise, it returns a description of
     * every Elastic IP address.
     * </p>
     * 
     * @param ips
     *        An array of Elastic IP addresses to be described. If you include
     *        this parameter, <code>DescribeElasticIps</code> returns a
     *        description of the specified Elastic IP addresses. Otherwise, it
     *        returns a description of every Elastic IP address.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeElasticIpsRequest withIps(java.util.Collection<String> ips) {
        setIps(ips);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getIps() != null)
            sb.append("Ips: " + getIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticIpsRequest == false)
            return false;
        DescribeElasticIpsRequest other = (DescribeElasticIpsRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null
                && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getIps() == null ^ this.getIps() == null)
            return false;
        if (other.getIps() != null
                && other.getIps().equals(this.getIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode
                + ((getIps() == null) ? 0 : getIps().hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticIpsRequest clone() {
        return (DescribeElasticIpsRequest) super.clone();
    }
}