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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateInstanceProfileRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance profile to create.
     * </p>
     */
    private String instanceProfileName;
    /**
     * <p>
     * The path to the instance profile. For more information about paths, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     */
    private String path;

    /**
     * <p>
     * The name of the instance profile to create.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile to create.
     */

    public void setInstanceProfileName(String instanceProfileName) {
        this.instanceProfileName = instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to create.
     * </p>
     * 
     * @return The name of the instance profile to create.
     */

    public String getInstanceProfileName() {
        return this.instanceProfileName;
    }

    /**
     * <p>
     * The name of the instance profile to create.
     * </p>
     * 
     * @param instanceProfileName
     *        The name of the instance profile to create.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateInstanceProfileRequest withInstanceProfileName(
            String instanceProfileName) {
        setInstanceProfileName(instanceProfileName);
        return this;
    }

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the instance profile. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @return The path to the instance profile. For more information about
     *         paths, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the instance profile. For more information about paths, see
     * <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the instance profile. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateInstanceProfileRequest withPath(String path) {
        setPath(path);
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
        if (getInstanceProfileName() != null)
            sb.append("InstanceProfileName: " + getInstanceProfileName() + ",");
        if (getPath() != null)
            sb.append("Path: " + getPath());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateInstanceProfileRequest == false)
            return false;
        CreateInstanceProfileRequest other = (CreateInstanceProfileRequest) obj;
        if (other.getInstanceProfileName() == null
                ^ this.getInstanceProfileName() == null)
            return false;
        if (other.getInstanceProfileName() != null
                && other.getInstanceProfileName().equals(
                        this.getInstanceProfileName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceProfileName() == null) ? 0
                        : getInstanceProfileName().hashCode());
        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        return hashCode;
    }

    @Override
    public CreateInstanceProfileRequest clone() {
        return (CreateInstanceProfileRequest) super.clone();
    }
}