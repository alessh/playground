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
 * Represents information about how an action runs.
 * </p>
 */
public class ActionExecution implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A summary of the run of the action.
     * </p>
     */
    private String summary;
    /**
     * <p>
     * The last status change of the action.
     * </p>
     */
    private java.util.Date lastStatusChange;
    /**
     * <p>
     * The external ID of the run of the action.
     * </p>
     */
    private String externalExecutionId;
    /**
     * <p>
     * The URL of a resource external to AWS that will be used when running the
     * action, for example an external repository URL.
     * </p>
     */
    private String externalExecutionUrl;
    /**
     * <p>
     * A percentage of completeness of the action as it runs.
     * </p>
     */
    private Integer percentComplete;
    /**
     * <p>
     * The details of an error returned by a URL external to AWS.
     * </p>
     */
    private ErrorDetails errorDetails;

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     * 
     * @param status
     *        The status of the action, or for a completed action, the last
     *        status of the action.
     * @see ActionExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     * 
     * @return The status of the action, or for a completed action, the last
     *         status of the action.
     * @see ActionExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     * 
     * @param status
     *        The status of the action, or for a completed action, the last
     *        status of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ActionExecutionStatus
     */

    public ActionExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     * 
     * @param status
     *        The status of the action, or for a completed action, the last
     *        status of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ActionExecutionStatus
     */

    public void setStatus(ActionExecutionStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the action, or for a completed action, the last status of
     * the action.
     * </p>
     * 
     * @param status
     *        The status of the action, or for a completed action, the last
     *        status of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ActionExecutionStatus
     */

    public ActionExecution withStatus(ActionExecutionStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * A summary of the run of the action.
     * </p>
     * 
     * @param summary
     *        A summary of the run of the action.
     */

    public void setSummary(String summary) {
        this.summary = summary;
    }

    /**
     * <p>
     * A summary of the run of the action.
     * </p>
     * 
     * @return A summary of the run of the action.
     */

    public String getSummary() {
        return this.summary;
    }

    /**
     * <p>
     * A summary of the run of the action.
     * </p>
     * 
     * @param summary
     *        A summary of the run of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withSummary(String summary) {
        setSummary(summary);
        return this;
    }

    /**
     * <p>
     * The last status change of the action.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the action.
     */

    public void setLastStatusChange(java.util.Date lastStatusChange) {
        this.lastStatusChange = lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the action.
     * </p>
     * 
     * @return The last status change of the action.
     */

    public java.util.Date getLastStatusChange() {
        return this.lastStatusChange;
    }

    /**
     * <p>
     * The last status change of the action.
     * </p>
     * 
     * @param lastStatusChange
     *        The last status change of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withLastStatusChange(java.util.Date lastStatusChange) {
        setLastStatusChange(lastStatusChange);
        return this;
    }

    /**
     * <p>
     * The external ID of the run of the action.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the action.
     */

    public void setExternalExecutionId(String externalExecutionId) {
        this.externalExecutionId = externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the action.
     * </p>
     * 
     * @return The external ID of the run of the action.
     */

    public String getExternalExecutionId() {
        return this.externalExecutionId;
    }

    /**
     * <p>
     * The external ID of the run of the action.
     * </p>
     * 
     * @param externalExecutionId
     *        The external ID of the run of the action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withExternalExecutionId(String externalExecutionId) {
        setExternalExecutionId(externalExecutionId);
        return this;
    }

    /**
     * <p>
     * The URL of a resource external to AWS that will be used when running the
     * action, for example an external repository URL.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The URL of a resource external to AWS that will be used when
     *        running the action, for example an external repository URL.
     */

    public void setExternalExecutionUrl(String externalExecutionUrl) {
        this.externalExecutionUrl = externalExecutionUrl;
    }

    /**
     * <p>
     * The URL of a resource external to AWS that will be used when running the
     * action, for example an external repository URL.
     * </p>
     * 
     * @return The URL of a resource external to AWS that will be used when
     *         running the action, for example an external repository URL.
     */

    public String getExternalExecutionUrl() {
        return this.externalExecutionUrl;
    }

    /**
     * <p>
     * The URL of a resource external to AWS that will be used when running the
     * action, for example an external repository URL.
     * </p>
     * 
     * @param externalExecutionUrl
     *        The URL of a resource external to AWS that will be used when
     *        running the action, for example an external repository URL.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withExternalExecutionUrl(String externalExecutionUrl) {
        setExternalExecutionUrl(externalExecutionUrl);
        return this;
    }

    /**
     * <p>
     * A percentage of completeness of the action as it runs.
     * </p>
     * 
     * @param percentComplete
     *        A percentage of completeness of the action as it runs.
     */

    public void setPercentComplete(Integer percentComplete) {
        this.percentComplete = percentComplete;
    }

    /**
     * <p>
     * A percentage of completeness of the action as it runs.
     * </p>
     * 
     * @return A percentage of completeness of the action as it runs.
     */

    public Integer getPercentComplete() {
        return this.percentComplete;
    }

    /**
     * <p>
     * A percentage of completeness of the action as it runs.
     * </p>
     * 
     * @param percentComplete
     *        A percentage of completeness of the action as it runs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withPercentComplete(Integer percentComplete) {
        setPercentComplete(percentComplete);
        return this;
    }

    /**
     * <p>
     * The details of an error returned by a URL external to AWS.
     * </p>
     * 
     * @param errorDetails
     *        The details of an error returned by a URL external to AWS.
     */

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }

    /**
     * <p>
     * The details of an error returned by a URL external to AWS.
     * </p>
     * 
     * @return The details of an error returned by a URL external to AWS.
     */

    public ErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    /**
     * <p>
     * The details of an error returned by a URL external to AWS.
     * </p>
     * 
     * @param errorDetails
     *        The details of an error returned by a URL external to AWS.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActionExecution withErrorDetails(ErrorDetails errorDetails) {
        setErrorDetails(errorDetails);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getSummary() != null)
            sb.append("Summary: " + getSummary() + ",");
        if (getLastStatusChange() != null)
            sb.append("LastStatusChange: " + getLastStatusChange() + ",");
        if (getExternalExecutionId() != null)
            sb.append("ExternalExecutionId: " + getExternalExecutionId() + ",");
        if (getExternalExecutionUrl() != null)
            sb.append("ExternalExecutionUrl: " + getExternalExecutionUrl()
                    + ",");
        if (getPercentComplete() != null)
            sb.append("PercentComplete: " + getPercentComplete() + ",");
        if (getErrorDetails() != null)
            sb.append("ErrorDetails: " + getErrorDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActionExecution == false)
            return false;
        ActionExecution other = (ActionExecution) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getSummary() == null ^ this.getSummary() == null)
            return false;
        if (other.getSummary() != null
                && other.getSummary().equals(this.getSummary()) == false)
            return false;
        if (other.getLastStatusChange() == null
                ^ this.getLastStatusChange() == null)
            return false;
        if (other.getLastStatusChange() != null
                && other.getLastStatusChange().equals(
                        this.getLastStatusChange()) == false)
            return false;
        if (other.getExternalExecutionId() == null
                ^ this.getExternalExecutionId() == null)
            return false;
        if (other.getExternalExecutionId() != null
                && other.getExternalExecutionId().equals(
                        this.getExternalExecutionId()) == false)
            return false;
        if (other.getExternalExecutionUrl() == null
                ^ this.getExternalExecutionUrl() == null)
            return false;
        if (other.getExternalExecutionUrl() != null
                && other.getExternalExecutionUrl().equals(
                        this.getExternalExecutionUrl()) == false)
            return false;
        if (other.getPercentComplete() == null
                ^ this.getPercentComplete() == null)
            return false;
        if (other.getPercentComplete() != null
                && other.getPercentComplete().equals(this.getPercentComplete()) == false)
            return false;
        if (other.getErrorDetails() == null ^ this.getErrorDetails() == null)
            return false;
        if (other.getErrorDetails() != null
                && other.getErrorDetails().equals(this.getErrorDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getSummary() == null) ? 0 : getSummary().hashCode());
        hashCode = prime
                * hashCode
                + ((getLastStatusChange() == null) ? 0 : getLastStatusChange()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalExecutionId() == null) ? 0
                        : getExternalExecutionId().hashCode());
        hashCode = prime
                * hashCode
                + ((getExternalExecutionUrl() == null) ? 0
                        : getExternalExecutionUrl().hashCode());
        hashCode = prime
                * hashCode
                + ((getPercentComplete() == null) ? 0 : getPercentComplete()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getErrorDetails() == null) ? 0 : getErrorDetails()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ActionExecution clone() {
        try {
            return (ActionExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
