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

/**
 * <p>
 * Contains the output of the <a>CreateLunaClient</a> action.
 * </p>
 */
public class CreateLunaClientResult implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the client.
     * </p>
     */
    private String clientArn;

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     */

    public void setClientArn(String clientArn) {
        this.clientArn = clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @return The ARN of the client.
     */

    public String getClientArn() {
        return this.clientArn;
    }

    /**
     * <p>
     * The ARN of the client.
     * </p>
     * 
     * @param clientArn
     *        The ARN of the client.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateLunaClientResult withClientArn(String clientArn) {
        setClientArn(clientArn);
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
        if (getClientArn() != null)
            sb.append("ClientArn: " + getClientArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLunaClientResult == false)
            return false;
        CreateLunaClientResult other = (CreateLunaClientResult) obj;
        if (other.getClientArn() == null ^ this.getClientArn() == null)
            return false;
        if (other.getClientArn() != null
                && other.getClientArn().equals(this.getClientArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientArn() == null) ? 0 : getClientArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateLunaClientResult clone() {
        try {
            return (CreateLunaClientResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
