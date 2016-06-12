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
 * Returns the objects or data listed below if successful. Otherwise, returns an
 * error.
 */
public class ListPublicKeysResult implements Serializable, Cloneable {

    /**
     * <p>
     * Contains an array of PublicKey objects.
     * </p>
     * <note>The returned public keys may have validity time ranges that
     * overlap.</note>
     */
    private com.amazonaws.internal.SdkInternalList<PublicKey> publicKeyList;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Contains an array of PublicKey objects.
     * </p>
     * <note>The returned public keys may have validity time ranges that
     * overlap.</note>
     * 
     * @return Contains an array of PublicKey objects.</p> <note>The returned
     *         public keys may have validity time ranges that overlap.
     */

    public java.util.List<PublicKey> getPublicKeyList() {
        if (publicKeyList == null) {
            publicKeyList = new com.amazonaws.internal.SdkInternalList<PublicKey>();
        }
        return publicKeyList;
    }

    /**
     * <p>
     * Contains an array of PublicKey objects.
     * </p>
     * <note>The returned public keys may have validity time ranges that
     * overlap.</note>
     * 
     * @param publicKeyList
     *        Contains an array of PublicKey objects.</p> <note>The returned
     *        public keys may have validity time ranges that overlap.
     */

    public void setPublicKeyList(java.util.Collection<PublicKey> publicKeyList) {
        if (publicKeyList == null) {
            this.publicKeyList = null;
            return;
        }

        this.publicKeyList = new com.amazonaws.internal.SdkInternalList<PublicKey>(
                publicKeyList);
    }

    /**
     * <p>
     * Contains an array of PublicKey objects.
     * </p>
     * <note>The returned public keys may have validity time ranges that
     * overlap.</note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPublicKeyList(java.util.Collection)} or
     * {@link #withPublicKeyList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param publicKeyList
     *        Contains an array of PublicKey objects.</p> <note>The returned
     *        public keys may have validity time ranges that overlap.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPublicKeysResult withPublicKeyList(PublicKey... publicKeyList) {
        if (this.publicKeyList == null) {
            setPublicKeyList(new com.amazonaws.internal.SdkInternalList<PublicKey>(
                    publicKeyList.length));
        }
        for (PublicKey ele : publicKeyList) {
            this.publicKeyList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains an array of PublicKey objects.
     * </p>
     * <note>The returned public keys may have validity time ranges that
     * overlap.</note>
     * 
     * @param publicKeyList
     *        Contains an array of PublicKey objects.</p> <note>The returned
     *        public keys may have validity time ranges that overlap.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPublicKeysResult withPublicKeyList(
            java.util.Collection<PublicKey> publicKeyList) {
        setPublicKeyList(publicKeyList);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param nextToken
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPublicKeysResult withNextToken(String nextToken) {
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
        if (getPublicKeyList() != null)
            sb.append("PublicKeyList: " + getPublicKeyList() + ",");
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

        if (obj instanceof ListPublicKeysResult == false)
            return false;
        ListPublicKeysResult other = (ListPublicKeysResult) obj;
        if (other.getPublicKeyList() == null ^ this.getPublicKeyList() == null)
            return false;
        if (other.getPublicKeyList() != null
                && other.getPublicKeyList().equals(this.getPublicKeyList()) == false)
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
                + ((getPublicKeyList() == null) ? 0 : getPublicKeyList()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPublicKeysResult clone() {
        try {
            return (ListPublicKeysResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
