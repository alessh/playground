/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lambda.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that describes function metadata.
 * </p>
 */
public class UpdateFunctionCodeResult implements Serializable, Cloneable {

    /**
     * The name of the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionName;

    /**
     * The Amazon Resource Name (ARN) assigned to the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     */
    private String functionArn;

    /**
     * The runtime environment for the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     */
    private String runtime;

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String role;

    /**
     * The function Lambda calls to begin executing your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     */
    private String handler;

    /**
     * The size, in bytes, of the function .zip file you uploaded.
     */
    private Long codeSize;

    /**
     * The user-provided description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String description;

    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer timeout;

    /**
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     */
    private Integer memorySize;

    /**
     * The time stamp of the last time you updated the function.
     */
    private String lastModified;

    /**
     * It is the SHA256 hash of your function deployment package.
     */
    private String codeSha256;

    /**
     * The version of the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     */
    private String version;

    /**
     * VPC configuration associated with your Lambda function.
     */
    private VpcConfigResponse vpcConfig;

    /**
     * The name of the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The name of the function.
     */
    public String getFunctionName() {
        return functionName;
    }
    
    /**
     * The name of the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The name of the function.
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }
    
    /**
     * The name of the function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     * <b>Pattern: </b>(arn:aws:lambda:)?([a-z]{2}-[a-z]+-\d{1}:)?(\d{12}:)?(function:)?([a-zA-Z0-9-_]+)(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionName The name of the function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) assigned to the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @return The Amazon Resource Name (ARN) assigned to the function.
     */
    public String getFunctionArn() {
        return functionArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) assigned to the function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionArn The Amazon Resource Name (ARN) assigned to the function.
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) assigned to the function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA-Z0-9-_]+(:(\$LATEST|[a-zA-Z0-9-_]+))?<br/>
     *
     * @param functionArn The Amazon Resource Name (ARN) assigned to the function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withFunctionArn(String functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * The runtime environment for the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @return The runtime environment for the Lambda function.
     *
     * @see Runtime
     */
    public String getRuntime() {
        return runtime;
    }
    
    /**
     * The runtime environment for the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The runtime environment for the Lambda function.
     *
     * @see Runtime
     */
    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }
    
    /**
     * The runtime environment for the Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The runtime environment for the Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UpdateFunctionCodeResult withRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * The runtime environment for the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The runtime environment for the Lambda function.
     *
     * @see Runtime
     */
    public void setRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
    }
    
    /**
     * The runtime environment for the Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>nodejs, nodejs4.3, java8, python2.7
     *
     * @param runtime The runtime environment for the Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see Runtime
     */
    public UpdateFunctionCodeResult withRuntime(Runtime runtime) {
        this.runtime = runtime.toString();
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     * when it executes your function to access any other Amazon Web Services
     * (AWS) resources.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param role The Amazon Resource Name (ARN) of the IAM role that Lambda assumes
     *         when it executes your function to access any other Amazon Web Services
     *         (AWS) resources.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * The function Lambda calls to begin executing your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @return The function Lambda calls to begin executing your function.
     */
    public String getHandler() {
        return handler;
    }
    
    /**
     * The function Lambda calls to begin executing your function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function Lambda calls to begin executing your function.
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }
    
    /**
     * The function Lambda calls to begin executing your function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     * <b>Pattern: </b>[^\s]+<br/>
     *
     * @param handler The function Lambda calls to begin executing your function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withHandler(String handler) {
        this.handler = handler;
        return this;
    }

    /**
     * The size, in bytes, of the function .zip file you uploaded.
     *
     * @return The size, in bytes, of the function .zip file you uploaded.
     */
    public Long getCodeSize() {
        return codeSize;
    }
    
    /**
     * The size, in bytes, of the function .zip file you uploaded.
     *
     * @param codeSize The size, in bytes, of the function .zip file you uploaded.
     */
    public void setCodeSize(Long codeSize) {
        this.codeSize = codeSize;
    }
    
    /**
     * The size, in bytes, of the function .zip file you uploaded.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeSize The size, in bytes, of the function .zip file you uploaded.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withCodeSize(Long codeSize) {
        this.codeSize = codeSize;
        return this;
    }

    /**
     * The user-provided description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The user-provided description.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The user-provided description.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The user-provided description.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The user-provided description.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param description The user-provided description.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public Integer getTimeout() {
        return timeout;
    }
    
    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }
    
    /**
     * The function execution time at which Lambda should terminate the
     * function. Because the execution time has cost implications, we
     * recommend you set this value based on your expected execution time.
     * The default is 3 seconds.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param timeout The function execution time at which Lambda should terminate the
     *         function. Because the execution time has cost implications, we
     *         recommend you set this value based on your expected execution time.
     *         The default is 3 seconds.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @return The memory size, in MB, you configured for the function. Must be a
     *         multiple of 64 MB.
     */
    public Integer getMemorySize() {
        return memorySize;
    }
    
    /**
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The memory size, in MB, you configured for the function. Must be a
     *         multiple of 64 MB.
     */
    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }
    
    /**
     * The memory size, in MB, you configured for the function. Must be a
     * multiple of 64 MB.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>128 - 1536<br/>
     *
     * @param memorySize The memory size, in MB, you configured for the function. Must be a
     *         multiple of 64 MB.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    /**
     * The time stamp of the last time you updated the function.
     *
     * @return The time stamp of the last time you updated the function.
     */
    public String getLastModified() {
        return lastModified;
    }
    
    /**
     * The time stamp of the last time you updated the function.
     *
     * @param lastModified The time stamp of the last time you updated the function.
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
    
    /**
     * The time stamp of the last time you updated the function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param lastModified The time stamp of the last time you updated the function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }

    /**
     * It is the SHA256 hash of your function deployment package.
     *
     * @return It is the SHA256 hash of your function deployment package.
     */
    public String getCodeSha256() {
        return codeSha256;
    }
    
    /**
     * It is the SHA256 hash of your function deployment package.
     *
     * @param codeSha256 It is the SHA256 hash of your function deployment package.
     */
    public void setCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
    }
    
    /**
     * It is the SHA256 hash of your function deployment package.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param codeSha256 It is the SHA256 hash of your function deployment package.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withCodeSha256(String codeSha256) {
        this.codeSha256 = codeSha256;
        return this;
    }

    /**
     * The version of the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @return The version of the Lambda function.
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the Lambda function.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param version The version of the Lambda function.
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>(\$LATEST|[0-9]+)<br/>
     *
     * @param version The version of the Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * VPC configuration associated with your Lambda function.
     *
     * @return VPC configuration associated with your Lambda function.
     */
    public VpcConfigResponse getVpcConfig() {
        return vpcConfig;
    }
    
    /**
     * VPC configuration associated with your Lambda function.
     *
     * @param vpcConfig VPC configuration associated with your Lambda function.
     */
    public void setVpcConfig(VpcConfigResponse vpcConfig) {
        this.vpcConfig = vpcConfig;
    }
    
    /**
     * VPC configuration associated with your Lambda function.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcConfig VPC configuration associated with your Lambda function.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateFunctionCodeResult withVpcConfig(VpcConfigResponse vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionName() != null) sb.append("FunctionName: " + getFunctionName() + ",");
        if (getFunctionArn() != null) sb.append("FunctionArn: " + getFunctionArn() + ",");
        if (getRuntime() != null) sb.append("Runtime: " + getRuntime() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() + ",");
        if (getHandler() != null) sb.append("Handler: " + getHandler() + ",");
        if (getCodeSize() != null) sb.append("CodeSize: " + getCodeSize() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getTimeout() != null) sb.append("Timeout: " + getTimeout() + ",");
        if (getMemorySize() != null) sb.append("MemorySize: " + getMemorySize() + ",");
        if (getLastModified() != null) sb.append("LastModified: " + getLastModified() + ",");
        if (getCodeSha256() != null) sb.append("CodeSha256: " + getCodeSha256() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getVpcConfig() != null) sb.append("VpcConfig: " + getVpcConfig() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFunctionName() == null) ? 0 : getFunctionName().hashCode()); 
        hashCode = prime * hashCode + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode()); 
        hashCode = prime * hashCode + ((getRuntime() == null) ? 0 : getRuntime().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode()); 
        hashCode = prime * hashCode + ((getCodeSize() == null) ? 0 : getCodeSize().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getTimeout() == null) ? 0 : getTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getMemorySize() == null) ? 0 : getMemorySize().hashCode()); 
        hashCode = prime * hashCode + ((getLastModified() == null) ? 0 : getLastModified().hashCode()); 
        hashCode = prime * hashCode + ((getCodeSha256() == null) ? 0 : getCodeSha256().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateFunctionCodeResult == false) return false;
        UpdateFunctionCodeResult other = (UpdateFunctionCodeResult)obj;
        
        if (other.getFunctionName() == null ^ this.getFunctionName() == null) return false;
        if (other.getFunctionName() != null && other.getFunctionName().equals(this.getFunctionName()) == false) return false; 
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null) return false;
        if (other.getFunctionArn() != null && other.getFunctionArn().equals(this.getFunctionArn()) == false) return false; 
        if (other.getRuntime() == null ^ this.getRuntime() == null) return false;
        if (other.getRuntime() != null && other.getRuntime().equals(this.getRuntime()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        if (other.getHandler() == null ^ this.getHandler() == null) return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false) return false; 
        if (other.getCodeSize() == null ^ this.getCodeSize() == null) return false;
        if (other.getCodeSize() != null && other.getCodeSize().equals(this.getCodeSize()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getTimeout() == null ^ this.getTimeout() == null) return false;
        if (other.getTimeout() != null && other.getTimeout().equals(this.getTimeout()) == false) return false; 
        if (other.getMemorySize() == null ^ this.getMemorySize() == null) return false;
        if (other.getMemorySize() != null && other.getMemorySize().equals(this.getMemorySize()) == false) return false; 
        if (other.getLastModified() == null ^ this.getLastModified() == null) return false;
        if (other.getLastModified() != null && other.getLastModified().equals(this.getLastModified()) == false) return false; 
        if (other.getCodeSha256() == null ^ this.getCodeSha256() == null) return false;
        if (other.getCodeSha256() != null && other.getCodeSha256().equals(this.getCodeSha256()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null) return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false) return false; 
        return true;
    }
    
    @Override
    public UpdateFunctionCodeResult clone() {
        try {
            return (UpdateFunctionCodeResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    