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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information to uniquely identify the CloudWatch
 * alarm that you're associating with a Route 53 health check.
 * </p>
 */
public class AlarmIdentifier implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name of the CloudWatch alarm.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     * 
     * @param region
     *        The <code>CloudWatchRegion</code> that the CloudWatch alarm was
     *        created in.
     * @see CloudWatchRegion
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     * 
     * @return The <code>CloudWatchRegion</code> that the CloudWatch alarm was
     *         created in.
     * @see CloudWatchRegion
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     * 
     * @param region
     *        The <code>CloudWatchRegion</code> that the CloudWatch alarm was
     *        created in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CloudWatchRegion
     */

    public AlarmIdentifier withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     * 
     * @param region
     *        The <code>CloudWatchRegion</code> that the CloudWatch alarm was
     *        created in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CloudWatchRegion
     */

    public void setRegion(CloudWatchRegion region) {
        this.region = region.toString();
    }

    /**
     * <p>
     * The <code>CloudWatchRegion</code> that the CloudWatch alarm was created
     * in.
     * </p>
     * 
     * @param region
     *        The <code>CloudWatchRegion</code> that the CloudWatch alarm was
     *        created in.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CloudWatchRegion
     */

    public AlarmIdentifier withRegion(CloudWatchRegion region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm.
     * </p>
     * 
     * @param name
     *        The name of the CloudWatch alarm.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm.
     * </p>
     * 
     * @return The name of the CloudWatch alarm.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the CloudWatch alarm.
     * </p>
     * 
     * @param name
     *        The name of the CloudWatch alarm.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AlarmIdentifier withName(String name) {
        setName(name);
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AlarmIdentifier == false)
            return false;
        AlarmIdentifier other = (AlarmIdentifier) obj;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null
                && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public AlarmIdentifier clone() {
        try {
            return (AlarmIdentifier) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
