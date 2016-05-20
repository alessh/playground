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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of an <a>UpdateDataSource</a> operation.
 * </p>
 * <p>
 * You can see the updated content by using the <a>GetBatchPrediction</a>
 * operation.
 * </p>
 */
public class UpdateDataSourceResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation. This
     * value should be identical to the value of the <code>DataSourceID</code>
     * in the request.
     * </p>
     */
    private String dataSourceId;

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation. This
     * value should be identical to the value of the <code>DataSourceID</code>
     * in the request.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> during creation.
     *        This value should be identical to the value of the
     *        <code>DataSourceID</code> in the request.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation. This
     * value should be identical to the value of the <code>DataSourceID</code>
     * in the request.
     * </p>
     * 
     * @return The ID assigned to the <code>DataSource</code> during creation.
     *         This value should be identical to the value of the
     *         <code>DataSourceID</code> in the request.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The ID assigned to the <code>DataSource</code> during creation. This
     * value should be identical to the value of the <code>DataSourceID</code>
     * in the request.
     * </p>
     * 
     * @param dataSourceId
     *        The ID assigned to the <code>DataSource</code> during creation.
     *        This value should be identical to the value of the
     *        <code>DataSourceID</code> in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateDataSourceResult withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: " + getDataSourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataSourceResult == false)
            return false;
        UpdateDataSourceResult other = (UpdateDataSourceResult) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null
                && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataSourceId() == null) ? 0 : getDataSourceId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataSourceResult clone() {
        try {
            return (UpdateDataSourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
