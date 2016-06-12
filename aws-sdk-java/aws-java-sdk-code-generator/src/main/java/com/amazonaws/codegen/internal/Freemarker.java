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

package com.amazonaws.codegen.internal;

import java.io.IOException;
import java.util.List;

import com.amazonaws.codegen.model.config.templates.ChildTemplate;
import com.amazonaws.codegen.model.config.templates.CodeGenTemplatesConfig;
import com.amazonaws.codegen.model.config.templates.TopLevelTemplate;
import com.amazonaws.codegen.model.intermediate.ShapeModel;
import com.amazonaws.codegen.model.intermediate.ShapeType;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

/**
 * Util class that sets up the freemarker configuration and loads the templates.
 */
public class Freemarker {

    private final CodeGenTemplatesConfig templateConfig;

    public Freemarker(CodeGenTemplatesConfig templateConfig) {
        this.templateConfig = templateConfig;
    }

    private Configuration newFreeMarkerConfig() {
        Configuration freeMarkerConfig = new Configuration(Configuration.VERSION_2_3_21);
        freeMarkerConfig.setDefaultEncoding("UTF-8");
        freeMarkerConfig.setClassForTemplateLoading(this.getClass(), "/");
        freeMarkerConfig
                .setTemplateExceptionHandler(TemplateExceptionHandler.DEBUG_HANDLER);

        return freeMarkerConfig;
    }

    private Template getTemplate(TopLevelTemplate template) throws IOException {

        // Create a new FreeMarker config for each top-level template, so that
        // they don't share the same macro namespace
        Configuration fmConfig = newFreeMarkerConfig();

        // Common child templates
        importChildTemplates(fmConfig, templateConfig.getCommonChildTemplates());
        // Child templates declared for the top-level template
        importChildTemplates(fmConfig, template.getChildTemplates());

        return fmConfig.getTemplate(template.getMainTemplate());
    }

    private static void importChildTemplates(
            Configuration freeMarkerConfig,
            List<ChildTemplate> childTemplates) {

        if (childTemplates == null)
            return;

        for (ChildTemplate template : childTemplates) {
            freeMarkerConfig.addAutoImport(template.getImportAsNamespace(),
                    template.getLocation());
        }
    }

    public Template getSyncClientTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncClient());
    }

    public Template getSyncAbstractClassTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncAbstractClass());
    }

    public Template getSyncInterfaceTemplate() throws IOException {
        return getTemplate(templateConfig.getSyncInterface());
    }

    public Template getAsyncClientTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncClient());
    }

    public Template getAsyncAbstractClassTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncAbstractClass());
    }

    public Template getAsyncInterfaceTemplate() throws IOException {
        return getTemplate(templateConfig.getAsyncInterface());
    }

    public Template getRequestClassTemplate() throws IOException {
        return getTemplate(templateConfig.getRequestClass());
    }

    public Template getResponseClassTemplate() throws IOException {
        return getTemplate(templateConfig.getResponseClass());
    }

    public Template getModelClassTemplate() throws IOException {
        return getTemplate(templateConfig.getModelClass());
    }

    public Template getModelEnumTemplate() throws IOException {
        return getTemplate(templateConfig.getModelEnum());
    }

    public Template getModelMarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getModelMarshaller());
    }

    public Template getModelUnmarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getModelUnmarshaller());
    }

    public Template getExceptionClassTemplate() throws IOException {
        return getTemplate(templateConfig.getExceptionClass());
    }

    public Template getExceptionUnmarshallerTemplate() throws IOException {
        return getTemplate(templateConfig.getExceptionUnmarshaller());
    }

    public Template getPolicyActionClassTemplate() throws IOException {
        return getTemplate(templateConfig.getPolicyActionClass());
    }

    public Template getShapeTemplate(ShapeModel shape) throws IOException {
        switch (ShapeType.fromValue(shape.getType())) {
        case Request:
            return getRequestClassTemplate();
        case Response:
            return getResponseClassTemplate();
        case Model:
            return getModelClassTemplate();
        case Enum:
            return getModelEnumTemplate();
        case Exception:
            return getExceptionClassTemplate();
        default:
            throw new RuntimeException(
                    "Unable to determine template for shape "
                            + shape.getShapeName());
        }
    }
}
