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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.StopInstancesRequestMarshaller;

/**
 * 
 */
public class StopInstancesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<StopInstancesRequest> {

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     */
    private Boolean force;

    /**
     * Default constructor for StopInstancesRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public StopInstancesRequest() {
    }

    /**
     * Constructs a new StopInstancesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param instanceIds
     *        One or more instance IDs.
     */
    public StopInstancesRequest(java.util.List<String> instanceIds) {
        setInstanceIds(instanceIds);
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @return One or more instance IDs.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(
                instanceIds);
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceIds(java.util.Collection)} or
     * {@link #withInstanceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StopInstancesRequest withInstanceIds(String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(
                    instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more instance IDs.
     * </p>
     * 
     * @param instanceIds
     *        One or more instance IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StopInstancesRequest withInstanceIds(
            java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param force
     *        Forces the instances to stop. The instances do not have an
     *        opportunity to flush file system caches or file system metadata.
     *        If you use this option, you must perform file system check and
     *        repair procedures. This option is not recommended for Windows
     *        instances.</p>
     *        <p>
     *        Default: <code>false</code>
     */

    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Forces the instances to stop. The instances do not have an
     *         opportunity to flush file system caches or file system metadata.
     *         If you use this option, you must perform file system check and
     *         repair procedures. This option is not recommended for Windows
     *         instances.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean getForce() {
        return this.force;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @param force
     *        Forces the instances to stop. The instances do not have an
     *        opportunity to flush file system caches or file system metadata.
     *        If you use this option, you must perform file system check and
     *        repair procedures. This option is not recommended for Windows
     *        instances.</p>
     *        <p>
     *        Default: <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StopInstancesRequest withForce(Boolean force) {
        setForce(force);
        return this;
    }

    /**
     * <p>
     * Forces the instances to stop. The instances do not have an opportunity to
     * flush file system caches or file system metadata. If you use this option,
     * you must perform file system check and repair procedures. This option is
     * not recommended for Windows instances.
     * </p>
     * <p>
     * Default: <code>false</code>
     * </p>
     * 
     * @return Forces the instances to stop. The instances do not have an
     *         opportunity to flush file system caches or file system metadata.
     *         If you use this option, you must perform file system check and
     *         repair procedures. This option is not recommended for Windows
     *         instances.</p>
     *         <p>
     *         Default: <code>false</code>
     */

    public Boolean isForce() {
        return this.force;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<StopInstancesRequest> getDryRunRequest() {
        Request<StopInstancesRequest> request = new StopInstancesRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopInstancesRequest == false)
            return false;
        StopInstancesRequest other = (StopInstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null
                && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode
                + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public StopInstancesRequest clone() {
        return (StopInstancesRequest) super.clone();
    }
}