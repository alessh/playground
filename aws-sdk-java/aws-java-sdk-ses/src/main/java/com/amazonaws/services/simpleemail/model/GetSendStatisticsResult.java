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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * 
 */
public class GetSendStatisticsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of data points, each of which represents 15 minutes of activity.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SendDataPoint> sendDataPoints;

    /**
     * <p>
     * A list of data points, each of which represents 15 minutes of activity.
     * </p>
     * 
     * @return A list of data points, each of which represents 15 minutes of
     *         activity.
     */

    public java.util.List<SendDataPoint> getSendDataPoints() {
        if (sendDataPoints == null) {
            sendDataPoints = new com.amazonaws.internal.SdkInternalList<SendDataPoint>();
        }
        return sendDataPoints;
    }

    /**
     * <p>
     * A list of data points, each of which represents 15 minutes of activity.
     * </p>
     * 
     * @param sendDataPoints
     *        A list of data points, each of which represents 15 minutes of
     *        activity.
     */

    public void setSendDataPoints(
            java.util.Collection<SendDataPoint> sendDataPoints) {
        if (sendDataPoints == null) {
            this.sendDataPoints = null;
            return;
        }

        this.sendDataPoints = new com.amazonaws.internal.SdkInternalList<SendDataPoint>(
                sendDataPoints);
    }

    /**
     * <p>
     * A list of data points, each of which represents 15 minutes of activity.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSendDataPoints(java.util.Collection)} or
     * {@link #withSendDataPoints(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param sendDataPoints
     *        A list of data points, each of which represents 15 minutes of
     *        activity.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSendStatisticsResult withSendDataPoints(
            SendDataPoint... sendDataPoints) {
        if (this.sendDataPoints == null) {
            setSendDataPoints(new com.amazonaws.internal.SdkInternalList<SendDataPoint>(
                    sendDataPoints.length));
        }
        for (SendDataPoint ele : sendDataPoints) {
            this.sendDataPoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of data points, each of which represents 15 minutes of activity.
     * </p>
     * 
     * @param sendDataPoints
     *        A list of data points, each of which represents 15 minutes of
     *        activity.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSendStatisticsResult withSendDataPoints(
            java.util.Collection<SendDataPoint> sendDataPoints) {
        setSendDataPoints(sendDataPoints);
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
        if (getSendDataPoints() != null)
            sb.append("SendDataPoints: " + getSendDataPoints());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSendStatisticsResult == false)
            return false;
        GetSendStatisticsResult other = (GetSendStatisticsResult) obj;
        if (other.getSendDataPoints() == null
                ^ this.getSendDataPoints() == null)
            return false;
        if (other.getSendDataPoints() != null
                && other.getSendDataPoints().equals(this.getSendDataPoints()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSendDataPoints() == null) ? 0 : getSendDataPoints()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetSendStatisticsResult clone() {
        try {
            return (GetSendStatisticsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
