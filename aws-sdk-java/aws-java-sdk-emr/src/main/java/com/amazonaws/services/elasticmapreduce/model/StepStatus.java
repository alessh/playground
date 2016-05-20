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
 * The execution status details of the cluster step.
 * </p>
 */
public class StepStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     */
    private StepStateChangeReason stateChangeReason;
    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     */
    private StepTimeline timeline;

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @see StepState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @return The execution state of the cluster step.
     * @see StepState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StepState
     */

    public StepStatus withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StepState
     */

    public void setState(StepState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The execution state of the cluster step.
     * </p>
     * 
     * @param state
     *        The execution state of the cluster step.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StepState
     */

    public StepStatus withState(StepState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the step execution status change.
     */

    public void setStateChangeReason(StepStateChangeReason stateChangeReason) {
        this.stateChangeReason = stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @return The reason for the step execution status change.
     */

    public StepStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * <p>
     * The reason for the step execution status change.
     * </p>
     * 
     * @param stateChangeReason
     *        The reason for the step execution status change.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StepStatus withStateChangeReason(
            StepStateChangeReason stateChangeReason) {
        setStateChangeReason(stateChangeReason);
        return this;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the cluster step status over time.
     */

    public void setTimeline(StepTimeline timeline) {
        this.timeline = timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @return The timeline of the cluster step status over time.
     */

    public StepTimeline getTimeline() {
        return this.timeline;
    }

    /**
     * <p>
     * The timeline of the cluster step status over time.
     * </p>
     * 
     * @param timeline
     *        The timeline of the cluster step status over time.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StepStatus withTimeline(StepTimeline timeline) {
        setTimeline(timeline);
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getStateChangeReason() != null)
            sb.append("StateChangeReason: " + getStateChangeReason() + ",");
        if (getTimeline() != null)
            sb.append("Timeline: " + getTimeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StepStatus == false)
            return false;
        StepStatus other = (StepStatus) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateChangeReason() == null
                ^ this.getStateChangeReason() == null)
            return false;
        if (other.getStateChangeReason() != null
                && other.getStateChangeReason().equals(
                        this.getStateChangeReason()) == false)
            return false;
        if (other.getTimeline() == null ^ this.getTimeline() == null)
            return false;
        if (other.getTimeline() != null
                && other.getTimeline().equals(this.getTimeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateChangeReason() == null) ? 0
                        : getStateChangeReason().hashCode());
        hashCode = prime * hashCode
                + ((getTimeline() == null) ? 0 : getTimeline().hashCode());
        return hashCode;
    }

    @Override
    public StepStatus clone() {
        try {
            return (StepStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
