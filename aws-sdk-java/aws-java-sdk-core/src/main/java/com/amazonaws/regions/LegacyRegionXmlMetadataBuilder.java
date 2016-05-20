/*
 * Copyright 2016-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.regions;

import com.amazonaws.AmazonClientException;
import com.amazonaws.SDKGlobalConfiguration;
import com.amazonaws.annotation.SdkInternalApi;
import com.amazonaws.internal.config.Builder;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * A region metadata builder that loads the data by looking at all the
 * legacy metadata locations.
 */
@SdkInternalApi
public class LegacyRegionXmlMetadataBuilder implements Builder<RegionMetadata> {

    private static final String REGIONS_FILE_OVERRIDE =
            SDKGlobalConfiguration.REGIONS_FILE_OVERRIDE_SYSTEM_PROPERTY;

    private static final String OVERRIDE_ENDPOINTS_RESOURCE_PATH =
            "/com/amazonaws/regions/override/regions.xml";

    @Override
    public RegionMetadata build() {
        return loadOverrideMetadataIfExists();
    }

    private RegionMetadata loadOverrideMetadataIfExists() {
        RegionMetadata metadata = loadFromSystemProperty();

        if (metadata == null) {
            InputStream override = RegionUtils.class
                    .getResourceAsStream(OVERRIDE_ENDPOINTS_RESOURCE_PATH);
            if (override != null) {
                metadata = loadFromStream(override);
            }
        }

        return metadata;
    }

    /**
     * Loads region metadata from file location specified in
     * {@link #REGIONS_FILE_OVERRIDE} property.
     * Returns null if no such property exists.
     *
     * @throws AmazonClientException if any error occurs while loading the
     *                               metadata file.
     */
    private RegionMetadata loadFromSystemProperty() {
        final String overrideFilePath = System.getProperty
                (REGIONS_FILE_OVERRIDE);

        if (overrideFilePath != null) {
            try {
                return LegacyRegionXmlLoadUtils.load(new File
                        (overrideFilePath));
            } catch (IOException exception) {
                throw new AmazonClientException(
                        "Error parsing region metadata from " + overrideFilePath,
                        exception);
            }
        }
        return null;
    }

    /**
     * Loads region metadata from file location specified in
     * {@link #REGIONS_FILE_OVERRIDE} property.
     * Returns null if no such property exists.
     *
     * @throws AmazonClientException if any error occurs while loading the
     *                               metadata file.
     */
    private RegionMetadata loadFromStream(final InputStream stream) {
        try {
            return LegacyRegionXmlLoadUtils.load(stream);
        } catch (IOException exception) {
            throw new AmazonClientException(
                    "Error parsing region metadata from input stream",
                    exception);
        }
    }
}
