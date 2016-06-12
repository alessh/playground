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

package com.amazonaws.services.cloudwatch.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SetAlarmStateRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account. The maximum length is 255 characters.
     * </p>
     */
    private String alarmName;
    /**
     * <p>
     * The value of the state.
     * </p>
     */
    private String stateValue;
    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * </p>
     */
    private String stateReasonData;

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account. The maximum length is 255 characters.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm. This name must be unique
     *        within the user's AWS account. The maximum length is 255
     *        characters.
     */

    public void setAlarmName(String alarmName) {
        this.alarmName = alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account. The maximum length is 255 characters.
     * </p>
     * 
     * @return The descriptive name for the alarm. This name must be unique
     *         within the user's AWS account. The maximum length is 255
     *         characters.
     */

    public String getAlarmName() {
        return this.alarmName;
    }

    /**
     * <p>
     * The descriptive name for the alarm. This name must be unique within the
     * user's AWS account. The maximum length is 255 characters.
     * </p>
     * 
     * @param alarmName
     *        The descriptive name for the alarm. This name must be unique
     *        within the user's AWS account. The maximum length is 255
     *        characters.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetAlarmStateRequest withAlarmName(String alarmName) {
        setAlarmName(alarmName);
        return this;
    }

    /**
     * <p>
     * The value of the state.
     * </p>
     * 
     * @param stateValue
     *        The value of the state.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The value of the state.
     * </p>
     * 
     * @return The value of the state.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The value of the state.
     * </p>
     * 
     * @param stateValue
     *        The value of the state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public SetAlarmStateRequest withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The value of the state.
     * </p>
     * 
     * @param stateValue
     *        The value of the state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public void setStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
    }

    /**
     * <p>
     * The value of the state.
     * </p>
     * 
     * @param stateValue
     *        The value of the state.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public SetAlarmStateRequest withStateValue(StateValue stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * </p>
     * 
     * @param stateReason
     *        The reason that this alarm is set to this specific state (in
     *        human-readable text format)
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * </p>
     * 
     * @return The reason that this alarm is set to this specific state (in
     *         human-readable text format)
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * human-readable text format)
     * </p>
     * 
     * @param stateReason
     *        The reason that this alarm is set to this specific state (in
     *        human-readable text format)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetAlarmStateRequest withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * </p>
     * 
     * @param stateReasonData
     *        The reason that this alarm is set to this specific state (in
     *        machine-readable JSON format)
     */

    public void setStateReasonData(String stateReasonData) {
        this.stateReasonData = stateReasonData;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * </p>
     * 
     * @return The reason that this alarm is set to this specific state (in
     *         machine-readable JSON format)
     */

    public String getStateReasonData() {
        return this.stateReasonData;
    }

    /**
     * <p>
     * The reason that this alarm is set to this specific state (in
     * machine-readable JSON format)
     * </p>
     * 
     * @param stateReasonData
     *        The reason that this alarm is set to this specific state (in
     *        machine-readable JSON format)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SetAlarmStateRequest withStateReasonData(String stateReasonData) {
        setStateReasonData(stateReasonData);
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
        if (getAlarmName() != null)
            sb.append("AlarmName: " + getAlarmName() + ",");
        if (getStateValue() != null)
            sb.append("StateValue: " + getStateValue() + ",");
        if (getStateReason() != null)
            sb.append("StateReason: " + getStateReason() + ",");
        if (getStateReasonData() != null)
            sb.append("StateReasonData: " + getStateReasonData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetAlarmStateRequest == false)
            return false;
        SetAlarmStateRequest other = (SetAlarmStateRequest) obj;
        if (other.getAlarmName() == null ^ this.getAlarmName() == null)
            return false;
        if (other.getAlarmName() != null
                && other.getAlarmName().equals(this.getAlarmName()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null
                && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null
                && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getStateReasonData() == null
                ^ this.getStateReasonData() == null)
            return false;
        if (other.getStateReasonData() != null
                && other.getStateReasonData().equals(this.getStateReasonData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlarmName() == null) ? 0 : getAlarmName().hashCode());
        hashCode = prime * hashCode
                + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getStateReasonData() == null) ? 0 : getStateReasonData()
                        .hashCode());
        return hashCode;
    }

    @Override
    public SetAlarmStateRequest clone() {
        return (SetAlarmStateRequest) super.clone();
    }
}