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

package com.amazonaws.services.dynamodbv2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of a <i>GetRecords</i> operation.
 * </p>
 */
public class GetRecordsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A shard iterator that was retrieved from a previous GetShardIterator
     * operation. This iterator can be used to access the stream records in this
     * shard.
     * </p>
     */
    private String shardIterator;
    /**
     * <p>
     * The maximum number of records to return from the shard. The upper limit
     * is 1000.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * A shard iterator that was retrieved from a previous GetShardIterator
     * operation. This iterator can be used to access the stream records in this
     * shard.
     * </p>
     * 
     * @param shardIterator
     *        A shard iterator that was retrieved from a previous
     *        GetShardIterator operation. This iterator can be used to access
     *        the stream records in this shard.
     */

    public void setShardIterator(String shardIterator) {
        this.shardIterator = shardIterator;
    }

    /**
     * <p>
     * A shard iterator that was retrieved from a previous GetShardIterator
     * operation. This iterator can be used to access the stream records in this
     * shard.
     * </p>
     * 
     * @return A shard iterator that was retrieved from a previous
     *         GetShardIterator operation. This iterator can be used to access
     *         the stream records in this shard.
     */

    public String getShardIterator() {
        return this.shardIterator;
    }

    /**
     * <p>
     * A shard iterator that was retrieved from a previous GetShardIterator
     * operation. This iterator can be used to access the stream records in this
     * shard.
     * </p>
     * 
     * @param shardIterator
     *        A shard iterator that was retrieved from a previous
     *        GetShardIterator operation. This iterator can be used to access
     *        the stream records in this shard.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRecordsRequest withShardIterator(String shardIterator) {
        setShardIterator(shardIterator);
        return this;
    }

    /**
     * <p>
     * The maximum number of records to return from the shard. The upper limit
     * is 1000.
     * </p>
     * 
     * @param limit
     *        The maximum number of records to return from the shard. The upper
     *        limit is 1000.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * The maximum number of records to return from the shard. The upper limit
     * is 1000.
     * </p>
     * 
     * @return The maximum number of records to return from the shard. The upper
     *         limit is 1000.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * The maximum number of records to return from the shard. The upper limit
     * is 1000.
     * </p>
     * 
     * @param limit
     *        The maximum number of records to return from the shard. The upper
     *        limit is 1000.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRecordsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getShardIterator() != null)
            sb.append("ShardIterator: " + getShardIterator() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordsRequest == false)
            return false;
        GetRecordsRequest other = (GetRecordsRequest) obj;
        if (other.getShardIterator() == null ^ this.getShardIterator() == null)
            return false;
        if (other.getShardIterator() != null
                && other.getShardIterator().equals(this.getShardIterator()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getShardIterator() == null) ? 0 : getShardIterator()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordsRequest clone() {
        return (GetRecordsRequest) super.clone();
    }
}