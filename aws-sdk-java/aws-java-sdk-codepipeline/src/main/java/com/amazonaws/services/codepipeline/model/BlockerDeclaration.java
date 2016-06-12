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

package com.amazonaws.services.codepipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Represents information about a gate declaration.
 * </p>
 */
public class BlockerDeclaration implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the gate declaration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     */
    private String type;

    /**
     * <p>
     * The name of the gate declaration.
     * </p>
     * 
     * @param name
     *        The name of the gate declaration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the gate declaration.
     * </p>
     * 
     * @return The name of the gate declaration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the gate declaration.
     * </p>
     * 
     * @param name
     *        The name of the gate declaration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BlockerDeclaration withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     * 
     * @param type
     *        The type of the gate declaration.
     * @see BlockerType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     * 
     * @return The type of the gate declaration.
     * @see BlockerType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     * 
     * @param type
     *        The type of the gate declaration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BlockerType
     */

    public BlockerDeclaration withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     * 
     * @param type
     *        The type of the gate declaration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BlockerType
     */

    public void setType(BlockerType type) {
        this.type = type.toString();
    }

    /**
     * <p>
     * The type of the gate declaration.
     * </p>
     * 
     * @param type
     *        The type of the gate declaration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BlockerType
     */

    public BlockerDeclaration withType(BlockerType type) {
        setType(type);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getType() != null)
            sb.append("Type: " + getType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlockerDeclaration == false)
            return false;
        BlockerDeclaration other = (BlockerDeclaration) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null
                && other.getType().equals(this.getType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getType() == null) ? 0 : getType().hashCode());
        return hashCode;
    }

    @Override
    public BlockerDeclaration clone() {
        try {
            return (BlockerDeclaration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
