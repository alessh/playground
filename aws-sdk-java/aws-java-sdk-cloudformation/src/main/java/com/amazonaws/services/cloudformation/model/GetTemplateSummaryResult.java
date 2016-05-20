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
 * The output for the <a>GetTemplateSummary</a> action.
 * </p>
 */
public class GetTemplateSummaryResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ParameterDeclaration> parameters;
    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     */
    private String capabilitiesReason;
    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> resourceTypes;
    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     */
    private String metadata;

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * 
     * @return A list of parameter declarations that describe various properties
     *         for each parameter.
     */

    public java.util.List<ParameterDeclaration> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<ParameterDeclaration>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * 
     * @param parameters
     *        A list of parameter declarations that describe various properties
     *        for each parameter.
     */

    public void setParameters(
            java.util.Collection<ParameterDeclaration> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<ParameterDeclaration>(
                parameters);
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setParameters(java.util.Collection)} or
     * {@link #withParameters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param parameters
     *        A list of parameter declarations that describe various properties
     *        for each parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withParameters(
            ParameterDeclaration... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<ParameterDeclaration>(
                    parameters.length));
        }
        for (ParameterDeclaration ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameter declarations that describe various properties for
     * each parameter.
     * </p>
     * 
     * @param parameters
     *        A list of parameter declarations that describe various properties
     *        for each parameter.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withParameters(
            java.util.Collection<ParameterDeclaration> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * 
     * @param description
     *        The value that is defined in the <code>Description</code> property
     *        of the template.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * 
     * @return The value that is defined in the <code>Description</code>
     *         property of the template.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The value that is defined in the <code>Description</code> property of the
     * template.
     * </p>
     * 
     * @param description
     *        The value that is defined in the <code>Description</code> property
     *        of the template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     * 
     * @return The capabilities found within the template. Currently, AWS
     *         CloudFormation supports only the CAPABILITY_IAM capability. If
     *         your template contains IAM resources, you must specify the
     *         CAPABILITY_IAM value for this parameter when you use the
     *         <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *         template; otherwise, those actions return an
     *         InsufficientCapabilities error.
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. Currently, AWS
     *        CloudFormation supports only the CAPABILITY_IAM capability. If
     *        your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM value for this parameter when you use the
     *        <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *        template; otherwise, those actions return an
     *        InsufficientCapabilities error.
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(
                capabilities);
    }

    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCapabilities(java.util.Collection)} or
     * {@link #withCapabilities(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. Currently, AWS
     *        CloudFormation supports only the CAPABILITY_IAM capability. If
     *        your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM value for this parameter when you use the
     *        <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *        template; otherwise, those actions return an
     *        InsufficientCapabilities error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Capability
     */

    public GetTemplateSummaryResult withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(
                    capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. Currently, AWS
     *        CloudFormation supports only the CAPABILITY_IAM capability. If
     *        your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM value for this parameter when you use the
     *        <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *        template; otherwise, those actions return an
     *        InsufficientCapabilities error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Capability
     */

    public GetTemplateSummaryResult withCapabilities(
            java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The capabilities found within the template. Currently, AWS CloudFormation
     * supports only the CAPABILITY_IAM capability. If your template contains
     * IAM resources, you must specify the CAPABILITY_IAM value for this
     * parameter when you use the <a>CreateStack</a> or <a>UpdateStack</a>
     * actions with your template; otherwise, those actions return an
     * InsufficientCapabilities error.
     * </p>
     * 
     * @param capabilities
     *        The capabilities found within the template. Currently, AWS
     *        CloudFormation supports only the CAPABILITY_IAM capability. If
     *        your template contains IAM resources, you must specify the
     *        CAPABILITY_IAM value for this parameter when you use the
     *        <a>CreateStack</a> or <a>UpdateStack</a> actions with your
     *        template; otherwise, those actions return an
     *        InsufficientCapabilities error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see Capability
     */

    public GetTemplateSummaryResult withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(
                capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     * 
     * @param capabilitiesReason
     *        The list of resources that generated the values in the
     *        <code>Capabilities</code> response element.
     */

    public void setCapabilitiesReason(String capabilitiesReason) {
        this.capabilitiesReason = capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     * 
     * @return The list of resources that generated the values in the
     *         <code>Capabilities</code> response element.
     */

    public String getCapabilitiesReason() {
        return this.capabilitiesReason;
    }

    /**
     * <p>
     * The list of resources that generated the values in the
     * <code>Capabilities</code> response element.
     * </p>
     * 
     * @param capabilitiesReason
     *        The list of resources that generated the values in the
     *        <code>Capabilities</code> response element.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withCapabilitiesReason(
            String capabilitiesReason) {
        setCapabilitiesReason(capabilitiesReason);
        return this;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * 
     * @return A list of all the template resource types that are defined in the
     *         template, such as <code>AWS::EC2::Instance</code>,
     *         <code>AWS::Dynamo::Table</code>, and
     *         <code>Custom::MyCustomInstance</code>.
     */

    public java.util.List<String> getResourceTypes() {
        if (resourceTypes == null) {
            resourceTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return resourceTypes;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * 
     * @param resourceTypes
     *        A list of all the template resource types that are defined in the
     *        template, such as <code>AWS::EC2::Instance</code>,
     *        <code>AWS::Dynamo::Table</code>, and
     *        <code>Custom::MyCustomInstance</code>.
     */

    public void setResourceTypes(java.util.Collection<String> resourceTypes) {
        if (resourceTypes == null) {
            this.resourceTypes = null;
            return;
        }

        this.resourceTypes = new com.amazonaws.internal.SdkInternalList<String>(
                resourceTypes);
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResourceTypes(java.util.Collection)} or
     * {@link #withResourceTypes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param resourceTypes
     *        A list of all the template resource types that are defined in the
     *        template, such as <code>AWS::EC2::Instance</code>,
     *        <code>AWS::Dynamo::Table</code>, and
     *        <code>Custom::MyCustomInstance</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withResourceTypes(String... resourceTypes) {
        if (this.resourceTypes == null) {
            setResourceTypes(new com.amazonaws.internal.SdkInternalList<String>(
                    resourceTypes.length));
        }
        for (String ele : resourceTypes) {
            this.resourceTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of all the template resource types that are defined in the
     * template, such as <code>AWS::EC2::Instance</code>,
     * <code>AWS::Dynamo::Table</code>, and
     * <code>Custom::MyCustomInstance</code>.
     * </p>
     * 
     * @param resourceTypes
     *        A list of all the template resource types that are defined in the
     *        template, such as <code>AWS::EC2::Instance</code>,
     *        <code>AWS::Dynamo::Table</code>, and
     *        <code>Custom::MyCustomInstance</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withResourceTypes(
            java.util.Collection<String> resourceTypes) {
        setResourceTypes(resourceTypes);
        return this;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     * 
     * @param version
     *        The AWS template format version, which identifies the capabilities
     *        of the template.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     * 
     * @return The AWS template format version, which identifies the
     *         capabilities of the template.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The AWS template format version, which identifies the capabilities of the
     * template.
     * </p>
     * 
     * @param version
     *        The AWS template format version, which identifies the capabilities
     *        of the template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     * 
     * @param metadata
     *        The value that is defined for the <code>Metadata</code> property
     *        of the template.
     */

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     * 
     * @return The value that is defined for the <code>Metadata</code> property
     *         of the template.
     */

    public String getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The value that is defined for the <code>Metadata</code> property of the
     * template.
     * </p>
     * 
     * @param metadata
     *        The value that is defined for the <code>Metadata</code> property
     *        of the template.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetTemplateSummaryResult withMetadata(String metadata) {
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
        if (getParameters() != null)
            sb.append("Parameters: " + getParameters() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCapabilities() != null)
            sb.append("Capabilities: " + getCapabilities() + ",");
        if (getCapabilitiesReason() != null)
            sb.append("CapabilitiesReason: " + getCapabilitiesReason() + ",");
        if (getResourceTypes() != null)
            sb.append("ResourceTypes: " + getResourceTypes() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
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

        if (obj instanceof GetTemplateSummaryResult == false)
            return false;
        GetTemplateSummaryResult other = (GetTemplateSummaryResult) obj;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null
                && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getCapabilitiesReason() == null
                ^ this.getCapabilitiesReason() == null)
            return false;
        if (other.getCapabilitiesReason() != null
                && other.getCapabilitiesReason().equals(
                        this.getCapabilitiesReason()) == false)
            return false;
        if (other.getResourceTypes() == null ^ this.getResourceTypes() == null)
            return false;
        if (other.getResourceTypes() != null
                && other.getResourceTypes().equals(this.getResourceTypes()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null
                && other.getVersion().equals(this.getVersion()) == false)
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
                + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getCapabilities() == null) ? 0 : getCapabilities()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCapabilitiesReason() == null) ? 0
                        : getCapabilitiesReason().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceTypes() == null) ? 0 : getResourceTypes()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode
                + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetTemplateSummaryResult clone() {
        try {
            return (GetTemplateSummaryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
