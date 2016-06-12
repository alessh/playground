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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeleteLaunchConfigurationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     */
    private String launchConfigurationName;

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     */

    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @return The name of the launch configuration.
     */

    public String getLaunchConfigurationName() {
        return this.launchConfigurationName;
    }

    /**
     * <p>
     * The name of the launch configuration.
     * </p>
     * 
     * @param launchConfigurationName
     *        The name of the launch configuration.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeleteLaunchConfigurationRequest withLaunchConfigurationName(
            String launchConfigurationName) {
        setLaunchConfigurationName(launchConfigurationName);
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
        if (getLaunchConfigurationName() != null)
            sb.append("LaunchConfigurationName: "
                    + getLaunchConfigurationName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteLaunchConfigurationRequest == false)
            return false;
        DeleteLaunchConfigurationRequest other = (DeleteLaunchConfigurationRequest) obj;
        if (other.getLaunchConfigurationName() == null
                ^ this.getLaunchConfigurationName() == null)
            return false;
        if (other.getLaunchConfigurationName() != null
                && other.getLaunchConfigurationName().equals(
                        this.getLaunchConfigurationName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLaunchConfigurationName() == null) ? 0
                        : getLaunchConfigurationName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteLaunchConfigurationRequest clone() {
        return (DeleteLaunchConfigurationRequest) super.clone();
    }
}