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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GrantAccessRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The instance's AWS OpsWorks ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant
     * expires at the end of this period, the user will no longer be able to use
     * the credentials to log in. If the user is logged in at the time, he or
     * she automatically will be logged out.
     * </p>
     */
    private Integer validForInMinutes;

    /**
     * <p>
     * The instance's AWS OpsWorks ID.
     * </p>
     * 
     * @param instanceId
     *        The instance's AWS OpsWorks ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance's AWS OpsWorks ID.
     * </p>
     * 
     * @return The instance's AWS OpsWorks ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance's AWS OpsWorks ID.
     * </p>
     * 
     * @param instanceId
     *        The instance's AWS OpsWorks ID.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GrantAccessRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant
     * expires at the end of this period, the user will no longer be able to use
     * the credentials to log in. If the user is logged in at the time, he or
     * she automatically will be logged out.
     * </p>
     * 
     * @param validForInMinutes
     *        The length of time (in minutes) that the grant is valid. When the
     *        grant expires at the end of this period, the user will no longer
     *        be able to use the credentials to log in. If the user is logged in
     *        at the time, he or she automatically will be logged out.
     */

    public void setValidForInMinutes(Integer validForInMinutes) {
        this.validForInMinutes = validForInMinutes;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant
     * expires at the end of this period, the user will no longer be able to use
     * the credentials to log in. If the user is logged in at the time, he or
     * she automatically will be logged out.
     * </p>
     * 
     * @return The length of time (in minutes) that the grant is valid. When the
     *         grant expires at the end of this period, the user will no longer
     *         be able to use the credentials to log in. If the user is logged
     *         in at the time, he or she automatically will be logged out.
     */

    public Integer getValidForInMinutes() {
        return this.validForInMinutes;
    }

    /**
     * <p>
     * The length of time (in minutes) that the grant is valid. When the grant
     * expires at the end of this period, the user will no longer be able to use
     * the credentials to log in. If the user is logged in at the time, he or
     * she automatically will be logged out.
     * </p>
     * 
     * @param validForInMinutes
     *        The length of time (in minutes) that the grant is valid. When the
     *        grant expires at the end of this period, the user will no longer
     *        be able to use the credentials to log in. If the user is logged in
     *        at the time, he or she automatically will be logged out.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GrantAccessRequest withValidForInMinutes(Integer validForInMinutes) {
        setValidForInMinutes(validForInMinutes);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getValidForInMinutes() != null)
            sb.append("ValidForInMinutes: " + getValidForInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GrantAccessRequest == false)
            return false;
        GrantAccessRequest other = (GrantAccessRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getValidForInMinutes() == null
                ^ this.getValidForInMinutes() == null)
            return false;
        if (other.getValidForInMinutes() != null
                && other.getValidForInMinutes().equals(
                        this.getValidForInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidForInMinutes() == null) ? 0
                        : getValidForInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public GrantAccessRequest clone() {
        return (GrantAccessRequest) super.clone();
    }
}