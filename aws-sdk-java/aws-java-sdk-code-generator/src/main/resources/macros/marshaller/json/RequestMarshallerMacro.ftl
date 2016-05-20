<#macro content dataModel>
<#local shapes = dataModel.shapes/>
<#local metadata = dataModel.metadata/>
<#local shapeName = dataModel.shapeName/>
<#local customConfig = dataModel.customConfig/>

<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model.transform;

import java.io.ByteArrayInputStream;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.regex.Pattern;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.http.HttpMethodName;
import ${metadata.packageName}.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.BinaryUtils;
import com.amazonaws.util.StringUtils;
import com.amazonaws.util.IdempotentUtils;
import com.amazonaws.util.StringInputStream;
import com.amazonaws.util.json.*;



/**
 * ${shapeName} Marshaller
 */
public class ${shapeName}Marshaller implements Marshaller<Request<${shapeName}>, ${shapeName}> {

    <#assign shape = shapes[shapeName]/>
    public Request<${shapeName}> marshall(${shape.variable.variableType} ${shape.variable.variableName}) {

        if (${shape.variable.variableName} == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        <@RequiredParameterValidationInvocationMacro.content dataModel.customConfig shape/>

        <#assign serviceNameForRequest = customConfig.customServiceNameForRequest!metadata.syncInterface />

        Request<${shapeName}> request = new DefaultRequest<${shapeName}>(${shape.variable.variableName}, "${serviceNameForRequest}");
        request.addHeader("X-Amz-Target", "${shape.marshaller.target}");

        <#assign httpVerb = (shape.marshaller.verb)!POST/>
        request.setHttpMethod(HttpMethodName.${httpVerb});

        request.setResourcePath("");

        try {
          final StructuredJsonGenerator jsonGenerator = SdkJsonProtocolFactory
          .createWriter(${metadata.cborProtocol?c}, "${metadata.jsonVersion}");

          jsonGenerator.writeStartObject();

          <@MemberMarshallerMacro.content customConfig shapeName shape.variable.variableName shapes/>

          jsonGenerator.writeEndObject();

          byte[] content = jsonGenerator.getBytes();
          request.setContent(new ByteArrayInputStream(content));
          request.addHeader("Content-Length", Integer.toString(content.length));
          request.addHeader("Content-Type", jsonGenerator.getContentType());
        } catch(Throwable t) {
          throw new AmazonClientException("Unable to marshall request to JSON: " + t.getMessage(), t);
        }

        return request;
    }

    <@RequiredParameterValidationFunctionMacro.content dataModel.customConfig shape/>
}

</#macro>
