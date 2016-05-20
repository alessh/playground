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
package com.amazonaws.services.ecr;

import com.amazonaws.*;
import com.amazonaws.regions.*;

import com.amazonaws.services.ecr.model.*;

/**
 * Interface for accessing Amazon ECR.
 * <p>
 * <p>
 * Amazon EC2 Container Registry (Amazon ECR) is a managed AWS Docker registry
 * service. Customers can use the familiar Docker CLI to push, pull, and manage
 * images. Amazon ECR provides a secure, scalable, and reliable registry. Amazon
 * ECR supports private Docker repositories with resource-based permissions
 * using AWS IAM so that specific users or Amazon EC2 instances can access
 * repositories and images. Developers can use the Docker CLI to author and
 * manage images.
 * </p>
 */
public interface AmazonECR {

    /**
     * Overrides the default endpoint for this client
     * ("ecr.us-east-1.amazonaws.com"). Callers can use this method to control
     * which AWS region they want to work with.
     * <p>
     * Callers can pass in just the endpoint (ex: "ecr.us-east-1.amazonaws.com")
     * or a full URL, including the protocol (ex:
     * "ecr.us-east-1.amazonaws.com"). If the protocol is not specified here,
     * the default protocol from this client's {@link ClientConfiguration} will
     * be used, which by default is HTTPS.
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
     *        The endpoint (ex: "ecr.us-east-1.amazonaws.com") or a full URL,
     *        including the protocol (ex: "ecr.us-east-1.amazonaws.com") of the
     *        region specific AWS endpoint this client will communicate with.
     */
    void setEndpoint(String endpoint);

    /**
     * An alternative to {@link AmazonECR#setEndpoint(String)}, sets the
     * regional endpoint for this client's service calls. Callers can use this
     * method to control which AWS region they want to work with.
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
     * Check the availability of multiple image layers in a specified registry
     * and repository.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param batchCheckLayerAvailabilityRequest
     * @return Result of the BatchCheckLayerAvailability operation returned by
     *         the service.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @sample AmazonECR.BatchCheckLayerAvailability
     */
    BatchCheckLayerAvailabilityResult batchCheckLayerAvailability(
            BatchCheckLayerAvailabilityRequest batchCheckLayerAvailabilityRequest);

    /**
     * <p>
     * Deletes a list of specified images within a specified repository. Images
     * are specified with either <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * 
     * @param batchDeleteImageRequest
     *        Deletes specified images within a specified repository. Images are
     *        specified with either the <code>imageTag</code> or
     *        <code>imageDigest</code>.
     * @return Result of the BatchDeleteImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.BatchDeleteImage
     */
    BatchDeleteImageResult batchDeleteImage(
            BatchDeleteImageRequest batchDeleteImageRequest);

    /**
     * <p>
     * Gets detailed information for specified images within a specified
     * repository. Images are specified with either <code>imageTag</code> or
     * <code>imageDigest</code>.
     * </p>
     * 
     * @param batchGetImageRequest
     * @return Result of the BatchGetImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.BatchGetImage
     */
    BatchGetImageResult batchGetImage(BatchGetImageRequest batchGetImageRequest);

    /**
     * <p>
     * Inform Amazon ECR that the image layer upload for a specified registry,
     * repository name, and upload ID, has completed. You can optionally provide
     * a <code>sha256</code> digest of the image layer for data validation
     * purposes.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param completeLayerUploadRequest
     * @return Result of the CompleteLayerUpload operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws UploadNotFoundException
     *         The upload could not be found, or the specified upload id is not
     *         valid for this repository.
     * @throws InvalidLayerException
     *         The layer digest calculation performed by Amazon ECR upon receipt
     *         of the image layer does not match the digest specified.
     * @throws LayerPartTooSmallException
     *         Layer parts must be at least 5 MiB in size.
     * @throws LayerAlreadyExistsException
     *         The image layer already exists in the associated repository.
     * @throws EmptyUploadException
     *         The specified layer upload does not contain any layer parts.
     * @sample AmazonECR.CompleteLayerUpload
     */
    CompleteLayerUploadResult completeLayerUpload(
            CompleteLayerUploadRequest completeLayerUploadRequest);

    /**
     * <p>
     * Creates an image repository.
     * </p>
     * 
     * @param createRepositoryRequest
     * @return Result of the CreateRepository operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryAlreadyExistsException
     *         The specified repository already exists in the specified
     *         registry.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a
     *         service limit for your account. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html"
     *         >Amazon ECR Default Service Limits</a> in the Amazon EC2
     *         Container Registry User Guide.
     * @sample AmazonECR.CreateRepository
     */
    CreateRepositoryResult createRepository(
            CreateRepositoryRequest createRepositoryRequest);

    /**
     * <p>
     * Deletes an existing image repository. If a repository contains images,
     * you must use the <code>force</code> option to delete it.
     * </p>
     * 
     * @param deleteRepositoryRequest
     * @return Result of the DeleteRepository operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws RepositoryNotEmptyException
     *         The specified repository contains images. To delete a repository
     *         that contains images, you must force the deletion with the
     *         <code>force</code> parameter.
     * @sample AmazonECR.DeleteRepository
     */
    DeleteRepositoryResult deleteRepository(
            DeleteRepositoryRequest deleteRepositoryRequest);

    /**
     * <p>
     * Deletes the repository policy from a specified repository.
     * </p>
     * 
     * @param deleteRepositoryPolicyRequest
     * @return Result of the DeleteRepositoryPolicy operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws RepositoryPolicyNotFoundException
     *         The specified repository and registry combination does not have
     *         an associated repository policy.
     * @sample AmazonECR.DeleteRepositoryPolicy
     */
    DeleteRepositoryPolicyResult deleteRepositoryPolicy(
            DeleteRepositoryPolicyRequest deleteRepositoryPolicyRequest);

    /**
     * <p>
     * Describes image repositories in a registry.
     * </p>
     * 
     * @param describeRepositoriesRequest
     * @return Result of the DescribeRepositories operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.DescribeRepositories
     */
    DescribeRepositoriesResult describeRepositories(
            DescribeRepositoriesRequest describeRepositoriesRequest);

    /**
     * <p>
     * Retrieves a token that is valid for a specified registry for 12 hours.
     * This command allows you to use the <code>docker</code> CLI to push and
     * pull images with Amazon ECR. If you do not specify a registry, the
     * default registry is assumed.
     * </p>
     * <p>
     * The <code>authorizationToken</code> returned for each registry specified
     * is a base64 encoded string that can be decoded and used in a
     * <code>docker login</code> command to authenticate to a registry. The AWS
     * CLI offers an <code>aws ecr get-login</code> command that simplifies the
     * login process.
     * </p>
     * 
     * @param getAuthorizationTokenRequest
     * @return Result of the GetAuthorizationToken operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @sample AmazonECR.GetAuthorizationToken
     */
    GetAuthorizationTokenResult getAuthorizationToken(
            GetAuthorizationTokenRequest getAuthorizationTokenRequest);

    /**
     * <p>
     * Retrieves the pre-signed Amazon S3 download URL corresponding to an image
     * layer. You can only get URLs for image layers that are referenced in an
     * image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param getDownloadUrlForLayerRequest
     * @return Result of the GetDownloadUrlForLayer operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws LayersNotFoundException
     *         The specified layers could not be found, or the specified layer
     *         is not valid for this repository.
     * @throws LayerInaccessibleException
     *         The specified layer is not available because it is not associated
     *         with an image. Unassociated image layers may be cleaned up at any
     *         time.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.GetDownloadUrlForLayer
     */
    GetDownloadUrlForLayerResult getDownloadUrlForLayer(
            GetDownloadUrlForLayerRequest getDownloadUrlForLayerRequest);

    /**
     * <p>
     * Retrieves the repository policy for a specified repository.
     * </p>
     * 
     * @param getRepositoryPolicyRequest
     * @return Result of the GetRepositoryPolicy operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws RepositoryPolicyNotFoundException
     *         The specified repository and registry combination does not have
     *         an associated repository policy.
     * @sample AmazonECR.GetRepositoryPolicy
     */
    GetRepositoryPolicyResult getRepositoryPolicy(
            GetRepositoryPolicyRequest getRepositoryPolicyRequest);

    /**
     * <p>
     * Notify Amazon ECR that you intend to upload an image layer.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param initiateLayerUploadRequest
     * @return Result of the InitiateLayerUpload operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.InitiateLayerUpload
     */
    InitiateLayerUploadResult initiateLayerUpload(
            InitiateLayerUploadRequest initiateLayerUploadRequest);

    /**
     * <p>
     * Lists all the image IDs for a given repository.
     * </p>
     * 
     * @param listImagesRequest
     * @return Result of the ListImages operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.ListImages
     */
    ListImagesResult listImages(ListImagesRequest listImagesRequest);

    /**
     * <p>
     * Creates or updates the image manifest associated with an image.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param putImageRequest
     * @return Result of the PutImage operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws ImageAlreadyExistsException
     *         The specified image has already been pushed, and there are no
     *         changes to the manifest or image tag since the last push.
     * @throws LayersNotFoundException
     *         The specified layers could not be found, or the specified layer
     *         is not valid for this repository.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a
     *         service limit for your account. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html"
     *         >Amazon ECR Default Service Limits</a> in the Amazon EC2
     *         Container Registry User Guide.
     * @sample AmazonECR.PutImage
     */
    PutImageResult putImage(PutImageRequest putImageRequest);

    /**
     * <p>
     * Applies a repository policy on a specified repository to control access
     * permissions.
     * </p>
     * 
     * @param setRepositoryPolicyRequest
     * @return Result of the SetRepositoryPolicy operation returned by the
     *         service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @sample AmazonECR.SetRepositoryPolicy
     */
    SetRepositoryPolicyResult setRepositoryPolicy(
            SetRepositoryPolicyRequest setRepositoryPolicyRequest);

    /**
     * <p>
     * Uploads an image layer part to Amazon ECR.
     * </p>
     * <note>
     * <p>
     * This operation is used by the Amazon ECR proxy, and it is not intended
     * for general use by customers. Use the <code>docker</code> CLI to pull,
     * tag, and push images.
     * </p>
     * </note>
     * 
     * @param uploadLayerPartRequest
     * @return Result of the UploadLayerPart operation returned by the service.
     * @throws ServerException
     *         These errors are usually caused by a server-side issue.
     * @throws InvalidParameterException
     *         The specified parameter is invalid. Review the available
     *         parameters for the API request.
     * @throws InvalidLayerPartException
     *         The layer part size is not valid, or the first byte specified is
     *         not consecutive to the last byte of a previous layer part upload.
     * @throws RepositoryNotFoundException
     *         The specified repository could not be found. Check the spelling
     *         of the specified repository and ensure that you are performing
     *         operations on the correct registry.
     * @throws UploadNotFoundException
     *         The upload could not be found, or the specified upload id is not
     *         valid for this repository.
     * @throws LimitExceededException
     *         The operation did not succeed because it would have exceeded a
     *         service limit for your account. For more information, see <a
     *         href=
     *         "http://docs.aws.amazon.com/AmazonECR/latest/userguide/service_limits.html"
     *         >Amazon ECR Default Service Limits</a> in the Amazon EC2
     *         Container Registry User Guide.
     * @sample AmazonECR.UploadLayerPart
     */
    UploadLayerPartResult uploadLayerPart(
            UploadLayerPartRequest uploadLayerPartRequest);

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
