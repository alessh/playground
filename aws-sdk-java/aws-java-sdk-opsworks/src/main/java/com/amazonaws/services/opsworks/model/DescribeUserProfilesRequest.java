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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeUserProfilesRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * An array of IAM user ARNs that identify the users to be described.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> iamUserArns;

    /**
     * <p>
     * An array of IAM user ARNs that identify the users to be described.
     * </p>
     * 
     * @return An array of IAM user ARNs that identify the users to be
     *         described.
     */

    public java.util.List<String> getIamUserArns() {
        if (iamUserArns == null) {
            iamUserArns = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return iamUserArns;
    }

    /**
     * <p>
     * An array of IAM user ARNs that identify the users to be described.
     * </p>
     * 
     * @param iamUserArns
     *        An array of IAM user ARNs that identify the users to be described.
     */

    public void setIamUserArns(java.util.Collection<String> iamUserArns) {
        if (iamUserArns == null) {
            this.iamUserArns = null;
            return;
        }

        this.iamUserArns = new com.amazonaws.internal.SdkInternalList<String>(
                iamUserArns);
    }

    /**
     * <p>
     * An array of IAM user ARNs that identify the users to be described.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setIamUserArns(java.util.Collection)} or
     * {@link #withIamUserArns(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param iamUserArns
     *        An array of IAM user ARNs that identify the users to be described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeUserProfilesRequest withIamUserArns(String... iamUserArns) {
        if (this.iamUserArns == null) {
            setIamUserArns(new com.amazonaws.internal.SdkInternalList<String>(
                    iamUserArns.length));
        }
        for (String ele : iamUserArns) {
            this.iamUserArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of IAM user ARNs that identify the users to be described.
     * </p>
     * 
     * @param iamUserArns
     *        An array of IAM user ARNs that identify the users to be described.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeUserProfilesRequest withIamUserArns(
            java.util.Collection<String> iamUserArns) {
        setIamUserArns(iamUserArns);
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
        if (getIamUserArns() != null)
            sb.append("IamUserArns: " + getIamUserArns());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUserProfilesRequest == false)
            return false;
        DescribeUserProfilesRequest other = (DescribeUserProfilesRequest) obj;
        if (other.getIamUserArns() == null ^ this.getIamUserArns() == null)
            return false;
        if (other.getIamUserArns() != null
                && other.getIamUserArns().equals(this.getIamUserArns()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getIamUserArns() == null) ? 0 : getIamUserArns().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUserProfilesRequest clone() {
        return (DescribeUserProfilesRequest) super.clone();
    }
}