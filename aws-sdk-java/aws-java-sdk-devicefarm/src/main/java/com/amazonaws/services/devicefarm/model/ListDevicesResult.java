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

package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the result of a list devices operation.
 * </p>
 */
public class ListDevicesResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the devices.
     * </p>
     */
    private java.util.List<Device> devices;
    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Information about the devices.
     * </p>
     * 
     * @return Information about the devices.
     */

    public java.util.List<Device> getDevices() {
        return devices;
    }

    /**
     * <p>
     * Information about the devices.
     * </p>
     * 
     * @param devices
     *        Information about the devices.
     */

    public void setDevices(java.util.Collection<Device> devices) {
        if (devices == null) {
            this.devices = null;
            return;
        }

        this.devices = new java.util.ArrayList<Device>(devices);
    }

    /**
     * <p>
     * Information about the devices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDevices(java.util.Collection)} or
     * {@link #withDevices(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param devices
     *        Information about the devices.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDevicesResult withDevices(Device... devices) {
        if (this.devices == null) {
            setDevices(new java.util.ArrayList<Device>(devices.length));
        }
        for (Device ele : devices) {
            this.devices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the devices.
     * </p>
     * 
     * @param devices
     *        Information about the devices.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDevicesResult withDevices(java.util.Collection<Device> devices) {
        setDevices(devices);
        return this;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large,
     *        this is an identifier that is also returned, which can be used in
     *        a subsequent call to this operation to return the next set of
     *        items in the list.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @return If the number of items that are returned is significantly large,
     *         this is an identifier that is also returned, which can be used in
     *         a subsequent call to this operation to return the next set of
     *         items in the list.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the number of items that are returned is significantly large, this is
     * an identifier that is also returned, which can be used in a subsequent
     * call to this operation to return the next set of items in the list.
     * </p>
     * 
     * @param nextToken
     *        If the number of items that are returned is significantly large,
     *        this is an identifier that is also returned, which can be used in
     *        a subsequent call to this operation to return the next set of
     *        items in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDevicesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDevices() != null)
            sb.append("Devices: " + getDevices() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDevicesResult == false)
            return false;
        ListDevicesResult other = (ListDevicesResult) obj;
        if (other.getDevices() == null ^ this.getDevices() == null)
            return false;
        if (other.getDevices() != null
                && other.getDevices().equals(this.getDevices()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDevices() == null) ? 0 : getDevices().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDevicesResult clone() {
        try {
            return (ListDevicesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
