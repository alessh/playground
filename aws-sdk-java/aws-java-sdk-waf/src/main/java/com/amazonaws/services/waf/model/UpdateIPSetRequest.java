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
public class UpdateIPSetRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     */
    private String iPSetId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code></li>
     * <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     * <code>Value</code></li>
     * </ul>
     */
    private java.util.List<IPSetUpdate> updates;

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *        update. <code>IPSetId</code> is returned by <a>CreateIPSet</a> and
     *        by <a>ListIPSets</a>.
     */

    public void setIPSetId(String iPSetId) {
        this.iPSetId = iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @return The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *         update. <code>IPSetId</code> is returned by <a>CreateIPSet</a>
     *         and by <a>ListIPSets</a>.
     */

    public String getIPSetId() {
        return this.iPSetId;
    }

    /**
     * <p>
     * The <code>IPSetId</code> of the <a>IPSet</a> that you want to update.
     * <code>IPSetId</code> is returned by <a>CreateIPSet</a> and by
     * <a>ListIPSets</a>.
     * </p>
     * 
     * @param iPSetId
     *        The <code>IPSetId</code> of the <a>IPSet</a> that you want to
     *        update. <code>IPSetId</code> is returned by <a>CreateIPSet</a> and
     *        by <a>ListIPSets</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIPSetRequest withIPSetId(String iPSetId) {
        setIPSetId(iPSetId);
        return this;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to
     *        <a>GetChangeToken</a>.
     */

    public void setChangeToken(String changeToken) {
        this.changeToken = changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @return The value returned by the most recent call to
     *         <a>GetChangeToken</a>.
     */

    public String getChangeToken() {
        return this.changeToken;
    }

    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     * 
     * @param changeToken
     *        The value returned by the most recent call to
     *        <a>GetChangeToken</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIPSetRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code></li>
     * <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     * <code>Value</code></li>
     * </ul>
     * 
     * @return An array of <code>IPSetUpdate</code> objects that you want to
     *         insert into or delete from an <a>IPSet</a>. For more information,
     *         see the applicable data types:</p>
     *         <ul>
     *         <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     *         <code>IPSetDescriptor</code></li>
     *         <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *         <code>Value</code></li>
     */

    public java.util.List<IPSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code></li>
     * <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     * <code>Value</code></li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>IPSetUpdate</code> objects that you want to
     *        insert into or delete from an <a>IPSet</a>. For more information,
     *        see the applicable data types:</p>
     *        <ul>
     *        <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     *        <code>IPSetDescriptor</code></li>
     *        <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *        <code>Value</code></li>
     */

    public void setUpdates(java.util.Collection<IPSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<IPSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code></li>
     * <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     * <code>Value</code></li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUpdates(java.util.Collection)} or
     * {@link #withUpdates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>IPSetUpdate</code> objects that you want to
     *        insert into or delete from an <a>IPSet</a>. For more information,
     *        see the applicable data types:</p>
     *        <ul>
     *        <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     *        <code>IPSetDescriptor</code></li>
     *        <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *        <code>Value</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIPSetRequest withUpdates(IPSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<IPSetUpdate>(updates.length));
        }
        for (IPSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>IPSetUpdate</code> objects that you want to insert into
     * or delete from an <a>IPSet</a>. For more information, see the applicable
     * data types:
     * </p>
     * <ul>
     * <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     * <code>IPSetDescriptor</code></li>
     * <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     * <code>Value</code></li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>IPSetUpdate</code> objects that you want to
     *        insert into or delete from an <a>IPSet</a>. For more information,
     *        see the applicable data types:</p>
     *        <ul>
     *        <li><a>IPSetUpdate</a>: Contains <code>Action</code> and
     *        <code>IPSetDescriptor</code></li>
     *        <li><a>IPSetDescriptor</a>: Contains <code>Type</code> and
     *        <code>Value</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateIPSetRequest withUpdates(
            java.util.Collection<IPSetUpdate> updates) {
        setUpdates(updates);
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
        if (getIPSetId() != null)
            sb.append("IPSetId: " + getIPSetId() + ",");
        if (getChangeToken() != null)
            sb.append("ChangeToken: " + getChangeToken() + ",");
        if (getUpdates() != null)
            sb.append("Updates: " + getUpdates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateIPSetRequest == false)
            return false;
        UpdateIPSetRequest other = (UpdateIPSetRequest) obj;
        if (other.getIPSetId() == null ^ this.getIPSetId() == null)
            return false;
        if (other.getIPSetId() != null
                && other.getIPSetId().equals(this.getIPSetId()) == false)
            return false;
        if (other.getChangeToken() == null ^ this.getChangeToken() == null)
            return false;
        if (other.getChangeToken() != null
                && other.getChangeToken().equals(this.getChangeToken()) == false)
            return false;
        if (other.getUpdates() == null ^ this.getUpdates() == null)
            return false;
        if (other.getUpdates() != null
                && other.getUpdates().equals(this.getUpdates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIPSetId() == null) ? 0 : getIPSetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode
                + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateIPSetRequest clone() {
        return (UpdateIPSetRequest) super.clone();
    }
}