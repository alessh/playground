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

package com.amazonaws.services.elasticsearch.model;

import java.io.Serializable;

/**
 * <p>
 * The result of a <code>DescribeElasticsearchDomainConfig</code> request.
 * Contains the configuration information of the requested domain.
 * </p>
 */
public class DescribeElasticsearchDomainConfigResult implements Serializable,
        Cloneable {

    /**
     * <p>
     * The configuration information of the domain requested in the
     * <code>DescribeElasticsearchDomainConfig</code> request.
     * </p>
     */
    private ElasticsearchDomainConfig domainConfig;

    /**
     * <p>
     * The configuration information of the domain requested in the
     * <code>DescribeElasticsearchDomainConfig</code> request.
     * </p>
     * 
     * @param domainConfig
     *        The configuration information of the domain requested in the
     *        <code>DescribeElasticsearchDomainConfig</code> request.
     */

    public void setDomainConfig(ElasticsearchDomainConfig domainConfig) {
        this.domainConfig = domainConfig;
    }

    /**
     * <p>
     * The configuration information of the domain requested in the
     * <code>DescribeElasticsearchDomainConfig</code> request.
     * </p>
     * 
     * @return The configuration information of the domain requested in the
     *         <code>DescribeElasticsearchDomainConfig</code> request.
     */

    public ElasticsearchDomainConfig getDomainConfig() {
        return this.domainConfig;
    }

    /**
     * <p>
     * The configuration information of the domain requested in the
     * <code>DescribeElasticsearchDomainConfig</code> request.
     * </p>
     * 
     * @param domainConfig
     *        The configuration information of the domain requested in the
     *        <code>DescribeElasticsearchDomainConfig</code> request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeElasticsearchDomainConfigResult withDomainConfig(
            ElasticsearchDomainConfig domainConfig) {
        setDomainConfig(domainConfig);
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
        if (getDomainConfig() != null)
            sb.append("DomainConfig: " + getDomainConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeElasticsearchDomainConfigResult == false)
            return false;
        DescribeElasticsearchDomainConfigResult other = (DescribeElasticsearchDomainConfigResult) obj;
        if (other.getDomainConfig() == null ^ this.getDomainConfig() == null)
            return false;
        if (other.getDomainConfig() != null
                && other.getDomainConfig().equals(this.getDomainConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDomainConfig() == null) ? 0 : getDomainConfig()
                        .hashCode());
        return hashCode;
    }

    @Override
    public DescribeElasticsearchDomainConfigResult clone() {
        try {
            return (DescribeElasticsearchDomainConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
