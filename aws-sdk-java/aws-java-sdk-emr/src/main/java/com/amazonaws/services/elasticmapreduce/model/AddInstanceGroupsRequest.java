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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to an AddInstanceGroups call.
 * </p>
 */
public class AddInstanceGroupsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Instance Groups to add.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InstanceGroupConfig> instanceGroups;
    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     */
    private String jobFlowId;

    /**
     * Default constructor for AddInstanceGroupsRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public AddInstanceGroupsRequest() {
    }

    /**
     * Constructs a new AddInstanceGroupsRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param instanceGroups
     *        Instance Groups to add.
     * @param jobFlowId
     *        Job flow in which to add the instance groups.
     */
    public AddInstanceGroupsRequest(
            java.util.List<InstanceGroupConfig> instanceGroups, String jobFlowId) {
        setInstanceGroups(instanceGroups);
        setJobFlowId(jobFlowId);
    }

    /**
     * <p>
     * Instance Groups to add.
     * </p>
     * 
     * @return Instance Groups to add.
     */

    public java.util.List<InstanceGroupConfig> getInstanceGroups() {
        if (instanceGroups == null) {
            instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>();
        }
        return instanceGroups;
    }

    /**
     * <p>
     * Instance Groups to add.
     * </p>
     * 
     * @param instanceGroups
     *        Instance Groups to add.
     */

    public void setInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        if (instanceGroups == null) {
            this.instanceGroups = null;
            return;
        }

        this.instanceGroups = new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>(
                instanceGroups);
    }

    /**
     * <p>
     * Instance Groups to add.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceGroups(java.util.Collection)} or
     * {@link #withInstanceGroups(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceGroups
     *        Instance Groups to add.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddInstanceGroupsRequest withInstanceGroups(
            InstanceGroupConfig... instanceGroups) {
        if (this.instanceGroups == null) {
            setInstanceGroups(new com.amazonaws.internal.SdkInternalList<InstanceGroupConfig>(
                    instanceGroups.length));
        }
        for (InstanceGroupConfig ele : instanceGroups) {
            this.instanceGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Instance Groups to add.
     * </p>
     * 
     * @param instanceGroups
     *        Instance Groups to add.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddInstanceGroupsRequest withInstanceGroups(
            java.util.Collection<InstanceGroupConfig> instanceGroups) {
        setInstanceGroups(instanceGroups);
        return this;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * 
     * @param jobFlowId
     *        Job flow in which to add the instance groups.
     */

    public void setJobFlowId(String jobFlowId) {
        this.jobFlowId = jobFlowId;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * 
     * @return Job flow in which to add the instance groups.
     */

    public String getJobFlowId() {
        return this.jobFlowId;
    }

    /**
     * <p>
     * Job flow in which to add the instance groups.
     * </p>
     * 
     * @param jobFlowId
     *        Job flow in which to add the instance groups.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public AddInstanceGroupsRequest withJobFlowId(String jobFlowId) {
        setJobFlowId(jobFlowId);
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
        if (getInstanceGroups() != null)
            sb.append("InstanceGroups: " + getInstanceGroups() + ",");
        if (getJobFlowId() != null)
            sb.append("JobFlowId: " + getJobFlowId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddInstanceGroupsRequest == false)
            return false;
        AddInstanceGroupsRequest other = (AddInstanceGroupsRequest) obj;
        if (other.getInstanceGroups() == null
                ^ this.getInstanceGroups() == null)
            return false;
        if (other.getInstanceGroups() != null
                && other.getInstanceGroups().equals(this.getInstanceGroups()) == false)
            return false;
        if (other.getJobFlowId() == null ^ this.getJobFlowId() == null)
            return false;
        if (other.getJobFlowId() != null
                && other.getJobFlowId().equals(this.getJobFlowId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInstanceGroups() == null) ? 0 : getInstanceGroups()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getJobFlowId() == null) ? 0 : getJobFlowId().hashCode());
        return hashCode;
    }

    @Override
    public AddInstanceGroupsRequest clone() {
        return (AddInstanceGroupsRequest) super.clone();
    }
}