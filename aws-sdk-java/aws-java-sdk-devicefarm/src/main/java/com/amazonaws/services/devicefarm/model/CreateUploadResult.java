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

package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the result of a create upload request.
 * </p>
 */
public class CreateUploadResult implements Serializable, Cloneable {

    /**
     * <p>
     * The newly created upload.
     * </p>
     */
    private Upload upload;

    /**
     * <p>
     * The newly created upload.
     * </p>
     * 
     * @param upload
     *        The newly created upload.
     */

    public void setUpload(Upload upload) {
        this.upload = upload;
    }

    /**
     * <p>
     * The newly created upload.
     * </p>
     * 
     * @return The newly created upload.
     */

    public Upload getUpload() {
        return this.upload;
    }

    /**
     * <p>
     * The newly created upload.
     * </p>
     * 
     * @param upload
     *        The newly created upload.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateUploadResult withUpload(Upload upload) {
        setUpload(upload);
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
        if (getUpload() != null)
            sb.append("Upload: " + getUpload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUploadResult == false)
            return false;
        CreateUploadResult other = (CreateUploadResult) obj;
        if (other.getUpload() == null ^ this.getUpload() == null)
            return false;
        if (other.getUpload() != null
                && other.getUpload().equals(this.getUpload()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUpload() == null) ? 0 : getUpload().hashCode());
        return hashCode;
    }

    @Override
    public CreateUploadResult clone() {
        try {
            return (CreateUploadResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
