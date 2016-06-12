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
 * A <code>PutRecords</code> request.
 * </p>
 */
public class PutRecordsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The records associated with the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PutRecordsRequestEntry> records;
    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     */
    private String streamName;

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * 
     * @return The records associated with the request.
     */

    public java.util.List<PutRecordsRequestEntry> getRecords() {
        if (records == null) {
            records = new com.amazonaws.internal.SdkInternalList<PutRecordsRequestEntry>();
        }
        return records;
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * 
     * @param records
     *        The records associated with the request.
     */

    public void setRecords(java.util.Collection<PutRecordsRequestEntry> records) {
        if (records == null) {
            this.records = null;
            return;
        }

        this.records = new com.amazonaws.internal.SdkInternalList<PutRecordsRequestEntry>(
                records);
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setRecords(java.util.Collection)} or
     * {@link #withRecords(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param records
     *        The records associated with the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutRecordsRequest withRecords(PutRecordsRequestEntry... records) {
        if (this.records == null) {
            setRecords(new com.amazonaws.internal.SdkInternalList<PutRecordsRequestEntry>(
                    records.length));
        }
        for (PutRecordsRequestEntry ele : records) {
            this.records.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The records associated with the request.
     * </p>
     * 
     * @param records
     *        The records associated with the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutRecordsRequest withRecords(
            java.util.Collection<PutRecordsRequestEntry> records) {
        setRecords(records);
        return this;
    }

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * 
     * @param streamName
     *        The stream name associated with the request.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * 
     * @return The stream name associated with the request.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The stream name associated with the request.
     * </p>
     * 
     * @param streamName
     *        The stream name associated with the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutRecordsRequest withStreamName(String streamName) {
        setStreamName(streamName);
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
        if (getStreamName() != null)
            sb.append("StreamName: " + getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRecordsRequest == false)
            return false;
        PutRecordsRequest other = (PutRecordsRequest) obj;
        if (other.getRecords() == null ^ this.getRecords() == null)
            return false;
        if (other.getRecords() != null
                && other.getRecords().equals(this.getRecords()) == false)
            return false;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null
                && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRecords() == null) ? 0 : getRecords().hashCode());
        hashCode = prime * hashCode
                + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public PutRecordsRequest clone() {
        return (PutRecordsRequest) super.clone();
    }
}