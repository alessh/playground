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

import com.amazonaws.services.certificatemanager.model.*;

/**
 * Interface for accessing ACM asynchronously. Each asynchronous method will
 * return a Java Future object representing the asynchronous operation;
 * overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
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
public interface AWSCertificateManagerAsync extends AWSCertificateManager {

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
     * @sample AWSCertificateManagerAsync.DeleteCertificate
     */
    java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest deleteCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSCertificateManagerAsyncHandler.DeleteCertificate
     */
    java.util.concurrent.Future<Void> deleteCertificateAsync(
            DeleteCertificateRequest deleteCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DeleteCertificateRequest, Void> asyncHandler);

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
     * @return A Java Future containing the result of the DescribeCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsync.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest describeCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.DescribeCertificate
     */
    java.util.concurrent.Future<DescribeCertificateResult> describeCertificateAsync(
            DescribeCertificateRequest describeCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeCertificateRequest, DescribeCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the GetCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsync.GetCertificate
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(
            GetCertificateRequest getCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.GetCertificate
     */
    java.util.concurrent.Future<GetCertificateResult> getCertificateAsync(
            GetCertificateRequest getCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<GetCertificateRequest, GetCertificateResult> asyncHandler);

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
     * @return A Java Future containing the result of the ListCertificates
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsync.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest listCertificatesRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListCertificates
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.ListCertificates
     */
    java.util.concurrent.Future<ListCertificatesResult> listCertificatesAsync(
            ListCertificatesRequest listCertificatesRequest,
            com.amazonaws.handlers.AsyncHandler<ListCertificatesRequest, ListCertificatesResult> asyncHandler);

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
     * @return A Java Future containing the result of the RequestCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsync.RequestCertificate
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(
            RequestCertificateRequest requestCertificateRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RequestCertificate
     *         operation returned by the service.
     * @sample AWSCertificateManagerAsyncHandler.RequestCertificate
     */
    java.util.concurrent.Future<RequestCertificateResult> requestCertificateAsync(
            RequestCertificateRequest requestCertificateRequest,
            com.amazonaws.handlers.AsyncHandler<RequestCertificateRequest, RequestCertificateResult> asyncHandler);

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
     * @sample AWSCertificateManagerAsync.ResendValidationEmail
     */
    java.util.concurrent.Future<Void> resendValidationEmailAsync(
            ResendValidationEmailRequest resendValidationEmailRequest);

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
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the
     *        request. Users can provide an implementation of the callback
     *        methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AWSCertificateManagerAsyncHandler.ResendValidationEmail
     */
    java.util.concurrent.Future<Void> resendValidationEmailAsync(
            ResendValidationEmailRequest resendValidationEmailRequest,
            com.amazonaws.handlers.AsyncHandler<ResendValidationEmailRequest, Void> asyncHandler);

}
