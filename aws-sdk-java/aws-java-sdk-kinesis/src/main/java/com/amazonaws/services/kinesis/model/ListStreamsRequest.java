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

package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <code>ListStreams</code>.
 * </p>
 */
public class ListStreamsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     */
    private String exclusiveStartStreamName;

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to list.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @return The maximum number of streams to list.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of streams to list.
     * </p>
     * 
     * @param limit
     *        The maximum number of streams to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListStreamsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartStreamName
     *        The name of the stream to start the list with.
     */

    public void setExclusiveStartStreamName(String exclusiveStartStreamName) {
        this.exclusiveStartStreamName = exclusiveStartStreamName;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @return The name of the stream to start the list with.
     */

    public String getExclusiveStartStreamName() {
        return this.exclusiveStartStreamName;
    }

    /**
     * <p>
     * The name of the stream to start the list with.
     * </p>
     * 
     * @param exclusiveStartStreamName
     *        The name of the stream to start the list with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListStreamsRequest withExclusiveStartStreamName(
            String exclusiveStartStreamName) {
        setExclusiveStartStreamName(exclusiveStartStreamName);
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
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartStreamName() != null)
            sb.append("ExclusiveStartStreamName: "
                    + getExclusiveStartStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamsRequest == false)
            return false;
        ListStreamsRequest other = (ListStreamsRequest) obj;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartStreamName() == null
                ^ this.getExclusiveStartStreamName() == null)
            return false;
        if (other.getExclusiveStartStreamName() != null
                && other.getExclusiveStartStreamName().equals(
                        this.getExclusiveStartStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime
                * hashCode
                + ((getExclusiveStartStreamName() == null) ? 0
                        : getExclusiveStartStreamName().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamsRequest clone() {
        return (ListStreamsRequest) super.clone();
    }
}