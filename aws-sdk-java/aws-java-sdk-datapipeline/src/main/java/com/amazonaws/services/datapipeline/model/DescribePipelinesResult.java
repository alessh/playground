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

package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output of DescribePipelines.
 * </p>
 */
public class DescribePipelinesResult implements Serializable, Cloneable {

    /**
     * <p>
     * An array of descriptions for the specified pipelines.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PipelineDescription> pipelineDescriptionList;

    /**
     * <p>
     * An array of descriptions for the specified pipelines.
     * </p>
     * 
     * @return An array of descriptions for the specified pipelines.
     */

    public java.util.List<PipelineDescription> getPipelineDescriptionList() {
        if (pipelineDescriptionList == null) {
            pipelineDescriptionList = new com.amazonaws.internal.SdkInternalList<PipelineDescription>();
        }
        return pipelineDescriptionList;
    }

    /**
     * <p>
     * An array of descriptions for the specified pipelines.
     * </p>
     * 
     * @param pipelineDescriptionList
     *        An array of descriptions for the specified pipelines.
     */

    public void setPipelineDescriptionList(
            java.util.Collection<PipelineDescription> pipelineDescriptionList) {
        if (pipelineDescriptionList == null) {
            this.pipelineDescriptionList = null;
            return;
        }

        this.pipelineDescriptionList = new com.amazonaws.internal.SdkInternalList<PipelineDescription>(
                pipelineDescriptionList);
    }

    /**
     * <p>
     * An array of descriptions for the specified pipelines.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPipelineDescriptionList(java.util.Collection)} or
     * {@link #withPipelineDescriptionList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param pipelineDescriptionList
     *        An array of descriptions for the specified pipelines.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePipelinesResult withPipelineDescriptionList(
            PipelineDescription... pipelineDescriptionList) {
        if (this.pipelineDescriptionList == null) {
            setPipelineDescriptionList(new com.amazonaws.internal.SdkInternalList<PipelineDescription>(
                    pipelineDescriptionList.length));
        }
        for (PipelineDescription ele : pipelineDescriptionList) {
            this.pipelineDescriptionList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of descriptions for the specified pipelines.
     * </p>
     * 
     * @param pipelineDescriptionList
     *        An array of descriptions for the specified pipelines.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribePipelinesResult withPipelineDescriptionList(
            java.util.Collection<PipelineDescription> pipelineDescriptionList) {
        setPipelineDescriptionList(pipelineDescriptionList);
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
        if (getPipelineDescriptionList() != null)
            sb.append("PipelineDescriptionList: "
                    + getPipelineDescriptionList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePipelinesResult == false)
            return false;
        DescribePipelinesResult other = (DescribePipelinesResult) obj;
        if (other.getPipelineDescriptionList() == null
                ^ this.getPipelineDescriptionList() == null)
            return false;
        if (other.getPipelineDescriptionList() != null
                && other.getPipelineDescriptionList().equals(
                        this.getPipelineDescriptionList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPipelineDescriptionList() == null) ? 0
                        : getPipelineDescriptionList().hashCode());
        return hashCode;
    }

    @Override
    public DescribePipelinesResult clone() {
        try {
            return (DescribePipelinesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
