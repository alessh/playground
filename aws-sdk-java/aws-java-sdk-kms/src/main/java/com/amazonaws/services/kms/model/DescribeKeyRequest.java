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

package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeKeyRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @return A unique identifier for the customer master key. This value can
     *         be a globally unique identifier, a fully specified ARN to either
     *         an alias or a key, or an alias name prefixed by "alias/".
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Alias ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         <li>Alias Name Example - alias/MyAliasName</li>
     *         </ul>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * A unique identifier for the customer master key. This value can be a
     * globally unique identifier, a fully specified ARN to either an alias or a
     * key, or an alias name prefixed by "alias/".
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Alias ARN Example -
     * arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * <li>Alias Name Example - alias/MyAliasName</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        A unique identifier for the customer master key. This value can be
     *        a globally unique identifier, a fully specified ARN to either an
     *        alias or a key, or an alias name prefixed by "alias/".
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Alias ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        <li>Alias Name Example - alias/MyAliasName</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeKeyRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *         >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     */

    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     */

    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(
                grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGrantTokens(java.util.Collection)} or
     * {@link #withGrantTokens(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeKeyRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(
                    grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeKeyRequest withGrantTokens(
            java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeKeyRequest == false)
            return false;
        DescribeKeyRequest other = (DescribeKeyRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        return hashCode;
    }

    @Override
    public DescribeKeyRequest clone() {
        return (DescribeKeyRequest) super.clone();
    }
}