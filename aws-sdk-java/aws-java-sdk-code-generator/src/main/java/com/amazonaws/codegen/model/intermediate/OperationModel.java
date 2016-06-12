/*
 * Copyright (c) 2016. Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.codegen.model.intermediate;

import static com.amazonaws.codegen.internal.Constants.LINE_SEPARATOR;
import static com.amazonaws.codegen.internal.DocumentationUtils.stripHTMLTags;

import java.util.ArrayList;
import java.util.List;

import com.amazonaws.codegen.internal.DocumentationUtils;
import com.amazonaws.codegen.internal.Utils;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class OperationModel extends DocumentationModel {

    private String operationName;

    private boolean deprecated;

    private VariableModel input;

    private String inputStreamPropertyName;

    private ReturnTypeModel returnType;

    private List<ExceptionModel> exceptions;

    private List<SimpleMethodFormModel> simpleMethods;

    private boolean hasBlobMemberAsPayload;

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getMethodName() {
        return Utils.unCapitialize(operationName);
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getSyncDocumentation(final Metadata md) {
        return getDocumentation(MethodType.SYNC, md);
    }

    public String getAsyncDocumentation(final Metadata md) {
        return getDocumentation(MethodType.ASYNC, md);
    }

    public String getAsyncDocumentationWithHandler(final Metadata md) {
        return getDocumentation(MethodType.ASYNC_WITH_HANDLER, md);
    }

    private static enum MethodType {

        SYNC(false),
        ASYNC(true),
        ASYNC_WITH_HANDLER(true);

        private final boolean async;

        private MethodType(boolean async) {
            this.async = async;
        }

        public boolean isAsync() {
            return async;
        }
    };

    private String getDocumentation(final MethodType methodType, final Metadata md) {
        StringBuilder docBuilder = new StringBuilder("/**");

        if (documentation != null) {
            docBuilder.append(documentation);
        } else {
            docBuilder.append("Invokes the ")
                .append(operationName)
                .append(" operation");

            if (methodType.isAsync()) {
                docBuilder.append(" asynchronously");
            }

            docBuilder.append(".");
        }

        if (input != null) {
            docBuilder.append(LINE_SEPARATOR)
                    .append("@param ")
                    .append(input.getVariableName())
                    .append(" ")
                    .append(stripHTMLTags(input.getDocumentation()));
        }

        if (methodType == MethodType.ASYNC_WITH_HANDLER) {
            docBuilder.append(LINE_SEPARATOR)
                    .append("@param asyncHandler Asynchronous callback handler "
                            + "for events in the lifecycle of the request. "
                            + "Users can provide an implementation of the "
                            + "callback methods in this interface to receive "
                            + "notification of successful or unsuccessful "
                            + "completion of the operation.");
        }

        if (returnType != null) {
            docBuilder.append(LINE_SEPARATOR).append("@return ");
            if (methodType.isAsync()) {
                docBuilder.append(DocumentationUtils.DEFAULT_ASYNC_RETURN
                        .replace("%s", operationName));
            } else {
                docBuilder.append(DocumentationUtils.DEFAULT_SYNC_RETURN
                        .replace("%s", operationName));
            }
        }

        if (!methodType.isAsync()
                && exceptions != null
                && !(exceptions.isEmpty())) {

            for (ExceptionModel exception : exceptions) {
                docBuilder.append(LINE_SEPARATOR)
                        .append("@throws ")
                        .append(exception.getExceptionName())
                        .append(" ")
                        .append(stripHTMLTags(exception.getDocumentation()));
            }
        }

        docBuilder.append(getSampleTagForMethodType(methodType, md));

        docBuilder.append("*/");
        return docBuilder.toString();
    }

    private String getSampleTagForMethodType(final MethodType methodType, final Metadata md) {
        StringBuilder sb = new StringBuilder();

        sb.append(LINE_SEPARATOR).append("@sample ");

        if (methodType == MethodType.SYNC) {
            sb.append(md.getSyncInterface());
        } else if (methodType == MethodType.ASYNC) {
            sb.append(md.getAsyncInterface());
        } else if (methodType == MethodType.ASYNC_WITH_HANDLER) {
            sb.append(md.getAsyncInterface() + "Handler");
        }

        sb.append(".").append(operationName);
        return sb.toString();
    }

    public VariableModel getInput() {
        return input;
    }

    public void setInput(VariableModel input) {
        this.input = input;
    }

    public String getInputStreamPropertyName() {
        return inputStreamPropertyName;
    }

    public void setInputStreamPropertyName(String inputStreamPropertyName) {
        this.inputStreamPropertyName = inputStreamPropertyName;
    }

    public ReturnTypeModel getReturnType() {
        return returnType;
    }

    public void setReturnType(ReturnTypeModel returnType) {
        this.returnType = returnType;
    }

    private String getBaseReturnType(boolean async) {
        if (returnType == null) {
            if (async) {
                return "Void";
            } else {
                return "void";
            }
        }
        return returnType.getReturnType();
    }

    public String getSyncReturnType() {
        return getBaseReturnType(false);
    }

    public String getAsyncReturnType() {
        return getBaseReturnType(true);
    }

    public String getAsyncFutureType() {
        return "java.util.concurrent.Future<"
                + getAsyncReturnType()
                + ">";
    }

    public String getAsyncCallableType() {
        return "java.util.concurrent.Callable<"
                + getAsyncReturnType()
                + ">";
    }

    public String getAsyncHandlerType() {
        return "com.amazonaws.handlers.AsyncHandler<"
                + input.getVariableType()
                + ", "
                + getAsyncReturnType()
                + ">";
    }

    public List<ExceptionModel> getExceptions() {
        return exceptions;
    }

    public void setExceptions(List<ExceptionModel> exceptions) {
        this.exceptions = exceptions;
    }

    public void addException(ExceptionModel exception) {
        if (exceptions == null) {
            exceptions = new ArrayList<ExceptionModel>();
        }
        exceptions.add(exception);
    }

    @JsonIgnore
    public List<SimpleMethodFormModel> getSimpleMethodForms() {
        return simpleMethods;
    }

    public void addSimpleMethodForm(List<ArgumentModel> arguments) {
        if (this.simpleMethods == null) {
            this.simpleMethods = new ArrayList<>();
        }

        SimpleMethodFormModel form = new SimpleMethodFormModel();
        form.setArguments(arguments);

        this.simpleMethods.add(form);
    }

    public boolean getHasBlobMemberAsPayload() {
        return this.hasBlobMemberAsPayload;
    }

    public void setHasBlobMemberAsPayload(boolean hasBlobMemberAsPayload) {
        this.hasBlobMemberAsPayload = hasBlobMemberAsPayload;
    }
}
