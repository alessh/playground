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
 * Represents the input for <code>DescribeStream</code>.
 * </p>
 */
public class DescribeStreamRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The maximum number of shards to return.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     */
    private String exclusiveStartShardId;

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to describe.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @return The name of the stream to describe.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream to describe.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The maximum number of shards to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of shards to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of shards to return.
     * </p>
     * 
     * @return The maximum number of shards to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of shards to return.
     * </p>
     * 
     * @param limit
     *        The maximum number of shards to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeStreamRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the shard to start with.
     */

    public void setExclusiveStartShardId(String exclusiveStartShardId) {
        this.exclusiveStartShardId = exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @return The shard ID of the shard to start with.
     */

    public String getExclusiveStartShardId() {
        return this.exclusiveStartShardId;
    }

    /**
     * <p>
     * The shard ID of the shard to start with.
     * </p>
     * 
     * @param exclusiveStartShardId
     *        The shard ID of the shard to start with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeStreamRequest withExclusiveStartShardId(
            String exclusiveStartShardId) {
        setExclusiveStartShardId(exclusiveStartShardId);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getExclusiveStartShardId() != null)
            sb.append("ExclusiveStartShardId: " + getExclusiveStartShardId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamRequest == false)
            return false;
        DescribeStreamRequest other = (DescribeStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getExclusiveStartShardId() == null
                ^ this.getExclusiveStartShardId() == null)
            return false;
        if (other.getExclusiveStartShardId() != null
                && other.getExclusiveStartShardId().equals(
                        this.getExclusiveStartShardId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime
                * hashCode
                + ((getExclusiveStartShardId() == null) ? 0
                        : getExclusiveStartShardId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamRequest clone() {
        return (DescribeStreamRequest) super.clone();
    }
}