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

package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class ListDocumentsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<DocumentFilter> documentFilterList;
    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * </p>
     * 
     * @return One or more filters. Use a filter to return a more specific list
     *         of results.
     */

    public java.util.List<DocumentFilter> getDocumentFilterList() {
        if (documentFilterList == null) {
            documentFilterList = new com.amazonaws.internal.SdkInternalList<DocumentFilter>();
        }
        return documentFilterList;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * </p>
     * 
     * @param documentFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of results.
     */

    public void setDocumentFilterList(
            java.util.Collection<DocumentFilter> documentFilterList) {
        if (documentFilterList == null) {
            this.documentFilterList = null;
            return;
        }

        this.documentFilterList = new com.amazonaws.internal.SdkInternalList<DocumentFilter>(
                documentFilterList);
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setDocumentFilterList(java.util.Collection)} or
     * {@link #withDocumentFilterList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param documentFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDocumentsRequest withDocumentFilterList(
            DocumentFilter... documentFilterList) {
        if (this.documentFilterList == null) {
            setDocumentFilterList(new com.amazonaws.internal.SdkInternalList<DocumentFilter>(
                    documentFilterList.length));
        }
        for (DocumentFilter ele : documentFilterList) {
            this.documentFilterList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters. Use a filter to return a more specific list of
     * results.
     * </p>
     * 
     * @param documentFilterList
     *        One or more filters. Use a filter to return a more specific list
     *        of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDocumentsRequest withDocumentFilterList(
            java.util.Collection<DocumentFilter> documentFilterList) {
        setDocumentFilterList(documentFilterList);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also
     *        returns a token that you can specify in a subsequent call to get
     *        the next set of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * 
     * @return The maximum number of items to return for this call. The call
     *         also returns a token that you can specify in a subsequent call to
     *         get the next set of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return for this call. The call also
     * returns a token that you can specify in a subsequent call to get the next
     * set of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return for this call. The call also
     *        returns a token that you can specify in a subsequent call to get
     *        the next set of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDocumentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListDocumentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getDocumentFilterList() != null)
            sb.append("DocumentFilterList: " + getDocumentFilterList() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListDocumentsRequest == false)
            return false;
        ListDocumentsRequest other = (ListDocumentsRequest) obj;
        if (other.getDocumentFilterList() == null
                ^ this.getDocumentFilterList() == null)
            return false;
        if (other.getDocumentFilterList() != null
                && other.getDocumentFilterList().equals(
                        this.getDocumentFilterList()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDocumentFilterList() == null) ? 0
                        : getDocumentFilterList().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListDocumentsRequest clone() {
        return (ListDocumentsRequest) super.clone();
    }
}