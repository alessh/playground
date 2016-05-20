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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class UpdateGatewayInformationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    private String gatewayARN;

    private String gatewayName;

    private String gatewayTimezone;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGatewayInformationRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * @param gatewayName
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * @return
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * @param gatewayName
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGatewayInformationRequest withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * @param gatewayTimezone
     */

    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * @return
     */

    public String getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * @param gatewayTimezone
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public UpdateGatewayInformationRequest withGatewayTimezone(
            String gatewayTimezone) {
        setGatewayTimezone(gatewayTimezone);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: " + getGatewayTimezone());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGatewayInformationRequest == false)
            return false;
        UpdateGatewayInformationRequest other = (UpdateGatewayInformationRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null
                && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getGatewayName() == null ^ this.getGatewayName() == null)
            return false;
        if (other.getGatewayName() != null
                && other.getGatewayName().equals(this.getGatewayName()) == false)
            return false;
        if (other.getGatewayTimezone() == null
                ^ this.getGatewayTimezone() == null)
            return false;
        if (other.getGatewayTimezone() != null
                && other.getGatewayTimezone().equals(this.getGatewayTimezone()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone()
                        .hashCode());
        return hashCode;
    }

    @Override
    public UpdateGatewayInformationRequest clone() {
        return (UpdateGatewayInformationRequest) super.clone();
    }
}