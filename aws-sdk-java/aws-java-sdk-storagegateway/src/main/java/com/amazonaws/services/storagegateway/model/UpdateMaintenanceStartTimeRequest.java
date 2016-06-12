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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * <ul>
 * <li><a>UpdateMaintenanceStartTimeInput$DayOfWeek</a></li>
 * <li><a>UpdateMaintenanceStartTimeInput$HourOfDay</a></li>
 * <li><a>UpdateMaintenanceStartTimeInput$MinuteOfHour</a></li>
 * </ul>
 */
public class UpdateMaintenanceStartTimeRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     */
    private Integer hourOfDay;
    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     */
    private Integer minuteOfHour;
    /**
     * <p>
     * The maintenance start time day of the week.
     * </p>
     */
    private Integer dayOfWeek;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateMaintenanceStartTimeRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour component of the maintenance start time represented as
     *        <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the
     *        day is in the time zone of the gateway.
     */

    public void setHourOfDay(Integer hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * 
     * @return The hour component of the maintenance start time represented as
     *         <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of
     *         the day is in the time zone of the gateway.
     */

    public Integer getHourOfDay() {
        return this.hourOfDay;
    }

    /**
     * <p>
     * The hour component of the maintenance start time represented as
     * <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the day is
     * in the time zone of the gateway.
     * </p>
     * 
     * @param hourOfDay
     *        The hour component of the maintenance start time represented as
     *        <i>hh</i>, where <i>hh</i> is the hour (00 to 23). The hour of the
     *        day is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateMaintenanceStartTimeRequest withHourOfDay(Integer hourOfDay) {
        setHourOfDay(hourOfDay);
        return this;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute component of the maintenance start time represented as
     *        <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of
     *        the hour is in the time zone of the gateway.
     */

    public void setMinuteOfHour(Integer minuteOfHour) {
        this.minuteOfHour = minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * 
     * @return The minute component of the maintenance start time represented as
     *         <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute
     *         of the hour is in the time zone of the gateway.
     */

    public Integer getMinuteOfHour() {
        return this.minuteOfHour;
    }

    /**
     * <p>
     * The minute component of the maintenance start time represented as
     * <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of the
     * hour is in the time zone of the gateway.
     * </p>
     * 
     * @param minuteOfHour
     *        The minute component of the maintenance start time represented as
     *        <i>mm</i>, where <i>mm</i> is the minute (00 to 59). The minute of
     *        the hour is in the time zone of the gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateMaintenanceStartTimeRequest withMinuteOfHour(
            Integer minuteOfHour) {
        setMinuteOfHour(minuteOfHour);
        return this;
    }

    /**
     * <p>
     * The maintenance start time day of the week.
     * </p>
     * 
     * @param dayOfWeek
     *        The maintenance start time day of the week.
     */

    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    /**
     * <p>
     * The maintenance start time day of the week.
     * </p>
     * 
     * @return The maintenance start time day of the week.
     */

    public Integer getDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * <p>
     * The maintenance start time day of the week.
     * </p>
     * 
     * @param dayOfWeek
     *        The maintenance start time day of the week.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateMaintenanceStartTimeRequest withDayOfWeek(Integer dayOfWeek) {
        setDayOfWeek(dayOfWeek);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getHourOfDay() != null)
            sb.append("HourOfDay: " + getHourOfDay() + ",");
        if (getMinuteOfHour() != null)
            sb.append("MinuteOfHour: " + getMinuteOfHour() + ",");
        if (getDayOfWeek() != null)
            sb.append("DayOfWeek: " + getDayOfWeek());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateMaintenanceStartTimeRequest == false)
            return false;
        UpdateMaintenanceStartTimeRequest other = (UpdateMaintenanceStartTimeRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getHourOfDay() == null ^ this.getHourOfDay() == null)
            return false;
        if (other.getHourOfDay() != null
                && other.getHourOfDay().equals(this.getHourOfDay()) == false)
            return false;
        if (other.getMinuteOfHour() == null ^ this.getMinuteOfHour() == null)
            return false;
        if (other.getMinuteOfHour() != null
                && other.getMinuteOfHour().equals(this.getMinuteOfHour()) == false)
            return false;
        if (other.getDayOfWeek() == null ^ this.getDayOfWeek() == null)
            return false;
        if (other.getDayOfWeek() != null
                && other.getDayOfWeek().equals(this.getDayOfWeek()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode
                + ((getHourOfDay() == null) ? 0 : getHourOfDay().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinuteOfHour() == null) ? 0 : getMinuteOfHour()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDayOfWeek() == null) ? 0 : getDayOfWeek().hashCode());
        return hashCode;
    }

    @Override
    public UpdateMaintenanceStartTimeRequest clone() {
        return (UpdateMaintenanceStartTimeRequest) super.clone();
    }
}