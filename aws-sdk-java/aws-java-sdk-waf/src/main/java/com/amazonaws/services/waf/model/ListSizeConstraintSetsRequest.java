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
public class ListSizeConstraintSetsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>SizeConstraintSets</code> than the value of <code>Limit</code>, AWS
     * WAF returns a <code>NextMarker</code> value in the response that allows
     * you to list another group of <code>SizeConstraintSets</code>. For the
     * second and subsequent <code>ListSizeConstraintSets</code> requests,
     * specify the value of <code>NextMarker</code> from the previous response
     * to get information about another batch of <code>SizeConstraintSets</code>
     * .
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * Specifies the number of <code>SizeConstraintSet</code> objects that you
     * want AWS WAF to return for this request. If you have more
     * <code>SizeConstraintSets</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>SizeConstraintSet</code>
     * objects.
     * </p>
     */
    private Integer limit;

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>SizeConstraintSets</code> than the value of <code>Limit</code>, AWS
     * WAF returns a <code>NextMarker</code> value in the response that allows
     * you to list another group of <code>SizeConstraintSets</code>. For the
     * second and subsequent <code>ListSizeConstraintSets</code> requests,
     * specify the value of <code>NextMarker</code> from the previous response
     * to get information about another batch of <code>SizeConstraintSets</code>
     * .
     * </p>
     * 
     * @param nextMarker
     *        If you specify a value for <code>Limit</code> and you have more
     *        <code>SizeConstraintSets</code> than the value of
     *        <code>Limit</code>, AWS WAF returns a <code>NextMarker</code>
     *        value in the response that allows you to list another group of
     *        <code>SizeConstraintSets</code>. For the second and subsequent
     *        <code>ListSizeConstraintSets</code> requests, specify the value of
     *        <code>NextMarker</code> from the previous response to get
     *        information about another batch of <code>SizeConstraintSets</code>
     *        .
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>SizeConstraintSets</code> than the value of <code>Limit</code>, AWS
     * WAF returns a <code>NextMarker</code> value in the response that allows
     * you to list another group of <code>SizeConstraintSets</code>. For the
     * second and subsequent <code>ListSizeConstraintSets</code> requests,
     * specify the value of <code>NextMarker</code> from the previous response
     * to get information about another batch of <code>SizeConstraintSets</code>
     * .
     * </p>
     * 
     * @return If you specify a value for <code>Limit</code> and you have more
     *         <code>SizeConstraintSets</code> than the value of
     *         <code>Limit</code>, AWS WAF returns a <code>NextMarker</code>
     *         value in the response that allows you to list another group of
     *         <code>SizeConstraintSets</code>. For the second and subsequent
     *         <code>ListSizeConstraintSets</code> requests, specify the value
     *         of <code>NextMarker</code> from the previous response to get
     *         information about another batch of
     *         <code>SizeConstraintSets</code>.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you specify a value for <code>Limit</code> and you have more
     * <code>SizeConstraintSets</code> than the value of <code>Limit</code>, AWS
     * WAF returns a <code>NextMarker</code> value in the response that allows
     * you to list another group of <code>SizeConstraintSets</code>. For the
     * second and subsequent <code>ListSizeConstraintSets</code> requests,
     * specify the value of <code>NextMarker</code> from the previous response
     * to get information about another batch of <code>SizeConstraintSets</code>
     * .
     * </p>
     * 
     * @param nextMarker
     *        If you specify a value for <code>Limit</code> and you have more
     *        <code>SizeConstraintSets</code> than the value of
     *        <code>Limit</code>, AWS WAF returns a <code>NextMarker</code>
     *        value in the response that allows you to list another group of
     *        <code>SizeConstraintSets</code>. For the second and subsequent
     *        <code>ListSizeConstraintSets</code> requests, specify the value of
     *        <code>NextMarker</code> from the previous response to get
     *        information about another batch of <code>SizeConstraintSets</code>
     *        .
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSizeConstraintSetsRequest withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * Specifies the number of <code>SizeConstraintSet</code> objects that you
     * want AWS WAF to return for this request. If you have more
     * <code>SizeConstraintSets</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>SizeConstraintSet</code>
     * objects.
     * </p>
     * 
     * @param limit
     *        Specifies the number of <code>SizeConstraintSet</code> objects
     *        that you want AWS WAF to return for this request. If you have more
     *        <code>SizeConstraintSets</code> objects than the number you
     *        specify for <code>Limit</code>, the response includes a
     *        <code>NextMarker</code> value that you can use to get another
     *        batch of <code>SizeConstraintSet</code> objects.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Specifies the number of <code>SizeConstraintSet</code> objects that you
     * want AWS WAF to return for this request. If you have more
     * <code>SizeConstraintSets</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>SizeConstraintSet</code>
     * objects.
     * </p>
     * 
     * @return Specifies the number of <code>SizeConstraintSet</code> objects
     *         that you want AWS WAF to return for this request. If you have
     *         more <code>SizeConstraintSets</code> objects than the number you
     *         specify for <code>Limit</code>, the response includes a
     *         <code>NextMarker</code> value that you can use to get another
     *         batch of <code>SizeConstraintSet</code> objects.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Specifies the number of <code>SizeConstraintSet</code> objects that you
     * want AWS WAF to return for this request. If you have more
     * <code>SizeConstraintSets</code> objects than the number you specify for
     * <code>Limit</code>, the response includes a <code>NextMarker</code> value
     * that you can use to get another batch of <code>SizeConstraintSet</code>
     * objects.
     * </p>
     * 
     * @param limit
     *        Specifies the number of <code>SizeConstraintSet</code> objects
     *        that you want AWS WAF to return for this request. If you have more
     *        <code>SizeConstraintSets</code> objects than the number you
     *        specify for <code>Limit</code>, the response includes a
     *        <code>NextMarker</code> value that you can use to get another
     *        batch of <code>SizeConstraintSet</code> objects.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListSizeConstraintSetsRequest withLimit(Integer limit) {
        setLimit(limit);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListSizeConstraintSetsRequest == false)
            return false;
        ListSizeConstraintSetsRequest other = (ListSizeConstraintSetsRequest) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        return hashCode;
    }

    @Override
    public ListSizeConstraintSetsRequest clone() {
        return (ListSizeConstraintSetsRequest) super.clone();
    }
}