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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class GetAccountAuthorizationDetailsRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> filter;
    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     */
    private Integer maxItems;
    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     * 
     * @return A list of entity types (user, group, role, local managed policy,
     *         or AWS managed policy) for filtering the results.
     * @see EntityType
     */

    public java.util.List<String> getFilter() {
        if (filter == null) {
            filter = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return filter;
    }

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     * 
     * @param filter
     *        A list of entity types (user, group, role, local managed policy,
     *        or AWS managed policy) for filtering the results.
     * @see EntityType
     */

    public void setFilter(java.util.Collection<String> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }

        this.filter = new com.amazonaws.internal.SdkInternalList<String>(filter);
    }

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilter(java.util.Collection)} or
     * {@link #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filter
     *        A list of entity types (user, group, role, local managed policy,
     *        or AWS managed policy) for filtering the results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(String... filter) {
        if (this.filter == null) {
            setFilter(new com.amazonaws.internal.SdkInternalList<String>(
                    filter.length));
        }
        for (String ele : filter) {
            this.filter.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     * 
     * @param filter
     *        A list of entity types (user, group, role, local managed policy,
     *        or AWS managed policy) for filtering the results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(
            java.util.Collection<String> filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * A list of entity types (user, group, role, local managed policy, or AWS
     * managed policy) for filtering the results.
     * </p>
     * 
     * @param filter
     *        A list of entity types (user, group, role, local managed policy,
     *        or AWS managed policy) for filtering the results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public GetAccountAuthorizationDetailsRequest withFilter(
            EntityType... filter) {
        com.amazonaws.internal.SdkInternalList<String> filterCopy = new com.amazonaws.internal.SdkInternalList<String>(
                filter.length);
        for (EntityType value : filter) {
            filterCopy.add(value.toString());
        }
        if (getFilter() == null) {
            setFilter(filterCopy);
        } else {
            getFilter().addAll(filterCopy);
        }
        return this;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum
     *        number of items you want in the response. If additional items
     *        exist beyond the maximum you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        This parameter is optional. If you do not include it, it defaults
     *        to 100. Note that IAM might return fewer results, even when there
     *        are more results available. In that case, the
     *        <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to
     *        include in the subsequent call that tells the service where to
     *        continue from.
     */

    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @return Use this only when paginating results to indicate the maximum
     *         number of items you want in the response. If additional items
     *         exist beyond the maximum you specify, the
     *         <code>IsTruncated</code> response element is <code>true</code>
     *         .</p>
     *         <p>
     *         This parameter is optional. If you do not include it, it defaults
     *         to 100. Note that IAM might return fewer results, even when there
     *         are more results available. In that case, the
     *         <code>IsTruncated</code> response element returns
     *         <code>true</code> and <code>Marker</code> contains a value to
     *         include in the subsequent call that tells the service where to
     *         continue from.
     */

    public Integer getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Use this only when paginating results to indicate the maximum number of
     * items you want in the response. If additional items exist beyond the
     * maximum you specify, the <code>IsTruncated</code> response element is
     * <code>true</code>.
     * </p>
     * <p>
     * This parameter is optional. If you do not include it, it defaults to 100.
     * Note that IAM might return fewer results, even when there are more
     * results available. In that case, the <code>IsTruncated</code> response
     * element returns <code>true</code> and <code>Marker</code> contains a
     * value to include in the subsequent call that tells the service where to
     * continue from.
     * </p>
     * 
     * @param maxItems
     *        Use this only when paginating results to indicate the maximum
     *        number of items you want in the response. If additional items
     *        exist beyond the maximum you specify, the <code>IsTruncated</code>
     *        response element is <code>true</code>.</p>
     *        <p>
     *        This parameter is optional. If you do not include it, it defaults
     *        to 100. Note that IAM might return fewer results, even when there
     *        are more results available. In that case, the
     *        <code>IsTruncated</code> response element returns
     *        <code>true</code> and <code>Marker</code> contains a value to
     *        include in the subsequent call that tells the service where to
     *        continue from.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetAccountAuthorizationDetailsRequest withMaxItems(Integer maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you
     *        receive a response indicating that the results are truncated. Set
     *        it to the value of the <code>Marker</code> element in the response
     *        that you received to indicate where the next call should start.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @return Use this parameter only when paginating results and only after
     *         you receive a response indicating that the results are truncated.
     *         Set it to the value of the <code>Marker</code> element in the
     *         response that you received to indicate where the next call should
     *         start.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * Use this parameter only when paginating results and only after you
     * receive a response indicating that the results are truncated. Set it to
     * the value of the <code>Marker</code> element in the response that you
     * received to indicate where the next call should start.
     * </p>
     * 
     * @param marker
     *        Use this parameter only when paginating results and only after you
     *        receive a response indicating that the results are truncated. Set
     *        it to the value of the <code>Marker</code> element in the response
     *        that you received to indicate where the next call should start.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetAccountAuthorizationDetailsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getFilter() != null)
            sb.append("Filter: " + getFilter() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountAuthorizationDetailsRequest == false)
            return false;
        GetAccountAuthorizationDetailsRequest other = (GetAccountAuthorizationDetailsRequest) obj;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null
                && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountAuthorizationDetailsRequest clone() {
        return (GetAccountAuthorizationDetailsRequest) super.clone();
    }
}