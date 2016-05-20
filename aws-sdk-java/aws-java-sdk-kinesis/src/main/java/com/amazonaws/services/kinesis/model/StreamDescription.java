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

/**
 * <p>
 * Represents the output for <a>DescribeStream</a>.
 * </p>
 */
public class StreamDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     */
    private String streamStatus;
    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Shard> shards;
    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     */
    private Boolean hasMoreShards;
    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @param streamName
     *        The name of the stream being described.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @return The name of the stream being described.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream being described.
     * </p>
     * 
     * @param streamName
     *        The name of the stream being described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) for the stream being described.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the stream being described.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the stream being described.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) for the stream being described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described.</p>
     *        <p>
     *        The stream status is one of the following states:
     *        </p>
     *        <ul>
     *        <li><code>CREATING</code> - The stream is being created. Amazon
     *        Kinesis immediately returns and sets <code>StreamStatus</code> to
     *        <code>CREATING</code>.</li>
     *        <li><code>DELETING</code> - The stream is being deleted. The
     *        specified stream is in the <code>DELETING</code> state until
     *        Amazon Kinesis completes the deletion.</li>
     *        <li><code>ACTIVE</code> - The stream exists and is ready for read
     *        and write operations or deletion. You should perform read and
     *        write operations only on an <code>ACTIVE</code> stream.</li>
     *        <li><code>UPDATING</code> - Shards in the stream are being merged
     *        or split. Read and write operations continue to work while the
     *        stream is in the <code>UPDATING</code> state.</li>
     * @see StreamStatus
     */

    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * 
     * @return The current status of the stream being described.</p>
     *         <p>
     *         The stream status is one of the following states:
     *         </p>
     *         <ul>
     *         <li><code>CREATING</code> - The stream is being created. Amazon
     *         Kinesis immediately returns and sets <code>StreamStatus</code> to
     *         <code>CREATING</code>.</li>
     *         <li><code>DELETING</code> - The stream is being deleted. The
     *         specified stream is in the <code>DELETING</code> state until
     *         Amazon Kinesis completes the deletion.</li>
     *         <li><code>ACTIVE</code> - The stream exists and is ready for read
     *         and write operations or deletion. You should perform read and
     *         write operations only on an <code>ACTIVE</code> stream.</li>
     *         <li><code>UPDATING</code> - Shards in the stream are being merged
     *         or split. Read and write operations continue to work while the
     *         stream is in the <code>UPDATING</code> state.</li>
     * @see StreamStatus
     */

    public String getStreamStatus() {
        return this.streamStatus;
    }

    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described.</p>
     *        <p>
     *        The stream status is one of the following states:
     *        </p>
     *        <ul>
     *        <li><code>CREATING</code> - The stream is being created. Amazon
     *        Kinesis immediately returns and sets <code>StreamStatus</code> to
     *        <code>CREATING</code>.</li>
     *        <li><code>DELETING</code> - The stream is being deleted. The
     *        specified stream is in the <code>DELETING</code> state until
     *        Amazon Kinesis completes the deletion.</li>
     *        <li><code>ACTIVE</code> - The stream exists and is ready for read
     *        and write operations or deletion. You should perform read and
     *        write operations only on an <code>ACTIVE</code> stream.</li>
     *        <li><code>UPDATING</code> - Shards in the stream are being merged
     *        or split. Read and write operations continue to work while the
     *        stream is in the <code>UPDATING</code> state.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */

    public StreamDescription withStreamStatus(String streamStatus) {
        setStreamStatus(streamStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described.</p>
     *        <p>
     *        The stream status is one of the following states:
     *        </p>
     *        <ul>
     *        <li><code>CREATING</code> - The stream is being created. Amazon
     *        Kinesis immediately returns and sets <code>StreamStatus</code> to
     *        <code>CREATING</code>.</li>
     *        <li><code>DELETING</code> - The stream is being deleted. The
     *        specified stream is in the <code>DELETING</code> state until
     *        Amazon Kinesis completes the deletion.</li>
     *        <li><code>ACTIVE</code> - The stream exists and is ready for read
     *        and write operations or deletion. You should perform read and
     *        write operations only on an <code>ACTIVE</code> stream.</li>
     *        <li><code>UPDATING</code> - Shards in the stream are being merged
     *        or split. Read and write operations continue to work while the
     *        stream is in the <code>UPDATING</code> state.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */

    public void setStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
    }

    /**
     * <p>
     * The current status of the stream being described.
     * </p>
     * <p>
     * The stream status is one of the following states:
     * </p>
     * <ul>
     * <li><code>CREATING</code> - The stream is being created. Amazon Kinesis
     * immediately returns and sets <code>StreamStatus</code> to
     * <code>CREATING</code>.</li>
     * <li><code>DELETING</code> - The stream is being deleted. The specified
     * stream is in the <code>DELETING</code> state until Amazon Kinesis
     * completes the deletion.</li>
     * <li><code>ACTIVE</code> - The stream exists and is ready for read and
     * write operations or deletion. You should perform read and write
     * operations only on an <code>ACTIVE</code> stream.</li>
     * <li><code>UPDATING</code> - Shards in the stream are being merged or
     * split. Read and write operations continue to work while the stream is in
     * the <code>UPDATING</code> state.</li>
     * </ul>
     * 
     * @param streamStatus
     *        The current status of the stream being described.</p>
     *        <p>
     *        The stream status is one of the following states:
     *        </p>
     *        <ul>
     *        <li><code>CREATING</code> - The stream is being created. Amazon
     *        Kinesis immediately returns and sets <code>StreamStatus</code> to
     *        <code>CREATING</code>.</li>
     *        <li><code>DELETING</code> - The stream is being deleted. The
     *        specified stream is in the <code>DELETING</code> state until
     *        Amazon Kinesis completes the deletion.</li>
     *        <li><code>ACTIVE</code> - The stream exists and is ready for read
     *        and write operations or deletion. You should perform read and
     *        write operations only on an <code>ACTIVE</code> stream.</li>
     *        <li><code>UPDATING</code> - Shards in the stream are being merged
     *        or split. Read and write operations continue to work while the
     *        stream is in the <code>UPDATING</code> state.</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see StreamStatus
     */

    public StreamDescription withStreamStatus(StreamStatus streamStatus) {
        setStreamStatus(streamStatus);
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @return The shards that comprise the stream.
     */

    public java.util.List<Shard> getShards() {
        if (shards == null) {
            shards = new com.amazonaws.internal.SdkInternalList<Shard>();
        }
        return shards;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     */

    public void setShards(java.util.Collection<Shard> shards) {
        if (shards == null) {
            this.shards = null;
            return;
        }

        this.shards = new com.amazonaws.internal.SdkInternalList<Shard>(shards);
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setShards(java.util.Collection)} or
     * {@link #withShards(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withShards(Shard... shards) {
        if (this.shards == null) {
            setShards(new com.amazonaws.internal.SdkInternalList<Shard>(
                    shards.length));
        }
        for (Shard ele : shards) {
            this.shards.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The shards that comprise the stream.
     * </p>
     * 
     * @param shards
     *        The shards that comprise the stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withShards(java.util.Collection<Shard> shards) {
        setShards(shards);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     * 
     * @param hasMoreShards
     *        If set to <code>true</code>, more shards in the stream are
     *        available to describe.
     */

    public void setHasMoreShards(Boolean hasMoreShards) {
        this.hasMoreShards = hasMoreShards;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     * 
     * @return If set to <code>true</code>, more shards in the stream are
     *         available to describe.
     */

    public Boolean getHasMoreShards() {
        return this.hasMoreShards;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     * 
     * @param hasMoreShards
     *        If set to <code>true</code>, more shards in the stream are
     *        available to describe.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withHasMoreShards(Boolean hasMoreShards) {
        setHasMoreShards(hasMoreShards);
        return this;
    }

    /**
     * <p>
     * If set to <code>true</code>, more shards in the stream are available to
     * describe.
     * </p>
     * 
     * @return If set to <code>true</code>, more shards in the stream are
     *         available to describe.
     */

    public Boolean isHasMoreShards() {
        return this.hasMoreShards;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The current retention period, in hours.
     */

    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @return The current retention period, in hours.
     */

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    /**
     * <p>
     * The current retention period, in hours.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The current retention period, in hours.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StreamDescription withRetentionPeriodHours(
            Integer retentionPeriodHours) {
        setRetentionPeriodHours(retentionPeriodHours);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: " + getStreamARN() + ",");
        if (getStreamStatus() != null)
            sb.append("StreamStatus: " + getStreamStatus() + ",");
        if (getShards() != null)
            sb.append("Shards: " + getShards() + ",");
        if (getHasMoreShards() != null)
            sb.append("HasMoreShards: " + getHasMoreShards() + ",");
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: " + getRetentionPeriodHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamDescription == false)
            return false;
        StreamDescription other = (StreamDescription) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null
                && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null)
            return false;
        if (other.getStreamStatus() != null
                && other.getStreamStatus().equals(this.getStreamStatus()) == false)
            return false;
        if (other.getShards() == null ^ this.getShards() == null)
            return false;
        if (other.getShards() != null
                && other.getShards().equals(this.getShards()) == false)
            return false;
        if (other.getHasMoreShards() == null ^ this.getHasMoreShards() == null)
            return false;
        if (other.getHasMoreShards() != null
                && other.getHasMoreShards().equals(this.getHasMoreShards()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null
                ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null
                && other.getRetentionPeriodHours().equals(
                        this.getRetentionPeriodHours()) == false)
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
                + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getStreamStatus() == null) ? 0 : getStreamStatus()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getShards() == null) ? 0 : getShards().hashCode());
        hashCode = prime
                * hashCode
                + ((getHasMoreShards() == null) ? 0 : getHasMoreShards()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRetentionPeriodHours() == null) ? 0
                        : getRetentionPeriodHours().hashCode());
        return hashCode;
    }

    @Override
    public StreamDescription clone() {
        try {
            return (StreamDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
