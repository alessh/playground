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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a Client Certificate used to configure client-side SSL
 * authentication while sending requests to the integration endpoint.
 * </p>
 */
public class GetClientCertificateResult implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Client Certificate.
     * </p>
     */
    private String clientCertificateId;
    /**
     * <p>
     * The description of the Client Certificate.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The PEM-encoded public key of the Client Certificate, that can be used to
     * configure certificate authentication in the integration endpoint .
     * </p>
     */
    private String pemEncodedCertificate;
    /**
     * <p>
     * The date when the Client Certificate was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date createdDate;
    /**
     * <p>
     * The date when the Client Certificate will expire, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     */
    private java.util.Date expirationDate;

    /**
     * <p>
     * The identifier of the Client Certificate.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the Client Certificate.
     */

    public void setClientCertificateId(String clientCertificateId) {
        this.clientCertificateId = clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the Client Certificate.
     * </p>
     * 
     * @return The identifier of the Client Certificate.
     */

    public String getClientCertificateId() {
        return this.clientCertificateId;
    }

    /**
     * <p>
     * The identifier of the Client Certificate.
     * </p>
     * 
     * @param clientCertificateId
     *        The identifier of the Client Certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificateResult withClientCertificateId(
            String clientCertificateId) {
        setClientCertificateId(clientCertificateId);
        return this;
    }

    /**
     * <p>
     * The description of the Client Certificate.
     * </p>
     * 
     * @param description
     *        The description of the Client Certificate.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the Client Certificate.
     * </p>
     * 
     * @return The description of the Client Certificate.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the Client Certificate.
     * </p>
     * 
     * @param description
     *        The description of the Client Certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificateResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The PEM-encoded public key of the Client Certificate, that can be used to
     * configure certificate authentication in the integration endpoint .
     * </p>
     * 
     * @param pemEncodedCertificate
     *        The PEM-encoded public key of the Client Certificate, that can be
     *        used to configure certificate authentication in the integration
     *        endpoint .
     */

    public void setPemEncodedCertificate(String pemEncodedCertificate) {
        this.pemEncodedCertificate = pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the Client Certificate, that can be used to
     * configure certificate authentication in the integration endpoint .
     * </p>
     * 
     * @return The PEM-encoded public key of the Client Certificate, that can be
     *         used to configure certificate authentication in the integration
     *         endpoint .
     */

    public String getPemEncodedCertificate() {
        return this.pemEncodedCertificate;
    }

    /**
     * <p>
     * The PEM-encoded public key of the Client Certificate, that can be used to
     * configure certificate authentication in the integration endpoint .
     * </p>
     * 
     * @param pemEncodedCertificate
     *        The PEM-encoded public key of the Client Certificate, that can be
     *        used to configure certificate authentication in the integration
     *        endpoint .
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificateResult withPemEncodedCertificate(
            String pemEncodedCertificate) {
        setPemEncodedCertificate(pemEncodedCertificate);
        return this;
    }

    /**
     * <p>
     * The date when the Client Certificate was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date when the Client Certificate was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     */

    public void setCreatedDate(java.util.Date createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * <p>
     * The date when the Client Certificate was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date when the Client Certificate was created, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *         target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getCreatedDate() {
        return this.createdDate;
    }

    /**
     * <p>
     * The date when the Client Certificate was created, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param createdDate
     *        The date when the Client Certificate was created, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificateResult withCreatedDate(java.util.Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    /**
     * <p>
     * The date when the Client Certificate will expire, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param expirationDate
     *        The date when the Client Certificate will expire, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     */

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * <p>
     * The date when the Client Certificate will expire, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @return The date when the Client Certificate will expire, in <a
     *         href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *         target="_blank">ISO 8601 format</a>.
     */

    public java.util.Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * <p>
     * The date when the Client Certificate will expire, in <a
     * href="http://www.iso.org/iso/home/standards/iso8601.htm"
     * target="_blank">ISO 8601 format</a>.
     * </p>
     * 
     * @param expirationDate
     *        The date when the Client Certificate will expire, in <a
     *        href="http://www.iso.org/iso/home/standards/iso8601.htm"
     *        target="_blank">ISO 8601 format</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetClientCertificateResult withExpirationDate(
            java.util.Date expirationDate) {
        setExpirationDate(expirationDate);
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
        if (getClientCertificateId() != null)
            sb.append("ClientCertificateId: " + getClientCertificateId() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getPemEncodedCertificate() != null)
            sb.append("PemEncodedCertificate: " + getPemEncodedCertificate()
                    + ",");
        if (getCreatedDate() != null)
            sb.append("CreatedDate: " + getCreatedDate() + ",");
        if (getExpirationDate() != null)
            sb.append("ExpirationDate: " + getExpirationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetClientCertificateResult == false)
            return false;
        GetClientCertificateResult other = (GetClientCertificateResult) obj;
        if (other.getClientCertificateId() == null
                ^ this.getClientCertificateId() == null)
            return false;
        if (other.getClientCertificateId() != null
                && other.getClientCertificateId().equals(
                        this.getClientCertificateId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getPemEncodedCertificate() == null
                ^ this.getPemEncodedCertificate() == null)
            return false;
        if (other.getPemEncodedCertificate() != null
                && other.getPemEncodedCertificate().equals(
                        this.getPemEncodedCertificate()) == false)
            return false;
        if (other.getCreatedDate() == null ^ this.getCreatedDate() == null)
            return false;
        if (other.getCreatedDate() != null
                && other.getCreatedDate().equals(this.getCreatedDate()) == false)
            return false;
        if (other.getExpirationDate() == null
                ^ this.getExpirationDate() == null)
            return false;
        if (other.getExpirationDate() != null
                && other.getExpirationDate().equals(this.getExpirationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getClientCertificateId() == null) ? 0
                        : getClientCertificateId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getPemEncodedCertificate() == null) ? 0
                        : getPemEncodedCertificate().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreatedDate() == null) ? 0 : getCreatedDate().hashCode());
        hashCode = prime
                * hashCode
                + ((getExpirationDate() == null) ? 0 : getExpirationDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetClientCertificateResult clone() {
        try {
            return (GetClientCertificateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
