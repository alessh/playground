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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class VerifyDomainDkimRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     * 
     * @param domain
     *        The name of the domain to be verified for Easy DKIM signing.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     * 
     * @return The name of the domain to be verified for Easy DKIM signing.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the domain to be verified for Easy DKIM signing.
     * </p>
     * 
     * @param domain
     *        The name of the domain to be verified for Easy DKIM signing.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VerifyDomainDkimRequest withDomain(String domain) {
        setDomain(domain);
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
        if (getDomain() != null)
            sb.append("Domain: " + getDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VerifyDomainDkimRequest == false)
            return false;
        VerifyDomainDkimRequest other = (VerifyDomainDkimRequest) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null
                && other.getDomain().equals(this.getDomain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomain() == null) ? 0 : getDomain().hashCode());
        return hashCode;
    }

    @Override
    public VerifyDomainDkimRequest clone() {
        return (VerifyDomainDkimRequest) super.clone();
    }
}