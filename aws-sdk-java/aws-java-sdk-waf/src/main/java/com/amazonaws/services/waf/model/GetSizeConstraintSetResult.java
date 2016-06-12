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

/**
 * 
 */
public class GetSizeConstraintSetResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the
     * <code>GetSizeConstraintSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>,
     * <code>SizeConstraints</code>, and <code>Name</code></li>
     * <li><code>SizeConstraints</code>: Contains an array of
     * <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code> object
     * contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     */
    private SizeConstraintSet sizeConstraintSet;

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the
     * <code>GetSizeConstraintSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>,
     * <code>SizeConstraints</code>, and <code>Name</code></li>
     * <li><code>SizeConstraints</code>: Contains an array of
     * <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code> object
     * contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @param sizeConstraintSet
     *        Information about the <a>SizeConstraintSet</a> that you specified
     *        in the <code>GetSizeConstraintSet</code> request. For more
     *        information, see the following topics:</p>
     *        <ul>
     *        <li><a>SizeConstraintSet</a>: Contains
     *        <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>,
     *        and <code>Name</code></li>
     *        <li><code>SizeConstraints</code>: Contains an array of
     *        <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code>
     *        object contains <a>FieldToMatch</a>,
     *        <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *        and <code>Size</code></li>
     *        <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *        <code>Type</code></li>
     */

    public void setSizeConstraintSet(SizeConstraintSet sizeConstraintSet) {
        this.sizeConstraintSet = sizeConstraintSet;
    }

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the
     * <code>GetSizeConstraintSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>,
     * <code>SizeConstraints</code>, and <code>Name</code></li>
     * <li><code>SizeConstraints</code>: Contains an array of
     * <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code> object
     * contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @return Information about the <a>SizeConstraintSet</a> that you specified
     *         in the <code>GetSizeConstraintSet</code> request. For more
     *         information, see the following topics:</p>
     *         <ul>
     *         <li><a>SizeConstraintSet</a>: Contains
     *         <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>,
     *         and <code>Name</code></li>
     *         <li><code>SizeConstraints</code>: Contains an array of
     *         <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code>
     *         object contains <a>FieldToMatch</a>,
     *         <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *         and <code>Size</code></li>
     *         <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *         <code>Type</code></li>
     */

    public SizeConstraintSet getSizeConstraintSet() {
        return this.sizeConstraintSet;
    }

    /**
     * <p>
     * Information about the <a>SizeConstraintSet</a> that you specified in the
     * <code>GetSizeConstraintSet</code> request. For more information, see the
     * following topics:
     * </p>
     * <ul>
     * <li><a>SizeConstraintSet</a>: Contains <code>SizeConstraintSetId</code>,
     * <code>SizeConstraints</code>, and <code>Name</code></li>
     * <li><code>SizeConstraints</code>: Contains an array of
     * <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code> object
     * contains <a>FieldToMatch</a>, <code>TextTransformation</code>,
     * <code>ComparisonOperator</code>, and <code>Size</code></li>
     * <li><a>FieldToMatch</a>: Contains <code>Data</code> and <code>Type</code>
     * </li>
     * </ul>
     * 
     * @param sizeConstraintSet
     *        Information about the <a>SizeConstraintSet</a> that you specified
     *        in the <code>GetSizeConstraintSet</code> request. For more
     *        information, see the following topics:</p>
     *        <ul>
     *        <li><a>SizeConstraintSet</a>: Contains
     *        <code>SizeConstraintSetId</code>, <code>SizeConstraints</code>,
     *        and <code>Name</code></li>
     *        <li><code>SizeConstraints</code>: Contains an array of
     *        <a>SizeConstraint</a> objects. Each <code>SizeConstraint</code>
     *        object contains <a>FieldToMatch</a>,
     *        <code>TextTransformation</code>, <code>ComparisonOperator</code>,
     *        and <code>Size</code></li>
     *        <li><a>FieldToMatch</a>: Contains <code>Data</code> and
     *        <code>Type</code></li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetSizeConstraintSetResult withSizeConstraintSet(
            SizeConstraintSet sizeConstraintSet) {
        setSizeConstraintSet(sizeConstraintSet);
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
        if (getSizeConstraintSet() != null)
            sb.append("SizeConstraintSet: " + getSizeConstraintSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSizeConstraintSetResult == false)
            return false;
        GetSizeConstraintSetResult other = (GetSizeConstraintSetResult) obj;
        if (other.getSizeConstraintSet() == null
                ^ this.getSizeConstraintSet() == null)
            return false;
        if (other.getSizeConstraintSet() != null
                && other.getSizeConstraintSet().equals(
                        this.getSizeConstraintSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSizeConstraintSet() == null) ? 0
                        : getSizeConstraintSet().hashCode());
        return hashCode;
    }

    @Override
    public GetSizeConstraintSetResult clone() {
        try {
            return (GetSizeConstraintSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
