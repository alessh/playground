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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a Spot instance request.
 * </p>
 */
public class SpotInstanceStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The status code. For a list of status codes, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     * >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The date and time of the most recent status update, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The description for the status code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The status code. For a list of status codes, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     * >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param code
     *        The status code. For a list of status codes, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     *        >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The status code. For a list of status codes, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     * >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @return The status code. For a list of status codes, see <a href=
     *         "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     *         >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud
     *         User Guide</i>.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The status code. For a list of status codes, see <a href=
     * "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     * >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud User
     * Guide</i>.
     * </p>
     * 
     * @param code
     *        The status code. For a list of status codes, see <a href=
     *        "http://docs.aws.amazon.com/AWSEC2/latest/UserGuide/spot-bid-status.html#spot-instance-bid-status-understand"
     *        >Spot Bid Status Codes</a> in the <i>Amazon Elastic Compute Cloud
     *        User Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SpotInstanceStatus withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The date and time of the most recent status update, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param updateTime
     *        The date and time of the most recent status update, in UTC format
     *        (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The date and time of the most recent status update, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @return The date and time of the most recent status update, in UTC format
     *         (for example,
     *         <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The date and time of the most recent status update, in UTC format (for
     * example, <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * </p>
     * 
     * @param updateTime
     *        The date and time of the most recent status update, in UTC format
     *        (for example,
     *        <i>YYYY</i>-<i>MM</i>-<i>DD</i>T<i>HH</i>:<i>MM</i>:<i>SS</i>Z).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SpotInstanceStatus withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @param message
     *        The description for the status code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @return The description for the status code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The description for the status code.
     * </p>
     * 
     * @param message
     *        The description for the status code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SpotInstanceStatus withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: " + getUpdateTime() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotInstanceStatus == false)
            return false;
        SpotInstanceStatus other = (SpotInstanceStatus) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null
                && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null
                && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public SpotInstanceStatus clone() {
        try {
            return (SpotInstanceStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
