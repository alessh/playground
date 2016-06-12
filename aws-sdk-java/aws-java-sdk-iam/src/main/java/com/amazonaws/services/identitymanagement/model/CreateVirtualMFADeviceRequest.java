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

package com.amazonaws.services.identitymanagement.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateVirtualMFADeviceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     */
    private String path;
    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a
     * virtual MFA device.
     * </p>
     */
    private String virtualMFADeviceName;

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path for the virtual MFA device. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @return The path for the virtual MFA device. For more information about
     *         paths, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *         >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *         <p>
     *         This parameter is optional. If it is not included, it defaults to
     *         a slash (/).
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path for the virtual MFA device. For more information about paths,
     * see <a href=
     * "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     * >IAM Identifiers</a> in the <i>Using IAM</i> guide.
     * </p>
     * <p>
     * This parameter is optional. If it is not included, it defaults to a slash
     * (/).
     * </p>
     * 
     * @param path
     *        The path for the virtual MFA device. For more information about
     *        paths, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/Using_Identifiers.html"
     *        >IAM Identifiers</a> in the <i>Using IAM</i> guide. </p>
     *        <p>
     *        This parameter is optional. If it is not included, it defaults to
     *        a slash (/).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateVirtualMFADeviceRequest withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a
     * virtual MFA device.
     * </p>
     * 
     * @param virtualMFADeviceName
     *        The name of the virtual MFA device. Use with path to uniquely
     *        identify a virtual MFA device.
     */

    public void setVirtualMFADeviceName(String virtualMFADeviceName) {
        this.virtualMFADeviceName = virtualMFADeviceName;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a
     * virtual MFA device.
     * </p>
     * 
     * @return The name of the virtual MFA device. Use with path to uniquely
     *         identify a virtual MFA device.
     */

    public String getVirtualMFADeviceName() {
        return this.virtualMFADeviceName;
    }

    /**
     * <p>
     * The name of the virtual MFA device. Use with path to uniquely identify a
     * virtual MFA device.
     * </p>
     * 
     * @param virtualMFADeviceName
     *        The name of the virtual MFA device. Use with path to uniquely
     *        identify a virtual MFA device.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateVirtualMFADeviceRequest withVirtualMFADeviceName(
            String virtualMFADeviceName) {
        setVirtualMFADeviceName(virtualMFADeviceName);
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
        if (getPath() != null)
            sb.append("Path: " + getPath() + ",");
        if (getVirtualMFADeviceName() != null)
            sb.append("VirtualMFADeviceName: " + getVirtualMFADeviceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateVirtualMFADeviceRequest == false)
            return false;
        CreateVirtualMFADeviceRequest other = (CreateVirtualMFADeviceRequest) obj;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null
                && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getVirtualMFADeviceName() == null
                ^ this.getVirtualMFADeviceName() == null)
            return false;
        if (other.getVirtualMFADeviceName() != null
                && other.getVirtualMFADeviceName().equals(
                        this.getVirtualMFADeviceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime
                * hashCode
                + ((getVirtualMFADeviceName() == null) ? 0
                        : getVirtualMFADeviceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateVirtualMFADeviceRequest clone() {
        return (CreateVirtualMFADeviceRequest) super.clone();
    }
}