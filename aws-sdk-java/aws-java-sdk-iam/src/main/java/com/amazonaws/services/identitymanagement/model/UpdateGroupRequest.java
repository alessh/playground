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
public class UpdateGroupRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * New path for the group. Only include this if changing the group's path.
     * </p>
     */
    private String newPath;
    /**
     * <p>
     * New name for the group. Only include this if changing the group's name.
     * </p>
     */
    private String newGroupName;

    /**
     * Default constructor for UpdateGroupRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize the object after
     * creating it.
     */
    public UpdateGroupRequest() {
    }

    /**
     * Constructs a new UpdateGroupRequest object. Callers should use the setter
     * or fluent setter (with...) methods to initialize any additional object
     * members.
     * 
     * @param groupName
     *        Name of the group to update. If you're changing the name of the
     *        group, this is the original name.
     */
    public UpdateGroupRequest(String groupName) {
        setGroupName(groupName);
    }

    /**
     * <p>
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * </p>
     * 
     * @param groupName
     *        Name of the group to update. If you're changing the name of the
     *        group, this is the original name.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * </p>
     * 
     * @return Name of the group to update. If you're changing the name of the
     *         group, this is the original name.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * Name of the group to update. If you're changing the name of the group,
     * this is the original name.
     * </p>
     * 
     * @param groupName
     *        Name of the group to update. If you're changing the name of the
     *        group, this is the original name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGroupRequest withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * New path for the group. Only include this if changing the group's path.
     * </p>
     * 
     * @param newPath
     *        New path for the group. Only include this if changing the group's
     *        path.
     */

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    /**
     * <p>
     * New path for the group. Only include this if changing the group's path.
     * </p>
     * 
     * @return New path for the group. Only include this if changing the group's
     *         path.
     */

    public String getNewPath() {
        return this.newPath;
    }

    /**
     * <p>
     * New path for the group. Only include this if changing the group's path.
     * </p>
     * 
     * @param newPath
     *        New path for the group. Only include this if changing the group's
     *        path.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGroupRequest withNewPath(String newPath) {
        setNewPath(newPath);
        return this;
    }

    /**
     * <p>
     * New name for the group. Only include this if changing the group's name.
     * </p>
     * 
     * @param newGroupName
     *        New name for the group. Only include this if changing the group's
     *        name.
     */

    public void setNewGroupName(String newGroupName) {
        this.newGroupName = newGroupName;
    }

    /**
     * <p>
     * New name for the group. Only include this if changing the group's name.
     * </p>
     * 
     * @return New name for the group. Only include this if changing the group's
     *         name.
     */

    public String getNewGroupName() {
        return this.newGroupName;
    }

    /**
     * <p>
     * New name for the group. Only include this if changing the group's name.
     * </p>
     * 
     * @param newGroupName
     *        New name for the group. Only include this if changing the group's
     *        name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGroupRequest withNewGroupName(String newGroupName) {
        setNewGroupName(newGroupName);
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
        if (getGroupName() != null)
            sb.append("GroupName: " + getGroupName() + ",");
        if (getNewPath() != null)
            sb.append("NewPath: " + getNewPath() + ",");
        if (getNewGroupName() != null)
            sb.append("NewGroupName: " + getNewGroupName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGroupRequest == false)
            return false;
        UpdateGroupRequest other = (UpdateGroupRequest) obj;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null
                && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getNewPath() == null ^ this.getNewPath() == null)
            return false;
        if (other.getNewPath() != null
                && other.getNewPath().equals(this.getNewPath()) == false)
            return false;
        if (other.getNewGroupName() == null ^ this.getNewGroupName() == null)
            return false;
        if (other.getNewGroupName() != null
                && other.getNewGroupName().equals(this.getNewGroupName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getNewPath() == null) ? 0 : getNewPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewGroupName() == null) ? 0 : getNewGroupName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateGroupRequest clone() {
        return (UpdateGroupRequest) super.clone();
    }
}