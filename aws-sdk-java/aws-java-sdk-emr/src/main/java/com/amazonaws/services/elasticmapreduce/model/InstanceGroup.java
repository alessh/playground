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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * This entity represents an instance group, which is a group of instances that
 * have common purpose. For example, CORE instance group is used for HDFS.
 * </p>
 */
public class InstanceGroup implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the instance group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     */
    private String market;
    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     */
    private String instanceGroupType;
    /**
     * <p>
     * The bid price for each EC2 instance in the instance group when launching
     * nodes as Spot Instances, expressed in USD.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     */
    private Integer requestedInstanceCount;
    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     */
    private Integer runningInstanceCount;
    /**
     * <p>
     * The current status of the instance group.
     * </p>
     */
    private InstanceGroupStatus status;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EbsBlockDevice> ebsBlockDevices;
    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS–optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @param id
     *        The identifier of the instance group.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @return The identifier of the instance group.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the instance group.
     * </p>
     * 
     * @param id
     *        The identifier of the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @param name
     *        The name of the instance group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @return The name of the instance group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the instance group.
     * </p>
     * 
     * @param name
     *        The name of the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid
     *        values are ON_DEMAND or SPOT.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * 
     * @return The marketplace to provision instances for this group. Valid
     *         values are ON_DEMAND or SPOT.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid
     *        values are ON_DEMAND or SPOT.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MarketType
     */

    public InstanceGroup withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid
     *        values are ON_DEMAND or SPOT.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        this.market = market.toString();
    }

    /**
     * <p>
     * The marketplace to provision instances for this group. Valid values are
     * ON_DEMAND or SPOT.
     * </p>
     * 
     * @param market
     *        The marketplace to provision instances for this group. Valid
     *        values are ON_DEMAND or SPOT.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see MarketType
     */

    public InstanceGroup withMarket(MarketType market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or
     *        TASK.
     * @see InstanceGroupType
     */

    public void setInstanceGroupType(String instanceGroupType) {
        this.instanceGroupType = instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @return The type of the instance group. Valid values are MASTER, CORE or
     *         TASK.
     * @see InstanceGroupType
     */

    public String getInstanceGroupType() {
        return this.instanceGroupType;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or
     *        TASK.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceGroupType
     */

    public InstanceGroup withInstanceGroupType(String instanceGroupType) {
        setInstanceGroupType(instanceGroupType);
        return this;
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or
     *        TASK.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceGroupType
     */

    public void setInstanceGroupType(InstanceGroupType instanceGroupType) {
        this.instanceGroupType = instanceGroupType.toString();
    }

    /**
     * <p>
     * The type of the instance group. Valid values are MASTER, CORE or TASK.
     * </p>
     * 
     * @param instanceGroupType
     *        The type of the instance group. Valid values are MASTER, CORE or
     *        TASK.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InstanceGroupType
     */

    public InstanceGroup withInstanceGroupType(
            InstanceGroupType instanceGroupType) {
        setInstanceGroupType(instanceGroupType);
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 instance in the instance group when launching
     * nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 instance in the instance group when
     *        launching nodes as Spot Instances, expressed in USD.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 instance in the instance group when launching
     * nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @return The bid price for each EC2 instance in the instance group when
     *         launching nodes as Spot Instances, expressed in USD.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 instance in the instance group when launching
     * nodes as Spot Instances, expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 instance in the instance group when
     *        launching nodes as Spot Instances, expressed in USD.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @return The EC2 instance type for all instances in the instance group.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @param requestedInstanceCount
     *        The target number of instances for the instance group.
     */

    public void setRequestedInstanceCount(Integer requestedInstanceCount) {
        this.requestedInstanceCount = requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @return The target number of instances for the instance group.
     */

    public Integer getRequestedInstanceCount() {
        return this.requestedInstanceCount;
    }

    /**
     * <p>
     * The target number of instances for the instance group.
     * </p>
     * 
     * @param requestedInstanceCount
     *        The target number of instances for the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withRequestedInstanceCount(
            Integer requestedInstanceCount) {
        setRequestedInstanceCount(requestedInstanceCount);
        return this;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @param runningInstanceCount
     *        The number of instances currently running in this instance group.
     */

    public void setRunningInstanceCount(Integer runningInstanceCount) {
        this.runningInstanceCount = runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @return The number of instances currently running in this instance group.
     */

    public Integer getRunningInstanceCount() {
        return this.runningInstanceCount;
    }

    /**
     * <p>
     * The number of instances currently running in this instance group.
     * </p>
     * 
     * @param runningInstanceCount
     *        The number of instances currently running in this instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withRunningInstanceCount(Integer runningInstanceCount) {
        setRunningInstanceCount(runningInstanceCount);
        return this;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @param status
     *        The current status of the instance group.
     */

    public void setStatus(InstanceGroupStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @return The current status of the instance group.
     */

    public InstanceGroupStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the instance group.
     * </p>
     * 
     * @param status
     *        The current status of the instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withStatus(InstanceGroupStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * 
     * @return Amazon EMR releases 4.x or later.</p></note>
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * 
     * @param configurations
     *        Amazon EMR releases 4.x or later.</p></note>
     */

    public void setConfigurations(
            java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(
                configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigurations(java.util.Collection)} or
     * {@link #withConfigurations(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param configurations
     *        Amazon EMR releases 4.x or later.</p></note>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(
                    configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group.
     * You can specify a separate configuration for each instance group (master,
     * core, and task).
     * </p>
     * 
     * @param configurations
     *        Amazon EMR releases 4.x or later.</p></note>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withConfigurations(
            java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @return The EBS block devices that are mapped to this instance group.
     */

    public java.util.List<EbsBlockDevice> getEbsBlockDevices() {
        if (ebsBlockDevices == null) {
            ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>();
        }
        return ebsBlockDevices;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     */

    public void setEbsBlockDevices(
            java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        if (ebsBlockDevices == null) {
            this.ebsBlockDevices = null;
            return;
        }

        this.ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(
                ebsBlockDevices);
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEbsBlockDevices(java.util.Collection)} or
     * {@link #withEbsBlockDevices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withEbsBlockDevices(EbsBlockDevice... ebsBlockDevices) {
        if (this.ebsBlockDevices == null) {
            setEbsBlockDevices(new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(
                    ebsBlockDevices.length));
        }
        for (EbsBlockDevice ele : ebsBlockDevices) {
            this.ebsBlockDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The EBS block devices that are mapped to this instance group.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The EBS block devices that are mapped to this instance group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withEbsBlockDevices(
            java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        setEbsBlockDevices(ebsBlockDevices);
        return this;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS–optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        If the instance group is EBS-optimized. An Amazon EBS–optimized
     *        instance uses an optimized configuration stack and provides
     *        additional, dedicated capacity for Amazon EBS I/O.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS–optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     * 
     * @return If the instance group is EBS-optimized. An Amazon EBS–optimized
     *         instance uses an optimized configuration stack and provides
     *         additional, dedicated capacity for Amazon EBS I/O.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS–optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     * 
     * @param ebsOptimized
     *        If the instance group is EBS-optimized. An Amazon EBS–optimized
     *        instance uses an optimized configuration stack and provides
     *        additional, dedicated capacity for Amazon EBS I/O.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InstanceGroup withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * If the instance group is EBS-optimized. An Amazon EBS–optimized instance
     * uses an optimized configuration stack and provides additional, dedicated
     * capacity for Amazon EBS I/O.
     * </p>
     * 
     * @return If the instance group is EBS-optimized. An Amazon EBS–optimized
     *         instance uses an optimized configuration stack and provides
     *         additional, dedicated capacity for Amazon EBS I/O.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getMarket() != null)
            sb.append("Market: " + getMarket() + ",");
        if (getInstanceGroupType() != null)
            sb.append("InstanceGroupType: " + getInstanceGroupType() + ",");
        if (getBidPrice() != null)
            sb.append("BidPrice: " + getBidPrice() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getRequestedInstanceCount() != null)
            sb.append("RequestedInstanceCount: " + getRequestedInstanceCount()
                    + ",");
        if (getRunningInstanceCount() != null)
            sb.append("RunningInstanceCount: " + getRunningInstanceCount()
                    + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getConfigurations() != null)
            sb.append("Configurations: " + getConfigurations() + ",");
        if (getEbsBlockDevices() != null)
            sb.append("EbsBlockDevices: " + getEbsBlockDevices() + ",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: " + getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroup == false)
            return false;
        InstanceGroup other = (InstanceGroup) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null
                && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceGroupType() == null
                ^ this.getInstanceGroupType() == null)
            return false;
        if (other.getInstanceGroupType() != null
                && other.getInstanceGroupType().equals(
                        this.getInstanceGroupType()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null
                && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null
                && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getRequestedInstanceCount() == null
                ^ this.getRequestedInstanceCount() == null)
            return false;
        if (other.getRequestedInstanceCount() != null
                && other.getRequestedInstanceCount().equals(
                        this.getRequestedInstanceCount()) == false)
            return false;
        if (other.getRunningInstanceCount() == null
                ^ this.getRunningInstanceCount() == null)
            return false;
        if (other.getRunningInstanceCount() != null
                && other.getRunningInstanceCount().equals(
                        this.getRunningInstanceCount()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfigurations() == null
                ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null
                && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEbsBlockDevices() == null
                ^ this.getEbsBlockDevices() == null)
            return false;
        if (other.getEbsBlockDevices() != null
                && other.getEbsBlockDevices().equals(this.getEbsBlockDevices()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null
                && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceGroupType() == null) ? 0
                        : getInstanceGroupType().hashCode());
        hashCode = prime * hashCode
                + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceType() == null) ? 0 : getInstanceType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRequestedInstanceCount() == null) ? 0
                        : getRequestedInstanceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getRunningInstanceCount() == null) ? 0
                        : getRunningInstanceCount().hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigurations() == null) ? 0 : getConfigurations()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEbsBlockDevices() == null) ? 0 : getEbsBlockDevices()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getEbsOptimized() == null) ? 0 : getEbsOptimized()
                        .hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroup clone() {
        try {
            return (InstanceGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
