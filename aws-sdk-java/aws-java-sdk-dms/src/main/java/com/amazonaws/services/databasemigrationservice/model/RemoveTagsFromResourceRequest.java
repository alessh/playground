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

package com.amazonaws.services.databasemigrationservice.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>>
     * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be
     * removed from.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     */
    private java.util.List<String> tagKeys;

    /**
     * <p>>
     * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be
     * removed from.
     * </p>
     * 
     * @param resourceArn
     *        >The Amazon Resource Name (ARN) of the AWS DMS resource the tag is
     *        to be removed from.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>>
     * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be
     * removed from.
     * </p>
     * 
     * @return >The Amazon Resource Name (ARN) of the AWS DMS resource the tag
     *         is to be removed from.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>>
     * The Amazon Resource Name (ARN) of the AWS DMS resource the tag is to be
     * removed from.
     * </p>
     * 
     * @param resourceArn
     *        >The Amazon Resource Name (ARN) of the AWS DMS resource the tag is
     *        to be removed from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @return The tag key (name) of the tag to be removed.
     */

    public java.util.List<String> getTagKeys() {
        return tagKeys;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
     */

    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }

        this.tagKeys = new java.util.ArrayList<String>(tagKeys);
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or
     * {@link #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (this.tagKeys == null) {
            setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        }
        for (String ele : tagKeys) {
            this.tagKeys.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag key (name) of the tag to be removed.
     * </p>
     * 
     * @param tagKeys
     *        The tag key (name) of the tag to be removed.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RemoveTagsFromResourceRequest withTagKeys(
            java.util.Collection<String> tagKeys) {
        setTagKeys(tagKeys);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getTagKeys() != null)
            sb.append("TagKeys: " + getTagKeys());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false)
            return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTagKeys() == null ^ this.getTagKeys() == null)
            return false;
        if (other.getTagKeys() != null
                && other.getTagKeys().equals(this.getTagKeys()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsFromResourceRequest clone() {
        return (RemoveTagsFromResourceRequest) super.clone();
    }
}