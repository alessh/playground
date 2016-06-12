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

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A complex type that contains information about the hosted zone that you want
 * to delete.
 * </p>
 */
public class DeleteHostedZoneRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     */
    private String id;

    /**
     * Default constructor for DeleteHostedZoneRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public DeleteHostedZoneRequest() {
    }

    /**
     * Constructs a new DeleteHostedZoneRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param id
     *        The ID of the hosted zone you want to delete.
     */
    public DeleteHostedZoneRequest(String id) {
        setId(id);
    }

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * 
     * @param id
     *        The ID of the hosted zone you want to delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * 
     * @return The ID of the hosted zone you want to delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the hosted zone you want to delete.
     * </p>
     * 
     * @param id
     *        The ID of the hosted zone you want to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteHostedZoneRequest withId(String id) {
        setId(id);
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
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHostedZoneRequest == false)
            return false;
        DeleteHostedZoneRequest other = (DeleteHostedZoneRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHostedZoneRequest clone() {
        return (DeleteHostedZoneRequest) super.clone();
    }
}