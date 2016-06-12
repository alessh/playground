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

package com.amazonaws.services.cloudtrail.model;

import java.io.Serializable;

/**
 * Returns the objects or data listed below if successful. Otherwise, returns an
 * error.
 */
public class UpdateTrailResult implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the name of the trail.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log
     * files.
     * </p>
     */
    private String s3BucketName;
    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     * >Finding Your CloudTrail Log Files</a>.
     * </p>
     */
    private String s3KeyPrefix;
    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * </p>
     */
    private String snsTopicName;
    /**
     * <p>
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * </p>
     */
    private Boolean includeGlobalServiceEvents;
    /**
     * <p>
     * Specifies whether the trail exists in one region or in all regions.
     * </p>
     */
    private Boolean isMultiRegionTrail;
    /**
     * <p>
     * Specifies the ARN of the trail that was updated.
     * </p>
     */
    private String trailARN;
    /**
     * <p>
     * Specifies whether log file integrity validation is enabled.
     * </p>
     */
    private Boolean logFileValidationEnabled;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the log group to which
     * CloudTrail logs will be delivered.
     * </p>
     */
    private String cloudWatchLogsLogGroupArn;
    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to
     * a user's log group.
     * </p>
     */
    private String cloudWatchLogsRoleArn;
    /**
     * <p>
     * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail.
     * The value is a fully specified ARN to a KMS key in the format:
     * </p>
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     */
    private String kmsKeyId;

    /**
     * <p>
     * Specifies the name of the trail.
     * </p>
     * 
     * @param name
     *        Specifies the name of the trail.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Specifies the name of the trail.
     * </p>
     * 
     * @return Specifies the name of the trail.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Specifies the name of the trail.
     * </p>
     * 
     * @param name
     *        Specifies the name of the trail.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log
     * files.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for
     *        publishing log files.
     */

    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log
     * files.
     * </p>
     * 
     * @return Specifies the name of the Amazon S3 bucket designated for
     *         publishing log files.
     */

    public String getS3BucketName() {
        return this.s3BucketName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon S3 bucket designated for publishing log
     * files.
     * </p>
     * 
     * @param s3BucketName
     *        Specifies the name of the Amazon S3 bucket designated for
     *        publishing log files.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withS3BucketName(String s3BucketName) {
        setS3BucketName(s3BucketName);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     * >Finding Your CloudTrail Log Files</a>.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of
     *        the bucket you have designated for log file delivery. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     *        >Finding Your CloudTrail Log Files</a>.
     */

    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     * >Finding Your CloudTrail Log Files</a>.
     * </p>
     * 
     * @return Specifies the Amazon S3 key prefix that comes after the name of
     *         the bucket you have designated for log file delivery. For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     *         >Finding Your CloudTrail Log Files</a>.
     */

    public String getS3KeyPrefix() {
        return this.s3KeyPrefix;
    }

    /**
     * <p>
     * Specifies the Amazon S3 key prefix that comes after the name of the
     * bucket you have designated for log file delivery. For more information,
     * see <a href=
     * "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     * >Finding Your CloudTrail Log Files</a>.
     * </p>
     * 
     * @param s3KeyPrefix
     *        Specifies the Amazon S3 key prefix that comes after the name of
     *        the bucket you have designated for log file delivery. For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/awscloudtrail/latest/userguide/cloudtrail-find-log-files.html"
     *        >Finding Your CloudTrail Log Files</a>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withS3KeyPrefix(String s3KeyPrefix) {
        setS3KeyPrefix(s3KeyPrefix);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for
     *        notification of log file delivery.
     */

    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * </p>
     * 
     * @return Specifies the name of the Amazon SNS topic defined for
     *         notification of log file delivery.
     */

    public String getSnsTopicName() {
        return this.snsTopicName;
    }

    /**
     * <p>
     * Specifies the name of the Amazon SNS topic defined for notification of
     * log file delivery.
     * </p>
     * 
     * @param snsTopicName
     *        Specifies the name of the Amazon SNS topic defined for
     *        notification of log file delivery.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withSnsTopicName(String snsTopicName) {
        setSnsTopicName(snsTopicName);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global
     *        services such as IAM to the log files.
     */

    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global
     *         services such as IAM to the log files.
     */

    public Boolean getIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * </p>
     * 
     * @param includeGlobalServiceEvents
     *        Specifies whether the trail is publishing events from global
     *        services such as IAM to the log files.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withIncludeGlobalServiceEvents(
            Boolean includeGlobalServiceEvents) {
        setIncludeGlobalServiceEvents(includeGlobalServiceEvents);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail is publishing events from global services
     * such as IAM to the log files.
     * </p>
     * 
     * @return Specifies whether the trail is publishing events from global
     *         services such as IAM to the log files.
     */

    public Boolean isIncludeGlobalServiceEvents() {
        return this.includeGlobalServiceEvents;
    }

    /**
     * <p>
     * Specifies whether the trail exists in one region or in all regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail exists in one region or in all
     *        regions.
     */

    public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail exists in one region or in all regions.
     * </p>
     * 
     * @return Specifies whether the trail exists in one region or in all
     *         regions.
     */

    public Boolean getIsMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies whether the trail exists in one region or in all regions.
     * </p>
     * 
     * @param isMultiRegionTrail
     *        Specifies whether the trail exists in one region or in all
     *        regions.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        setIsMultiRegionTrail(isMultiRegionTrail);
        return this;
    }

    /**
     * <p>
     * Specifies whether the trail exists in one region or in all regions.
     * </p>
     * 
     * @return Specifies whether the trail exists in one region or in all
     *         regions.
     */

    public Boolean isMultiRegionTrail() {
        return this.isMultiRegionTrail;
    }

    /**
     * <p>
     * Specifies the ARN of the trail that was updated.
     * </p>
     * 
     * @param trailARN
     *        Specifies the ARN of the trail that was updated.
     */

    public void setTrailARN(String trailARN) {
        this.trailARN = trailARN;
    }

    /**
     * <p>
     * Specifies the ARN of the trail that was updated.
     * </p>
     * 
     * @return Specifies the ARN of the trail that was updated.
     */

    public String getTrailARN() {
        return this.trailARN;
    }

    /**
     * <p>
     * Specifies the ARN of the trail that was updated.
     * </p>
     * 
     * @param trailARN
     *        Specifies the ARN of the trail that was updated.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withTrailARN(String trailARN) {
        setTrailARN(trailARN);
        return this;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled.
     * </p>
     * 
     * @param logFileValidationEnabled
     *        Specifies whether log file integrity validation is enabled.
     */

    public void setLogFileValidationEnabled(Boolean logFileValidationEnabled) {
        this.logFileValidationEnabled = logFileValidationEnabled;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled.
     * </p>
     * 
     * @return Specifies whether log file integrity validation is enabled.
     */

    public Boolean getLogFileValidationEnabled() {
        return this.logFileValidationEnabled;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled.
     * </p>
     * 
     * @param logFileValidationEnabled
     *        Specifies whether log file integrity validation is enabled.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withLogFileValidationEnabled(
            Boolean logFileValidationEnabled) {
        setLogFileValidationEnabled(logFileValidationEnabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether log file integrity validation is enabled.
     * </p>
     * 
     * @return Specifies whether log file integrity validation is enabled.
     */

    public Boolean isLogFileValidationEnabled() {
        return this.logFileValidationEnabled;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the log group to which
     * CloudTrail logs will be delivered.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies the Amazon Resource Name (ARN) of the log group to which
     *        CloudTrail logs will be delivered.
     */

    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the log group to which
     * CloudTrail logs will be delivered.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the log group to
     *         which CloudTrail logs will be delivered.
     */

    public String getCloudWatchLogsLogGroupArn() {
        return this.cloudWatchLogsLogGroupArn;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the log group to which
     * CloudTrail logs will be delivered.
     * </p>
     * 
     * @param cloudWatchLogsLogGroupArn
     *        Specifies the Amazon Resource Name (ARN) of the log group to which
     *        CloudTrail logs will be delivered.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withCloudWatchLogsLogGroupArn(
            String cloudWatchLogsLogGroupArn) {
        setCloudWatchLogsLogGroupArn(cloudWatchLogsLogGroupArn);
        return this;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to
     * a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to
     *        write to a user's log group.
     */

    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to
     * a user's log group.
     * </p>
     * 
     * @return Specifies the role for the CloudWatch Logs endpoint to assume to
     *         write to a user's log group.
     */

    public String getCloudWatchLogsRoleArn() {
        return this.cloudWatchLogsRoleArn;
    }

    /**
     * <p>
     * Specifies the role for the CloudWatch Logs endpoint to assume to write to
     * a user's log group.
     * </p>
     * 
     * @param cloudWatchLogsRoleArn
     *        Specifies the role for the CloudWatch Logs endpoint to assume to
     *        write to a user's log group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withCloudWatchLogsRoleArn(
            String cloudWatchLogsRoleArn) {
        setCloudWatchLogsRoleArn(cloudWatchLogsRoleArn);
        return this;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail.
     * The value is a fully specified ARN to a KMS key in the format:
     * </p>
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID that encrypts the logs delivered by
     *        CloudTrail. The value is a fully specified ARN to a KMS key in the
     *        format:</p>
     *        <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     */

    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail.
     * The value is a fully specified ARN to a KMS key in the format:
     * </p>
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * 
     * @return Specifies the KMS key ID that encrypts the logs delivered by
     *         CloudTrail. The value is a fully specified ARN to a KMS key in
     *         the format:</p>
     *         <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     */

    public String getKmsKeyId() {
        return this.kmsKeyId;
    }

    /**
     * <p>
     * Specifies the KMS key ID that encrypts the logs delivered by CloudTrail.
     * The value is a fully specified ARN to a KMS key in the format:
     * </p>
     * <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code>
     * 
     * @param kmsKeyId
     *        Specifies the KMS key ID that encrypts the logs delivered by
     *        CloudTrail. The value is a fully specified ARN to a KMS key in the
     *        format:</p>
     *        <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateTrailResult withKmsKeyId(String kmsKeyId) {
        setKmsKeyId(kmsKeyId);
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
        if (getSnsTopicName() != null)
            sb.append("SnsTopicName: " + getSnsTopicName() + ",");
        if (getIncludeGlobalServiceEvents() != null)
            sb.append("IncludeGlobalServiceEvents: "
                    + getIncludeGlobalServiceEvents() + ",");
        if (getIsMultiRegionTrail() != null)
            sb.append("IsMultiRegionTrail: " + getIsMultiRegionTrail() + ",");
        if (getTrailARN() != null)
            sb.append("TrailARN: " + getTrailARN() + ",");
        if (getLogFileValidationEnabled() != null)
            sb.append("LogFileValidationEnabled: "
                    + getLogFileValidationEnabled() + ",");
        if (getCloudWatchLogsLogGroupArn() != null)
            sb.append("CloudWatchLogsLogGroupArn: "
                    + getCloudWatchLogsLogGroupArn() + ",");
        if (getCloudWatchLogsRoleArn() != null)
            sb.append("CloudWatchLogsRoleArn: " + getCloudWatchLogsRoleArn()
                    + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTrailResult == false)
            return false;
        UpdateTrailResult other = (UpdateTrailResult) obj;
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
        if (other.getSnsTopicName() == null ^ this.getSnsTopicName() == null)
            return false;
        if (other.getSnsTopicName() != null
                && other.getSnsTopicName().equals(this.getSnsTopicName()) == false)
            return false;
        if (other.getIncludeGlobalServiceEvents() == null
                ^ this.getIncludeGlobalServiceEvents() == null)
            return false;
        if (other.getIncludeGlobalServiceEvents() != null
                && other.getIncludeGlobalServiceEvents().equals(
                        this.getIncludeGlobalServiceEvents()) == false)
            return false;
        if (other.getIsMultiRegionTrail() == null
                ^ this.getIsMultiRegionTrail() == null)
            return false;
        if (other.getIsMultiRegionTrail() != null
                && other.getIsMultiRegionTrail().equals(
                        this.getIsMultiRegionTrail()) == false)
            return false;
        if (other.getTrailARN() == null ^ this.getTrailARN() == null)
            return false;
        if (other.getTrailARN() != null
                && other.getTrailARN().equals(this.getTrailARN()) == false)
            return false;
        if (other.getLogFileValidationEnabled() == null
                ^ this.getLogFileValidationEnabled() == null)
            return false;
        if (other.getLogFileValidationEnabled() != null
                && other.getLogFileValidationEnabled().equals(
                        this.getLogFileValidationEnabled()) == false)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() == null
                ^ this.getCloudWatchLogsLogGroupArn() == null)
            return false;
        if (other.getCloudWatchLogsLogGroupArn() != null
                && other.getCloudWatchLogsLogGroupArn().equals(
                        this.getCloudWatchLogsLogGroupArn()) == false)
            return false;
        if (other.getCloudWatchLogsRoleArn() == null
                ^ this.getCloudWatchLogsRoleArn() == null)
            return false;
        if (other.getCloudWatchLogsRoleArn() != null
                && other.getCloudWatchLogsRoleArn().equals(
                        this.getCloudWatchLogsRoleArn()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null
                && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
                + ((getSnsTopicName() == null) ? 0 : getSnsTopicName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIncludeGlobalServiceEvents() == null) ? 0
                        : getIncludeGlobalServiceEvents().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsMultiRegionTrail() == null) ? 0
                        : getIsMultiRegionTrail().hashCode());
        hashCode = prime * hashCode
                + ((getTrailARN() == null) ? 0 : getTrailARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getLogFileValidationEnabled() == null) ? 0
                        : getLogFileValidationEnabled().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsLogGroupArn() == null) ? 0
                        : getCloudWatchLogsLogGroupArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudWatchLogsRoleArn() == null) ? 0
                        : getCloudWatchLogsRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTrailResult clone() {
        try {
            return (UpdateTrailResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
