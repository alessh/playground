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

package com.amazonaws.services.ecr.model;

import com.amazonaws.AmazonServiceException;

/**
 * <p>
 * The layer part size is not valid, or the first byte specified is not
 * consecutive to the last byte of a previous layer part upload.
 * </p>
 */
public class InvalidLayerPartException extends AmazonServiceException {
    private static final long serialVersionUID = 1L;

    /**
     * <p>
     * The registry ID associated with the exception.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("registryId")
    private String registryId;
    /**
     * <p>
     * The repository name associated with the exception.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryName")
    private String repositoryName;
    /**
     * <p>
     * The upload ID associated with the exception.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uploadId")
    private String uploadId;
    /**
     * <p>
     * The last valid byte received from the layer part upload that is
     * associated with the exception.
     * </p>
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastValidByteReceived")
    private Long lastValidByteReceived;

    /**
     * Constructs a new InvalidLayerPartException with the specified error
     * message.
     *
     * @param message
     *        Describes the error encountered.
     */
    public InvalidLayerPartException(String message) {
        super(message);
    }

    /**
     * <p>
     * The registry ID associated with the exception.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the exception.
     */

    public void setRegistryId(String registryId) {
        this.registryId = registryId;
    }

    /**
     * <p>
     * The registry ID associated with the exception.
     * </p>
     * 
     * @return The registry ID associated with the exception.
     */

    public String getRegistryId() {
        return this.registryId;
    }

    /**
     * <p>
     * The registry ID associated with the exception.
     * </p>
     * 
     * @param registryId
     *        The registry ID associated with the exception.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidLayerPartException withRegistryId(String registryId) {
        setRegistryId(registryId);
        return this;
    }

    /**
     * <p>
     * The repository name associated with the exception.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the exception.
     */

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the exception.
     * </p>
     * 
     * @return The repository name associated with the exception.
     */

    public String getRepositoryName() {
        return this.repositoryName;
    }

    /**
     * <p>
     * The repository name associated with the exception.
     * </p>
     * 
     * @param repositoryName
     *        The repository name associated with the exception.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidLayerPartException withRepositoryName(String repositoryName) {
        setRepositoryName(repositoryName);
        return this;
    }

    /**
     * <p>
     * The upload ID associated with the exception.
     * </p>
     * 
     * @param uploadId
     *        The upload ID associated with the exception.
     */

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    /**
     * <p>
     * The upload ID associated with the exception.
     * </p>
     * 
     * @return The upload ID associated with the exception.
     */

    public String getUploadId() {
        return this.uploadId;
    }

    /**
     * <p>
     * The upload ID associated with the exception.
     * </p>
     * 
     * @param uploadId
     *        The upload ID associated with the exception.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidLayerPartException withUploadId(String uploadId) {
        setUploadId(uploadId);
        return this;
    }

    /**
     * <p>
     * The last valid byte received from the layer part upload that is
     * associated with the exception.
     * </p>
     * 
     * @param lastValidByteReceived
     *        The last valid byte received from the layer part upload that is
     *        associated with the exception.
     */

    public void setLastValidByteReceived(Long lastValidByteReceived) {
        this.lastValidByteReceived = lastValidByteReceived;
    }

    /**
     * <p>
     * The last valid byte received from the layer part upload that is
     * associated with the exception.
     * </p>
     * 
     * @return The last valid byte received from the layer part upload that is
     *         associated with the exception.
     */

    public Long getLastValidByteReceived() {
        return this.lastValidByteReceived;
    }

    /**
     * <p>
     * The last valid byte received from the layer part upload that is
     * associated with the exception.
     * </p>
     * 
     * @param lastValidByteReceived
     *        The last valid byte received from the layer part upload that is
     *        associated with the exception.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public InvalidLayerPartException withLastValidByteReceived(
            Long lastValidByteReceived) {
        setLastValidByteReceived(lastValidByteReceived);
        return this;
    }

}