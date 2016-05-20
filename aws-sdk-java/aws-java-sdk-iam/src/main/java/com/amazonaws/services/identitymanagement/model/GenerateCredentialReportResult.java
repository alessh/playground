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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the response to a successful <a>GenerateCredentialReport</a>
 * request.
 * </p>
 */
public class GenerateCredentialReportResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Information about the credential report.
     * </p>
     */
    private String description;

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     * 
     * @param state
     *        Information about the state of the credential report.
     * @see ReportStateType
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     * 
     * @return Information about the state of the credential report.
     * @see ReportStateType
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     * 
     * @param state
     *        Information about the state of the credential report.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReportStateType
     */

    public GenerateCredentialReportResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     * 
     * @param state
     *        Information about the state of the credential report.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReportStateType
     */

    public void setState(ReportStateType state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * Information about the state of the credential report.
     * </p>
     * 
     * @param state
     *        Information about the state of the credential report.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ReportStateType
     */

    public GenerateCredentialReportResult withState(ReportStateType state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Information about the credential report.
     * </p>
     * 
     * @param description
     *        Information about the credential report.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * Information about the credential report.
     * </p>
     * 
     * @return Information about the credential report.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * Information about the credential report.
     * </p>
     * 
     * @param description
     *        Information about the credential report.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GenerateCredentialReportResult withDescription(String description) {
        setDescription(description);
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
        if (getState() != null)
            sb.append("State: " + getState() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GenerateCredentialReportResult == false)
            return false;
        GenerateCredentialReportResult other = (GenerateCredentialReportResult) obj;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null
                && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return hashCode;
    }

    @Override
    public GenerateCredentialReportResult clone() {
        try {
            return (GenerateCredentialReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
