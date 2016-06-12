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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class SubscribeToEventRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment template used during the event for which you
     * want to recieve SNS notifications.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The ARN of the SNS topic to which the SNS notifications are sent.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The ARN of the assessment template used during the event for which you
     * want to recieve SNS notifications.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template used during the event for which
     *        you want to recieve SNS notifications.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template used during the event for which you
     * want to recieve SNS notifications.
     * </p>
     * 
     * @return The ARN of the assessment template used during the event for
     *         which you want to recieve SNS notifications.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template used during the event for which you
     * want to recieve SNS notifications.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template used during the event for which
     *        you want to recieve SNS notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SubscribeToEventRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to receive SNS notifications.
     * @see InspectorEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     * 
     * @return The event for which you want to receive SNS notifications.
     * @see InspectorEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to receive SNS notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InspectorEvent
     */

    public SubscribeToEventRequest withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to receive SNS notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InspectorEvent
     */

    public void setEvent(InspectorEvent event) {
        this.event = event.toString();
    }

    /**
     * <p>
     * The event for which you want to receive SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to receive SNS notifications.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see InspectorEvent
     */

    public SubscribeToEventRequest withEvent(InspectorEvent event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which the SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the SNS topic to which the SNS notifications are sent.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which the SNS notifications are sent.
     * </p>
     * 
     * @return The ARN of the SNS topic to which the SNS notifications are sent.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which the SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the SNS topic to which the SNS notifications are sent.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public SubscribeToEventRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getEvent() != null)
            sb.append("Event: " + getEvent() + ",");
        if (getTopicArn() != null)
            sb.append("TopicArn: " + getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubscribeToEventRequest == false)
            return false;
        SubscribeToEventRequest other = (SubscribeToEventRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null
                && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null
                && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode
                + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public SubscribeToEventRequest clone() {
        return (SubscribeToEventRequest) super.clone();
    }
}