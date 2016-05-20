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

package com.amazonaws.services.kinesisfirehose.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an update for a destination in Amazon Redshift.
 * </p>
 */
public class RedshiftDestinationUpdate implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The database connection string.
     * </p>
     */
    private String clusterJDBCURL;
    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     */
    private CopyCommand copyCommand;
    /**
     * <p>
     * The name of the user.
     * </p>
     */
    private String username;
    /**
     * <p>
     * The user password.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified in <code>RedshiftDestinationUpdate.S3Update</code> because the
     * Amazon Redshift <code>COPY</code> operation that reads from the S3 bucket
     * doesn't support these compression formats.
     * </p>
     */
    private S3DestinationUpdate s3Update;

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @return The ARN of the AWS credentials.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The ARN of the AWS credentials.
     * </p>
     * 
     * @param roleARN
     *        The ARN of the AWS credentials.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     */

    public void setClusterJDBCURL(String clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @return The database connection string.
     */

    public String getClusterJDBCURL() {
        return this.clusterJDBCURL;
    }

    /**
     * <p>
     * The database connection string.
     * </p>
     * 
     * @param clusterJDBCURL
     *        The database connection string.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withClusterJDBCURL(String clusterJDBCURL) {
        setClusterJDBCURL(clusterJDBCURL);
        return this;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     */

    public void setCopyCommand(CopyCommand copyCommand) {
        this.copyCommand = copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @return The <code>COPY</code> command.
     */

    public CopyCommand getCopyCommand() {
        return this.copyCommand;
    }

    /**
     * <p>
     * The <code>COPY</code> command.
     * </p>
     * 
     * @param copyCommand
     *        The <code>COPY</code> command.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withCopyCommand(CopyCommand copyCommand) {
        setCopyCommand(copyCommand);
        return this;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     */

    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @return The name of the user.
     */

    public String getUsername() {
        return this.username;
    }

    /**
     * <p>
     * The name of the user.
     * </p>
     * 
     * @param username
     *        The name of the user.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withUsername(String username) {
        setUsername(username);
        return this;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @param password
     *        The user password.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @return The user password.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The user password.
     * </p>
     * 
     * @param password
     *        The user password.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified in <code>RedshiftDestinationUpdate.S3Update</code> because the
     * Amazon Redshift <code>COPY</code> operation that reads from the S3 bucket
     * doesn't support these compression formats.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified in
     *        <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon
     *        Redshift <code>COPY</code> operation that reads from the S3 bucket
     *        doesn't support these compression formats.
     */

    public void setS3Update(S3DestinationUpdate s3Update) {
        this.s3Update = s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified in <code>RedshiftDestinationUpdate.S3Update</code> because the
     * Amazon Redshift <code>COPY</code> operation that reads from the S3 bucket
     * doesn't support these compression formats.
     * </p>
     * 
     * @return The Amazon S3 destination.</p>
     *         <p>
     *         The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *         cannot be specified in
     *         <code>RedshiftDestinationUpdate.S3Update</code> because the
     *         Amazon Redshift <code>COPY</code> operation that reads from the
     *         S3 bucket doesn't support these compression formats.
     */

    public S3DestinationUpdate getS3Update() {
        return this.s3Update;
    }

    /**
     * <p>
     * The Amazon S3 destination.
     * </p>
     * <p>
     * The compression formats <code>SNAPPY</code> or <code>ZIP</code> cannot be
     * specified in <code>RedshiftDestinationUpdate.S3Update</code> because the
     * Amazon Redshift <code>COPY</code> operation that reads from the S3 bucket
     * doesn't support these compression formats.
     * </p>
     * 
     * @param s3Update
     *        The Amazon S3 destination.</p>
     *        <p>
     *        The compression formats <code>SNAPPY</code> or <code>ZIP</code>
     *        cannot be specified in
     *        <code>RedshiftDestinationUpdate.S3Update</code> because the Amazon
     *        Redshift <code>COPY</code> operation that reads from the S3 bucket
     *        doesn't support these compression formats.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public RedshiftDestinationUpdate withS3Update(S3DestinationUpdate s3Update) {
        setS3Update(s3Update);
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
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getClusterJDBCURL() != null)
            sb.append("ClusterJDBCURL: " + getClusterJDBCURL() + ",");
        if (getCopyCommand() != null)
            sb.append("CopyCommand: " + getCopyCommand() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getS3Update() != null)
            sb.append("S3Update: " + getS3Update());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedshiftDestinationUpdate == false)
            return false;
        RedshiftDestinationUpdate other = (RedshiftDestinationUpdate) obj;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getClusterJDBCURL() == null
                ^ this.getClusterJDBCURL() == null)
            return false;
        if (other.getClusterJDBCURL() != null
                && other.getClusterJDBCURL().equals(this.getClusterJDBCURL()) == false)
            return false;
        if (other.getCopyCommand() == null ^ this.getCopyCommand() == null)
            return false;
        if (other.getCopyCommand() != null
                && other.getCopyCommand().equals(this.getCopyCommand()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null
                && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null
                && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getS3Update() == null ^ this.getS3Update() == null)
            return false;
        if (other.getS3Update() != null
                && other.getS3Update().equals(this.getS3Update()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getClusterJDBCURL() == null) ? 0 : getClusterJDBCURL()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCopyCommand() == null) ? 0 : getCopyCommand().hashCode());
        hashCode = prime * hashCode
                + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode
                + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode
                + ((getS3Update() == null) ? 0 : getS3Update().hashCode());
        return hashCode;
    }

    @Override
    public RedshiftDestinationUpdate clone() {
        try {
            return (RedshiftDestinationUpdate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
