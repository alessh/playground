/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudsearchv2.model;

import java.io.Serializable;

/**
 * <p>
 * The status and configuration of a search domain's scaling parameters.
 * </p>
 */
public class ScalingParametersStatus implements Serializable, Cloneable {

    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     */
    private ScalingParameters options;

    /**
     * The status of domain configuration option.
     */
    private OptionStatus status;

    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     *
     * @return The desired instance type and desired number of replicas of each index
     *         partition.
     */
    public ScalingParameters getOptions() {
        return options;
    }
    
    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     *
     * @param options The desired instance type and desired number of replicas of each index
     *         partition.
     */
    public void setOptions(ScalingParameters options) {
        this.options = options;
    }
    
    /**
     * The desired instance type and desired number of replicas of each index
     * partition.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param options The desired instance type and desired number of replicas of each index
     *         partition.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingParametersStatus withOptions(ScalingParameters options) {
        this.options = options;
        return this;
    }

    /**
     * The status of domain configuration option.
     *
     * @return The status of domain configuration option.
     */
    public OptionStatus getStatus() {
        return status;
    }
    
    /**
     * The status of domain configuration option.
     *
     * @param status The status of domain configuration option.
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }
    
    /**
     * The status of domain configuration option.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of domain configuration option.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ScalingParametersStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (getOptions() != null) sb.append("Options: " + getOptions() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ScalingParametersStatus == false) return false;
        ScalingParametersStatus other = (ScalingParametersStatus)obj;
        
        if (other.getOptions() == null ^ this.getOptions() == null) return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        return true;
    }
    
    @Override
    public ScalingParametersStatus clone() {
        try {
            return (ScalingParametersStatus) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    