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
public class DescribeCacheResult implements Serializable, Cloneable {

    private String gatewayARN;

    private com.amazonaws.internal.SdkInternalList<String> diskIds;

    private Long cacheAllocatedInBytes;

    private Double cacheUsedPercentage;

    private Double cacheDirtyPercentage;

    private Double cacheHitPercentage;

    private Double cacheMissPercentage;

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

    public DescribeCacheResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
            diskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return diskIds;
    }

    /**
     * @param diskIds
     */

    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new com.amazonaws.internal.SdkInternalList<String>(
                diskIds);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDiskIds(java.util.Collection)} or
     * {@link #withDiskIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param diskIds
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withDiskIds(String... diskIds) {
        if (this.diskIds == null) {
            setDiskIds(new com.amazonaws.internal.SdkInternalList<String>(
                    diskIds.length));
        }
        for (String ele : diskIds) {
            this.diskIds.add(ele);
        }
        return this;
    }

    /**
     * @param diskIds
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * @param cacheAllocatedInBytes
     */

    public void setCacheAllocatedInBytes(Long cacheAllocatedInBytes) {
        this.cacheAllocatedInBytes = cacheAllocatedInBytes;
    }

    /**
     * @return
     */

    public Long getCacheAllocatedInBytes() {
        return this.cacheAllocatedInBytes;
    }

    /**
     * @param cacheAllocatedInBytes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withCacheAllocatedInBytes(
            Long cacheAllocatedInBytes) {
        setCacheAllocatedInBytes(cacheAllocatedInBytes);
        return this;
    }

    /**
     * @param cacheUsedPercentage
     */

    public void setCacheUsedPercentage(Double cacheUsedPercentage) {
        this.cacheUsedPercentage = cacheUsedPercentage;
    }

    /**
     * @return
     */

    public Double getCacheUsedPercentage() {
        return this.cacheUsedPercentage;
    }

    /**
     * @param cacheUsedPercentage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withCacheUsedPercentage(
            Double cacheUsedPercentage) {
        setCacheUsedPercentage(cacheUsedPercentage);
        return this;
    }

    /**
     * @param cacheDirtyPercentage
     */

    public void setCacheDirtyPercentage(Double cacheDirtyPercentage) {
        this.cacheDirtyPercentage = cacheDirtyPercentage;
    }

    /**
     * @return
     */

    public Double getCacheDirtyPercentage() {
        return this.cacheDirtyPercentage;
    }

    /**
     * @param cacheDirtyPercentage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withCacheDirtyPercentage(
            Double cacheDirtyPercentage) {
        setCacheDirtyPercentage(cacheDirtyPercentage);
        return this;
    }

    /**
     * @param cacheHitPercentage
     */

    public void setCacheHitPercentage(Double cacheHitPercentage) {
        this.cacheHitPercentage = cacheHitPercentage;
    }

    /**
     * @return
     */

    public Double getCacheHitPercentage() {
        return this.cacheHitPercentage;
    }

    /**
     * @param cacheHitPercentage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withCacheHitPercentage(Double cacheHitPercentage) {
        setCacheHitPercentage(cacheHitPercentage);
        return this;
    }

    /**
     * @param cacheMissPercentage
     */

    public void setCacheMissPercentage(Double cacheMissPercentage) {
        this.cacheMissPercentage = cacheMissPercentage;
    }

    /**
     * @return
     */

    public Double getCacheMissPercentage() {
        return this.cacheMissPercentage;
    }

    /**
     * @param cacheMissPercentage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeCacheResult withCacheMissPercentage(
            Double cacheMissPercentage) {
        setCacheMissPercentage(cacheMissPercentage);
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
        if (getDiskIds() != null)
            sb.append("DiskIds: " + getDiskIds() + ",");
        if (getCacheAllocatedInBytes() != null)
            sb.append("CacheAllocatedInBytes: " + getCacheAllocatedInBytes()
                    + ",");
        if (getCacheUsedPercentage() != null)
            sb.append("CacheUsedPercentage: " + getCacheUsedPercentage() + ",");
        if (getCacheDirtyPercentage() != null)
            sb.append("CacheDirtyPercentage: " + getCacheDirtyPercentage()
                    + ",");
        if (getCacheHitPercentage() != null)
            sb.append("CacheHitPercentage: " + getCacheHitPercentage() + ",");
        if (getCacheMissPercentage() != null)
            sb.append("CacheMissPercentage: " + getCacheMissPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeCacheResult == false)
            return false;
        DescribeCacheResult other = (DescribeCacheResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null
                && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getCacheAllocatedInBytes() == null
                ^ this.getCacheAllocatedInBytes() == null)
            return false;
        if (other.getCacheAllocatedInBytes() != null
                && other.getCacheAllocatedInBytes().equals(
                        this.getCacheAllocatedInBytes()) == false)
            return false;
        if (other.getCacheUsedPercentage() == null
                ^ this.getCacheUsedPercentage() == null)
            return false;
        if (other.getCacheUsedPercentage() != null
                && other.getCacheUsedPercentage().equals(
                        this.getCacheUsedPercentage()) == false)
            return false;
        if (other.getCacheDirtyPercentage() == null
                ^ this.getCacheDirtyPercentage() == null)
            return false;
        if (other.getCacheDirtyPercentage() != null
                && other.getCacheDirtyPercentage().equals(
                        this.getCacheDirtyPercentage()) == false)
            return false;
        if (other.getCacheHitPercentage() == null
                ^ this.getCacheHitPercentage() == null)
            return false;
        if (other.getCacheHitPercentage() != null
                && other.getCacheHitPercentage().equals(
                        this.getCacheHitPercentage()) == false)
            return false;
        if (other.getCacheMissPercentage() == null
                ^ this.getCacheMissPercentage() == null)
            return false;
        if (other.getCacheMissPercentage() != null
                && other.getCacheMissPercentage().equals(
                        this.getCacheMissPercentage()) == false)
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
                + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheAllocatedInBytes() == null) ? 0
                        : getCacheAllocatedInBytes().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheUsedPercentage() == null) ? 0
                        : getCacheUsedPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheDirtyPercentage() == null) ? 0
                        : getCacheDirtyPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheHitPercentage() == null) ? 0
                        : getCacheHitPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getCacheMissPercentage() == null) ? 0
                        : getCacheMissPercentage().hashCode());
        return hashCode;
    }

    @Override
    public DescribeCacheResult clone() {
        try {
            return (DescribeCacheResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
