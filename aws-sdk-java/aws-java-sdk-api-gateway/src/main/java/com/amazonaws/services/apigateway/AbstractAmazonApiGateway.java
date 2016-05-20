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
package com.amazonaws.services.apigateway;

import com.amazonaws.services.apigateway.model.*;
import com.amazonaws.*;

/**
 * Abstract implementation of {@code AmazonApiGateway}. Convenient method forms
 * pass through to the corresponding overload that takes a request object, which
 * throws an {@code UnsupportedOperationException}.
 */
public class AbstractAmazonApiGateway implements AmazonApiGateway {

    protected AbstractAmazonApiGateway() {
    }

    @Override
    public void setEndpoint(String endpoint) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void setRegion(com.amazonaws.regions.Region region) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateApiKeyResult createApiKey(CreateApiKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateAuthorizerResult createAuthorizer(
            CreateAuthorizerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateBasePathMappingResult createBasePathMapping(
            CreateBasePathMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDeploymentResult createDeployment(
            CreateDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateDomainNameResult createDomainName(
            CreateDomainNameRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateModelResult createModel(CreateModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateResourceResult createResource(CreateResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateRestApiResult createRestApi(CreateRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public CreateStageResult createStage(CreateStageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteApiKey(DeleteApiKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteAuthorizer(DeleteAuthorizerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteBasePathMapping(DeleteBasePathMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteClientCertificate(DeleteClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteDeployment(DeleteDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteDomainName(DeleteDomainNameRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteIntegration(DeleteIntegrationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteIntegrationResponse(
            DeleteIntegrationResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteMethod(DeleteMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteMethodResponse(DeleteMethodResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteModel(DeleteModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteResource(DeleteResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteRestApi(DeleteRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void deleteStage(DeleteStageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void flushStageAuthorizersCache(
            FlushStageAuthorizersCacheRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void flushStageCache(FlushStageCacheRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GenerateClientCertificateResult generateClientCertificate(
            GenerateClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAccountResult getAccount(GetAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApiKeyResult getApiKey(GetApiKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetApiKeysResult getApiKeys(GetApiKeysRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAuthorizerResult getAuthorizer(GetAuthorizerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetAuthorizersResult getAuthorizers(GetAuthorizersRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBasePathMappingResult getBasePathMapping(
            GetBasePathMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetBasePathMappingsResult getBasePathMappings(
            GetBasePathMappingsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetClientCertificateResult getClientCertificate(
            GetClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetClientCertificatesResult getClientCertificates(
            GetClientCertificatesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentResult getDeployment(GetDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDeploymentsResult getDeployments(GetDeploymentsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainNameResult getDomainName(GetDomainNameRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetDomainNamesResult getDomainNames(GetDomainNamesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetExportResult getExport(GetExportRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIntegrationResult getIntegration(GetIntegrationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetIntegrationResponseResult getIntegrationResponse(
            GetIntegrationResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMethodResult getMethod(GetMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetMethodResponseResult getMethodResponse(
            GetMethodResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetModelResult getModel(GetModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetModelTemplateResult getModelTemplate(
            GetModelTemplateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetModelsResult getModels(GetModelsRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourceResult getResource(GetResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetResourcesResult getResources(GetResourcesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRestApiResult getRestApi(GetRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetRestApisResult getRestApis(GetRestApisRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetSdkResult getSdk(GetSdkRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStageResult getStage(GetStageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public GetStagesResult getStages(GetStagesRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public ImportRestApiResult importRestApi(ImportRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutIntegrationResult putIntegration(PutIntegrationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutIntegrationResponseResult putIntegrationResponse(
            PutIntegrationResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMethodResult putMethod(PutMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutMethodResponseResult putMethodResponse(
            PutMethodResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public PutRestApiResult putRestApi(PutRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestInvokeAuthorizerResult testInvokeAuthorizer(
            TestInvokeAuthorizerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public TestInvokeMethodResult testInvokeMethod(
            TestInvokeMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAccountResult updateAccount(UpdateAccountRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateApiKeyResult updateApiKey(UpdateApiKeyRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateAuthorizerResult updateAuthorizer(
            UpdateAuthorizerRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateBasePathMappingResult updateBasePathMapping(
            UpdateBasePathMappingRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateClientCertificateResult updateClientCertificate(
            UpdateClientCertificateRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDeploymentResult updateDeployment(
            UpdateDeploymentRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateDomainNameResult updateDomainName(
            UpdateDomainNameRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateIntegrationResult updateIntegration(
            UpdateIntegrationRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateIntegrationResponseResult updateIntegrationResponse(
            UpdateIntegrationResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateMethodResult updateMethod(UpdateMethodRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateMethodResponseResult updateMethodResponse(
            UpdateMethodResponseRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateModelResult updateModel(UpdateModelRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateResourceResult updateResource(UpdateResourceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateRestApiResult updateRestApi(UpdateRestApiRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public UpdateStageResult updateStage(UpdateStageRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public void shutdown() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override
    public com.amazonaws.ResponseMetadata getCachedResponseMetadata(
            com.amazonaws.AmazonWebServiceRequest request) {
        throw new java.lang.UnsupportedOperationException();
    }
}
