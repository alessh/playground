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

package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * Elastic Transcoder returns a warning if the resources used by your pipeline
 * are not in the same region as the pipeline.
 * </p>
 * <p>
 * Using resources in the same region, such as your Amazon S3 buckets, Amazon
 * SNS notification topics, and AWS KMS key, reduces processing time and
 * prevents cross-regional charges.
 * </p>
 */
public class Warning implements Serializable, Cloneable {

    /**
     * <p>
     * The code of the cross-regional warning.
     * </p>
     */
    private String code;
    /**
     * <p>
     * The message explaining what resources are in a different region from the
     * pipeline.
     * </p>
     * <p>
     * <b>Note:</b> AWS KMS keys must be in the same region as the pipeline.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The code of the cross-regional warning.
     * </p>
     * 
     * @param code
     *        The code of the cross-regional warning.
     */

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code of the cross-regional warning.
     * </p>
     * 
     * @return The code of the cross-regional warning.
     */

    public String getCode() {
        return this.code;
    }

    /**
     * <p>
     * The code of the cross-regional warning.
     * </p>
     * 
     * @param code
     *        The code of the cross-regional warning.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Warning withCode(String code) {
        setCode(code);
        return this;
    }

    /**
     * <p>
     * The message explaining what resources are in a different region from the
     * pipeline.
     * </p>
     * <p>
     * <b>Note:</b> AWS KMS keys must be in the same region as the pipeline.
     * </p>
     * 
     * @param message
     *        The message explaining what resources are in a different region
     *        from the pipeline.</p>
     *        <p>
     *        <b>Note:</b> AWS KMS keys must be in the same region as the
     *        pipeline.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message explaining what resources are in a different region from the
     * pipeline.
     * </p>
     * <p>
     * <b>Note:</b> AWS KMS keys must be in the same region as the pipeline.
     * </p>
     * 
     * @return The message explaining what resources are in a different region
     *         from the pipeline.</p>
     *         <p>
     *         <b>Note:</b> AWS KMS keys must be in the same region as the
     *         pipeline.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * The message explaining what resources are in a different region from the
     * pipeline.
     * </p>
     * <p>
     * <b>Note:</b> AWS KMS keys must be in the same region as the pipeline.
     * </p>
     * 
     * @param message
     *        The message explaining what resources are in a different region
     *        from the pipeline.</p>
     *        <p>
     *        <b>Note:</b> AWS KMS keys must be in the same region as the
     *        pipeline.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Warning withMessage(String message) {
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

        if (obj instanceof Warning == false)
            return false;
        Warning other = (Warning) obj;
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
    public Warning clone() {
        try {
            return (Warning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
