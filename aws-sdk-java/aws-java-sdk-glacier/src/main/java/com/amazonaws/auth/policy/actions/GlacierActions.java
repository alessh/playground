/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The available AWS access control policy actions for Amazon Glacier.
 */
public enum GlacierActions implements Action {
    /** Represents any action executed on Amazon Glacier. */
    AllGlacierActions("glacier:*"),

    /** Action for the AbortMultipartUpload operation. */
    AbortMultipartUpload("glacier:AbortMultipartUpload"),

    /** Action for the CompleteMultipartUpload operation. */
    CompleteMultipartUpload("glacier:CompleteMultipartUpload"),

    /** Action for the CreateVault operation. */
    CreateVault("glacier:CreateVault"),

    /** Action for the DeleteArchive operation. */
    DeleteArchive("glacier:DeleteArchive"),

    /** Action for the DeleteVault operation. */
    DeleteVault("glacier:DeleteVault"),

    /** Action for the DeleteVaultNotifications operation. */
    DeleteVaultNotifications("glacier:DeleteVaultNotifications"),

    /** Action for the DescribeJob operation. */
    DescribeJob("glacier:DescribeJob"),

    /** Action for the DescribeVault operation. */
    DescribeVault("glacier:DescribeVault"),

    /** Action for the GetJobOutput operation. */
    GetJobOutput("glacier:GetJobOutput"),

    /** Action for the GetVaultNotifications operation. */
    GetVaultNotifications("glacier:GetVaultNotifications"),

    /** Action for the InitiateMultipartUpload operation. */
    InitiateMultipartUpload("glacier:InitiateMultipartUpload"),

    /** Action for the InitiateJob operation. */
    InitiateJob("glacier:InitiateJob"),

    /** Action for the ListJobs operation. */
    ListJobs("glacier:ListJobs"),

    /** Action for the ListMultipartUploads operation. */
    ListMultipartUploads("glacier:ListMultipartUploads"),

    /** Action for the ListParts operation. */
    ListParts("glacier:ListParts"),

    /** Action for the ListVaults operation. */
    ListVaults("glacier:ListVaults"),

    /** Action for the SetVaultNotifications operation. */
    SetVaultNotifications("glacier:SetVaultNotifications"),

    /** Action for the UploadArchive operation. */
    UploadArchive("glacier:UploadArchive"),

    /** Action for the UploadMultipartPart operation. */
    UploadMultipartPart("glacier:UploadMultipartPart");

    private final String action;

    private GlacierActions(String action) {
        this.action = action;
    }

    public String getActionName() {
        return this.action;
    }
}
