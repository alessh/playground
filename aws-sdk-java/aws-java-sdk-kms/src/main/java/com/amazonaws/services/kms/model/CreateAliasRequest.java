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
public class CreateAliasRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * String that contains the display name. The name must start with the word
     * "alias" followed by a forward slash (alias/). Aliases that begin with
     * "alias/AWS" are reserved.
     * </p>
     */
    private String aliasName;
    /**
     * <p>
     * An identifier of the key for which you are creating the alias. This value
     * cannot be another alias but can be a globally unique identifier or a
     * fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     */
    private String targetKeyId;

    /**
     * <p>
     * String that contains the display name. The name must start with the word
     * "alias" followed by a forward slash (alias/). Aliases that begin with
     * "alias/AWS" are reserved.
     * </p>
     * 
     * @param aliasName
     *        String that contains the display name. The name must start with
     *        the word "alias" followed by a forward slash (alias/). Aliases
     *        that begin with "alias/AWS" are reserved.
     */

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    /**
     * <p>
     * String that contains the display name. The name must start with the word
     * "alias" followed by a forward slash (alias/). Aliases that begin with
     * "alias/AWS" are reserved.
     * </p>
     * 
     * @return String that contains the display name. The name must start with
     *         the word "alias" followed by a forward slash (alias/). Aliases
     *         that begin with "alias/AWS" are reserved.
     */

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * <p>
     * String that contains the display name. The name must start with the word
     * "alias" followed by a forward slash (alias/). Aliases that begin with
     * "alias/AWS" are reserved.
     * </p>
     * 
     * @param aliasName
     *        String that contains the display name. The name must start with
     *        the word "alias" followed by a forward slash (alias/). Aliases
     *        that begin with "alias/AWS" are reserved.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAliasRequest withAliasName(String aliasName) {
        setAliasName(aliasName);
        return this;
    }

    /**
     * <p>
     * An identifier of the key for which you are creating the alias. This value
     * cannot be another alias but can be a globally unique identifier or a
     * fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param targetKeyId
     *        An identifier of the key for which you are creating the alias.
     *        This value cannot be another alias but can be a globally unique
     *        identifier or a fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     */

    public void setTargetKeyId(String targetKeyId) {
        this.targetKeyId = targetKeyId;
    }

    /**
     * <p>
     * An identifier of the key for which you are creating the alias. This value
     * cannot be another alias but can be a globally unique identifier or a
     * fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @return An identifier of the key for which you are creating the alias.
     *         This value cannot be another alias but can be a globally unique
     *         identifier or a fully specified ARN to a key.
     *         <ul>
     *         <li>Key ARN Example -
     *         arn:aws:kms:us-east-1:123456789012:key/12345678
     *         -1234-1234-1234-123456789012</li>
     *         <li>Globally Unique Key ID Example -
     *         12345678-1234-1234-1234-123456789012</li>
     *         </ul>
     */

    public String getTargetKeyId() {
        return this.targetKeyId;
    }

    /**
     * <p>
     * An identifier of the key for which you are creating the alias. This value
     * cannot be another alias but can be a globally unique identifier or a
     * fully specified ARN to a key.
     * <ul>
     * <li>Key ARN Example -
     * arn:aws:kms:us-east-1:123456789012:key/12345678-1234
     * -1234-1234-123456789012</li>
     * <li>Globally Unique Key ID Example - 12345678-1234-1234-1234-123456789012
     * </li>
     * </ul>
     * </p>
     * 
     * @param targetKeyId
     *        An identifier of the key for which you are creating the alias.
     *        This value cannot be another alias but can be a globally unique
     *        identifier or a fully specified ARN to a key.
     *        <ul>
     *        <li>Key ARN Example -
     *        arn:aws:kms:us-east-1:123456789012:key/12345678
     *        -1234-1234-1234-123456789012</li>
     *        <li>Globally Unique Key ID Example -
     *        12345678-1234-1234-1234-123456789012</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateAliasRequest withTargetKeyId(String targetKeyId) {
        setTargetKeyId(targetKeyId);
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
        if (getAliasName() != null)
            sb.append("AliasName: " + getAliasName() + ",");
        if (getTargetKeyId() != null)
            sb.append("TargetKeyId: " + getTargetKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAliasRequest == false)
            return false;
        CreateAliasRequest other = (CreateAliasRequest) obj;
        if (other.getAliasName() == null ^ this.getAliasName() == null)
            return false;
        if (other.getAliasName() != null
                && other.getAliasName().equals(this.getAliasName()) == false)
            return false;
        if (other.getTargetKeyId() == null ^ this.getTargetKeyId() == null)
            return false;
        if (other.getTargetKeyId() != null
                && other.getTargetKeyId().equals(this.getTargetKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAliasName() == null) ? 0 : getAliasName().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetKeyId() == null) ? 0 : getTargetKeyId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAliasRequest clone() {
        return (CreateAliasRequest) super.clone();
    }
}