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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.EnableVgwRoutePropagationRequestMarshaller;

/**
 * 
 */
public class EnableVgwRoutePropagationRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable,
        DryRunSupportedRequest<EnableVgwRoutePropagationRequest> {

    /**
     * <p>
     * The ID of the route table.
     * </p>
     */
    private String routeTableId;
    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     */
    private String gatewayId;

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     */

    public void setRouteTableId(String routeTableId) {
        this.routeTableId = routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @return The ID of the route table.
     */

    public String getRouteTableId() {
        return this.routeTableId;
    }

    /**
     * <p>
     * The ID of the route table.
     * </p>
     * 
     * @param routeTableId
     *        The ID of the route table.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableVgwRoutePropagationRequest withRouteTableId(String routeTableId) {
        setRouteTableId(routeTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the virtual private gateway.
     */

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @return The ID of the virtual private gateway.
     */

    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * <p>
     * The ID of the virtual private gateway.
     * </p>
     * 
     * @param gatewayId
     *        The ID of the virtual private gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public EnableVgwRoutePropagationRequest withGatewayId(String gatewayId) {
        setGatewayId(gatewayId);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<EnableVgwRoutePropagationRequest> getDryRunRequest() {
        Request<EnableVgwRoutePropagationRequest> request = new EnableVgwRoutePropagationRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getRouteTableId() != null)
            sb.append("RouteTableId: " + getRouteTableId() + ",");
        if (getGatewayId() != null)
            sb.append("GatewayId: " + getGatewayId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableVgwRoutePropagationRequest == false)
            return false;
        EnableVgwRoutePropagationRequest other = (EnableVgwRoutePropagationRequest) obj;
        if (other.getRouteTableId() == null ^ this.getRouteTableId() == null)
            return false;
        if (other.getRouteTableId() != null
                && other.getRouteTableId().equals(this.getRouteTableId()) == false)
            return false;
        if (other.getGatewayId() == null ^ this.getGatewayId() == null)
            return false;
        if (other.getGatewayId() != null
                && other.getGatewayId().equals(this.getGatewayId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getRouteTableId() == null) ? 0 : getRouteTableId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getGatewayId() == null) ? 0 : getGatewayId().hashCode());
        return hashCode;
    }

    @Override
    public EnableVgwRoutePropagationRequest clone() {
        return (EnableVgwRoutePropagationRequest) super.clone();
    }
}