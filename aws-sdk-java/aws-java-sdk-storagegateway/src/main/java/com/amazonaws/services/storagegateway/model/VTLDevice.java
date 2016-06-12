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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a device object associated with a gateway-VTL.
 * </p>
 */
public class VTLDevice implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     */
    private String vTLDeviceARN;

    private String vTLDeviceType;

    private String vTLDeviceVendor;

    private String vTLDeviceProductIdentifier;
    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     */
    private DeviceiSCSIAttributes deviceiSCSIAttributes;

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * 
     * @param vTLDeviceARN
     *        Specifies the unique Amazon Resource Name (ARN) of the device
     *        (tape drive or media changer).
     */

    public void setVTLDeviceARN(String vTLDeviceARN) {
        this.vTLDeviceARN = vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * 
     * @return Specifies the unique Amazon Resource Name (ARN) of the device
     *         (tape drive or media changer).
     */

    public String getVTLDeviceARN() {
        return this.vTLDeviceARN;
    }

    /**
     * <p>
     * Specifies the unique Amazon Resource Name (ARN) of the device (tape drive
     * or media changer).
     * </p>
     * 
     * @param vTLDeviceARN
     *        Specifies the unique Amazon Resource Name (ARN) of the device
     *        (tape drive or media changer).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VTLDevice withVTLDeviceARN(String vTLDeviceARN) {
        setVTLDeviceARN(vTLDeviceARN);
        return this;
    }

    /**
     * @param vTLDeviceType
     */

    public void setVTLDeviceType(String vTLDeviceType) {
        this.vTLDeviceType = vTLDeviceType;
    }

    /**
     * @return
     */

    public String getVTLDeviceType() {
        return this.vTLDeviceType;
    }

    /**
     * @param vTLDeviceType
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VTLDevice withVTLDeviceType(String vTLDeviceType) {
        setVTLDeviceType(vTLDeviceType);
        return this;
    }

    /**
     * @param vTLDeviceVendor
     */

    public void setVTLDeviceVendor(String vTLDeviceVendor) {
        this.vTLDeviceVendor = vTLDeviceVendor;
    }

    /**
     * @return
     */

    public String getVTLDeviceVendor() {
        return this.vTLDeviceVendor;
    }

    /**
     * @param vTLDeviceVendor
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VTLDevice withVTLDeviceVendor(String vTLDeviceVendor) {
        setVTLDeviceVendor(vTLDeviceVendor);
        return this;
    }

    /**
     * @param vTLDeviceProductIdentifier
     */

    public void setVTLDeviceProductIdentifier(String vTLDeviceProductIdentifier) {
        this.vTLDeviceProductIdentifier = vTLDeviceProductIdentifier;
    }

    /**
     * @return
     */

    public String getVTLDeviceProductIdentifier() {
        return this.vTLDeviceProductIdentifier;
    }

    /**
     * @param vTLDeviceProductIdentifier
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VTLDevice withVTLDeviceProductIdentifier(
            String vTLDeviceProductIdentifier) {
        setVTLDeviceProductIdentifier(vTLDeviceProductIdentifier);
        return this;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @param deviceiSCSIAttributes
     *        A list of iSCSI information about a VTL device.
     */

    public void setDeviceiSCSIAttributes(
            DeviceiSCSIAttributes deviceiSCSIAttributes) {
        this.deviceiSCSIAttributes = deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @return A list of iSCSI information about a VTL device.
     */

    public DeviceiSCSIAttributes getDeviceiSCSIAttributes() {
        return this.deviceiSCSIAttributes;
    }

    /**
     * <p>
     * A list of iSCSI information about a VTL device.
     * </p>
     * 
     * @param deviceiSCSIAttributes
     *        A list of iSCSI information about a VTL device.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VTLDevice withDeviceiSCSIAttributes(
            DeviceiSCSIAttributes deviceiSCSIAttributes) {
        setDeviceiSCSIAttributes(deviceiSCSIAttributes);
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
        if (getVTLDeviceARN() != null)
            sb.append("VTLDeviceARN: " + getVTLDeviceARN() + ",");
        if (getVTLDeviceType() != null)
            sb.append("VTLDeviceType: " + getVTLDeviceType() + ",");
        if (getVTLDeviceVendor() != null)
            sb.append("VTLDeviceVendor: " + getVTLDeviceVendor() + ",");
        if (getVTLDeviceProductIdentifier() != null)
            sb.append("VTLDeviceProductIdentifier: "
                    + getVTLDeviceProductIdentifier() + ",");
        if (getDeviceiSCSIAttributes() != null)
            sb.append("DeviceiSCSIAttributes: " + getDeviceiSCSIAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VTLDevice == false)
            return false;
        VTLDevice other = (VTLDevice) obj;
        if (other.getVTLDeviceARN() == null ^ this.getVTLDeviceARN() == null)
            return false;
        if (other.getVTLDeviceARN() != null
                && other.getVTLDeviceARN().equals(this.getVTLDeviceARN()) == false)
            return false;
        if (other.getVTLDeviceType() == null ^ this.getVTLDeviceType() == null)
            return false;
        if (other.getVTLDeviceType() != null
                && other.getVTLDeviceType().equals(this.getVTLDeviceType()) == false)
            return false;
        if (other.getVTLDeviceVendor() == null
                ^ this.getVTLDeviceVendor() == null)
            return false;
        if (other.getVTLDeviceVendor() != null
                && other.getVTLDeviceVendor().equals(this.getVTLDeviceVendor()) == false)
            return false;
        if (other.getVTLDeviceProductIdentifier() == null
                ^ this.getVTLDeviceProductIdentifier() == null)
            return false;
        if (other.getVTLDeviceProductIdentifier() != null
                && other.getVTLDeviceProductIdentifier().equals(
                        this.getVTLDeviceProductIdentifier()) == false)
            return false;
        if (other.getDeviceiSCSIAttributes() == null
                ^ this.getDeviceiSCSIAttributes() == null)
            return false;
        if (other.getDeviceiSCSIAttributes() != null
                && other.getDeviceiSCSIAttributes().equals(
                        this.getDeviceiSCSIAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getVTLDeviceARN() == null) ? 0 : getVTLDeviceARN()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVTLDeviceType() == null) ? 0 : getVTLDeviceType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVTLDeviceVendor() == null) ? 0 : getVTLDeviceVendor()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVTLDeviceProductIdentifier() == null) ? 0
                        : getVTLDeviceProductIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeviceiSCSIAttributes() == null) ? 0
                        : getDeviceiSCSIAttributes().hashCode());
        return hashCode;
    }

    @Override
    public VTLDevice clone() {
        try {
            return (VTLDevice) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
