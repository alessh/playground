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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about each entry in the key list.
 * </p>
 */
public class KeyListEntry implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * ARN of the key.
     * </p>
     */
    private String keyArn;

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @param keyId
     *        Unique identifier of the key.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @return Unique identifier of the key.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * Unique identifier of the key.
     * </p>
     * 
     * @param keyId
     *        Unique identifier of the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyListEntry withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * ARN of the key.
     * </p>
     * 
     * @param keyArn
     *        ARN of the key.
     */

    public void setKeyArn(String keyArn) {
        this.keyArn = keyArn;
    }

    /**
     * <p>
     * ARN of the key.
     * </p>
     * 
     * @return ARN of the key.
     */

    public String getKeyArn() {
        return this.keyArn;
    }

    /**
     * <p>
     * ARN of the key.
     * </p>
     * 
     * @param keyArn
     *        ARN of the key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public KeyListEntry withKeyArn(String keyArn) {
        setKeyArn(keyArn);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getKeyArn() != null)
            sb.append("KeyArn: " + getKeyArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KeyListEntry == false)
            return false;
        KeyListEntry other = (KeyListEntry) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getKeyArn() == null ^ this.getKeyArn() == null)
            return false;
        if (other.getKeyArn() != null
                && other.getKeyArn().equals(this.getKeyArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getKeyArn() == null) ? 0 : getKeyArn().hashCode());
        return hashCode;
    }

    @Override
    public KeyListEntry clone() {
        try {
            return (KeyListEntry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
