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

/**
 * 
 */
public class DescribeImagesResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more images.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Image> images;

    /**
     * <p>
     * Information about one or more images.
     * </p>
     * 
     * @return Information about one or more images.
     */

    public java.util.List<Image> getImages() {
        if (images == null) {
            images = new com.amazonaws.internal.SdkInternalList<Image>();
        }
        return images;
    }

    /**
     * <p>
     * Information about one or more images.
     * </p>
     * 
     * @param images
     *        Information about one or more images.
     */

    public void setImages(java.util.Collection<Image> images) {
        if (images == null) {
            this.images = null;
            return;
        }

        this.images = new com.amazonaws.internal.SdkInternalList<Image>(images);
    }

    /**
     * <p>
     * Information about one or more images.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImages(java.util.Collection)} or
     * {@link #withImages(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param images
     *        Information about one or more images.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImagesResult withImages(Image... images) {
        if (this.images == null) {
            setImages(new com.amazonaws.internal.SdkInternalList<Image>(
                    images.length));
        }
        for (Image ele : images) {
            this.images.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more images.
     * </p>
     * 
     * @param images
     *        Information about one or more images.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeImagesResult withImages(java.util.Collection<Image> images) {
        setImages(images);
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
        if (getImages() != null)
            sb.append("Images: " + getImages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeImagesResult == false)
            return false;
        DescribeImagesResult other = (DescribeImagesResult) obj;
        if (other.getImages() == null ^ this.getImages() == null)
            return false;
        if (other.getImages() != null
                && other.getImages().equals(this.getImages()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getImages() == null) ? 0 : getImages().hashCode());
        return hashCode;
    }

    @Override
    public DescribeImagesResult clone() {
        try {
            return (DescribeImagesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}