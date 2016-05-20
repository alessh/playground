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
public class ListEntitiesForPolicyRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String policyArn;
    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     */
    private String entityFilter;
    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all entities.
     * </p>
     */
    private String pathPrefix;
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
     * @param policyArn
     */

    public void setPolicyArn(String policyArn) {
        this.policyArn = policyArn;
    }

    /**
     * @return
     */

    public String getPolicyArn() {
        return this.policyArn;
    }

    /**
     * @param policyArn
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListEntitiesForPolicyRequest withPolicyArn(String policyArn) {
        setPolicyArn(policyArn);
        return this;
    }

    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     * 
     * @param entityFilter
     *        The entity type to use for filtering the results. </p>
     *        <p>
     *        For example, when <code>EntityFilter</code> is <code>Role</code>,
     *        only the roles that are attached to the specified policy are
     *        returned. This parameter is optional. If it is not included, all
     *        attached entities (users, groups, and roles) are returned.
     * @see EntityType
     */

    public void setEntityFilter(String entityFilter) {
        this.entityFilter = entityFilter;
    }

    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     * 
     * @return The entity type to use for filtering the results. </p>
     *         <p>
     *         For example, when <code>EntityFilter</code> is <code>Role</code>,
     *         only the roles that are attached to the specified policy are
     *         returned. This parameter is optional. If it is not included, all
     *         attached entities (users, groups, and roles) are returned.
     * @see EntityType
     */

    public String getEntityFilter() {
        return this.entityFilter;
    }

    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     * 
     * @param entityFilter
     *        The entity type to use for filtering the results. </p>
     *        <p>
     *        For example, when <code>EntityFilter</code> is <code>Role</code>,
     *        only the roles that are attached to the specified policy are
     *        returned. This parameter is optional. If it is not included, all
     *        attached entities (users, groups, and roles) are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public ListEntitiesForPolicyRequest withEntityFilter(String entityFilter) {
        setEntityFilter(entityFilter);
        return this;
    }

    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     * 
     * @param entityFilter
     *        The entity type to use for filtering the results. </p>
     *        <p>
     *        For example, when <code>EntityFilter</code> is <code>Role</code>,
     *        only the roles that are attached to the specified policy are
     *        returned. This parameter is optional. If it is not included, all
     *        attached entities (users, groups, and roles) are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public void setEntityFilter(EntityType entityFilter) {
        this.entityFilter = entityFilter.toString();
    }

    /**
     * <p>
     * The entity type to use for filtering the results.
     * </p>
     * <p>
     * For example, when <code>EntityFilter</code> is <code>Role</code>, only
     * the roles that are attached to the specified policy are returned. This
     * parameter is optional. If it is not included, all attached entities
     * (users, groups, and roles) are returned.
     * </p>
     * 
     * @param entityFilter
     *        The entity type to use for filtering the results. </p>
     *        <p>
     *        For example, when <code>EntityFilter</code> is <code>Role</code>,
     *        only the roles that are attached to the specified policy are
     *        returned. This parameter is optional. If it is not included, all
     *        attached entities (users, groups, and roles) are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EntityType
     */

    public ListEntitiesForPolicyRequest withEntityFilter(EntityType entityFilter) {
        setEntityFilter(entityFilter);
        return this;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all entities.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is
     *        optional. If it is not included, it defaults to a slash (/),
     *        listing all entities.
     */

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all entities.
     * </p>
     * 
     * @return The path prefix for filtering the results. This parameter is
     *         optional. If it is not included, it defaults to a slash (/),
     *         listing all entities.
     */

    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all entities.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is
     *        optional. If it is not included, it defaults to a slash (/),
     *        listing all entities.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListEntitiesForPolicyRequest withPathPrefix(String pathPrefix) {
        setPathPrefix(pathPrefix);
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

    public ListEntitiesForPolicyRequest withMarker(String marker) {
        setMarker(marker);
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

    public ListEntitiesForPolicyRequest withMaxItems(Integer maxItems) {
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
        if (getPolicyArn() != null)
            sb.append("PolicyArn: " + getPolicyArn() + ",");
        if (getEntityFilter() != null)
            sb.append("EntityFilter: " + getEntityFilter() + ",");
        if (getPathPrefix() != null)
            sb.append("PathPrefix: " + getPathPrefix() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
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

        if (obj instanceof ListEntitiesForPolicyRequest == false)
            return false;
        ListEntitiesForPolicyRequest other = (ListEntitiesForPolicyRequest) obj;
        if (other.getPolicyArn() == null ^ this.getPolicyArn() == null)
            return false;
        if (other.getPolicyArn() != null
                && other.getPolicyArn().equals(this.getPolicyArn()) == false)
            return false;
        if (other.getEntityFilter() == null ^ this.getEntityFilter() == null)
            return false;
        if (other.getEntityFilter() != null
                && other.getEntityFilter().equals(this.getEntityFilter()) == false)
            return false;
        if (other.getPathPrefix() == null ^ this.getPathPrefix() == null)
            return false;
        if (other.getPathPrefix() != null
                && other.getPathPrefix().equals(this.getPathPrefix()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode
                + ((getPolicyArn() == null) ? 0 : getPolicyArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getEntityFilter() == null) ? 0 : getEntityFilter()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPathPrefix() == null) ? 0 : getPathPrefix().hashCode());
        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListEntitiesForPolicyRequest clone() {
        return (ListEntitiesForPolicyRequest) super.clone();
    }
}