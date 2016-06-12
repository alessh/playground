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

/**
 * <p>
 * Describes an import image task.
 * </p>
 */
public class ImportImageTask implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the import image task.
     * </p>
     */
    private String importTaskId;
    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     */
    private String licenseType;
    /**
     * <p>
     * The description string for the import image task.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The target hypervisor for the import task.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * A description of the import task.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Information about the snapshots.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SnapshotDetail> snapshotDetails;
    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The percentage of progress of the import image task.
     * </p>
     */
    private String progress;
    /**
     * <p>
     * A descriptive status message for the import image task.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A brief status for the import image task.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the import image task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import image task.
     */

    public void setImportTaskId(String importTaskId) {
        this.importTaskId = importTaskId;
    }

    /**
     * <p>
     * The ID of the import image task.
     * </p>
     * 
     * @return The ID of the import image task.
     */

    public String getImportTaskId() {
        return this.importTaskId;
    }

    /**
     * <p>
     * The ID of the import image task.
     * </p>
     * 
     * @param importTaskId
     *        The ID of the import image task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withImportTaskId(String importTaskId) {
        setImportTaskId(importTaskId);
        return this;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @return The architecture of the virtual machine.</p>
     *         <p>
     *         Valid values: <code>i386</code> | <code>x86_64</code>
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the virtual machine.
     * </p>
     * <p>
     * Valid values: <code>i386</code> | <code>x86_64</code>
     * </p>
     * 
     * @param architecture
     *        The architecture of the virtual machine.</p>
     *        <p>
     *        Valid values: <code>i386</code> | <code>x86_64</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @param licenseType
     *        The license type of the virtual machine.
     */

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @return The license type of the virtual machine.
     */

    public String getLicenseType() {
        return this.licenseType;
    }

    /**
     * <p>
     * The license type of the virtual machine.
     * </p>
     * 
     * @param licenseType
     *        The license type of the virtual machine.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withLicenseType(String licenseType) {
        setLicenseType(licenseType);
        return this;
    }

    /**
     * <p>
     * The description string for the import image task.
     * </p>
     * 
     * @param platform
     *        The description string for the import image task.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The description string for the import image task.
     * </p>
     * 
     * @return The description string for the import image task.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The description string for the import image task.
     * </p>
     * 
     * @param platform
     *        The description string for the import image task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The target hypervisor for the import task.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor for the import task.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The target hypervisor for the import task.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @return The target hypervisor for the import task.</p>
     *         <p>
     *         Valid values: <code>xen</code>
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The target hypervisor for the import task.
     * </p>
     * <p>
     * Valid values: <code>xen</code>
     * </p>
     * 
     * @param hypervisor
     *        The target hypervisor for the import task.</p>
     *        <p>
     *        Valid values: <code>xen</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @param description
     *        A description of the import task.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @return A description of the import task.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the import task.
     * </p>
     * 
     * @param description
     *        A description of the import task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @return Information about the snapshots.
     */

    public java.util.List<SnapshotDetail> getSnapshotDetails() {
        if (snapshotDetails == null) {
            snapshotDetails = new com.amazonaws.internal.SdkInternalList<SnapshotDetail>();
        }
        return snapshotDetails;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     */

    public void setSnapshotDetails(
            java.util.Collection<SnapshotDetail> snapshotDetails) {
        if (snapshotDetails == null) {
            this.snapshotDetails = null;
            return;
        }

        this.snapshotDetails = new com.amazonaws.internal.SdkInternalList<SnapshotDetail>(
                snapshotDetails);
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setSnapshotDetails(java.util.Collection)} or
     * {@link #withSnapshotDetails(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withSnapshotDetails(
            SnapshotDetail... snapshotDetails) {
        if (this.snapshotDetails == null) {
            setSnapshotDetails(new com.amazonaws.internal.SdkInternalList<SnapshotDetail>(
                    snapshotDetails.length));
        }
        for (SnapshotDetail ele : snapshotDetails) {
            this.snapshotDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the snapshots.
     * </p>
     * 
     * @param snapshotDetails
     *        Information about the snapshots.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withSnapshotDetails(
            java.util.Collection<SnapshotDetail> snapshotDetails) {
        setSnapshotDetails(snapshotDetails);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) of the imported virtual
     *        machine.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
     * </p>
     * 
     * @return The ID of the Amazon Machine Image (AMI) of the imported virtual
     *         machine.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the Amazon Machine Image (AMI) of the imported virtual machine.
     * </p>
     * 
     * @param imageId
     *        The ID of the Amazon Machine Image (AMI) of the imported virtual
     *        machine.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The percentage of progress of the import image task.
     * </p>
     * 
     * @param progress
     *        The percentage of progress of the import image task.
     */

    public void setProgress(String progress) {
        this.progress = progress;
    }

    /**
     * <p>
     * The percentage of progress of the import image task.
     * </p>
     * 
     * @return The percentage of progress of the import image task.
     */

    public String getProgress() {
        return this.progress;
    }

    /**
     * <p>
     * The percentage of progress of the import image task.
     * </p>
     * 
     * @param progress
     *        The percentage of progress of the import image task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withProgress(String progress) {
        setProgress(progress);
        return this;
    }

    /**
     * <p>
     * A descriptive status message for the import image task.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive status message for the import image task.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A descriptive status message for the import image task.
     * </p>
     * 
     * @return A descriptive status message for the import image task.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A descriptive status message for the import image task.
     * </p>
     * 
     * @param statusMessage
     *        A descriptive status message for the import image task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A brief status for the import image task.
     * </p>
     * 
     * @param status
     *        A brief status for the import image task.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * A brief status for the import image task.
     * </p>
     * 
     * @return A brief status for the import image task.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * A brief status for the import image task.
     * </p>
     * 
     * @param status
     *        A brief status for the import image task.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ImportImageTask withStatus(String status) {
        setStatus(status);
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
        if (getImportTaskId() != null)
            sb.append("ImportTaskId: " + getImportTaskId() + ",");
        if (getArchitecture() != null)
            sb.append("Architecture: " + getArchitecture() + ",");
        if (getLicenseType() != null)
            sb.append("LicenseType: " + getLicenseType() + ",");
        if (getPlatform() != null)
            sb.append("Platform: " + getPlatform() + ",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: " + getHypervisor() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getSnapshotDetails() != null)
            sb.append("SnapshotDetails: " + getSnapshotDetails() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId() + ",");
        if (getProgress() != null)
            sb.append("Progress: " + getProgress() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportImageTask == false)
            return false;
        ImportImageTask other = (ImportImageTask) obj;
        if (other.getImportTaskId() == null ^ this.getImportTaskId() == null)
            return false;
        if (other.getImportTaskId() != null
                && other.getImportTaskId().equals(this.getImportTaskId()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null
                && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getLicenseType() == null ^ this.getLicenseType() == null)
            return false;
        if (other.getLicenseType() != null
                && other.getLicenseType().equals(this.getLicenseType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null
                && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null
                && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSnapshotDetails() == null
                ^ this.getSnapshotDetails() == null)
            return false;
        if (other.getSnapshotDetails() != null
                && other.getSnapshotDetails().equals(this.getSnapshotDetails()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null
                && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getProgress() == null ^ this.getProgress() == null)
            return false;
        if (other.getProgress() != null
                && other.getProgress().equals(this.getProgress()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null
                && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getImportTaskId() == null) ? 0 : getImportTaskId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getArchitecture() == null) ? 0 : getArchitecture()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getLicenseType() == null) ? 0 : getLicenseType().hashCode());
        hashCode = prime * hashCode
                + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode
                + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime
                * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime
                * hashCode
                + ((getSnapshotDetails() == null) ? 0 : getSnapshotDetails()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode
                + ((getProgress() == null) ? 0 : getProgress().hashCode());
        hashCode = prime
                * hashCode
                + ((getStatusMessage() == null) ? 0 : getStatusMessage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public ImportImageTask clone() {
        try {
            return (ImportImageTask) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
