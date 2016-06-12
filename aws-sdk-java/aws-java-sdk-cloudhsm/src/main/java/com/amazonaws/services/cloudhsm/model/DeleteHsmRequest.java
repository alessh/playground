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

package com.amazonaws.services.cloudhsm.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the inputs for the <a>DeleteHsm</a> operation.
 * </p>
 */
public class DeleteHsmRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     */
    private String hsmArn;

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to delete.
     */

    public void setHsmArn(String hsmArn) {
        this.hsmArn = hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @return The ARN of the HSM to delete.
     */

    public String getHsmArn() {
        return this.hsmArn;
    }

    /**
     * <p>
     * The ARN of the HSM to delete.
     * </p>
     * 
     * @param hsmArn
     *        The ARN of the HSM to delete.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteHsmRequest withHsmArn(String hsmArn) {
        setHsmArn(hsmArn);
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
        if (getHsmArn() != null)
            sb.append("HsmArn: " + getHsmArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteHsmRequest == false)
            return false;
        DeleteHsmRequest other = (DeleteHsmRequest) obj;
        if (other.getHsmArn() == null ^ this.getHsmArn() == null)
            return false;
        if (other.getHsmArn() != null
                && other.getHsmArn().equals(this.getHsmArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHsmArn() == null) ? 0 : getHsmArn().hashCode());
        return hashCode;
    }

    @Override
    public DeleteHsmRequest clone() {
        return (DeleteHsmRequest) super.clone();
    }
}