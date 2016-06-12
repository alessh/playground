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

package com.amazonaws.services.kms.model;

import java.io.Serializable;

/**
 * 
 */
public class ScheduleKeyDeletionResult implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     */
    private java.util.Date deletionDate;

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * 
     * @param keyId
     *        The unique identifier of the customer master key (CMK) for which
     *        deletion is scheduled.
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * 
     * @return The unique identifier of the customer master key (CMK) for which
     *         deletion is scheduled.
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The unique identifier of the customer master key (CMK) for which deletion
     * is scheduled.
     * </p>
     * 
     * @param keyId
     *        The unique identifier of the customer master key (CMK) for which
     *        deletion is scheduled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScheduleKeyDeletionResult withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master
     *        key (CMK).
     */

    public void setDeletionDate(java.util.Date deletionDate) {
        this.deletionDate = deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     * 
     * @return The date and time after which AWS KMS deletes the customer master
     *         key (CMK).
     */

    public java.util.Date getDeletionDate() {
        return this.deletionDate;
    }

    /**
     * <p>
     * The date and time after which AWS KMS deletes the customer master key
     * (CMK).
     * </p>
     * 
     * @param deletionDate
     *        The date and time after which AWS KMS deletes the customer master
     *        key (CMK).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ScheduleKeyDeletionResult withDeletionDate(
            java.util.Date deletionDate) {
        setDeletionDate(deletionDate);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getDeletionDate() != null)
            sb.append("DeletionDate: " + getDeletionDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduleKeyDeletionResult == false)
            return false;
        ScheduleKeyDeletionResult other = (ScheduleKeyDeletionResult) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getDeletionDate() == null ^ this.getDeletionDate() == null)
            return false;
        if (other.getDeletionDate() != null
                && other.getDeletionDate().equals(this.getDeletionDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getDeletionDate() == null) ? 0 : getDeletionDate()
                        .hashCode());
        return hashCode;
    }

    @Override
    public ScheduleKeyDeletionResult clone() {
        try {
            return (ScheduleKeyDeletionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
