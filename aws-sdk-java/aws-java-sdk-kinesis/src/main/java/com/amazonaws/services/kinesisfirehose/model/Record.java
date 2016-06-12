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

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * The unit of data in a delivery stream.
 * </p>
 */
public class Record implements Serializable, Cloneable {

    /**
     * <p>
     * The data blob, which is base64-encoded when the blob is serialized. The
     * maximum size of the data blob, before base64-encoding, is 1,000 KB.
     * </p>
     */
    private java.nio.ByteBuffer data;

    /**
     * <p>
     * The data blob, which is base64-encoded when the blob is serialized. The
     * maximum size of the data blob, before base64-encoding, is 1,000 KB.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending
     * this request to AWS service by default. Users of the SDK should not
     * perform Base64 encoding on this field.
     * </p>
     * 
     * @param data
     *        The data blob, which is base64-encoded when the blob is
     *        serialized. The maximum size of the data blob, before
     *        base64-encoding, is 1,000 KB.
     */

    public void setData(java.nio.ByteBuffer data) {
        this.data = data;
    }

    /**
     * <p>
     * The data blob, which is base64-encoded when the blob is serialized. The
     * maximum size of the data blob, before base64-encoding, is 1,000 KB.
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
     * @return The data blob, which is base64-encoded when the blob is
     *         serialized. The maximum size of the data blob, before
     *         base64-encoding, is 1,000 KB.
     */

    public java.nio.ByteBuffer getData() {
        return this.data;
    }

    /**
     * <p>
     * The data blob, which is base64-encoded when the blob is serialized. The
     * maximum size of the data blob, before base64-encoding, is 1,000 KB.
     * </p>
     * 
     * @param data
     *        The data blob, which is base64-encoded when the blob is
     *        serialized. The maximum size of the data blob, before
     *        base64-encoding, is 1,000 KB.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Record withData(java.nio.ByteBuffer data) {
        setData(data);
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
        if (getData() != null)
            sb.append("Data: " + getData());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Record == false)
            return false;
        Record other = (Record) obj;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null
                && other.getData().equals(this.getData()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getData() == null) ? 0 : getData().hashCode());
        return hashCode;
    }

    @Override
    public Record clone() {
        try {
            return (Record) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
