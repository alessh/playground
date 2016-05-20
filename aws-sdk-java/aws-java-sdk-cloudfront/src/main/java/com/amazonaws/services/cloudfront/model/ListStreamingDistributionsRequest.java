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

package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * The request to list your streaming distributions.
 */
public class ListStreamingDistributionsRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * Use this when paginating results to indicate where to begin in your list
     * of streaming distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     */
    private String marker;
    /**
     * The maximum number of streaming distributions you want in the response
     * body.
     */
    private String maxItems;

    /**
     * Use this when paginating results to indicate where to begin in your list
     * of streaming distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     * 
     * @param marker
     *        Use this when paginating results to indicate where to begin in
     *        your list of streaming distributions. The results include
     *        distributions in the list that occur after the marker. To get the
     *        next page of results, set the Marker to the value of the
     *        NextMarker from the current page's response (which is also the ID
     *        of the last distribution on that page).
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * Use this when paginating results to indicate where to begin in your list
     * of streaming distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     * 
     * @return Use this when paginating results to indicate where to begin in
     *         your list of streaming distributions. The results include
     *         distributions in the list that occur after the marker. To get the
     *         next page of results, set the Marker to the value of the
     *         NextMarker from the current page's response (which is also the ID
     *         of the last distribution on that page).
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * Use this when paginating results to indicate where to begin in your list
     * of streaming distributions. The results include distributions in the list
     * that occur after the marker. To get the next page of results, set the
     * Marker to the value of the NextMarker from the current page's response
     * (which is also the ID of the last distribution on that page).
     * 
     * @param marker
     *        Use this when paginating results to indicate where to begin in
     *        your list of streaming distributions. The results include
     *        distributions in the list that occur after the marker. To get the
     *        next page of results, set the Marker to the value of the
     *        NextMarker from the current page's response (which is also the ID
     *        of the last distribution on that page).
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListStreamingDistributionsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * The maximum number of streaming distributions you want in the response
     * body.
     * 
     * @param maxItems
     *        The maximum number of streaming distributions you want in the
     *        response body.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * The maximum number of streaming distributions you want in the response
     * body.
     * 
     * @return The maximum number of streaming distributions you want in the
     *         response body.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * The maximum number of streaming distributions you want in the response
     * body.
     * 
     * @param maxItems
     *        The maximum number of streaming distributions you want in the
     *        response body.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public ListStreamingDistributionsRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStreamingDistributionsRequest == false)
            return false;
        ListStreamingDistributionsRequest other = (ListStreamingDistributionsRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null
                && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListStreamingDistributionsRequest clone() {
        return (ListStreamingDistributionsRequest) super.clone();
    }
}