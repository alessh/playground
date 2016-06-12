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

package com.amazonaws.services.waf.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get an <a>XssMatchSet</a>.
 * </p>
 */
public class GetXssMatchSetRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     */
    private String xssMatchSetId;

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @param xssMatchSetId
     *        The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you
     *        want to get. <code>XssMatchSetId</code> is returned by
     *        <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     */

    public void setXssMatchSetId(String xssMatchSetId) {
        this.xssMatchSetId = xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @return The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you
     *         want to get. <code>XssMatchSetId</code> is returned by
     *         <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     */

    public String getXssMatchSetId() {
        return this.xssMatchSetId;
    }

    /**
     * <p>
     * The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you want to
     * get. <code>XssMatchSetId</code> is returned by <a>CreateXssMatchSet</a>
     * and by <a>ListXssMatchSets</a>.
     * </p>
     * 
     * @param xssMatchSetId
     *        The <code>XssMatchSetId</code> of the <a>XssMatchSet</a> that you
     *        want to get. <code>XssMatchSetId</code> is returned by
     *        <a>CreateXssMatchSet</a> and by <a>ListXssMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetXssMatchSetRequest withXssMatchSetId(String xssMatchSetId) {
        setXssMatchSetId(xssMatchSetId);
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
        if (getXssMatchSetId() != null)
            sb.append("XssMatchSetId: " + getXssMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetXssMatchSetRequest == false)
            return false;
        GetXssMatchSetRequest other = (GetXssMatchSetRequest) obj;
        if (other.getXssMatchSetId() == null ^ this.getXssMatchSetId() == null)
            return false;
        if (other.getXssMatchSetId() != null
                && other.getXssMatchSetId().equals(this.getXssMatchSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getXssMatchSetId() == null) ? 0 : getXssMatchSetId()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetXssMatchSetRequest clone() {
        return (GetXssMatchSetRequest) super.clone();
    }
}