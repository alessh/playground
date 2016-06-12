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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteAssessmentRunRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     */
    private String assessmentRunArn;

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN specifying the assessment run that you want to delete.
     */

    public void setAssessmentRunArn(String assessmentRunArn) {
        this.assessmentRunArn = assessmentRunArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @return The ARN specifying the assessment run that you want to delete.
     */

    public String getAssessmentRunArn() {
        return this.assessmentRunArn;
    }

    /**
     * <p>
     * The ARN specifying the assessment run that you want to delete.
     * </p>
     * 
     * @param assessmentRunArn
     *        The ARN specifying the assessment run that you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteAssessmentRunRequest withAssessmentRunArn(
            String assessmentRunArn) {
        setAssessmentRunArn(assessmentRunArn);
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
        if (getAssessmentRunArn() != null)
            sb.append("AssessmentRunArn: " + getAssessmentRunArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssessmentRunRequest == false)
            return false;
        DeleteAssessmentRunRequest other = (DeleteAssessmentRunRequest) obj;
        if (other.getAssessmentRunArn() == null
                ^ this.getAssessmentRunArn() == null)
            return false;
        if (other.getAssessmentRunArn() != null
                && other.getAssessmentRunArn().equals(
                        this.getAssessmentRunArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentRunArn() == null) ? 0 : getAssessmentRunArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssessmentRunRequest clone() {
        return (DeleteAssessmentRunRequest) super.clone();
    }
}