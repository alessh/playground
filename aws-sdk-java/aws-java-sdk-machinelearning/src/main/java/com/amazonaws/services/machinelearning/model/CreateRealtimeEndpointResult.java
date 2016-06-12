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
 * Represents the output of an <a>CreateRealtimeEndpoint</a> operation.
 * </p>
 * <p>
 * The result contains the <code>MLModelId</code> and the endpoint information
 * for the <code>MLModel</code>.
 * </p>
 * <note>
 * <p>
 * The endpoint information includes the URI of the <code>MLModel</code>; that
 * is, the location to send online prediction requests for the specified
 * <code>MLModel</code>.
 * </p>
 * </note>
 */
public class CreateRealtimeEndpointResult implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelId</code>
     * in the request.
     * </p>
     */
    private String mLModelId;
    /**
     * <p>
     * The endpoint information of the <code>MLModel</code>
     * </p>
     */
    private RealtimeEndpointInfo realtimeEndpointInfo;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelId</code>
     * in the request.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the
     *        <code>MLModel</code>. This value should be identical to the value
     *        of the <code>MLModelId</code> in the request.
     */

    public void setMLModelId(String mLModelId) {
        this.mLModelId = mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelId</code>
     * in the request.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the
     *         <code>MLModel</code>. This value should be identical to the value
     *         of the <code>MLModelId</code> in the request.
     */

    public String getMLModelId() {
        return this.mLModelId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>MLModel</code>.
     * This value should be identical to the value of the <code>MLModelId</code>
     * in the request.
     * </p>
     * 
     * @param mLModelId
     *        A user-supplied ID that uniquely identifies the
     *        <code>MLModel</code>. This value should be identical to the value
     *        of the <code>MLModelId</code> in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRealtimeEndpointResult withMLModelId(String mLModelId) {
        setMLModelId(mLModelId);
        return this;
    }

    /**
     * <p>
     * The endpoint information of the <code>MLModel</code>
     * </p>
     * 
     * @param realtimeEndpointInfo
     *        The endpoint information of the <code>MLModel</code>
     */

    public void setRealtimeEndpointInfo(
            RealtimeEndpointInfo realtimeEndpointInfo) {
        this.realtimeEndpointInfo = realtimeEndpointInfo;
    }

    /**
     * <p>
     * The endpoint information of the <code>MLModel</code>
     * </p>
     * 
     * @return The endpoint information of the <code>MLModel</code>
     */

    public RealtimeEndpointInfo getRealtimeEndpointInfo() {
        return this.realtimeEndpointInfo;
    }

    /**
     * <p>
     * The endpoint information of the <code>MLModel</code>
     * </p>
     * 
     * @param realtimeEndpointInfo
     *        The endpoint information of the <code>MLModel</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateRealtimeEndpointResult withRealtimeEndpointInfo(
            RealtimeEndpointInfo realtimeEndpointInfo) {
        setRealtimeEndpointInfo(realtimeEndpointInfo);
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
        if (getMLModelId() != null)
            sb.append("MLModelId: " + getMLModelId() + ",");
        if (getRealtimeEndpointInfo() != null)
            sb.append("RealtimeEndpointInfo: " + getRealtimeEndpointInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRealtimeEndpointResult == false)
            return false;
        CreateRealtimeEndpointResult other = (CreateRealtimeEndpointResult) obj;
        if (other.getMLModelId() == null ^ this.getMLModelId() == null)
            return false;
        if (other.getMLModelId() != null
                && other.getMLModelId().equals(this.getMLModelId()) == false)
            return false;
        if (other.getRealtimeEndpointInfo() == null
                ^ this.getRealtimeEndpointInfo() == null)
            return false;
        if (other.getRealtimeEndpointInfo() != null
                && other.getRealtimeEndpointInfo().equals(
                        this.getRealtimeEndpointInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMLModelId() == null) ? 0 : getMLModelId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRealtimeEndpointInfo() == null) ? 0
                        : getRealtimeEndpointInfo().hashCode());
        return hashCode;
    }

    @Override
    public CreateRealtimeEndpointResult clone() {
        try {
            return (CreateRealtimeEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
