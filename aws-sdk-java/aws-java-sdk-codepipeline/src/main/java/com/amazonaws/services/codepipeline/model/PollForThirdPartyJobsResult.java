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
 * Represents the output of a poll for third party jobs action.
 * </p>
 */
public class PollForThirdPartyJobsResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the jobs to take action on.
     * </p>
     */
    private java.util.List<ThirdPartyJob> jobs;

    /**
     * <p>
     * Information about the jobs to take action on.
     * </p>
     * 
     * @return Information about the jobs to take action on.
     */

    public java.util.List<ThirdPartyJob> getJobs() {
        return jobs;
    }

    /**
     * <p>
     * Information about the jobs to take action on.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs to take action on.
     */

    public void setJobs(java.util.Collection<ThirdPartyJob> jobs) {
        if (jobs == null) {
            this.jobs = null;
            return;
        }

        this.jobs = new java.util.ArrayList<ThirdPartyJob>(jobs);
    }

    /**
     * <p>
     * Information about the jobs to take action on.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setJobs(java.util.Collection)} or
     * {@link #withJobs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs to take action on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForThirdPartyJobsResult withJobs(ThirdPartyJob... jobs) {
        if (this.jobs == null) {
            setJobs(new java.util.ArrayList<ThirdPartyJob>(jobs.length));
        }
        for (ThirdPartyJob ele : jobs) {
            this.jobs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the jobs to take action on.
     * </p>
     * 
     * @param jobs
     *        Information about the jobs to take action on.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PollForThirdPartyJobsResult withJobs(
            java.util.Collection<ThirdPartyJob> jobs) {
        setJobs(jobs);
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
        if (getJobs() != null)
            sb.append("Jobs: " + getJobs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PollForThirdPartyJobsResult == false)
            return false;
        PollForThirdPartyJobsResult other = (PollForThirdPartyJobsResult) obj;
        if (other.getJobs() == null ^ this.getJobs() == null)
            return false;
        if (other.getJobs() != null
                && other.getJobs().equals(this.getJobs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobs() == null) ? 0 : getJobs().hashCode());
        return hashCode;
    }

    @Override
    public PollForThirdPartyJobsResult clone() {
        try {
            return (PollForThirdPartyJobsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
