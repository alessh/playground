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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to change information about the <a>BasePathMapping</a> resource.
 * </p>
 */
public class UpdateBasePathMappingRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to change.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The base path of the <a>BasePathMapping</a> resource to change.
     * </p>
     */
    private String basePath;
    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     */
    private java.util.List<PatchOperation> patchOperations;

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to change.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @return The domain name of the <a>BasePathMapping</a> resource to change.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The domain name of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @param domainName
     *        The domain name of the <a>BasePathMapping</a> resource to change.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateBasePathMappingRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The base path of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @param basePath
     *        The base path of the <a>BasePathMapping</a> resource to change.
     */

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    /**
     * <p>
     * The base path of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @return The base path of the <a>BasePathMapping</a> resource to change.
     */

    public String getBasePath() {
        return this.basePath;
    }

    /**
     * <p>
     * The base path of the <a>BasePathMapping</a> resource to change.
     * </p>
     * 
     * @param basePath
     *        The base path of the <a>BasePathMapping</a> resource to change.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateBasePathMappingRequest withBasePath(String basePath) {
        setBasePath(basePath);
        return this;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @return A list of operations describing the updates to apply to the
     *         specified resource. The patches are applied in the order
     *         specified in the list.
     */

    public java.util.List<PatchOperation> getPatchOperations() {
        return patchOperations;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     */

    public void setPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        if (patchOperations == null) {
            this.patchOperations = null;
            return;
        }

        this.patchOperations = new java.util.ArrayList<PatchOperation>(
                patchOperations);
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPatchOperations(java.util.Collection)} or
     * {@link #withPatchOperations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateBasePathMappingRequest withPatchOperations(
            PatchOperation... patchOperations) {
        if (this.patchOperations == null) {
            setPatchOperations(new java.util.ArrayList<PatchOperation>(
                    patchOperations.length));
        }
        for (PatchOperation ele : patchOperations) {
            this.patchOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations describing the updates to apply to the specified
     * resource. The patches are applied in the order specified in the list.
     * </p>
     * 
     * @param patchOperations
     *        A list of operations describing the updates to apply to the
     *        specified resource. The patches are applied in the order specified
     *        in the list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateBasePathMappingRequest withPatchOperations(
            java.util.Collection<PatchOperation> patchOperations) {
        setPatchOperations(patchOperations);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getBasePath() != null)
            sb.append("BasePath: " + getBasePath() + ",");
        if (getPatchOperations() != null)
            sb.append("PatchOperations: " + getPatchOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBasePathMappingRequest == false)
            return false;
        UpdateBasePathMappingRequest other = (UpdateBasePathMappingRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getBasePath() == null ^ this.getBasePath() == null)
            return false;
        if (other.getBasePath() != null
                && other.getBasePath().equals(this.getBasePath()) == false)
            return false;
        if (other.getPatchOperations() == null
                ^ this.getPatchOperations() == null)
            return false;
        if (other.getPatchOperations() != null
                && other.getPatchOperations().equals(this.getPatchOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode
                + ((getBasePath() == null) ? 0 : getBasePath().hashCode());
        hashCode = prime
                * hashCode
                + ((getPatchOperations() == null) ? 0 : getPatchOperations()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateBasePathMappingRequest clone() {
        return (UpdateBasePathMappingRequest) super.clone();
    }
}