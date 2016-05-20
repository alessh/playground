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

package com.amazonaws.services.sqs.model;

import java.io.Serializable;

/**
 * <p>
 * For more information, see <a href=
 * "http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/UnderstandingResponses.html"
 * >Responses</a> in the <i>Amazon SQS Developer Guide</i>.
 * </p>
 */
public class GetQueueUrlResult implements Serializable, Cloneable {

    /**
     * <p>
     * The URL for the queue.
     * </p>
     */
    private String queueUrl;

    /**
     * <p>
     * The URL for the queue.
     * </p>
     * 
     * @param queueUrl
     *        The URL for the queue.
     */

    public void setQueueUrl(String queueUrl) {
        this.queueUrl = queueUrl;
    }

    /**
     * <p>
     * The URL for the queue.
     * </p>
     * 
     * @return The URL for the queue.
     */

    public String getQueueUrl() {
        return this.queueUrl;
    }

    /**
     * <p>
     * The URL for the queue.
     * </p>
     * 
     * @param queueUrl
     *        The URL for the queue.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetQueueUrlResult withQueueUrl(String queueUrl) {
        setQueueUrl(queueUrl);
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
        if (getQueueUrl() != null)
            sb.append("QueueUrl: " + getQueueUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetQueueUrlResult == false)
            return false;
        GetQueueUrlResult other = (GetQueueUrlResult) obj;
        if (other.getQueueUrl() == null ^ this.getQueueUrl() == null)
            return false;
        if (other.getQueueUrl() != null
                && other.getQueueUrl().equals(this.getQueueUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getQueueUrl() == null) ? 0 : getQueueUrl().hashCode());
        return hashCode;
    }

    @Override
    public GetQueueUrlResult clone() {
        try {
            return (GetQueueUrlResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
