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
package com.amazonaws.services.cloudsearch.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateAvailabilityOptions(UpdateAvailabilityOptionsRequest) UpdateAvailabilityOptions operation}.
 * <p>
 * Configures the availability options for a domain. Enabling the
 * Multi-AZ option expands an Amazon CloudSearch domain to an additional
 * Availability Zone in the same Region to increase fault tolerance in
 * the event of a service disruption. Changes to the Multi-AZ option can
 * take about half an hour to become active. For more information, see
 * <a href="http://docs.aws.amazon.com/cloudsearch/latest/developerguide/configuring-availability-options.html"> Configuring Availability Options </a>
 * in the <i>Amazon CloudSearch Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.cloudsearch.AmazonCloudSearch#updateAvailabilityOptions(UpdateAvailabilityOptionsRequest)
 * @deprecated Use {@link com.amazonaws.services.cloudsearchv2.model.UpdateAvailabilityOptionsRequest} instead.
 */
@Deprecated
public class UpdateAvailabilityOptionsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     */
    private String domainName;

    /**
     * You expand an existing search domain to a second Availability Zone by
     * setting the Multi-AZ option to true. Similarly, you can turn off the
     * Multi-AZ option to downgrade the domain to a single Availability Zone
     * by setting the Multi-AZ option to <code>false</code>.
     */
    private Boolean multiAZ;

    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @return A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * A string that represents the name of a domain. Domain names must be
     * unique across the domains owned by an account within an AWS region.
     * Domain names must start with a letter or number and can contain the
     * following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     * letters and underscores are not allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 28<br/>
     * <b>Pattern: </b>[a-z][a-z0-9\-]+<br/>
     *
     * @param domainName A string that represents the name of a domain. Domain names must be
     *         unique across the domains owned by an account within an AWS region.
     *         Domain names must start with a letter or number and can contain the
     *         following characters: a-z (lowercase), 0-9, and - (hyphen). Uppercase
     *         letters and underscores are not allowed.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAvailabilityOptionsRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * You expand an existing search domain to a second Availability Zone by
     * setting the Multi-AZ option to true. Similarly, you can turn off the
     * Multi-AZ option to downgrade the domain to a single Availability Zone
     * by setting the Multi-AZ option to <code>false</code>.
     *
     * @return You expand an existing search domain to a second Availability Zone by
     *         setting the Multi-AZ option to true. Similarly, you can turn off the
     *         Multi-AZ option to downgrade the domain to a single Availability Zone
     *         by setting the Multi-AZ option to <code>false</code>.
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }
    
    /**
     * You expand an existing search domain to a second Availability Zone by
     * setting the Multi-AZ option to true. Similarly, you can turn off the
     * Multi-AZ option to downgrade the domain to a single Availability Zone
     * by setting the Multi-AZ option to <code>false</code>.
     *
     * @param multiAZ You expand an existing search domain to a second Availability Zone by
     *         setting the Multi-AZ option to true. Similarly, you can turn off the
     *         Multi-AZ option to downgrade the domain to a single Availability Zone
     *         by setting the Multi-AZ option to <code>false</code>.
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }
    
    /**
     * You expand an existing search domain to a second Availability Zone by
     * setting the Multi-AZ option to true. Similarly, you can turn off the
     * Multi-AZ option to downgrade the domain to a single Availability Zone
     * by setting the Multi-AZ option to <code>false</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param multiAZ You expand an existing search domain to a second Availability Zone by
     *         setting the Multi-AZ option to true. Similarly, you can turn off the
     *         Multi-AZ option to downgrade the domain to a single Availability Zone
     *         by setting the Multi-AZ option to <code>false</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public UpdateAvailabilityOptionsRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * You expand an existing search domain to a second Availability Zone by
     * setting the Multi-AZ option to true. Similarly, you can turn off the
     * Multi-AZ option to downgrade the domain to a single Availability Zone
     * by setting the Multi-AZ option to <code>false</code>.
     *
     * @return You expand an existing search domain to a second Availability Zone by
     *         setting the Multi-AZ option to true. Similarly, you can turn off the
     *         Multi-AZ option to downgrade the domain to a single Availability Zone
     *         by setting the Multi-AZ option to <code>false</code>.
     */
    public Boolean getMultiAZ() {
        return multiAZ;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (isMultiAZ() != null) sb.append("MultiAZ: " + isMultiAZ() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((isMultiAZ() == null) ? 0 : isMultiAZ().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateAvailabilityOptionsRequest == false) return false;
        UpdateAvailabilityOptionsRequest other = (UpdateAvailabilityOptionsRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.isMultiAZ() == null ^ this.isMultiAZ() == null) return false;
        if (other.isMultiAZ() != null && other.isMultiAZ().equals(this.isMultiAZ()) == false) return false; 
        return true;
    }
    
}
    