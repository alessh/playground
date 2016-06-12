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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a ListResourceRecordSets request.
 * </p>
 */
public class ListResourceRecordSetsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to get.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * </p>
     */
    private String startRecordName;
    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     */
    private String startRecordType;
    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from the
     * previous response to get the next resource record set that has the
     * current DNS name and type.
     * </p>
     */
    private String startRecordIdentifier;
    /**
     * <p>
     * The maximum number of records you want in the response body.
     * </p>
     */
    private String maxItems;

    /**
     * Default constructor for ListResourceRecordSetsRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public ListResourceRecordSetsRequest() {
    }

    /**
     * Constructs a new ListResourceRecordSetsRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets
     *        that you want to get.
     */
    public ListResourceRecordSetsRequest(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to get.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets
     *        that you want to get.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to get.
     * </p>
     * 
     * @return The ID of the hosted zone that contains the resource record sets
     *         that you want to get.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you
     * want to get.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets
     *        that you want to get.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * </p>
     * 
     * @param startRecordName
     *        The first name in the lexicographic ordering of domain names that
     *        you want the <code>ListResourceRecordSets</code> request to list.
     */

    public void setStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * </p>
     * 
     * @return The first name in the lexicographic ordering of domain names that
     *         you want the <code>ListResourceRecordSets</code> request to list.
     */

    public String getStartRecordName() {
        return this.startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * </p>
     * 
     * @param startRecordName
     *        The first name in the lexicographic ordering of domain names that
     *        you want the <code>ListResourceRecordSets</code> request to list.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListResourceRecordSetsRequest withStartRecordName(
            String startRecordName) {
        setStartRecordName(startRecordName);
        return this;
    }

    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startRecordType
     *        The DNS type at which to begin the listing of resource record
     *        sets. </p>
     *        <p>
     *        Valid values: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *        <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *        <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Weighted Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Regional Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Alias Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying
     *        <code>name</code> returns an <a>InvalidInput</a> error.
     * @see RRType
     */

    public void setStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
    }

    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @return The DNS type at which to begin the listing of resource record
     *         sets. </p>
     *         <p>
     *         Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for Weighted Resource Record Sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for Regional Resource Record Sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for Alias Resource Record Sets: <code>A</code> |
     *         <code>AAAA</code>
     *         </p>
     *         <p>
     *         Constraint: Specifying <code>type</code> without specifying
     *         <code>name</code> returns an <a>InvalidInput</a> error.
     * @see RRType
     */

    public String getStartRecordType() {
        return this.startRecordType;
    }

    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startRecordType
     *        The DNS type at which to begin the listing of resource record
     *        sets. </p>
     *        <p>
     *        Valid values: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *        <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *        <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Weighted Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Regional Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Alias Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying
     *        <code>name</code> returns an <a>InvalidInput</a> error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public ListResourceRecordSetsRequest withStartRecordType(
            String startRecordType) {
        setStartRecordType(startRecordType);
        return this;
    }

    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startRecordType
     *        The DNS type at which to begin the listing of resource record
     *        sets. </p>
     *        <p>
     *        Valid values: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *        <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *        <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Weighted Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Regional Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Alias Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying
     *        <code>name</code> returns an <a>InvalidInput</a> error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public void setStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
    }

    /**
     * <p>
     * The DNS type at which to begin the listing of resource record sets.
     * </p>
     * <p>
     * Valid values: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>MX</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Weighted Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Regional Resource Record Sets: <code>A</code> |
     * <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for Alias Resource Record Sets: <code>A</code> | <code>AAAA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying
     * <code>name</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startRecordType
     *        The DNS type at which to begin the listing of resource record
     *        sets. </p>
     *        <p>
     *        Valid values: <code>A</code> | <code>AAAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *        <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *        <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Weighted Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Regional Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CNAME</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for Alias Resource Record Sets: <code>A</code> |
     *        <code>AAAA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying
     *        <code>name</code> returns an <a>InvalidInput</a> error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see RRType
     */

    public ListResourceRecordSetsRequest withStartRecordType(
            RRType startRecordType) {
        setStartRecordType(startRecordType);
        return this;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from the
     * previous response to get the next resource record set that has the
     * current DNS name and type.
     * </p>
     * 
     * @param startRecordIdentifier
     *        Weighted resource record sets only:</i> If results were truncated
     *        for a given DNS name and type, specify the value of
     *        <code>ListResourceRecordSetsResponse$NextRecordIdentifier
     */

    public void setStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from the
     * previous response to get the next resource record set that has the
     * current DNS name and type.
     * </p>
     * 
     * @return Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, specify the value of
     *         <code>ListResourceRecordSetsResponse$NextRecordIdentifier
     */

    public String getStartRecordIdentifier() {
        return this.startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for
     * a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from the
     * previous response to get the next resource record set that has the
     * current DNS name and type.
     * </p>
     * 
     * @param startRecordIdentifier
     *        Weighted resource record sets only:</i> If results were truncated
     *        for a given DNS name and type, specify the value of
     *        <code>ListResourceRecordSetsResponse$NextRecordIdentifier
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListResourceRecordSetsRequest withStartRecordIdentifier(
            String startRecordIdentifier) {
        setStartRecordIdentifier(startRecordIdentifier);
        return this;
    }

    /**
     * <p>
     * The maximum number of records you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you want in the response body.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of records you want in the response body.
     * </p>
     * 
     * @return The maximum number of records you want in the response body.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of records you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you want in the response body.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListResourceRecordSetsRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getStartRecordName() != null)
            sb.append("StartRecordName: " + getStartRecordName() + ",");
        if (getStartRecordType() != null)
            sb.append("StartRecordType: " + getStartRecordType() + ",");
        if (getStartRecordIdentifier() != null)
            sb.append("StartRecordIdentifier: " + getStartRecordIdentifier()
                    + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListResourceRecordSetsRequest == false)
            return false;
        ListResourceRecordSetsRequest other = (ListResourceRecordSetsRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStartRecordName() == null
                ^ this.getStartRecordName() == null)
            return false;
        if (other.getStartRecordName() != null
                && other.getStartRecordName().equals(this.getStartRecordName()) == false)
            return false;
        if (other.getStartRecordType() == null
                ^ this.getStartRecordType() == null)
            return false;
        if (other.getStartRecordType() != null
                && other.getStartRecordType().equals(this.getStartRecordType()) == false)
            return false;
        if (other.getStartRecordIdentifier() == null
                ^ this.getStartRecordIdentifier() == null)
            return false;
        if (other.getStartRecordIdentifier() != null
                && other.getStartRecordIdentifier().equals(
                        this.getStartRecordIdentifier()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStartRecordName() == null) ? 0 : getStartRecordName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStartRecordType() == null) ? 0 : getStartRecordType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStartRecordIdentifier() == null) ? 0
                        : getStartRecordIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceRecordSetsRequest clone() {
        return (ListResourceRecordSetsRequest) super.clone();
    }
}