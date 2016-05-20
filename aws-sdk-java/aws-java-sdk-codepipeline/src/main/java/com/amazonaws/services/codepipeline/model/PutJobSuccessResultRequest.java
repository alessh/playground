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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a put job success result action.
 * </p>
 */
public class PutJobSuccessResultRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The unique system-generated ID of the job that succeeded. This is the
     * same ID returned from PollForJobs.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked upon
     * by the job.
     * </p>
     */
    private CurrentRevision currentRevision;
    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that
     * the successful job used to complete a job asynchronously.
     * </p>
     */
    private String continuationToken;
    /**
     * <p>
     * The execution details of the successful job, such as the actions taken by
     * the job worker.
     * </p>
     */
    private ExecutionDetails executionDetails;

    /**
     * <p>
     * The unique system-generated ID of the job that succeeded. This is the
     * same ID returned from PollForJobs.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job that succeeded. This is
     *        the same ID returned from PollForJobs.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job that succeeded. This is the
     * same ID returned from PollForJobs.
     * </p>
     * 
     * @return The unique system-generated ID of the job that succeeded. This is
     *         the same ID returned from PollForJobs.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The unique system-generated ID of the job that succeeded. This is the
     * same ID returned from PollForJobs.
     * </p>
     * 
     * @param jobId
     *        The unique system-generated ID of the job that succeeded. This is
     *        the same ID returned from PollForJobs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutJobSuccessResultRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked upon
     * by the job.
     * </p>
     * 
     * @param currentRevision
     *        The ID of the current revision of the artifact successfully worked
     *        upon by the job.
     */

    public void setCurrentRevision(CurrentRevision currentRevision) {
        this.currentRevision = currentRevision;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked upon
     * by the job.
     * </p>
     * 
     * @return The ID of the current revision of the artifact successfully
     *         worked upon by the job.
     */

    public CurrentRevision getCurrentRevision() {
        return this.currentRevision;
    }

    /**
     * <p>
     * The ID of the current revision of the artifact successfully worked upon
     * by the job.
     * </p>
     * 
     * @param currentRevision
     *        The ID of the current revision of the artifact successfully worked
     *        upon by the job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutJobSuccessResultRequest withCurrentRevision(
            CurrentRevision currentRevision) {
        setCurrentRevision(currentRevision);
        return this;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that
     * the successful job used to complete a job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID,
     *        that the successful job used to complete a job asynchronously.
     */

    public void setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that
     * the successful job used to complete a job asynchronously.
     * </p>
     * 
     * @return A system-generated token, such as a AWS CodeDeploy deployment ID,
     *         that the successful job used to complete a job asynchronously.
     */

    public String getContinuationToken() {
        return this.continuationToken;
    }

    /**
     * <p>
     * A system-generated token, such as a AWS CodeDeploy deployment ID, that
     * the successful job used to complete a job asynchronously.
     * </p>
     * 
     * @param continuationToken
     *        A system-generated token, such as a AWS CodeDeploy deployment ID,
     *        that the successful job used to complete a job asynchronously.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutJobSuccessResultRequest withContinuationToken(
            String continuationToken) {
        setContinuationToken(continuationToken);
        return this;
    }

    /**
     * <p>
     * The execution details of the successful job, such as the actions taken by
     * the job worker.
     * </p>
     * 
     * @param executionDetails
     *        The execution details of the successful job, such as the actions
     *        taken by the job worker.
     */

    public void setExecutionDetails(ExecutionDetails executionDetails) {
        this.executionDetails = executionDetails;
    }

    /**
     * <p>
     * The execution details of the successful job, such as the actions taken by
     * the job worker.
     * </p>
     * 
     * @return The execution details of the successful job, such as the actions
     *         taken by the job worker.
     */

    public ExecutionDetails getExecutionDetails() {
        return this.executionDetails;
    }

    /**
     * <p>
     * The execution details of the successful job, such as the actions taken by
     * the job worker.
     * </p>
     * 
     * @param executionDetails
     *        The execution details of the successful job, such as the actions
     *        taken by the job worker.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutJobSuccessResultRequest withExecutionDetails(
            ExecutionDetails executionDetails) {
        setExecutionDetails(executionDetails);
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
        if (getJobId() != null)
            sb.append("JobId: " + getJobId() + ",");
        if (getCurrentRevision() != null)
            sb.append("CurrentRevision: " + getCurrentRevision() + ",");
        if (getContinuationToken() != null)
            sb.append("ContinuationToken: " + getContinuationToken() + ",");
        if (getExecutionDetails() != null)
            sb.append("ExecutionDetails: " + getExecutionDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutJobSuccessResultRequest == false)
            return false;
        PutJobSuccessResultRequest other = (PutJobSuccessResultRequest) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null
                && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getCurrentRevision() == null
                ^ this.getCurrentRevision() == null)
            return false;
        if (other.getCurrentRevision() != null
                && other.getCurrentRevision().equals(this.getCurrentRevision()) == false)
            return false;
        if (other.getContinuationToken() == null
                ^ this.getContinuationToken() == null)
            return false;
        if (other.getContinuationToken() != null
                && other.getContinuationToken().equals(
                        this.getContinuationToken()) == false)
            return false;
        if (other.getExecutionDetails() == null
                ^ this.getExecutionDetails() == null)
            return false;
        if (other.getExecutionDetails() != null
                && other.getExecutionDetails().equals(
                        this.getExecutionDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime
                * hashCode
                + ((getCurrentRevision() == null) ? 0 : getCurrentRevision()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getContinuationToken() == null) ? 0
                        : getContinuationToken().hashCode());
        hashCode = prime
                * hashCode
                + ((getExecutionDetails() == null) ? 0 : getExecutionDetails()
                        .hashCode());
        return hashCode;
    }

    @Override
    public PutJobSuccessResultRequest clone() {
        return (PutJobSuccessResultRequest) super.clone();
    }
}