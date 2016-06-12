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

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for <a>DeleteDeliveryStream</a>.
 * </p>
 */
public class DeleteDeliveryStreamRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     */
    private String deliveryStreamName;

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     */

    public void setDeliveryStreamName(String deliveryStreamName) {
        this.deliveryStreamName = deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @return The name of the delivery stream.
     */

    public String getDeliveryStreamName() {
        return this.deliveryStreamName;
    }

    /**
     * <p>
     * The name of the delivery stream.
     * </p>
     * 
     * @param deliveryStreamName
     *        The name of the delivery stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteDeliveryStreamRequest withDeliveryStreamName(
            String deliveryStreamName) {
        setDeliveryStreamName(deliveryStreamName);
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
        if (getDeliveryStreamName() != null)
            sb.append("DeliveryStreamName: " + getDeliveryStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDeliveryStreamRequest == false)
            return false;
        DeleteDeliveryStreamRequest other = (DeleteDeliveryStreamRequest) obj;
        if (other.getDeliveryStreamName() == null
                ^ this.getDeliveryStreamName() == null)
            return false;
        if (other.getDeliveryStreamName() != null
                && other.getDeliveryStreamName().equals(
                        this.getDeliveryStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeliveryStreamName() == null) ? 0
                        : getDeliveryStreamName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDeliveryStreamRequest clone() {
        return (DeleteDeliveryStreamRequest) super.clone();
    }
}