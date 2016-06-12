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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateAutoScalingGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead of a
     * launch configuration.
     * </p>
     */
    private String launchConfigurationName;
    /**
     * <p>
     * The ID of the EC2 instance used to create a launch configuration for the
     * group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2 instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group from an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The minimum size of the group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size of the group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     */
    private Integer desiredCapacity;
    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private Integer defaultCooldown;
    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify subnets using the <code>VPCZoneIdentifier</code>
     * parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> availabilityZones;
    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> loadBalancerNames;
    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     */
    private String healthCheckType;
    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks for Auto Scaling Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private Integer healthCheckGracePeriod;
    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private String placementGroup;
    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private String vPCZoneIdentifier;
    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     * >Choosing a Termination Policy for Your Auto Scaling Group</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicies;
    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     */
    private Boolean newInstancesProtectedFromScaleIn;
    /**
     * <p>
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group. This name must be unique within the scope
     *        of your AWS account.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     * 
     * @return The name of the group. This name must be unique within the scope
     *         of your AWS account.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the group. This name must be unique within the scope of your
     * AWS account.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name of the group. This name must be unique within the scope
     *        of your AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead of a
     * launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. Alternatively, use the
     *        <code>InstanceId</code> parameter to specify an EC2 instance
     *        instead of a launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead of a
     * launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration. Alternatively, use the
     *         <code>InstanceId</code> parameter to specify an EC2 instance
     *         instead of a launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration. Alternatively, use the
     * <code>InstanceId</code> parameter to specify an EC2 instance instead of a
     * launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration. Alternatively, use the
     *        <code>InstanceId</code> parameter to specify an EC2 instance
     *        instead of a launch configuration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withLaunchConfigurationName(
            String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
        return this;
    }

    /**
     * <p>
     * The ID of the EC2 instance used to create a launch configuration for the
     * group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2 instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group from an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance used to create a launch configuration
     *        for the group. Alternatively, use the
     *        <code>LaunchConfigurationName</code> parameter to specify a launch
     *        configuration instead of an EC2 instance.</p>
     *        <p>
     *        When you specify an ID of an instance, Auto Scaling creates a new
     *        launch configuration and associates it with the group. This launch
     *        configuration derives its attributes from the specified instance,
     *        with the exception of the block device mapping.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *        >Create an Auto Scaling Group from an EC2 Instance</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance used to create a launch configuration for the
     * group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2 instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group from an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @return The ID of the EC2 instance used to create a launch configuration
     *         for the group. Alternatively, use the
     *         <code>LaunchConfigurationName</code> parameter to specify a
     *         launch configuration instead of an EC2 instance.</p>
     *         <p>
     *         When you specify an ID of an instance, Auto Scaling creates a new
     *         launch configuration and associates it with the group. This
     *         launch configuration derives its attributes from the specified
     *         instance, with the exception of the block device mapping.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *         >Create an Auto Scaling Group from an EC2 Instance</a> in the
     *         <i>Auto Scaling Developer Guide</i>.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the EC2 instance used to create a launch configuration for the
     * group. Alternatively, use the <code>LaunchConfigurationName</code>
     * parameter to specify a launch configuration instead of an EC2 instance.
     * </p>
     * <p>
     * When you specify an ID of an instance, Auto Scaling creates a new launch
     * configuration and associates it with the group. This launch configuration
     * derives its attributes from the specified instance, with the exception of
     * the block device mapping.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     * >Create an Auto Scaling Group from an EC2 Instance</a> in the <i>Auto
     * Scaling Developer Guide</i>.
     * </p>
     * 
     * @param instanceId
     *        The ID of the EC2 instance used to create a launch configuration
     *        for the group. Alternatively, use the
     *        <code>LaunchConfigurationName</code> parameter to specify a launch
     *        configuration instead of an EC2 instance.</p>
     *        <p>
     *        When you specify an ID of an instance, Auto Scaling creates a new
     *        launch configuration and associates it with the group. This launch
     *        configuration derives its attributes from the specified instance,
     *        with the exception of the block device mapping.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/create-asg-from-instance.html"
     *        >Create an Auto Scaling Group from an EC2 Instance</a> in the
     *        <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @return The minimum size of the group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size of the group.
     * </p>
     * 
     * @param minSize
     *        The minimum size of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @return The maximum size of the group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size of the group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group.
     *        This number must be greater than or equal to the minimum size of
     *        the group and less than or equal to the maximum size of the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the group.
     *         This number must be greater than or equal to the minimum size of
     *         the group and less than or equal to the maximum size of the
     *         group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group. This
     * number must be greater than or equal to the minimum size of the group and
     * less than or equal to the maximum size of the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group.
     *        This number must be greater than or equal to the minimum size of
     *        the group and less than or equal to the maximum size of the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withDesiredCapacity(
            Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes
     *        before another scaling activity can start. The default is 300.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *        >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     */

    public void setDefaultCooldown(Integer defaultCooldown) {
        this.defaultCooldown = defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, after a scaling activity
     *         completes before another scaling activity can start. The default
     *         is 300.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *         >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */

    public Integer getDefaultCooldown() {
        return this.defaultCooldown;
    }

    /**
     * <p>
     * The amount of time, in seconds, after a scaling activity completes before
     * another scaling activity can start. The default is 300.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     * >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param defaultCooldown
     *        The amount of time, in seconds, after a scaling activity completes
     *        before another scaling activity can start. The default is 300.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/Cooldown.html"
     *        >Understanding Auto Scaling Cooldowns</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withDefaultCooldown(
            Integer defaultCooldown) {
        setDefaultCooldown(defaultCooldown);
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify subnets using the <code>VPCZoneIdentifier</code>
     * parameter.
     * </p>
     * 
     * @return One or more Availability Zones for the group. This parameter is
     *         optional if you specify subnets using the
     *         <code>VPCZoneIdentifier</code> parameter.
     */

    public java.util.List<String> getAvailabilityZones() {
        if (availabilityZones == null) {
            availabilityZones = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return availabilityZones;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify subnets using the <code>VPCZoneIdentifier</code>
     * parameter.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is
     *        optional if you specify subnets using the
     *        <code>VPCZoneIdentifier</code> parameter.
     */

    public void setAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new com.amazonaws.internal.SdkInternalList<String>(
                availabilityZones);
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify subnets using the <code>VPCZoneIdentifier</code>
     * parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAvailabilityZones(java.util.Collection)} or
     * {@link #withAvailabilityZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is
     *        optional if you specify subnets using the
     *        <code>VPCZoneIdentifier</code> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withAvailabilityZones(
            String... availabilityZones) {
        if (this.availabilityZones == null) {
            setAvailabilityZones(new com.amazonaws.internal.SdkInternalList<String>(
                    availabilityZones.length));
        }
        for (String ele : availabilityZones) {
            this.availabilityZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Availability Zones for the group. This parameter is optional
     * if you specify subnets using the <code>VPCZoneIdentifier</code>
     * parameter.
     * </p>
     * 
     * @param availabilityZones
     *        One or more Availability Zones for the group. This parameter is
     *        optional if you specify subnets using the
     *        <code>VPCZoneIdentifier</code> parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withAvailabilityZones(
            java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @return One or more load balancers.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *         >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     *         Developer Guide</i>.
     */

    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return loadBalancerNames;
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *        >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     */

    public void setLoadBalancerNames(
            java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>(
                loadBalancerNames);
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLoadBalancerNames(java.util.Collection)} or
     * {@link #withLoadBalancerNames(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *        >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withLoadBalancerNames(
            String... loadBalancerNames) {
        if (this.loadBalancerNames == null) {
            setLoadBalancerNames(new com.amazonaws.internal.SdkInternalList<String>(
                    loadBalancerNames.length));
        }
        for (String ele : loadBalancerNames) {
            this.loadBalancerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more load balancers.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     * >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param loadBalancerNames
     *        One or more load balancers.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/US_SetUpASLBApp.html"
     *        >Load Balance Your Auto Scaling Group</a> in the <i>Auto Scaling
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withLoadBalancerNames(
            java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are
     *        <code>EC2</code> and <code>ELB</code>.</p>
     *        <p>
     *        By default, health checks use Amazon EC2 instance status checks to
     *        determine the health of an instance. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *        >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     */

    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @return The service to use for the health checks. The valid values are
     *         <code>EC2</code> and <code>ELB</code>.</p>
     *         <p>
     *         By default, health checks use Amazon EC2 instance status checks
     *         to determine the health of an instance. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *         >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     */

    public String getHealthCheckType() {
        return this.healthCheckType;
    }

    /**
     * <p>
     * The service to use for the health checks. The valid values are
     * <code>EC2</code> and <code>ELB</code>.
     * </p>
     * <p>
     * By default, health checks use Amazon EC2 instance status checks to
     * determine the health of an instance. For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param healthCheckType
     *        The service to use for the health checks. The valid values are
     *        <code>EC2</code> and <code>ELB</code>.</p>
     *        <p>
     *        By default, health checks use Amazon EC2 instance status checks to
     *        determine the health of an instance. For more information, see <a
     *        href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *        >Health Checks</a> in the <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withHealthCheckType(
            String healthCheckType) {
        setHealthCheckType(healthCheckType);
        return this;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks for Auto Scaling Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Auto Scaling waits before
     *        checking the health status of an EC2 instance that has come into
     *        service. During this time, any health check failures for the
     *        instance are ignored. The default is 300.</p>
     *        <p>
     *        This parameter is required if you are adding an <code>ELB</code>
     *        health check.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *        >Health Checks for Auto Scaling Instances</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     */

    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks for Auto Scaling Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @return The amount of time, in seconds, that Auto Scaling waits before
     *         checking the health status of an EC2 instance that has come into
     *         service. During this time, any health check failures for the
     *         instance are ignored. The default is 300.</p>
     *         <p>
     *         This parameter is required if you are adding an <code>ELB</code>
     *         health check.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *         >Health Checks for Auto Scaling Instances</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */

    public Integer getHealthCheckGracePeriod() {
        return this.healthCheckGracePeriod;
    }

    /**
     * <p>
     * The amount of time, in seconds, that Auto Scaling waits before checking
     * the health status of an EC2 instance that has come into service. During
     * this time, any health check failures for the instance are ignored. The
     * default is 300.
     * </p>
     * <p>
     * This parameter is required if you are adding an <code>ELB</code> health
     * check.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     * >Health Checks for Auto Scaling Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param healthCheckGracePeriod
     *        The amount of time, in seconds, that Auto Scaling waits before
     *        checking the health status of an EC2 instance that has come into
     *        service. During this time, any health check failures for the
     *        instance are ignored. The default is 300.</p>
     *        <p>
     *        This parameter is required if you are adding an <code>ELB</code>
     *        health check.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/healthcheck.html"
     *        >Health Checks for Auto Scaling Instances</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withHealthCheckGracePeriod(
            Integer healthCheckGracePeriod) {
        setHealthCheckGracePeriod(healthCheckGracePeriod);
        return this;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which you'll launch your
     *        instances, if any. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *        >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     */

    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return The name of the placement group into which you'll launch your
     *         instances, if any. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *         >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *         Guide</i>.
     */

    public String getPlacementGroup() {
        return this.placementGroup;
    }

    /**
     * <p>
     * The name of the placement group into which you'll launch your instances,
     * if any. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     * >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param placementGroup
     *        The name of the placement group into which you'll launch your
     *        instances, if any. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/placement-groups.html"
     *        >Placement Groups</a> in the <i>Amazon Elastic Compute Cloud User
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withPlacementGroup(
            String placementGroup) {
        setPlacementGroup(placementGroup);
        return this;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet identifiers for your virtual
     *        private cloud (VPC).</p>
     *        <p>
     *        If you specify subnets and Availability Zones with this call,
     *        ensure that the subnets' Availability Zones match the Availability
     *        Zones specified.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     */

    public void setVPCZoneIdentifier(String vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @return A comma-separated list of subnet identifiers for your virtual
     *         private cloud (VPC).</p>
     *         <p>
     *         If you specify subnets and Availability Zones with this call,
     *         ensure that the subnets' Availability Zones match the
     *         Availability Zones specified.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *         >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */

    public String getVPCZoneIdentifier() {
        return this.vPCZoneIdentifier;
    }

    /**
     * <p>
     * A comma-separated list of subnet identifiers for your virtual private
     * cloud (VPC).
     * </p>
     * <p>
     * If you specify subnets and Availability Zones with this call, ensure that
     * the subnets' Availability Zones match the Availability Zones specified.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     * >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param vPCZoneIdentifier
     *        A comma-separated list of subnet identifiers for your virtual
     *        private cloud (VPC).</p>
     *        <p>
     *        If you specify subnets and Availability Zones with this call,
     *        ensure that the subnets' Availability Zones match the Availability
     *        Zones specified.
     *        </p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/autoscalingsubnets.html"
     *        >Auto Scaling and Amazon Virtual Private Cloud</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withVPCZoneIdentifier(
            String vPCZoneIdentifier) {
        setVPCZoneIdentifier(vPCZoneIdentifier);
        return this;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     * >Choosing a Termination Policy for Your Auto Scaling Group</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @return One or more termination policies used to select the instance to
     *         terminate. These policies are executed in the order that they are
     *         listed.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     *         >Choosing a Termination Policy for Your Auto Scaling Group</a> in
     *         the <i>Auto Scaling Developer Guide</i>.
     */

    public java.util.List<String> getTerminationPolicies() {
        if (terminationPolicies == null) {
            terminationPolicies = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return terminationPolicies;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     * >Choosing a Termination Policy for Your Auto Scaling Group</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to
     *        terminate. These policies are executed in the order that they are
     *        listed.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     *        >Choosing a Termination Policy for Your Auto Scaling Group</a> in
     *        the <i>Auto Scaling Developer Guide</i>.
     */

    public void setTerminationPolicies(
            java.util.Collection<String> terminationPolicies) {
        if (terminationPolicies == null) {
            this.terminationPolicies = null;
            return;
        }

        this.terminationPolicies = new com.amazonaws.internal.SdkInternalList<String>(
                terminationPolicies);
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     * >Choosing a Termination Policy for Your Auto Scaling Group</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTerminationPolicies(java.util.Collection)} or
     * {@link #withTerminationPolicies(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to
     *        terminate. These policies are executed in the order that they are
     *        listed.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     *        >Choosing a Termination Policy for Your Auto Scaling Group</a> in
     *        the <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withTerminationPolicies(
            String... terminationPolicies) {
        if (this.terminationPolicies == null) {
            setTerminationPolicies(new com.amazonaws.internal.SdkInternalList<String>(
                    terminationPolicies.length));
        }
        for (String ele : terminationPolicies) {
            this.terminationPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more termination policies used to select the instance to
     * terminate. These policies are executed in the order that they are listed.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     * >Choosing a Termination Policy for Your Auto Scaling Group</a> in the
     * <i>Auto Scaling Developer Guide</i>.
     * </p>
     * 
     * @param terminationPolicies
     *        One or more termination policies used to select the instance to
     *        terminate. These policies are executed in the order that they are
     *        listed.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/us-termination-policy.html"
     *        >Choosing a Termination Policy for Your Auto Scaling Group</a> in
     *        the <i>Auto Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withTerminationPolicies(
            java.util.Collection<String> terminationPolicies) {
        setTerminationPolicies(terminationPolicies);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from
     *        termination by Auto Scaling when scaling in.
     */

    public void setNewInstancesProtectedFromScaleIn(
            Boolean newInstancesProtectedFromScaleIn) {
        this.newInstancesProtectedFromScaleIn = newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from
     *         termination by Auto Scaling when scaling in.
     */

    public Boolean getNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     * 
     * @param newInstancesProtectedFromScaleIn
     *        Indicates whether newly launched instances are protected from
     *        termination by Auto Scaling when scaling in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withNewInstancesProtectedFromScaleIn(
            Boolean newInstancesProtectedFromScaleIn) {
        setNewInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn);
        return this;
    }

    /**
     * <p>
     * Indicates whether newly launched instances are protected from termination
     * by Auto Scaling when scaling in.
     * </p>
     * 
     * @return Indicates whether newly launched instances are protected from
     *         termination by Auto Scaling when scaling in.
     */

    public Boolean isNewInstancesProtectedFromScaleIn() {
        return this.newInstancesProtectedFromScaleIn;
    }

    /**
     * <p>
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @return The tag to be created or updated. Each tag should be defined by
     *         its resource type, resource ID, key, value, and a propagate flag.
     *         Valid values: key=<i>value</i>, value=<i>value</i>,
     *         propagate=<i>true</i> or <i>false</i>. Value and propagate are
     *         optional parameters.</p>
     *         <p>
     *         For more information, see <a href=
     *         "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *         >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *         Scaling Developer Guide</i>.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tag to be created or updated. Each tag should be defined by
     *        its resource type, resource ID, key, value, and a propagate flag.
     *        Valid values: key=<i>value</i>, value=<i>value</i>,
     *        propagate=<i>true</i> or <i>false</i>. Value and propagate are
     *        optional parameters.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *        >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or
     * {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag to be created or updated. Each tag should be defined by
     *        its resource type, resource ID, key, value, and a propagate flag.
     *        Valid values: key=<i>value</i>, value=<i>value</i>,
     *        propagate=<i>true</i> or <i>false</i>. Value and propagate are
     *        optional parameters.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *        >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag to be created or updated. Each tag should be defined by its
     * resource type, resource ID, key, value, and a propagate flag. Valid
     * values: key=<i>value</i>, value=<i>value</i>, propagate=<i>true</i> or
     * <i>false</i>. Value and propagate are optional parameters.
     * </p>
     * <p>
     * For more information, see <a href=
     * "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     * >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto Scaling
     * Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        The tag to be created or updated. Each tag should be defined by
     *        its resource type, resource ID, key, value, and a propagate flag.
     *        Valid values: key=<i>value</i>, value=<i>value</i>,
     *        propagate=<i>true</i> or <i>false</i>. Value and propagate are
     *        optional parameters.</p>
     *        <p>
     *        For more information, see <a href=
     *        "http://docs.aws.amazon.com/AutoScaling/latest/DeveloperGuide/ASTagging.html"
     *        >Tagging Auto Scaling Groups and Instances</a> in the <i>Auto
     *        Scaling Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAutoScalingGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName()
                    + ",");
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: "
                    + getLaunchConfigurationName() + ",");
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity() + ",");
        if (getDefaultCooldown() != null)
            sb.append("DefaultCooldown: " + getDefaultCooldown() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: " + getLoadBalancerNames() + ",");
        if (getHealthCheckType() != null)
            sb.append("HealthCheckType: " + getHealthCheckType() + ",");
        if (getHealthCheckGracePeriod() != null)
            sb.append("HealthCheckGracePeriod: " + getHealthCheckGracePeriod()
                    + ",");
        if (getPlacementGroup() != null)
            sb.append("PlacementGroup: " + getPlacementGroup() + ",");
        if (getVPCZoneIdentifier() != null)
            sb.append("VPCZoneIdentifier: " + getVPCZoneIdentifier() + ",");
        if (getTerminationPolicies() != null)
            sb.append("TerminationPolicies: " + getTerminationPolicies() + ",");
        if (getNewInstancesProtectedFromScaleIn() != null)
            sb.append("NewInstancesProtectedFromScaleIn: "
                    + getNewInstancesProtectedFromScaleIn() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAutoScalingGroupRequest == false)
            return false;
        CreateAutoScalingGroupRequest other = (CreateAutoScalingGroupRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLaunchConfigurationName() == null
                ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(
                        this.getLaunchConfigurationName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getMinSize() == null ^ this.getMinSize() == null)
            return false;
        if (other.getMinSize() != null
                && other.getMinSize().equals(this.getMinSize()) == false)
            return false;
        if (other.getMaxSize() == null ^ this.getMaxSize() == null)
            return false;
        if (other.getMaxSize() != null
                && other.getMaxSize().equals(this.getMaxSize()) == false)
            return false;
        if (other.getDesiredCapacity() == null
                ^ this.getDesiredCapacity() == null)
            return false;
        if (other.getDesiredCapacity() != null
                && other.getDesiredCapacity().equals(this.getDesiredCapacity()) == false)
            return false;
        if (other.getDefaultCooldown() == null
                ^ this.getDefaultCooldown() == null)
            return false;
        if (other.getDefaultCooldown() != null
                && other.getDefaultCooldown().equals(this.getDefaultCooldown()) == false)
            return false;
        if (other.getAvailabilityZones() == null
                ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(
                        this.getAvailabilityZones()) == false)
            return false;
        if (other.getLoadBalancerNames() == null
                ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null
                && other.getLoadBalancerNames().equals(
                        this.getLoadBalancerNames()) == false)
            return false;
        if (other.getHealthCheckType() == null
                ^ this.getHealthCheckType() == null)
            return false;
        if (other.getHealthCheckType() != null
                && other.getHealthCheckType().equals(this.getHealthCheckType()) == false)
            return false;
        if (other.getHealthCheckGracePeriod() == null
                ^ this.getHealthCheckGracePeriod() == null)
            return false;
        if (other.getHealthCheckGracePeriod() != null
                && other.getHealthCheckGracePeriod().equals(
                        this.getHealthCheckGracePeriod()) == false)
            return false;
        if (other.getPlacementGroup() == null
                ^ this.getPlacementGroup() == null)
            return false;
        if (other.getPlacementGroup() != null
                && other.getPlacementGroup().equals(this.getPlacementGroup()) == false)
            return false;
        if (other.getVPCZoneIdentifier() == null
                ^ this.getVPCZoneIdentifier() == null)
            return false;
        if (other.getVPCZoneIdentifier() != null
                && other.getVPCZoneIdentifier().equals(
                        this.getVPCZoneIdentifier()) == false)
            return false;
        if (other.getTerminationPolicies() == null
                ^ this.getTerminationPolicies() == null)
            return false;
        if (other.getTerminationPolicies() != null
                && other.getTerminationPolicies().equals(
                        this.getTerminationPolicies()) == false)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() == null
                ^ this.getNewInstancesProtectedFromScaleIn() == null)
            return false;
        if (other.getNewInstancesProtectedFromScaleIn() != null
                && other.getNewInstancesProtectedFromScaleIn().equals(
                        this.getNewInstancesProtectedFromScaleIn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null
                && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAutoScalingGroupName() == null) ? 0
                        : getAutoScalingGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0
                        : getLaunchConfigurationName().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDefaultCooldown() == null) ? 0 : getDefaultCooldown()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailabilityZones() == null) ? 0
                        : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getLoadBalancerNames() == null) ? 0
                        : getLoadBalancerNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckType() == null) ? 0 : getHealthCheckType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getHealthCheckGracePeriod() == null) ? 0
                        : getHealthCheckGracePeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getPlacementGroup() == null) ? 0 : getPlacementGroup()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getVPCZoneIdentifier() == null) ? 0
                        : getVPCZoneIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getTerminationPolicies() == null) ? 0
                        : getTerminationPolicies().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewInstancesProtectedFromScaleIn() == null) ? 0
                        : getNewInstancesProtectedFromScaleIn().hashCode());
        hashCode = prime * hashCode
                + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAutoScalingGroupRequest clone() {
        return (CreateAutoScalingGroupRequest) super.clone();
    }
}