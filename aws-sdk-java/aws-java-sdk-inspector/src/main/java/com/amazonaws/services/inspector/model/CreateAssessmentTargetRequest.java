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
public class CreateAssessmentTargetRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The user-defined name identifying the assessment target that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     */
    private String assessmentTargetName;
    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * assessment target.
     * </p>
     */
    private String resourceGroupArn;

    /**
     * <p>
     * The user-defined name identifying the assessment target that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @param assessmentTargetName
     *        The user-defined name identifying the assessment target that you
     *        want to create. The name must be unique within the AWS account.
     */

    public void setAssessmentTargetName(String assessmentTargetName) {
        this.assessmentTargetName = assessmentTargetName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment target that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @return The user-defined name identifying the assessment target that you
     *         want to create. The name must be unique within the AWS account.
     */

    public String getAssessmentTargetName() {
        return this.assessmentTargetName;
    }

    /**
     * <p>
     * The user-defined name identifying the assessment target that you want to
     * create. The name must be unique within the AWS account.
     * </p>
     * 
     * @param assessmentTargetName
     *        The user-defined name identifying the assessment target that you
     *        want to create. The name must be unique within the AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTargetRequest withAssessmentTargetName(
            String assessmentTargetName) {
        setAssessmentTargetName(assessmentTargetName);
        return this;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * assessment target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is used to create the
     *        assessment target.
     */

    public void setResourceGroupArn(String resourceGroupArn) {
        this.resourceGroupArn = resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * assessment target.
     * </p>
     * 
     * @return The ARN specifying the resource group that is used to create the
     *         assessment target.
     */

    public String getResourceGroupArn() {
        return this.resourceGroupArn;
    }

    /**
     * <p>
     * The ARN specifying the resource group that is used to create the
     * assessment target.
     * </p>
     * 
     * @param resourceGroupArn
     *        The ARN specifying the resource group that is used to create the
     *        assessment target.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAssessmentTargetRequest withResourceGroupArn(
            String resourceGroupArn) {
        setResourceGroupArn(resourceGroupArn);
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
        if (getAssessmentTargetName() != null)
            sb.append("AssessmentTargetName: " + getAssessmentTargetName()
                    + ",");
        if (getResourceGroupArn() != null)
            sb.append("ResourceGroupArn: " + getResourceGroupArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAssessmentTargetRequest == false)
            return false;
        CreateAssessmentTargetRequest other = (CreateAssessmentTargetRequest) obj;
        if (other.getAssessmentTargetName() == null
                ^ this.getAssessmentTargetName() == null)
            return false;
        if (other.getAssessmentTargetName() != null
                && other.getAssessmentTargetName().equals(
                        this.getAssessmentTargetName()) == false)
            return false;
        if (other.getResourceGroupArn() == null
                ^ this.getResourceGroupArn() == null)
            return false;
        if (other.getResourceGroupArn() != null
                && other.getResourceGroupArn().equals(
                        this.getResourceGroupArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAssessmentTargetName() == null) ? 0
                        : getAssessmentTargetName().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceGroupArn() == null) ? 0 : getResourceGroupArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentTargetRequest clone() {
        return (CreateAssessmentTargetRequest) super.clone();
    }
}