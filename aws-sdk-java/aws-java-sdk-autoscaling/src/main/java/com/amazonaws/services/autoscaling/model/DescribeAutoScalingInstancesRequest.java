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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAutoScalingInstancesRequest extends
        AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If you
     * specify an ID that does not exist, it is ignored with no error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> instanceIds;
    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     */
    private Integer maxRecords;
    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If you
     * specify an ID that does not exist, it is ignored with no error.
     * </p>
     * 
     * @return One or more Auto Scaling instances to describe, up to 50
     *         instances. If you omit this parameter, all Auto Scaling instances
     *         are described. If you specify an ID that does not exist, it is
     *         ignored with no error.
     */

    public java.util.List<String> getInstanceIds() {
        if (instanceIds == null) {
            instanceIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return instanceIds;
    }

    /**
     * <p>
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If you
     * specify an ID that does not exist, it is ignored with no error.
     * </p>
     * 
     * @param instanceIds
     *        One or more Auto Scaling instances to describe, up to 50
     *        instances. If you omit this parameter, all Auto Scaling instances
     *        are described. If you specify an ID that does not exist, it is
     *        ignored with no error.
     */

    public void setInstanceIds(java.util.Collection<String> instanceIds) {
        if (instanceIds == null) {
            this.instanceIds = null;
            return;
        }

        this.instanceIds = new com.amazonaws.internal.SdkInternalList<String>(
                instanceIds);
    }

    /**
     * <p>
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If you
     * specify an ID that does not exist, it is ignored with no error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setInstanceIds(java.util.Collection)} or
     * {@link #withInstanceIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param instanceIds
     *        One or more Auto Scaling instances to describe, up to 50
     *        instances. If you omit this parameter, all Auto Scaling instances
     *        are described. If you specify an ID that does not exist, it is
     *        ignored with no error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAutoScalingInstancesRequest withInstanceIds(
            String... instanceIds) {
        if (this.instanceIds == null) {
            setInstanceIds(new com.amazonaws.internal.SdkInternalList<String>(
                    instanceIds.length));
        }
        for (String ele : instanceIds) {
            this.instanceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more Auto Scaling instances to describe, up to 50 instances. If
     * you omit this parameter, all Auto Scaling instances are described. If you
     * specify an ID that does not exist, it is ignored with no error.
     * </p>
     * 
     * @param instanceIds
     *        One or more Auto Scaling instances to describe, up to 50
     *        instances. If you omit this parameter, all Auto Scaling instances
     *        are described. If you specify an ID that does not exist, it is
     *        ignored with no error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAutoScalingInstancesRequest withInstanceIds(
            java.util.Collection<String> instanceIds) {
        setInstanceIds(instanceIds);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call.
     */

    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @return The maximum number of items to return with this call.
     */

    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * <p>
     * The maximum number of items to return with this call.
     * </p>
     * 
     * @param maxRecords
     *        The maximum number of items to return with this call.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAutoScalingInstancesRequest withMaxRecords(Integer maxRecords) {
        setMaxRecords(maxRecords);
        return this;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @return The token for the next set of items to return. (You received this
     *         token from a previous call.)
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The token for the next set of items to return. (You received this token
     * from a previous call.)
     * </p>
     * 
     * @param nextToken
     *        The token for the next set of items to return. (You received this
     *        token from a previous call.)
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeAutoScalingInstancesRequest withNextToken(String nextToken) {
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
        if (getInstanceIds() != null)
            sb.append("InstanceIds: " + getInstanceIds() + ",");
        if (getMaxRecords() != null)
            sb.append("MaxRecords: " + getMaxRecords() + ",");
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

        if (obj instanceof DescribeAutoScalingInstancesRequest == false)
            return false;
        DescribeAutoScalingInstancesRequest other = (DescribeAutoScalingInstancesRequest) obj;
        if (other.getInstanceIds() == null ^ this.getInstanceIds() == null)
            return false;
        if (other.getInstanceIds() != null
                && other.getInstanceIds().equals(this.getInstanceIds()) == false)
            return false;
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null)
            return false;
        if (other.getMaxRecords() != null
                && other.getMaxRecords().equals(this.getMaxRecords()) == false)
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

        hashCode = prime
                * hashCode
                + ((getInstanceIds() == null) ? 0 : getInstanceIds().hashCode());
        hashCode = prime * hashCode
                + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAutoScalingInstancesRequest clone() {
        return (DescribeAutoScalingInstancesRequest) super.clone();
    }
}