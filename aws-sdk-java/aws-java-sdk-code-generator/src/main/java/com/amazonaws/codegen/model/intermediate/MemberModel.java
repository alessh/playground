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

import com.amazonaws.codegen.internal.TypeUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;

import static com.amazonaws.codegen.internal.Constants.LINE_SEPARATOR;
import static com.amazonaws.codegen.internal.DocumentationUtils.*;

public class MemberModel extends DocumentationModel {

    private String name;

    private String c2jName;

    private String c2jShape;

    private VariableModel variable;

    private VariableModel setterModel;

    private ReturnTypeModel getterModel;

    private ParameterHttpMapping http;

    private boolean deprecated;

    private ListModel listModel;

    private MapModel mapModel;

    private String enumType;

    private String xmlNameSpaceUri;

    private boolean idempotencyToken;

    private ShapeModel shape;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MemberModel withName(String name) {
        setName(name);
        return this;
    }

    public String getC2jName() {
        return c2jName;
    }

    public void setC2jName(String c2jName) {
        this.c2jName = c2jName;
    }

    public MemberModel withC2jName(String c2jName) {
        setC2jName(c2jName);
        return this;
    }

    public String getC2jShape() {
        return c2jShape;
    }

    public void setC2jShape(String c2jShape) {
        this.c2jShape = c2jShape;
    }

    public MemberModel withC2jShape(String c2jShape) {
        setC2jShape(c2jShape);
        return this;
    }

    public VariableModel getVariable() {
        return variable;
    }

    public void setVariable(VariableModel variable) {
        this.variable = variable;
    }

    public MemberModel withVariable(VariableModel variable) {
        setVariable(variable);
        return this;
    }

    public VariableModel getSetterModel() {
        return setterModel;
    }

    public void setSetterModel(VariableModel setterModel) {
        this.setterModel = setterModel;
    }

    public MemberModel withSetterModel(VariableModel setterModel) {
        setSetterModel(setterModel);
        return this;
    }

    public ReturnTypeModel getGetterModel() {
        return getterModel;
    }

    public void setGetterModel(ReturnTypeModel getterModel) {
        this.getterModel = getterModel;
    }

    public MemberModel withGetterModel(ReturnTypeModel getterModel) {
        setGetterModel(getterModel);
        return this;
    }

    public ParameterHttpMapping getHttp() {
        return http;
    }

    public void setHttp(ParameterHttpMapping parameterHttpMapping) {
        this.http = parameterHttpMapping;
    }

    public boolean isSimple() {
        return TypeUtils.isSimple(variable.getVariableType());
    }

    public boolean isList() {
        return listModel != null;
    }

    public boolean isMap() {
        return mapModel != null;
    }

    public boolean isDeprecated() {
        return deprecated;
    }

    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    public ListModel getListModel() {
        return listModel;
    }

    public void setListModel(ListModel listModel) {
        this.listModel = listModel;
    }

    public MapModel getMapModel() {
        return mapModel;
    }

    public MemberModel withListModel(ListModel list) {
        setListModel(list);
        return this;
    }

    public void setMapModel(MapModel map) {
        this.mapModel = map;
    }

    public MemberModel withMapModel(MapModel map) {
        setMapModel(map);
        return this;
    }

    public String getEnumType() {
        return enumType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public MemberModel withEnumType(String enumType) {
        setEnumType(enumType);
        return this;
    }

    public String getXmlNameSpaceUri() {
        return xmlNameSpaceUri;
    }

    public void setXmlNameSpaceUri(String xmlNameSpaceUri) {
        this.xmlNameSpaceUri = xmlNameSpaceUri;
    }

    public MemberModel withXmlNameSpaceUri(String xmlNameSpaceUri) {
        setXmlNameSpaceUri(xmlNameSpaceUri);
        return this;
    }

    public String getSetterDocumentation() {
        StringBuilder docBuilder = new StringBuilder("/**");

        docBuilder.append(getSetterDoc());

        if ("java.nio.ByteBuffer".equals(
                this.getGetterModel().getReturnType())) {

            docBuilder.append("<p>")
                    .append(LINE_SEPARATOR)
                    .append("AWS SDK for Java performs a Base64 " +
                            "encoding on this field before sending this request to AWS " +
                            "service by default. " +
                            "Users of the SDK should not perform Base64 " +
                            "encoding on this field.")
                    .append(LINE_SEPARATOR)
                    .append("</p>")
                    .append(LINE_SEPARATOR);
        }

        docBuilder.append(getParamDoc())
                  .append(getEnumDoc())
                  .append("*/");

        return docBuilder.toString();
    }

    public String getGetterDocumentation() {
        StringBuilder docBuilder = new StringBuilder("/**");

        docBuilder.append(documentation != null ? documentation : DEFAULT_GETTER.replace("%s", name))
                  .append(LINE_SEPARATOR);

        if ("java.nio.ByteBuffer".equals(
                this.getGetterModel().getReturnType())) {

            docBuilder.append("<p>")
                    .append(LINE_SEPARATOR)
                    .append("{@code ByteBuffer}s are stateful. Calling "
                            + "their {@code get} methods changes their "
                            + "{@code position}. We recommend using "
                            + "{@link java.nio.ByteBuffer#asReadOnlyBuffer()} "
                            + "to create a read-only view of the buffer with "
                            + "an independent {@code position}, and calling "
                            + "{@code get} methods on this rather than "
                            + "directly on the returned {@code ByteBuffer}. "
                            + "Doing so will ensure that anyone else using "
                            + "the {@code ByteBuffer} will not be affected by "
                            + "changes to the {@code position}.")
                    .append(LINE_SEPARATOR)
                    .append("</p>")
                    .append(LINE_SEPARATOR);
        }

        String variableDesc = documentation != null ? documentation : DEFAULT_GETTER_PARAM.replace("%s", name);

        docBuilder.append("@return " + stripHTMLTags(variableDesc))
                  .append(getEnumDoc())
                  .append("*/");

        return docBuilder.toString();
    }

    public String getFluentSetterDocumentation() {
        StringBuilder docBuilder = new StringBuilder("/**");

        docBuilder.append(getSetterDoc())
                  .append(getParamDoc())
                  .append(LINE_SEPARATOR)
                  .append("@return " + stripHTMLTags(DEFAULT_FLUENT_RETURN))
                  .append(getEnumDoc())
                  .append("*/");

        return docBuilder.toString();
    }

    public String getVarargSetterDocumentation() {
        StringBuilder docBuilder = new StringBuilder("/**");

        docBuilder.append(getSetterDoc());

        if (listModel != null) {
            docBuilder.append(LINE_SEPARATOR)
                      .append(LIST_VARARG_ADDITIONAL_DOC.replaceAll("%s", name));
        }

        docBuilder.append(getParamDoc())
                  .append(LINE_SEPARATOR)
                  .append("@return " + stripHTMLTags(DEFAULT_FLUENT_RETURN))
                  .append(getEnumDoc());

         docBuilder.append("*/");

        return docBuilder.toString();
    }

    private String getSetterDoc() {

        return documentation != null
                ? documentation
                : DEFAULT_SETTER.replace("%s", name);
    }

    private String getParamDoc() {
        StringBuilder docBuilder = new StringBuilder();

        String variableDesc = documentation != null ? documentation
                : DEFAULT_SETTER_PARAM.replace("%s", name);

        docBuilder.append(LINE_SEPARATOR)
                  .append("@param " + variable.getVariableName() + " "
                              + stripHTMLTags(variableDesc));
        return docBuilder.toString();
    }

    private String getEnumDoc() {
        StringBuilder docBuilder = new StringBuilder();

        if (enumType != null) {
            docBuilder.append(LINE_SEPARATOR);
            docBuilder.append("@see " + enumType);
        }

        return docBuilder.toString();
    }

    public boolean isIdempotencyToken() {
        return idempotencyToken;
    }

    public void setIdempotencyToken(boolean idempotencyToken) {
        this.idempotencyToken = idempotencyToken;
    }

    @JsonIgnore
    public ShapeModel getShape() {
        return shape;
    }

    public void setShape(ShapeModel shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return c2jName;
    }

}
