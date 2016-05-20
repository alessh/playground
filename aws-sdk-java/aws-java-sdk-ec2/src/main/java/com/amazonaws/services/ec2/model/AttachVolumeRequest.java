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
import com.amazonaws.services.ec2.model.transform.AttachVolumeRequestMarshaller;

/**
 * 
 */
public class AttachVolumeRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<AttachVolumeRequest> {

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     */
    private String device;

    /**
     * Default constructor for AttachVolumeRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public AttachVolumeRequest() {
    }

    /**
     * Constructs a new AttachVolumeRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param volumeId
     *        The ID of the EBS volume. The volume and instance must be within
     *        the same Availability Zone.
     * @param instanceId
     *        The ID of the instance.
     * @param device
     *        The device name to expose to the instance (for example,
     *        <code>/dev/sdh</code> or <code>xvdh</code>).
     */
    public AttachVolumeRequest(String volumeId, String instanceId, String device) {
        setVolumeId(volumeId);
        setInstanceId(instanceId);
        setDevice(device);
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     * 
     * @param volumeId
     *        The ID of the EBS volume. The volume and instance must be within
     *        the same Availability Zone.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     * 
     * @return The ID of the EBS volume. The volume and instance must be within
     *         the same Availability Zone.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the EBS volume. The volume and instance must be within the same
     * Availability Zone.
     * </p>
     * 
     * @param volumeId
     *        The ID of the EBS volume. The volume and instance must be within
     *        the same Availability Zone.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AttachVolumeRequest withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
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

    public AttachVolumeRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param device
     *        The device name to expose to the instance (for example,
     *        <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @return The device name to expose to the instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name to expose to the instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param device
     *        The device name to expose to the instance (for example,
     *        <code>/dev/sdh</code> or <code>xvdh</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AttachVolumeRequest withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<AttachVolumeRequest> getDryRunRequest() {
        Request<AttachVolumeRequest> request = new AttachVolumeRequestMarshaller()
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
        if (getVolumeId() != null)
            sb.append("VolumeId: " + getVolumeId() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getDevice() != null)
            sb.append("Device: " + getDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachVolumeRequest == false)
            return false;
        AttachVolumeRequest other = (AttachVolumeRequest) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null
                && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getDevice() == null ^ this.getDevice() == null)
            return false;
        if (other.getDevice() != null
                && other.getDevice().equals(this.getDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getDevice() == null) ? 0 : getDevice().hashCode());
        return hashCode;
    }

    @Override
    public AttachVolumeRequest clone() {
        return (AttachVolumeRequest) super.clone();
    }
}