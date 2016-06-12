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
 * Specify the type of Amazon EC2 instances to run the job flow on.
 * </p>
 */
public class JobFlowInstancesDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EC2 master node instance type.
     * </p>
     */
    private String masterInstanceType;
    /**
     * <p>
     * The DNS name of the master node.
     * </p>
     */
    private String masterPublicDnsName;
    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     */
    private String masterInstanceId;
    /**
     * <p>
     * The Amazon EC2 slave node instance type.
     * </p>
     */
    private String slaveInstanceType;
    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and slave node. If the value is
     * greater than 1, one instance is the master node and all others are slave
     * nodes.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Details about the job flow's instance groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceGroupDetail> instanceGroups;
    /**
     * <p>
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an m1.small
     * runs. Larger instances are weighted more, so an Amazon EC2 instance that
     * is roughly four times more expensive would result in the normalized
     * instance hours being incremented by four. This result is only an
     * approximation and does not reflect the actual billing rate.
     * </p>
     */
    private Integer normalizedInstanceHours;
    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node of job flow.
     * </p>
     */
    private String ec2KeyName;
    /**
     * <p>
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was launched.
     * </p>
     */
    private String ec2SubnetId;
    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     */
    private PlacementType placement;
    /**
     * <p>
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * </p>
     */
    private Boolean keepJobFlowAliveWhenNoSteps;
    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job flow error.
     * </p>
     */
    private Boolean terminationProtected;
    /**
     * <p>
     * The Hadoop version for the job flow.
     * </p>
     */
    private String hadoopVersion;

    /**
     * Default constructor for JobFlowInstancesDetail object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public JobFlowInstancesDetail() {
    }

    /**
     * Constructs a new JobFlowInstancesDetail object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param masterInstanceType
     *        The Amazon EC2 master node instance type.
     * @param slaveInstanceType
     *        The Amazon EC2 slave node instance type.
     * @param instanceCount
     *        The number of Amazon EC2 instances in the cluster. If the value is
     *        1, the same instance serves as both the master and slave node. If
     *        the value is greater than 1, one instance is the master node and
     *        all others are slave nodes.
     */
    public JobFlowInstancesDetail(String masterInstanceType,
            String slaveInstanceType, Integer instanceCount) {
        setMasterInstanceType(masterInstanceType);
        setSlaveInstanceType(slaveInstanceType);
        setInstanceCount(instanceCount);
    }

    /**
     * <p>
     * The Amazon EC2 master node instance type.
     * </p>
     * 
     * @param masterInstanceType
     *        The Amazon EC2 master node instance type.
     */

    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 master node instance type.
     * </p>
     * 
     * @return The Amazon EC2 master node instance type.
     */

    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 master node instance type.
     * </p>
     * 
     * @param masterInstanceType
     *        The Amazon EC2 master node instance type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withMasterInstanceType(
            String masterInstanceType) {
        setMasterInstanceType(masterInstanceType);
        return this;
    }

    /**
     * <p>
     * The DNS name of the master node.
     * </p>
     * 
     * @param masterPublicDnsName
     *        The DNS name of the master node.
     */

    public void setMasterPublicDnsName(String masterPublicDnsName) {
        this.masterPublicDnsName = masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node.
     * </p>
     * 
     * @return The DNS name of the master node.
     */

    public String getMasterPublicDnsName() {
        return this.masterPublicDnsName;
    }

    /**
     * <p>
     * The DNS name of the master node.
     * </p>
     * 
     * @param masterPublicDnsName
     *        The DNS name of the master node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withMasterPublicDnsName(
            String masterPublicDnsName) {
        setMasterPublicDnsName(masterPublicDnsName);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * 
     * @param masterInstanceId
     *        The Amazon EC2 instance identifier of the master node.
     */

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * 
     * @return The Amazon EC2 instance identifier of the master node.
     */

    public String getMasterInstanceId() {
        return this.masterInstanceId;
    }

    /**
     * <p>
     * The Amazon EC2 instance identifier of the master node.
     * </p>
     * 
     * @param masterInstanceId
     *        The Amazon EC2 instance identifier of the master node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withMasterInstanceId(String masterInstanceId) {
        setMasterInstanceId(masterInstanceId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 slave node instance type.
     * </p>
     * 
     * @param slaveInstanceType
     *        The Amazon EC2 slave node instance type.
     */

    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 slave node instance type.
     * </p>
     * 
     * @return The Amazon EC2 slave node instance type.
     */

    public String getSlaveInstanceType() {
        return this.slaveInstanceType;
    }

    /**
     * <p>
     * The Amazon EC2 slave node instance type.
     * </p>
     * 
     * @param slaveInstanceType
     *        The Amazon EC2 slave node instance type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withSlaveInstanceType(String slaveInstanceType) {
        setSlaveInstanceType(slaveInstanceType);
        return this;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and slave node. If the value is
     * greater than 1, one instance is the master node and all others are slave
     * nodes.
     * </p>
     * 
     * @param instanceCount
     *        The number of Amazon EC2 instances in the cluster. If the value is
     *        1, the same instance serves as both the master and slave node. If
     *        the value is greater than 1, one instance is the master node and
     *        all others are slave nodes.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and slave node. If the value is
     * greater than 1, one instance is the master node and all others are slave
     * nodes.
     * </p>
     * 
     * @return The number of Amazon EC2 instances in the cluster. If the value
     *         is 1, the same instance serves as both the master and slave node.
     *         If the value is greater than 1, one instance is the master node
     *         and all others are slave nodes.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances in the cluster. If the value is 1, the
     * same instance serves as both the master and slave node. If the value is
     * greater than 1, one instance is the master node and all others are slave
     * nodes.
     * </p>
     * 
     * @param instanceCount
     *        The number of Amazon EC2 instances in the cluster. If the value is
     *        1, the same instance serves as both the master and slave node. If
     *        the value is greater than 1, one instance is the master node and
     *        all others are slave nodes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Details about the job flow's instance groups.
     * </p>
     * 
     * @return Details about the job flow's instance groups.
     */

    public java.util.List<InstanceGroupDetail> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupDetail>();
        }
        return instanceGroups;
    }

    /**
     * <p>
     * Details about the job flow's instance groups.
     * </p>
     * 
     * @param instanceGroups
     *        Details about the job flow's instance groups.
     */

    public void setInstanceGroups(
            java.util.Collection<InstanceGroupDetail> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupDetail>(
                instanceGroups);
    }

    /**
     * <p>
     * Details about the job flow's instance groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceGroups(java.util.Collection)} or
     * {@link #withInstanceGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        Details about the job flow's instance groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withInstanceGroups(
            InstanceGroupDetail... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new com.amazonaws.internal.SdkInternalList<InstanceGroupDetail>(
                    instanceGroups.length));
        }
        for (InstanceGroupDetail ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Details about the job flow's instance groups.
     * </p>
     * 
     * @param instanceGroups
     *        Details about the job flow's instance groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withInstanceGroups(
            java.util.Collection<InstanceGroupDetail> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an m1.small
     * runs. Larger instances are weighted more, so an Amazon EC2 instance that
     * is roughly four times more expensive would result in the normalized
     * instance hours being incremented by four. This result is only an
     * approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the job flow, represented in
     *        m1.small/hours. This value is incremented once for every hour an
     *        m1.small runs. Larger instances are weighted more, so an Amazon
     *        EC2 instance that is roughly four times more expensive would
     *        result in the normalized instance hours being incremented by four.
     *        This result is only an approximation and does not reflect the
     *        actual billing rate.
     */

    public void setNormalizedInstanceHours(Integer normalizedInstanceHours) {
        this.normalizedInstanceHours = normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an m1.small
     * runs. Larger instances are weighted more, so an Amazon EC2 instance that
     * is roughly four times more expensive would result in the normalized
     * instance hours being incremented by four. This result is only an
     * approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @return An approximation of the cost of the job flow, represented in
     *         m1.small/hours. This value is incremented once for every hour an
     *         m1.small runs. Larger instances are weighted more, so an Amazon
     *         EC2 instance that is roughly four times more expensive would
     *         result in the normalized instance hours being incremented by
     *         four. This result is only an approximation and does not reflect
     *         the actual billing rate.
     */

    public Integer getNormalizedInstanceHours() {
        return this.normalizedInstanceHours;
    }

    /**
     * <p>
     * An approximation of the cost of the job flow, represented in
     * m1.small/hours. This value is incremented once for every hour an m1.small
     * runs. Larger instances are weighted more, so an Amazon EC2 instance that
     * is roughly four times more expensive would result in the normalized
     * instance hours being incremented by four. This result is only an
     * approximation and does not reflect the actual billing rate.
     * </p>
     * 
     * @param normalizedInstanceHours
     *        An approximation of the cost of the job flow, represented in
     *        m1.small/hours. This value is incremented once for every hour an
     *        m1.small runs. Larger instances are weighted more, so an Amazon
     *        EC2 instance that is roughly four times more expensive would
     *        result in the normalized instance hours being incremented by four.
     *        This result is only an approximation and does not reflect the
     *        actual billing rate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withNormalizedInstanceHours(
            Integer normalizedInstanceHours) {
        setNormalizedInstanceHours(normalizedInstanceHours);
        return this;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node of job flow.
     * </p>
     * 
     * @param ec2KeyName
     *        The name of an Amazon EC2 key pair that can be used to ssh to the
     *        master node of job flow.
     */

    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node of job flow.
     * </p>
     * 
     * @return The name of an Amazon EC2 key pair that can be used to ssh to the
     *         master node of job flow.
     */

    public String getEc2KeyName() {
        return this.ec2KeyName;
    }

    /**
     * <p>
     * The name of an Amazon EC2 key pair that can be used to ssh to the master
     * node of job flow.
     * </p>
     * 
     * @param ec2KeyName
     *        The name of an Amazon EC2 key pair that can be used to ssh to the
     *        master node of job flow.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withEc2KeyName(String ec2KeyName) {
        setEc2KeyName(ec2KeyName);
        return this;
    }

    /**
     * <p>
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was launched.
     * </p>
     * 
     * @param ec2SubnetId
     *        For job flows launched within Amazon Virtual Private Cloud, this
     *        value specifies the identifier of the subnet where the job flow
     *        was launched.
     */

    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was launched.
     * </p>
     * 
     * @return For job flows launched within Amazon Virtual Private Cloud, this
     *         value specifies the identifier of the subnet where the job flow
     *         was launched.
     */

    public String getEc2SubnetId() {
        return this.ec2SubnetId;
    }

    /**
     * <p>
     * For job flows launched within Amazon Virtual Private Cloud, this value
     * specifies the identifier of the subnet where the job flow was launched.
     * </p>
     * 
     * @param ec2SubnetId
     *        For job flows launched within Amazon Virtual Private Cloud, this
     *        value specifies the identifier of the subnet where the job flow
     *        was launched.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withEc2SubnetId(String ec2SubnetId) {
        setEc2SubnetId(ec2SubnetId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @param placement
     *        The Amazon EC2 Availability Zone for the job flow.
     */

    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @return The Amazon EC2 Availability Zone for the job flow.
     */

    public PlacementType getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The Amazon EC2 Availability Zone for the job flow.
     * </p>
     * 
     * @param placement
     *        The Amazon EC2 Availability Zone for the job flow.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withPlacement(PlacementType placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        Specifies whether the job flow should terminate after completing
     *        all steps.
     */

    public void setKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * </p>
     * 
     * @return Specifies whether the job flow should terminate after completing
     *         all steps.
     */

    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        Specifies whether the job flow should terminate after completing
     *        all steps.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        setKeepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job flow should terminate after completing all
     * steps.
     * </p>
     * 
     * @return Specifies whether the job flow should terminate after completing
     *         all steps.
     */

    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job flow error.
     * </p>
     * 
     * @param terminationProtected
     *        Specifies whether the Amazon EC2 instances in the cluster are
     *        protected from termination by API calls, user intervention, or in
     *        the event of a job flow error.
     */

    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job flow error.
     * </p>
     * 
     * @return Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in
     *         the event of a job flow error.
     */

    public Boolean getTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job flow error.
     * </p>
     * 
     * @param terminationProtected
     *        Specifies whether the Amazon EC2 instances in the cluster are
     *        protected from termination by API calls, user intervention, or in
     *        the event of a job flow error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withTerminationProtected(
            Boolean terminationProtected) {
        setTerminationProtected(terminationProtected);
        return this;
    }

    /**
     * <p>
     * Specifies whether the Amazon EC2 instances in the cluster are protected
     * from termination by API calls, user intervention, or in the event of a
     * job flow error.
     * </p>
     * 
     * @return Specifies whether the Amazon EC2 instances in the cluster are
     *         protected from termination by API calls, user intervention, or in
     *         the event of a job flow error.
     */

    public Boolean isTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * The Hadoop version for the job flow.
     * </p>
     * 
     * @param hadoopVersion
     *        The Hadoop version for the job flow.
     */

    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the job flow.
     * </p>
     * 
     * @return The Hadoop version for the job flow.
     */

    public String getHadoopVersion() {
        return this.hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the job flow.
     * </p>
     * 
     * @param hadoopVersion
     *        The Hadoop version for the job flow.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesDetail withHadoopVersion(String hadoopVersion) {
        setHadoopVersion(hadoopVersion);
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
        if (getMasterInstanceType() != null)
            sb.append("MasterInstanceType: " + getMasterInstanceType() + ",");
        if (getMasterPublicDnsName() != null)
            sb.append("MasterPublicDnsName: " + getMasterPublicDnsName() + ",");
        if (getMasterInstanceId() != null)
            sb.append("MasterInstanceId: " + getMasterInstanceId() + ",");
        if (getSlaveInstanceType() != null)
            sb.append("SlaveInstanceType: " + getSlaveInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getNormalizedInstanceHours() != null)
            sb.append("NormalizedInstanceHours: "
                    + getNormalizedInstanceHours() + ",");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKeepJobFlowAliveWhenNoSteps() != null)
            sb.append("KeepJobFlowAliveWhenNoSteps: "
                    + getKeepJobFlowAliveWhenNoSteps() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected()
                    + ",");
        if (getHadoopVersion() != null)
            sb.append("HadoopVersion: " + getHadoopVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFlowInstancesDetail == false)
            return false;
        JobFlowInstancesDetail other = (JobFlowInstancesDetail) obj;
        if (other.getMasterInstanceType() == null
                ^ this.getMasterInstanceType() == null)
            return false;
        if (other.getMasterInstanceType() != null
                && other.getMasterInstanceType().equals(
                        this.getMasterInstanceType()) == false)
            return false;
        if (other.getMasterPublicDnsName() == null
                ^ this.getMasterPublicDnsName() == null)
            return false;
        if (other.getMasterPublicDnsName() != null
                && other.getMasterPublicDnsName().equals(
                        this.getMasterPublicDnsName()) == false)
            return false;
        if (other.getMasterInstanceId() == null
                ^ this.getMasterInstanceId() == null)
            return false;
        if (other.getMasterInstanceId() != null
                && other.getMasterInstanceId().equals(
                        this.getMasterInstanceId()) == false)
            return false;
        if (other.getSlaveInstanceType() == null
                ^ this.getSlaveInstanceType() == null)
            return false;
        if (other.getSlaveInstanceType() != null
                && other.getSlaveInstanceType().equals(
                        this.getSlaveInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null
                && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getInstanceGroups() == null
                ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null
                && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getNormalizedInstanceHours() == null
                ^ this.getNormalizedInstanceHours() == null)
            return false;
        if (other.getNormalizedInstanceHours() != null
                && other.getNormalizedInstanceHours().equals(
                        this.getNormalizedInstanceHours()) == false)
            return false;
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null
                && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
            return false;
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null)
            return false;
        if (other.getEc2SubnetId() != null
                && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false)
            return false;
        if (other.getPlacement() == null ^ this.getPlacement() == null)
            return false;
        if (other.getPlacement() != null
                && other.getPlacement().equals(this.getPlacement()) == false)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() == null
                ^ this.getKeepJobFlowAliveWhenNoSteps() == null)
            return false;
        if (other.getKeepJobFlowAliveWhenNoSteps() != null
                && other.getKeepJobFlowAliveWhenNoSteps().equals(
                        this.getKeepJobFlowAliveWhenNoSteps()) == false)
            return false;
        if (other.getTerminationProtected() == null
                ^ this.getTerminationProtected() == null)
            return false;
        if (other.getTerminationProtected() != null
                && other.getTerminationProtected().equals(
                        this.getTerminationProtected()) == false)
            return false;
        if (other.getHadoopVersion() == null ^ this.getHadoopVersion() == null)
            return false;
        if (other.getHadoopVersion() != null
                && other.getHadoopVersion().equals(this.getHadoopVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getMasterInstanceType() == null) ? 0
                        : getMasterInstanceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getMasterPublicDnsName() == null) ? 0
                        : getMasterPublicDnsName().hashCode());
        hashCode = prime
                * hashCode
                + ((getMasterInstanceId() == null) ? 0 : getMasterInstanceId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSlaveInstanceType() == null) ? 0
                        : getSlaveInstanceType().hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceCount() == null) ? 0 : getInstanceCount()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNormalizedInstanceHours() == null) ? 0
                        : getNormalizedInstanceHours().hashCode());
        hashCode = prime * hashCode
                + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
        hashCode = prime
                * hashCode
                + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime * hashCode
                + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        hashCode = prime
                * hashCode
                + ((getKeepJobFlowAliveWhenNoSteps() == null) ? 0
                        : getKeepJobFlowAliveWhenNoSteps().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminationProtected() == null) ? 0
                        : getTerminationProtected().hashCode());
        hashCode = prime
                * hashCode
                + ((getHadoopVersion() == null) ? 0 : getHadoopVersion()
                        .hashCode());
        return hashCode;
    }

    @Override
    public JobFlowInstancesDetail clone() {
        try {
            return (JobFlowInstancesDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
