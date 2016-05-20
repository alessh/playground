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

package com.amazonaws.auth.policy.actions;

import com.amazonaws.auth.policy.Action;

/**
 * The available AWS access control policy actions for AWS Direct Connect.
 */

public enum DirectConnectActions implements Action {

    /** Represents any action executed on AWS Direct Connect. */
    AllDirectConnectActions("directconnect:*"),

    /** Action for the AllocateConnectionOnInterconnect operation. */
    AllocateConnectionOnInterconnect(
            "directconnect:AllocateConnectionOnInterconnect"),
    /** Action for the AllocatePrivateVirtualInterface operation. */
    AllocatePrivateVirtualInterface(
            "directconnect:AllocatePrivateVirtualInterface"),
    /** Action for the AllocatePublicVirtualInterface operation. */
    AllocatePublicVirtualInterface(
            "directconnect:AllocatePublicVirtualInterface"),
    /** Action for the ConfirmConnection operation. */
    ConfirmConnection("directconnect:ConfirmConnection"),
    /** Action for the ConfirmPrivateVirtualInterface operation. */
    ConfirmPrivateVirtualInterface(
            "directconnect:ConfirmPrivateVirtualInterface"),
    /** Action for the ConfirmPublicVirtualInterface operation. */
    ConfirmPublicVirtualInterface("directconnect:ConfirmPublicVirtualInterface"),
    /** Action for the CreateConnection operation. */
    CreateConnection("directconnect:CreateConnection"),
    /** Action for the CreateInterconnect operation. */
    CreateInterconnect("directconnect:CreateInterconnect"),
    /** Action for the CreatePrivateVirtualInterface operation. */
    CreatePrivateVirtualInterface("directconnect:CreatePrivateVirtualInterface"),
    /** Action for the CreatePublicVirtualInterface operation. */
    CreatePublicVirtualInterface("directconnect:CreatePublicVirtualInterface"),
    /** Action for the DeleteConnection operation. */
    DeleteConnection("directconnect:DeleteConnection"),
    /** Action for the DeleteInterconnect operation. */
    DeleteInterconnect("directconnect:DeleteInterconnect"),
    /** Action for the DeleteVirtualInterface operation. */
    DeleteVirtualInterface("directconnect:DeleteVirtualInterface"),
    /** Action for the DescribeConnections operation. */
    DescribeConnections("directconnect:DescribeConnections"),
    /** Action for the DescribeConnectionsOnInterconnect operation. */
    DescribeConnectionsOnInterconnect(
            "directconnect:DescribeConnectionsOnInterconnect"),
    /** Action for the DescribeInterconnects operation. */
    DescribeInterconnects("directconnect:DescribeInterconnects"),
    /** Action for the DescribeLocations operation. */
    DescribeLocations("directconnect:DescribeLocations"),
    /** Action for the DescribeVirtualGateways operation. */
    DescribeVirtualGateways("directconnect:DescribeVirtualGateways"),
    /** Action for the DescribeVirtualInterfaces operation. */
    DescribeVirtualInterfaces("directconnect:DescribeVirtualInterfaces"),

    ;

    private final String action;

    private DirectConnectActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}