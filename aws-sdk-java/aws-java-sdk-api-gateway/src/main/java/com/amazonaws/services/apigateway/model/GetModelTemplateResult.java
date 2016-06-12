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

package com.amazonaws.services.apigateway.model;

import java.io.Serializable;

/**
 * <p>
 * Represents a mapping template used to transform a payload.
 * </p>
 */
public class GetModelTemplateResult implements Serializable, Cloneable {

    /**
     * <p>
     * The Apache <a
     * href="http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     */
    private String value;

    /**
     * <p>
     * The Apache <a
     * href="http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     * 
     * @param value
     *        The Apache <a href=
     *        "http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     *        target="_blank">Velocity Template Language (VTL)</a> template
     *        content used for the template resource.
     */

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The Apache <a
     * href="http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     * 
     * @return The Apache <a
     *         href="http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     *         target="_blank">Velocity Template Language (VTL)</a> template
     *         content used for the template resource.
     */

    public String getValue() {
        return this.value;
    }

    /**
     * <p>
     * The Apache <a
     * href="http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     * target="_blank">Velocity Template Language (VTL)</a> template content
     * used for the template resource.
     * </p>
     * 
     * @param value
     *        The Apache <a href=
     *        "http://velocity.apache.org/engine/devel/vtl-reference-guide.html"
     *        target="_blank">Velocity Template Language (VTL)</a> template
     *        content used for the template resource.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetModelTemplateResult withValue(String value) {
        setValue(value);
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
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetModelTemplateResult == false)
            return false;
        GetModelTemplateResult other = (GetModelTemplateResult) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null
                && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public GetModelTemplateResult clone() {
        try {
            return (GetModelTemplateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
