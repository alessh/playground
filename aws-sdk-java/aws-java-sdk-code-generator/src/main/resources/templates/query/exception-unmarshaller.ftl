<@LicenseCommentBlockMacro.content />

package ${metadata.packageName}.model.transform;

import org.w3c.dom.Node;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.util.XpathUtils;
import com.amazonaws.transform.${metadata.exceptionUnmarshallerImpl};

import ${metadata.packageName}.model.${shape.shapeName};

public class ${shape.shapeName}Unmarshaller extends ${metadata.exceptionUnmarshallerImpl} {

    public ${shape.shapeName}Unmarshaller() {
        super(${shape.shapeName}.class);
    }

    @Override
    public AmazonServiceException unmarshall(Node node) throws Exception {
        // Bail out if this isn't the right error code that this
        // marshaller understands
        String errorCode = parseErrorCode(node);
        if(errorCode == null || !errorCode.equals("${shape.errorCode}"))
            return null;

        ${shape.shapeName} e = (${shape.shapeName})super.unmarshall(node);
        <#if shape.members??>
            <#list shape.members as memberModel>
              <#assign variableName = "${memberModel.variable.variableName}"?cap_first/>
              <#if !memberModel.isList() && !memberModel.isMap() >
                <#-- List and Map are yet to be supported -->
                e.set${variableName}(XpathUtils.as${memberModel.variable.simpleType}(getErrorPropertyPath("${memberModel.c2jName}"), node));
              </#if >
            </#list>
        </#if>

        return e;
    }
}
