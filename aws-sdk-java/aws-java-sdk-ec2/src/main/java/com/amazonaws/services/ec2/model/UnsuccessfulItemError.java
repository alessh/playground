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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the error that occurred. For more information about errors,
 * see <a href=
 * "http://docs.aws.amazon.com/AWSEC2/latest/APIReference/errors-overview.html"
 * >Error Codes</a>.
 * </p>
 */
public class UnsuccessfulItemError implements Serializable, Cloneable {

    /**
     * <p>
     * The error code.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The error message accompanying the error code.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @return The error code.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The error code.
     * </p>
     * 
     * @param code
     *        The error code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnsuccessfulItemError withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The error message accompanying the error code.
     * </p>
     * 
     * @param message
     *        The error message accompanying the error code.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The error message accompanying the error code.
     * </p>
     * 
     * @return The error message accompanying the error code.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The error message accompanying the error code.
     * </p>
     * 
     * @param message
     *        The error message accompanying the error code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UnsuccessfulItemError withMessage(String message) {
        setMessage(message);
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsuccessfulItemError == false)
            return false;
        UnsuccessfulItemError other = (UnsuccessfulItemError) obj;
        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null
                && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null
                && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode
                + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public UnsuccessfulItemError clone() {
        try {
            return (UnsuccessfulItemError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
