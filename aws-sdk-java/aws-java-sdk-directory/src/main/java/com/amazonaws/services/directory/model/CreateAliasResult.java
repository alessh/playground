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

package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the results of the <a>CreateAlias</a> operation.
 * </p>
 */
public class CreateAliasResult implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The alias for the directory.
     * </p>
     */
    private String alias;

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @return The identifier of the directory.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAliasResult withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The alias for the directory.
     * </p>
     * 
     * @param alias
     *        The alias for the directory.
     */

    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * <p>
     * The alias for the directory.
     * </p>
     * 
     * @return The alias for the directory.
     */

    public String getAlias() {
        return this.alias;
    }

    /**
     * <p>
     * The alias for the directory.
     * </p>
     * 
     * @param alias
     *        The alias for the directory.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAliasResult withAlias(String alias) {
        setAlias(alias);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getAlias() != null)
            sb.append("Alias: " + getAlias());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasResult == false)
            return false;
        CreateAliasResult other = (CreateAliasResult) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getAlias() == null ^ this.getAlias() == null)
            return false;
        if (other.getAlias() != null
                && other.getAlias().equals(this.getAlias()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getAlias() == null) ? 0 : getAlias().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasResult clone() {
        try {
            return (CreateAliasResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
