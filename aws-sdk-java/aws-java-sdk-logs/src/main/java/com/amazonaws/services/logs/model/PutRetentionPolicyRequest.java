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

package com.amazonaws.services.logs.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class PutRetentionPolicyRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the log group to associate the retention policy with.
     * </p>
     */
    private String logGroupName;

    private Integer retentionInDays;

    /**
     * Default constructor for PutRetentionPolicyRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public PutRetentionPolicyRequest() {
    }

    /**
     * Constructs a new PutRetentionPolicyRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param logGroupName
     *        The name of the log group to associate the retention policy with.
     * @param retentionInDays
     */
    public PutRetentionPolicyRequest(String logGroupName,
            Integer retentionInDays) {
        setLogGroupName(logGroupName);
        setRetentionInDays(retentionInDays);
    }

    /**
     * <p>
     * The name of the log group to associate the retention policy with.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to associate the retention policy with.
     */

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    /**
     * <p>
     * The name of the log group to associate the retention policy with.
     * </p>
     * 
     * @return The name of the log group to associate the retention policy with.
     */

    public String getLogGroupName() {
        return this.logGroupName;
    }

    /**
     * <p>
     * The name of the log group to associate the retention policy with.
     * </p>
     * 
     * @param logGroupName
     *        The name of the log group to associate the retention policy with.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutRetentionPolicyRequest withLogGroupName(String logGroupName) {
        setLogGroupName(logGroupName);
        return this;
    }

    /**
     * @param retentionInDays
     */

    public void setRetentionInDays(Integer retentionInDays) {
        this.retentionInDays = retentionInDays;
    }

    /**
     * @return
     */

    public Integer getRetentionInDays() {
        return this.retentionInDays;
    }

    /**
     * @param retentionInDays
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutRetentionPolicyRequest withRetentionInDays(Integer retentionInDays) {
        setRetentionInDays(retentionInDays);
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
        if (getLogGroupName() != null)
            sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getRetentionInDays() != null)
            sb.append("RetentionInDays: " + getRetentionInDays());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRetentionPolicyRequest == false)
            return false;
        PutRetentionPolicyRequest other = (PutRetentionPolicyRequest) obj;
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null)
            return false;
        if (other.getLogGroupName() != null
                && other.getLogGroupName().equals(this.getLogGroupName()) == false)
            return false;
        if (other.getRetentionInDays() == null
                ^ this.getRetentionInDays() == null)
            return false;
        if (other.getRetentionInDays() != null
                && other.getRetentionInDays().equals(this.getRetentionInDays()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLogGroupName() == null) ? 0 : getLogGroupName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRetentionInDays() == null) ? 0 : getRetentionInDays()
                        .hashCode());
        return hashCode;
    }

    @Override
    public PutRetentionPolicyRequest clone() {
        return (PutRetentionPolicyRequest) super.clone();
    }
}