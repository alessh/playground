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

/**
 * <p>
 * Represents the output of a <i>GetRecords</i> operation.
 * </p>
 */
public class GetRecordsResult implements Serializable, Cloneable {

    /**
     * <p>
     * The stream records from the shard, which were retrieved using the shard
     * iterator.
     * </p>
     */
    private java.util.List<Record> records;
    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * stream records. If set to <code>null</code>, the shard has been closed
     * and the requested iterator will not return any more data.
     * </p>
     */
    private String nextShardIterator;

    /**
     * <p>
     * The stream records from the shard, which were retrieved using the shard
     * iterator.
     * </p>
     * 
     * @return The stream records from the shard, which were retrieved using the
     *         shard iterator.
     */

    public java.util.List<Record> getRecords() {
        return records;
    }

    /**
     * <p>
     * The stream records from the shard, which were retrieved using the shard
     * iterator.
     * </p>
     * 
     * @param records
     *        The stream records from the shard, which were retrieved using the
     *        shard iterator.
     */

    public void setRecords(java.util.Collection<Record> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new java.util.ArrayList<Record>(records);
    }

    /**
     * <p>
     * The stream records from the shard, which were retrieved using the shard
     * iterator.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecords(java.util.Collection)} or
     * {@link #withRecords(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param records
     *        The stream records from the shard, which were retrieved using the
     *        shard iterator.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRecordsResult withRecords(Record... records) {
        if (this.records == null) {
            setRecords(new java.util.ArrayList<Record>(records.length));
        }
        for (Record ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stream records from the shard, which were retrieved using the shard
     * iterator.
     * </p>
     * 
     * @param records
     *        The stream records from the shard, which were retrieved using the
     *        shard iterator.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRecordsResult withRecords(java.util.Collection<Record> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * stream records. If set to <code>null</code>, the shard has been closed
     * and the requested iterator will not return any more data.
     * </p>
     * 
     * @param nextShardIterator
     *        The next position in the shard from which to start sequentially
     *        reading stream records. If set to <code>null</code>, the shard has
     *        been closed and the requested iterator will not return any more
     *        data.
     */

    public void setNextShardIterator(String nextShardIterator) {
        this.nextShardIterator = nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * stream records. If set to <code>null</code>, the shard has been closed
     * and the requested iterator will not return any more data.
     * </p>
     * 
     * @return The next position in the shard from which to start sequentially
     *         reading stream records. If set to <code>null</code>, the shard
     *         has been closed and the requested iterator will not return any
     *         more data.
     */

    public String getNextShardIterator() {
        return this.nextShardIterator;
    }

    /**
     * <p>
     * The next position in the shard from which to start sequentially reading
     * stream records. If set to <code>null</code>, the shard has been closed
     * and the requested iterator will not return any more data.
     * </p>
     * 
     * @param nextShardIterator
     *        The next position in the shard from which to start sequentially
     *        reading stream records. If set to <code>null</code>, the shard has
     *        been closed and the requested iterator will not return any more
     *        data.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetRecordsResult withNextShardIterator(String nextShardIterator) {
        setNextShardIterator(nextShardIterator);
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
        if (getRecords() != null)
            sb.append("Records: " + getRecords() + ",");
        if (getNextShardIterator() != null)
            sb.append("NextShardIterator: " + getNextShardIterator());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetRecordsResult == false)
            return false;
        GetRecordsResult other = (GetRecordsResult) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null
                && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getNextShardIterator() == null
                ^ this.getNextShardIterator() == null)
            return false;
        if (other.getNextShardIterator() != null
                && other.getNextShardIterator().equals(
                        this.getNextShardIterator()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextShardIterator() == null) ? 0
                        : getNextShardIterator().hashCode());
        return hashCode;
    }

    @Override
    public GetRecordsResult clone() {
        try {
            return (GetRecordsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
