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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a block device mapping.
 * </p>
 */
public class BlockDeviceMapping implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     */
    private String virtualName;
    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     */
    private String deviceName;
    /**
     * <p>
     * The information about the Amazon EBS volume.
     * </p>
     */
    private Ebs ebs;
    /**
     * <p>
     * Suppresses a device mapping.
     * </p>
     * <p>
     * If this parameter is true for the root device, the instance might fail
     * the EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.
     * </p>
     */
    private Boolean noDevice;

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example,
     *        <code>ephemeral0</code>).
     */

    public void setVirtualName(String virtualName) {
        this.virtualName = virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * 
     * @return The name of the virtual device (for example,
     *         <code>ephemeral0</code>).
     */

    public String getVirtualName() {
        return this.virtualName;
    }

    /**
     * <p>
     * The name of the virtual device (for example, <code>ephemeral0</code>).
     * </p>
     * 
     * @param virtualName
     *        The name of the virtual device (for example,
     *        <code>ephemeral0</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BlockDeviceMapping withVirtualName(String virtualName) {
        setVirtualName(virtualName);
        return this;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param deviceName
     *        The device name exposed to the EC2 instance (for example,
     *        <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @return The device name exposed to the EC2 instance (for example,
     *         <code>/dev/sdh</code> or <code>xvdh</code>).
     */

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * <p>
     * The device name exposed to the EC2 instance (for example,
     * <code>/dev/sdh</code> or <code>xvdh</code>).
     * </p>
     * 
     * @param deviceName
     *        The device name exposed to the EC2 instance (for example,
     *        <code>/dev/sdh</code> or <code>xvdh</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BlockDeviceMapping withDeviceName(String deviceName) {
        setDeviceName(deviceName);
        return this;
    }

    /**
     * <p>
     * The information about the Amazon EBS volume.
     * </p>
     * 
     * @param ebs
     *        The information about the Amazon EBS volume.
     */

    public void setEbs(Ebs ebs) {
        this.ebs = ebs;
    }

    /**
     * <p>
     * The information about the Amazon EBS volume.
     * </p>
     * 
     * @return The information about the Amazon EBS volume.
     */

    public Ebs getEbs() {
        return this.ebs;
    }

    /**
     * <p>
     * The information about the Amazon EBS volume.
     * </p>
     * 
     * @param ebs
     *        The information about the Amazon EBS volume.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BlockDeviceMapping withEbs(Ebs ebs) {
        setEbs(ebs);
        return this;
    }

    /**
     * <p>
     * Suppresses a device mapping.
     * </p>
     * <p>
     * If this parameter is true for the root device, the instance might fail
     * the EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.
     * </p>
     * 
     * @param noDevice
     *        Suppresses a device mapping.</p>
     *        <p>
     *        If this parameter is true for the root device, the instance might
     *        fail the EC2 health check. Auto Scaling launches a replacement
     *        instance if the instance fails the health check.
     */

    public void setNoDevice(Boolean noDevice) {
        this.noDevice = noDevice;
    }

    /**
     * <p>
     * Suppresses a device mapping.
     * </p>
     * <p>
     * If this parameter is true for the root device, the instance might fail
     * the EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.
     * </p>
     * 
     * @return Suppresses a device mapping.</p>
     *         <p>
     *         If this parameter is true for the root device, the instance might
     *         fail the EC2 health check. Auto Scaling launches a replacement
     *         instance if the instance fails the health check.
     */

    public Boolean getNoDevice() {
        return this.noDevice;
    }

    /**
     * <p>
     * Suppresses a device mapping.
     * </p>
     * <p>
     * If this parameter is true for the root device, the instance might fail
     * the EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.
     * </p>
     * 
     * @param noDevice
     *        Suppresses a device mapping.</p>
     *        <p>
     *        If this parameter is true for the root device, the instance might
     *        fail the EC2 health check. Auto Scaling launches a replacement
     *        instance if the instance fails the health check.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BlockDeviceMapping withNoDevice(Boolean noDevice) {
        setNoDevice(noDevice);
        return this;
    }

    /**
     * <p>
     * Suppresses a device mapping.
     * </p>
     * <p>
     * If this parameter is true for the root device, the instance might fail
     * the EC2 health check. Auto Scaling launches a replacement instance if the
     * instance fails the health check.
     * </p>
     * 
     * @return Suppresses a device mapping.</p>
     *         <p>
     *         If this parameter is true for the root device, the instance might
     *         fail the EC2 health check. Auto Scaling launches a replacement
     *         instance if the instance fails the health check.
     */

    public Boolean isNoDevice() {
        return this.noDevice;
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
        if (getVirtualName() != null)
            sb.append("VirtualName: " + getVirtualName() + ",");
        if (getDeviceName() != null)
            sb.append("DeviceName: " + getDeviceName() + ",");
        if (getEbs() != null)
            sb.append("Ebs: " + getEbs() + ",");
        if (getNoDevice() != null)
            sb.append("NoDevice: " + getNoDevice());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockDeviceMapping == false)
            return false;
        BlockDeviceMapping other = (BlockDeviceMapping) obj;
        if (other.getVirtualName() == null ^ this.getVirtualName() == null)
            return false;
        if (other.getVirtualName() != null
                && other.getVirtualName().equals(this.getVirtualName()) == false)
            return false;
        if (other.getDeviceName() == null ^ this.getDeviceName() == null)
            return false;
        if (other.getDeviceName() != null
                && other.getDeviceName().equals(this.getDeviceName()) == false)
            return false;
        if (other.getEbs() == null ^ this.getEbs() == null)
            return false;
        if (other.getEbs() != null
                && other.getEbs().equals(this.getEbs()) == false)
            return false;
        if (other.getNoDevice() == null ^ this.getNoDevice() == null)
            return false;
        if (other.getNoDevice() != null
                && other.getNoDevice().equals(this.getNoDevice()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVirtualName() == null) ? 0 : getVirtualName().hashCode());
        hashCode = prime * hashCode
                + ((getDeviceName() == null) ? 0 : getDeviceName().hashCode());
        hashCode = prime * hashCode
                + ((getEbs() == null) ? 0 : getEbs().hashCode());
        hashCode = prime * hashCode
                + ((getNoDevice() == null) ? 0 : getNoDevice().hashCode());
        return hashCode;
    }

    @Override
    public BlockDeviceMapping clone() {
        try {
            return (BlockDeviceMapping) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
