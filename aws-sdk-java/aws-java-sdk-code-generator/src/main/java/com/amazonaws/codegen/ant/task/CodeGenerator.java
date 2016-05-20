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

package com.amazonaws.codegen.ant.task;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;

import com.amazonaws.codegen.IntermediateModelBuilder;
import com.amazonaws.codegen.emitters.CodeEmitter;
import com.amazonaws.codegen.internal.Jackson;
import com.amazonaws.codegen.model.config.BasicCodeGenConfig;
import com.amazonaws.codegen.model.config.customization.CustomizationConfig;
import com.amazonaws.codegen.model.intermediate.IntermediateModel;
import com.amazonaws.codegen.model.intermediate.ServiceExamples;
import com.amazonaws.codegen.model.service.ServiceModel;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

public class CodeGenerator {

    private final ServiceModel serviceModel;
    private final ServiceExamples serviceExamples;
    private final BasicCodeGenConfig codeGenConfig;
    private final CustomizationConfig customConfig;
    private final String outputDirectory;
    /** The prefix for the file name that contains the intermediate model. */
    private final String fileNamePrefix;

	public CodeGenerator(ServiceModel serviceModel, ServiceExamples serviceExamples, BasicCodeGenConfig codeGenConfig,
			CustomizationConfig customConfig, String outputDirectory, String fileNamePrefix) {
        this.serviceModel = serviceModel;
        this.serviceExamples = serviceExamples;
        this.codeGenConfig = codeGenConfig;
        this.customConfig = customConfig;
        this.outputDirectory = outputDirectory;
        this.fileNamePrefix = fileNamePrefix;
    }

    /**
     * load ServiceModel. load code gen configuration from individual client. generate intermediate
     * model. generate code.
     */
    public void execute() {
        try {
            final IntermediateModel intermediateModel = new IntermediateModelBuilder(
                    customConfig, codeGenConfig, serviceModel, serviceExamples).build();

            // Dump the intermediate model to a file
            writeIntemediateModel(intermediateModel);

            emitCode(intermediateModel);

        } catch (Exception e) {
            throw new RuntimeException(
                    "Failed to generate code. Exception message : "
                            + e.getMessage(), e);

        }
    }

    private void writeIntemediateModel(IntermediateModel model)
            throws IOException {
        final File modelDir = CodeGeneratorTask.getModelDirectory(outputDirectory);
        PrintWriter writer = null;
        try {
            File outDir = new File(outputDirectory);
            if (!outDir.exists()) {
                if (!outDir.mkdirs()) {
                    throw new RuntimeException("Failed to create "
                            + outDir.getAbsolutePath());
                }
            }

            File outputFile = new File(modelDir, fileNamePrefix + "-intermediate.json");

            if (!outputFile.exists()) {
                if (!outputFile.createNewFile()) {
                    throw new RuntimeException("Error creating file "
                            + outputFile.getAbsolutePath());
                }
            }

            writer = new PrintWriter(outputFile, "UTF-8");
            Jackson.write(model, writer);
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

    private void emitCode(IntermediateModel intermediateModel)
            throws JsonGenerationException, JsonMappingException, IOException,
            InterruptedException, ExecutionException {

        try (CodeEmitter emitter = new CodeEmitter(intermediateModel, outputDirectory)) {
            emitter.emit();
        }
    }
}
