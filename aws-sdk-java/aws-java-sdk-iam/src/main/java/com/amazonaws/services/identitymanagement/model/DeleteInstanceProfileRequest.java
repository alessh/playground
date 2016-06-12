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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteInstanceProfileRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance profile to delete.
     * </p>
     */
    private String instanceProfileName;

    /**
     * <p>
     * The name of the instance profile to delete.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile to delete.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to delete.
     * </p>
     * 
     * @return The name of the instance profile to delete.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to delete.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteInstanceProfileRequest withInstanceProfileName(
            String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
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
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: " + getInstanceProfileName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteInstanceProfileRequest == false)
            return false;
        DeleteInstanceProfileRequest other = (DeleteInstanceProfileRequest) obj;
        if (other.getInstanceProfileName() == null
                ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null
                && other.getInstanceProfileName().equals(
                        this.getInstanceProfileName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceProfileName() == null) ? 0
                        : getInstanceProfileName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteInstanceProfileRequest clone() {
        return (DeleteInstanceProfileRequest) super.clone();
    }
}