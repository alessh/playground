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

package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for a request action.
 * </p>
 */
public class ListBuildsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     */
    private String status;
    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     */
    private Integer limit;
    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Build state to filter results on. Use this parameter to retrieve
     *        builds in a certain state. To retrieve all builds, leave this
     *        parameter empty. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @see BuildStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @return Build state to filter results on. Use this parameter to retrieve
     *         builds in a certain state. To retrieve all builds, leave this
     *         parameter empty. Possible build states include:
     *         <ul>
     *         <li>INITIALIZED: A new build has been defined, but no files have
     *         been uploaded. You cannot create fleets for builds that are in
     *         this state. When a build is successfully created, the build state
     *         is set to this value.</li>
     *         <li>READY: The game build has been successfully uploaded. You can
     *         now create new fleets for this build.</li>
     *         <li>FAILED: The game build upload failed. You cannot create new
     *         fleets for this build.</li>
     *         </ul>
     * @see BuildStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Build state to filter results on. Use this parameter to retrieve
     *        builds in a certain state. To retrieve all builds, leave this
     *        parameter empty. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public ListBuildsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Build state to filter results on. Use this parameter to retrieve
     *        builds in a certain state. To retrieve all builds, leave this
     *        parameter empty. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public void setStatus(BuildStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * Build state to filter results on. Use this parameter to retrieve builds
     * in a certain state. To retrieve all builds, leave this parameter empty.
     * Possible build states include:
     * <ul>
     * <li>INITIALIZED: A new build has been defined, but no files have been
     * uploaded. You cannot create fleets for builds that are in this state.
     * When a build is successfully created, the build state is set to this
     * value.</li>
     * <li>READY: The game build has been successfully uploaded. You can now
     * create new fleets for this build.</li>
     * <li>FAILED: The game build upload failed. You cannot create new fleets
     * for this build.</li>
     * </ul>
     * </p>
     * 
     * @param status
     *        Build state to filter results on. Use this parameter to retrieve
     *        builds in a certain state. To retrieve all builds, leave this
     *        parameter empty. Possible build states include:
     *        <ul>
     *        <li>INITIALIZED: A new build has been defined, but no files have
     *        been uploaded. You cannot create fleets for builds that are in
     *        this state. When a build is successfully created, the build state
     *        is set to this value.</li>
     *        <li>READY: The game build has been successfully uploaded. You can
     *        now create new fleets for this build.</li>
     *        <li>FAILED: The game build upload failed. You cannot create new
     *        fleets for this build.</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see BuildStatus
     */

    public ListBuildsRequest withStatus(BuildStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     */

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @return Maximum number of results to return. You can use this parameter
     *         with <i>NextToken</i> to get results as a set of sequential
     *         pages.
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     * <p>
     * Maximum number of results to return. You can use this parameter with
     * <i>NextToken</i> to get results as a set of sequential pages.
     * </p>
     * 
     * @param limit
     *        Maximum number of results to return. You can use this parameter
     *        with <i>NextToken</i> to get results as a set of sequential pages.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListBuildsRequest withLimit(Integer limit) {
        setLimit(limit);
        return this;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        Use the token that is returned with a previous call to this
     *        action. To specify the start of the result set, do not specify a
     *        value.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @return Token indicating the start of the next sequential page of
     *         results. Use the token that is returned with a previous call to
     *         this action. To specify the start of the result set, do not
     *         specify a value.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Token indicating the start of the next sequential page of results. Use
     * the token that is returned with a previous call to this action. To
     * specify the start of the result set, do not specify a value.
     * </p>
     * 
     * @param nextToken
     *        Token indicating the start of the next sequential page of results.
     *        Use the token that is returned with a previous call to this
     *        action. To specify the start of the result set, do not specify a
     *        value.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListBuildsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getLimit() != null)
            sb.append("Limit: " + getLimit() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListBuildsRequest == false)
            return false;
        ListBuildsRequest other = (ListBuildsRequest) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null
                && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLimit() == null ^ this.getLimit() == null)
            return false;
        if (other.getLimit() != null
                && other.getLimit().equals(this.getLimit()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getLimit() == null) ? 0 : getLimit().hashCode());
        hashCode = prime * hashCode
                + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListBuildsRequest clone() {
        return (ListBuildsRequest) super.clone();
    }
}