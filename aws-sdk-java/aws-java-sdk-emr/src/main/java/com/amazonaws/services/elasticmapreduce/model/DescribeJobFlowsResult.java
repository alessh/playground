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
 * The output for the <a>DescribeJobFlows</a> operation.
 * </p>
 */
public class DescribeJobFlowsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of job flows matching the parameters supplied.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<JobFlowDetail> jobFlows;

    /**
     * <p>
     * A list of job flows matching the parameters supplied.
     * </p>
     * 
     * @return A list of job flows matching the parameters supplied.
     */

    public java.util.List<JobFlowDetail> getJobFlows() {
        if (jobFlows == null) {
            jobFlows = new com.amazonaws.internal.SdkInternalList<JobFlowDetail>();
        }
        return jobFlows;
    }

    /**
     * <p>
     * A list of job flows matching the parameters supplied.
     * </p>
     * 
     * @param jobFlows
     *        A list of job flows matching the parameters supplied.
     */

    public void setJobFlows(java.util.Collection<JobFlowDetail> jobFlows) {
        if (jobFlows == null) {
            this.jobFlows = null;
            return;
        }

        this.jobFlows = new com.amazonaws.internal.SdkInternalList<JobFlowDetail>(
                jobFlows);
    }

    /**
     * <p>
     * A list of job flows matching the parameters supplied.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setJobFlows(java.util.Collection)} or
     * {@link #withJobFlows(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobFlows
     *        A list of job flows matching the parameters supplied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeJobFlowsResult withJobFlows(JobFlowDetail... jobFlows) {
        if (this.jobFlows == null) {
            setJobFlows(new com.amazonaws.internal.SdkInternalList<JobFlowDetail>(
                    jobFlows.length));
        }
        for (JobFlowDetail ele : jobFlows) {
            this.jobFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of job flows matching the parameters supplied.
     * </p>
     * 
     * @param jobFlows
     *        A list of job flows matching the parameters supplied.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeJobFlowsResult withJobFlows(
            java.util.Collection<JobFlowDetail> jobFlows) {
        setJobFlows(jobFlows);
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
        if (getJobFlows() != null)
            sb.append("JobFlows: " + getJobFlows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeJobFlowsResult == false)
            return false;
        DescribeJobFlowsResult other = (DescribeJobFlowsResult) obj;
        if (other.getJobFlows() == null ^ this.getJobFlows() == null)
            return false;
        if (other.getJobFlows() != null
                && other.getJobFlows().equals(this.getJobFlows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobFlows() == null) ? 0 : getJobFlows().hashCode());
        return hashCode;
    }

    @Override
    public DescribeJobFlowsResult clone() {
        try {
            return (DescribeJobFlowsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
