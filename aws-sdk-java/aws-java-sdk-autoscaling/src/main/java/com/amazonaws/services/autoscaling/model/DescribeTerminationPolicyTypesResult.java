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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

/**
 * 
 */
public class DescribeTerminationPolicyTypesResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The termination policies supported by Auto Scaling (
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>, and
     * <code>Default</code>).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> terminationPolicyTypes;

    /**
     * <p>
     * The termination policies supported by Auto Scaling (
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>, and
     * <code>Default</code>).
     * </p>
     * 
     * @return The termination policies supported by Auto Scaling (
     *         <code>OldestInstance</code>,
     *         <code>OldestLaunchConfiguration</code>,
     *         <code>NewestInstance</code>,
     *         <code>ClosestToNextInstanceHour</code>, and <code>Default</code>
     *         ).
     */

    public java.util.List<String> getTerminationPolicyTypes() {
        if (terminationPolicyTypes == null) {
            terminationPolicyTypes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return terminationPolicyTypes;
    }

    /**
     * <p>
     * The termination policies supported by Auto Scaling (
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>, and
     * <code>Default</code>).
     * </p>
     * 
     * @param terminationPolicyTypes
     *        The termination policies supported by Auto Scaling (
     *        <code>OldestInstance</code>,
     *        <code>OldestLaunchConfiguration</code>,
     *        <code>NewestInstance</code>,
     *        <code>ClosestToNextInstanceHour</code>, and <code>Default</code>).
     */

    public void setTerminationPolicyTypes(
            java.util.Collection<String> terminationPolicyTypes) {
        if (terminationPolicyTypes == null) {
            this.terminationPolicyTypes = null;
            return;
        }

        this.terminationPolicyTypes = new com.amazonaws.internal.SdkInternalList<String>(
                terminationPolicyTypes);
    }

    /**
     * <p>
     * The termination policies supported by Auto Scaling (
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>, and
     * <code>Default</code>).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTerminationPolicyTypes(java.util.Collection)} or
     * {@link #withTerminationPolicyTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param terminationPolicyTypes
     *        The termination policies supported by Auto Scaling (
     *        <code>OldestInstance</code>,
     *        <code>OldestLaunchConfiguration</code>,
     *        <code>NewestInstance</code>,
     *        <code>ClosestToNextInstanceHour</code>, and <code>Default</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(
            String... terminationPolicyTypes) {
        if (this.terminationPolicyTypes == null) {
            setTerminationPolicyTypes(new com.amazonaws.internal.SdkInternalList<String>(
                    terminationPolicyTypes.length));
        }
        for (String ele : terminationPolicyTypes) {
            this.terminationPolicyTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The termination policies supported by Auto Scaling (
     * <code>OldestInstance</code>, <code>OldestLaunchConfiguration</code>,
     * <code>NewestInstance</code>, <code>ClosestToNextInstanceHour</code>, and
     * <code>Default</code>).
     * </p>
     * 
     * @param terminationPolicyTypes
     *        The termination policies supported by Auto Scaling (
     *        <code>OldestInstance</code>,
     *        <code>OldestLaunchConfiguration</code>,
     *        <code>NewestInstance</code>,
     *        <code>ClosestToNextInstanceHour</code>, and <code>Default</code>).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeTerminationPolicyTypesResult withTerminationPolicyTypes(
            java.util.Collection<String> terminationPolicyTypes) {
        setTerminationPolicyTypes(terminationPolicyTypes);
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
        if (getTerminationPolicyTypes() != null)
            sb.append("TerminationPolicyTypes: " + getTerminationPolicyTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeTerminationPolicyTypesResult == false)
            return false;
        DescribeTerminationPolicyTypesResult other = (DescribeTerminationPolicyTypesResult) obj;
        if (other.getTerminationPolicyTypes() == null
                ^ this.getTerminationPolicyTypes() == null)
            return false;
        if (other.getTerminationPolicyTypes() != null
                && other.getTerminationPolicyTypes().equals(
                        this.getTerminationPolicyTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminationPolicyTypes() == null) ? 0
                        : getTerminationPolicyTypes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeTerminationPolicyTypesResult clone() {
        try {
            return (DescribeTerminationPolicyTypesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
