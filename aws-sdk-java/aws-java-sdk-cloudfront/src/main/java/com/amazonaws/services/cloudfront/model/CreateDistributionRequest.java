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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to create a new distribution.
 */
public class CreateDistributionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /** The distribution's configuration information. */
    private DistributionConfig distributionConfig;

    /**
     * Default constructor for CreateDistributionRequest object. Callers should
     * use the setter or fluent setter (with...) methods to initialize the
     * object after creating it.
     */
    public CreateDistributionRequest() {
    }

    /**
     * Constructs a new CreateDistributionRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     */
    public CreateDistributionRequest(DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
    }

    /**
     * The distribution's configuration information.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     */

    public void setDistributionConfig(DistributionConfig distributionConfig) {
        this.distributionConfig = distributionConfig;
    }

    /**
     * The distribution's configuration information.
     * 
     * @return The distribution's configuration information.
     */

    public DistributionConfig getDistributionConfig() {
        return this.distributionConfig;
    }

    /**
     * The distribution's configuration information.
     * 
     * @param distributionConfig
     *        The distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDistributionRequest withDistributionConfig(
            DistributionConfig distributionConfig) {
        setDistributionConfig(distributionConfig);
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
        if (getDistributionConfig() != null)
            sb.append("DistributionConfig: " + getDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDistributionRequest == false)
            return false;
        CreateDistributionRequest other = (CreateDistributionRequest) obj;
        if (other.getDistributionConfig() == null
                ^ this.getDistributionConfig() == null)
            return false;
        if (other.getDistributionConfig() != null
                && other.getDistributionConfig().equals(
                        this.getDistributionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDistributionConfig() == null) ? 0
                        : getDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateDistributionRequest clone() {
        return (CreateDistributionRequest) super.clone();
    }
}