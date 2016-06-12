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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateDataSourceFromRDSRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>.
     * Typically, an Amazon Resource Number (ARN) becomes the ID for a
     * <code>DataSource</code>.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     */
    private String dataSourceName;
    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     * <li> <code> InstanceIdentifier </code> - Unique identifier for the Amazon
     * RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM)
     * credentials that are used to connect to the Amazon RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by an
     * Amazon Elastic Compute Cloud (EC2) instance to carry out the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS Data
     * Pipeline service to monitor the progress of the copy task from Amazon RDS
     * to Amazon Simple Storage Service (S3). For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - Security information to use to access an Amazon RDS
     * instance. You need to set up appropriate ingress rules for the security
     * entity IDs provided to allow access to the Amazon RDS instance. Specify a
     * [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a
     * VPC-based Amazon RDS instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - Query that is used to retrieve the observation data for
     * the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - Amazon S3 location for staging RDS data. The data
     * retrieved from Amazon RDS using <code>SelectSqlQuery</code> is stored in
     * this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required
     * if <code>DataSchemaUri</code> is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string representing the splitting requirement
     * of a <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample -
     * <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     */
    private RDSDataSpec rDSData;
    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and
     * activate a data pipeline in the user’s account and copy data (using the
     * <code>SelectSqlQuery</code>) query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are
     * generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally during
     * an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     */
    private Boolean computeStatistics;

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>.
     * Typically, an Amazon Resource Number (ARN) becomes the ID for a
     * <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the
     *        <code>DataSource</code>. Typically, an Amazon Resource Number
     *        (ARN) becomes the ID for a <code>DataSource</code>.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>.
     * Typically, an Amazon Resource Number (ARN) becomes the ID for a
     * <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied ID that uniquely identifies the
     *         <code>DataSource</code>. Typically, an Amazon Resource Number
     *         (ARN) becomes the ID for a <code>DataSource</code>.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * A user-supplied ID that uniquely identifies the <code>DataSource</code>.
     * Typically, an Amazon Resource Number (ARN) becomes the ID for a
     * <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceId
     *        A user-supplied ID that uniquely identifies the
     *        <code>DataSource</code>. Typically, an Amazon Resource Number
     *        (ARN) becomes the ID for a <code>DataSource</code>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDataSourceFromRDSRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>
     *        .
     */

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @return A user-supplied name or description of the
     *         <code>DataSource</code>.
     */

    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * <p>
     * A user-supplied name or description of the <code>DataSource</code>.
     * </p>
     * 
     * @param dataSourceName
     *        A user-supplied name or description of the <code>DataSource</code>
     *        .
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDataSourceFromRDSRequest withDataSourceName(
            String dataSourceName) {
        setDataSourceName(dataSourceName);
        return this;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     * <li> <code> InstanceIdentifier </code> - Unique identifier for the Amazon
     * RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM)
     * credentials that are used to connect to the Amazon RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by an
     * Amazon Elastic Compute Cloud (EC2) instance to carry out the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS Data
     * Pipeline service to monitor the progress of the copy task from Amazon RDS
     * to Amazon Simple Storage Service (S3). For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - Security information to use to access an Amazon RDS
     * instance. You need to set up appropriate ingress rules for the security
     * entity IDs provided to allow access to the Amazon RDS instance. Specify a
     * [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a
     * VPC-based Amazon RDS instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - Query that is used to retrieve the observation data for
     * the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - Amazon S3 location for staging RDS data. The data
     * retrieved from Amazon RDS using <code>SelectSqlQuery</code> is stored in
     * this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required
     * if <code>DataSchemaUri</code> is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string representing the splitting requirement
     * of a <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample -
     * <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param rDSData
     *        The data specification of an Amazon RDS <code>DataSource</code>
     *        :</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DatabaseInformation -
     *        <ul>
     *        <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     *        <li> <code> InstanceIdentifier </code> - Unique identifier for the
     *        Amazon RDS database instance.</li>
     *        </ul>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DatabaseCredentials - AWS Identity and Access Management (IAM)
     *        credentials that are used to connect to the Amazon RDS database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by
     *        an Amazon Elastic Compute Cloud (EC2) instance to carry out the
     *        copy task from Amazon RDS to Amazon S3. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *        >Role templates</a> for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS
     *        Data Pipeline service to monitor the progress of the copy task
     *        from Amazon RDS to Amazon Simple Storage Service (S3). For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *        >Role templates</a> for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecurityInfo - Security information to use to access an Amazon RDS
     *        instance. You need to set up appropriate ingress rules for the
     *        security entity IDs provided to allow access to the Amazon RDS
     *        instance. Specify a [<code>SubnetId</code>,
     *        <code>SecurityGroupIds</code>] pair for a VPC-based Amazon RDS
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SelectSqlQuery - Query that is used to retrieve the observation
     *        data for the <code>Datasource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3StagingLocation - Amazon S3 location for staging RDS data. The
     *        data retrieved from Amazon RDS using <code>SelectSqlQuery</code>
     *        is stored in this location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not
     *        required if <code>DataSchemaUri</code> is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string representing the splitting
     *        requirement of a <code>Datasource</code>.
     *        </p>
     *        <br>
     *        <p>
     *        Sample -
     *        <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     */

    public void setRDSData(RDSDataSpec rDSData) {
        this.rDSData = rDSData;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     * <li> <code> InstanceIdentifier </code> - Unique identifier for the Amazon
     * RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM)
     * credentials that are used to connect to the Amazon RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by an
     * Amazon Elastic Compute Cloud (EC2) instance to carry out the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS Data
     * Pipeline service to monitor the progress of the copy task from Amazon RDS
     * to Amazon Simple Storage Service (S3). For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - Security information to use to access an Amazon RDS
     * instance. You need to set up appropriate ingress rules for the security
     * entity IDs provided to allow access to the Amazon RDS instance. Specify a
     * [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a
     * VPC-based Amazon RDS instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - Query that is used to retrieve the observation data for
     * the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - Amazon S3 location for staging RDS data. The data
     * retrieved from Amazon RDS using <code>SelectSqlQuery</code> is stored in
     * this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required
     * if <code>DataSchemaUri</code> is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string representing the splitting requirement
     * of a <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample -
     * <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The data specification of an Amazon RDS <code>DataSource</code>
     *         :</p>
     *         <ul>
     *         <li>
     *         <p>
     *         DatabaseInformation -
     *         <ul>
     *         <li> <code>DatabaseName </code> - Name of the Amazon RDS database.
     *         </li>
     *         <li> <code> InstanceIdentifier </code> - Unique identifier for the
     *         Amazon RDS database instance.</li>
     *         </ul>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DatabaseCredentials - AWS Identity and Access Management (IAM)
     *         credentials that are used to connect to the Amazon RDS database.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by
     *         an Amazon Elastic Compute Cloud (EC2) instance to carry out the
     *         copy task from Amazon RDS to Amazon S3. For more information, see
     *         <a href=
     *         "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *         >Role templates</a> for data pipelines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS
     *         Data Pipeline service to monitor the progress of the copy task
     *         from Amazon RDS to Amazon Simple Storage Service (S3). For more
     *         information, see <a href=
     *         "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *         >Role templates</a> for data pipelines.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SecurityInfo - Security information to use to access an Amazon
     *         RDS instance. You need to set up appropriate ingress rules for
     *         the security entity IDs provided to allow access to the Amazon
     *         RDS instance. Specify a [<code>SubnetId</code>,
     *         <code>SecurityGroupIds</code>] pair for a VPC-based Amazon RDS
     *         instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         SelectSqlQuery - Query that is used to retrieve the observation
     *         data for the <code>Datasource</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         S3StagingLocation - Amazon S3 location for staging RDS data. The
     *         data retrieved from Amazon RDS using <code>SelectSqlQuery</code>
     *         is stored in this location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>
     *         .
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataSchema - A JSON string representing the schema. This is not
     *         required if <code>DataSchemaUri</code> is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DataRearrangement - A JSON string representing the splitting
     *         requirement of a <code>Datasource</code>.
     *         </p>
     *         <br>
     *         <p>
     *         Sample -
     *         <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *         </p>
     *         </li>
     */

    public RDSDataSpec getRDSData() {
        return this.rDSData;
    }

    /**
     * <p>
     * The data specification of an Amazon RDS <code>DataSource</code>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DatabaseInformation -
     * <ul>
     * <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     * <li> <code> InstanceIdentifier </code> - Unique identifier for the Amazon
     * RDS database instance.</li>
     * </ul>
     * </p>
     * </li>
     * <li>
     * <p>
     * DatabaseCredentials - AWS Identity and Access Management (IAM)
     * credentials that are used to connect to the Amazon RDS database.
     * </p>
     * </li>
     * <li>
     * <p>
     * ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by an
     * Amazon Elastic Compute Cloud (EC2) instance to carry out the copy task
     * from Amazon RDS to Amazon S3. For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS Data
     * Pipeline service to monitor the progress of the copy task from Amazon RDS
     * to Amazon Simple Storage Service (S3). For more information, see <a href=
     * "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     * >Role templates</a> for data pipelines.
     * </p>
     * </li>
     * <li>
     * <p>
     * SecurityInfo - Security information to use to access an Amazon RDS
     * instance. You need to set up appropriate ingress rules for the security
     * entity IDs provided to allow access to the Amazon RDS instance. Specify a
     * [<code>SubnetId</code>, <code>SecurityGroupIds</code>] pair for a
     * VPC-based Amazon RDS instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * SelectSqlQuery - Query that is used to retrieve the observation data for
     * the <code>Datasource</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * S3StagingLocation - Amazon S3 location for staging RDS data. The data
     * retrieved from Amazon RDS using <code>SelectSqlQuery</code> is stored in
     * this location.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataSchema - A JSON string representing the schema. This is not required
     * if <code>DataSchemaUri</code> is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * DataRearrangement - A JSON string representing the splitting requirement
     * of a <code>Datasource</code>.
     * </p>
     * <br>
     * <p>
     * Sample -
     * <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param rDSData
     *        The data specification of an Amazon RDS <code>DataSource</code>
     *        :</p>
     *        <ul>
     *        <li>
     *        <p>
     *        DatabaseInformation -
     *        <ul>
     *        <li> <code>DatabaseName </code> - Name of the Amazon RDS database.</li>
     *        <li> <code> InstanceIdentifier </code> - Unique identifier for the
     *        Amazon RDS database instance.</li>
     *        </ul>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DatabaseCredentials - AWS Identity and Access Management (IAM)
     *        credentials that are used to connect to the Amazon RDS database.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ResourceRole - Role (DataPipelineDefaultResourceRole) assumed by
     *        an Amazon Elastic Compute Cloud (EC2) instance to carry out the
     *        copy task from Amazon RDS to Amazon S3. For more information, see
     *        <a href=
     *        "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *        >Role templates</a> for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ServiceRole - Role (DataPipelineDefaultRole) assumed by the AWS
     *        Data Pipeline service to monitor the progress of the copy task
     *        from Amazon RDS to Amazon Simple Storage Service (S3). For more
     *        information, see <a href=
     *        "http://docs.aws.amazon.com/datapipeline/latest/DeveloperGuide/dp-iam-roles.html"
     *        >Role templates</a> for data pipelines.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SecurityInfo - Security information to use to access an Amazon RDS
     *        instance. You need to set up appropriate ingress rules for the
     *        security entity IDs provided to allow access to the Amazon RDS
     *        instance. Specify a [<code>SubnetId</code>,
     *        <code>SecurityGroupIds</code>] pair for a VPC-based Amazon RDS
     *        instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        SelectSqlQuery - Query that is used to retrieve the observation
     *        data for the <code>Datasource</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        S3StagingLocation - Amazon S3 location for staging RDS data. The
     *        data retrieved from Amazon RDS using <code>SelectSqlQuery</code>
     *        is stored in this location.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchemaUri - Amazon S3 location of the <code>DataSchema</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataSchema - A JSON string representing the schema. This is not
     *        required if <code>DataSchemaUri</code> is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DataRearrangement - A JSON string representing the splitting
     *        requirement of a <code>Datasource</code>.
     *        </p>
     *        <br>
     *        <p>
     *        Sample -
     *        <code> "{\"splitting\":{\"percentBegin\":10,\"percentEnd\":60}}"</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDataSourceFromRDSRequest withRDSData(RDSDataSpec rDSData) {
        setRDSData(rDSData);
        return this;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and
     * activate a data pipeline in the user’s account and copy data (using the
     * <code>SelectSqlQuery</code>) query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @param roleARN
     *        The role that Amazon ML assumes on behalf of the user to create
     *        and activate a data pipeline in the user’s account and copy data
     *        (using the <code>SelectSqlQuery</code>) query from Amazon RDS to
     *        Amazon S3.</p>
     *        <p>
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and
     * activate a data pipeline in the user’s account and copy data (using the
     * <code>SelectSqlQuery</code>) query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @return The role that Amazon ML assumes on behalf of the user to create
     *         and activate a data pipeline in the user’s account and copy data
     *         (using the <code>SelectSqlQuery</code>) query from Amazon RDS to
     *         Amazon S3.</p>
     *         <p>
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The role that Amazon ML assumes on behalf of the user to create and
     * activate a data pipeline in the user’s account and copy data (using the
     * <code>SelectSqlQuery</code>) query from Amazon RDS to Amazon S3.
     * </p>
     * <p>
     * </p>
     * 
     * @param roleARN
     *        The role that Amazon ML assumes on behalf of the user to create
     *        and activate a data pipeline in the user’s account and copy data
     *        (using the <code>SelectSqlQuery</code>) query from Amazon RDS to
     *        Amazon S3.</p>
     *        <p>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDataSourceFromRDSRequest withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are
     * generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally during
     * an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The
     *        statistics are generated from the observation data referenced by a
     *        <code>DataSource</code>. Amazon ML uses the statistics internally
     *        during an <code>MLModel</code> training. This parameter must be
     *        set to <code>true</code> if the <code></code>DataSource
     *        <code></code> needs to be used for <code>MLModel</code> training.
     */

    public void setComputeStatistics(Boolean computeStatistics) {
        this.computeStatistics = computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are
     * generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally during
     * an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The
     *         statistics are generated from the observation data referenced by
     *         a <code>DataSource</code>. Amazon ML uses the statistics
     *         internally during an <code>MLModel</code> training. This
     *         parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code>
     *         training.
     */

    public Boolean getComputeStatistics() {
        return this.computeStatistics;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are
     * generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally during
     * an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @param computeStatistics
     *        The compute statistics for a <code>DataSource</code>. The
     *        statistics are generated from the observation data referenced by a
     *        <code>DataSource</code>. Amazon ML uses the statistics internally
     *        during an <code>MLModel</code> training. This parameter must be
     *        set to <code>true</code> if the <code></code>DataSource
     *        <code></code> needs to be used for <code>MLModel</code> training.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateDataSourceFromRDSRequest withComputeStatistics(
            Boolean computeStatistics) {
        setComputeStatistics(computeStatistics);
        return this;
    }

    /**
     * <p>
     * The compute statistics for a <code>DataSource</code>. The statistics are
     * generated from the observation data referenced by a
     * <code>DataSource</code>. Amazon ML uses the statistics internally during
     * an <code>MLModel</code> training. This parameter must be set to
     * <code>true</code> if the <code></code>DataSource<code></code> needs to be
     * used for <code>MLModel</code> training.
     * </p>
     * 
     * @return The compute statistics for a <code>DataSource</code>. The
     *         statistics are generated from the observation data referenced by
     *         a <code>DataSource</code>. Amazon ML uses the statistics
     *         internally during an <code>MLModel</code> training. This
     *         parameter must be set to <code>true</code> if the <code></code>
     *         DataSource<code></code> needs to be used for <code>MLModel</code>
     *         training.
     */

    public Boolean isComputeStatistics() {
        return this.computeStatistics;
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: " + getDataSourceId() + ",");
        if (getDataSourceName() != null)
            sb.append("DataSourceName: " + getDataSourceName() + ",");
        if (getRDSData() != null)
            sb.append("RDSData: " + getRDSData() + ",");
        if (getRoleARN() != null)
            sb.append("RoleARN: " + getRoleARN() + ",");
        if (getComputeStatistics() != null)
            sb.append("ComputeStatistics: " + getComputeStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDataSourceFromRDSRequest == false)
            return false;
        CreateDataSourceFromRDSRequest other = (CreateDataSourceFromRDSRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null
                && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getDataSourceName() == null
                ^ this.getDataSourceName() == null)
            return false;
        if (other.getDataSourceName() != null
                && other.getDataSourceName().equals(this.getDataSourceName()) == false)
            return false;
        if (other.getRDSData() == null ^ this.getRDSData() == null)
            return false;
        if (other.getRDSData() != null
                && other.getRDSData().equals(this.getRDSData()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null
                && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getComputeStatistics() == null
                ^ this.getComputeStatistics() == null)
            return false;
        if (other.getComputeStatistics() != null
                && other.getComputeStatistics().equals(
                        this.getComputeStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDataSourceId() == null) ? 0 : getDataSourceId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSourceName() == null) ? 0 : getDataSourceName()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRDSData() == null) ? 0 : getRDSData().hashCode());
        hashCode = prime * hashCode
                + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime
                * hashCode
                + ((getComputeStatistics() == null) ? 0
                        : getComputeStatistics().hashCode());
        return hashCode;
    }

    @Override
    public CreateDataSourceFromRDSRequest clone() {
        return (CreateDataSourceFromRDSRequest) super.clone();
    }
}