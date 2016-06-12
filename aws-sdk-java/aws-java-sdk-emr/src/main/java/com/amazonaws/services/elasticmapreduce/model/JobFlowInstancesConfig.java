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
 * A description of the Amazon EC2 instance running the job flow. A valid
 * JobFlowInstancesConfig must contain at least InstanceGroups, which is the
 * recommended configuration. However, a valid alternative is to have
 * MasterInstanceType, SlaveInstanceType, and InstanceCount (all three must be
 * present).
 * </p>
 */
public class JobFlowInstancesConfig implements Serializable, Cloneable {

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     */
    private String masterInstanceType;
    /**
     * <p>
     * The EC2 instance type of the slave nodes.
     * </p>
     */
    private String slaveInstanceType;
    /**
     * <p>
     * The number of Amazon EC2 instances used to execute the job flow.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <p>
     * Configuration for the job flow's instance groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceGroupConfig> instanceGroups;
    /**
     * <p>
     * The name of the Amazon EC2 key pair that can be used to ssh to the master
     * node as the user called "hadoop."
     * </p>
     */
    private String ec2KeyName;
    /**
     * <p>
     * The Availability Zone the job flow will run in.
     * </p>
     */
    private PlacementType placement;
    /**
     * <p>
     * Specifies whether the job flow should be kept alive after completing all
     * steps.
     * </p>
     */
    private Boolean keepJobFlowAliveWhenNoSteps;
    /**
     * <p>
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in the
     * event of a job flow error.
     * </p>
     */
    private Boolean terminationProtected;
    /**
     * <p>
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is
     * used, unless the AmiVersion parameter is set in the RunJobFlow call, in
     * which case the default version of Hadoop for that AMI version is used.
     * </p>
     */
    private String hadoopVersion;
    /**
     * <p>
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC), set
     * this parameter to the identifier of the Amazon VPC subnet where you want
     * the job flow to launch. If you do not specify this value, the job flow is
     * launched in the normal Amazon Web Services cloud, outside of an Amazon
     * VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra
     * large (cc1.4xlarge) instances. Thus you cannot specify the cc1.4xlarge
     * instance type for nodes of a job flow launched in a Amazon VPC.
     * </p>
     */
    private String ec2SubnetId;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     */
    private String emrManagedMasterSecurityGroup;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     */
    private String emrManagedSlaveSecurityGroup;
    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     */
    private String serviceAccessSecurityGroup;
    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalMasterSecurityGroups;
    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> additionalSlaveSecurityGroups;

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * 
     * @param masterInstanceType
     *        The EC2 instance type of the master node.
     */

    public void setMasterInstanceType(String masterInstanceType) {
        this.masterInstanceType = masterInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * 
     * @return The EC2 instance type of the master node.
     */

    public String getMasterInstanceType() {
        return this.masterInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the master node.
     * </p>
     * 
     * @param masterInstanceType
     *        The EC2 instance type of the master node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withMasterInstanceType(
            String masterInstanceType) {
        setMasterInstanceType(masterInstanceType);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type of the slave nodes.
     * </p>
     * 
     * @param slaveInstanceType
     *        The EC2 instance type of the slave nodes.
     */

    public void setSlaveInstanceType(String slaveInstanceType) {
        this.slaveInstanceType = slaveInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the slave nodes.
     * </p>
     * 
     * @return The EC2 instance type of the slave nodes.
     */

    public String getSlaveInstanceType() {
        return this.slaveInstanceType;
    }

    /**
     * <p>
     * The EC2 instance type of the slave nodes.
     * </p>
     * 
     * @param slaveInstanceType
     *        The EC2 instance type of the slave nodes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withSlaveInstanceType(String slaveInstanceType) {
        setSlaveInstanceType(slaveInstanceType);
        return this;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances used to execute the job flow.
     * </p>
     * 
     * @param instanceCount
     *        The number of Amazon EC2 instances used to execute the job flow.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances used to execute the job flow.
     * </p>
     * 
     * @return The number of Amazon EC2 instances used to execute the job flow.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * The number of Amazon EC2 instances used to execute the job flow.
     * </p>
     * 
     * @param instanceCount
     *        The number of Amazon EC2 instances used to execute the job flow.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <p>
     * Configuration for the job flow's instance groups.
     * </p>
     * 
     * @return Configuration for the job flow's instance groups.
     */

    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>();
        }
        return instanceGroups;
    }

    /**
     * <p>
     * Configuration for the job flow's instance groups.
     * </p>
     * 
     * @param instanceGroups
     *        Configuration for the job flow's instance groups.
     */

    public void setInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>(
                instanceGroups);
    }

    /**
     * <p>
     * Configuration for the job flow's instance groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceGroups(java.util.Collection)} or
     * {@link #withInstanceGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        Configuration for the job flow's instance groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withInstanceGroups(
            InstanceGroupConfig... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>(
                    instanceGroups.length));
        }
        for (InstanceGroupConfig ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Configuration for the job flow's instance groups.
     * </p>
     * 
     * @param instanceGroups
     *        Configuration for the job flow's instance groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair that can be used to ssh to the master
     * node as the user called "hadoop."
     * </p>
     * 
     * @param ec2KeyName
     *        The name of the Amazon EC2 key pair that can be used to ssh to the
     *        master node as the user called "hadoop."
     */

    public void setEc2KeyName(String ec2KeyName) {
        this.ec2KeyName = ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair that can be used to ssh to the master
     * node as the user called "hadoop."
     * </p>
     * 
     * @return The name of the Amazon EC2 key pair that can be used to ssh to
     *         the master node as the user called "hadoop."
     */

    public String getEc2KeyName() {
        return this.ec2KeyName;
    }

    /**
     * <p>
     * The name of the Amazon EC2 key pair that can be used to ssh to the master
     * node as the user called "hadoop."
     * </p>
     * 
     * @param ec2KeyName
     *        The name of the Amazon EC2 key pair that can be used to ssh to the
     *        master node as the user called "hadoop."
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withEc2KeyName(String ec2KeyName) {
        setEc2KeyName(ec2KeyName);
        return this;
    }

    /**
     * <p>
     * The Availability Zone the job flow will run in.
     * </p>
     * 
     * @param placement
     *        The Availability Zone the job flow will run in.
     */

    public void setPlacement(PlacementType placement) {
        this.placement = placement;
    }

    /**
     * <p>
     * The Availability Zone the job flow will run in.
     * </p>
     * 
     * @return The Availability Zone the job flow will run in.
     */

    public PlacementType getPlacement() {
        return this.placement;
    }

    /**
     * <p>
     * The Availability Zone the job flow will run in.
     * </p>
     * 
     * @param placement
     *        The Availability Zone the job flow will run in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withPlacement(PlacementType placement) {
        setPlacement(placement);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job flow should be kept alive after completing all
     * steps.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        Specifies whether the job flow should be kept alive after
     *        completing all steps.
     */

    public void setKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        this.keepJobFlowAliveWhenNoSteps = keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the job flow should be kept alive after completing all
     * steps.
     * </p>
     * 
     * @return Specifies whether the job flow should be kept alive after
     *         completing all steps.
     */

    public Boolean getKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether the job flow should be kept alive after completing all
     * steps.
     * </p>
     * 
     * @param keepJobFlowAliveWhenNoSteps
     *        Specifies whether the job flow should be kept alive after
     *        completing all steps.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withKeepJobFlowAliveWhenNoSteps(
            Boolean keepJobFlowAliveWhenNoSteps) {
        setKeepJobFlowAliveWhenNoSteps(keepJobFlowAliveWhenNoSteps);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job flow should be kept alive after completing all
     * steps.
     * </p>
     * 
     * @return Specifies whether the job flow should be kept alive after
     *         completing all steps.
     */

    public Boolean isKeepJobFlowAliveWhenNoSteps() {
        return this.keepJobFlowAliveWhenNoSteps;
    }

    /**
     * <p>
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in the
     * event of a job flow error.
     * </p>
     * 
     * @param terminationProtected
     *        Specifies whether to lock the job flow to prevent the Amazon EC2
     *        instances from being terminated by API call, user intervention, or
     *        in the event of a job flow error.
     */

    public void setTerminationProtected(Boolean terminationProtected) {
        this.terminationProtected = terminationProtected;
    }

    /**
     * <p>
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in the
     * event of a job flow error.
     * </p>
     * 
     * @return Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention,
     *         or in the event of a job flow error.
     */

    public Boolean getTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in the
     * event of a job flow error.
     * </p>
     * 
     * @param terminationProtected
     *        Specifies whether to lock the job flow to prevent the Amazon EC2
     *        instances from being terminated by API call, user intervention, or
     *        in the event of a job flow error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withTerminationProtected(
            Boolean terminationProtected) {
        setTerminationProtected(terminationProtected);
        return this;
    }

    /**
     * <p>
     * Specifies whether to lock the job flow to prevent the Amazon EC2
     * instances from being terminated by API call, user intervention, or in the
     * event of a job flow error.
     * </p>
     * 
     * @return Specifies whether to lock the job flow to prevent the Amazon EC2
     *         instances from being terminated by API call, user intervention,
     *         or in the event of a job flow error.
     */

    public Boolean isTerminationProtected() {
        return this.terminationProtected;
    }

    /**
     * <p>
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is
     * used, unless the AmiVersion parameter is set in the RunJobFlow call, in
     * which case the default version of Hadoop for that AMI version is used.
     * </p>
     * 
     * @param hadoopVersion
     *        The Hadoop version for the job flow. Valid inputs are "0.18"
     *        (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *        "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the
     *        default of 0.18 is used, unless the AmiVersion parameter is set in
     *        the RunJobFlow call, in which case the default version of Hadoop
     *        for that AMI version is used.
     */

    public void setHadoopVersion(String hadoopVersion) {
        this.hadoopVersion = hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is
     * used, unless the AmiVersion parameter is set in the RunJobFlow call, in
     * which case the default version of Hadoop for that AMI version is used.
     * </p>
     * 
     * @return The Hadoop version for the job flow. Valid inputs are "0.18"
     *         (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *         "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the
     *         default of 0.18 is used, unless the AmiVersion parameter is set
     *         in the RunJobFlow call, in which case the default version of
     *         Hadoop for that AMI version is used.
     */

    public String getHadoopVersion() {
        return this.hadoopVersion;
    }

    /**
     * <p>
     * The Hadoop version for the job flow. Valid inputs are "0.18"
     * (deprecated), "0.20" (deprecated), "0.20.205" (deprecated), "1.0.3",
     * "2.2.0", or "2.4.0". If you do not set this value, the default of 0.18 is
     * used, unless the AmiVersion parameter is set in the RunJobFlow call, in
     * which case the default version of Hadoop for that AMI version is used.
     * </p>
     * 
     * @param hadoopVersion
     *        The Hadoop version for the job flow. Valid inputs are "0.18"
     *        (deprecated), "0.20" (deprecated), "0.20.205" (deprecated),
     *        "1.0.3", "2.2.0", or "2.4.0". If you do not set this value, the
     *        default of 0.18 is used, unless the AmiVersion parameter is set in
     *        the RunJobFlow call, in which case the default version of Hadoop
     *        for that AMI version is used.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withHadoopVersion(String hadoopVersion) {
        setHadoopVersion(hadoopVersion);
        return this;
    }

    /**
     * <p>
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC), set
     * this parameter to the identifier of the Amazon VPC subnet where you want
     * the job flow to launch. If you do not specify this value, the job flow is
     * launched in the normal Amazon Web Services cloud, outside of an Amazon
     * VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra
     * large (cc1.4xlarge) instances. Thus you cannot specify the cc1.4xlarge
     * instance type for nodes of a job flow launched in a Amazon VPC.
     * </p>
     * 
     * @param ec2SubnetId
     *        To launch the job flow in Amazon Virtual Private Cloud (Amazon
     *        VPC), set this parameter to the identifier of the Amazon VPC
     *        subnet where you want the job flow to launch. If you do not
     *        specify this value, the job flow is launched in the normal Amazon
     *        Web Services cloud, outside of an Amazon VPC. </p>
     *        <p>
     *        Amazon VPC currently does not support cluster compute quadruple
     *        extra large (cc1.4xlarge) instances. Thus you cannot specify the
     *        cc1.4xlarge instance type for nodes of a job flow launched in a
     *        Amazon VPC.
     */

    public void setEc2SubnetId(String ec2SubnetId) {
        this.ec2SubnetId = ec2SubnetId;
    }

    /**
     * <p>
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC), set
     * this parameter to the identifier of the Amazon VPC subnet where you want
     * the job flow to launch. If you do not specify this value, the job flow is
     * launched in the normal Amazon Web Services cloud, outside of an Amazon
     * VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra
     * large (cc1.4xlarge) instances. Thus you cannot specify the cc1.4xlarge
     * instance type for nodes of a job flow launched in a Amazon VPC.
     * </p>
     * 
     * @return To launch the job flow in Amazon Virtual Private Cloud (Amazon
     *         VPC), set this parameter to the identifier of the Amazon VPC
     *         subnet where you want the job flow to launch. If you do not
     *         specify this value, the job flow is launched in the normal Amazon
     *         Web Services cloud, outside of an Amazon VPC. </p>
     *         <p>
     *         Amazon VPC currently does not support cluster compute quadruple
     *         extra large (cc1.4xlarge) instances. Thus you cannot specify the
     *         cc1.4xlarge instance type for nodes of a job flow launched in a
     *         Amazon VPC.
     */

    public String getEc2SubnetId() {
        return this.ec2SubnetId;
    }

    /**
     * <p>
     * To launch the job flow in Amazon Virtual Private Cloud (Amazon VPC), set
     * this parameter to the identifier of the Amazon VPC subnet where you want
     * the job flow to launch. If you do not specify this value, the job flow is
     * launched in the normal Amazon Web Services cloud, outside of an Amazon
     * VPC.
     * </p>
     * <p>
     * Amazon VPC currently does not support cluster compute quadruple extra
     * large (cc1.4xlarge) instances. Thus you cannot specify the cc1.4xlarge
     * instance type for nodes of a job flow launched in a Amazon VPC.
     * </p>
     * 
     * @param ec2SubnetId
     *        To launch the job flow in Amazon Virtual Private Cloud (Amazon
     *        VPC), set this parameter to the identifier of the Amazon VPC
     *        subnet where you want the job flow to launch. If you do not
     *        specify this value, the job flow is launched in the normal Amazon
     *        Web Services cloud, outside of an Amazon VPC. </p>
     *        <p>
     *        Amazon VPC currently does not support cluster compute quadruple
     *        extra large (cc1.4xlarge) instances. Thus you cannot specify the
     *        cc1.4xlarge instance type for nodes of a job flow launched in a
     *        Amazon VPC.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withEc2SubnetId(String ec2SubnetId) {
        setEc2SubnetId(ec2SubnetId);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @param emrManagedMasterSecurityGroup
     *        The identifier of the Amazon EC2 security group for the master
     *        node.
     */

    public void setEmrManagedMasterSecurityGroup(
            String emrManagedMasterSecurityGroup) {
        this.emrManagedMasterSecurityGroup = emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the master
     *         node.
     */

    public String getEmrManagedMasterSecurityGroup() {
        return this.emrManagedMasterSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the master node.
     * </p>
     * 
     * @param emrManagedMasterSecurityGroup
     *        The identifier of the Amazon EC2 security group for the master
     *        node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withEmrManagedMasterSecurityGroup(
            String emrManagedMasterSecurityGroup) {
        setEmrManagedMasterSecurityGroup(emrManagedMasterSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @param emrManagedSlaveSecurityGroup
     *        The identifier of the Amazon EC2 security group for the slave
     *        nodes.
     */

    public void setEmrManagedSlaveSecurityGroup(
            String emrManagedSlaveSecurityGroup) {
        this.emrManagedSlaveSecurityGroup = emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the slave
     *         nodes.
     */

    public String getEmrManagedSlaveSecurityGroup() {
        return this.emrManagedSlaveSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the slave nodes.
     * </p>
     * 
     * @param emrManagedSlaveSecurityGroup
     *        The identifier of the Amazon EC2 security group for the slave
     *        nodes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withEmrManagedSlaveSecurityGroup(
            String emrManagedSlaveSecurityGroup) {
        setEmrManagedSlaveSecurityGroup(emrManagedSlaveSecurityGroup);
        return this;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * 
     * @param serviceAccessSecurityGroup
     *        The identifier of the Amazon EC2 security group for the Amazon EMR
     *        service to access clusters in VPC private subnets.
     */

    public void setServiceAccessSecurityGroup(String serviceAccessSecurityGroup) {
        this.serviceAccessSecurityGroup = serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * 
     * @return The identifier of the Amazon EC2 security group for the Amazon
     *         EMR service to access clusters in VPC private subnets.
     */

    public String getServiceAccessSecurityGroup() {
        return this.serviceAccessSecurityGroup;
    }

    /**
     * <p>
     * The identifier of the Amazon EC2 security group for the Amazon EMR
     * service to access clusters in VPC private subnets.
     * </p>
     * 
     * @param serviceAccessSecurityGroup
     *        The identifier of the Amazon EC2 security group for the Amazon EMR
     *        service to access clusters in VPC private subnets.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withServiceAccessSecurityGroup(
            String serviceAccessSecurityGroup) {
        setServiceAccessSecurityGroup(serviceAccessSecurityGroup);
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @return A list of additional Amazon EC2 security group IDs for the master
     *         node.
     */

    public java.util.List<String> getAdditionalMasterSecurityGroups() {
        if (additionalMasterSecurityGroups == null) {
            additionalMasterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalMasterSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master
     *        node.
     */

    public void setAdditionalMasterSecurityGroups(
            java.util.Collection<String> additionalMasterSecurityGroups) {
        if (additionalMasterSecurityGroups == null) {
            this.additionalMasterSecurityGroups = null;
            return;
        }

        this.additionalMasterSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(
                additionalMasterSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use
     * {@link #setAdditionalMasterSecurityGroups(java.util.Collection)} or
     * {@link #withAdditionalMasterSecurityGroups(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master
     *        node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(
            String... additionalMasterSecurityGroups) {
        if (this.additionalMasterSecurityGroups == null) {
            setAdditionalMasterSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    additionalMasterSecurityGroups.length));
        }
        for (String ele : additionalMasterSecurityGroups) {
            this.additionalMasterSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the master node.
     * </p>
     * 
     * @param additionalMasterSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the master
     *        node.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withAdditionalMasterSecurityGroups(
            java.util.Collection<String> additionalMasterSecurityGroups) {
        setAdditionalMasterSecurityGroups(additionalMasterSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @return A list of additional Amazon EC2 security group IDs for the slave
     *         nodes.
     */

    public java.util.List<String> getAdditionalSlaveSecurityGroups() {
        if (additionalSlaveSecurityGroups == null) {
            additionalSlaveSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return additionalSlaveSecurityGroups;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave
     *        nodes.
     */

    public void setAdditionalSlaveSecurityGroups(
            java.util.Collection<String> additionalSlaveSecurityGroups) {
        if (additionalSlaveSecurityGroups == null) {
            this.additionalSlaveSecurityGroups = null;
            return;
        }

        this.additionalSlaveSecurityGroups = new com.amazonaws.internal.SdkInternalList<String>(
                additionalSlaveSecurityGroups);
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAdditionalSlaveSecurityGroups(java.util.Collection)}
     * or {@link #withAdditionalSlaveSecurityGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave
     *        nodes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(
            String... additionalSlaveSecurityGroups) {
        if (this.additionalSlaveSecurityGroups == null) {
            setAdditionalSlaveSecurityGroups(new com.amazonaws.internal.SdkInternalList<String>(
                    additionalSlaveSecurityGroups.length));
        }
        for (String ele : additionalSlaveSecurityGroups) {
            this.additionalSlaveSecurityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of additional Amazon EC2 security group IDs for the slave nodes.
     * </p>
     * 
     * @param additionalSlaveSecurityGroups
     *        A list of additional Amazon EC2 security group IDs for the slave
     *        nodes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public JobFlowInstancesConfig withAdditionalSlaveSecurityGroups(
            java.util.Collection<String> additionalSlaveSecurityGroups) {
        setAdditionalSlaveSecurityGroups(additionalSlaveSecurityGroups);
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
        if (getSlaveInstanceType() != null)
            sb.append("SlaveInstanceType: " + getSlaveInstanceType() + ",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: " + getInstanceCount() + ",");
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getEc2KeyName() != null)
            sb.append("Ec2KeyName: " + getEc2KeyName() + ",");
        if (getPlacement() != null)
            sb.append("Placement: " + getPlacement() + ",");
        if (getKeepJobFlowAliveWhenNoSteps() != null)
            sb.append("KeepJobFlowAliveWhenNoSteps: "
                    + getKeepJobFlowAliveWhenNoSteps() + ",");
        if (getTerminationProtected() != null)
            sb.append("TerminationProtected: " + getTerminationProtected()
                    + ",");
        if (getHadoopVersion() != null)
            sb.append("HadoopVersion: " + getHadoopVersion() + ",");
        if (getEc2SubnetId() != null)
            sb.append("Ec2SubnetId: " + getEc2SubnetId() + ",");
        if (getEmrManagedMasterSecurityGroup() != null)
            sb.append("EmrManagedMasterSecurityGroup: "
                    + getEmrManagedMasterSecurityGroup() + ",");
        if (getEmrManagedSlaveSecurityGroup() != null)
            sb.append("EmrManagedSlaveSecurityGroup: "
                    + getEmrManagedSlaveSecurityGroup() + ",");
        if (getServiceAccessSecurityGroup() != null)
            sb.append("ServiceAccessSecurityGroup: "
                    + getServiceAccessSecurityGroup() + ",");
        if (getAdditionalMasterSecurityGroups() != null)
            sb.append("AdditionalMasterSecurityGroups: "
                    + getAdditionalMasterSecurityGroups() + ",");
        if (getAdditionalSlaveSecurityGroups() != null)
            sb.append("AdditionalSlaveSecurityGroups: "
                    + getAdditionalSlaveSecurityGroups());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobFlowInstancesConfig == false)
            return false;
        JobFlowInstancesConfig other = (JobFlowInstancesConfig) obj;
        if (other.getMasterInstanceType() == null
                ^ this.getMasterInstanceType() == null)
            return false;
        if (other.getMasterInstanceType() != null
                && other.getMasterInstanceType().equals(
                        this.getMasterInstanceType()) == false)
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
        if (other.getEc2KeyName() == null ^ this.getEc2KeyName() == null)
            return false;
        if (other.getEc2KeyName() != null
                && other.getEc2KeyName().equals(this.getEc2KeyName()) == false)
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
        if (other.getEc2SubnetId() == null ^ this.getEc2SubnetId() == null)
            return false;
        if (other.getEc2SubnetId() != null
                && other.getEc2SubnetId().equals(this.getEc2SubnetId()) == false)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() == null
                ^ this.getEmrManagedMasterSecurityGroup() == null)
            return false;
        if (other.getEmrManagedMasterSecurityGroup() != null
                && other.getEmrManagedMasterSecurityGroup().equals(
                        this.getEmrManagedMasterSecurityGroup()) == false)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() == null
                ^ this.getEmrManagedSlaveSecurityGroup() == null)
            return false;
        if (other.getEmrManagedSlaveSecurityGroup() != null
                && other.getEmrManagedSlaveSecurityGroup().equals(
                        this.getEmrManagedSlaveSecurityGroup()) == false)
            return false;
        if (other.getServiceAccessSecurityGroup() == null
                ^ this.getServiceAccessSecurityGroup() == null)
            return false;
        if (other.getServiceAccessSecurityGroup() != null
                && other.getServiceAccessSecurityGroup().equals(
                        this.getServiceAccessSecurityGroup()) == false)
            return false;
        if (other.getAdditionalMasterSecurityGroups() == null
                ^ this.getAdditionalMasterSecurityGroups() == null)
            return false;
        if (other.getAdditionalMasterSecurityGroups() != null
                && other.getAdditionalMasterSecurityGroups().equals(
                        this.getAdditionalMasterSecurityGroups()) == false)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() == null
                ^ this.getAdditionalSlaveSecurityGroups() == null)
            return false;
        if (other.getAdditionalSlaveSecurityGroups() != null
                && other.getAdditionalSlaveSecurityGroups().equals(
                        this.getAdditionalSlaveSecurityGroups()) == false)
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
        hashCode = prime * hashCode
                + ((getEc2KeyName() == null) ? 0 : getEc2KeyName().hashCode());
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
        hashCode = prime
                * hashCode
                + ((getEc2SubnetId() == null) ? 0 : getEc2SubnetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmrManagedMasterSecurityGroup() == null) ? 0
                        : getEmrManagedMasterSecurityGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getEmrManagedSlaveSecurityGroup() == null) ? 0
                        : getEmrManagedSlaveSecurityGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getServiceAccessSecurityGroup() == null) ? 0
                        : getServiceAccessSecurityGroup().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalMasterSecurityGroups() == null) ? 0
                        : getAdditionalMasterSecurityGroups().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdditionalSlaveSecurityGroups() == null) ? 0
                        : getAdditionalSlaveSecurityGroups().hashCode());
        return hashCode;
    }

    @Override
    public JobFlowInstancesConfig clone() {
        try {
            return (JobFlowInstancesConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
