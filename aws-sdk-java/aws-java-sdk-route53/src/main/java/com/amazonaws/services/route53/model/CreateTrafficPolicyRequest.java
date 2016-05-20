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
 * A complex type that contains information about the traffic policy that you
 * want to create.
 * </p>
 */
public class CreateTrafficPolicyRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The definition of this traffic policy in JSON format.
     * </p>
     */
    private String document;
    /**
     * <p>
     * Any comments that you want to include about the traffic policy.
     * </p>
     */
    private String comment;

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @param name
     *        The name of the traffic policy.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @return The name of the traffic policy.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the traffic policy.
     * </p>
     * 
     * @param name
     *        The name of the traffic policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateTrafficPolicyRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format.
     * </p>
     * 
     * @param document
     *        The definition of this traffic policy in JSON format.
     */

    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format.
     * </p>
     * 
     * @return The definition of this traffic policy in JSON format.
     */

    public String getDocument() {
        return this.document;
    }

    /**
     * <p>
     * The definition of this traffic policy in JSON format.
     * </p>
     * 
     * @param document
     *        The definition of this traffic policy in JSON format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateTrafficPolicyRequest withDocument(String document) {
        setDocument(document);
        return this;
    }

    /**
     * <p>
     * Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @param comment
     *        Any comments that you want to include about the traffic policy.
     */

    public void setComment(String comment) {
        this.comment = comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @return Any comments that you want to include about the traffic policy.
     */

    public String getComment() {
        return this.comment;
    }

    /**
     * <p>
     * Any comments that you want to include about the traffic policy.
     * </p>
     * 
     * @param comment
     *        Any comments that you want to include about the traffic policy.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateTrafficPolicyRequest withComment(String comment) {
        setComment(comment);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getDocument() != null)
            sb.append("Document: " + getDocument() + ",");
        if (getComment() != null)
            sb.append("Comment: " + getComment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrafficPolicyRequest == false)
            return false;
        CreateTrafficPolicyRequest other = (CreateTrafficPolicyRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDocument() == null ^ this.getDocument() == null)
            return false;
        if (other.getDocument() != null
                && other.getDocument().equals(this.getDocument()) == false)
            return false;
        if (other.getComment() == null ^ this.getComment() == null)
            return false;
        if (other.getComment() != null
                && other.getComment().equals(this.getComment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getDocument() == null) ? 0 : getDocument().hashCode());
        hashCode = prime * hashCode
                + ((getComment() == null) ? 0 : getComment().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrafficPolicyRequest clone() {
        return (CreateTrafficPolicyRequest) super.clone();
    }
}