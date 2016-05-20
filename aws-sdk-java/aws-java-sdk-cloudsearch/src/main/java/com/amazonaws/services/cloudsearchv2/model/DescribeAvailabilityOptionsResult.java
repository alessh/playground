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
 * The result of a <code>DescribeAvailabilityOptions</code> request.
 * Indicates whether or not the Multi-AZ option is enabled for the domain
 * specified in the request.
 * </p>
 */
public class DescribeAvailabilityOptionsResult implements Serializable, Cloneable {

    /**
     * The availability options configured for the domain. Indicates whether
     * Multi-AZ is enabled for the domain.
     */
    private AvailabilityOptionsStatus availabilityOptions;

    /**
     * The availability options configured for the domain. Indicates whether
     * Multi-AZ is enabled for the domain.
     *
     * @return The availability options configured for the domain. Indicates whether
     *         Multi-AZ is enabled for the domain.
     */
    public AvailabilityOptionsStatus getAvailabilityOptions() {
        return availabilityOptions;
    }
    
    /**
     * The availability options configured for the domain. Indicates whether
     * Multi-AZ is enabled for the domain.
     *
     * @param availabilityOptions The availability options configured for the domain. Indicates whether
     *         Multi-AZ is enabled for the domain.
     */
    public void setAvailabilityOptions(AvailabilityOptionsStatus availabilityOptions) {
        this.availabilityOptions = availabilityOptions;
    }
    
    /**
     * The availability options configured for the domain. Indicates whether
     * Multi-AZ is enabled for the domain.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param availabilityOptions The availability options configured for the domain. Indicates whether
     *         Multi-AZ is enabled for the domain.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeAvailabilityOptionsResult withAvailabilityOptions(AvailabilityOptionsStatus availabilityOptions) {
        this.availabilityOptions = availabilityOptions;
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
        if (getAvailabilityOptions() != null) sb.append("AvailabilityOptions: " + getAvailabilityOptions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAvailabilityOptions() == null) ? 0 : getAvailabilityOptions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeAvailabilityOptionsResult == false) return false;
        DescribeAvailabilityOptionsResult other = (DescribeAvailabilityOptionsResult)obj;
        
        if (other.getAvailabilityOptions() == null ^ this.getAvailabilityOptions() == null) return false;
        if (other.getAvailabilityOptions() != null && other.getAvailabilityOptions().equals(this.getAvailabilityOptions()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeAvailabilityOptionsResult clone() {
        try {
            return (DescribeAvailabilityOptionsResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    