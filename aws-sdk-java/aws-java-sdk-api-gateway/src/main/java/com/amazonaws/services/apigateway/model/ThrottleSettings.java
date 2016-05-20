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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Returns the throttle settings.
 * </p>
 */
public class ThrottleSettings implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the burstLimit when <b>ThrottleSettings</b> is called.
     * </p>
     */
    private Integer burstLimit;
    /**
     * <p>
     * Returns the rateLimit when <b>ThrottleSettings</b> is called.
     * </p>
     */
    private Double rateLimit;

    /**
     * <p>
     * Returns the burstLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @param burstLimit
     *        Returns the burstLimit when <b>ThrottleSettings</b> is called.
     */

    public void setBurstLimit(Integer burstLimit) {
        this.burstLimit = burstLimit;
    }

    /**
     * <p>
     * Returns the burstLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @return Returns the burstLimit when <b>ThrottleSettings</b> is called.
     */

    public Integer getBurstLimit() {
        return this.burstLimit;
    }

    /**
     * <p>
     * Returns the burstLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @param burstLimit
     *        Returns the burstLimit when <b>ThrottleSettings</b> is called.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ThrottleSettings withBurstLimit(Integer burstLimit) {
        setBurstLimit(burstLimit);
        return this;
    }

    /**
     * <p>
     * Returns the rateLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @param rateLimit
     *        Returns the rateLimit when <b>ThrottleSettings</b> is called.
     */

    public void setRateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
    }

    /**
     * <p>
     * Returns the rateLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @return Returns the rateLimit when <b>ThrottleSettings</b> is called.
     */

    public Double getRateLimit() {
        return this.rateLimit;
    }

    /**
     * <p>
     * Returns the rateLimit when <b>ThrottleSettings</b> is called.
     * </p>
     * 
     * @param rateLimit
     *        Returns the rateLimit when <b>ThrottleSettings</b> is called.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ThrottleSettings withRateLimit(Double rateLimit) {
        setRateLimit(rateLimit);
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
        if (getBurstLimit() != null)
            sb.append("BurstLimit: " + getBurstLimit() + ",");
        if (getRateLimit() != null)
            sb.append("RateLimit: " + getRateLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThrottleSettings == false)
            return false;
        ThrottleSettings other = (ThrottleSettings) obj;
        if (other.getBurstLimit() == null ^ this.getBurstLimit() == null)
            return false;
        if (other.getBurstLimit() != null
                && other.getBurstLimit().equals(this.getBurstLimit()) == false)
            return false;
        if (other.getRateLimit() == null ^ this.getRateLimit() == null)
            return false;
        if (other.getRateLimit() != null
                && other.getRateLimit().equals(this.getRateLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBurstLimit() == null) ? 0 : getBurstLimit().hashCode());
        hashCode = prime * hashCode
                + ((getRateLimit() == null) ? 0 : getRateLimit().hashCode());
        return hashCode;
    }

    @Override
    public ThrottleSettings clone() {
        try {
            return (ThrottleSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
