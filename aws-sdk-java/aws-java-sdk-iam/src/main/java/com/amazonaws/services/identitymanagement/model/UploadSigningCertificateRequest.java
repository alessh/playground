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
public class UploadSigningCertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the user the signing certificate is for.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     */
    private String certificateBody;

    /**
     * Default constructor for UploadSigningCertificateRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public UploadSigningCertificateRequest() {
    }

    /**
     * Constructs a new UploadSigningCertificateRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param certificateBody
     *        The contents of the signing certificate.
     */
    public UploadSigningCertificateRequest(String certificateBody) {
        setCertificateBody(certificateBody);
    }

    /**
     * <p>
     * The name of the user the signing certificate is for.
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate is for.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the user the signing certificate is for.
     * </p>
     * 
     * @return The name of the user the signing certificate is for.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the user the signing certificate is for.
     * </p>
     * 
     * @param userName
     *        The name of the user the signing certificate is for.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadSigningCertificateRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the signing certificate.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @return The contents of the signing certificate.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The contents of the signing certificate.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the signing certificate.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadSigningCertificateRequest withCertificateBody(
            String certificateBody) {
        setCertificateBody(certificateBody);
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
        if (getUserName() != null)
            sb.append("UserName: " + getUserName() + ",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: " + getCertificateBody());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadSigningCertificateRequest == false)
            return false;
        UploadSigningCertificateRequest other = (UploadSigningCertificateRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getCertificateBody() == null
                ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null
                && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateBody() == null) ? 0 : getCertificateBody()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UploadSigningCertificateRequest clone() {
        return (UploadSigningCertificateRequest) super.clone();
    }
}