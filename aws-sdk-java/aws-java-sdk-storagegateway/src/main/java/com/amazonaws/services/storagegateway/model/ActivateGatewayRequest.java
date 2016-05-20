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
 * <p>
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li><a>ActivateGatewayInput$ActivationKey</a></li>
 * <li><a>ActivateGatewayInput$GatewayName</a></li>
 * <li><a>ActivateGatewayInput$GatewayRegion</a></li>
 * <li><a>ActivateGatewayInput$GatewayTimezone</a></li>
 * <li><a>ActivateGatewayInput$GatewayType</a></li>
 * <li><a>ActivateGatewayInput$TapeDriveType</a></li>
 * <li><a>ActivateGatewayInput$MediumChangerType</a></li>
 * </ul>
 */
public class ActivateGatewayRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     */
    private String activationKey;
    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     */
    private String gatewayName;
    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is used, for example, for scheduling snapshots and your
     * gateway's maintenance schedule.
     * </p>
     */
    private String gatewayTimezone;
    /**
     * <p>
     * A value that indicates the region where you want to store the snapshot
     * backups. The gateway region specified must be the same region as the
     * region in your <code>Host</code> header in the request. For more
     * information about available regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2", "eu-west-1",
     * "eu-central-1", "ap-northeast-1", "ap-southeast-1", "ap-southeast-2",
     * "sa-east-1"
     * </p>
     */
    private String gatewayRegion;
    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>STORED</code>.
     * </p>
     */
    private String gatewayType;
    /**
     * <p>
     * The value that indicates the type of tape drive to use for gateway-VTL.
     * This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "IBM-ULT3580-TD5"
     * </p>
     */
    private String tapeDriveType;
    /**
     * <p>
     * The value that indicates the type of medium changer to use for
     * gateway-VTL. This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     */
    private String mediumChangerType;

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * 
     * @param activationKey
     *        Your gateway activation key. You can obtain the activation key by
     *        sending an HTTP GET request with redirects enabled to the gateway
     *        IP address (port 80). The redirect URL returned in the response
     *        provides you the activation key for your gateway in the query
     *        string parameter <code>activationKey</code>. It may also include
     *        other activation-related parameters, however, these are merely
     *        defaults -- the arguments you pass to the
     *        <code>ActivateGateway</code> API call determine the actual
     *        configuration of your gateway.
     */

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * 
     * @return Your gateway activation key. You can obtain the activation key by
     *         sending an HTTP GET request with redirects enabled to the gateway
     *         IP address (port 80). The redirect URL returned in the response
     *         provides you the activation key for your gateway in the query
     *         string parameter <code>activationKey</code>. It may also include
     *         other activation-related parameters, however, these are merely
     *         defaults -- the arguments you pass to the
     *         <code>ActivateGateway</code> API call determine the actual
     *         configuration of your gateway.
     */

    public String getActivationKey() {
        return this.activationKey;
    }

    /**
     * <p>
     * Your gateway activation key. You can obtain the activation key by sending
     * an HTTP GET request with redirects enabled to the gateway IP address
     * (port 80). The redirect URL returned in the response provides you the
     * activation key for your gateway in the query string parameter
     * <code>activationKey</code>. It may also include other activation-related
     * parameters, however, these are merely defaults -- the arguments you pass
     * to the <code>ActivateGateway</code> API call determine the actual
     * configuration of your gateway.
     * </p>
     * 
     * @param activationKey
     *        Your gateway activation key. You can obtain the activation key by
     *        sending an HTTP GET request with redirects enabled to the gateway
     *        IP address (port 80). The redirect URL returned in the response
     *        provides you the activation key for your gateway in the query
     *        string parameter <code>activationKey</code>. It may also include
     *        other activation-related parameters, however, these are merely
     *        defaults -- the arguments you pass to the
     *        <code>ActivateGateway</code> API call determine the actual
     *        configuration of your gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withActivationKey(String activationKey) {
        setActivationKey(activationKey);
        return this;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     */

    public void setGatewayName(String gatewayName) {
        this.gatewayName = gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @return The name you configured for your gateway.
     */

    public String getGatewayName() {
        return this.gatewayName;
    }

    /**
     * <p>
     * The name you configured for your gateway.
     * </p>
     * 
     * @param gatewayName
     *        The name you configured for your gateway.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withGatewayName(String gatewayName) {
        setGatewayName(gatewayName);
        return this;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is used, for example, for scheduling snapshots and your
     * gateway's maintenance schedule.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone you want to set for the
     *        gateway. The time zone is used, for example, for scheduling
     *        snapshots and your gateway's maintenance schedule.
     */

    public void setGatewayTimezone(String gatewayTimezone) {
        this.gatewayTimezone = gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is used, for example, for scheduling snapshots and your
     * gateway's maintenance schedule.
     * </p>
     * 
     * @return A value that indicates the time zone you want to set for the
     *         gateway. The time zone is used, for example, for scheduling
     *         snapshots and your gateway's maintenance schedule.
     */

    public String getGatewayTimezone() {
        return this.gatewayTimezone;
    }

    /**
     * <p>
     * A value that indicates the time zone you want to set for the gateway. The
     * time zone is used, for example, for scheduling snapshots and your
     * gateway's maintenance schedule.
     * </p>
     * 
     * @param gatewayTimezone
     *        A value that indicates the time zone you want to set for the
     *        gateway. The time zone is used, for example, for scheduling
     *        snapshots and your gateway's maintenance schedule.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withGatewayTimezone(String gatewayTimezone) {
        setGatewayTimezone(gatewayTimezone);
        return this;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store the snapshot
     * backups. The gateway region specified must be the same region as the
     * region in your <code>Host</code> header in the request. For more
     * information about available regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2", "eu-west-1",
     * "eu-central-1", "ap-northeast-1", "ap-southeast-1", "ap-southeast-2",
     * "sa-east-1"
     * </p>
     * 
     * @param gatewayRegion
     *        A value that indicates the region where you want to store the
     *        snapshot backups. The gateway region specified must be the same
     *        region as the region in your <code>Host</code> header in the
     *        request. For more information about available regions and
     *        endpoints for AWS Storage Gateway, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *        >Regions and Endpoints</a> in the <i>Amazon Web Services
     *        Glossary</i>.</p>
     *        <p>
     *        <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *        "eu-west-1", "eu-central-1", "ap-northeast-1", "ap-southeast-1",
     *        "ap-southeast-2", "sa-east-1"
     */

    public void setGatewayRegion(String gatewayRegion) {
        this.gatewayRegion = gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store the snapshot
     * backups. The gateway region specified must be the same region as the
     * region in your <code>Host</code> header in the request. For more
     * information about available regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2", "eu-west-1",
     * "eu-central-1", "ap-northeast-1", "ap-southeast-1", "ap-southeast-2",
     * "sa-east-1"
     * </p>
     * 
     * @return A value that indicates the region where you want to store the
     *         snapshot backups. The gateway region specified must be the same
     *         region as the region in your <code>Host</code> header in the
     *         request. For more information about available regions and
     *         endpoints for AWS Storage Gateway, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *         >Regions and Endpoints</a> in the <i>Amazon Web Services
     *         Glossary</i>.</p>
     *         <p>
     *         <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *         "eu-west-1", "eu-central-1", "ap-northeast-1", "ap-southeast-1",
     *         "ap-southeast-2", "sa-east-1"
     */

    public String getGatewayRegion() {
        return this.gatewayRegion;
    }

    /**
     * <p>
     * A value that indicates the region where you want to store the snapshot
     * backups. The gateway region specified must be the same region as the
     * region in your <code>Host</code> header in the request. For more
     * information about available regions and endpoints for AWS Storage
     * Gateway, see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     * >Regions and Endpoints</a> in the <i>Amazon Web Services Glossary</i>.
     * </p>
     * <p>
     * <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2", "eu-west-1",
     * "eu-central-1", "ap-northeast-1", "ap-southeast-1", "ap-southeast-2",
     * "sa-east-1"
     * </p>
     * 
     * @param gatewayRegion
     *        A value that indicates the region where you want to store the
     *        snapshot backups. The gateway region specified must be the same
     *        region as the region in your <code>Host</code> header in the
     *        request. For more information about available regions and
     *        endpoints for AWS Storage Gateway, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/rande.html#sg_region"
     *        >Regions and Endpoints</a> in the <i>Amazon Web Services
     *        Glossary</i>.</p>
     *        <p>
     *        <i>Valid Values</i>: "us-east-1", "us-west-1", "us-west-2",
     *        "eu-west-1", "eu-central-1", "ap-northeast-1", "ap-southeast-1",
     *        "ap-southeast-2", "sa-east-1"
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withGatewayRegion(String gatewayRegion) {
        setGatewayRegion(gatewayRegion);
        return this;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>STORED</code>.
     * </p>
     * 
     * @param gatewayType
     *        A value that defines the type of gateway to activate. The type
     *        specified is critical to all later functions of the gateway and
     *        cannot be changed after activation. The default value is
     *        <code>STORED</code>.
     */

    public void setGatewayType(String gatewayType) {
        this.gatewayType = gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>STORED</code>.
     * </p>
     * 
     * @return A value that defines the type of gateway to activate. The type
     *         specified is critical to all later functions of the gateway and
     *         cannot be changed after activation. The default value is
     *         <code>STORED</code>.
     */

    public String getGatewayType() {
        return this.gatewayType;
    }

    /**
     * <p>
     * A value that defines the type of gateway to activate. The type specified
     * is critical to all later functions of the gateway and cannot be changed
     * after activation. The default value is <code>STORED</code>.
     * </p>
     * 
     * @param gatewayType
     *        A value that defines the type of gateway to activate. The type
     *        specified is critical to all later functions of the gateway and
     *        cannot be changed after activation. The default value is
     *        <code>STORED</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withGatewayType(String gatewayType) {
        setGatewayType(gatewayType);
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for gateway-VTL.
     * This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @param tapeDriveType
     *        The value that indicates the type of tape drive to use for
     *        gateway-VTL. This field is optional. </p>
     *        <p>
     *        <i>Valid Values</i>: "IBM-ULT3580-TD5"
     */

    public void setTapeDriveType(String tapeDriveType) {
        this.tapeDriveType = tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for gateway-VTL.
     * This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @return The value that indicates the type of tape drive to use for
     *         gateway-VTL. This field is optional. </p>
     *         <p>
     *         <i>Valid Values</i>: "IBM-ULT3580-TD5"
     */

    public String getTapeDriveType() {
        return this.tapeDriveType;
    }

    /**
     * <p>
     * The value that indicates the type of tape drive to use for gateway-VTL.
     * This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "IBM-ULT3580-TD5"
     * </p>
     * 
     * @param tapeDriveType
     *        The value that indicates the type of tape drive to use for
     *        gateway-VTL. This field is optional. </p>
     *        <p>
     *        <i>Valid Values</i>: "IBM-ULT3580-TD5"
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withTapeDriveType(String tapeDriveType) {
        setTapeDriveType(tapeDriveType);
        return this;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for
     * gateway-VTL. This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param mediumChangerType
     *        The value that indicates the type of medium changer to use for
     *        gateway-VTL. This field is optional.</p>
     *        <p>
     *        <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     */

    public void setMediumChangerType(String mediumChangerType) {
        this.mediumChangerType = mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for
     * gateway-VTL. This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @return The value that indicates the type of medium changer to use for
     *         gateway-VTL. This field is optional.</p>
     *         <p>
     *         <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     */

    public String getMediumChangerType() {
        return this.mediumChangerType;
    }

    /**
     * <p>
     * The value that indicates the type of medium changer to use for
     * gateway-VTL. This field is optional.
     * </p>
     * <p>
     * <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     * </p>
     * 
     * @param mediumChangerType
     *        The value that indicates the type of medium changer to use for
     *        gateway-VTL. This field is optional.</p>
     *        <p>
     *        <i>Valid Values</i>: "STK-L700", "AWS-Gateway-VTL"
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ActivateGatewayRequest withMediumChangerType(String mediumChangerType) {
        setMediumChangerType(mediumChangerType);
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
        if (getActivationKey() != null)
            sb.append("ActivationKey: " + getActivationKey() + ",");
        if (getGatewayName() != null)
            sb.append("GatewayName: " + getGatewayName() + ",");
        if (getGatewayTimezone() != null)
            sb.append("GatewayTimezone: " + getGatewayTimezone() + ",");
        if (getGatewayRegion() != null)
            sb.append("GatewayRegion: " + getGatewayRegion() + ",");
        if (getGatewayType() != null)
            sb.append("GatewayType: " + getGatewayType() + ",");
        if (getTapeDriveType() != null)
            sb.append("TapeDriveType: " + getTapeDriveType() + ",");
        if (getMediumChangerType() != null)
            sb.append("MediumChangerType: " + getMediumChangerType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActivateGatewayRequest == false)
            return false;
        ActivateGatewayRequest other = (ActivateGatewayRequest) obj;
        if (other.getActivationKey() == null ^ this.getActivationKey() == null)
            return false;
        if (other.getActivationKey() != null
                && other.getActivationKey().equals(this.getActivationKey()) == false)
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
        if (other.getGatewayRegion() == null ^ this.getGatewayRegion() == null)
            return false;
        if (other.getGatewayRegion() != null
                && other.getGatewayRegion().equals(this.getGatewayRegion()) == false)
            return false;
        if (other.getGatewayType() == null ^ this.getGatewayType() == null)
            return false;
        if (other.getGatewayType() != null
                && other.getGatewayType().equals(this.getGatewayType()) == false)
            return false;
        if (other.getTapeDriveType() == null ^ this.getTapeDriveType() == null)
            return false;
        if (other.getTapeDriveType() != null
                && other.getTapeDriveType().equals(this.getTapeDriveType()) == false)
            return false;
        if (other.getMediumChangerType() == null
                ^ this.getMediumChangerType() == null)
            return false;
        if (other.getMediumChangerType() != null
                && other.getMediumChangerType().equals(
                        this.getMediumChangerType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getActivationKey() == null) ? 0 : getActivationKey()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayName() == null) ? 0 : getGatewayName().hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayTimezone() == null) ? 0 : getGatewayTimezone()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayRegion() == null) ? 0 : getGatewayRegion()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getGatewayType() == null) ? 0 : getGatewayType().hashCode());
        hashCode = prime
                * hashCode
                + ((getTapeDriveType() == null) ? 0 : getTapeDriveType()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getMediumChangerType() == null) ? 0
                        : getMediumChangerType().hashCode());
        return hashCode;
    }

    @Override
    public ActivateGatewayRequest clone() {
        return (ActivateGatewayRequest) super.clone();
    }
}