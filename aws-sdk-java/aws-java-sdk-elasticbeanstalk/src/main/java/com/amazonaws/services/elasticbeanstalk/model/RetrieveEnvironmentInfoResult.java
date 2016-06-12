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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * Result message containing a description of the requested environment info.
 * </p>
 */
public class RetrieveEnvironmentInfoResult implements Serializable, Cloneable {

    /**
     * <p>
     * The <a>EnvironmentInfoDescription</a> of the environment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EnvironmentInfoDescription> environmentInfo;

    /**
     * <p>
     * The <a>EnvironmentInfoDescription</a> of the environment.
     * </p>
     * 
     * @return The <a>EnvironmentInfoDescription</a> of the environment.
     */

    public java.util.List<EnvironmentInfoDescription> getEnvironmentInfo() {
        if (environmentInfo == null) {
            environmentInfo = new com.amazonaws.internal.SdkInternalList<EnvironmentInfoDescription>();
        }
        return environmentInfo;
    }

    /**
     * <p>
     * The <a>EnvironmentInfoDescription</a> of the environment.
     * </p>
     * 
     * @param environmentInfo
     *        The <a>EnvironmentInfoDescription</a> of the environment.
     */

    public void setEnvironmentInfo(
            java.util.Collection<EnvironmentInfoDescription> environmentInfo) {
        if (environmentInfo == null) {
            this.environmentInfo = null;
            return;
        }

        this.environmentInfo = new com.amazonaws.internal.SdkInternalList<EnvironmentInfoDescription>(
                environmentInfo);
    }

    /**
     * <p>
     * The <a>EnvironmentInfoDescription</a> of the environment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setEnvironmentInfo(java.util.Collection)} or
     * {@link #withEnvironmentInfo(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param environmentInfo
     *        The <a>EnvironmentInfoDescription</a> of the environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RetrieveEnvironmentInfoResult withEnvironmentInfo(
            EnvironmentInfoDescription... environmentInfo) {
        if (this.environmentInfo == null) {
            setEnvironmentInfo(new com.amazonaws.internal.SdkInternalList<EnvironmentInfoDescription>(
                    environmentInfo.length));
        }
        for (EnvironmentInfoDescription ele : environmentInfo) {
            this.environmentInfo.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <a>EnvironmentInfoDescription</a> of the environment.
     * </p>
     * 
     * @param environmentInfo
     *        The <a>EnvironmentInfoDescription</a> of the environment.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RetrieveEnvironmentInfoResult withEnvironmentInfo(
            java.util.Collection<EnvironmentInfoDescription> environmentInfo) {
        setEnvironmentInfo(environmentInfo);
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
        if (getEnvironmentInfo() != null)
            sb.append("EnvironmentInfo: " + getEnvironmentInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrieveEnvironmentInfoResult == false)
            return false;
        RetrieveEnvironmentInfoResult other = (RetrieveEnvironmentInfoResult) obj;
        if (other.getEnvironmentInfo() == null
                ^ this.getEnvironmentInfo() == null)
            return false;
        if (other.getEnvironmentInfo() != null
                && other.getEnvironmentInfo().equals(this.getEnvironmentInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnvironmentInfo() == null) ? 0 : getEnvironmentInfo()
                        .hashCode());
        return hashCode;
    }

    @Override
    public RetrieveEnvironmentInfoResult clone() {
        try {
            return (RetrieveEnvironmentInfoResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
