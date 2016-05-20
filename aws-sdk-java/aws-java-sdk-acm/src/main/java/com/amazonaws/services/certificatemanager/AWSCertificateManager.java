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
package com.amazonaws.services.certificatemanager;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.certificatemanager.model.*;

/**
 * Interface for accessing ACM.
 * <p>
 * <fullname>AWS Certificate Manager</fullname>
 * <p>
 * Welcome to the AWS Certificate Manager (ACM) Command Reference. This guide
 * provides descriptions, syntax, and usage examples for each ACM command. You
 * can use AWS Certificate Manager to request ACM Certificates for your
 * AWS-based websites and applications. For general information about using ACM
 * and for more information about using the console, see the <a
 * href="http://docs.aws.amazon.com/acm/latest/userguide/acm-overview.html">AWS
 * Certificate Manager User Guide</a>. For more information about using the ACM
 * API, see the <a
 * href="http://docs.aws.amazon.com/acm/latest/APIReference/Welcome.html"> AWS
 * Certificate Manager API Reference</a>.
 * </p>
 */
public interface AWSCertificateManager {

    /**
     * Overrides the default endpoint for this client
     * ("https://acm.us-east-1.amazonaws.com"). Callers can use this method to
     * control which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "acm.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "https://acm.us-east-1.amazonaws.com"). If the protocol is not specified
     * here, the default protocol from this client's {@link ClientConfiguration}
     * will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     * <p>
     * <b>This method is not threadsafe. An endpoint should be configured when
     * the client is created and before any service requests are made. Changing
     * it afterwards creates inevitable race conditions for any service requests
     * in transit or retrying.</b>
     *
     * @param endpoint
     *        The endpoint (ex: "acm.us-east-1.amazonaws.com") or a full URL,
     *        including the protocol (ex: "https://acm.us-east-1.amazonaws.com")
     *        of the region specific AWS endpoint this client will communicate
     *        with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AWSCertificateManager#setEndpoint(String)}, sets
     * the regional endpoint for this client's service calls. Callers can use
     * this method to control which AWS region they want to work with.
     * <p>
     * By default, all service endpoints in all regions use the https protocol.
     * To use http instead, specify it in the {@link ClientConfiguration}
     * supplied at construction.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit or retrying.</b>
     *
     * @param region
     *        The region this client will communicate with. See
     *        {@link Region#getRegion(com.amazonaws.regions.Regions)} for
     *        accessing a given region. Must not be null and must be a region
     *        where the service is available.
     *
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class,
     *      com.amazonaws.auth.AWSCredentialsProvider, ClientConfiguration)
     * @see Region#isServiceSupported(String)
     */
    void setRegion(Region region);

    /**
     * <p>
     * Deletes an ACM Certificate and its associated private key. If this action
     * succeeds, the certificate no longer appears in the list of ACM
     * Certificates that can be displayed by calling the <a>ListCertificates</a>
     * action or be retrieved by calling the <a>GetCertificate</a> action. The
     * certificate will not be available for use by other AWS services.
     * </p>
     * <note>You cannot delete an ACM Certificate that is being used by another
     * AWS service. To delete a certificate that is in use, the certificate
     * association must first be removed. </note>
     * 
     * @param deleteCertificateRequest
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws ResourceInUseException
     *         The certificate is in use by another AWS service in the caller's
     *         account. Remove the association and try again.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.DeleteCertificate
     */
    void deleteCertificate(DeleteCertificateRequest deleteCertificateRequest);

    /**
     * <p>
     * Returns a list of the fields contained in the specified ACM Certificate.
     * For example, this action returns the certificate status, a flag that
     * indicates whether the certificate is associated with any other AWS
     * service, and the date at which the certificate request was created. The
     * ACM Certificate is specified on input by its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param describeCertificateRequest
     * @return Result of the DescribeCertificate operation returned by the
     *         service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.DescribeCertificate
     */
    DescribeCertificateResult describeCertificate(
            DescribeCertificateRequest describeCertificateRequest);

    /**
     * <p>
     * Retrieves an ACM Certificate and certificate chain for the certificate
     * specified by an ARN. The chain is an ordered list of certificates that
     * contains the root certificate, intermediate certificates of subordinate
     * CAs, and the ACM Certificate. The certificate and certificate chain are
     * base64 encoded. If you want to decode the certificate chain to see the
     * individual certificate fields, you can use OpenSSL.
     * </p>
     * <note> Currently, ACM Certificates can be used only with Elastic Load
     * Balancing and Amazon CloudFront. </note>
     * 
     * @param getCertificateRequest
     * @return Result of the GetCertificate operation returned by the service.
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws RequestInProgressException
     *         The certificate request is in process and the certificate in your
     *         account has not yet been issued.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @sample AWSCertificateManager.GetCertificate
     */
    GetCertificateResult getCertificate(
            GetCertificateRequest getCertificateRequest);

    /**
     * <p>
     * Retrieves a list of the ACM Certificate ARNs, and the domain name for
     * each ARN, owned by the calling account. You can filter the list based on
     * the <code>CertificateStatuses</code> parameter, and you can display up to
     * <code>MaxItems</code> certificates at one time. If you have more than
     * <code>MaxItems</code> certificates, use the <code>NextToken</code> marker
     * from the response object in your next call to the
     * <code>ListCertificates</code> action to retrieve the next set of
     * certificate ARNs.
     * </p>
     * 
     * @param listCertificatesRequest
     * @return Result of the ListCertificates operation returned by the service.
     * @sample AWSCertificateManager.ListCertificates
     */
    ListCertificatesResult listCertificates(
            ListCertificatesRequest listCertificatesRequest);

    /**
     * <p>
     * Requests an ACM Certificate for use with other AWS services. To request
     * an ACM Certificate, you must specify the fully qualified domain name
     * (FQDN) for your site. You can also specify additional FQDNs if users can
     * reach your site by using other names. For each domain name you specify,
     * email is sent to the domain owner to request approval to issue the
     * certificate. After receiving approval from the domain owner, the ACM
     * Certificate is issued. For more information, see the <a
     * href="http://docs.aws.amazon.com/acm/latest/userguide/overview.html"> AWS
     * Certificate Manager User Guide </a>.
     * </p>
     * 
     * @param requestCertificateRequest
     * @return Result of the RequestCertificate operation returned by the
     *         service.
     * @throws LimitExceededException
     *         An ACM limit has been exceeded. For example, you may have input
     *         more domains than are allowed or you've requested too many
     *         certificates for your account. See the exception message returned
     *         by ACM to determine which limit you have violated. For more
     *         information about ACM limits, see the <a href=
     *         "http://docs.aws.amazon.com/acm/latest/userguide/acm-limits.html"
     *         >Limits</a> topic.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure
     *         is incorrect.
     * @sample AWSCertificateManager.RequestCertificate
     */
    RequestCertificateResult requestCertificate(
            RequestCertificateRequest requestCertificateRequest);

    /**
     * <p>
     * Resends the email that requests domain ownership validation. The domain
     * owner or an authorized representative must approve the ACM Certificate
     * before it can be issued. The certificate can be approved by clicking a
     * link in the mail to navigate to the Amazon certificate approval website
     * and then clicking <b>I Approve</b>. However, the validation email can be
     * blocked by spam filters. Therefore, if you do not receive the original
     * mail, you can request that the mail be resent within 72 hours of
     * requesting the ACM Certificate. If more than 72 hours have elapsed since
     * your original request or since your last attempt to resend validation
     * mail, you must request a new certificate.
     * </p>
     * 
     * @param resendValidationEmailRequest
     * @throws ResourceNotFoundException
     *         The specified certificate cannot be found in the caller's
     *         account, or the caller's account cannot be found.
     * @throws InvalidStateException
     *         Processing has reached an invalid state. For example, this
     *         exception can occur if the specified domain is not using email
     *         validation, or the current certificate status does not permit the
     *         requested operation. See the exception message returned by ACM to
     *         determine which state is not valid.
     * @throws InvalidArnException
     *         The requested Amazon Resource Name (ARN) does not refer to an
     *         existing resource.
     * @throws InvalidDomainValidationOptionsException
     *         One or more values in the <a>DomainValidationOption</a> structure
     *         is incorrect.
     * @sample AWSCertificateManager.ResendValidationEmail
     */
    void resendValidationEmail(
            ResendValidationEmailRequest resendValidationEmailRequest);

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    void shutdown();

    /**
     * Returns additional metadata for a previously executed successful request,
     * typically used for debugging issues where a service isn't acting as
     * expected. This data isn't considered part of the result data returned by
     * an operation, so it's available through this separate, diagnostic
     * interface.
     * <p>
     * Response metadata is only cached for a limited period of time, so if you
     * need to access this extra diagnostic information for an executed request,
     * you should use this method to retrieve it as soon as possible after
     * executing a request.
     *
     * @param request
     *        The originally executed request.
     *
     * @return The response metadata for the specified request, or null if none
     *         is available.
     */
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest request);
}
