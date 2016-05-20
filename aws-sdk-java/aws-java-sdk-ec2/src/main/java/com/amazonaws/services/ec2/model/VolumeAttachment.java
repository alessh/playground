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

/**
 * <p>
 * Describes volume attachment details.
 * </p>
 */
public class VolumeAttachment implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the volume.
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
     * The device name.
     * </p>
     */
    private String device;
    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     */
    private java.util.Date attachTime;
    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     */
    private Boolean deleteOnTermination;

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @return The ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeAttachment withVolumeId(String volumeId) {
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

    public VolumeAttachment withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     */

    public void setDevice(String device) {
        this.device = device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @return The device name.
     */

    public String getDevice() {
        return this.device;
    }

    /**
     * <p>
     * The device name.
     * </p>
     * 
     * @param device
     *        The device name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeAttachment withDevice(String device) {
        setDevice(device);
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @see VolumeAttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @return The attachment state of the volume.
     * @see VolumeAttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeAttachmentState
     */

    public VolumeAttachment withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeAttachmentState
     */

    public void setState(VolumeAttachmentState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The attachment state of the volume.
     * </p>
     * 
     * @param state
     *        The attachment state of the volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see VolumeAttachmentState
     */

    public VolumeAttachment withState(VolumeAttachmentState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The time stamp when the attachment initiated.
     */

    public void setAttachTime(java.util.Date attachTime) {
        this.attachTime = attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @return The time stamp when the attachment initiated.
     */

    public java.util.Date getAttachTime() {
        return this.attachTime;
    }

    /**
     * <p>
     * The time stamp when the attachment initiated.
     * </p>
     * 
     * @param attachTime
     *        The time stamp when the attachment initiated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeAttachment withAttachTime(java.util.Date attachTime) {
        setAttachTime(attachTime);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance
     *        termination.
     */

    public void setDeleteOnTermination(Boolean deleteOnTermination) {
        this.deleteOnTermination = deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance
     *         termination.
     */

    public Boolean getDeleteOnTermination() {
        return this.deleteOnTermination;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @param deleteOnTermination
     *        Indicates whether the EBS volume is deleted on instance
     *        termination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VolumeAttachment withDeleteOnTermination(Boolean deleteOnTermination) {
        setDeleteOnTermination(deleteOnTermination);
        return this;
    }

    /**
     * <p>
     * Indicates whether the EBS volume is deleted on instance termination.
     * </p>
     * 
     * @return Indicates whether the EBS volume is deleted on instance
     *         termination.
     */

    public Boolean isDeleteOnTermination() {
        return this.deleteOnTermination;
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
            sb.append("Device: " + getDevice() + ",");
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getAttachTime() != null)
            sb.append("AttachTime: " + getAttachTime() + ",");
        if (getDeleteOnTermination() != null)
            sb.append("DeleteOnTermination: " + getDeleteOnTermination());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VolumeAttachment == false)
            return false;
        VolumeAttachment other = (VolumeAttachment) obj;
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
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getAttachTime() == null ^ this.getAttachTime() == null)
            return false;
        if (other.getAttachTime() != null
                && other.getAttachTime().equals(this.getAttachTime()) == false)
            return false;
        if (other.getDeleteOnTermination() == null
                ^ this.getDeleteOnTermination() == null)
            return false;
        if (other.getDeleteOnTermination() != null
                && other.getDeleteOnTermination().equals(
                        this.getDeleteOnTermination()) == false)
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
        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode
                + ((getAttachTime() == null) ? 0 : getAttachTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeleteOnTermination() == null) ? 0
                        : getDeleteOnTermination().hashCode());
        return hashCode;
    }

    @Override
    public VolumeAttachment clone() {
        try {
            return (VolumeAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
