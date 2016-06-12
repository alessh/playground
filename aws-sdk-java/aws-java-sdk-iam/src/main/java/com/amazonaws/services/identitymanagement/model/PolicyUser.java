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
 * Contains information about a user that a managed policy is attached to.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <a>ListEntitiesForPolicy</a> action.
 * </p>
 * <p>
 * For more information about managed policies, refer to <a href=
 * "http://docs.aws.amazon.com/IAM/latest/UserGuide/policies-managed-vs-inline.html"
 * >Managed Policies and Inline Policies</a> in the <i>Using IAM</i> guide.
 * </p>
 */
public class PolicyUser implements Serializable, Cloneable {

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     */
    private String userName;

    private String userId;

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) identifying the user.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * 
     * @return The name (friendly name, not ARN) identifying the user.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name (friendly name, not ARN) identifying the user.
     * </p>
     * 
     * @param userName
     *        The name (friendly name, not ARN) identifying the user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PolicyUser withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * @param userId
     */

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return
     */

    public String getUserId() {
        return this.userId;
    }

    /**
     * @param userId
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PolicyUser withUserId(String userId) {
        setUserId(userId);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getUserId() != null)
            sb.append("UserId: " + getUserId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyUser == false)
            return false;
        PolicyUser other = (PolicyUser) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null
                && other.getUserId().equals(this.getUserId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode
                + ((getUserId() == null) ? 0 : getUserId().hashCode());
        return hashCode;
    }

    @Override
    public PolicyUser clone() {
        try {
            return (PolicyUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
