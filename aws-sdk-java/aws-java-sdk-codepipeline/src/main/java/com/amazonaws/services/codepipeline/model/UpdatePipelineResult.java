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
 * Represents the output of an update pipeline action.
 * </p>
 */
public class UpdatePipelineResult implements Serializable, Cloneable {

    /**
     * <p>
     * The structure of the updated pipeline.
     * </p>
     */
    private PipelineDeclaration pipeline;

    /**
     * <p>
     * The structure of the updated pipeline.
     * </p>
     * 
     * @param pipeline
     *        The structure of the updated pipeline.
     */

    public void setPipeline(PipelineDeclaration pipeline) {
        this.pipeline = pipeline;
    }

    /**
     * <p>
     * The structure of the updated pipeline.
     * </p>
     * 
     * @return The structure of the updated pipeline.
     */

    public PipelineDeclaration getPipeline() {
        return this.pipeline;
    }

    /**
     * <p>
     * The structure of the updated pipeline.
     * </p>
     * 
     * @param pipeline
     *        The structure of the updated pipeline.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdatePipelineResult withPipeline(PipelineDeclaration pipeline) {
        setPipeline(pipeline);
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
        if (getPipeline() != null)
            sb.append("Pipeline: " + getPipeline());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdatePipelineResult == false)
            return false;
        UpdatePipelineResult other = (UpdatePipelineResult) obj;
        if (other.getPipeline() == null ^ this.getPipeline() == null)
            return false;
        if (other.getPipeline() != null
                && other.getPipeline().equals(this.getPipeline()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPipeline() == null) ? 0 : getPipeline().hashCode());
        return hashCode;
    }

    @Override
    public UpdatePipelineResult clone() {
        try {
            return (UpdatePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
