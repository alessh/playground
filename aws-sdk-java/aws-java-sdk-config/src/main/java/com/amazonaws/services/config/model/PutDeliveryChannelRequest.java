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

package com.amazonaws.services.config.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>PutDeliveryChannel</a> action.
 * </p>
 */
public class PutDeliveryChannelRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The configuration delivery channel object that delivers the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     */
    private DeliveryChannel deliveryChannel;

    /**
     * <p>
     * The configuration delivery channel object that delivers the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * 
     * @param deliveryChannel
     *        The configuration delivery channel object that delivers the
     *        configuration information to an Amazon S3 bucket, and to an Amazon
     *        SNS topic.
     */

    public void setDeliveryChannel(DeliveryChannel deliveryChannel) {
        this.deliveryChannel = deliveryChannel;
    }

    /**
     * <p>
     * The configuration delivery channel object that delivers the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * 
     * @return The configuration delivery channel object that delivers the
     *         configuration information to an Amazon S3 bucket, and to an
     *         Amazon SNS topic.
     */

    public DeliveryChannel getDeliveryChannel() {
        return this.deliveryChannel;
    }

    /**
     * <p>
     * The configuration delivery channel object that delivers the configuration
     * information to an Amazon S3 bucket, and to an Amazon SNS topic.
     * </p>
     * 
     * @param deliveryChannel
     *        The configuration delivery channel object that delivers the
     *        configuration information to an Amazon S3 bucket, and to an Amazon
     *        SNS topic.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutDeliveryChannelRequest withDeliveryChannel(
            DeliveryChannel deliveryChannel) {
        setDeliveryChannel(deliveryChannel);
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
        if (getDeliveryChannel() != null)
            sb.append("DeliveryChannel: " + getDeliveryChannel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDeliveryChannelRequest == false)
            return false;
        PutDeliveryChannelRequest other = (PutDeliveryChannelRequest) obj;
        if (other.getDeliveryChannel() == null
                ^ this.getDeliveryChannel() == null)
            return false;
        if (other.getDeliveryChannel() != null
                && other.getDeliveryChannel().equals(this.getDeliveryChannel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDeliveryChannel() == null) ? 0 : getDeliveryChannel()
                        .hashCode());
        return hashCode;
    }

    @Override
    public PutDeliveryChannelRequest clone() {
        return (PutDeliveryChannelRequest) super.clone();
    }
}