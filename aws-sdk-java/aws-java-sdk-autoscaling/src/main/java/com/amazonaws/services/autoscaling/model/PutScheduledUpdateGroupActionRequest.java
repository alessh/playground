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
public class PutScheduledUpdateGroupActionRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     */
    private String autoScalingGroupName;
    /**
     * <p>
     * The name of this scaling action.
     * </p>
     */
    private String scheduledActionName;
    /**
     * <p>
     * This parameter is deprecated; use <code>StartTime</code> instead.
     * </p>
     * <p>
     * The time for this action to start. If both <code>Time</code> and
     * <code>StartTime</code> are specified, their values must be identical.
     * </p>
     */
    private java.util.Date time;
    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you try to schedule your action in the past, Auto Scaling returns an
     * error message.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The time for this action to end.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For more
     * information, see <a href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     * Wikipedia.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action will start and stop.
     * </p>
     */
    private String recurrence;
    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     */
    private Integer minSize;
    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     */
    private Integer maxSize;
    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     */
    private Integer desiredCapacity;

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @return The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     */

    public String getAutoScalingGroupName() {
        return this.autoScalingGroupName;
    }

    /**
     * <p>
     * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * </p>
     * 
     * @param autoScalingGroupName
     *        The name or Amazon Resource Name (ARN) of the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withAutoScalingGroupName(
            String autoScalingGroupName) {
        setAutoScalingGroupName(autoScalingGroupName);
        return this;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of this scaling action.
     */

    public void setScheduledActionName(String scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * 
     * @return The name of this scaling action.
     */

    public String getScheduledActionName() {
        return this.scheduledActionName;
    }

    /**
     * <p>
     * The name of this scaling action.
     * </p>
     * 
     * @param scheduledActionName
     *        The name of this scaling action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withScheduledActionName(
            String scheduledActionName) {
        setScheduledActionName(scheduledActionName);
        return this;
    }

    /**
     * <p>
     * This parameter is deprecated; use <code>StartTime</code> instead.
     * </p>
     * <p>
     * The time for this action to start. If both <code>Time</code> and
     * <code>StartTime</code> are specified, their values must be identical.
     * </p>
     * 
     * @param time
     *        This parameter is deprecated; use <code>StartTime</code>
     *        instead.</p>
     *        <p>
     *        The time for this action to start. If both <code>Time</code> and
     *        <code>StartTime</code> are specified, their values must be
     *        identical.
     */

    public void setTime(java.util.Date time) {
        this.time = time;
    }

    /**
     * <p>
     * This parameter is deprecated; use <code>StartTime</code> instead.
     * </p>
     * <p>
     * The time for this action to start. If both <code>Time</code> and
     * <code>StartTime</code> are specified, their values must be identical.
     * </p>
     * 
     * @return This parameter is deprecated; use <code>StartTime</code>
     *         instead.</p>
     *         <p>
     *         The time for this action to start. If both <code>Time</code> and
     *         <code>StartTime</code> are specified, their values must be
     *         identical.
     */

    public java.util.Date getTime() {
        return this.time;
    }

    /**
     * <p>
     * This parameter is deprecated; use <code>StartTime</code> instead.
     * </p>
     * <p>
     * The time for this action to start. If both <code>Time</code> and
     * <code>StartTime</code> are specified, their values must be identical.
     * </p>
     * 
     * @param time
     *        This parameter is deprecated; use <code>StartTime</code>
     *        instead.</p>
     *        <p>
     *        The time for this action to start. If both <code>Time</code> and
     *        <code>StartTime</code> are specified, their values must be
     *        identical.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withTime(java.util.Date time) {
        setTime(time);
        return this;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you try to schedule your action in the past, Auto Scaling returns an
     * error message.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     * 
     * @param startTime
     *        The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *        format in UTC/GMT only (for example,
     *        <code>2014-06-01T00:00:00Z</code>).</p>
     *        <p>
     *        If you try to schedule your action in the past, Auto Scaling
     *        returns an error message.
     *        </p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified
     *        with <code>Recurrence</code>, they form the boundaries of when the
     *        recurring action starts and stops.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you try to schedule your action in the past, Auto Scaling returns an
     * error message.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     * 
     * @return The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *         format in UTC/GMT only (for example,
     *         <code>2014-06-01T00:00:00Z</code>).</p>
     *         <p>
     *         If you try to schedule your action in the past, Auto Scaling
     *         returns an error message.
     *         </p>
     *         <p>
     *         When <code>StartTime</code> and <code>EndTime</code> are
     *         specified with <code>Recurrence</code>, they form the boundaries
     *         of when the recurring action starts and stops.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in
     * UTC/GMT only (for example, <code>2014-06-01T00:00:00Z</code>).
     * </p>
     * <p>
     * If you try to schedule your action in the past, Auto Scaling returns an
     * error message.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action starts and stops.
     * </p>
     * 
     * @param startTime
     *        The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ"
     *        format in UTC/GMT only (for example,
     *        <code>2014-06-01T00:00:00Z</code>).</p>
     *        <p>
     *        If you try to schedule your action in the past, Auto Scaling
     *        returns an error message.
     *        </p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified
     *        with <code>Recurrence</code>, they form the boundaries of when the
     *        recurring action starts and stops.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withStartTime(
            java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The time for this action to end.
     * </p>
     * 
     * @param endTime
     *        The time for this action to end.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The time for this action to end.
     * </p>
     * 
     * @return The time for this action to end.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The time for this action to end.
     * </p>
     * 
     * @param endTime
     *        The time for this action to end.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withEndTime(
            java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For more
     * information, see <a href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     * Wikipedia.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action will start and stop.
     * </p>
     * 
     * @param recurrence
     *        The time when recurring future actions will start. Start time is
     *        specified by the user following the Unix cron syntax format. For
     *        more information, see <a
     *        href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     *        Wikipedia.</p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified
     *        with <code>Recurrence</code>, they form the boundaries of when the
     *        recurring action will start and stop.
     */

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    /**
     * <p>
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For more
     * information, see <a href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     * Wikipedia.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action will start and stop.
     * </p>
     * 
     * @return The time when recurring future actions will start. Start time is
     *         specified by the user following the Unix cron syntax format. For
     *         more information, see <a
     *         href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     *         Wikipedia.</p>
     *         <p>
     *         When <code>StartTime</code> and <code>EndTime</code> are
     *         specified with <code>Recurrence</code>, they form the boundaries
     *         of when the recurring action will start and stop.
     */

    public String getRecurrence() {
        return this.recurrence;
    }

    /**
     * <p>
     * The time when recurring future actions will start. Start time is
     * specified by the user following the Unix cron syntax format. For more
     * information, see <a href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     * Wikipedia.
     * </p>
     * <p>
     * When <code>StartTime</code> and <code>EndTime</code> are specified with
     * <code>Recurrence</code>, they form the boundaries of when the recurring
     * action will start and stop.
     * </p>
     * 
     * @param recurrence
     *        The time when recurring future actions will start. Start time is
     *        specified by the user following the Unix cron syntax format. For
     *        more information, see <a
     *        href="http://en.wikipedia.org/wiki/Cron">Cron</a> in
     *        Wikipedia.</p>
     *        <p>
     *        When <code>StartTime</code> and <code>EndTime</code> are specified
     *        with <code>Recurrence</code>, they form the boundaries of when the
     *        recurring action will start and stop.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withRecurrence(String recurrence) {
        setRecurrence(recurrence);
        return this;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size for the Auto Scaling group.
     */

    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     * 
     * @return The minimum size for the Auto Scaling group.
     */

    public Integer getMinSize() {
        return this.minSize;
    }

    /**
     * <p>
     * The minimum size for the Auto Scaling group.
     * </p>
     * 
     * @param minSize
     *        The minimum size for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withMinSize(Integer minSize) {
        setMinSize(minSize);
        return this;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size for the Auto Scaling group.
     */

    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     * 
     * @return The maximum size for the Auto Scaling group.
     */

    public Integer getMaxSize() {
        return this.maxSize;
    }

    /**
     * <p>
     * The maximum size for the Auto Scaling group.
     * </p>
     * 
     * @param maxSize
     *        The maximum size for the Auto Scaling group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withMaxSize(Integer maxSize) {
        setMaxSize(maxSize);
        return this;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group.
     */

    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     * 
     * @return The number of EC2 instances that should be running in the group.
     */

    public Integer getDesiredCapacity() {
        return this.desiredCapacity;
    }

    /**
     * <p>
     * The number of EC2 instances that should be running in the group.
     * </p>
     * 
     * @param desiredCapacity
     *        The number of EC2 instances that should be running in the group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutScheduledUpdateGroupActionRequest withDesiredCapacity(
            Integer desiredCapacity) {
        setDesiredCapacity(desiredCapacity);
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
        if (getScheduledActionName() != null)
            sb.append("ScheduledActionName: " + getScheduledActionName() + ",");
        if (getTime() != null)
            sb.append("Time: " + getTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getEndTime() != null)
            sb.append("EndTime: " + getEndTime() + ",");
        if (getRecurrence() != null)
            sb.append("Recurrence: " + getRecurrence() + ",");
        if (getMinSize() != null)
            sb.append("MinSize: " + getMinSize() + ",");
        if (getMaxSize() != null)
            sb.append("MaxSize: " + getMaxSize() + ",");
        if (getDesiredCapacity() != null)
            sb.append("DesiredCapacity: " + getDesiredCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutScheduledUpdateGroupActionRequest == false)
            return false;
        PutScheduledUpdateGroupActionRequest other = (PutScheduledUpdateGroupActionRequest) obj;
        if (other.getAutoScalingGroupName() == null
                ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(
                        this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getScheduledActionName() == null
                ^ this.getScheduledActionName() == null)
            return false;
        if (other.getScheduledActionName() != null
                && other.getScheduledActionName().equals(
                        this.getScheduledActionName()) == false)
            return false;
        if (other.getTime() == null ^ this.getTime() == null)
            return false;
        if (other.getTime() != null
                && other.getTime().equals(this.getTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null
                && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null
                && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getRecurrence() == null ^ this.getRecurrence() == null)
            return false;
        if (other.getRecurrence() != null
                && other.getRecurrence().equals(this.getRecurrence()) == false)
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
                + ((getScheduledActionName() == null) ? 0
                        : getScheduledActionName().hashCode());
        hashCode = prime * hashCode
                + ((getTime() == null) ? 0 : getTime().hashCode());
        hashCode = prime * hashCode
                + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode
                + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode
                + ((getRecurrence() == null) ? 0 : getRecurrence().hashCode());
        hashCode = prime * hashCode
                + ((getMinSize() == null) ? 0 : getMinSize().hashCode());
        hashCode = prime * hashCode
                + ((getMaxSize() == null) ? 0 : getMaxSize().hashCode());
        hashCode = prime
                * hashCode
                + ((getDesiredCapacity() == null) ? 0 : getDesiredCapacity()
                        .hashCode());
        return hashCode;
    }

    @Override
    public PutScheduledUpdateGroupActionRequest clone() {
        return (PutScheduledUpdateGroupActionRequest) super.clone();
    }
}