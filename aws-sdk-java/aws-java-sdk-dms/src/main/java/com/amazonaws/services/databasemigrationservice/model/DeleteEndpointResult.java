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

package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;

/**
 * 
 */
public class DeleteEndpointResult implements Serializable, Cloneable {

    /**
     * <p>
     * The endpoint that was deleted.
     * </p>
     */
    private Endpoint endpoint;

    /**
     * <p>
     * The endpoint that was deleted.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that was deleted.
     */

    public void setEndpoint(Endpoint endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * <p>
     * The endpoint that was deleted.
     * </p>
     * 
     * @return The endpoint that was deleted.
     */

    public Endpoint getEndpoint() {
        return this.endpoint;
    }

    /**
     * <p>
     * The endpoint that was deleted.
     * </p>
     * 
     * @param endpoint
     *        The endpoint that was deleted.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteEndpointResult withEndpoint(Endpoint endpoint) {
        setEndpoint(endpoint);
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
        if (getEndpoint() != null)
            sb.append("Endpoint: " + getEndpoint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteEndpointResult == false)
            return false;
        DeleteEndpointResult other = (DeleteEndpointResult) obj;
        if (other.getEndpoint() == null ^ this.getEndpoint() == null)
            return false;
        if (other.getEndpoint() != null
                && other.getEndpoint().equals(this.getEndpoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEndpoint() == null) ? 0 : getEndpoint().hashCode());
        return hashCode;
    }

    @Override
    public DeleteEndpointResult clone() {
        try {
            return (DeleteEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
