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

/**
 * <p>
 * The output for the <a>DescribeAlarms</a> action.
 * </p>
 */
public class DescribeAlarmsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<MetricAlarm> metricAlarms;
    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * 
     * @return A list of information for the specified alarms.
     */

    public java.util.List<MetricAlarm> getMetricAlarms() {
        if (metricAlarms == null) {
            metricAlarms = new com.amazonaws.internal.SdkInternalList<MetricAlarm>();
        }
        return metricAlarms;
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * 
     * @param metricAlarms
     *        A list of information for the specified alarms.
     */

    public void setMetricAlarms(java.util.Collection<MetricAlarm> metricAlarms) {
        if (metricAlarms == null) {
            this.metricAlarms = null;
            return;
        }

        this.metricAlarms = new com.amazonaws.internal.SdkInternalList<MetricAlarm>(
                metricAlarms);
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setMetricAlarms(java.util.Collection)} or
     * {@link #withMetricAlarms(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param metricAlarms
     *        A list of information for the specified alarms.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsResult withMetricAlarms(MetricAlarm... metricAlarms) {
        if (this.metricAlarms == null) {
            setMetricAlarms(new com.amazonaws.internal.SdkInternalList<MetricAlarm>(
                    metricAlarms.length));
        }
        for (MetricAlarm ele : metricAlarms) {
            this.metricAlarms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of information for the specified alarms.
     * </p>
     * 
     * @param metricAlarms
     *        A list of information for the specified alarms.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsResult withMetricAlarms(
            java.util.Collection<MetricAlarm> metricAlarms) {
        setMetricAlarms(metricAlarms);
        return this;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @return A string that marks the start of the next batch of returned
     *         results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A string that marks the start of the next batch of returned results.
     * </p>
     * 
     * @param nextToken
     *        A string that marks the start of the next batch of returned
     *        results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAlarmsResult withNextToken(String nextToken) {
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
        if (getMetricAlarms() != null)
            sb.append("MetricAlarms: " + getMetricAlarms() + ",");
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

        if (obj instanceof DescribeAlarmsResult == false)
            return false;
        DescribeAlarmsResult other = (DescribeAlarmsResult) obj;
        if (other.getMetricAlarms() == null ^ this.getMetricAlarms() == null)
            return false;
        if (other.getMetricAlarms() != null
                && other.getMetricAlarms().equals(this.getMetricAlarms()) == false)
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

        hashCode = prime
                * hashCode
                + ((getMetricAlarms() == null) ? 0 : getMetricAlarms()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAlarmsResult clone() {
        try {
            return (DescribeAlarmsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
