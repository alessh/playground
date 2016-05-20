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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a batch get deployments operation.
 * </p>
 */
public class BatchGetDeploymentsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A list of deployment IDs, separated by spaces.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentIds;

    /**
     * <p>
     * A list of deployment IDs, separated by spaces.
     * </p>
     * 
     * @return A list of deployment IDs, separated by spaces.
     */

    public java.util.List<String> getDeploymentIds() {
        if (deploymentIds == null) {
            deploymentIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentIds;
    }

    /**
     * <p>
     * A list of deployment IDs, separated by spaces.
     * </p>
     * 
     * @param deploymentIds
     *        A list of deployment IDs, separated by spaces.
     */

    public void setDeploymentIds(java.util.Collection<String> deploymentIds) {
        if (deploymentIds == null) {
            this.deploymentIds = null;
            return;
        }

        this.deploymentIds = new com.amazonaws.internal.SdkInternalList<String>(
                deploymentIds);
    }

    /**
     * <p>
     * A list of deployment IDs, separated by spaces.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDeploymentIds(java.util.Collection)} or
     * {@link #withDeploymentIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param deploymentIds
     *        A list of deployment IDs, separated by spaces.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BatchGetDeploymentsRequest withDeploymentIds(String... deploymentIds) {
        if (this.deploymentIds == null) {
            setDeploymentIds(new com.amazonaws.internal.SdkInternalList<String>(
                    deploymentIds.length));
        }
        for (String ele : deploymentIds) {
            this.deploymentIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of deployment IDs, separated by spaces.
     * </p>
     * 
     * @param deploymentIds
     *        A list of deployment IDs, separated by spaces.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public BatchGetDeploymentsRequest withDeploymentIds(
            java.util.Collection<String> deploymentIds) {
        setDeploymentIds(deploymentIds);
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
        if (getDeploymentIds() != null)
            sb.append("DeploymentIds: " + getDeploymentIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetDeploymentsRequest == false)
            return false;
        BatchGetDeploymentsRequest other = (BatchGetDeploymentsRequest) obj;
        if (other.getDeploymentIds() == null ^ this.getDeploymentIds() == null)
            return false;
        if (other.getDeploymentIds() != null
                && other.getDeploymentIds().equals(this.getDeploymentIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeploymentIds() == null) ? 0 : getDeploymentIds()
                        .hashCode());
        return hashCode;
    }

    @Override
    public BatchGetDeploymentsRequest clone() {
        return (BatchGetDeploymentsRequest) super.clone();
    }
}