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

/**
 * <p>
 * Describes a certificate.
 * </p>
 */
public class CertificateDescription implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     */
    private String certificateArn;
    /**
     * <p>
     * The ID of the certificate.
     * </p>
     */
    private String certificateId;
    /**
     * <p>
     * The status of the certificate.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     */
    private String certificatePem;
    /**
     * <p>
     * The ID of the AWS account that owns the certificate.
     * </p>
     */
    private String ownedBy;
    /**
     * <p>
     * The date and time the certificate was created.
     * </p>
     */
    private java.util.Date creationDate;
    /**
     * <p>
     * The date and time the certificate was last modified.
     * </p>
     */
    private java.util.Date lastModifiedDate;

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate.
     */

    public void setCertificateArn(String certificateArn) {
        this.certificateArn = certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @return The ARN of the certificate.
     */

    public String getCertificateArn() {
        return this.certificateArn;
    }

    /**
     * <p>
     * The ARN of the certificate.
     * </p>
     * 
     * @param certificateArn
     *        The ARN of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withCertificateArn(String certificateArn) {
        setCertificateArn(certificateArn);
        return this;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate.
     */

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @return The ID of the certificate.
     */

    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * <p>
     * The ID of the certificate.
     * </p>
     * 
     * @param certificateId
     *        The ID of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withCertificateId(String certificateId) {
        setCertificateId(certificateId);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @see CertificateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @return The status of the certificate.
     * @see CertificateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public CertificateDescription withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public void setStatus(CertificateStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The status of the certificate.
     * </p>
     * 
     * @param status
     *        The status of the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see CertificateStatus
     */

    public CertificateDescription withStatus(CertificateStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     */

    public void setCertificatePem(String certificatePem) {
        this.certificatePem = certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @return The certificate data, in PEM format.
     */

    public String getCertificatePem() {
        return this.certificatePem;
    }

    /**
     * <p>
     * The certificate data, in PEM format.
     * </p>
     * 
     * @param certificatePem
     *        The certificate data, in PEM format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withCertificatePem(String certificatePem) {
        setCertificatePem(certificatePem);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the certificate.
     * </p>
     * 
     * @param ownedBy
     *        The ID of the AWS account that owns the certificate.
     */

    public void setOwnedBy(String ownedBy) {
        this.ownedBy = ownedBy;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the certificate.
     * </p>
     * 
     * @return The ID of the AWS account that owns the certificate.
     */

    public String getOwnedBy() {
        return this.ownedBy;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the certificate.
     * </p>
     * 
     * @param ownedBy
     *        The ID of the AWS account that owns the certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withOwnedBy(String ownedBy) {
        setOwnedBy(ownedBy);
        return this;
    }

    /**
     * <p>
     * The date and time the certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time the certificate was created.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the certificate was created.
     * </p>
     * 
     * @return The date and time the certificate was created.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time the certificate was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time the certificate was created.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The date and time the certificate was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the certificate was last modified.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the certificate was last modified.
     * </p>
     * 
     * @return The date and time the certificate was last modified.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time the certificate was last modified.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time the certificate was last modified.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CertificateDescription withLastModifiedDate(
            java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
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
        if (getCertificateArn() != null)
            sb.append("CertificateArn: " + getCertificateArn() + ",");
        if (getCertificateId() != null)
            sb.append("CertificateId: " + getCertificateId() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getCertificatePem() != null)
            sb.append("CertificatePem: " + getCertificatePem() + ",");
        if (getOwnedBy() != null)
            sb.append("OwnedBy: " + getOwnedBy() + ",");
        if (getCreationDate() != null)
            sb.append("CreationDate: " + getCreationDate() + ",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: " + getLastModifiedDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CertificateDescription == false)
            return false;
        CertificateDescription other = (CertificateDescription) obj;
        if (other.getCertificateArn() == null
                ^ this.getCertificateArn() == null)
            return false;
        if (other.getCertificateArn() != null
                && other.getCertificateArn().equals(this.getCertificateArn()) == false)
            return false;
        if (other.getCertificateId() == null ^ this.getCertificateId() == null)
            return false;
        if (other.getCertificateId() != null
                && other.getCertificateId().equals(this.getCertificateId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCertificatePem() == null
                ^ this.getCertificatePem() == null)
            return false;
        if (other.getCertificatePem() != null
                && other.getCertificatePem().equals(this.getCertificatePem()) == false)
            return false;
        if (other.getOwnedBy() == null ^ this.getOwnedBy() == null)
            return false;
        if (other.getOwnedBy() != null
                && other.getOwnedBy().equals(this.getOwnedBy()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null
                && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getLastModifiedDate() == null
                ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null
                && other.getLastModifiedDate().equals(
                        this.getLastModifiedDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCertificateArn() == null) ? 0 : getCertificateArn()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateId() == null) ? 0 : getCertificateId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificatePem() == null) ? 0 : getCertificatePem()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getOwnedBy() == null) ? 0 : getOwnedBy().hashCode());
        hashCode = prime
                * hashCode
                + ((getCreationDate() == null) ? 0 : getCreationDate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public CertificateDescription clone() {
        try {
            return (CertificateDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
