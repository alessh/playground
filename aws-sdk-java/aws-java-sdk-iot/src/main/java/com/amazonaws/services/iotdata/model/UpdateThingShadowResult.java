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

package com.amazonaws.services.iotdata.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the UpdateThingShadow operation.
 * </p>
 */
public class UpdateThingShadowResult implements Serializable, Cloneable {

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending
     * this request to AWS service by default. Users of the SDK should not
     * perform Base64 encoding on this field.
     * </p>
     * 
     * @param payload
     *        The state information, in JSON format.
     */

    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the {@code position}
     * .
     * </p>
     * 
     * @return The state information, in JSON format.
     */

    public java.nio.ByteBuffer getPayload() {
        return this.payload;
    }

    /**
     * <p>
     * The state information, in JSON format.
     * </p>
     * 
     * @param payload
     *        The state information, in JSON format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateThingShadowResult withPayload(java.nio.ByteBuffer payload) {
        setPayload(payload);
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
        if (getPayload() != null)
            sb.append("Payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThingShadowResult == false)
            return false;
        UpdateThingShadowResult other = (UpdateThingShadowResult) obj;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null
                && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThingShadowResult clone() {
        try {
            return (UpdateThingShadowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
