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
 * The output for the <a>GetResourceConfigHistory</a> action.
 * </p>
 */
public class GetResourceConfigHistoryResult implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains the configuration history of one or more resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ConfigurationItem> configurationItems;
    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains the configuration history of one or more resources.
     * </p>
     * 
     * @return A list that contains the configuration history of one or more
     *         resources.
     */

    public java.util.List<ConfigurationItem> getConfigurationItems() {
        if (configurationItems == null) {
            configurationItems = new com.amazonaws.internal.SdkInternalList<ConfigurationItem>();
        }
        return configurationItems;
    }

    /**
     * <p>
     * A list that contains the configuration history of one or more resources.
     * </p>
     * 
     * @param configurationItems
     *        A list that contains the configuration history of one or more
     *        resources.
     */

    public void setConfigurationItems(
            java.util.Collection<ConfigurationItem> configurationItems) {
        if (configurationItems == null) {
            this.configurationItems = null;
            return;
        }

        this.configurationItems = new com.amazonaws.internal.SdkInternalList<ConfigurationItem>(
                configurationItems);
    }

    /**
     * <p>
     * A list that contains the configuration history of one or more resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setConfigurationItems(java.util.Collection)} or
     * {@link #withConfigurationItems(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param configurationItems
     *        A list that contains the configuration history of one or more
     *        resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryResult withConfigurationItems(
            ConfigurationItem... configurationItems) {
        if (this.configurationItems == null) {
            setConfigurationItems(new com.amazonaws.internal.SdkInternalList<ConfigurationItem>(
                    configurationItems.length));
        }
        for (ConfigurationItem ele : configurationItems) {
            this.configurationItems.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains the configuration history of one or more resources.
     * </p>
     * 
     * @param configurationItems
     *        A list that contains the configuration history of one or more
     *        resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryResult withConfigurationItems(
            java.util.Collection<ConfigurationItem> configurationItems) {
        setConfigurationItems(configurationItems);
        return this;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next
     *        page of results in a paginated response.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @return The string that you use in a subsequent request to get the next
     *         page of results in a paginated response.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The string that you use in a subsequent request to get the next page of
     * results in a paginated response.
     * </p>
     * 
     * @param nextToken
     *        The string that you use in a subsequent request to get the next
     *        page of results in a paginated response.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public GetResourceConfigHistoryResult withNextToken(String nextToken) {
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
        if (getConfigurationItems() != null)
            sb.append("ConfigurationItems: " + getConfigurationItems() + ",");
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

        if (obj instanceof GetResourceConfigHistoryResult == false)
            return false;
        GetResourceConfigHistoryResult other = (GetResourceConfigHistoryResult) obj;
        if (other.getConfigurationItems() == null
                ^ this.getConfigurationItems() == null)
            return false;
        if (other.getConfigurationItems() != null
                && other.getConfigurationItems().equals(
                        this.getConfigurationItems()) == false)
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
                + ((getConfigurationItems() == null) ? 0
                        : getConfigurationItems().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceConfigHistoryResult clone() {
        try {
            return (GetResourceConfigHistoryResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
