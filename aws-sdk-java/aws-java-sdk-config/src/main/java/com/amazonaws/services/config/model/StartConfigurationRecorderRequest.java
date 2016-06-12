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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for the <a>StartConfigurationRecorder</a> action.
 * </p>
 */
public class StartConfigurationRecorderRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * </p>
     */
    private String configurationRecorderName;

    /**
     * <p>
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * </p>
     * 
     * @param configurationRecorderName
     *        The name of the recorder object that records each configuration
     *        change made to the resources.
     */

    public void setConfigurationRecorderName(String configurationRecorderName) {
        this.configurationRecorderName = configurationRecorderName;
    }

    /**
     * <p>
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * </p>
     * 
     * @return The name of the recorder object that records each configuration
     *         change made to the resources.
     */

    public String getConfigurationRecorderName() {
        return this.configurationRecorderName;
    }

    /**
     * <p>
     * The name of the recorder object that records each configuration change
     * made to the resources.
     * </p>
     * 
     * @param configurationRecorderName
     *        The name of the recorder object that records each configuration
     *        change made to the resources.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public StartConfigurationRecorderRequest withConfigurationRecorderName(
            String configurationRecorderName) {
        setConfigurationRecorderName(configurationRecorderName);
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
        if (getConfigurationRecorderName() != null)
            sb.append("ConfigurationRecorderName: "
                    + getConfigurationRecorderName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartConfigurationRecorderRequest == false)
            return false;
        StartConfigurationRecorderRequest other = (StartConfigurationRecorderRequest) obj;
        if (other.getConfigurationRecorderName() == null
                ^ this.getConfigurationRecorderName() == null)
            return false;
        if (other.getConfigurationRecorderName() != null
                && other.getConfigurationRecorderName().equals(
                        this.getConfigurationRecorderName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getConfigurationRecorderName() == null) ? 0
                        : getConfigurationRecorderName().hashCode());
        return hashCode;
    }

    @Override
    public StartConfigurationRecorderRequest clone() {
        return (StartConfigurationRecorderRequest) super.clone();
    }
}