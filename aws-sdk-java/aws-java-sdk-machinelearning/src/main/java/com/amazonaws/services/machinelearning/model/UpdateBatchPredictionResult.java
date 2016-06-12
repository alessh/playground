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
 * Represents the output of an <a>UpdateBatchPrediction</a> operation.
 * </p>
 * <p>
 * You can see the updated content by using the <a>GetBatchPrediction</a>
 * operation.
 * </p>
 */
public class UpdateBatchPredictionResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> during creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionId</code> in the request.
     * </p>
     */
    private String batchPredictionId;

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> during creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> during
     *        creation. This value should be identical to the value of the
     *        <code>BatchPredictionId</code> in the request.
     */

    public void setBatchPredictionId(String batchPredictionId) {
        this.batchPredictionId = batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> during creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @return The ID assigned to the <code>BatchPrediction</code> during
     *         creation. This value should be identical to the value of the
     *         <code>BatchPredictionId</code> in the request.
     */

    public String getBatchPredictionId() {
        return this.batchPredictionId;
    }

    /**
     * <p>
     * The ID assigned to the <code>BatchPrediction</code> during creation. This
     * value should be identical to the value of the
     * <code>BatchPredictionId</code> in the request.
     * </p>
     * 
     * @param batchPredictionId
     *        The ID assigned to the <code>BatchPrediction</code> during
     *        creation. This value should be identical to the value of the
     *        <code>BatchPredictionId</code> in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateBatchPredictionResult withBatchPredictionId(
            String batchPredictionId) {
        setBatchPredictionId(batchPredictionId);
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
        if (getBatchPredictionId() != null)
            sb.append("BatchPredictionId: " + getBatchPredictionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBatchPredictionResult == false)
            return false;
        UpdateBatchPredictionResult other = (UpdateBatchPredictionResult) obj;
        if (other.getBatchPredictionId() == null
                ^ this.getBatchPredictionId() == null)
            return false;
        if (other.getBatchPredictionId() != null
                && other.getBatchPredictionId().equals(
                        this.getBatchPredictionId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getBatchPredictionId() == null) ? 0
                        : getBatchPredictionId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBatchPredictionResult clone() {
        try {
            return (UpdateBatchPredictionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
