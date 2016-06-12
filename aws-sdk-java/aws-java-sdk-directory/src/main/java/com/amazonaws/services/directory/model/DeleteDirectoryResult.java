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
 * Contains the results of the <a>DeleteDirectory</a> operation.
 * </p>
 */
public class DeleteDirectoryResult implements Serializable, Cloneable {

    /**
     * <p>
     * The directory identifier.
     * </p>
     */
    private String directoryId;

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @return The directory identifier.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory identifier.
     * </p>
     * 
     * @param directoryId
     *        The directory identifier.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDirectoryResult withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
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
            sb.append("DirectoryId: " + getDirectoryId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDirectoryResult == false)
            return false;
        DeleteDirectoryResult other = (DeleteDirectoryResult) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
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
        return hashCode;
    }

    @Override
    public DeleteDirectoryResult clone() {
        try {
            return (DeleteDirectoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
