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
public class UpdateOpenIDConnectProviderThumbprintRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider
     * to update the thumbprint for. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> action.
     * </p>
     */
    private String openIDConnectProviderArn;
    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> thumbprintList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider
     * to update the thumbprint for. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> action.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *        provider to update the thumbprint for. You can get a list of OIDC
     *        provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *        action.
     */

    public void setOpenIDConnectProviderArn(String openIDConnectProviderArn) {
        this.openIDConnectProviderArn = openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider
     * to update the thumbprint for. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> action.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *         provider to update the thumbprint for. You can get a list of OIDC
     *         provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *         action.
     */

    public String getOpenIDConnectProviderArn() {
        return this.openIDConnectProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC) provider
     * to update the thumbprint for. You can get a list of OIDC provider ARNs by
     * using the <a>ListOpenIDConnectProviders</a> action.
     * </p>
     * 
     * @param openIDConnectProviderArn
     *        The Amazon Resource Name (ARN) of the IAM OpenID Connect (OIDC)
     *        provider to update the thumbprint for. You can get a list of OIDC
     *        provider ARNs by using the <a>ListOpenIDConnectProviders</a>
     *        action.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withOpenIDConnectProviderArn(
            String openIDConnectProviderArn) {
        setOpenIDConnectProviderArn(openIDConnectProviderArn);
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @return A list of certificate thumbprints that are associated with the
     *         specified IAM OpenID Connect provider. For more information, see
     *         <a>CreateOpenIDConnectProvider</a>.
     */

    public java.util.List<String> getThumbprintList() {
        if (thumbprintList == null) {
            thumbprintList = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return thumbprintList;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the
     *        specified IAM OpenID Connect provider. For more information, see
     *        <a>CreateOpenIDConnectProvider</a>.
     */

    public void setThumbprintList(java.util.Collection<String> thumbprintList) {
        if (thumbprintList == null) {
            this.thumbprintList = null;
            return;
        }

        this.thumbprintList = new com.amazonaws.internal.SdkInternalList<String>(
                thumbprintList);
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setThumbprintList(java.util.Collection)} or
     * {@link #withThumbprintList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the
     *        specified IAM OpenID Connect provider. For more information, see
     *        <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(
            String... thumbprintList) {
        if (this.thumbprintList == null) {
            setThumbprintList(new com.amazonaws.internal.SdkInternalList<String>(
                    thumbprintList.length));
        }
        for (String ele : thumbprintList) {
            this.thumbprintList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of certificate thumbprints that are associated with the specified
     * IAM OpenID Connect provider. For more information, see
     * <a>CreateOpenIDConnectProvider</a>.
     * </p>
     * 
     * @param thumbprintList
     *        A list of certificate thumbprints that are associated with the
     *        specified IAM OpenID Connect provider. For more information, see
     *        <a>CreateOpenIDConnectProvider</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateOpenIDConnectProviderThumbprintRequest withThumbprintList(
            java.util.Collection<String> thumbprintList) {
        setThumbprintList(thumbprintList);
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
        if (getOpenIDConnectProviderArn() != null)
            sb.append("OpenIDConnectProviderArn: "
                    + getOpenIDConnectProviderArn() + ",");
        if (getThumbprintList() != null)
            sb.append("ThumbprintList: " + getThumbprintList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpenIDConnectProviderThumbprintRequest == false)
            return false;
        UpdateOpenIDConnectProviderThumbprintRequest other = (UpdateOpenIDConnectProviderThumbprintRequest) obj;
        if (other.getOpenIDConnectProviderArn() == null
                ^ this.getOpenIDConnectProviderArn() == null)
            return false;
        if (other.getOpenIDConnectProviderArn() != null
                && other.getOpenIDConnectProviderArn().equals(
                        this.getOpenIDConnectProviderArn()) == false)
            return false;
        if (other.getThumbprintList() == null
                ^ this.getThumbprintList() == null)
            return false;
        if (other.getThumbprintList() != null
                && other.getThumbprintList().equals(this.getThumbprintList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getOpenIDConnectProviderArn() == null) ? 0
                        : getOpenIDConnectProviderArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getThumbprintList() == null) ? 0 : getThumbprintList()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateOpenIDConnectProviderThumbprintRequest clone() {
        return (UpdateOpenIDConnectProviderThumbprintRequest) super.clone();
    }
}