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
 * 
 */
public class ListLocalDisksResult implements Serializable, Cloneable {

    private String gatewayARN;

    private com.amazonaws.internal.SdkInternalList<Disk> disks;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListLocalDisksResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Disk> getDisks() {
        if (disks == null) {
            disks = new com.amazonaws.internal.SdkInternalList<Disk>();
        }
        return disks;
    }

    /**
     * @param disks
     */

    public void setDisks(java.util.Collection<Disk> disks) {
        if (disks == null) {
            this.disks = null;
            return;
        }

        this.disks = new com.amazonaws.internal.SdkInternalList<Disk>(disks);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDisks(java.util.Collection)} or
     * {@link #withDisks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param disks
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListLocalDisksResult withDisks(Disk... disks) {
        if (this.disks == null) {
            setDisks(new com.amazonaws.internal.SdkInternalList<Disk>(
                    disks.length));
        }
        for (Disk ele : disks) {
            this.disks.add(ele);
        }
        return this;
    }

    /**
     * @param disks
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListLocalDisksResult withDisks(java.util.Collection<Disk> disks) {
        setDisks(disks);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDisks() != null)
            sb.append("Disks: " + getDisks());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListLocalDisksResult == false)
            return false;
        ListLocalDisksResult other = (ListLocalDisksResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDisks() == null ^ this.getDisks() == null)
            return false;
        if (other.getDisks() != null
                && other.getDisks().equals(this.getDisks()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getDisks() == null) ? 0 : getDisks().hashCode());
        return hashCode;
    }

    @Override
    public ListLocalDisksResult clone() {
        try {
            return (ListLocalDisksResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
