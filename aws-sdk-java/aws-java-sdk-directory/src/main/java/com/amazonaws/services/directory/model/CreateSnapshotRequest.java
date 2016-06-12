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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>CreateSnapshot</a> operation.
 * </p>
 */
public class CreateSnapshotRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory of which to take a snapshot.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The descriptive name to apply to the snapshot.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The identifier of the directory of which to take a snapshot.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory of which to take a snapshot.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory of which to take a snapshot.
     * </p>
     * 
     * @return The identifier of the directory of which to take a snapshot.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory of which to take a snapshot.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory of which to take a snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The descriptive name to apply to the snapshot.
     * </p>
     * 
     * @param name
     *        The descriptive name to apply to the snapshot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The descriptive name to apply to the snapshot.
     * </p>
     * 
     * @return The descriptive name to apply to the snapshot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The descriptive name to apply to the snapshot.
     * </p>
     * 
     * @param name
     *        The descriptive name to apply to the snapshot.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSnapshotRequest withName(String name) {
        setName(name);
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSnapshotRequest == false)
            return false;
        CreateSnapshotRequest other = (CreateSnapshotRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
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
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateSnapshotRequest clone() {
        return (CreateSnapshotRequest) super.clone();
    }
}