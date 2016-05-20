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
 * A complex type that contains information about the status of the specified
 * health check.
 * </p>
 */
public class GetHealthCheckStatusResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HealthCheckObservation> healthCheckObservations;

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker.
     * </p>
     * 
     * @return A list that contains one <code>HealthCheckObservation</code>
     *         element for each Amazon Route 53 health checker.
     */

    public java.util.List<HealthCheckObservation> getHealthCheckObservations() {
        if (healthCheckObservations == null) {
            healthCheckObservations = new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>();
        }
        return healthCheckObservations;
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>HealthCheckObservation</code>
     *        element for each Amazon Route 53 health checker.
     */

    public void setHealthCheckObservations(
            java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        if (healthCheckObservations == null) {
            this.healthCheckObservations = null;
            return;
        }

        this.healthCheckObservations = new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>(
                healthCheckObservations);
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHealthCheckObservations(java.util.Collection)} or
     * {@link #withHealthCheckObservations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>HealthCheckObservation</code>
     *        element for each Amazon Route 53 health checker.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetHealthCheckStatusResult withHealthCheckObservations(
            HealthCheckObservation... healthCheckObservations) {
        if (this.healthCheckObservations == null) {
            setHealthCheckObservations(new com.amazonaws.internal.SdkInternalList<HealthCheckObservation>(
                    healthCheckObservations.length));
        }
        for (HealthCheckObservation ele : healthCheckObservations) {
            this.healthCheckObservations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>HealthCheckObservation</code> element for
     * each Amazon Route 53 health checker.
     * </p>
     * 
     * @param healthCheckObservations
     *        A list that contains one <code>HealthCheckObservation</code>
     *        element for each Amazon Route 53 health checker.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetHealthCheckStatusResult withHealthCheckObservations(
            java.util.Collection<HealthCheckObservation> healthCheckObservations) {
        setHealthCheckObservations(healthCheckObservations);
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
        if (getHealthCheckObservations() != null)
            sb.append("HealthCheckObservations: "
                    + getHealthCheckObservations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetHealthCheckStatusResult == false)
            return false;
        GetHealthCheckStatusResult other = (GetHealthCheckStatusResult) obj;
        if (other.getHealthCheckObservations() == null
                ^ this.getHealthCheckObservations() == null)
            return false;
        if (other.getHealthCheckObservations() != null
                && other.getHealthCheckObservations().equals(
                        this.getHealthCheckObservations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHealthCheckObservations() == null) ? 0
                        : getHealthCheckObservations().hashCode());
        return hashCode;
    }

    @Override
    public GetHealthCheckStatusResult clone() {
        try {
            return (GetHealthCheckStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
