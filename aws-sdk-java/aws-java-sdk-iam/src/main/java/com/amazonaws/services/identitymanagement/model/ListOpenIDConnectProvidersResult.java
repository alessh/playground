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

/**
 * <p>
 * Contains the response to a successful <a>ListOpenIDConnectProviders</a>
 * request.
 * </p>
 */
public class ListOpenIDConnectProvidersResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The list of IAM OpenID Connect providers in the AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<OpenIDConnectProviderListEntry> openIDConnectProviderList;

    /**
     * <p>
     * The list of IAM OpenID Connect providers in the AWS account.
     * </p>
     * 
     * @return The list of IAM OpenID Connect providers in the AWS account.
     */

    public java.util.List<OpenIDConnectProviderListEntry> getOpenIDConnectProviderList() {
        if (openIDConnectProviderList == null) {
            openIDConnectProviderList = new com.amazonaws.internal.SdkInternalList<OpenIDConnectProviderListEntry>();
        }
        return openIDConnectProviderList;
    }

    /**
     * <p>
     * The list of IAM OpenID Connect providers in the AWS account.
     * </p>
     * 
     * @param openIDConnectProviderList
     *        The list of IAM OpenID Connect providers in the AWS account.
     */

    public void setOpenIDConnectProviderList(
            java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        if (openIDConnectProviderList == null) {
            this.openIDConnectProviderList = null;
            return;
        }

        this.openIDConnectProviderList = new com.amazonaws.internal.SdkInternalList<OpenIDConnectProviderListEntry>(
                openIDConnectProviderList);
    }

    /**
     * <p>
     * The list of IAM OpenID Connect providers in the AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOpenIDConnectProviderList(java.util.Collection)} or
     * {@link #withOpenIDConnectProviderList(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param openIDConnectProviderList
     *        The list of IAM OpenID Connect providers in the AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(
            OpenIDConnectProviderListEntry... openIDConnectProviderList) {
        if (this.openIDConnectProviderList == null) {
            setOpenIDConnectProviderList(new com.amazonaws.internal.SdkInternalList<OpenIDConnectProviderListEntry>(
                    openIDConnectProviderList.length));
        }
        for (OpenIDConnectProviderListEntry ele : openIDConnectProviderList) {
            this.openIDConnectProviderList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of IAM OpenID Connect providers in the AWS account.
     * </p>
     * 
     * @param openIDConnectProviderList
     *        The list of IAM OpenID Connect providers in the AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListOpenIDConnectProvidersResult withOpenIDConnectProviderList(
            java.util.Collection<OpenIDConnectProviderListEntry> openIDConnectProviderList) {
        setOpenIDConnectProviderList(openIDConnectProviderList);
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
        if (getOpenIDConnectProviderList() != null)
            sb.append("OpenIDConnectProviderList: "
                    + getOpenIDConnectProviderList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListOpenIDConnectProvidersResult == false)
            return false;
        ListOpenIDConnectProvidersResult other = (ListOpenIDConnectProvidersResult) obj;
        if (other.getOpenIDConnectProviderList() == null
                ^ this.getOpenIDConnectProviderList() == null)
            return false;
        if (other.getOpenIDConnectProviderList() != null
                && other.getOpenIDConnectProviderList().equals(
                        this.getOpenIDConnectProviderList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOpenIDConnectProviderList() == null) ? 0
                        : getOpenIDConnectProviderList().hashCode());
        return hashCode;
    }

    @Override
    public ListOpenIDConnectProvidersResult clone() {
        try {
            return (ListOpenIDConnectProvidersResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
