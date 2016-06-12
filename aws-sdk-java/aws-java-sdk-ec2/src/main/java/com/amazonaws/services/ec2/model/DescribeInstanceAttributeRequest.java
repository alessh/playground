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
import com.amazonaws.services.ec2.model.transform.DescribeInstanceAttributeRequestMarshaller;

/**
 * 
 */
public class DescribeInstanceAttributeRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<DescribeInstanceAttributeRequest> {

    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance attribute.
     * </p>
     */
    private String attribute;

    /**
     * Default constructor for DescribeInstanceAttributeRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public DescribeInstanceAttributeRequest() {
    }

    /**
     * Constructs a new DescribeInstanceAttributeRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The instance attribute.
     */
    public DescribeInstanceAttributeRequest(String instanceId, String attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute);
    }

    /**
     * Constructs a new DescribeInstanceAttributeRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param instanceId
     *        The ID of the instance.
     * @param attribute
     *        The instance attribute.
     */
    public DescribeInstanceAttributeRequest(String instanceId,
            InstanceAttributeName attribute) {
        setInstanceId(instanceId);
        setAttribute(attribute.toString());
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeInstanceAttributeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @see InstanceAttributeName
     */

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @return The instance attribute.
     * @see InstanceAttributeName
     */

    public String getAttribute() {
        return this.attribute;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public DescribeInstanceAttributeRequest withAttribute(String attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public void setAttribute(InstanceAttributeName attribute) {
        this.attribute = attribute.toString();
    }

    /**
     * <p>
     * The instance attribute.
     * </p>
     * 
     * @param attribute
     *        The instance attribute.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceAttributeName
     */

    public DescribeInstanceAttributeRequest withAttribute(
            InstanceAttributeName attribute) {
        setAttribute(attribute);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeInstanceAttributeRequest> getDryRunRequest() {
        Request<DescribeInstanceAttributeRequest> request = new DescribeInstanceAttributeRequestMarshaller()
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getAttribute() != null)
            sb.append("Attribute: " + getAttribute());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInstanceAttributeRequest == false)
            return false;
        DescribeInstanceAttributeRequest other = (DescribeInstanceAttributeRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getAttribute() == null ^ this.getAttribute() == null)
            return false;
        if (other.getAttribute() != null
                && other.getAttribute().equals(this.getAttribute()) == false)
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
                + ((getAttribute() == null) ? 0 : getAttribute().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInstanceAttributeRequest clone() {
        return (DescribeInstanceAttributeRequest) super.clone();
    }
}