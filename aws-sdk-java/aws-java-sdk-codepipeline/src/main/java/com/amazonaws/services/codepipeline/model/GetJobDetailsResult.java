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
 * Represents the output of a get job details action.
 * </p>
 */
public class GetJobDetailsResult implements Serializable, Cloneable {

    /**
     * <p>
     * The details of the job.
     * </p>
     * <note>
     * <p>
     * If AWSSessionCredentials is used, a long-running job can call
     * GetJobDetails again to obtain new credentials.
     * </p>
     * </note>
     */
    private JobDetails jobDetails;

    /**
     * <p>
     * The details of the job.
     * </p>
     * <note>
     * <p>
     * If AWSSessionCredentials is used, a long-running job can call
     * GetJobDetails again to obtain new credentials.
     * </p>
     * </note>
     * 
     * @param jobDetails
     *        The details of the job. </p> <note>
     *        <p>
     *        If AWSSessionCredentials is used, a long-running job can call
     *        GetJobDetails again to obtain new credentials.
     *        </p>
     */

    public void setJobDetails(JobDetails jobDetails) {
        this.jobDetails = jobDetails;
    }

    /**
     * <p>
     * The details of the job.
     * </p>
     * <note>
     * <p>
     * If AWSSessionCredentials is used, a long-running job can call
     * GetJobDetails again to obtain new credentials.
     * </p>
     * </note>
     * 
     * @return The details of the job. </p> <note>
     *         <p>
     *         If AWSSessionCredentials is used, a long-running job can call
     *         GetJobDetails again to obtain new credentials.
     *         </p>
     */

    public JobDetails getJobDetails() {
        return this.jobDetails;
    }

    /**
     * <p>
     * The details of the job.
     * </p>
     * <note>
     * <p>
     * If AWSSessionCredentials is used, a long-running job can call
     * GetJobDetails again to obtain new credentials.
     * </p>
     * </note>
     * 
     * @param jobDetails
     *        The details of the job. </p> <note>
     *        <p>
     *        If AWSSessionCredentials is used, a long-running job can call
     *        GetJobDetails again to obtain new credentials.
     *        </p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetJobDetailsResult withJobDetails(JobDetails jobDetails) {
        setJobDetails(jobDetails);
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
        if (getJobDetails() != null)
            sb.append("JobDetails: " + getJobDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetJobDetailsResult == false)
            return false;
        GetJobDetailsResult other = (GetJobDetailsResult) obj;
        if (other.getJobDetails() == null ^ this.getJobDetails() == null)
            return false;
        if (other.getJobDetails() != null
                && other.getJobDetails().equals(this.getJobDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobDetails() == null) ? 0 : getJobDetails().hashCode());
        return hashCode;
    }

    @Override
    public GetJobDetailsResult clone() {
        try {
            return (GetJobDetailsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
