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

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * You start an assessment run and one of the instances is already participating
 * in another assessment run.
 * </p>
 */
public class AgentsAlreadyRunningAssessmentException extends
        AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /** <p/> */
    @com.fasterxml.jackson.annotation.JsonProperty("agents")
    private java.util.List<AgentAlreadyRunningAssessment> agents;
    /** <p/> */
    @com.fasterxml.jackson.annotation.JsonProperty("agentsTruncated")
    private Boolean agentsTruncated;
    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canRetry")
    private Boolean canRetry;

    /**
     * Constructs a new AgentsAlreadyRunningAssessmentException with the
     * specified error message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public AgentsAlreadyRunningAssessmentException(String message) {
        super(message);
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.List<AgentAlreadyRunningAssessment> getAgents() {
        return agents;
    }

    /**
     * <p/>
     * 
     * @param agents
     */

    public void setAgents(
            java.util.Collection<AgentAlreadyRunningAssessment> agents) {
        if (agents == null) {
            this.agents = null;
            return;
        }

        this.agents = new java.util.ArrayList<AgentAlreadyRunningAssessment>(
                agents);
    }

    /**
     * <p/>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAgents(java.util.Collection)} or
     * {@link #withAgents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param agents
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AgentsAlreadyRunningAssessmentException withAgents(
            AgentAlreadyRunningAssessment... agents) {
        if (this.agents == null) {
            setAgents(new java.util.ArrayList<AgentAlreadyRunningAssessment>(
                    agents.length));
        }
        for (AgentAlreadyRunningAssessment ele : agents) {
            this.agents.add(ele);
        }
        return this;
    }

    /**
     * <p/>
     * 
     * @param agents
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AgentsAlreadyRunningAssessmentException withAgents(
            java.util.Collection<AgentAlreadyRunningAssessment> agents) {
        setAgents(agents);
        return this;
    }

    /**
     * <p/>
     * 
     * @param agentsTruncated
     */

    public void setAgentsTruncated(Boolean agentsTruncated) {
        this.agentsTruncated = agentsTruncated;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean getAgentsTruncated() {
        return this.agentsTruncated;
    }

    /**
     * <p/>
     * 
     * @param agentsTruncated
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AgentsAlreadyRunningAssessmentException withAgentsTruncated(
            Boolean agentsTruncated) {
        setAgentsTruncated(agentsTruncated);
        return this;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public Boolean isAgentsTruncated() {
        return this.agentsTruncated;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     */

    public void setCanRetry(Boolean canRetry) {
        this.canRetry = canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean getCanRetry() {
        return this.canRetry;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @param canRetry
     *        You can immediately retry your request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AgentsAlreadyRunningAssessmentException withCanRetry(Boolean canRetry) {
        setCanRetry(canRetry);
        return this;
    }

    /**
     * <p>
     * You can immediately retry your request.
     * </p>
     * 
     * @return You can immediately retry your request.
     */

    public Boolean isCanRetry() {
        return this.canRetry;
    }

}