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
 * 
 */
public class DescribeSnapshotAttributeResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * A list of permissions for creating volumes from the snapshot.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CreateVolumePermission> createVolumePermissions;
    /**
     * <p>
     * A list of product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @return The ID of the EBS snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the EBS snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the EBS snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotAttributeResult withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * A list of permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @return A list of permissions for creating volumes from the snapshot.
     */

    public java.util.List<CreateVolumePermission> getCreateVolumePermissions() {
        if (createVolumePermissions == null) {
            createVolumePermissions = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>();
        }
        return createVolumePermissions;
    }

    /**
     * <p>
     * A list of permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @param createVolumePermissions
     *        A list of permissions for creating volumes from the snapshot.
     */

    public void setCreateVolumePermissions(
            java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        if (createVolumePermissions == null) {
            this.createVolumePermissions = null;
            return;
        }

        this.createVolumePermissions = new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(
                createVolumePermissions);
    }

    /**
     * <p>
     * A list of permissions for creating volumes from the snapshot.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCreateVolumePermissions(java.util.Collection)} or
     * {@link #withCreateVolumePermissions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param createVolumePermissions
     *        A list of permissions for creating volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotAttributeResult withCreateVolumePermissions(
            CreateVolumePermission... createVolumePermissions) {
        if (this.createVolumePermissions == null) {
            setCreateVolumePermissions(new com.amazonaws.internal.SdkInternalList<CreateVolumePermission>(
                    createVolumePermissions.length));
        }
        for (CreateVolumePermission ele : createVolumePermissions) {
            this.createVolumePermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of permissions for creating volumes from the snapshot.
     * </p>
     * 
     * @param createVolumePermissions
     *        A list of permissions for creating volumes from the snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotAttributeResult withCreateVolumePermissions(
            java.util.Collection<CreateVolumePermission> createVolumePermissions) {
        setCreateVolumePermissions(createVolumePermissions);
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @return A list of product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>(
                productCodes);
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setProductCodes(java.util.Collection)} or
     * {@link #withProductCodes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotAttributeResult withProductCodes(
            ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<ProductCode>(
                    productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of product codes.
     * </p>
     * 
     * @param productCodes
     *        A list of product codes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeSnapshotAttributeResult withProductCodes(
            java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: " + getSnapshotId() + ",");
        if (getCreateVolumePermissions() != null)
            sb.append("CreateVolumePermissions: "
                    + getCreateVolumePermissions() + ",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: " + getProductCodes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeSnapshotAttributeResult == false)
            return false;
        DescribeSnapshotAttributeResult other = (DescribeSnapshotAttributeResult) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null
                && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getCreateVolumePermissions() == null
                ^ this.getCreateVolumePermissions() == null)
            return false;
        if (other.getCreateVolumePermissions() != null
                && other.getCreateVolumePermissions().equals(
                        this.getCreateVolumePermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null
                && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreateVolumePermissions() == null) ? 0
                        : getCreateVolumePermissions().hashCode());
        hashCode = prime
                * hashCode
                + ((getProductCodes() == null) ? 0 : getProductCodes()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeSnapshotAttributeResult clone() {
        try {
            return (DescribeSnapshotAttributeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}