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
 * Contains the response to a successful <a>CreateSAMLProvider</a> request.
 * </p>
 */
public class CreateSAMLProviderResult implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     */
    private String sAMLProviderArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the SAML provider.
     */

    public void setSAMLProviderArn(String sAMLProviderArn) {
        this.sAMLProviderArn = sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SAML provider.
     */

    public String getSAMLProviderArn() {
        return this.sAMLProviderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SAML provider.
     * </p>
     * 
     * @param sAMLProviderArn
     *        The Amazon Resource Name (ARN) of the SAML provider.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateSAMLProviderResult withSAMLProviderArn(String sAMLProviderArn) {
        setSAMLProviderArn(sAMLProviderArn);
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
        if (getSAMLProviderArn() != null)
            sb.append("SAMLProviderArn: " + getSAMLProviderArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSAMLProviderResult == false)
            return false;
        CreateSAMLProviderResult other = (CreateSAMLProviderResult) obj;
        if (other.getSAMLProviderArn() == null
                ^ this.getSAMLProviderArn() == null)
            return false;
        if (other.getSAMLProviderArn() != null
                && other.getSAMLProviderArn().equals(this.getSAMLProviderArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSAMLProviderArn() == null) ? 0 : getSAMLProviderArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CreateSAMLProviderResult clone() {
        try {
            return (CreateSAMLProviderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
