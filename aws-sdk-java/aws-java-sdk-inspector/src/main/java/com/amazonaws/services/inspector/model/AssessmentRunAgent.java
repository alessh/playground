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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an Inspector agent. This data type is used as a
 * response element in the <a>ListAssessmentRunAgents</a> action.
 * </p>
 */
public class AssessmentRunAgent implements Serializable, Cloneable {

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     */
    private String agentId;
    /**
     * <p>
     * The ARN of the assessment run that is associated with the agent.
     * </p>
     */
    private String assessmentRunArn;
    /**
     * <p>
     * The current health state of the agent.
     * </p>
     */
    private String agentHealth;
    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     */
    private String agentHealthCode;
    /**
     * <p>
     * The description for the agent health code.
     * </p>
     */
    private String agentHealthDetails;
    /**
     * <p>
     * The auto-scaling group of the EC2 instance specified by the agent ID.
     * </p>
     */
    private String autoScalingGroup;
    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     */
    private java.util.List<TelemetryMetadata> telemetryMetadata;

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        AWS account of the EC2 instance where the agent is installed.
     */

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @return AWS account of the EC2 instance where the agent is installed.
     */

    public String getAgentId() {
        return this.agentId;
    }

    /**
     * <p>
     * AWS account of the EC2 instance where the agent is installed.
     * </p>
     * 
     * @param agentId
     *        AWS account of the EC2 instance where the agent is installed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withAgentId(String agentId) {
        setAgentId(agentId);
        return this;
    }

    /**
     * <p>
     * The ARN of the assessment run that is associated with the agent.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that is associated with the agent.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that is associated with the agent.
     * </p>
     * 
     * @return The ARN of the assessment run that is associated with the agent.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN of the assessment run that is associated with the agent.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN of the assessment run that is associated with the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withAssessmentRunArn(String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
        return this;
    }

    /**
     * <p>
     * The current health state of the agent.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent.
     * @see AgentHealth
     */

    public void setAgentHealth(String agentHealth) {
        this.agentHealth = agentHealth;
    }

    /**
     * <p>
     * The current health state of the agent.
     * </p>
     * 
     * @return The current health state of the agent.
     * @see AgentHealth
     */

    public String getAgentHealth() {
        return this.agentHealth;
    }

    /**
     * <p>
     * The current health state of the agent.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealth
     */

    public AssessmentRunAgent withAgentHealth(String agentHealth) {
        setAgentHealth(agentHealth);
        return this;
    }

    /**
     * <p>
     * The current health state of the agent.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealth
     */

    public void setAgentHealth(AgentHealth agentHealth) {
        this.agentHealth = agentHealth.toString();
    }

    /**
     * <p>
     * The current health state of the agent.
     * </p>
     * 
     * @param agentHealth
     *        The current health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealth
     */

    public AssessmentRunAgent withAgentHealth(AgentHealth agentHealth) {
        setAgentHealth(agentHealth);
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent.
     * @see AgentHealthCode
     */

    public void setAgentHealthCode(String agentHealthCode) {
        this.agentHealthCode = agentHealthCode;
    }

    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     * 
     * @return The detailed health state of the agent.
     * @see AgentHealthCode
     */

    public String getAgentHealthCode() {
        return this.agentHealthCode;
    }

    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealthCode
     */

    public AssessmentRunAgent withAgentHealthCode(String agentHealthCode) {
        setAgentHealthCode(agentHealthCode);
        return this;
    }

    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealthCode
     */

    public void setAgentHealthCode(AgentHealthCode agentHealthCode) {
        this.agentHealthCode = agentHealthCode.toString();
    }

    /**
     * <p>
     * The detailed health state of the agent.
     * </p>
     * 
     * @param agentHealthCode
     *        The detailed health state of the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see AgentHealthCode
     */

    public AssessmentRunAgent withAgentHealthCode(
            AgentHealthCode agentHealthCode) {
        setAgentHealthCode(agentHealthCode);
        return this;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @param agentHealthDetails
     *        The description for the agent health code.
     */

    public void setAgentHealthDetails(String agentHealthDetails) {
        this.agentHealthDetails = agentHealthDetails;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @return The description for the agent health code.
     */

    public String getAgentHealthDetails() {
        return this.agentHealthDetails;
    }

    /**
     * <p>
     * The description for the agent health code.
     * </p>
     * 
     * @param agentHealthDetails
     *        The description for the agent health code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withAgentHealthDetails(String agentHealthDetails) {
        setAgentHealthDetails(agentHealthDetails);
        return this;
    }

    /**
     * <p>
     * The auto-scaling group of the EC2 instance specified by the agent ID.
     * </p>
     * 
     * @param autoScalingGroup
     *        The auto-scaling group of the EC2 instance specified by the agent
     *        ID.
     */

    public void setAutoScalingGroup(String autoScalingGroup) {
        this.autoScalingGroup = autoScalingGroup;
    }

    /**
     * <p>
     * The auto-scaling group of the EC2 instance specified by the agent ID.
     * </p>
     * 
     * @return The auto-scaling group of the EC2 instance specified by the agent
     *         ID.
     */

    public String getAutoScalingGroup() {
        return this.autoScalingGroup;
    }

    /**
     * <p>
     * The auto-scaling group of the EC2 instance specified by the agent ID.
     * </p>
     * 
     * @param autoScalingGroup
     *        The auto-scaling group of the EC2 instance specified by the agent
     *        ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withAutoScalingGroup(String autoScalingGroup) {
        setAutoScalingGroup(autoScalingGroup);
        return this;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @return The Inspector application data metrics collected by the agent.
     */

    public java.util.List<TelemetryMetadata> getTelemetryMetadata() {
        return telemetryMetadata;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @param telemetryMetadata
     *        The Inspector application data metrics collected by the agent.
     */

    public void setTelemetryMetadata(
            java.util.Collection<TelemetryMetadata> telemetryMetadata) {
        if (telemetryMetadata == null) {
            this.telemetryMetadata = null;
            return;
        }

        this.telemetryMetadata = new java.util.ArrayList<TelemetryMetadata>(
                telemetryMetadata);
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTelemetryMetadata(java.util.Collection)} or
     * {@link #withTelemetryMetadata(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param telemetryMetadata
     *        The Inspector application data metrics collected by the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withTelemetryMetadata(
            TelemetryMetadata... telemetryMetadata) {
        if (this.telemetryMetadata == null) {
            setTelemetryMetadata(new java.util.ArrayList<TelemetryMetadata>(
                    telemetryMetadata.length));
        }
        for (TelemetryMetadata ele : telemetryMetadata) {
            this.telemetryMetadata.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Inspector application data metrics collected by the agent.
     * </p>
     * 
     * @param telemetryMetadata
     *        The Inspector application data metrics collected by the agent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentRunAgent withTelemetryMetadata(
            java.util.Collection<TelemetryMetadata> telemetryMetadata) {
        setTelemetryMetadata(telemetryMetadata);
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
        if (getAgentId() != null)
            sb.append("AgentId: " + getAgentId() + ",");
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: " + getAssessmentRunArn() + ",");
        if (getAgentHealth() != null)
            sb.append("AgentHealth: " + getAgentHealth() + ",");
        if (getAgentHealthCode() != null)
            sb.append("AgentHealthCode: " + getAgentHealthCode() + ",");
        if (getAgentHealthDetails() != null)
            sb.append("AgentHealthDetails: " + getAgentHealthDetails() + ",");
        if (getAutoScalingGroup() != null)
            sb.append("AutoScalingGroup: " + getAutoScalingGroup() + ",");
        if (getTelemetryMetadata() != null)
            sb.append("TelemetryMetadata: " + getTelemetryMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentRunAgent == false)
            return false;
        AssessmentRunAgent other = (AssessmentRunAgent) obj;
        if (other.getAgentId() == null ^ this.getAgentId() == null)
            return false;
        if (other.getAgentId() != null
                && other.getAgentId().equals(this.getAgentId()) == false)
            return false;
        if (other.getAssessmentRunArn() == null
                ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null
                && other.getAssessmentRunArn().equals(
                        this.getAssessmentRunArn()) == false)
            return false;
        if (other.getAgentHealth() == null ^ this.getAgentHealth() == null)
            return false;
        if (other.getAgentHealth() != null
                && other.getAgentHealth().equals(this.getAgentHealth()) == false)
            return false;
        if (other.getAgentHealthCode() == null
                ^ this.getAgentHealthCode() == null)
            return false;
        if (other.getAgentHealthCode() != null
                && other.getAgentHealthCode().equals(this.getAgentHealthCode()) == false)
            return false;
        if (other.getAgentHealthDetails() == null
                ^ this.getAgentHealthDetails() == null)
            return false;
        if (other.getAgentHealthDetails() != null
                && other.getAgentHealthDetails().equals(
                        this.getAgentHealthDetails()) == false)
            return false;
        if (other.getAutoScalingGroup() == null
                ^ this.getAutoScalingGroup() == null)
            return false;
        if (other.getAutoScalingGroup() != null
                && other.getAutoScalingGroup().equals(
                        this.getAutoScalingGroup()) == false)
            return false;
        if (other.getTelemetryMetadata() == null
                ^ this.getTelemetryMetadata() == null)
            return false;
        if (other.getTelemetryMetadata() != null
                && other.getTelemetryMetadata().equals(
                        this.getTelemetryMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAgentId() == null) ? 0 : getAgentId().hashCode());
        hashCode = prime
                * hashCode
                + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealth() == null) ? 0 : getAgentHealth().hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealthCode() == null) ? 0 : getAgentHealthCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getAgentHealthDetails() == null) ? 0
                        : getAgentHealthDetails().hashCode());
        hashCode = prime
                * hashCode
                + ((getAutoScalingGroup() == null) ? 0 : getAutoScalingGroup()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTelemetryMetadata() == null) ? 0
                        : getTelemetryMetadata().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentRunAgent clone() {
        try {
            return (AssessmentRunAgent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
