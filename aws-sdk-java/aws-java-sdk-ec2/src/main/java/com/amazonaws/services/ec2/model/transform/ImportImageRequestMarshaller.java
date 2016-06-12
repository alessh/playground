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

package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;

/**
 * ImportImageRequest Marshaller
 */

public class ImportImageRequestMarshaller implements
        Marshaller<Request<ImportImageRequest>, ImportImageRequest> {

    public Request<ImportImageRequest> marshall(
            ImportImageRequest importImageRequest) {

        if (importImageRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(...)");
        }

        Request<ImportImageRequest> request = new DefaultRequest<ImportImageRequest>(
                importImageRequest, "AmazonEC2");
        request.addParameter("Action", "ImportImage");
        request.addParameter("Version", "2015-10-01");
        request.setHttpMethod(HttpMethodName.POST);

        if (importImageRequest.getDescription() != null) {
            request.addParameter("Description",
                    StringUtils.fromString(importImageRequest.getDescription()));
        }

        com.amazonaws.internal.SdkInternalList<ImageDiskContainer> diskContainersList = (com.amazonaws.internal.SdkInternalList<ImageDiskContainer>) importImageRequest
                .getDiskContainers();
        if (!diskContainersList.isEmpty()
                || !diskContainersList.isAutoConstruct()) {
            int diskContainersListIndex = 1;

            for (ImageDiskContainer diskContainersListValue : diskContainersList) {

                if (diskContainersListValue.getDescription() != null) {
                    request.addParameter("DiskContainer."
                            + diskContainersListIndex + ".Description",
                            StringUtils.fromString(diskContainersListValue
                                    .getDescription()));
                }

                if (diskContainersListValue.getFormat() != null) {
                    request.addParameter("DiskContainer."
                            + diskContainersListIndex + ".Format", StringUtils
                            .fromString(diskContainersListValue.getFormat()));
                }

                if (diskContainersListValue.getUrl() != null) {
                    request.addParameter("DiskContainer."
                            + diskContainersListIndex + ".Url", StringUtils
                            .fromString(diskContainersListValue.getUrl()));
                }

                UserBucket userBucket = diskContainersListValue.getUserBucket();
                if (userBucket != null) {

                    if (userBucket.getS3Bucket() != null) {
                        request.addParameter("DiskContainer."
                                + diskContainersListIndex
                                + ".UserBucket.S3Bucket", StringUtils
                                .fromString(userBucket.getS3Bucket()));
                    }

                    if (userBucket.getS3Key() != null) {
                        request.addParameter(
                                "DiskContainer." + diskContainersListIndex
                                        + ".UserBucket.S3Key",
                                StringUtils.fromString(userBucket.getS3Key()));
                    }
                }

                if (diskContainersListValue.getDeviceName() != null) {
                    request.addParameter("DiskContainer."
                            + diskContainersListIndex + ".DeviceName",
                            StringUtils.fromString(diskContainersListValue
                                    .getDeviceName()));
                }

                if (diskContainersListValue.getSnapshotId() != null) {
                    request.addParameter("DiskContainer."
                            + diskContainersListIndex + ".SnapshotId",
                            StringUtils.fromString(diskContainersListValue
                                    .getSnapshotId()));
                }
                diskContainersListIndex++;
            }
        }

        if (importImageRequest.getLicenseType() != null) {
            request.addParameter("LicenseType",
                    StringUtils.fromString(importImageRequest.getLicenseType()));
        }

        if (importImageRequest.getHypervisor() != null) {
            request.addParameter("Hypervisor",
                    StringUtils.fromString(importImageRequest.getHypervisor()));
        }

        if (importImageRequest.getArchitecture() != null) {
            request.addParameter("Architecture", StringUtils
                    .fromString(importImageRequest.getArchitecture()));
        }

        if (importImageRequest.getPlatform() != null) {
            request.addParameter("Platform",
                    StringUtils.fromString(importImageRequest.getPlatform()));
        }

        ClientData clientData = importImageRequest.getClientData();
        if (clientData != null) {

            if (clientData.getUploadStart() != null) {
                request.addParameter("ClientData.UploadStart",
                        StringUtils.fromDate(clientData.getUploadStart()));
            }

            if (clientData.getUploadEnd() != null) {
                request.addParameter("ClientData.UploadEnd",
                        StringUtils.fromDate(clientData.getUploadEnd()));
            }

            if (clientData.getUploadSize() != null) {
                request.addParameter("ClientData.UploadSize",
                        StringUtils.fromDouble(clientData.getUploadSize()));
            }

            if (clientData.getComment() != null) {
                request.addParameter("ClientData.Comment",
                        StringUtils.fromString(clientData.getComment()));
            }
        }

        if (importImageRequest.getClientToken() != null) {
            request.addParameter("ClientToken",
                    StringUtils.fromString(importImageRequest.getClientToken()));
        }

        if (importImageRequest.getRoleName() != null) {
            request.addParameter("RoleName",
                    StringUtils.fromString(importImageRequest.getRoleName()));
        }

        return request;
    }

}
