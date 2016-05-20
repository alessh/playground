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

package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about an event that was returned by a lookup request.
 * The result includes a representation of a CloudTrail event.
 * </p>
 */
public class Event implements Serializable, Cloneable {

    /**
     * <p>
     * The CloudTrail ID of the event returned.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The name of the event returned.
     * </p>
     */
    private String eventName;
    /**
     * <p>
     * The date and time of the event returned.
     * </p>
     */
    private java.util.Date eventTime;
    /**
     * <p>
     * A user name or role name of the requester that called the API in the
     * event returned.
     * </p>
     */
    private String username;
    /**
     * <p>
     * A list of resources referenced by the event returned.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Resource> resources;
    /**
     * <p>
     * A JSON string that contains a representation of the event returned.
     * </p>
     */
    private String cloudTrailEvent;

    /**
     * <p>
     * The CloudTrail ID of the event returned.
     * </p>
     * 
     * @param eventId
     *        The CloudTrail ID of the event returned.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The CloudTrail ID of the event returned.
     * </p>
     * 
     * @return The CloudTrail ID of the event returned.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The CloudTrail ID of the event returned.
     * </p>
     * 
     * @param eventId
     *        The CloudTrail ID of the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The name of the event returned.
     * </p>
     * 
     * @param eventName
     *        The name of the event returned.
     */

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    /**
     * <p>
     * The name of the event returned.
     * </p>
     * 
     * @return The name of the event returned.
     */

    public String getEventName() {
        return this.eventName;
    }

    /**
     * <p>
     * The name of the event returned.
     * </p>
     * 
     * @param eventName
     *        The name of the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withEventName(String eventName) {
        setEventName(eventName);
        return this;
    }

    /**
     * <p>
     * The date and time of the event returned.
     * </p>
     * 
     * @param eventTime
     *        The date and time of the event returned.
     */

    public void setEventTime(java.util.Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * <p>
     * The date and time of the event returned.
     * </p>
     * 
     * @return The date and time of the event returned.
     */

    public java.util.Date getEventTime() {
        return this.eventTime;
    }

    /**
     * <p>
     * The date and time of the event returned.
     * </p>
     * 
     * @param eventTime
     *        The date and time of the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withEventTime(java.util.Date eventTime) {
        setEventTime(eventTime);
        return this;
    }

    /**
     * <p>
     * A user name or role name of the requester that called the API in the
     * event returned.
     * </p>
     * 
     * @param username
     *        A user name or role name of the requester that called the API in
     *        the event returned.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * A user name or role name of the requester that called the API in the
     * event returned.
     * </p>
     * 
     * @return A user name or role name of the requester that called the API in
     *         the event returned.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * A user name or role name of the requester that called the API in the
     * event returned.
     * </p>
     * 
     * @param username
     *        A user name or role name of the requester that called the API in
     *        the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * A list of resources referenced by the event returned.
     * </p>
     * 
     * @return A list of resources referenced by the event returned.
     */

    public java.util.List<Resource> getResources() {
        if (resources == null) {
            resources = new com.amazonaws.internal.SdkInternalList<Resource>();
        }
        return resources;
    }

    /**
     * <p>
     * A list of resources referenced by the event returned.
     * </p>
     * 
     * @param resources
     *        A list of resources referenced by the event returned.
     */

    public void setResources(java.util.Collection<Resource> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new com.amazonaws.internal.SdkInternalList<Resource>(
                resources);
    }

    /**
     * <p>
     * A list of resources referenced by the event returned.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setResources(java.util.Collection)} or
     * {@link #withResources(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param resources
     *        A list of resources referenced by the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withResources(Resource... resources) {
        if (this.resources == null) {
            setResources(new com.amazonaws.internal.SdkInternalList<Resource>(
                    resources.length));
        }
        for (Resource ele : resources) {
            this.resources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of resources referenced by the event returned.
     * </p>
     * 
     * @param resources
     *        A list of resources referenced by the event returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withResources(java.util.Collection<Resource> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * A JSON string that contains a representation of the event returned.
     * </p>
     * 
     * @param cloudTrailEvent
     *        A JSON string that contains a representation of the event
     *        returned.
     */

    public void setCloudTrailEvent(String cloudTrailEvent) {
        this.cloudTrailEvent = cloudTrailEvent;
    }

    /**
     * <p>
     * A JSON string that contains a representation of the event returned.
     * </p>
     * 
     * @return A JSON string that contains a representation of the event
     *         returned.
     */

    public String getCloudTrailEvent() {
        return this.cloudTrailEvent;
    }

    /**
     * <p>
     * A JSON string that contains a representation of the event returned.
     * </p>
     * 
     * @param cloudTrailEvent
     *        A JSON string that contains a representation of the event
     *        returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Event withCloudTrailEvent(String cloudTrailEvent) {
        setCloudTrailEvent(cloudTrailEvent);
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
        if (getEventId() != null)
            sb.append("EventId: " + getEventId() + ",");
        if (getEventName() != null)
            sb.append("EventName: " + getEventName() + ",");
        if (getEventTime() != null)
            sb.append("EventTime: " + getEventTime() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getCloudTrailEvent() != null)
            sb.append("CloudTrailEvent: " + getCloudTrailEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Event == false)
            return false;
        Event other = (Event) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null
                && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventName() == null ^ this.getEventName() == null)
            return false;
        if (other.getEventName() != null
                && other.getEventName().equals(this.getEventName()) == false)
            return false;
        if (other.getEventTime() == null ^ this.getEventTime() == null)
            return false;
        if (other.getEventTime() != null
                && other.getEventTime().equals(this.getEventTime()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null
                && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getCloudTrailEvent() == null
                ^ this.getCloudTrailEvent() == null)
            return false;
        if (other.getCloudTrailEvent() != null
                && other.getCloudTrailEvent().equals(this.getCloudTrailEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode
                + ((getEventName() == null) ? 0 : getEventName().hashCode());
        hashCode = prime * hashCode
                + ((getEventTime() == null) ? 0 : getEventTime().hashCode());
        hashCode = prime * hashCode
                + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudTrailEvent() == null) ? 0 : getCloudTrailEvent()
                        .hashCode());
        return hashCode;
    }

    @Override
    public Event clone() {
        try {
            return (Event) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
