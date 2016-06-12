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
public class PutDestinationRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A name for the destination.
     * </p>
     */
    private String destinationName;
    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * </p>
     */
    private String targetArn;
    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to do
     * Amazon Kinesis PutRecord requests on the desitnation stream.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @param destinationName
     *        A name for the destination.
     */

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @return A name for the destination.
     */

    public String getDestinationName() {
        return this.destinationName;
    }

    /**
     * <p>
     * A name for the destination.
     * </p>
     * 
     * @param destinationName
     *        A name for the destination.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutDestinationRequest withDestinationName(String destinationName) {
        setDestinationName(destinationName);
        return this;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * </p>
     * 
     * @param targetArn
     *        The ARN of an Amazon Kinesis stream to deliver matching log events
     *        to.
     */

    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * </p>
     * 
     * @return The ARN of an Amazon Kinesis stream to deliver matching log
     *         events to.
     */

    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * <p>
     * The ARN of an Amazon Kinesis stream to deliver matching log events to.
     * </p>
     * 
     * @param targetArn
     *        The ARN of an Amazon Kinesis stream to deliver matching log events
     *        to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutDestinationRequest withTargetArn(String targetArn) {
        setTargetArn(targetArn);
        return this;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to do
     * Amazon Kinesis PutRecord requests on the desitnation stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to
     *        do Amazon Kinesis PutRecord requests on the desitnation stream.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to do
     * Amazon Kinesis PutRecord requests on the desitnation stream.
     * </p>
     * 
     * @return The ARN of an IAM role that grants CloudWatch Logs permissions to
     *         do Amazon Kinesis PutRecord requests on the desitnation stream.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of an IAM role that grants CloudWatch Logs permissions to do
     * Amazon Kinesis PutRecord requests on the desitnation stream.
     * </p>
     * 
     * @param roleArn
     *        The ARN of an IAM role that grants CloudWatch Logs permissions to
     *        do Amazon Kinesis PutRecord requests on the desitnation stream.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public PutDestinationRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getDestinationName() != null)
            sb.append("DestinationName: " + getDestinationName() + ",");
        if (getTargetArn() != null)
            sb.append("TargetArn: " + getTargetArn() + ",");
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutDestinationRequest == false)
            return false;
        PutDestinationRequest other = (PutDestinationRequest) obj;
        if (other.getDestinationName() == null
                ^ this.getDestinationName() == null)
            return false;
        if (other.getDestinationName() != null
                && other.getDestinationName().equals(this.getDestinationName()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null
                && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDestinationName() == null) ? 0 : getDestinationName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        hashCode = prime * hashCode
                + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public PutDestinationRequest clone() {
        return (PutDestinationRequest) super.clone();
    }
}