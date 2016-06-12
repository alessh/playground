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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class LogGroup implements Serializable, Cloneable {

    private String logGroupName;

    private Long creationTime;

    private Integer retentionInDays;

    private Integer metricFilterCount;

    private String arn;

    private Long storedBytes;

    /**
     * @param logGroupName
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * @return
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * @param logGroupName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(Long creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public Long getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withCreationTime(Long creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * @param retentionInDays
     */

    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * @return
     */

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * @param retentionInDays
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withRetentionInDays(Integer retentionInDays) {
        setRetentionInDays(retentionInDays);
        return this;
    }

    /**
     * @param metricFilterCount
     */

    public void setMetricFilterCount(Integer metricFilterCount) {
        this.metricFilterCount = metricFilterCount;
    }

    /**
     * @return
     */

    public Integer getMetricFilterCount() {
        return this.metricFilterCount;
    }

    /**
     * @param metricFilterCount
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withMetricFilterCount(Integer metricFilterCount) {
        setMetricFilterCount(metricFilterCount);
        return this;
    }

    /**
     * @param arn
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * @return
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * @param arn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * @param storedBytes
     */

    public void setStoredBytes(Long storedBytes) {
        this.storedBytes = storedBytes;
    }

    /**
     * @return
     */

    public Long getStoredBytes() {
        return this.storedBytes;
    }

    /**
     * @param storedBytes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public LogGroup withStoredBytes(Long storedBytes) {
        setStoredBytes(storedBytes);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getCreationTime() != null)
            sb.append("CreationTime: " + getCreationTime() + ",");
        if (getRetentionInDays() != null)
            sb.append("RetentionInDays: " + getRetentionInDays() + ",");
        if (getMetricFilterCount() != null)
            sb.append("MetricFilterCount: " + getMetricFilterCount() + ",");
        if (getArn() != null)
            sb.append("Arn: " + getArn() + ",");
        if (getStoredBytes() != null)
            sb.append("StoredBytes: " + getStoredBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LogGroup == false)
            return false;
        LogGroup other = (LogGroup) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null
                && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getRetentionInDays() == null
                ^ this.getRetentionInDays() == null)
            return false;
        if (other.getRetentionInDays() != null
                && other.getRetentionInDays().equals(this.getRetentionInDays()) == false)
            return false;
        if (other.getMetricFilterCount() == null
                ^ this.getMetricFilterCount() == null)
            return false;
        if (other.getMetricFilterCount() != null
                && other.getMetricFilterCount().equals(
                        this.getMetricFilterCount()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null
                && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getStoredBytes() == null ^ this.getStoredBytes() == null)
            return false;
        if (other.getStoredBytes() != null
                && other.getStoredBytes().equals(this.getStoredBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationTime() == null) ? 0 : getCreationTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRetentionInDays() == null) ? 0 : getRetentionInDays()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMetricFilterCount() == null) ? 0
                        : getMetricFilterCount().hashCode());
        hashCode = prime * hashCode
                + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getStoredBytes() == null) ? 0 : getStoredBytes().hashCode());
        return hashCode;
    }

    @Override
    public LogGroup clone() {
        try {
            return (LogGroup) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
