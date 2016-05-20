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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteDestinationRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of destination to delete.
     * </p>
     */
    private String destinationName;

    /**
     * <p>
     * The name of destination to delete.
     * </p>
     * 
     * @param destinationName
     *        The name of destination to delete.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * The name of destination to delete.
     * </p>
     * 
     * @return The name of destination to delete.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * The name of destination to delete.
     * </p>
     * 
     * @param destinationName
     *        The name of destination to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDestinationRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
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
        if (getDestinationName() != null)
            sb.append("DestinationName: " + getDestinationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDestinationRequest == false)
            return false;
        DeleteDestinationRequest other = (DeleteDestinationRequest) obj;
        if (other.getDestinationName() == null
                ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null
                && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDestinationName() == null) ? 0 : getDestinationName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteDestinationRequest clone() {
        return (DeleteDestinationRequest) super.clone();
    }
}