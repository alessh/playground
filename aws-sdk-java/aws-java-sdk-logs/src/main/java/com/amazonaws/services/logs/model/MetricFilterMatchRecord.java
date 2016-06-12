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

package com.amazonaws.services.logs.model;

import java.io.Serializable;

/**
 * 
 */
public class MetricFilterMatchRecord implements Serializable, Cloneable {

    private Long eventNumber;

    private String eventMessage;

    private com.amazonaws.internal.SdkInternalMap<String, String> extractedValues;

    /**
     * @param eventNumber
     */

    public void setEventNumber(Long eventNumber) {
        this.eventNumber = eventNumber;
    }

    /**
     * @return
     */

    public Long getEventNumber() {
        return this.eventNumber;
    }

    /**
     * @param eventNumber
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricFilterMatchRecord withEventNumber(Long eventNumber) {
        setEventNumber(eventNumber);
        return this;
    }

    /**
     * @param eventMessage
     */

    public void setEventMessage(String eventMessage) {
        this.eventMessage = eventMessage;
    }

    /**
     * @return
     */

    public String getEventMessage() {
        return this.eventMessage;
    }

    /**
     * @param eventMessage
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricFilterMatchRecord withEventMessage(String eventMessage) {
        setEventMessage(eventMessage);
        return this;
    }

    /**
     * @return
     */

    public java.util.Map<String, String> getExtractedValues() {
        if (extractedValues == null) {
            extractedValues = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        return extractedValues;
    }

    /**
     * @param extractedValues
     */

    public void setExtractedValues(java.util.Map<String, String> extractedValues) {
        this.extractedValues = extractedValues == null ? null
                : new com.amazonaws.internal.SdkInternalMap<String, String>(
                        extractedValues);
    }

    /**
     * @param extractedValues
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public MetricFilterMatchRecord withExtractedValues(
            java.util.Map<String, String> extractedValues) {
        setExtractedValues(extractedValues);
        return this;
    }

    public MetricFilterMatchRecord addExtractedValuesEntry(String key,
            String value) {
        if (null == this.extractedValues) {
            this.extractedValues = new com.amazonaws.internal.SdkInternalMap<String, String>();
        }
        if (this.extractedValues.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        this.extractedValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExtractedValues. &lt;p> Returns a
     * reference to this object so that method calls can be chained together.
     */

    public MetricFilterMatchRecord clearExtractedValuesEntries() {
        this.extractedValues = null;
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
        if (getEventNumber() != null)
            sb.append("EventNumber: " + getEventNumber() + ",");
        if (getEventMessage() != null)
            sb.append("EventMessage: " + getEventMessage() + ",");
        if (getExtractedValues() != null)
            sb.append("ExtractedValues: " + getExtractedValues());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MetricFilterMatchRecord == false)
            return false;
        MetricFilterMatchRecord other = (MetricFilterMatchRecord) obj;
        if (other.getEventNumber() == null ^ this.getEventNumber() == null)
            return false;
        if (other.getEventNumber() != null
                && other.getEventNumber().equals(this.getEventNumber()) == false)
            return false;
        if (other.getEventMessage() == null ^ this.getEventMessage() == null)
            return false;
        if (other.getEventMessage() != null
                && other.getEventMessage().equals(this.getEventMessage()) == false)
            return false;
        if (other.getExtractedValues() == null
                ^ this.getExtractedValues() == null)
            return false;
        if (other.getExtractedValues() != null
                && other.getExtractedValues().equals(this.getExtractedValues()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEventNumber() == null) ? 0 : getEventNumber().hashCode());
        hashCode = prime
                * hashCode
                + ((getEventMessage() == null) ? 0 : getEventMessage()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getExtractedValues() == null) ? 0 : getExtractedValues()
                        .hashCode());
        return hashCode;
    }

    @Override
    public MetricFilterMatchRecord clone() {
        try {
            return (MetricFilterMatchRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
