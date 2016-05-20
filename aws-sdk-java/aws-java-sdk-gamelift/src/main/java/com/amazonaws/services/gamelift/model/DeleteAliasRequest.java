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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class DeleteAliasRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify the alias you want to
     * delete.
     * </p>
     */
    private String aliasId;

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify the alias you want to
     * delete.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Specify the alias you want to
     *        delete.
     */

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify the alias you want to
     * delete.
     * </p>
     * 
     * @return Unique identifier for a fleet alias. Specify the alias you want
     *         to delete.
     */

    public String getAliasId() {
        return this.aliasId;
    }

    /**
     * <p>
     * Unique identifier for a fleet alias. Specify the alias you want to
     * delete.
     * </p>
     * 
     * @param aliasId
     *        Unique identifier for a fleet alias. Specify the alias you want to
     *        delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAliasRequest withAliasId(String aliasId) {
        setAliasId(aliasId);
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
        if (getAliasId() != null)
            sb.append("AliasId: " + getAliasId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAliasRequest == false)
            return false;
        DeleteAliasRequest other = (DeleteAliasRequest) obj;
        if (other.getAliasId() == null ^ this.getAliasId() == null)
            return false;
        if (other.getAliasId() != null
                && other.getAliasId().equals(this.getAliasId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAliasId() == null) ? 0 : getAliasId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAliasRequest clone() {
        return (DeleteAliasRequest) super.clone();
    }
}