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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeAccountAttributesResult implements Serializable, Cloneable {

    /**
     * <p>
     * Information about one or more account attributes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AccountAttribute> accountAttributes;

    /**
     * <p>
     * Information about one or more account attributes.
     * </p>
     * 
     * @return Information about one or more account attributes.
     */

    public java.util.List<AccountAttribute> getAccountAttributes() {
        if (accountAttributes == null) {
            accountAttributes = new com.amazonaws.internal.SdkInternalList<AccountAttribute>();
        }
        return accountAttributes;
    }

    /**
     * <p>
     * Information about one or more account attributes.
     * </p>
     * 
     * @param accountAttributes
     *        Information about one or more account attributes.
     */

    public void setAccountAttributes(
            java.util.Collection<AccountAttribute> accountAttributes) {
        if (accountAttributes == null) {
            this.accountAttributes = null;
            return;
        }

        this.accountAttributes = new com.amazonaws.internal.SdkInternalList<AccountAttribute>(
                accountAttributes);
    }

    /**
     * <p>
     * Information about one or more account attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAccountAttributes(java.util.Collection)} or
     * {@link #withAccountAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param accountAttributes
     *        Information about one or more account attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAccountAttributesResult withAccountAttributes(
            AccountAttribute... accountAttributes) {
        if (this.accountAttributes == null) {
            setAccountAttributes(new com.amazonaws.internal.SdkInternalList<AccountAttribute>(
                    accountAttributes.length));
        }
        for (AccountAttribute ele : accountAttributes) {
            this.accountAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about one or more account attributes.
     * </p>
     * 
     * @param accountAttributes
     *        Information about one or more account attributes.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAccountAttributesResult withAccountAttributes(
            java.util.Collection<AccountAttribute> accountAttributes) {
        setAccountAttributes(accountAttributes);
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
        if (getAccountAttributes() != null)
            sb.append("AccountAttributes: " + getAccountAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAccountAttributesResult == false)
            return false;
        DescribeAccountAttributesResult other = (DescribeAccountAttributesResult) obj;
        if (other.getAccountAttributes() == null
                ^ this.getAccountAttributes() == null)
            return false;
        if (other.getAccountAttributes() != null
                && other.getAccountAttributes().equals(
                        this.getAccountAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAccountAttributes() == null) ? 0
                        : getAccountAttributes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAccountAttributesResult clone() {
        try {
            return (DescribeAccountAttributesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}