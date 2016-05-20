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

package com.amazonaws.services.directory.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Describes the trust relationships for a particular Microsoft AD in the AWS
 * cloud. If no input parameters are are provided, such as directory ID or trust
 * ID, this request describes all the trust relationships.
 */
public class DescribeTrustsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * The Directory ID of the AWS directory that is a part of the requested
     * trust relationship.
     */
    private String directoryId;
    /**
     * <p>
     * A list of identifiers of the trust relationships for which to obtain the
     * information. If this member is null, all trust relationships that belong
     * to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being
     * thrown.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> trustIds;
    /**
     * <p>
     * The <i>DescribeTrustsResult.NextToken</i> value from a previous call to
     * <a>DescribeTrusts</a>. Pass null if this is the first call.
     * </p>
     */
    private String nextToken;
    /** The maximum number of objects to return. */
    private Integer limit;

    /**
     * The Directory ID of the AWS directory that is a part of the requested
     * trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory that is a part of the
     *        requested trust relationship.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * The Directory ID of the AWS directory that is a part of the requested
     * trust relationship.
     * 
     * @return The Directory ID of the AWS directory that is a part of the
     *         requested trust relationship.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * The Directory ID of the AWS directory that is a part of the requested
     * trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the AWS directory that is a part of the
     *        requested trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrustsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * A list of identifiers of the trust relationships for which to obtain the
     * information. If this member is null, all trust relationships that belong
     * to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being
     * thrown.
     * </p>
     * 
     * @return A list of identifiers of the trust relationships for which to
     *         obtain the information. If this member is null, all trust
     *         relationships that belong to the current account are
     *         returned.</p>
     *         <p>
     *         An empty list results in an
     *         <code>InvalidParameterException</code> being thrown.
     */

    public java.util.List<String> getTrustIds() {
        if (trustIds == null) {
            trustIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return trustIds;
    }

    /**
     * <p>
     * A list of identifiers of the trust relationships for which to obtain the
     * information. If this member is null, all trust relationships that belong
     * to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being
     * thrown.
     * </p>
     * 
     * @param trustIds
     *        A list of identifiers of the trust relationships for which to
     *        obtain the information. If this member is null, all trust
     *        relationships that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code>
     *        being thrown.
     */

    public void setTrustIds(java.util.Collection<String> trustIds) {
        if (trustIds == null) {
            this.trustIds = null;
            return;
        }

        this.trustIds = new com.amazonaws.internal.SdkInternalList<String>(
                trustIds);
    }

    /**
     * <p>
     * A list of identifiers of the trust relationships for which to obtain the
     * information. If this member is null, all trust relationships that belong
     * to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being
     * thrown.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTrustIds(java.util.Collection)} or
     * {@link #withTrustIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param trustIds
     *        A list of identifiers of the trust relationships for which to
     *        obtain the information. If this member is null, all trust
     *        relationships that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code>
     *        being thrown.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrustsRequest withTrustIds(String... trustIds) {
        if (this.trustIds == null) {
            setTrustIds(new com.amazonaws.internal.SdkInternalList<String>(
                    trustIds.length));
        }
        for (String ele : trustIds) {
            this.trustIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of identifiers of the trust relationships for which to obtain the
     * information. If this member is null, all trust relationships that belong
     * to the current account are returned.
     * </p>
     * <p>
     * An empty list results in an <code>InvalidParameterException</code> being
     * thrown.
     * </p>
     * 
     * @param trustIds
     *        A list of identifiers of the trust relationships for which to
     *        obtain the information. If this member is null, all trust
     *        relationships that belong to the current account are returned.</p>
     *        <p>
     *        An empty list results in an <code>InvalidParameterException</code>
     *        being thrown.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrustsRequest withTrustIds(
            java.util.Collection<String> trustIds) {
        setTrustIds(trustIds);
        return this;
    }

    /**
     * <p>
     * The <i>DescribeTrustsResult.NextToken</i> value from a previous call to
     * <a>DescribeTrusts</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeTrustsResult.NextToken</i> value from a previous
     *        call to <a>DescribeTrusts</a>. Pass null if this is the first
     *        call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <i>DescribeTrustsResult.NextToken</i> value from a previous call to
     * <a>DescribeTrusts</a>. Pass null if this is the first call.
     * </p>
     * 
     * @return The <i>DescribeTrustsResult.NextToken</i> value from a previous
     *         call to <a>DescribeTrusts</a>. Pass null if this is the first
     *         call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <i>DescribeTrustsResult.NextToken</i> value from a previous call to
     * <a>DescribeTrusts</a>. Pass null if this is the first call.
     * </p>
     * 
     * @param nextToken
     *        The <i>DescribeTrustsResult.NextToken</i> value from a previous
     *        call to <a>DescribeTrusts</a>. Pass null if this is the first
     *        call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrustsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * The maximum number of objects to return.
     * 
     * @param limit
     *        The maximum number of objects to return.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * The maximum number of objects to return.
     * 
     * @return The maximum number of objects to return.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * The maximum number of objects to return.
     * 
     * @param limit
     *        The maximum number of objects to return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTrustsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getTrustIds() != null)
            sb.append("TrustIds: " + getTrustIds() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTrustsRequest == false)
            return false;
        DescribeTrustsRequest other = (DescribeTrustsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getTrustIds() == null ^ this.getTrustIds() == null)
            return false;
        if (other.getTrustIds() != null
                && other.getTrustIds().equals(this.getTrustIds()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode
                + ((getTrustIds() == null) ? 0 : getTrustIds().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTrustsRequest clone() {
        return (DescribeTrustsRequest) super.clone();
    }
}