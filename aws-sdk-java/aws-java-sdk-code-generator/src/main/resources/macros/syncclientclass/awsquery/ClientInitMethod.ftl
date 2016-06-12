<#macro content serviceModelRoot>
    private void init() {
<#list serviceModelRoot.shapes?values as shapeModel>
    <#if shapeModel.type == "Exception">
        exceptionUnmarshallers.add(new ${shapeModel.shapeName}Unmarshaller());
    </#if>
</#list>
        exceptionUnmarshallers.add(new ${serviceModelRoot.metadata.exceptionUnmarshallerImpl}());

        setServiceNameIntern(DEFAULT_SIGNING_NAME);
        setEndpointPrefix(DEFAULT_ENDPOINT_PREFIX);
<#if serviceModelRoot.metadata.defaultEndpoint?has_content>
        // calling this.setEndPoint(...) will also modify the signer accordingly
        this.setEndpoint("${serviceModelRoot.metadata.defaultEndpoint}");
</#if>
        HandlerChainFactory chainFactory = new HandlerChainFactory();
        requestHandler2s.addAll(chainFactory.newRequestHandlerChain(
                "/${serviceModelRoot.metadata.packagePath}/request.handlers"));
        requestHandler2s.addAll(chainFactory.newRequestHandler2Chain(
                "/${serviceModelRoot.metadata.packagePath}/request.handler2s"));
    }
</#macro>
