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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * The output from the ListPrincipalThings operation.
 * </p>
 */
public class ListPrincipalThingsResult implements Serializable, Cloneable {

    /**
     * <p>
     * The things.
     * </p>
     */
    private java.util.List<String> things;
    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @return The things.
     */

    public java.util.List<String> getThings() {
        return things;
    }

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @param things
     *        The things.
     */

    public void setThings(java.util.Collection<String> things) {
        if (things == null) {
            this.things = null;
            return;
        }

        this.things = new java.util.ArrayList<String>(things);
    }

    /**
     * <p>
     * The things.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setThings(java.util.Collection)} or
     * {@link #withThings(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param things
     *        The things.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPrincipalThingsResult withThings(String... things) {
        if (this.things == null) {
            setThings(new java.util.ArrayList<String>(things.length));
        }
        for (String ele : things) {
            this.things.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The things.
     * </p>
     * 
     * @param things
     *        The things.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPrincipalThingsResult withThings(
            java.util.Collection<String> things) {
        setThings(things);
        return this;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @return A token used to retrieve the next value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token used to retrieve the next value.
     * </p>
     * 
     * @param nextToken
     *        A token used to retrieve the next value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListPrincipalThingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getThings() != null)
            sb.append("Things: " + getThings() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListPrincipalThingsResult == false)
            return false;
        ListPrincipalThingsResult other = (ListPrincipalThingsResult) obj;
        if (other.getThings() == null ^ this.getThings() == null)
            return false;
        if (other.getThings() != null
                && other.getThings().equals(this.getThings()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getThings() == null) ? 0 : getThings().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListPrincipalThingsResult clone() {
        try {
            return (ListPrincipalThingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
