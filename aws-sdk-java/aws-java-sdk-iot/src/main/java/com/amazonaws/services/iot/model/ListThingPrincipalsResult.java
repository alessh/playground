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
 * The output from the ListThingPrincipals operation.
 * </p>
 */
public class ListThingPrincipalsResult implements Serializable, Cloneable {

    /**
     * <p>
     * The principals.
     * </p>
     */
    private java.util.List<String> principals;

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @return The principals.
     */

    public java.util.List<String> getPrincipals() {
        return principals;
    }

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @param principals
     *        The principals.
     */

    public void setPrincipals(java.util.Collection<String> principals) {
        if (principals == null) {
            this.principals = null;
            return;
        }

        this.principals = new java.util.ArrayList<String>(principals);
    }

    /**
     * <p>
     * The principals.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrincipals(java.util.Collection)} or
     * {@link #withPrincipals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param principals
     *        The principals.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListThingPrincipalsResult withPrincipals(String... principals) {
        if (this.principals == null) {
            setPrincipals(new java.util.ArrayList<String>(principals.length));
        }
        for (String ele : principals) {
            this.principals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The principals.
     * </p>
     * 
     * @param principals
     *        The principals.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListThingPrincipalsResult withPrincipals(
            java.util.Collection<String> principals) {
        setPrincipals(principals);
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
        if (getPrincipals() != null)
            sb.append("Principals: " + getPrincipals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListThingPrincipalsResult == false)
            return false;
        ListThingPrincipalsResult other = (ListThingPrincipalsResult) obj;
        if (other.getPrincipals() == null ^ this.getPrincipals() == null)
            return false;
        if (other.getPrincipals() != null
                && other.getPrincipals().equals(this.getPrincipals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPrincipals() == null) ? 0 : getPrincipals().hashCode());
        return hashCode;
    }

    @Override
    public ListThingPrincipalsResult clone() {
        try {
            return (ListThingPrincipalsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
