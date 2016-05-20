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
public class ListPoliciesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     */
    private String scope;
    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or role.
     * When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     */
    private Boolean onlyAttached;
    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
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
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results. </p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to
     *        <code>AWS</code>. To list only the customer managed policies in
     *        your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set
     *        to <code>All</code>, all policies are returned.
     * @see PolicyScopeType
     */

    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     * 
     * @return The scope to use for filtering the results. </p>
     *         <p>
     *         To list only AWS managed policies, set <code>Scope</code> to
     *         <code>AWS</code>. To list only the customer managed policies in
     *         your AWS account, set <code>Scope</code> to <code>Local</code>.
     *         </p>
     *         <p>
     *         This parameter is optional. If it is not included, or if it is
     *         set to <code>All</code>, all policies are returned.
     * @see PolicyScopeType
     */

    public String getScope() {
        return this.scope;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results. </p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to
     *        <code>AWS</code>. To list only the customer managed policies in
     *        your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set
     *        to <code>All</code>, all policies are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyScopeType
     */

    public ListPoliciesRequest withScope(String scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results. </p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to
     *        <code>AWS</code>. To list only the customer managed policies in
     *        your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set
     *        to <code>All</code>, all policies are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyScopeType
     */

    public void setScope(PolicyScopeType scope) {
        this.scope = scope.toString();
    }

    /**
     * <p>
     * The scope to use for filtering the results.
     * </p>
     * <p>
     * To list only AWS managed policies, set <code>Scope</code> to
     * <code>AWS</code>. To list only the customer managed policies in your AWS
     * account, set <code>Scope</code> to <code>Local</code>.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, or if it is set to
     * <code>All</code>, all policies are returned.
     * </p>
     * 
     * @param scope
     *        The scope to use for filtering the results. </p>
     *        <p>
     *        To list only AWS managed policies, set <code>Scope</code> to
     *        <code>AWS</code>. To list only the customer managed policies in
     *        your AWS account, set <code>Scope</code> to <code>Local</code>.
     *        </p>
     *        <p>
     *        This parameter is optional. If it is not included, or if it is set
     *        to <code>All</code>, all policies are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see PolicyScopeType
     */

    public ListPoliciesRequest withScope(PolicyScopeType scope) {
        setScope(scope);
        return this;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or role.
     * When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @param onlyAttached
     *        A flag to filter the results to only the attached policies. </p>
     *        <p>
     *        When <code>OnlyAttached</code> is <code>true</code>, the returned
     *        list contains only the policies that are attached to a user,
     *        group, or role. When <code>OnlyAttached</code> is
     *        <code>false</code>, or when the parameter is not included, all
     *        policies are returned.
     */

    public void setOnlyAttached(Boolean onlyAttached) {
        this.onlyAttached = onlyAttached;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or role.
     * When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @return A flag to filter the results to only the attached policies. </p>
     *         <p>
     *         When <code>OnlyAttached</code> is <code>true</code>, the returned
     *         list contains only the policies that are attached to a user,
     *         group, or role. When <code>OnlyAttached</code> is
     *         <code>false</code>, or when the parameter is not included, all
     *         policies are returned.
     */

    public Boolean getOnlyAttached() {
        return this.onlyAttached;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or role.
     * When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @param onlyAttached
     *        A flag to filter the results to only the attached policies. </p>
     *        <p>
     *        When <code>OnlyAttached</code> is <code>true</code>, the returned
     *        list contains only the policies that are attached to a user,
     *        group, or role. When <code>OnlyAttached</code> is
     *        <code>false</code>, or when the parameter is not included, all
     *        policies are returned.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPoliciesRequest withOnlyAttached(Boolean onlyAttached) {
        setOnlyAttached(onlyAttached);
        return this;
    }

    /**
     * <p>
     * A flag to filter the results to only the attached policies.
     * </p>
     * <p>
     * When <code>OnlyAttached</code> is <code>true</code>, the returned list
     * contains only the policies that are attached to a user, group, or role.
     * When <code>OnlyAttached</code> is <code>false</code>, or when the
     * parameter is not included, all policies are returned.
     * </p>
     * 
     * @return A flag to filter the results to only the attached policies. </p>
     *         <p>
     *         When <code>OnlyAttached</code> is <code>true</code>, the returned
     *         list contains only the policies that are attached to a user,
     *         group, or role. When <code>OnlyAttached</code> is
     *         <code>false</code>, or when the parameter is not included, all
     *         policies are returned.
     */

    public Boolean isOnlyAttached() {
        return this.onlyAttached;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is
     *        optional. If it is not included, it defaults to a slash (/),
     *        listing all policies.
     */

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * 
     * @return The path prefix for filtering the results. This parameter is
     *         optional. If it is not included, it defaults to a slash (/),
     *         listing all policies.
     */

    public String getPathPrefix() {
        return this.pathPrefix;
    }

    /**
     * <p>
     * The path prefix for filtering the results. This parameter is optional. If
     * it is not included, it defaults to a slash (/), listing all policies.
     * </p>
     * 
     * @param pathPrefix
     *        The path prefix for filtering the results. This parameter is
     *        optional. If it is not included, it defaults to a slash (/),
     *        listing all policies.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPoliciesRequest withPathPrefix(String pathPrefix) {
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

    public ListPoliciesRequest withMarker(String marker) {
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

    public ListPoliciesRequest withMaxItems(Integer maxItems) {
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
        if (getScope() != null)
            sb.append("Scope: " + getScope() + ",");
        if (getOnlyAttached() != null)
            sb.append("OnlyAttached: " + getOnlyAttached() + ",");
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

        if (obj instanceof ListPoliciesRequest == false)
            return false;
        ListPoliciesRequest other = (ListPoliciesRequest) obj;
        if (other.getScope() == null ^ this.getScope() == null)
            return false;
        if (other.getScope() != null
                && other.getScope().equals(this.getScope()) == false)
            return false;
        if (other.getOnlyAttached() == null ^ this.getOnlyAttached() == null)
            return false;
        if (other.getOnlyAttached() != null
                && other.getOnlyAttached().equals(this.getOnlyAttached()) == false)
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
                + ((getScope() == null) ? 0 : getScope().hashCode());
        hashCode = prime
                * hashCode
                + ((getOnlyAttached() == null) ? 0 : getOnlyAttached()
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
    public ListPoliciesRequest clone() {
        return (ListPoliciesRequest) super.clone();
    }
}