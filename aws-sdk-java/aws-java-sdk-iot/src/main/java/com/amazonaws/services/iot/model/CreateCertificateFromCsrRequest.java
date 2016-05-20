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

package com.amazonaws.services.iot.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the CreateCertificateFromCsr operation.
 * </p>
 */
public class CreateCertificateFromCsrRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     */
    private String certificateSigningRequest;
    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     */
    private Boolean setAsActive;

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * 
     * @param certificateSigningRequest
     *        The certificate signing request (CSR).
     */

    public void setCertificateSigningRequest(String certificateSigningRequest) {
        this.certificateSigningRequest = certificateSigningRequest;
    }

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * 
     * @return The certificate signing request (CSR).
     */

    public String getCertificateSigningRequest() {
        return this.certificateSigningRequest;
    }

    /**
     * <p>
     * The certificate signing request (CSR).
     * </p>
     * 
     * @param certificateSigningRequest
     *        The certificate signing request (CSR).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateCertificateFromCsrRequest withCertificateSigningRequest(
            String certificateSigningRequest) {
        setCertificateSigningRequest(certificateSigningRequest);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @param setAsActive
     *        Specifies whether the certificate is active.
     */

    public void setSetAsActive(Boolean setAsActive) {
        this.setAsActive = setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @return Specifies whether the certificate is active.
     */

    public Boolean getSetAsActive() {
        return this.setAsActive;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @param setAsActive
     *        Specifies whether the certificate is active.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateCertificateFromCsrRequest withSetAsActive(Boolean setAsActive) {
        setSetAsActive(setAsActive);
        return this;
    }

    /**
     * <p>
     * Specifies whether the certificate is active.
     * </p>
     * 
     * @return Specifies whether the certificate is active.
     */

    public Boolean isSetAsActive() {
        return this.setAsActive;
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
        if (getCertificateSigningRequest() != null)
            sb.append("CertificateSigningRequest: "
                    + getCertificateSigningRequest() + ",");
        if (getSetAsActive() != null)
            sb.append("SetAsActive: " + getSetAsActive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateCertificateFromCsrRequest == false)
            return false;
        CreateCertificateFromCsrRequest other = (CreateCertificateFromCsrRequest) obj;
        if (other.getCertificateSigningRequest() == null
                ^ this.getCertificateSigningRequest() == null)
            return false;
        if (other.getCertificateSigningRequest() != null
                && other.getCertificateSigningRequest().equals(
                        this.getCertificateSigningRequest()) == false)
            return false;
        if (other.getSetAsActive() == null ^ this.getSetAsActive() == null)
            return false;
        if (other.getSetAsActive() != null
                && other.getSetAsActive().equals(this.getSetAsActive()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateSigningRequest() == null) ? 0
                        : getCertificateSigningRequest().hashCode());
        hashCode = prime
                * hashCode
                + ((getSetAsActive() == null) ? 0 : getSetAsActive().hashCode());
        return hashCode;
    }

    @Override
    public CreateCertificateFromCsrRequest clone() {
        return (CreateCertificateFromCsrRequest) super.clone();
    }
}