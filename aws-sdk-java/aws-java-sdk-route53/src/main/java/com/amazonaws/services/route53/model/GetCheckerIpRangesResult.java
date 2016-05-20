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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains the <code>CheckerIpRanges</code> element.
 * </p>
 */
public class GetCheckerIpRangesResult implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains sorted list of IP ranges in CIDR format for
     * Amazon Route 53 health checkers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> checkerIpRanges;

    /**
     * <p>
     * A complex type that contains sorted list of IP ranges in CIDR format for
     * Amazon Route 53 health checkers.
     * </p>
     * 
     * @return A complex type that contains sorted list of IP ranges in CIDR
     *         format for Amazon Route 53 health checkers.
     */

    public java.util.List<String> getCheckerIpRanges() {
        if (checkerIpRanges == null) {
            checkerIpRanges = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return checkerIpRanges;
    }

    /**
     * <p>
     * A complex type that contains sorted list of IP ranges in CIDR format for
     * Amazon Route 53 health checkers.
     * </p>
     * 
     * @param checkerIpRanges
     *        A complex type that contains sorted list of IP ranges in CIDR
     *        format for Amazon Route 53 health checkers.
     */

    public void setCheckerIpRanges(java.util.Collection<String> checkerIpRanges) {
        if (checkerIpRanges == null) {
            this.checkerIpRanges = null;
            return;
        }

        this.checkerIpRanges = new com.amazonaws.internal.SdkInternalList<String>(
                checkerIpRanges);
    }

    /**
     * <p>
     * A complex type that contains sorted list of IP ranges in CIDR format for
     * Amazon Route 53 health checkers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setCheckerIpRanges(java.util.Collection)} or
     * {@link #withCheckerIpRanges(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param checkerIpRanges
     *        A complex type that contains sorted list of IP ranges in CIDR
     *        format for Amazon Route 53 health checkers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCheckerIpRangesResult withCheckerIpRanges(
            String... checkerIpRanges) {
        if (this.checkerIpRanges == null) {
            setCheckerIpRanges(new com.amazonaws.internal.SdkInternalList<String>(
                    checkerIpRanges.length));
        }
        for (String ele : checkerIpRanges) {
            this.checkerIpRanges.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains sorted list of IP ranges in CIDR format for
     * Amazon Route 53 health checkers.
     * </p>
     * 
     * @param checkerIpRanges
     *        A complex type that contains sorted list of IP ranges in CIDR
     *        format for Amazon Route 53 health checkers.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetCheckerIpRangesResult withCheckerIpRanges(
            java.util.Collection<String> checkerIpRanges) {
        setCheckerIpRanges(checkerIpRanges);
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
        if (getCheckerIpRanges() != null)
            sb.append("CheckerIpRanges: " + getCheckerIpRanges());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCheckerIpRangesResult == false)
            return false;
        GetCheckerIpRangesResult other = (GetCheckerIpRangesResult) obj;
        if (other.getCheckerIpRanges() == null
                ^ this.getCheckerIpRanges() == null)
            return false;
        if (other.getCheckerIpRanges() != null
                && other.getCheckerIpRanges().equals(this.getCheckerIpRanges()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getCheckerIpRanges() == null) ? 0 : getCheckerIpRanges()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GetCheckerIpRangesResult clone() {
        try {
            return (GetCheckerIpRangesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
