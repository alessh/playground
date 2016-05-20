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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The result of the <a>RunJobFlow</a> operation.
 * </p>
 */
public class RunJobFlowResult implements Serializable, Cloneable {

    /**
     * <p>
     * An unique identifier for the job flow.
     * </p>
     */
    private String jobFlowId;

    /**
     * <p>
     * An unique identifier for the job flow.
     * </p>
     * 
     * @param jobFlowId
     *        An unique identifier for the job flow.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * An unique identifier for the job flow.
     * </p>
     * 
     * @return An unique identifier for the job flow.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * An unique identifier for the job flow.
     * </p>
     * 
     * @param jobFlowId
     *        An unique identifier for the job flow.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RunJobFlowResult withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
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
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RunJobFlowResult == false)
            return false;
        RunJobFlowResult other = (RunJobFlowResult) obj;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        return hashCode;
    }

    @Override
    public RunJobFlowResult clone() {
        try {
            return (RunJobFlowResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
