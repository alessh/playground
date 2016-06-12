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

package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about a returned public key.
 * </p>
 */
public class PublicKey implements Serializable, Cloneable {

    /**
     * <p>
     * The DER encoded public key value in PKCS#1 format.
     * </p>
     */
    private java.nio.ByteBuffer value;
    /**
     * <p>
     * The starting time of validity of the public key.
     * </p>
     */
    private java.util.Date validityStartTime;
    /**
     * <p>
     * The ending time of validity of the public key.
     * </p>
     */
    private java.util.Date validityEndTime;
    /**
     * <p>
     * The fingerprint of the public key.
     * </p>
     */
    private String fingerprint;

    /**
     * <p>
     * The DER encoded public key value in PKCS#1 format.
     * </p>
     * <p>
     * AWS SDK for Java performs a Base64 encoding on this field before sending
     * this request to AWS service by default. Users of the SDK should not
     * perform Base64 encoding on this field.
     * </p>
     * 
     * @param value
     *        The DER encoded public key value in PKCS#1 format.
     */

    public void setValue(java.nio.ByteBuffer value) {
        this.value = value;
    }

    /**
     * <p>
     * The DER encoded public key value in PKCS#1 format.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods
     * changes their {@code position}. We recommend using
     * {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view
     * of the buffer with an independent {@code position}, and calling
     * {@code get} methods on this rather than directly on the returned
     * {@code ByteBuffer}. Doing so will ensure that anyone else using the
     * {@code ByteBuffer} will not be affected by changes to the {@code position}
     * .
     * </p>
     * 
     * @return The DER encoded public key value in PKCS#1 format.
     */

    public java.nio.ByteBuffer getValue() {
        return this.value;
    }

    /**
     * <p>
     * The DER encoded public key value in PKCS#1 format.
     * </p>
     * 
     * @param value
     *        The DER encoded public key value in PKCS#1 format.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublicKey withValue(java.nio.ByteBuffer value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * The starting time of validity of the public key.
     * </p>
     * 
     * @param validityStartTime
     *        The starting time of validity of the public key.
     */

    public void setValidityStartTime(java.util.Date validityStartTime) {
        this.validityStartTime = validityStartTime;
    }

    /**
     * <p>
     * The starting time of validity of the public key.
     * </p>
     * 
     * @return The starting time of validity of the public key.
     */

    public java.util.Date getValidityStartTime() {
        return this.validityStartTime;
    }

    /**
     * <p>
     * The starting time of validity of the public key.
     * </p>
     * 
     * @param validityStartTime
     *        The starting time of validity of the public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublicKey withValidityStartTime(java.util.Date validityStartTime) {
        setValidityStartTime(validityStartTime);
        return this;
    }

    /**
     * <p>
     * The ending time of validity of the public key.
     * </p>
     * 
     * @param validityEndTime
     *        The ending time of validity of the public key.
     */

    public void setValidityEndTime(java.util.Date validityEndTime) {
        this.validityEndTime = validityEndTime;
    }

    /**
     * <p>
     * The ending time of validity of the public key.
     * </p>
     * 
     * @return The ending time of validity of the public key.
     */

    public java.util.Date getValidityEndTime() {
        return this.validityEndTime;
    }

    /**
     * <p>
     * The ending time of validity of the public key.
     * </p>
     * 
     * @param validityEndTime
     *        The ending time of validity of the public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublicKey withValidityEndTime(java.util.Date validityEndTime) {
        setValidityEndTime(validityEndTime);
        return this;
    }

    /**
     * <p>
     * The fingerprint of the public key.
     * </p>
     * 
     * @param fingerprint
     *        The fingerprint of the public key.
     */

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    /**
     * <p>
     * The fingerprint of the public key.
     * </p>
     * 
     * @return The fingerprint of the public key.
     */

    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * <p>
     * The fingerprint of the public key.
     * </p>
     * 
     * @param fingerprint
     *        The fingerprint of the public key.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PublicKey withFingerprint(String fingerprint) {
        setFingerprint(fingerprint);
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
        if (getValue() != null)
            sb.append("Value: " + getValue() + ",");
        if (getValidityStartTime() != null)
            sb.append("ValidityStartTime: " + getValidityStartTime() + ",");
        if (getValidityEndTime() != null)
            sb.append("ValidityEndTime: " + getValidityEndTime() + ",");
        if (getFingerprint() != null)
            sb.append("Fingerprint: " + getFingerprint());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PublicKey == false)
            return false;
        PublicKey other = (PublicKey) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        if (other.getValidityStartTime() == null
                ^ this.getValidityStartTime() == null)
            return false;
        if (other.getValidityStartTime() != null
                && other.getValidityStartTime().equals(
                        this.getValidityStartTime()) == false)
            return false;
        if (other.getValidityEndTime() == null
                ^ this.getValidityEndTime() == null)
            return false;
        if (other.getValidityEndTime() != null
                && other.getValidityEndTime().equals(this.getValidityEndTime()) == false)
            return false;
        if (other.getFingerprint() == null ^ this.getFingerprint() == null)
            return false;
        if (other.getFingerprint() != null
                && other.getFingerprint().equals(this.getFingerprint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidityStartTime() == null) ? 0
                        : getValidityStartTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getValidityEndTime() == null) ? 0 : getValidityEndTime()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getFingerprint() == null) ? 0 : getFingerprint().hashCode());
        return hashCode;
    }

    @Override
    public PublicKey clone() {
        try {
            return (PublicKey) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
