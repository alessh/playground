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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a tag.
 * </p>
 */
public class Tag implements Serializable, Cloneable {

    /**
     * <p>
     * The tag's key.
     * </p>
     */
    private String key;
    /**
     * <p>
     * The tag's value.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The tag's key.
     * </p>
     * 
     * @param key
     *        The tag's key.
     */

    public void setKey(String key) {
        this.key = key;
    }

    /**
     * <p>
     * The tag's key.
     * </p>
     * 
     * @return The tag's key.
     */

    public String getKey() {
        return this.key;
    }

    /**
     * <p>
     * The tag's key.
     * </p>
     * 
     * @param key
     *        The tag's key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Tag withKey(String key) {
        setKey(key);
        return this;
    }

    /**
     * <p>
     * The tag's value.
     * </p>
     * 
     * @param value
     *        The tag's value.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The tag's value.
     * </p>
     * 
     * @return The tag's value.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The tag's value.
     * </p>
     * 
     * @param value
     *        The tag's value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Tag withValue(String value) {
        setValue(value);
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
        if (getKey() != null)
            sb.append("Key: " + getKey() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Tag == false)
            return false;
        Tag other = (Tag) obj;
        if (other.getKey() == null ^ this.getKey() == null)
            return false;
        if (other.getKey() != null
                && other.getKey().equals(this.getKey()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKey() == null) ? 0 : getKey().hashCode());
        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public Tag clone() {
        try {
            return (Tag) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
