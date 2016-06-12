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
 * The request to create a new streaming distribution.
 */
public class CreateStreamingDistributionRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /** The streaming distribution's configuration information. */
    private StreamingDistributionConfig streamingDistributionConfig;

    /**
     * Default constructor for CreateStreamingDistributionRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize the object after creating it.
     */
    public CreateStreamingDistributionRequest() {
    }

    /**
     * Constructs a new CreateStreamingDistributionRequest object. Callers
     * should use the setter or fluent setter (with...) methods to initialize
     * any additional object members.
     * 
     * @param streamingDistributionConfig
     *        The streaming distribution's configuration information.
     */
    public CreateStreamingDistributionRequest(
            StreamingDistributionConfig streamingDistributionConfig) {
        setStreamingDistributionConfig(streamingDistributionConfig);
    }

    /**
     * The streaming distribution's configuration information.
     * 
     * @param streamingDistributionConfig
     *        The streaming distribution's configuration information.
     */

    public void setStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        this.streamingDistributionConfig = streamingDistributionConfig;
    }

    /**
     * The streaming distribution's configuration information.
     * 
     * @return The streaming distribution's configuration information.
     */

    public StreamingDistributionConfig getStreamingDistributionConfig() {
        return this.streamingDistributionConfig;
    }

    /**
     * The streaming distribution's configuration information.
     * 
     * @param streamingDistributionConfig
     *        The streaming distribution's configuration information.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateStreamingDistributionRequest withStreamingDistributionConfig(
            StreamingDistributionConfig streamingDistributionConfig) {
        setStreamingDistributionConfig(streamingDistributionConfig);
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
        if (getStreamingDistributionConfig() != null)
            sb.append("StreamingDistributionConfig: "
                    + getStreamingDistributionConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamingDistributionRequest == false)
            return false;
        CreateStreamingDistributionRequest other = (CreateStreamingDistributionRequest) obj;
        if (other.getStreamingDistributionConfig() == null
                ^ this.getStreamingDistributionConfig() == null)
            return false;
        if (other.getStreamingDistributionConfig() != null
                && other.getStreamingDistributionConfig().equals(
                        this.getStreamingDistributionConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getStreamingDistributionConfig() == null) ? 0
                        : getStreamingDistributionConfig().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamingDistributionRequest clone() {
        return (CreateStreamingDistributionRequest) super.clone();
    }
}