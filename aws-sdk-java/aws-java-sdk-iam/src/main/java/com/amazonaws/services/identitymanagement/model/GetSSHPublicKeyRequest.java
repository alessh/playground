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
public class GetSSHPublicKeyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     */
    private String sSHPublicKeyId;
    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     */
    private String encoding;

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @return The name of the IAM user associated with the SSH public key.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The name of the IAM user associated with the SSH public key.
     * </p>
     * 
     * @param userName
     *        The name of the IAM user associated with the SSH public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSSHPublicKeyRequest withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.
     */

    public void setSSHPublicKeyId(String sSHPublicKeyId) {
        this.sSHPublicKeyId = sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @return The unique identifier for the SSH public key.
     */

    public String getSSHPublicKeyId() {
        return this.sSHPublicKeyId;
    }

    /**
     * <p>
     * The unique identifier for the SSH public key.
     * </p>
     * 
     * @param sSHPublicKeyId
     *        The unique identifier for the SSH public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSSHPublicKeyRequest withSSHPublicKeyId(String sSHPublicKeyId) {
        setSSHPublicKeyId(sSHPublicKeyId);
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response.
     *        To retrieve the public key in ssh-rsa format, use <code>SSH</code>
     *        . To retrieve the public key in PEM format, use <code>PEM</code>.
     * @see EncodingType
     */

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @return Specifies the public key encoding format to use in the response.
     *         To retrieve the public key in ssh-rsa format, use
     *         <code>SSH</code>. To retrieve the public key in PEM format, use
     *         <code>PEM</code>.
     * @see EncodingType
     */

    public String getEncoding() {
        return this.encoding;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response.
     *        To retrieve the public key in ssh-rsa format, use <code>SSH</code>
     *        . To retrieve the public key in PEM format, use <code>PEM</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EncodingType
     */

    public GetSSHPublicKeyRequest withEncoding(String encoding) {
        setEncoding(encoding);
        return this;
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response.
     *        To retrieve the public key in ssh-rsa format, use <code>SSH</code>
     *        . To retrieve the public key in PEM format, use <code>PEM</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EncodingType
     */

    public void setEncoding(EncodingType encoding) {
        this.encoding = encoding.toString();
    }

    /**
     * <p>
     * Specifies the public key encoding format to use in the response. To
     * retrieve the public key in ssh-rsa format, use <code>SSH</code>. To
     * retrieve the public key in PEM format, use <code>PEM</code>.
     * </p>
     * 
     * @param encoding
     *        Specifies the public key encoding format to use in the response.
     *        To retrieve the public key in ssh-rsa format, use <code>SSH</code>
     *        . To retrieve the public key in PEM format, use <code>PEM</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see EncodingType
     */

    public GetSSHPublicKeyRequest withEncoding(EncodingType encoding) {
        setEncoding(encoding);
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
        if (getSSHPublicKeyId() != null)
            sb.append("SSHPublicKeyId: " + getSSHPublicKeyId() + ",");
        if (getEncoding() != null)
            sb.append("Encoding: " + getEncoding());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSSHPublicKeyRequest == false)
            return false;
        GetSSHPublicKeyRequest other = (GetSSHPublicKeyRequest) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null
                && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getSSHPublicKeyId() == null
                ^ this.getSSHPublicKeyId() == null)
            return false;
        if (other.getSSHPublicKeyId() != null
                && other.getSSHPublicKeyId().equals(this.getSSHPublicKeyId()) == false)
            return false;
        if (other.getEncoding() == null ^ this.getEncoding() == null)
            return false;
        if (other.getEncoding() != null
                && other.getEncoding().equals(this.getEncoding()) == false)
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
                + ((getSSHPublicKeyId() == null) ? 0 : getSSHPublicKeyId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getEncoding() == null) ? 0 : getEncoding().hashCode());
        return hashCode;
    }

    @Override
    public GetSSHPublicKeyRequest clone() {
        return (GetSSHPublicKeyRequest) super.clone();
    }
}