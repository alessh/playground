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
public class UpdateSizeConstraintSetRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     */
    private String sizeConstraintSetId;
    /**
     * <p>
     * The value returned by the most recent call to <a>GetChangeToken</a>.
     * </p>
     */
    private String changeToken;
    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code></li>
     * <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     */
    private java.util.List<SizeConstraintSetUpdate> updates;

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        The <code>SizeConstraintSetId</code> of the
     *        <a>SizeConstraintSet</a> that you want to update.
     *        <code>SizeConstraintSetId</code> is returned by
     *        <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     */

    public void setSizeConstraintSetId(String sizeConstraintSetId) {
        this.sizeConstraintSetId = sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @return The <code>SizeConstraintSetId</code> of the
     *         <a>SizeConstraintSet</a> that you want to update.
     *         <code>SizeConstraintSetId</code> is returned by
     *         <a>CreateSizeConstraintSet</a> and by
     *         <a>ListSizeConstraintSets</a>.
     */

    public String getSizeConstraintSetId() {
        return this.sizeConstraintSetId;
    }

    /**
     * <p>
     * The <code>SizeConstraintSetId</code> of the <a>SizeConstraintSet</a> that
     * you want to update. <code>SizeConstraintSetId</code> is returned by
     * <a>CreateSizeConstraintSet</a> and by <a>ListSizeConstraintSets</a>.
     * </p>
     * 
     * @param sizeConstraintSetId
     *        The <code>SizeConstraintSetId</code> of the
     *        <a>SizeConstraintSet</a> that you want to update.
     *        <code>SizeConstraintSetId</code> is returned by
     *        <a>CreateSizeConstraintSet</a> and by
     *        <a>ListSizeConstraintSets</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateSizeConstraintSetRequest withSizeConstraintSetId(
            String sizeConstraintSetId) {
        setSizeConstraintSetId(sizeConstraintSetId);
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

    public UpdateSizeConstraintSetRequest withChangeToken(String changeToken) {
        setChangeToken(changeToken);
        return this;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code></li>
     * <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @return An array of <code>SizeConstraintSetUpdate</code> objects that you
     *         want to insert into or delete from a <a>SizeConstraintSet</a>.
     *         For more information, see the applicable data types:</p>
     *         <ul>
     *         <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *         and <code>SizeConstraint</code></li>
     *         <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *         <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *         and <code>Size</code></li>
     *         <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *         <code>Type</code></li>
     */

    public java.util.List<SizeConstraintSetUpdate> getUpdates() {
        return updates;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code></li>
     * <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>SizeConstraintSetUpdate</code> objects that you
     *        want to insert into or delete from a <a>SizeConstraintSet</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *        and <code>SizeConstraint</code></li>
     *        <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *        <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *        and <code>Size</code></li>
     *        <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *        <code>Type</code></li>
     */

    public void setUpdates(java.util.Collection<SizeConstraintSetUpdate> updates) {
        if (updates == null) {
            this.updates = null;
            return;
        }

        this.updates = new java.util.ArrayList<SizeConstraintSetUpdate>(updates);
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code></li>
     * <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setUpdates(java.util.Collection)} or
     * {@link #withUpdates(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param updates
     *        An array of <code>SizeConstraintSetUpdate</code> objects that you
     *        want to insert into or delete from a <a>SizeConstraintSet</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *        and <code>SizeConstraint</code></li>
     *        <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *        <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *        and <code>Size</code></li>
     *        <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *        <code>Type</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateSizeConstraintSetRequest withUpdates(
            SizeConstraintSetUpdate... updates) {
        if (this.updates == null) {
            setUpdates(new java.util.ArrayList<SizeConstraintSetUpdate>(
                    updates.length));
        }
        for (SizeConstraintSetUpdate ele : updates) {
            this.updates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <code>SizeConstraintSetUpdate</code> objects that you want to
     * insert into or delete from a <a>SizeConstraintSet</a>. For more
     * information, see the applicable data types:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code> and
     * <code>SizeConstraint</code></li>
     * <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     * <code>TextTransformation</code>, <code>ComparisonOperator</code>, and
     * <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @param updates
     *        An array of <code>SizeConstraintSetUpdate</code> objects that you
     *        want to insert into or delete from a <a>SizeConstraintSet</a>. For
     *        more information, see the applicable data types:</p>
     *        <ul>
     *        <li><a>SizeConstraintSetUpdate</a>: Contains <code>Action</code>
     *        and <code>SizeConstraint</code></li>
     *        <li><a>SizeConstraint</a>: Contains <code>FieldToMatch</code>,
     *        <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *        and <code>Size</code></li>
     *        <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *        <code>Type</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateSizeConstraintSetRequest withUpdates(
            java.util.Collection<SizeConstraintSetUpdate> updates) {
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
        if (getSizeConstraintSetId() != null)
            sb.append("SizeConstraintSetId: " + getSizeConstraintSetId() + ",");
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

        if (obj instanceof UpdateSizeConstraintSetRequest == false)
            return false;
        UpdateSizeConstraintSetRequest other = (UpdateSizeConstraintSetRequest) obj;
        if (other.getSizeConstraintSetId() == null
                ^ this.getSizeConstraintSetId() == null)
            return false;
        if (other.getSizeConstraintSetId() != null
                && other.getSizeConstraintSetId().equals(
                        this.getSizeConstraintSetId()) == false)
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

        hashCode = prime
                * hashCode
                + ((getSizeConstraintSetId() == null) ? 0
                        : getSizeConstraintSetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getChangeToken() == null) ? 0 : getChangeToken().hashCode());
        hashCode = prime * hashCode
                + ((getUpdates() == null) ? 0 : getUpdates().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSizeConstraintSetRequest clone() {
        return (UpdateSizeConstraintSetRequest) super.clone();
    }
}