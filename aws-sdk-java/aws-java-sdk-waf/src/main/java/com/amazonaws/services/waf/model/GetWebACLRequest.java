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
 * 
 */
public class GetWebACLRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to get.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     */
    private String webACLId;

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to get.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        The <code>WebACLId</code> of the <a>WebACL</a> that you want to
     *        get. <code>WebACLId</code> is returned by <a>CreateWebACL</a> and
     *        by <a>ListWebACLs</a>.
     */

    public void setWebACLId(String webACLId) {
        this.webACLId = webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to get.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * 
     * @return The <code>WebACLId</code> of the <a>WebACL</a> that you want to
     *         get. <code>WebACLId</code> is returned by <a>CreateWebACL</a> and
     *         by <a>ListWebACLs</a>.
     */

    public String getWebACLId() {
        return this.webACLId;
    }

    /**
     * <p>
     * The <code>WebACLId</code> of the <a>WebACL</a> that you want to get.
     * <code>WebACLId</code> is returned by <a>CreateWebACL</a> and by
     * <a>ListWebACLs</a>.
     * </p>
     * 
     * @param webACLId
     *        The <code>WebACLId</code> of the <a>WebACL</a> that you want to
     *        get. <code>WebACLId</code> is returned by <a>CreateWebACL</a> and
     *        by <a>ListWebACLs</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetWebACLRequest withWebACLId(String webACLId) {
        setWebACLId(webACLId);
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
        if (getWebACLId() != null)
            sb.append("WebACLId: " + getWebACLId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetWebACLRequest == false)
            return false;
        GetWebACLRequest other = (GetWebACLRequest) obj;
        if (other.getWebACLId() == null ^ this.getWebACLId() == null)
            return false;
        if (other.getWebACLId() != null
                && other.getWebACLId().equals(this.getWebACLId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getWebACLId() == null) ? 0 : getWebACLId().hashCode());
        return hashCode;
    }

    @Override
    public GetWebACLRequest clone() {
        return (GetWebACLRequest) super.clone();
    }
}