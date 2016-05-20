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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the information for each change in a change
 * batch request.
 * </p>
 */
public class Change implements Serializable, Cloneable {

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     */
    private String action;
    /**
     * <p>
     * Information about the resource record set to create or delete.
     * </p>
     */
    private ResourceRecordSet resourceRecordSet;

    /**
     * Default constructor for Change object. Callers should use the setter or
     * fluent setter (with...) methods to initialize the object after creating
     * it.
     */
    public Change() {
    }

    /**
     * Constructs a new Change object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @param resourceRecordSet
     *        Information about the resource record set to create or delete.
     */
    public Change(String action, ResourceRecordSet resourceRecordSet) {
        setAction(action);
        setResourceRecordSet(resourceRecordSet);
    }

    /**
     * Constructs a new Change object. Callers should use the setter or fluent
     * setter (with...) methods to initialize any additional object members.
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @param resourceRecordSet
     *        Information about the resource record set to create or delete.
     */
    public Change(ChangeAction action, ResourceRecordSet resourceRecordSet) {
        setAction(action.toString());
        setResourceRecordSet(resourceRecordSet);
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @see ChangeAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     * 
     * @return The action to perform:</p>
     *         <ul>
     *         <li><code>CREATE</code>: Creates a resource record set that has
     *         the specified values.</li>
     *         <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *         that has the specified values for <code>Name</code>,
     *         <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *         weighted, geolocation, and failover resource record sets), and
     *         <code>TTL</code> (except alias resource record sets, for which
     *         the TTL is determined by the AWS resource that you're routing DNS
     *         queries to).</li>
     *         <li><code>UPSERT</code>: If a resource record set does not
     *         already exist, Amazon Route 53 creates it. If a resource record
     *         set does exist, Amazon Route 53 updates it with the values in the
     *         request. Amazon Route 53 can update an existing resource record
     *         set only when all of the following values match:
     *         <code>Name</code>, <code>Type</code>, and
     *         <code>SetIdentifier</code> (for weighted, latency, geolocation,
     *         and failover resource record sets).</li>
     * @see ChangeAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public Change withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public void setAction(ChangeAction action) {
        this.action = action.toString();
    }

    /**
     * <p>
     * The action to perform:
     * </p>
     * <ul>
     * <li><code>CREATE</code>: Creates a resource record set that has the
     * specified values.</li>
     * <li><CODE>DELETE</CODE>: Deletes a existing resource record set that has
     * the specified values for <code>Name</code>, <code>Type</code>,
     * <code>SetIdentifier</code> (for latency, weighted, geolocation, and
     * failover resource record sets), and <code>TTL</code> (except alias
     * resource record sets, for which the TTL is determined by the AWS resource
     * that you're routing DNS queries to).</li>
     * <li><code>UPSERT</code>: If a resource record set does not already exist,
     * Amazon Route 53 creates it. If a resource record set does exist, Amazon
     * Route 53 updates it with the values in the request. Amazon Route 53 can
     * update an existing resource record set only when all of the following
     * values match: <code>Name</code>, <code>Type</code>, and
     * <code>SetIdentifier</code> (for weighted, latency, geolocation, and
     * failover resource record sets).</li>
     * </ul>
     * 
     * @param action
     *        The action to perform:</p>
     *        <ul>
     *        <li><code>CREATE</code>: Creates a resource record set that has
     *        the specified values.</li>
     *        <li><CODE>DELETE</CODE>: Deletes a existing resource record set
     *        that has the specified values for <code>Name</code>,
     *        <code>Type</code>, <code>SetIdentifier</code> (for latency,
     *        weighted, geolocation, and failover resource record sets), and
     *        <code>TTL</code> (except alias resource record sets, for which the
     *        TTL is determined by the AWS resource that you're routing DNS
     *        queries to).</li>
     *        <li><code>UPSERT</code>: If a resource record set does not already
     *        exist, Amazon Route 53 creates it. If a resource record set does
     *        exist, Amazon Route 53 updates it with the values in the request.
     *        Amazon Route 53 can update an existing resource record set only
     *        when all of the following values match: <code>Name</code>,
     *        <code>Type</code>, and <code>SetIdentifier</code> (for weighted,
     *        latency, geolocation, and failover resource record sets).</li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see ChangeAction
     */

    public Change withAction(ChangeAction action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * Information about the resource record set to create or delete.
     * </p>
     * 
     * @param resourceRecordSet
     *        Information about the resource record set to create or delete.
     */

    public void setResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        this.resourceRecordSet = resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create or delete.
     * </p>
     * 
     * @return Information about the resource record set to create or delete.
     */

    public ResourceRecordSet getResourceRecordSet() {
        return this.resourceRecordSet;
    }

    /**
     * <p>
     * Information about the resource record set to create or delete.
     * </p>
     * 
     * @param resourceRecordSet
     *        Information about the resource record set to create or delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Change withResourceRecordSet(ResourceRecordSet resourceRecordSet) {
        setResourceRecordSet(resourceRecordSet);
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
        if (getAction() != null)
            sb.append("Action: " + getAction() + ",");
        if (getResourceRecordSet() != null)
            sb.append("ResourceRecordSet: " + getResourceRecordSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Change == false)
            return false;
        Change other = (Change) obj;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null
                && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getResourceRecordSet() == null
                ^ this.getResourceRecordSet() == null)
            return false;
        if (other.getResourceRecordSet() != null
                && other.getResourceRecordSet().equals(
                        this.getResourceRecordSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime
                * hashCode
                + ((getResourceRecordSet() == null) ? 0
                        : getResourceRecordSet().hashCode());
        return hashCode;
    }

    @Override
    public Change clone() {
        try {
            return (Change) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
