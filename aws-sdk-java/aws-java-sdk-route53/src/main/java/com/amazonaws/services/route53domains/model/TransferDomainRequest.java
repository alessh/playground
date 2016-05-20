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

package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The TransferDomain request includes the following elements.
 * </p>
 */
public class TransferDomainRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z,
     * the numbers 0 through 9, and hyphen (-). Internationalized Domain Names
     * are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Reserved for future use.
     * </p>
     */
    private String idnLangCode;
    /**
     * <p>
     * The number of years the domain will be registered. Domains are registered
     * for a minimum of one year. The maximum period depends on the top-level
     * domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private Integer durationInYears;
    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>GlueIps</code>, <code>Name</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Nameserver> nameservers;
    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String authCode;
    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean autoRenew;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail adminContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail registrantContact;
    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private ContactDetail techContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean privacyProtectAdminContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean privacyProtectRegistrantContact;
    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     */
    private Boolean privacyProtectTechContact;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z,
     * the numbers 0 through 9, and hyphen (-). Internationalized Domain Names
     * are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a
     *        through z, the numbers 0 through 9, and hyphen (-).
     *        Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z,
     * the numbers 0 through 9, and hyphen (-). Internationalized Domain Names
     * are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a
     *         through z, the numbers 0 through 9, and hyphen (-).
     *         Internationalized Domain Names are not supported.
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z,
     * the numbers 0 through 9, and hyphen (-). Internationalized Domain Names
     * are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a
     *        through z, the numbers 0 through 9, and hyphen (-).
     *        Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     */

    public void setIdnLangCode(String idnLangCode) {
        this.idnLangCode = idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @return Reserved for future use.
     */

    public String getIdnLangCode() {
        return this.idnLangCode;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * 
     * @param idnLangCode
     *        Reserved for future use.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withIdnLangCode(String idnLangCode) {
        setIdnLangCode(idnLangCode);
        return this;
    }

    /**
     * <p>
     * The number of years the domain will be registered. Domains are registered
     * for a minimum of one year. The maximum period depends on the top-level
     * domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param durationInYears
     *        The number of years the domain will be registered. Domains are
     *        registered for a minimum of one year. The maximum period depends
     *        on the top-level domain.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: Integer from 1 to 10
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDurationInYears(Integer durationInYears) {
        this.durationInYears = durationInYears;
    }

    /**
     * <p>
     * The number of years the domain will be registered. Domains are registered
     * for a minimum of one year. The maximum period depends on the top-level
     * domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The number of years the domain will be registered. Domains are
     *         registered for a minimum of one year. The maximum period depends
     *         on the top-level domain.</p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid values: Integer from 1 to 10
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public Integer getDurationInYears() {
        return this.durationInYears;
    }

    /**
     * <p>
     * The number of years the domain will be registered. Domains are registered
     * for a minimum of one year. The maximum period depends on the top-level
     * domain.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid values: Integer from 1 to 10
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param durationInYears
     *        The number of years the domain will be registered. Domains are
     *        registered for a minimum of one year. The maximum period depends
     *        on the top-level domain.</p>
     *        <p>
     *        Type: Integer
     *        </p>
     *        <p>
     *        Default: 1
     *        </p>
     *        <p>
     *        Valid values: Integer from 1 to 10
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withDurationInYears(Integer durationInYears) {
        setDurationInYears(durationInYears);
        return this;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>GlueIps</code>, <code>Name</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Contains details for the host and glue IP addresses.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>GlueIps</code>, <code>Name</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
            nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>();
        }
        return nameservers;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>GlueIps</code>, <code>Name</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>GlueIps</code>, <code>Name</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>(
                nameservers);
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>GlueIps</code>, <code>Name</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNameservers(java.util.Collection)} or
     * {@link #withNameservers(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>GlueIps</code>, <code>Name</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withNameservers(Nameserver... nameservers) {
        if (this.nameservers == null) {
            setNameservers(new com.amazonaws.internal.SdkInternalList<Nameserver>(
                    nameservers.length));
        }
        for (Nameserver ele : nameservers) {
            this.nameservers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains details for the host and glue IP addresses.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>GlueIps</code>, <code>Name</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param nameservers
     *        Contains details for the host and glue IP addresses.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>GlueIps</code>, <code>Name</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withNameservers(
            java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
        return this;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain. You get this value from the
     *        current registrar.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The authorization code for the domain. You get this value from
     *         the current registrar.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getAuthCode() {
        return this.authCode;
    }

    /**
     * <p>
     * The authorization code for the domain. You get this value from the
     * current registrar.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param authCode
     *        The authorization code for the domain. You get this value from the
     *        current registrar.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withAuthCode(String authCode) {
        setAuthCode(authCode);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain will be automatically renewed (true)
     *        or not (false). Autorenewal only takes effect after the account is
     *        charged.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: true
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Indicates whether the domain will be automatically renewed (true)
     *         or not (false). Autorenewal only takes effect after the account
     *         is charged.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param autoRenew
     *        Indicates whether the domain will be automatically renewed (true)
     *        or not (false). Autorenewal only takes effect after the account is
     *        charged.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Default: true
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withAutoRenew(Boolean autoRenew) {
        setAutoRenew(autoRenew);
        return this;
    }

    /**
     * <p>
     * Indicates whether the domain will be automatically renewed (true) or not
     * (false). Autorenewal only takes effect after the account is charged.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Default: true
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Indicates whether the domain will be automatically renewed (true)
     *         or not (false). Autorenewal only takes effect after the account
     *         is charged.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Default: true
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isAutoRenew() {
        return this.autoRenew;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setAdminContact(ContactDetail adminContact) {
        this.adminContact = adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getAdminContact() {
        return this.adminContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param adminContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withAdminContact(ContactDetail adminContact) {
        setAdminContact(adminContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setRegistrantContact(ContactDetail registrantContact) {
        this.registrantContact = registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getRegistrantContact() {
        return this.registrantContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param registrantContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withRegistrantContact(
            ContactDetail registrantContact) {
        setRegistrantContact(registrantContact);
        return this;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setTechContact(ContactDetail techContact) {
        this.techContact = techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return Provides detailed contact information.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>FirstName</code>, <code>MiddleName</code>,
     *         <code>LastName</code>, <code>ContactType</code>,
     *         <code>OrganizationName</code>, <code>AddressLine1</code>,
     *         <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *         <code>CountryCode</code>, <code>ZipCode</code>,
     *         <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *         <code>ExtraParams</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public ContactDetail getTechContact() {
        return this.techContact;
    }

    /**
     * <p>
     * Provides detailed contact information.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>FirstName</code>, <code>MiddleName</code>,
     * <code>LastName</code>, <code>ContactType</code>,
     * <code>OrganizationName</code>, <code>AddressLine1</code>,
     * <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     * <code>CountryCode</code>, <code>ZipCode</code>, <code>PhoneNumber</code>,
     * <code>Email</code>, <code>Fax</code>, <code>ExtraParams</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param techContact
     *        Provides detailed contact information.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>FirstName</code>, <code>MiddleName</code>,
     *        <code>LastName</code>, <code>ContactType</code>,
     *        <code>OrganizationName</code>, <code>AddressLine1</code>,
     *        <code>AddressLine2</code>, <code>City</code>, <code>State</code>,
     *        <code>CountryCode</code>, <code>ZipCode</code>,
     *        <code>PhoneNumber</code>, <code>Email</code>, <code>Fax</code>,
     *        <code>ExtraParams</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withTechContact(ContactDetail techContact) {
        setTechContact(techContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectAdminContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setPrivacyProtectAdminContact(Boolean privacyProtectAdminContact) {
        this.privacyProtectAdminContact = privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getPrivacyProtectAdminContact() {
        return this.privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectAdminContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withPrivacyProtectAdminContact(
            Boolean privacyProtectAdminContact) {
        setPrivacyProtectAdminContact(privacyProtectAdminContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isPrivacyProtectAdminContact() {
        return this.privacyProtectAdminContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectRegistrantContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setPrivacyProtectRegistrantContact(
            Boolean privacyProtectRegistrantContact) {
        this.privacyProtectRegistrantContact = privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getPrivacyProtectRegistrantContact() {
        return this.privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectRegistrantContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withPrivacyProtectRegistrantContact(
            Boolean privacyProtectRegistrantContact) {
        setPrivacyProtectRegistrantContact(privacyProtectRegistrantContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isPrivacyProtectRegistrantContact() {
        return this.privacyProtectRegistrantContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectTechContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     */

    public void setPrivacyProtectTechContact(Boolean privacyProtectTechContact) {
        this.privacyProtectTechContact = privacyProtectTechContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean getPrivacyProtectTechContact() {
        return this.privacyProtectTechContact;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @param privacyProtectTechContact
     *        Whether you want to conceal contact information from WHOIS
     *        queries. If you specify true, WHOIS ("who is") queries will return
     *        contact information for our registrar partner, Gandi, instead of
     *        the contact information that you enter.</p>
     *        <p>
     *        Type: Boolean
     *        </p>
     *        <p>
     *        Default: <code>true</code>
     *        </p>
     *        <p>
     *        Valid values: <code>true</code> | <code>false</code>
     *        </p>
     *        <p>
     *        Required: No
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public TransferDomainRequest withPrivacyProtectTechContact(
            Boolean privacyProtectTechContact) {
        setPrivacyProtectTechContact(privacyProtectTechContact);
        return this;
    }

    /**
     * <p>
     * Whether you want to conceal contact information from WHOIS queries. If
     * you specify true, WHOIS ("who is") queries will return contact
     * information for our registrar partner, Gandi, instead of the contact
     * information that you enter.
     * </p>
     * <p>
     * Type: Boolean
     * </p>
     * <p>
     * Default: <code>true</code>
     * </p>
     * <p>
     * Valid values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Required: No
     * </p>
     * 
     * @return Whether you want to conceal contact information from WHOIS
     *         queries. If you specify true, WHOIS ("who is") queries will
     *         return contact information for our registrar partner, Gandi,
     *         instead of the contact information that you enter.</p>
     *         <p>
     *         Type: Boolean
     *         </p>
     *         <p>
     *         Default: <code>true</code>
     *         </p>
     *         <p>
     *         Valid values: <code>true</code> | <code>false</code>
     *         </p>
     *         <p>
     *         Required: No
     */

    public Boolean isPrivacyProtectTechContact() {
        return this.privacyProtectTechContact;
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getIdnLangCode() != null)
            sb.append("IdnLangCode: " + getIdnLangCode() + ",");
        if (getDurationInYears() != null)
            sb.append("DurationInYears: " + getDurationInYears() + ",");
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers() + ",");
        if (getAuthCode() != null)
            sb.append("AuthCode: " + getAuthCode() + ",");
        if (getAutoRenew() != null)
            sb.append("AutoRenew: " + getAutoRenew() + ",");
        if (getAdminContact() != null)
            sb.append("AdminContact: " + getAdminContact() + ",");
        if (getRegistrantContact() != null)
            sb.append("RegistrantContact: " + getRegistrantContact() + ",");
        if (getTechContact() != null)
            sb.append("TechContact: " + getTechContact() + ",");
        if (getPrivacyProtectAdminContact() != null)
            sb.append("PrivacyProtectAdminContact: "
                    + getPrivacyProtectAdminContact() + ",");
        if (getPrivacyProtectRegistrantContact() != null)
            sb.append("PrivacyProtectRegistrantContact: "
                    + getPrivacyProtectRegistrantContact() + ",");
        if (getPrivacyProtectTechContact() != null)
            sb.append("PrivacyProtectTechContact: "
                    + getPrivacyProtectTechContact());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TransferDomainRequest == false)
            return false;
        TransferDomainRequest other = (TransferDomainRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null
                && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getIdnLangCode() == null ^ this.getIdnLangCode() == null)
            return false;
        if (other.getIdnLangCode() != null
                && other.getIdnLangCode().equals(this.getIdnLangCode()) == false)
            return false;
        if (other.getDurationInYears() == null
                ^ this.getDurationInYears() == null)
            return false;
        if (other.getDurationInYears() != null
                && other.getDurationInYears().equals(this.getDurationInYears()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null
                && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        if (other.getAuthCode() == null ^ this.getAuthCode() == null)
            return false;
        if (other.getAuthCode() != null
                && other.getAuthCode().equals(this.getAuthCode()) == false)
            return false;
        if (other.getAutoRenew() == null ^ this.getAutoRenew() == null)
            return false;
        if (other.getAutoRenew() != null
                && other.getAutoRenew().equals(this.getAutoRenew()) == false)
            return false;
        if (other.getAdminContact() == null ^ this.getAdminContact() == null)
            return false;
        if (other.getAdminContact() != null
                && other.getAdminContact().equals(this.getAdminContact()) == false)
            return false;
        if (other.getRegistrantContact() == null
                ^ this.getRegistrantContact() == null)
            return false;
        if (other.getRegistrantContact() != null
                && other.getRegistrantContact().equals(
                        this.getRegistrantContact()) == false)
            return false;
        if (other.getTechContact() == null ^ this.getTechContact() == null)
            return false;
        if (other.getTechContact() != null
                && other.getTechContact().equals(this.getTechContact()) == false)
            return false;
        if (other.getPrivacyProtectAdminContact() == null
                ^ this.getPrivacyProtectAdminContact() == null)
            return false;
        if (other.getPrivacyProtectAdminContact() != null
                && other.getPrivacyProtectAdminContact().equals(
                        this.getPrivacyProtectAdminContact()) == false)
            return false;
        if (other.getPrivacyProtectRegistrantContact() == null
                ^ this.getPrivacyProtectRegistrantContact() == null)
            return false;
        if (other.getPrivacyProtectRegistrantContact() != null
                && other.getPrivacyProtectRegistrantContact().equals(
                        this.getPrivacyProtectRegistrantContact()) == false)
            return false;
        if (other.getPrivacyProtectTechContact() == null
                ^ this.getPrivacyProtectTechContact() == null)
            return false;
        if (other.getPrivacyProtectTechContact() != null
                && other.getPrivacyProtectTechContact().equals(
                        this.getPrivacyProtectTechContact()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime
                * hashCode
                + ((getIdnLangCode() == null) ? 0 : getIdnLangCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getDurationInYears() == null) ? 0 : getDurationInYears()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        hashCode = prime * hashCode
                + ((getAuthCode() == null) ? 0 : getAuthCode().hashCode());
        hashCode = prime * hashCode
                + ((getAutoRenew() == null) ? 0 : getAutoRenew().hashCode());
        hashCode = prime
                * hashCode
                + ((getAdminContact() == null) ? 0 : getAdminContact()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRegistrantContact() == null) ? 0
                        : getRegistrantContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getTechContact() == null) ? 0 : getTechContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectAdminContact() == null) ? 0
                        : getPrivacyProtectAdminContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectRegistrantContact() == null) ? 0
                        : getPrivacyProtectRegistrantContact().hashCode());
        hashCode = prime
                * hashCode
                + ((getPrivacyProtectTechContact() == null) ? 0
                        : getPrivacyProtectTechContact().hashCode());
        return hashCode;
    }

    @Override
    public TransferDomainRequest clone() {
        return (TransferDomainRequest) super.clone();
    }
}