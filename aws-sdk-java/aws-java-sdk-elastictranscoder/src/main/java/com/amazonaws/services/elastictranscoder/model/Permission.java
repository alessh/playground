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

package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>Permission</code> structure.
 * </p>
 */
public class Permission implements Serializable, Cloneable {

    /**
     * <p>
     * The type of value that appears in the Grantee object:
     * <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3 groups:
     * <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li>
     * </ul>
     * </p>
     */
    private String granteeType;
    /**
     * <p>
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.
     * </p>
     */
    private String grantee;
    /**
     * <p>
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li>
     * </ul>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> access;

    /**
     * <p>
     * The type of value that appears in the Grantee object:
     * <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3 groups:
     * <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li>
     * </ul>
     * </p>
     * 
     * @param granteeType
     *        The type of value that appears in the Grantee object:
     *        <ul>
     *        <li><code>Canonical</code>: Either the canonical user ID for an
     *        AWS account or an origin access identity for an Amazon CloudFront
     *        distribution. <important>A canonical user ID is not the same as an
     *        AWS account number.</important></li>
     *        <li><code>Email</code>: The registered email address of an AWS
     *        account.</li>
     *        <li><code>Group</code>: One of the following predefined Amazon S3
     *        groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     */

    public void setGranteeType(String granteeType) {
        this.granteeType = granteeType;
    }

    /**
     * <p>
     * The type of value that appears in the Grantee object:
     * <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3 groups:
     * <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li>
     * </ul>
     * </p>
     * 
     * @return The type of value that appears in the Grantee object:
     *         <ul>
     *         <li><code>Canonical</code>: Either the canonical user ID for an
     *         AWS account or an origin access identity for an Amazon CloudFront
     *         distribution. <important>A canonical user ID is not the same as
     *         an AWS account number.</important></li>
     *         <li><code>Email</code>: The registered email address of an AWS
     *         account.</li>
     *         <li><code>Group</code>: One of the following predefined Amazon S3
     *         groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>,
     *         or <code>LogDelivery</code>.</li>
     *         </ul>
     */

    public String getGranteeType() {
        return this.granteeType;
    }

    /**
     * <p>
     * The type of value that appears in the Grantee object:
     * <ul>
     * <li><code>Canonical</code>: Either the canonical user ID for an AWS
     * account or an origin access identity for an Amazon CloudFront
     * distribution. <important>A canonical user ID is not the same as an AWS
     * account number.</important></li>
     * <li><code>Email</code>: The registered email address of an AWS account.</li>
     * <li><code>Group</code>: One of the following predefined Amazon S3 groups:
     * <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     * <code>LogDelivery</code>.</li>
     * </ul>
     * </p>
     * 
     * @param granteeType
     *        The type of value that appears in the Grantee object:
     *        <ul>
     *        <li><code>Canonical</code>: Either the canonical user ID for an
     *        AWS account or an origin access identity for an Amazon CloudFront
     *        distribution. <important>A canonical user ID is not the same as an
     *        AWS account number.</important></li>
     *        <li><code>Email</code>: The registered email address of an AWS
     *        account.</li>
     *        <li><code>Group</code>: One of the following predefined Amazon S3
     *        groups: <code>AllUsers</code>, <code>AuthenticatedUsers</code>, or
     *        <code>LogDelivery</code>.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Permission withGranteeType(String granteeType) {
        setGranteeType(granteeType);
        return this;
    }

    /**
     * <p>
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.
     * </p>
     * 
     * @param grantee
     *        The AWS user or group that you want to have access to transcoded
     *        files and playlists. To identify the user or group, you can
     *        specify the canonical user ID for an AWS account, an origin access
     *        identity for a CloudFront distribution, the registered email
     *        address of an AWS account, or a predefined Amazon S3 group.
     */

    public void setGrantee(String grantee) {
        this.grantee = grantee;
    }

    /**
     * <p>
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.
     * </p>
     * 
     * @return The AWS user or group that you want to have access to transcoded
     *         files and playlists. To identify the user or group, you can
     *         specify the canonical user ID for an AWS account, an origin
     *         access identity for a CloudFront distribution, the registered
     *         email address of an AWS account, or a predefined Amazon S3 group.
     */

    public String getGrantee() {
        return this.grantee;
    }

    /**
     * <p>
     * The AWS user or group that you want to have access to transcoded files
     * and playlists. To identify the user or group, you can specify the
     * canonical user ID for an AWS account, an origin access identity for a
     * CloudFront distribution, the registered email address of an AWS account,
     * or a predefined Amazon S3 group.
     * </p>
     * 
     * @param grantee
     *        The AWS user or group that you want to have access to transcoded
     *        files and playlists. To identify the user or group, you can
     *        specify the canonical user ID for an AWS account, an origin access
     *        identity for a CloudFront distribution, the registered email
     *        address of an AWS account, or a predefined Amazon S3 group.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Permission withGrantee(String grantee) {
        setGrantee(grantee);
        return this;
    }

    /**
     * <p>
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li>
     * </ul>
     * </p>
     * 
     * @return The permission that you want to give to the AWS user that is
     *         listed in Grantee. Valid values include:
     *         <ul>
     *         <li><code>READ</code>: The grantee can read the thumbnails and
     *         metadata for thumbnails that Elastic Transcoder adds to the
     *         Amazon S3 bucket.</li>
     *         <li><code>READ_ACP</code>: The grantee can read the object ACL
     *         for thumbnails that Elastic Transcoder adds to the Amazon S3
     *         bucket.</li>
     *         <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *         thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *         <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP,
     *         and WRITE_ACP permissions for the thumbnails that Elastic
     *         Transcoder adds to the Amazon S3 bucket.</li>
     *         </ul>
     */

    public java.util.List<String> getAccess() {
        if (access == null) {
            access = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return access;
    }

    /**
     * <p>
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li>
     * </ul>
     * </p>
     * 
     * @param access
     *        The permission that you want to give to the AWS user that is
     *        listed in Grantee. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the thumbnails and
     *        metadata for thumbnails that Elastic Transcoder adds to the Amazon
     *        S3 bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *        WRITE_ACP permissions for the thumbnails that Elastic Transcoder
     *        adds to the Amazon S3 bucket.</li>
     *        </ul>
     */

    public void setAccess(java.util.Collection<String> access) {
        if (access == null) {
            this.access = null;
            return;
        }

        this.access = new com.amazonaws.internal.SdkInternalList<String>(access);
    }

    /**
     * <p>
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li>
     * </ul>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setAccess(java.util.Collection)} or
     * {@link #withAccess(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param access
     *        The permission that you want to give to the AWS user that is
     *        listed in Grantee. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the thumbnails and
     *        metadata for thumbnails that Elastic Transcoder adds to the Amazon
     *        S3 bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *        WRITE_ACP permissions for the thumbnails that Elastic Transcoder
     *        adds to the Amazon S3 bucket.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Permission withAccess(String... access) {
        if (this.access == null) {
            setAccess(new com.amazonaws.internal.SdkInternalList<String>(
                    access.length));
        }
        for (String ele : access) {
            this.access.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The permission that you want to give to the AWS user that is listed in
     * Grantee. Valid values include:
     * <ul>
     * <li><code>READ</code>: The grantee can read the thumbnails and metadata
     * for thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>READ_ACP</code>: The grantee can read the object ACL for
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     * thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     * <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     * WRITE_ACP permissions for the thumbnails that Elastic Transcoder adds to
     * the Amazon S3 bucket.</li>
     * </ul>
     * </p>
     * 
     * @param access
     *        The permission that you want to give to the AWS user that is
     *        listed in Grantee. Valid values include:
     *        <ul>
     *        <li><code>READ</code>: The grantee can read the thumbnails and
     *        metadata for thumbnails that Elastic Transcoder adds to the Amazon
     *        S3 bucket.</li>
     *        <li><code>READ_ACP</code>: The grantee can read the object ACL for
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>WRITE_ACP</code>: The grantee can write the ACL for the
     *        thumbnails that Elastic Transcoder adds to the Amazon S3 bucket.</li>
     *        <li><code>FULL_CONTROL</code>: The grantee has READ, READ_ACP, and
     *        WRITE_ACP permissions for the thumbnails that Elastic Transcoder
     *        adds to the Amazon S3 bucket.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public Permission withAccess(java.util.Collection<String> access) {
        setAccess(access);
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
        if (getGranteeType() != null)
            sb.append("GranteeType: " + getGranteeType() + ",");
        if (getGrantee() != null)
            sb.append("Grantee: " + getGrantee() + ",");
        if (getAccess() != null)
            sb.append("Access: " + getAccess());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Permission == false)
            return false;
        Permission other = (Permission) obj;
        if (other.getGranteeType() == null ^ this.getGranteeType() == null)
            return false;
        if (other.getGranteeType() != null
                && other.getGranteeType().equals(this.getGranteeType()) == false)
            return false;
        if (other.getGrantee() == null ^ this.getGrantee() == null)
            return false;
        if (other.getGrantee() != null
                && other.getGrantee().equals(this.getGrantee()) == false)
            return false;
        if (other.getAccess() == null ^ this.getAccess() == null)
            return false;
        if (other.getAccess() != null
                && other.getAccess().equals(this.getAccess()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGranteeType() == null) ? 0 : getGranteeType().hashCode());
        hashCode = prime * hashCode
                + ((getGrantee() == null) ? 0 : getGrantee().hashCode());
        hashCode = prime * hashCode
                + ((getAccess() == null) ? 0 : getAccess().hashCode());
        return hashCode;
    }

    @Override
    public Permission clone() {
        try {
            return (Permission) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
