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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * Contains detailed information about the specified stack resource.
 * </p>
 */
public class StackResourceDetail implements Serializable, Cloneable {

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     */
    private String logicalResourceId;
    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     */
    private String physicalResourceId;
    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     */
    private String resourceType;
    /**
     * <p>
     * Time the status was updated.
     * </p>
     */
    private java.util.Date lastUpdatedTimestamp;
    /**
     * <p>
     * Current status of the resource.
     * </p>
     */
    private String resourceStatus;
    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     */
    private String resourceStatusReason;
    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The JSON format content of the <code>Metadata</code> attribute declared
     * for the resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @return The name associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @return Unique identifier of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     */

    public void setLogicalResourceId(String logicalResourceId) {
        this.logicalResourceId = logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @return The logical name of the resource specified in the template.
     */

    public String getLogicalResourceId() {
        return this.logicalResourceId;
    }

    /**
     * <p>
     * The logical name of the resource specified in the template.
     * </p>
     * 
     * @param logicalResourceId
     *        The logical name of the resource specified in the template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withLogicalResourceId(String logicalResourceId) {
        setLogicalResourceId(logicalResourceId);
        return this;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical
     *        instance ID of a resource supported by AWS CloudFormation.
     */

    public void setPhysicalResourceId(String physicalResourceId) {
        this.physicalResourceId = physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     * 
     * @return The name or unique identifier that corresponds to a physical
     *         instance ID of a resource supported by AWS CloudFormation.
     */

    public String getPhysicalResourceId() {
        return this.physicalResourceId;
    }

    /**
     * <p>
     * The name or unique identifier that corresponds to a physical instance ID
     * of a resource supported by AWS CloudFormation.
     * </p>
     * 
     * @param physicalResourceId
     *        The name or unique identifier that corresponds to a physical
     *        instance ID of a resource supported by AWS CloudFormation.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withPhysicalResourceId(String physicalResourceId) {
        setPhysicalResourceId(physicalResourceId);
        return this;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. ((For more information, go to <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        > AWS Resource Types Reference</a> in the AWS CloudFormation User
     *        Guide.)
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @return Type of resource. ((For more information, go to <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *         > AWS Resource Types Reference</a> in the AWS CloudFormation User
     *         Guide.)
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * <p>
     * Type of resource. ((For more information, go to <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     * > AWS Resource Types Reference</a> in the AWS CloudFormation User Guide.)
     * </p>
     * 
     * @param resourceType
     *        Type of resource. ((For more information, go to <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-template-resource-type-ref.html"
     *        > AWS Resource Types Reference</a> in the AWS CloudFormation User
     *        Guide.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        Time the status was updated.
     */

    public void setLastUpdatedTimestamp(java.util.Date lastUpdatedTimestamp) {
        this.lastUpdatedTimestamp = lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @return Time the status was updated.
     */

    public java.util.Date getLastUpdatedTimestamp() {
        return this.lastUpdatedTimestamp;
    }

    /**
     * <p>
     * Time the status was updated.
     * </p>
     * 
     * @param lastUpdatedTimestamp
     *        Time the status was updated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withLastUpdatedTimestamp(
            java.util.Date lastUpdatedTimestamp) {
        setLastUpdatedTimestamp(lastUpdatedTimestamp);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @see ResourceStatus
     */

    public void setResourceStatus(String resourceStatus) {
        this.resourceStatus = resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @return Current status of the resource.
     * @see ResourceStatus
     */

    public String getResourceStatus() {
        return this.resourceStatus;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */

    public StackResourceDetail withResourceStatus(String resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */

    public void setResourceStatus(ResourceStatus resourceStatus) {
        this.resourceStatus = resourceStatus.toString();
    }

    /**
     * <p>
     * Current status of the resource.
     * </p>
     * 
     * @param resourceStatus
     *        Current status of the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ResourceStatus
     */

    public StackResourceDetail withResourceStatus(ResourceStatus resourceStatus) {
        setResourceStatus(resourceStatus);
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     */

    public void setResourceStatusReason(String resourceStatusReason) {
        this.resourceStatusReason = resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @return Success/failure message associated with the resource.
     */

    public String getResourceStatusReason() {
        return this.resourceStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the resource.
     * </p>
     * 
     * @param resourceStatusReason
     *        Success/failure message associated with the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withResourceStatusReason(
            String resourceStatusReason) {
        setResourceStatusReason(resourceStatusReason);
        return this;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * 
     * @param description
     *        User defined description associated with the resource.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * 
     * @return User defined description associated with the resource.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * User defined description associated with the resource.
     * </p>
     * 
     * @param description
     *        User defined description associated with the resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The JSON format content of the <code>Metadata</code> attribute declared
     * for the resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param metadata
     *        The JSON format content of the <code>Metadata</code> attribute
     *        declared for the resource. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *        >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The JSON format content of the <code>Metadata</code> attribute declared
     * for the resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @return The JSON format content of the <code>Metadata</code> attribute
     *         declared for the resource. For more information, see <a href=
     *         "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *         >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The JSON format content of the <code>Metadata</code> attribute declared
     * for the resource. For more information, see <a href=
     * "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     * >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * </p>
     * 
     * @param metadata
     *        The JSON format content of the <code>Metadata</code> attribute
     *        declared for the resource. For more information, see <a href=
     *        "http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-metadata.html"
     *        >Metadata Attribute</a> in the AWS CloudFormation User Guide.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StackResourceDetail withMetadata(String metadata) {
        setMetadata(metadata);
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
        if (getStackName() != null)
            sb.append("StackName: " + getStackName() + ",");
        if (getStackId() != null)
            sb.append("StackId: " + getStackId() + ",");
        if (getLogicalResourceId() != null)
            sb.append("LogicalResourceId: " + getLogicalResourceId() + ",");
        if (getPhysicalResourceId() != null)
            sb.append("PhysicalResourceId: " + getPhysicalResourceId() + ",");
        if (getResourceType() != null)
            sb.append("ResourceType: " + getResourceType() + ",");
        if (getLastUpdatedTimestamp() != null)
            sb.append("LastUpdatedTimestamp: " + getLastUpdatedTimestamp()
                    + ",");
        if (getResourceStatus() != null)
            sb.append("ResourceStatus: " + getResourceStatus() + ",");
        if (getResourceStatusReason() != null)
            sb.append("ResourceStatusReason: " + getResourceStatusReason()
                    + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getMetadata() != null)
            sb.append("Metadata: " + getMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackResourceDetail == false)
            return false;
        StackResourceDetail other = (StackResourceDetail) obj;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null
                && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null
                && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getLogicalResourceId() == null
                ^ this.getLogicalResourceId() == null)
            return false;
        if (other.getLogicalResourceId() != null
                && other.getLogicalResourceId().equals(
                        this.getLogicalResourceId()) == false)
            return false;
        if (other.getPhysicalResourceId() == null
                ^ this.getPhysicalResourceId() == null)
            return false;
        if (other.getPhysicalResourceId() != null
                && other.getPhysicalResourceId().equals(
                        this.getPhysicalResourceId()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null
                && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getLastUpdatedTimestamp() == null
                ^ this.getLastUpdatedTimestamp() == null)
            return false;
        if (other.getLastUpdatedTimestamp() != null
                && other.getLastUpdatedTimestamp().equals(
                        this.getLastUpdatedTimestamp()) == false)
            return false;
        if (other.getResourceStatus() == null
                ^ this.getResourceStatus() == null)
            return false;
        if (other.getResourceStatus() != null
                && other.getResourceStatus().equals(this.getResourceStatus()) == false)
            return false;
        if (other.getResourceStatusReason() == null
                ^ this.getResourceStatusReason() == null)
            return false;
        if (other.getResourceStatusReason() != null
                && other.getResourceStatusReason().equals(
                        this.getResourceStatusReason()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null
                && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode
                + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime
                * hashCode
                + ((getLogicalResourceId() == null) ? 0
                        : getLogicalResourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getPhysicalResourceId() == null) ? 0
                        : getPhysicalResourceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceType() == null) ? 0 : getResourceType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastUpdatedTimestamp() == null) ? 0
                        : getLastUpdatedTimestamp().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceStatus() == null) ? 0 : getResourceStatus()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceStatusReason() == null) ? 0
                        : getResourceStatusReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public StackResourceDetail clone() {
        try {
            return (StackResourceDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
