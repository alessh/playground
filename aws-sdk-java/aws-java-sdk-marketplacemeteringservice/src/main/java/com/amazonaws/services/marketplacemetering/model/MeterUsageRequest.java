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

package com.amazonaws.services.marketplacemetering.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class MeterUsageRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     */
    private String productCode;
    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds
     * portions of the timestamp will be ignored.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * It will be one of the 'fcp dimension name' provided during the publishing
     * of the product.
     * </p>
     */
    private String usageDimension;
    /**
     * <p>
     * Consumption value for the hour.
     * </p>
     */
    private Integer usageQuantity;
    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS
     *        Marketplace. The product code should be the same as the one used
     *        during the publishing of a new product.
     */

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * 
     * @return Product code is used to uniquely identify a product in AWS
     *         Marketplace. The product code should be the same as the one used
     *         during the publishing of a new product.
     */

    public String getProductCode() {
        return this.productCode;
    }

    /**
     * <p>
     * Product code is used to uniquely identify a product in AWS Marketplace.
     * The product code should be the same as the one used during the publishing
     * of a new product.
     * </p>
     * 
     * @param productCode
     *        Product code is used to uniquely identify a product in AWS
     *        Marketplace. The product code should be the same as the one used
     *        during the publishing of a new product.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MeterUsageRequest withProductCode(String productCode) {
        setProductCode(productCode);
        return this;
    }

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds
     * portions of the timestamp will be ignored.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the hour, recorded in UTC. The seconds and
     *        milliseconds portions of the timestamp will be ignored.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds
     * portions of the timestamp will be ignored.
     * </p>
     * 
     * @return Timestamp of the hour, recorded in UTC. The seconds and
     *         milliseconds portions of the timestamp will be ignored.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Timestamp of the hour, recorded in UTC. The seconds and milliseconds
     * portions of the timestamp will be ignored.
     * </p>
     * 
     * @param timestamp
     *        Timestamp of the hour, recorded in UTC. The seconds and
     *        milliseconds portions of the timestamp will be ignored.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MeterUsageRequest withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * It will be one of the 'fcp dimension name' provided during the publishing
     * of the product.
     * </p>
     * 
     * @param usageDimension
     *        It will be one of the 'fcp dimension name' provided during the
     *        publishing of the product.
     */

    public void setUsageDimension(String usageDimension) {
        this.usageDimension = usageDimension;
    }

    /**
     * <p>
     * It will be one of the 'fcp dimension name' provided during the publishing
     * of the product.
     * </p>
     * 
     * @return It will be one of the 'fcp dimension name' provided during the
     *         publishing of the product.
     */

    public String getUsageDimension() {
        return this.usageDimension;
    }

    /**
     * <p>
     * It will be one of the 'fcp dimension name' provided during the publishing
     * of the product.
     * </p>
     * 
     * @param usageDimension
     *        It will be one of the 'fcp dimension name' provided during the
     *        publishing of the product.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MeterUsageRequest withUsageDimension(String usageDimension) {
        setUsageDimension(usageDimension);
        return this;
    }

    /**
     * <p>
     * Consumption value for the hour.
     * </p>
     * 
     * @param usageQuantity
     *        Consumption value for the hour.
     */

    public void setUsageQuantity(Integer usageQuantity) {
        this.usageQuantity = usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour.
     * </p>
     * 
     * @return Consumption value for the hour.
     */

    public Integer getUsageQuantity() {
        return this.usageQuantity;
    }

    /**
     * <p>
     * Consumption value for the hour.
     * </p>
     * 
     * @param usageQuantity
     *        Consumption value for the hour.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MeterUsageRequest withUsageQuantity(Integer usageQuantity) {
        setUsageQuantity(usageQuantity);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the permissions required for the action,
     *        but does not make the request. If you have the permissions, the
     *        request returns DryRunOperation; otherwise, it returns
     *        UnauthorizedException.
     */

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException.
     * </p>
     * 
     * @return Checks whether you have the permissions required for the action,
     *         but does not make the request. If you have the permissions, the
     *         request returns DryRunOperation; otherwise, it returns
     *         UnauthorizedException.
     */

    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException.
     * </p>
     * 
     * @param dryRun
     *        Checks whether you have the permissions required for the action,
     *        but does not make the request. If you have the permissions, the
     *        request returns DryRunOperation; otherwise, it returns
     *        UnauthorizedException.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MeterUsageRequest withDryRun(Boolean dryRun) {
        setDryRun(dryRun);
        return this;
    }

    /**
     * <p>
     * Checks whether you have the permissions required for the action, but does
     * not make the request. If you have the permissions, the request returns
     * DryRunOperation; otherwise, it returns UnauthorizedException.
     * </p>
     * 
     * @return Checks whether you have the permissions required for the action,
     *         but does not make the request. If you have the permissions, the
     *         request returns DryRunOperation; otherwise, it returns
     *         UnauthorizedException.
     */

    public Boolean isDryRun() {
        return this.dryRun;
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
        if (getProductCode() != null)
            sb.append("ProductCode: " + getProductCode() + ",");
        if (getTimestamp() != null)
            sb.append("Timestamp: " + getTimestamp() + ",");
        if (getUsageDimension() != null)
            sb.append("UsageDimension: " + getUsageDimension() + ",");
        if (getUsageQuantity() != null)
            sb.append("UsageQuantity: " + getUsageQuantity() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MeterUsageRequest == false)
            return false;
        MeterUsageRequest other = (MeterUsageRequest) obj;
        if (other.getProductCode() == null ^ this.getProductCode() == null)
            return false;
        if (other.getProductCode() != null
                && other.getProductCode().equals(this.getProductCode()) == false)
            return false;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null
                && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getUsageDimension() == null
                ^ this.getUsageDimension() == null)
            return false;
        if (other.getUsageDimension() != null
                && other.getUsageDimension().equals(this.getUsageDimension()) == false)
            return false;
        if (other.getUsageQuantity() == null ^ this.getUsageQuantity() == null)
            return false;
        if (other.getUsageQuantity() != null
                && other.getUsageQuantity().equals(this.getUsageQuantity()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null
                && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getProductCode() == null) ? 0 : getProductCode().hashCode());
        hashCode = prime * hashCode
                + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getUsageDimension() == null) ? 0 : getUsageDimension()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getUsageQuantity() == null) ? 0 : getUsageQuantity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        return hashCode;
    }

    @Override
    public MeterUsageRequest clone() {
        return (MeterUsageRequest) super.clone();
    }
}