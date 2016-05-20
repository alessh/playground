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
 * Contains the output of ReportTaskRunnerHeartbeat.
 * </p>
 */
public class ReportTaskRunnerHeartbeatResult implements Serializable, Cloneable {

    /**
     * <p>
     * Indicates whether the calling task runner should terminate.
     * </p>
     */
    private Boolean terminate;

    /**
     * <p>
     * Indicates whether the calling task runner should terminate.
     * </p>
     * 
     * @param terminate
     *        Indicates whether the calling task runner should terminate.
     */

    public void setTerminate(Boolean terminate) {
        this.terminate = terminate;
    }

    /**
     * <p>
     * Indicates whether the calling task runner should terminate.
     * </p>
     * 
     * @return Indicates whether the calling task runner should terminate.
     */

    public Boolean getTerminate() {
        return this.terminate;
    }

    /**
     * <p>
     * Indicates whether the calling task runner should terminate.
     * </p>
     * 
     * @param terminate
     *        Indicates whether the calling task runner should terminate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ReportTaskRunnerHeartbeatResult withTerminate(Boolean terminate) {
        setTerminate(terminate);
        return this;
    }

    /**
     * <p>
     * Indicates whether the calling task runner should terminate.
     * </p>
     * 
     * @return Indicates whether the calling task runner should terminate.
     */

    public Boolean isTerminate() {
        return this.terminate;
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
        if (getTerminate() != null)
            sb.append("Terminate: " + getTerminate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportTaskRunnerHeartbeatResult == false)
            return false;
        ReportTaskRunnerHeartbeatResult other = (ReportTaskRunnerHeartbeatResult) obj;
        if (other.getTerminate() == null ^ this.getTerminate() == null)
            return false;
        if (other.getTerminate() != null
                && other.getTerminate().equals(this.getTerminate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getTerminate() == null) ? 0 : getTerminate().hashCode());
        return hashCode;
    }

    @Override
    public ReportTaskRunnerHeartbeatResult clone() {
        try {
            return (ReportTaskRunnerHeartbeatResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
