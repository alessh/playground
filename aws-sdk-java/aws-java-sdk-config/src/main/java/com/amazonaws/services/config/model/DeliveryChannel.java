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

package com.amazonaws.services.config.model;

import java.io.Serializable;

/**
 * <p>
 * A logical container used for storing the configuration changes of an AWS
 * resource.
 * </p>
 */
public class DeliveryChannel implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name &quot;default&quot; when creating the delivery channel.
     * You cannot change the assigned name.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name of the Amazon S3 bucket used to store configuration history for
     * the delivery channel.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that AWS Config delivers
     * notifications to.
     * </p>
     */
    private String snsTopicARN;

    private ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties;

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name &quot;default&quot; when creating the delivery channel.
     * You cannot change the assigned name.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel. By default, AWS Config
     *        automatically assigns the name &quot;default&quot; when creating
     *        the delivery channel. You cannot change the assigned name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name &quot;default&quot; when creating the delivery channel.
     * You cannot change the assigned name.
     * </p>
     * 
     * @return The name of the delivery channel. By default, AWS Config
     *         automatically assigns the name &quot;default&quot; when creating
     *         the delivery channel. You cannot change the assigned name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the delivery channel. By default, AWS Config automatically
     * assigns the name &quot;default&quot; when creating the delivery channel.
     * You cannot change the assigned name.
     * </p>
     * 
     * @param name
     *        The name of the delivery channel. By default, AWS Config
     *        automatically assigns the name &quot;default&quot; when creating
     *        the delivery channel. You cannot change the assigned name.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeliveryChannel withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used to store configuration history for
     * the delivery channel.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket used to store configuration
     *        history for the delivery channel.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used to store configuration history for
     * the delivery channel.
     * </p>
     * 
     * @return The name of the Amazon S3 bucket used to store configuration
     *         history for the delivery channel.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * The name of the Amazon S3 bucket used to store configuration history for
     * the delivery channel.
     * </p>
     * 
     * @param s3BucketName
     *        The name of the Amazon S3 bucket used to store configuration
     *        history for the delivery channel.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeliveryChannel withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for the specified Amazon S3 bucket.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @return The prefix for the specified Amazon S3 bucket.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * The prefix for the specified Amazon S3 bucket.
     * </p>
     * 
     * @param s3KeyPrefix
     *        The prefix for the specified Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeliveryChannel withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that AWS Config delivers
     * notifications to.
     * </p>
     * 
     * @param snsTopicARN
     *        The Amazon Resource Name (ARN) of the SNS topic that AWS Config
     *        delivers notifications to.
     */

    public void setSnsTopicARN(String snsTopicARN) {
        this.snsTopicARN = snsTopicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that AWS Config delivers
     * notifications to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SNS topic that AWS Config
     *         delivers notifications to.
     */

    public String getSnsTopicARN() {
        return this.snsTopicARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SNS topic that AWS Config delivers
     * notifications to.
     * </p>
     * 
     * @param snsTopicARN
     *        The Amazon Resource Name (ARN) of the SNS topic that AWS Config
     *        delivers notifications to.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeliveryChannel withSnsTopicARN(String snsTopicARN) {
        setSnsTopicARN(snsTopicARN);
        return this;
    }

    /**
     * @param configSnapshotDeliveryProperties
     */

    public void setConfigSnapshotDeliveryProperties(
            ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        this.configSnapshotDeliveryProperties = configSnapshotDeliveryProperties;
    }

    /**
     * @return
     */

    public ConfigSnapshotDeliveryProperties getConfigSnapshotDeliveryProperties() {
        return this.configSnapshotDeliveryProperties;
    }

    /**
     * @param configSnapshotDeliveryProperties
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeliveryChannel withConfigSnapshotDeliveryProperties(
            ConfigSnapshotDeliveryProperties configSnapshotDeliveryProperties) {
        setConfigSnapshotDeliveryProperties(configSnapshotDeliveryProperties);
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getS3BucketName() != null)
            sb.append("S3BucketName: " + getS3BucketName() + ",");
        if (getS3KeyPrefix() != null)
            sb.append("S3KeyPrefix: " + getS3KeyPrefix() + ",");
        if (getSnsTopicARN() != null)
            sb.append("SnsTopicARN: " + getSnsTopicARN() + ",");
        if (getConfigSnapshotDeliveryProperties() != null)
            sb.append("ConfigSnapshotDeliveryProperties: "
                    + getConfigSnapshotDeliveryProperties());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeliveryChannel == false)
            return false;
        DeliveryChannel other = (DeliveryChannel) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getS3BucketName() == null ^ this.getS3BucketName() == null)
            return false;
        if (other.getS3BucketName() != null
                && other.getS3BucketName().equals(this.getS3BucketName()) == false)
            return false;
        if (other.getS3KeyPrefix() == null ^ this.getS3KeyPrefix() == null)
            return false;
        if (other.getS3KeyPrefix() != null
                && other.getS3KeyPrefix().equals(this.getS3KeyPrefix()) == false)
            return false;
        if (other.getSnsTopicARN() == null ^ this.getSnsTopicARN() == null)
            return false;
        if (other.getSnsTopicARN() != null
                && other.getSnsTopicARN().equals(this.getSnsTopicARN()) == false)
            return false;
        if (other.getConfigSnapshotDeliveryProperties() == null
                ^ this.getConfigSnapshotDeliveryProperties() == null)
            return false;
        if (other.getConfigSnapshotDeliveryProperties() != null
                && other.getConfigSnapshotDeliveryProperties().equals(
                        this.getConfigSnapshotDeliveryProperties()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime
                * hashCode
                + ((getS3BucketName() == null) ? 0 : getS3BucketName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getS3KeyPrefix() == null) ? 0 : getS3KeyPrefix().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnsTopicARN() == null) ? 0 : getSnsTopicARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getConfigSnapshotDeliveryProperties() == null) ? 0
                        : getConfigSnapshotDeliveryProperties().hashCode());
        return hashCode;
    }

    @Override
    public DeliveryChannel clone() {
        try {
            return (DeliveryChannel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
