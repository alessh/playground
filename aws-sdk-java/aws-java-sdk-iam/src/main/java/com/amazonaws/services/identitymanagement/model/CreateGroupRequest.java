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
public class CreateGroupRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
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
     * The name of the group to create. Do not include the path in this value.
     * </p>
     */
    private String groupName;

    /**
     * Default constructor for CreateGroupRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public CreateGroupRequest() {
    }

    /**
     * Constructs a new CreateGroupRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param groupName
     *        The name of the group to create. Do not include the path in this
     *        value.
     */
    public CreateGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    /**
     * <p>
     * The path to the group. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the group. For more information about paths, see <a
     *        href=
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
     * The path to the group. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @return The path to the group. For more information about paths, see <a
     *         href=
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
     * The path to the group. For more information about paths, see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path to the group. For more information about paths, see <a
     *        href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGroupRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
     * </p>
     * 
     * @param groupName
     *        The name of the group to create. Do not include the path in this
     *        value.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
     * </p>
     * 
     * @return The name of the group to create. Do not include the path in this
     *         value.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the group to create. Do not include the path in this value.
     * </p>
     * 
     * @param groupName
     *        The name of the group to create. Do not include the path in this
     *        value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGroupRequest == false)
            return false;
        CreateGroupRequest other = (CreateGroupRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        return hashCode;
    }

    @Override
    public CreateGroupRequest clone() {
        return (CreateGroupRequest) super.clone();
    }
}