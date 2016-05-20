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
public class DescribeAlarmsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> alarmNames;
    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     */
    private String alarmNamePrefix;
    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     */
    private String stateValue;
    /**
     * <p>
     * The action name prefix.
     * </p>
     */
    private String actionPrefix;
    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * 
     * @return A list of alarm names to retrieve information for.
     */

    public java.util.List<String> getAlarmNames() {
        if (alarmNames == null) {
            alarmNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return alarmNames;
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarm names to retrieve information for.
     */

    public void setAlarmNames(java.util.Collection<String> alarmNames) {
        if (alarmNames == null) {
            this.alarmNames = null;
            return;
        }

        this.alarmNames = new com.amazonaws.internal.SdkInternalList<String>(
                alarmNames);
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAlarmNames(java.util.Collection)} or
     * {@link #withAlarmNames(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarm names to retrieve information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(String... alarmNames) {
        if (this.alarmNames == null) {
            setAlarmNames(new com.amazonaws.internal.SdkInternalList<String>(
                    alarmNames.length));
        }
        for (String ele : alarmNames) {
            this.alarmNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of alarm names to retrieve information for.
     * </p>
     * 
     * @param alarmNames
     *        A list of alarm names to retrieve information for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withAlarmNames(
            java.util.Collection<String> alarmNames) {
        setAlarmNames(alarmNames);
        return this;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * 
     * @param alarmNamePrefix
     *        The alarm name prefix. <code>AlarmNames</code> cannot be specified
     *        if this parameter is specified.
     */

    public void setAlarmNamePrefix(String alarmNamePrefix) {
        this.alarmNamePrefix = alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * 
     * @return The alarm name prefix. <code>AlarmNames</code> cannot be
     *         specified if this parameter is specified.
     */

    public String getAlarmNamePrefix() {
        return this.alarmNamePrefix;
    }

    /**
     * <p>
     * The alarm name prefix. <code>AlarmNames</code> cannot be specified if
     * this parameter is specified.
     * </p>
     * 
     * @param alarmNamePrefix
     *        The alarm name prefix. <code>AlarmNames</code> cannot be specified
     *        if this parameter is specified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withAlarmNamePrefix(String alarmNamePrefix) {
        setAlarmNamePrefix(alarmNamePrefix);
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @see StateValue
     */

    public void setStateValue(String stateValue) {
        this.stateValue = stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @return The state value to be used in matching alarms.
     * @see StateValue
     */

    public String getStateValue() {
        return this.stateValue;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(String stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public void setStateValue(StateValue stateValue) {
        this.stateValue = stateValue.toString();
    }

    /**
     * <p>
     * The state value to be used in matching alarms.
     * </p>
     * 
     * @param stateValue
     *        The state value to be used in matching alarms.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StateValue
     */

    public DescribeAlarmsRequest withStateValue(StateValue stateValue) {
        setStateValue(stateValue);
        return this;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @param actionPrefix
     *        The action name prefix.
     */

    public void setActionPrefix(String actionPrefix) {
        this.actionPrefix = actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @return The action name prefix.
     */

    public String getActionPrefix() {
        return this.actionPrefix;
    }

    /**
     * <p>
     * The action name prefix.
     * </p>
     * 
     * @param actionPrefix
     *        The action name prefix.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withActionPrefix(String actionPrefix) {
        setActionPrefix(actionPrefix);
        return this;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @return The maximum number of alarm descriptions to retrieve.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of alarm descriptions to retrieve.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of alarm descriptions to retrieve.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is
     *        more data available.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * 
     * @return The token returned by a previous call to indicate that there is
     *         more data available.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token returned by a previous call to indicate that there is more data
     * available.
     * </p>
     * 
     * @param nextToken
     *        The token returned by a previous call to indicate that there is
     *        more data available.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getAlarmNames() != null)
            sb.append("AlarmNames: " + getAlarmNames() + ",");
        if (getAlarmNamePrefix() != null)
            sb.append("AlarmNamePrefix: " + getAlarmNamePrefix() + ",");
        if (getStateValue() != null)
            sb.append("StateValue: " + getStateValue() + ",");
        if (getActionPrefix() != null)
            sb.append("ActionPrefix: " + getActionPrefix() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAlarmsRequest == false)
            return false;
        DescribeAlarmsRequest other = (DescribeAlarmsRequest) obj;
        if (other.getAlarmNames() == null ^ this.getAlarmNames() == null)
            return false;
        if (other.getAlarmNames() != null
                && other.getAlarmNames().equals(this.getAlarmNames()) == false)
            return false;
        if (other.getAlarmNamePrefix() == null
                ^ this.getAlarmNamePrefix() == null)
            return false;
        if (other.getAlarmNamePrefix() != null
                && other.getAlarmNamePrefix().equals(this.getAlarmNamePrefix()) == false)
            return false;
        if (other.getStateValue() == null ^ this.getStateValue() == null)
            return false;
        if (other.getStateValue() != null
                && other.getStateValue().equals(this.getStateValue()) == false)
            return false;
        if (other.getActionPrefix() == null ^ this.getActionPrefix() == null)
            return false;
        if (other.getActionPrefix() != null
                && other.getActionPrefix().equals(this.getActionPrefix()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAlarmNames() == null) ? 0 : getAlarmNames().hashCode());
        hashCode = prime
                * hashCode
                + ((getAlarmNamePrefix() == null) ? 0 : getAlarmNamePrefix()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStateValue() == null) ? 0 : getStateValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getActionPrefix() == null) ? 0 : getActionPrefix()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmsRequest clone() {
        return (DescribeAlarmsRequest) super.clone();
    }
}