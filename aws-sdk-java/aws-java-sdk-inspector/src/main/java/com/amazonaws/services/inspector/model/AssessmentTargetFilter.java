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

/**
 * <p>
 * This data type is used as the request parameter in the
 * <a>ListAssessmentTargets</a> action.
 * </p>
 */
public class AssessmentTargetFilter implements Serializable, Cloneable {

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentTargetName</b> property of the <a>AssessmentTarget</a>
     * data type.
     * </p>
     */
    private String assessmentTargetNamePattern;

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentTargetName</b> property of the <a>AssessmentTarget</a>
     * data type.
     * </p>
     * 
     * @param assessmentTargetNamePattern
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>assessmentTargetName</b> property of the
     *        <a>AssessmentTarget</a> data type.
     */

    public void setAssessmentTargetNamePattern(
            String assessmentTargetNamePattern) {
        this.assessmentTargetNamePattern = assessmentTargetNamePattern;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentTargetName</b> property of the <a>AssessmentTarget</a>
     * data type.
     * </p>
     * 
     * @return For a record to match a filter, an explicit value or a string
     *         containing a wildcard specified for this data type property must
     *         match the value of the <b>assessmentTargetName</b> property of
     *         the <a>AssessmentTarget</a> data type.
     */

    public String getAssessmentTargetNamePattern() {
        return this.assessmentTargetNamePattern;
    }

    /**
     * <p>
     * For a record to match a filter, an explicit value or a string containing
     * a wildcard specified for this data type property must match the value of
     * the <b>assessmentTargetName</b> property of the <a>AssessmentTarget</a>
     * data type.
     * </p>
     * 
     * @param assessmentTargetNamePattern
     *        For a record to match a filter, an explicit value or a string
     *        containing a wildcard specified for this data type property must
     *        match the value of the <b>assessmentTargetName</b> property of the
     *        <a>AssessmentTarget</a> data type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AssessmentTargetFilter withAssessmentTargetNamePattern(
            String assessmentTargetNamePattern) {
        setAssessmentTargetNamePattern(assessmentTargetNamePattern);
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
        if (getAssessmentTargetNamePattern() != null)
            sb.append("AssessmentTargetNamePattern: "
                    + getAssessmentTargetNamePattern());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentTargetFilter == false)
            return false;
        AssessmentTargetFilter other = (AssessmentTargetFilter) obj;
        if (other.getAssessmentTargetNamePattern() == null
                ^ this.getAssessmentTargetNamePattern() == null)
            return false;
        if (other.getAssessmentTargetNamePattern() != null
                && other.getAssessmentTargetNamePattern().equals(
                        this.getAssessmentTargetNamePattern()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentTargetNamePattern() == null) ? 0
                        : getAssessmentTargetNamePattern().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentTargetFilter clone() {
        try {
            return (AssessmentTargetFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
