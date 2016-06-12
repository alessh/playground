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
 * Requests Amazon API Gateway to delete a <a>Stage</a> resource.
 * </p>
 */
public class DeleteStageRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to delete.
     * </p>
     */
    private String restApiId;
    /**
     * <p>
     * The name of the <a>Stage</a> resource to delete.
     * </p>
     */
    private String stageName;

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to delete.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     *        resource to delete.
     */

    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to delete.
     * </p>
     * 
     * @return The identifier of the <a>RestApi</a> resource for the
     *         <a>Stage</a> resource to delete.
     */

    public String getRestApiId() {
        return this.restApiId;
    }

    /**
     * <p>
     * The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     * resource to delete.
     * </p>
     * 
     * @param restApiId
     *        The identifier of the <a>RestApi</a> resource for the <a>Stage</a>
     *        resource to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteStageRequest withRestApiId(String restApiId) {
        setRestApiId(restApiId);
        return this;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to delete.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource to delete.
     */

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to delete.
     * </p>
     * 
     * @return The name of the <a>Stage</a> resource to delete.
     */

    public String getStageName() {
        return this.stageName;
    }

    /**
     * <p>
     * The name of the <a>Stage</a> resource to delete.
     * </p>
     * 
     * @param stageName
     *        The name of the <a>Stage</a> resource to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteStageRequest withStageName(String stageName) {
        setStageName(stageName);
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
        if (getRestApiId() != null)
            sb.append("RestApiId: " + getRestApiId() + ",");
        if (getStageName() != null)
            sb.append("StageName: " + getStageName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteStageRequest == false)
            return false;
        DeleteStageRequest other = (DeleteStageRequest) obj;
        if (other.getRestApiId() == null ^ this.getRestApiId() == null)
            return false;
        if (other.getRestApiId() != null
                && other.getRestApiId().equals(this.getRestApiId()) == false)
            return false;
        if (other.getStageName() == null ^ this.getStageName() == null)
            return false;
        if (other.getStageName() != null
                && other.getStageName().equals(this.getStageName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRestApiId() == null) ? 0 : getRestApiId().hashCode());
        hashCode = prime * hashCode
                + ((getStageName() == null) ? 0 : getStageName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteStageRequest clone() {
        return (DeleteStageRequest) super.clone();
    }
}