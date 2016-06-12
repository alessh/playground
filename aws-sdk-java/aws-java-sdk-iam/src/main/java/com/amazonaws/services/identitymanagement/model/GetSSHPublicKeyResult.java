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
 * Contains the response to a successful <a>GetSSHPublicKey</a> request.
 * </p>
 */
public class GetSSHPublicKeyResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the SSH public key.
     * </p>
     */
    private SSHPublicKey sSHPublicKey;

    /**
     * <p>
     * Information about the SSH public key.
     * </p>
     * 
     * @param sSHPublicKey
     *        Information about the SSH public key.
     */

    public void setSSHPublicKey(SSHPublicKey sSHPublicKey) {
        this.sSHPublicKey = sSHPublicKey;
    }

    /**
     * <p>
     * Information about the SSH public key.
     * </p>
     * 
     * @return Information about the SSH public key.
     */

    public SSHPublicKey getSSHPublicKey() {
        return this.sSHPublicKey;
    }

    /**
     * <p>
     * Information about the SSH public key.
     * </p>
     * 
     * @param sSHPublicKey
     *        Information about the SSH public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSSHPublicKeyResult withSSHPublicKey(SSHPublicKey sSHPublicKey) {
        setSSHPublicKey(sSHPublicKey);
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
        if (getSSHPublicKey() != null)
            sb.append("SSHPublicKey: " + getSSHPublicKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSSHPublicKeyResult == false)
            return false;
        GetSSHPublicKeyResult other = (GetSSHPublicKeyResult) obj;
        if (other.getSSHPublicKey() == null ^ this.getSSHPublicKey() == null)
            return false;
        if (other.getSSHPublicKey() != null
                && other.getSSHPublicKey().equals(this.getSSHPublicKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSSHPublicKey() == null) ? 0 : getSSHPublicKey()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetSSHPublicKeyResult clone() {
        try {
            return (GetSSHPublicKeyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
