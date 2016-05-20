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

package com.amazonaws.services.opsworks.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DeregisterElasticIpRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String elasticIp;

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param elasticIp
     *        The Elastic IP address.
     */

    public void setElasticIp(String elasticIp) {
        this.elasticIp = elasticIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @return The Elastic IP address.
     */

    public String getElasticIp() {
        return this.elasticIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * 
     * @param elasticIp
     *        The Elastic IP address.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DeregisterElasticIpRequest withElasticIp(String elasticIp) {
        setElasticIp(elasticIp);
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
        if (getElasticIp() != null)
            sb.append("ElasticIp: " + getElasticIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeregisterElasticIpRequest == false)
            return false;
        DeregisterElasticIpRequest other = (DeregisterElasticIpRequest) obj;
        if (other.getElasticIp() == null ^ this.getElasticIp() == null)
            return false;
        if (other.getElasticIp() != null
                && other.getElasticIp().equals(this.getElasticIp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getElasticIp() == null) ? 0 : getElasticIp().hashCode());
        return hashCode;
    }

    @Override
    public DeregisterElasticIpRequest clone() {
        return (DeregisterElasticIpRequest) super.clone();
    }
}