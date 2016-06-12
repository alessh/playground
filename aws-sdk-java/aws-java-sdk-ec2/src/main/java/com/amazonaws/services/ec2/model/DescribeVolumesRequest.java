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
import com.amazonaws.services.ec2.model.transform.DescribeVolumesRequestMarshaller;

/**
 * 
 */
public class DescribeVolumesRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribeVolumesRequest> {

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> volumeIds;
    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name that is exposed to the
     * instance (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for
     * Provisioned IOPS (SSD) volumes, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Filter> filters;
    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     */
    private Integer maxResults;

    /**
     * Default constructor for DescribeVolumesRequest object. Callers should use
     * the setter or fluent setter (with...) methods to initialize the object
     * after creating it.
     */
    public DescribeVolumesRequest() {
    }

    /**
     * Constructs a new DescribeVolumesRequest object. Callers should use the
     * setter or fluent setter (with...) methods to initialize any additional
     * object members.
     * 
     * @param volumeIds
     *        One or more volume IDs.
     */
    public DescribeVolumesRequest(java.util.List<String> volumeIds) {
        setVolumeIds(volumeIds);
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @return One or more volume IDs.
     */

    public java.util.List<String> getVolumeIds() {
        if (volumeIds == null) {
            volumeIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return volumeIds;
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     */

    public void setVolumeIds(java.util.Collection<String> volumeIds) {
        if (volumeIds == null) {
            this.volumeIds = null;
            return;
        }

        this.volumeIds = new com.amazonaws.internal.SdkInternalList<String>(
                volumeIds);
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVolumeIds(java.util.Collection)} or
     * {@link #withVolumeIds(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withVolumeIds(String... volumeIds) {
        if (this.volumeIds == null) {
            setVolumeIds(new com.amazonaws.internal.SdkInternalList<String>(
                    volumeIds.length));
        }
        for (String ele : volumeIds) {
            this.volumeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more volume IDs.
     * </p>
     * 
     * @param volumeIds
     *        One or more volume IDs.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withVolumeIds(
            java.util.Collection<String> volumeIds) {
        setVolumeIds(volumeIds);
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name that is exposed to the
     * instance (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for
     * Provisioned IOPS (SSD) volumes, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>attachment.attach-time</code> - The time stamp when the
     *         attachment initiated.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.delete-on-termination</code> - Whether the
     *         volume is deleted on instance termination.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.device</code> - The device name that is exposed
     *         to the instance (for example, <code>/dev/sda1</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.instance-id</code> - The ID of the instance the
     *         volume is attached to.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>attachment.status</code> - The attachment state (
     *         <code>attaching</code> | <code>attached</code> |
     *         <code>detaching</code> | <code>detached</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>availability-zone</code> - The Availability Zone in which
     *         the volume was created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>create-time</code> - The time stamp when the volume was
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>encrypted</code> - The encryption status of the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>size</code> - The size of the volume, in GiB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>snapshot-id</code> - The snapshot from which the volume was
     *         created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>status</code> - The status of the volume (
     *         <code>creating</code> | <code>available</code> |
     *         <code>in-use</code> | <code>deleting</code> |
     *         <code>deleted</code> | <code>error</code>).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *         combination of a tag assigned to the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-key</code> - The key of a tag assigned to the resource.
     *         This filter is independent of the <code>tag-value</code> filter.
     *         For example, if you use both the filter "tag-key=Purpose" and the
     *         filter "tag-value=X", you get any resources assigned both the tag
     *         key Purpose (regardless of what the tag's value is), and the tag
     *         value X (regardless of what the tag's key is). If you want to
     *         list only resources where Purpose is X, see the <code>tag</code>
     *         :<i>key</i>=<i>value</i> filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>tag-value</code> - The value of a tag assigned to the
     *         resource. This filter is independent of the <code>tag-key</code>
     *         filter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-id</code> - The volume ID.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>volume-type</code> - The Amazon EBS volume type. This can
     *         be <code>gp2</code> for General Purpose (SSD) volumes,
     *         <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *         <code>standard</code> for Magnetic volumes.
     *         </p>
     *         </li>
     */

    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new com.amazonaws.internal.SdkInternalList<Filter>();
        }
        return filters;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name that is exposed to the
     * instance (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for
     * Provisioned IOPS (SSD) volumes, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the
     *        attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name that is exposed
     *        to the instance (for example, <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the
     *        volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (
     *        <code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which
     *        the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (
     *        <code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code>
     *        | <code>error</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be
     *        <code>gp2</code> for General Purpose (SSD) volumes,
     *        <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *        <code>standard</code> for Magnetic volumes.
     *        </p>
     *        </li>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new com.amazonaws.internal.SdkInternalList<Filter>(
                filters);
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name that is exposed to the
     * instance (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for
     * Provisioned IOPS (SSD) volumes, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or
     * {@link #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the
     *        attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name that is exposed
     *        to the instance (for example, <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the
     *        volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (
     *        <code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which
     *        the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (
     *        <code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code>
     *        | <code>error</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be
     *        <code>gp2</code> for General Purpose (SSD) volumes,
     *        <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *        <code>standard</code> for Magnetic volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new com.amazonaws.internal.SdkInternalList<Filter>(
                    filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more filters.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>attachment.attach-time</code> - The time stamp when the attachment
     * initiated.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.delete-on-termination</code> - Whether the volume is
     * deleted on instance termination.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.device</code> - The device name that is exposed to the
     * instance (for example, <code>/dev/sda1</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.instance-id</code> - The ID of the instance the volume
     * is attached to.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>attachment.status</code> - The attachment state (
     * <code>attaching</code> | <code>attached</code> | <code>detaching</code> |
     * <code>detached</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>availability-zone</code> - The Availability Zone in which the
     * volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>create-time</code> - The time stamp when the volume was created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>encrypted</code> - The encryption status of the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>size</code> - The size of the volume, in GiB.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>snapshot-id</code> - The snapshot from which the volume was
     * created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>status</code> - The status of the volume (<code>creating</code> |
     * <code>available</code> | <code>in-use</code> | <code>deleting</code> |
     * <code>deleted</code> | <code>error</code>).
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag</code>:<i>key</i>=<i>value</i> - The key/value combination of a
     * tag assigned to the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-key</code> - The key of a tag assigned to the resource. This
     * filter is independent of the <code>tag-value</code> filter. For example,
     * if you use both the filter "tag-key=Purpose" and the filter
     * "tag-value=X", you get any resources assigned both the tag key Purpose
     * (regardless of what the tag's value is), and the tag value X (regardless
     * of what the tag's key is). If you want to list only resources where
     * Purpose is X, see the <code>tag</code>:<i>key</i>=<i>value</i> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tag-value</code> - The value of a tag assigned to the resource.
     * This filter is independent of the <code>tag-key</code> filter.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-id</code> - The volume ID.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>volume-type</code> - The Amazon EBS volume type. This can be
     * <code>gp2</code> for General Purpose (SSD) volumes, <code>io1</code> for
     * Provisioned IOPS (SSD) volumes, or <code>standard</code> for Magnetic
     * volumes.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filters
     *        One or more filters.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>attachment.attach-time</code> - The time stamp when the
     *        attachment initiated.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.delete-on-termination</code> - Whether the volume
     *        is deleted on instance termination.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.device</code> - The device name that is exposed
     *        to the instance (for example, <code>/dev/sda1</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.instance-id</code> - The ID of the instance the
     *        volume is attached to.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>attachment.status</code> - The attachment state (
     *        <code>attaching</code> | <code>attached</code> |
     *        <code>detaching</code> | <code>detached</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>availability-zone</code> - The Availability Zone in which
     *        the volume was created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>create-time</code> - The time stamp when the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>encrypted</code> - The encryption status of the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>size</code> - The size of the volume, in GiB.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>snapshot-id</code> - The snapshot from which the volume was
     *        created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>status</code> - The status of the volume (
     *        <code>creating</code> | <code>available</code> |
     *        <code>in-use</code> | <code>deleting</code> | <code>deleted</code>
     *        | <code>error</code>).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag</code>:<i>key</i>=<i>value</i> - The key/value
     *        combination of a tag assigned to the resource.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-key</code> - The key of a tag assigned to the resource.
     *        This filter is independent of the <code>tag-value</code> filter.
     *        For example, if you use both the filter "tag-key=Purpose" and the
     *        filter "tag-value=X", you get any resources assigned both the tag
     *        key Purpose (regardless of what the tag's value is), and the tag
     *        value X (regardless of what the tag's key is). If you want to list
     *        only resources where Purpose is X, see the <code>tag</code>
     *        :<i>key</i>=<i>value</i> filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>tag-value</code> - The value of a tag assigned to the
     *        resource. This filter is independent of the <code>tag-key</code>
     *        filter.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-id</code> - The volume ID.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>volume-type</code> - The Amazon EBS volume type. This can be
     *        <code>gp2</code> for General Purpose (SSD) volumes,
     *        <code>io1</code> for Provisioned IOPS (SSD) volumes, or
     *        <code>standard</code> for Magnetic volumes.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withFilters(
            java.util.Collection<Filter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous
     *        paginated <code>DescribeVolumes</code> request where
     *        <code>MaxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @return The <code>NextToken</code> value returned from a previous
     *         paginated <code>DescribeVolumes</code> request where
     *         <code>MaxResults</code> was used and the results exceeded the
     *         value of that parameter. Pagination continues from the end of the
     *         previous results that returned the <code>NextToken</code> value.
     *         This value is <code>null</code> when there are no more results to
     *         return.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The <code>NextToken</code> value returned from a previous paginated
     * <code>DescribeVolumes</code> request where <code>MaxResults</code> was
     * used and the results exceeded the value of that parameter. Pagination
     * continues from the end of the previous results that returned the
     * <code>NextToken</code> value. This value is <code>null</code> when there
     * are no more results to return.
     * </p>
     * 
     * @param nextToken
     *        The <code>NextToken</code> value returned from a previous
     *        paginated <code>DescribeVolumes</code> request where
     *        <code>MaxResults</code> was used and the results exceeded the
     *        value of that parameter. Pagination continues from the end of the
     *        previous results that returned the <code>NextToken</code> value.
     *        This value is <code>null</code> when there are no more results to
     *        return.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by
     *        <code>DescribeVolumes</code> in paginated output. When this
     *        parameter is used, <code>DescribeVolumes</code> only returns
     *        <code>MaxResults</code> results in a single page along with a
     *        <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another
     *        <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and
     *        1000; if <code>MaxResults</code> is given a value larger than
     *        1000, only 1000 results are returned. If this parameter is not
     *        used, then <code>DescribeVolumes</code> returns all results. You
     *        cannot specify this parameter and the volume IDs parameter in the
     *        same request.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @return The maximum number of volume results returned by
     *         <code>DescribeVolumes</code> in paginated output. When this
     *         parameter is used, <code>DescribeVolumes</code> only returns
     *         <code>MaxResults</code> results in a single page along with a
     *         <code>NextToken</code> response element. The remaining results of
     *         the initial request can be seen by sending another
     *         <code>DescribeVolumes</code> request with the returned
     *         <code>NextToken</code> value. This value can be between 5 and
     *         1000; if <code>MaxResults</code> is given a value larger than
     *         1000, only 1000 results are returned. If this parameter is not
     *         used, then <code>DescribeVolumes</code> returns all results. You
     *         cannot specify this parameter and the volume IDs parameter in the
     *         same request.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of volume results returned by
     * <code>DescribeVolumes</code> in paginated output. When this parameter is
     * used, <code>DescribeVolumes</code> only returns <code>MaxResults</code>
     * results in a single page along with a <code>NextToken</code> response
     * element. The remaining results of the initial request can be seen by
     * sending another <code>DescribeVolumes</code> request with the returned
     * <code>NextToken</code> value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value larger than 1000, only 1000
     * results are returned. If this parameter is not used, then
     * <code>DescribeVolumes</code> returns all results. You cannot specify this
     * parameter and the volume IDs parameter in the same request.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of volume results returned by
     *        <code>DescribeVolumes</code> in paginated output. When this
     *        parameter is used, <code>DescribeVolumes</code> only returns
     *        <code>MaxResults</code> results in a single page along with a
     *        <code>NextToken</code> response element. The remaining results of
     *        the initial request can be seen by sending another
     *        <code>DescribeVolumes</code> request with the returned
     *        <code>NextToken</code> value. This value can be between 5 and
     *        1000; if <code>MaxResults</code> is given a value larger than
     *        1000, only 1000 results are returned. If this parameter is not
     *        used, then <code>DescribeVolumes</code> returns all results. You
     *        cannot specify this parameter and the volume IDs parameter in the
     *        same request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public DescribeVolumesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled
     * request configured with additional parameters to enable operation
     * dry-run.
     */
    @Override
    public Request<DescribeVolumesRequest> getDryRunRequest() {
        Request<DescribeVolumesRequest> request = new DescribeVolumesRequestMarshaller()
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
        if (getVolumeIds() != null)
            sb.append("VolumeIds: " + getVolumeIds() + ",");
        if (getFilters() != null)
            sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeVolumesRequest == false)
            return false;
        DescribeVolumesRequest other = (DescribeVolumesRequest) obj;
        if (other.getVolumeIds() == null ^ this.getVolumeIds() == null)
            return false;
        if (other.getVolumeIds() != null
                && other.getVolumeIds().equals(this.getVolumeIds()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null
                && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVolumeIds() == null) ? 0 : getVolumeIds().hashCode());
        hashCode = prime * hashCode
                + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode
                + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public DescribeVolumesRequest clone() {
        return (DescribeVolumesRequest) super.clone();
    }
}