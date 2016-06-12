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
public class UploadServerCertificateRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The path for the server certificate. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <note> If you are uploading a server certificate specifically for use
     * with Amazon CloudFront distributions, you must specify a path using the
     * <code>--path</code> option. The path must begin with
     * <code>/cloudfront</code> and must include a trailing slash (for example,
     * <code>/cloudfront/test/</code>). </note>
     */
    private String path;
    /**
     * <p>
     * The name for the server certificate. Do not include the path in this
     * value. The name of the certificate cannot contain any spaces.
     * </p>
     */
    private String serverCertificateName;
    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     */
    private String certificateBody;
    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation
     * of the PEM-encoded public key certificates of the chain.
     * </p>
     */
    private String certificateChain;

    /**
     * Default constructor for UploadServerCertificateRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * the object after creating it.
     */
    public UploadServerCertificateRequest() {
    }

    /**
     * Constructs a new UploadServerCertificateRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize any
     * additional object members.
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in
     *        this value. The name of the certificate cannot contain any spaces.
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.
     */
    public UploadServerCertificateRequest(String serverCertificateName,
            String certificateBody, String privateKey) {
        setServerCertificateName(serverCertificateName);
        setCertificateBody(certificateBody);
        setPrivateKey(privateKey);
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <note> If you are uploading a server certificate specifically for use
     * with Amazon CloudFront distributions, you must specify a path using the
     * <code>--path</code> option. The path must begin with
     * <code>/cloudfront</code> and must include a trailing slash (for example,
     * <code>/cloudfront/test/</code>). </note>
     * 
     * @param path
     *        The path for the server certificate. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     *        </p>
     *        <note> If you are uploading a server certificate specifically for
     *        use with Amazon CloudFront distributions, you must specify a path
     *        using the <code>--path</code> option. The path must begin with
     *        <code>/cloudfront</code> and must include a trailing slash (for
     *        example, <code>/cloudfront/test/</code>).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <note> If you are uploading a server certificate specifically for use
     * with Amazon CloudFront distributions, you must specify a path using the
     * <code>--path</code> option. The path must begin with
     * <code>/cloudfront</code> and must include a trailing slash (for example,
     * <code>/cloudfront/test/</code>). </note>
     * 
     * @return The path for the server certificate. For more information about
     *         paths, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     *         </p>
     *         <note> If you are uploading a server certificate specifically for
     *         use with Amazon CloudFront distributions, you must specify a path
     *         using the <code>--path</code> option. The path must begin with
     *         <code>/cloudfront</code> and must include a trailing slash (for
     *         example, <code>/cloudfront/test/</code>).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the server certificate. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * <note> If you are uploading a server certificate specifically for use
     * with Amazon CloudFront distributions, you must specify a path using the
     * <code>--path</code> option. The path must begin with
     * <code>/cloudfront</code> and must include a trailing slash (for example,
     * <code>/cloudfront/test/</code>). </note>
     * 
     * @param path
     *        The path for the server certificate. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     *        </p>
     *        <note> If you are uploading a server certificate specifically for
     *        use with Amazon CloudFront distributions, you must specify a path
     *        using the <code>--path</code> option. The path must begin with
     *        <code>/cloudfront</code> and must include a trailing slash (for
     *        example, <code>/cloudfront/test/</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadServerCertificateRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this
     * value. The name of the certificate cannot contain any spaces.
     * </p>
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in
     *        this value. The name of the certificate cannot contain any spaces.
     */

    public void setServerCertificateName(String serverCertificateName) {
        this.serverCertificateName = serverCertificateName;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this
     * value. The name of the certificate cannot contain any spaces.
     * </p>
     * 
     * @return The name for the server certificate. Do not include the path in
     *         this value. The name of the certificate cannot contain any
     *         spaces.
     */

    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    /**
     * <p>
     * The name for the server certificate. Do not include the path in this
     * value. The name of the certificate cannot contain any spaces.
     * </p>
     * 
     * @param serverCertificateName
     *        The name for the server certificate. Do not include the path in
     *        this value. The name of the certificate cannot contain any spaces.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadServerCertificateRequest withServerCertificateName(
            String serverCertificateName) {
        setServerCertificateName(serverCertificateName);
        return this;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.
     */

    public void setCertificateBody(String certificateBody) {
        this.certificateBody = certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * 
     * @return The contents of the public key certificate in PEM-encoded format.
     */

    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * <p>
     * The contents of the public key certificate in PEM-encoded format.
     * </p>
     * 
     * @param certificateBody
     *        The contents of the public key certificate in PEM-encoded format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadServerCertificateRequest withCertificateBody(
            String certificateBody) {
        setCertificateBody(certificateBody);
        return this;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * 
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * 
     * @return The contents of the private key in PEM-encoded format.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The contents of the private key in PEM-encoded format.
     * </p>
     * 
     * @param privateKey
     *        The contents of the private key in PEM-encoded format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadServerCertificateRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation
     * of the PEM-encoded public key certificates of the chain.
     * </p>
     * 
     * @param certificateChain
     *        The contents of the certificate chain. This is typically a
     *        concatenation of the PEM-encoded public key certificates of the
     *        chain.
     */

    public void setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation
     * of the PEM-encoded public key certificates of the chain.
     * </p>
     * 
     * @return The contents of the certificate chain. This is typically a
     *         concatenation of the PEM-encoded public key certificates of the
     *         chain.
     */

    public String getCertificateChain() {
        return this.certificateChain;
    }

    /**
     * <p>
     * The contents of the certificate chain. This is typically a concatenation
     * of the PEM-encoded public key certificates of the chain.
     * </p>
     * 
     * @param certificateChain
     *        The contents of the certificate chain. This is typically a
     *        concatenation of the PEM-encoded public key certificates of the
     *        chain.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UploadServerCertificateRequest withCertificateChain(
            String certificateChain) {
        setCertificateChain(certificateChain);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getServerCertificateName() != null)
            sb.append("ServerCertificateName: " + getServerCertificateName()
                    + ",");
        if (getCertificateBody() != null)
            sb.append("CertificateBody: " + getCertificateBody() + ",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: " + getPrivateKey() + ",");
        if (getCertificateChain() != null)
            sb.append("CertificateChain: " + getCertificateChain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UploadServerCertificateRequest == false)
            return false;
        UploadServerCertificateRequest other = (UploadServerCertificateRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getServerCertificateName() == null
                ^ this.getServerCertificateName() == null)
            return false;
        if (other.getServerCertificateName() != null
                && other.getServerCertificateName().equals(
                        this.getServerCertificateName()) == false)
            return false;
        if (other.getCertificateBody() == null
                ^ this.getCertificateBody() == null)
            return false;
        if (other.getCertificateBody() != null
                && other.getCertificateBody().equals(this.getCertificateBody()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null
                && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getCertificateChain() == null
                ^ this.getCertificateChain() == null)
            return false;
        if (other.getCertificateChain() != null
                && other.getCertificateChain().equals(
                        this.getCertificateChain()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getServerCertificateName() == null) ? 0
                        : getServerCertificateName().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateBody() == null) ? 0 : getCertificateBody()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime
                * hashCode
                + ((getCertificateChain() == null) ? 0 : getCertificateChain()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UploadServerCertificateRequest clone() {
        return (UploadServerCertificateRequest) super.clone();
    }
}