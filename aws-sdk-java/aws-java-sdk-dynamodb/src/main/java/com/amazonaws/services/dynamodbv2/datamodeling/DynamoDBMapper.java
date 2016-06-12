/*   
 * Copyright 2015-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.   
 *   
 * Licensed under the Apache License, Version 2.0 (the "License");   
 * you may not use this file except in compliance with the License.   
 * You may obtain a copy of the License at:   
 *   
 *    http://aws.amazon.com/apache2.0   
 *   
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES   
 * OR CONDITIONS OF ANY KIND, either express or implied. See the   
 * License for the specific language governing permissions and   
 * limitations under the License.   
 */
package com.amazonaws.services.dynamodbv2.datamodeling;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.retry.RetryUtils;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.BatchWriteRetryStrategy;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.ConsistentReads;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig.SaveBehavior;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTableSchemaParser.TableIndexesInfo;
import com.amazonaws.services.dynamodbv2.model.AttributeAction;
import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.AttributeValueUpdate;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchGetItemResult;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemRequest;
import com.amazonaws.services.dynamodbv2.model.BatchWriteItemResult;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionalCheckFailedException;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteItemRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteRequest;
import com.amazonaws.services.dynamodbv2.model.DeleteTableRequest;
import com.amazonaws.services.dynamodbv2.model.ExpectedAttributeValue;
import com.amazonaws.services.dynamodbv2.model.GetItemRequest;
import com.amazonaws.services.dynamodbv2.model.GetItemResult;
import com.amazonaws.services.dynamodbv2.model.KeysAndAttributes;
import com.amazonaws.services.dynamodbv2.model.PutItemRequest;
import com.amazonaws.services.dynamodbv2.model.PutItemResult;
import com.amazonaws.services.dynamodbv2.model.PutRequest;
import com.amazonaws.services.dynamodbv2.model.QueryRequest;
import com.amazonaws.services.dynamodbv2.model.QueryResult;
import com.amazonaws.services.dynamodbv2.model.ReturnValue;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;
import com.amazonaws.services.dynamodbv2.model.Select;
import com.amazonaws.services.dynamodbv2.model.UpdateItemRequest;
import com.amazonaws.services.dynamodbv2.model.UpdateItemResult;
import com.amazonaws.services.dynamodbv2.model.WriteRequest;
import com.amazonaws.services.s3.model.Region;
import com.amazonaws.util.VersionInfoUtils;

/**
 * Object mapper for domain-object interaction with DynamoDB.
 * <p>
 * To use, define a domain class that represents an item in a DynamoDB table and
 * annotate it with the annotations found in the
 * com.amazonaws.services.dynamodbv2.datamodeling package. In order to allow the
 * mapper to correctly persist the data, each modeled property in the domain
 * class should be accessible via getter and setter methods, and each property
 * annotation should be either applied to the getter method or the class field.
 * A minimal example using getter annotations:
 *
 * <pre class="brush: java">
 * &#064;DynamoDBTable(tableName = &quot;TestTable&quot;)
 * public class TestClass {
 *
 *     private Long key;
 *     private double rangeKey;
 *     private Long version;
 *
 *     private Set&lt;Integer&gt; integerSetAttribute;
 *
 *     &#064;DynamoDBHashKey
 *     public Long getKey() {
 *         return key;
 *     }
 *
 *     public void setKey(Long key) {
 *         this.key = key;
 *     }
 *
 *     &#064;DynamoDBRangeKey
 *     public double getRangeKey() {
 *         return rangeKey;
 *     }
 *
 *     public void setRangeKey(double rangeKey) {
 *         this.rangeKey = rangeKey;
 *     }
 *
 *     &#064;DynamoDBAttribute(attributeName = &quot;integerSetAttribute&quot;)
 *     public Set&lt;Integer&gt; getIntegerAttribute() {
 *         return integerSetAttribute;
 *     }
 *
 *     public void setIntegerAttribute(Set&lt;Integer&gt; integerAttribute) {
 *         this.integerSetAttribute = integerAttribute;
 *     }
 *
 *     &#064;DynamoDBVersionAttribute
 *     public Long getVersion() {
 *         return version;
 *     }
 *
 *     public void setVersion(Long version) {
 *         this.version = version;
 *     }
 * }
 * </pre>
 * <p>
 * Save instances of annotated classes to DynamoDB, retrieve them, and delete
 * them using the {@link DynamoDBMapper} class, as in the following example.
 *
 * <pre class="brush: java">
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * Long hashKey = 105L;
 * double rangeKey = 1.0d;
 * TestClass obj = mapper.load(TestClass.class, hashKey, rangeKey);
 * obj.getIntegerAttribute().add(42);
 * mapper.save(obj);
 * mapper.delete(obj);
 * </pre>
 * <p>
 * If you don't have your DynamoDB table set up yet, you can use
 * {@link DynamoDBMapper#generateCreateTableRequest(Class)} to construct the
 * {@link CreateTableRequest} for the table represented by your annotated class.
 *
 * <pre class="brush: java">
 * AmazonDynamoDB dynamoDBClient = new AmazonDynamoDBClient();
 * DynamoDBMapper mapper = new DynamoDBMapper(dynamoDBClient);
 * CreateTableRequest req = mapper.generateCreateTableRequest(TestClass.class);
 * // Table provision throughput is still required since it cannot be specified in your POJO
 * req.setProvisionedThroughput(new ProvisionedThroughput(5L, 5L));
 * // Fire off the CreateTableRequest using the low-level client
 * dynamoDBClient.createTable(req);
 * </pre>
 * <p>
 * When using the save, load, and delete methods, {@link DynamoDBMapper} will
 * throw {@link DynamoDBMappingException}s to indicate that domain classes are
 * incorrectly annotated or otherwise incompatible with this class. Service
 * exceptions will always be propagated as {@link AmazonClientException}, and
 * DynamoDB-specific subclasses such as {@link ConditionalCheckFailedException}
 * will be used when possible.
 * <p>
 * This class is thread-safe and can be shared between threads. It's also very
 * lightweight, so it doesn't need to be.
 *
 * @see DynamoDBTable
 * @see DynamoDBHashKey
 * @see DynamoDBRangeKey
 * @see DynamoDBAutoGeneratedKey
 * @see DynamoDBAttribute
 * @see DynamoDBVersionAttribute
 * @see DynamoDBIgnore
 * @see DynamoDBMarshalling
 * @see DynamoDBMapperConfig
 */
public class DynamoDBMapper extends AbstractDynamoDBMapper {

    private final S3ClientCache s3cc;
    private final AmazonDynamoDB db;
    private final DynamoDBMapperConfig config;
    private final DynamoDBMappingsRegistry registry = DynamoDBMappingsRegistry.instance();
    private final DynamoDBTableSchemaParser schemaParser = new DynamoDBTableSchemaParser();

    private final AttributeTransformer transformer;

    /**
     * The max back off time for batch get. The configuration for batch write
     * has been moved to DynamoDBMapperConfig
     */
    static final long MAX_BACKOFF_IN_MILLISECONDS = 1000 * 3;

    /** The max number of items allowed in a BatchWrite request */
    static final int MAX_ITEMS_PER_BATCH = 25;
    /**
     * This retry count is applicable only when every batch get item request
     * results in no data retrieved from server and the un processed keys is
     * same as request items
     */
    static final int BATCH_GET_MAX_RETRY_COUNT_ALL_KEYS = 5;

    /**
     * User agent for requests made using the {@link DynamoDBMapper}.
     */
    private static final String USER_AGENT =
            DynamoDBMapper.class.getName() + "/" + VersionInfoUtils.getVersion();
    private static final String USER_AGENT_BATCH_OPERATION  =
            DynamoDBMapper.class.getName() + "_batch_operation/" + VersionInfoUtils.getVersion();

    private static final String NO_RANGE_KEY = new String();

    private static final Log log = LogFactory.getLog(DynamoDBMapper.class);

    /**
     * Fail fast when trying to create a subclass of the DynamoDBMapper that
     * attempts to override one of the old {@code transformAttributes} methods.
     */
    private static void failFastOnIncompatibleSubclass(Class<?> clazz) {
        while (clazz != DynamoDBMapper.class) {
            Class<?>[] classOverride = new Class<?>[] {
                    Class.class,
                    Map.class
            };
            Class<?>[] nameOverride = new Class<?>[] {
                    String.class,
                    String.class,
                    Map.class
            };

            for (Method method : clazz.getDeclaredMethods()) {
                if (method.getName().equals("transformAttributes")) {
                    Class<?>[] params = method.getParameterTypes();
                    if (Arrays.equals(params, classOverride)
                            || Arrays.equals(params, nameOverride)) {

                        throw new IllegalStateException(
                                "The deprecated transformAttributes method is "
                                + "no longer supported as of 1.9.0. Use an "
                                + "AttributeTransformer to inject custom "
                                + "attribute transformation logic.");
                    }
                }
            }

            clazz = clazz.getSuperclass();
        }
    }



    /**
     * Constructs a new mapper with the service object given, using the default
     * configuration.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(final AmazonDynamoDB dynamoDB) {
        this(dynamoDB, DynamoDBMapperConfig.DEFAULT, null, null);
    }

    /**
     * Constructs a new mapper with the service object and configuration given.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config) {

        this(dynamoDB, config, null, null);
    }

    /**
     * Constructs a new mapper with the service object and S3 client cache
     * given, using the default configuration.
     *
     * @param ddb
     *            The service object to use for all service calls.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     * @see DynamoDBMapperConfig#DEFAULT
     */
    public DynamoDBMapper(
            final AmazonDynamoDB ddb,
            final AWSCredentialsProvider s3CredentialProvider) {

        this(ddb, DynamoDBMapperConfig.DEFAULT, s3CredentialProvider);
    }

    /**
     * Constructs a new mapper with the given service object, configuration,
     * and transform hook.
     *
     * @param dynamoDB
     *            the service object to use for all service calls
     * @param config
     *            the default configuration to use for all service calls. It
     *            can be overridden on a per-operation basis
     * @param transformer
     *            The custom attribute transformer to invoke when serializing or
     *            deserializing an object.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AttributeTransformer transformer) {

        this(dynamoDB, config, transformer, null);
    }

    /**
     * Constructs a new mapper with the service object, configuration, and S3
     * client cache given.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AWSCredentialsProvider s3CredentialProvider) {

        this(dynamoDB, config, null, validate(s3CredentialProvider));
    }

    /**
     * Throws an exception if the given credentials provider is {@code null}.
     */
    private static AWSCredentialsProvider validate(
            final AWSCredentialsProvider provider) {
        if (provider == null) {
            throw new IllegalArgumentException(
                    "s3 credentials provider must not be null");
        }
        return provider;
    }

    /**
     * Constructor with all parameters.
     *
     * @param dynamoDB
     *            The service object to use for all service calls.
     * @param config
     *            The default configuration to use for all service calls. It can
     *            be overridden on a per-operation basis.
     * @param transformer
     *            The custom attribute transformer to invoke when serializing or
     *            deserializing an object.
     * @param s3CredentialProvider
     *            The credentials provider for accessing S3.
     *            Relevant only if {@link S3Link} is involved.
     */
    public DynamoDBMapper(
            final AmazonDynamoDB dynamoDB,
            final DynamoDBMapperConfig config,
            final AttributeTransformer transformer,
            final AWSCredentialsProvider s3CredentialsProvider) {

        failFastOnIncompatibleSubclass(getClass());

        this.db = dynamoDB;
        this.config = config;
        this.transformer = transformer;

        if (s3CredentialsProvider == null) {
            this.s3cc = null;
        } else {
            this.s3cc = new S3ClientCache(s3CredentialsProvider);
        }
    }

    @Override
    public <T extends Object> T load(Class<T> clazz, Object hashKey, DynamoDBMapperConfig config) {
        return load(clazz, hashKey, null, config);
    }

    @Override
    public <T extends Object> T load(Class<T> clazz, Object hashKey) {
        return load(clazz, hashKey, null, config);
    }

    @Override
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey) {
        return load(clazz, hashKey, rangeKey, config);
    }

    @Override
    public <T extends Object> T load(T keyObject) {
        return load(keyObject, this.config);
    }

    @Override
    public <T extends Object> T load(T keyObject, DynamoDBMapperConfig config) {
        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) keyObject.getClass();

        config = mergeConfig(config);
        ItemConverter converter = getConverter(config);

        String tableName = getTableName(clazz, keyObject, config);

        GetItemRequest rq = new GetItemRequest()
            .withRequestMetricCollector(config.getRequestMetricCollector());

        Map<String, AttributeValue> key = getKey(converter, keyObject, clazz);

        rq.setKey(key);
        rq.setTableName(tableName);
        rq.setConsistentRead(config.getConsistentReads() == ConsistentReads.CONSISTENT);


        GetItemResult item = db.getItem(applyUserAgent(rq));
        Map<String, AttributeValue> itemAttributes = item.getItem();
        if ( itemAttributes == null ) {
            return null;
        }

        T object = privateMarshallIntoObject(
                converter,
                toParameters(itemAttributes, clazz, tableName, config));

        return object;
    }

    /**
     * Returns a key map for the key object given.
     *
     * @param keyObject
     *            The key object, corresponding to an item in a dynamo table.
     */
    @SuppressWarnings("unchecked")
    private <T> Map<String, AttributeValue> getKey(
            ItemConverter converter,
            T keyObject) {

        return getKey(converter, keyObject, (Class<T>) keyObject.getClass());
    }

    private <T> Map<String, AttributeValue> getKey(
            ItemConverter converter,
            T keyObject,
            Class<T> clazz) {

        final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);

        Map<String, AttributeValue> key = new HashMap<String, AttributeValue>();
        for (final DynamoDBMappingsRegistry.Mapping mapping : mappings.getPrimaryKeys()) {
            Object getterResult =
                    mapping.getValueOf(keyObject);

            AttributeValue keyAttributeValue =
                    converter.convert(mapping.getter(), getterResult);

            if (keyAttributeValue == null) {
                throw new DynamoDBMappingException(
                        "Null key found for " + mapping.getter());
            }

            key.put(mapping.getAttributeName(), keyAttributeValue);
        }

        if (key.isEmpty()) {
            throw new DynamoDBMappingException(
                    "Class must be annotated with " + DynamoDBHashKey.class
                    + " and " + DynamoDBRangeKey.class);
        }

        return key;
    }

    @Override
    public <T extends Object> T load(Class<T> clazz, Object hashKey, Object rangeKey, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        T keyObject = createKeyObject(clazz, hashKey, rangeKey);
        return load(keyObject, config);
    }

    /**
     * Creates a key prototype object for the class given with the single hash and range key given.
     */
    private <T> T createKeyObject(Class<T> clazz, Object hashKey, Object rangeKey) {
        final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);

        //ensure hash key exists
        //ideally, we should throw this on mapping creation but for legacy reasons cannot
        mappings.getHashKey();

        if ( rangeKey != null && !mappings.hasRangeKey() ) {
            throw new DynamoDBMappingException("No method annotated with " + DynamoDBRangeKey.class + " for class " + clazz);
        }

        T keyObject = null;
        try {
            keyObject = clazz.newInstance();
        } catch ( Exception e ) {
            throw new DynamoDBMappingException("Failed to instantiate class", e);
        }

        for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getPrimaryKeys() ) {
            if ( mapping.isHashKey() ) {
                mapping.setValueOf(keyObject, hashKey);
            } else if ( mapping.isRangeKey() ) {
                mapping.setValueOf(keyObject, rangeKey);
            }
        }
        return keyObject;
    }

    /**
     * Returns a map of attribute name to EQ condition for the key prototype
     * object given. This method considers attributes annotated with either
     * {@link DynamoDBHashKey} or {@link DynamoDBIndexHashKey}.
     *
     * @param obj
     *            The prototype object that includes the hash key value.
     * @return A map of hash key attribute name to EQ condition for the key
     *         prototype object, or an empty map if obj is null.
     */
    private Map<String, Condition> getHashKeyEqualsConditions(
            ItemConverter converter,
            Object obj) {

        Map<String, Condition> conditions = new HashMap<String, Condition>();
        if (obj == null) {
            return conditions;
        }

        final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(obj.getClass());

        for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getMappings() ) {
            if ( mapping.isHashKey() || mapping.isIndexHashKey() ) {

                Object getterReturnResult =
                        mapping.getValueOf(obj);

                if (getterReturnResult != null) {
                    conditions.put(
                        mapping.getAttributeName(),
                        new Condition()
                            .withComparisonOperator(ComparisonOperator.EQ)
                            .withAttributeValueList(
                                converter.convert(mapping.getter(), getterReturnResult)));
                }
            }
        }

        return conditions;
    }

    /**
     * Returns the table name for the class given.
     */
    protected final String getTableName(final Class<?> clazz,
                                        final DynamoDBMapperConfig config) {

        return internalGetTableName(clazz, null, config);
    }

    /**
     * Returns the table name for the class or object given.
     */
    protected final String getTableName(final Class<?> clazz,
                                        final Object object,
                                        final DynamoDBMapperConfig config) {

        return internalGetTableName(clazz, object, config);
    }

    static String internalGetTableName(final Class<?> clazz,
                                       final Object object,
                                       final DynamoDBMapperConfig config) {

        // Resolve by object, if possible and desired
        DynamoDBMapperConfig.ObjectTableNameResolver objectResolver = config.getObjectTableNameResolver();
        if (object != null && objectResolver != null) {
            return objectResolver.getTableName(object, config);
        }

        // Resolve by class
        DynamoDBMapperConfig.TableNameResolver classResolver = config.getTableNameResolver();
        if (classResolver == null) {
            classResolver = DynamoDBMapperConfig.DefaultTableNameResolver.INSTANCE;
        }
        return classResolver.getTableName(clazz, config);
    }

    @Override
    public <T> T marshallIntoObject(Class<T> clazz, Map<String, AttributeValue> itemAttributes) {

        ItemConverter converter = getConverter(config);

        String tableName = getTableName(clazz, config);

        return privateMarshallIntoObject(
                converter,
                toParameters(itemAttributes, clazz, tableName, config));
    }

    /**
     * The one true implementation of marshallIntoObject.
     */
    private <T> T privateMarshallIntoObject(
            ItemConverter converter,
            AttributeTransformer.Parameters<T> parameters) {

        Class<T> clazz = parameters.getModelClass();
        Map<String, AttributeValue> values = untransformAttributes(parameters);

        return converter.unconvert(clazz, values);
    }

    @Override
    public <T> List<T> marshallIntoObjects(Class<T> clazz, List<Map<String, AttributeValue>> itemAttributes) {
        List<T> result = new ArrayList<T>(itemAttributes.size());
        for (Map<String, AttributeValue> item : itemAttributes) {
            result.add(marshallIntoObject(clazz, item));
        }
        return result;
    }

    /**
     * A replacement for {@link #marshallIntoObjects(Class, List)} that takes
     * an extra set of parameters to be tunneled through to
     * {@code privateMarshalIntoObject} (if nothing along the way is
     * overridden). It's package-private because some of the Paginated*List
     * classes call back into it, but final because no one, even in this
     * package, should ever override it.
     */
    final <T> List<T> marshallIntoObjects(
            final List<AttributeTransformer.Parameters<T>> parameters
    ) {
        List<T> result = new ArrayList<T>(parameters.size());

        ItemConverter converter = null;
        if (!parameters.isEmpty()) {
            converter = getConverter(parameters.get(0).getMapperConfig());
        }

        for (AttributeTransformer.Parameters<T> entry : parameters) {
            result.add(privateMarshallIntoObject(converter, entry));
        }

        return result;
    }

    @Override
    public <T extends Object> void save(T object) {
        save(object, null, config);
    }

    @Override
    public <T extends Object> void save(T object, DynamoDBSaveExpression saveExpression) {
        save(object, saveExpression, config);
    }

    private boolean needAutoGenerateAssignableKey(Class<?> clazz, Object object) {
        final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);

        //ensure hash key exists
        //ideally, we should throw this on mapping creation but for legacy reasons cannot
        mappings.getHashKey();

        return mappings.anyPrimaryKeyAutoGeneratable(object);
    }

    @Override
    public <T extends Object> void save(T object, DynamoDBMapperConfig config) {
        save(object, null, config);
    }

    @Override
    public <T extends Object> void save(T object,
                                        DynamoDBSaveExpression saveExpression,
                                        final DynamoDBMapperConfig config) {
        final DynamoDBMapperConfig finalConfig = mergeConfig(config);
        final ItemConverter converter = getConverter(finalConfig);

        @SuppressWarnings("unchecked")
        Class<? extends T> clazz = (Class<? extends T>) object.getClass();
        String tableName = getTableName(clazz, object, finalConfig);

        /*
         * We force a putItem request instead of updateItem request either when
         * CLOBBER is configured, or part of the primary key of the object needs
         * to be auto-generated.
         */
        boolean forcePut = (finalConfig.getSaveBehavior() == SaveBehavior.CLOBBER)
                || needAutoGenerateAssignableKey(clazz, object);

        SaveObjectHandler saveObjectHandler;

        if (forcePut) {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig, converter, saveExpression) {

                @Override
                protected void onPrimaryKeyAttributeValue(String attributeName,
                        AttributeValue keyAttributeValue) {
                    /* Treat key values as common attribute value updates. */
                    getAttributeValueUpdates().put(attributeName,
                            new AttributeValueUpdate().withValue(keyAttributeValue)
                                    .withAction("PUT"));
                }

                /* Use default implementation of onNonKeyAttribute(...) */

                @Override
                protected void onNullNonKeyAttribute(String attributeName) {
                    /* When doing a force put, we can safely ignore the null-valued attributes. */
                    return;
                }

                @Override
                protected void executeLowLevelRequest() {
                    /* Send a putItem request */
                    doPutItem();
                }
            };
        } else {
            saveObjectHandler = this.new SaveObjectHandler(clazz, object,
                    tableName, finalConfig, converter, saveExpression) {

                @Override
                protected void onPrimaryKeyAttributeValue(String attributeName,
                        AttributeValue keyAttributeValue) {
                    /* Put it in the key collection which is later used in the updateItem request. */
                    getPrimaryKeyAttributeValues().put(attributeName, keyAttributeValue);
                }


                @Override
                protected void onNonKeyAttribute(String attributeName,
                        AttributeValue currentValue) {
                    /* If it's a set attribute and the mapper is configured with APPEND_SET,
                     * we do an "ADD" update instead of the default "PUT".
                     */
                    if (getLocalSaveBehavior() == SaveBehavior.APPEND_SET) {
                        if (currentValue.getBS() != null
                                || currentValue.getNS() != null
                                || currentValue.getSS() != null) {
                            getAttributeValueUpdates().put(
                                    attributeName,
                                    new AttributeValueUpdate().withValue(
                                            currentValue).withAction("ADD"));
                            return;
                        }
                    }
                    /* Otherwise, we do the default "PUT" update. */
                    super.onNonKeyAttribute(attributeName, currentValue);
                }

                @Override
                protected void onNullNonKeyAttribute(String attributeName) {
                    /*
                     * If UPDATE_SKIP_NULL_ATTRIBUTES or APPEND_SET is
                     * configured, we don't delete null value attributes.
                     */
                    if (getLocalSaveBehavior() == SaveBehavior.UPDATE_SKIP_NULL_ATTRIBUTES
                            || getLocalSaveBehavior() == SaveBehavior.APPEND_SET) {
                        return;
                    }

                    else {
                        /* Delete attributes that are set as null in the object. */
                        getAttributeValueUpdates()
                                .put(attributeName,
                                        new AttributeValueUpdate()
                                                .withAction("DELETE"));
                    }
                }

                @Override
                protected void executeLowLevelRequest() {
                    UpdateItemResult updateItemResult = doUpdateItem();

                    // The UpdateItem request is specified to return ALL_NEW
                    // attributes of the affected item. So if the returned
                    // UpdateItemResult does not include any ReturnedAttributes,
                    // it indicates the UpdateItem failed silently (e.g. the
                    // key-only-put nightmare -
                    // https://forums.aws.amazon.com/thread.jspa?threadID=86798&tstart=25),
                    // in which case we should re-send a PutItem
                    // request instead.
                    if (updateItemResult.getAttributes() == null
                            || updateItemResult.getAttributes().isEmpty()) {
                        // Before we proceed with PutItem, we need to put all
                        // the key attributes (prepared for the
                        // UpdateItemRequest) into the AttributeValueUpdates
                        // collection.
                        for (String keyAttributeName : getPrimaryKeyAttributeValues().keySet()) {
                            getAttributeValueUpdates().put(keyAttributeName,
                                    new AttributeValueUpdate()
                                            .withValue(getPrimaryKeyAttributeValues().get(keyAttributeName))
                                            .withAction("PUT"));
                        }

                        doPutItem();
                    }
                }
            };
        }

        saveObjectHandler.execute();
    }

    /**
     * The handler for saving object using DynamoDBMapper. Caller should
     * implement the abstract methods to provide the expected behavior on each
     * scenario, and this handler will take care of all the other basic workflow
     * and common operations.
     */
    protected abstract class SaveObjectHandler {

        protected final Object object;
        protected final Class<?> clazz;
        private final String tableName;
        private final DynamoDBMapperConfig saveConfig;
        private final ItemConverter converter;

        private final Map<String, AttributeValue> primaryKeys;
        private final Map<String, AttributeValueUpdate> updateValues;

        /**
         * Any expected value conditions specified by the implementation of
         * DynamoDBMapper, e.g. value assertions on versioned attributes.
         */
        private final Map<String, ExpectedAttributeValue> internalExpectedValueAssertions;

        /**
         * Additional expected value conditions specified by the user.
         */
        protected final Map<String, ExpectedAttributeValue> userProvidedExpectedValueConditions;

        /**
         * Condition operator on the additional expected value conditions
         * specified by the user.
         */
        protected final String userProvidedConditionOperator;

        private final List<ValueUpdate> inMemoryUpdates;

        /**
         * Constructs a handler for saving the specified model object.
         *
         * @param object            The model object to be saved.
         * @param clazz             The domain class of the object.
         * @param tableName         The table name.
         * @param saveConifg        The mapper configuration used for this save.
         * @param saveExpression    The save expression, including the user-provided conditions and an optional logic operator.
         */
        public SaveObjectHandler(
                Class<?> clazz,
                Object object,
                String tableName,
                DynamoDBMapperConfig saveConfig,
                ItemConverter converter,
                DynamoDBSaveExpression saveExpression) {

            this.clazz = clazz;
            this.object = object;
            this.tableName = tableName;
            this.saveConfig = saveConfig;
            this.converter = converter;

            if (saveExpression != null) {
                userProvidedExpectedValueConditions = saveExpression
                        .getExpected();
                userProvidedConditionOperator = saveExpression
                        .getConditionalOperator();
            } else {
                userProvidedExpectedValueConditions = null;
                userProvidedConditionOperator = null;
            }

            updateValues = new HashMap<String, AttributeValueUpdate>();
            internalExpectedValueAssertions = new HashMap<String, ExpectedAttributeValue>();
            inMemoryUpdates = new LinkedList<ValueUpdate>();
            primaryKeys = new HashMap<String, AttributeValue>();
        }

        /**
         * The general workflow of a save operation.
         */
        public void execute() {
            final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);

            /*
             * First handle primary keys
             */
            for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getPrimaryKeys() ) {
                Object getterResult = mapping.getValueOf(object);

                if ( mapping.canAutoGenerate(getterResult, object, getLocalSaveBehavior()) ) {
                    onAutoGenerateAssignableKey(mapping, getterResult);

                } else {
                    AttributeValue newAttributeValue = converter.convert(mapping.getter(), getterResult);
                    if ( newAttributeValue == null ) {
                        throw new DynamoDBMappingException(
                                "Null or empty value for primary key: " + mapping.getter());
                    }

                    if ( newAttributeValue.getS() == null
                            && newAttributeValue.getN() == null
                            && newAttributeValue.getB() == null) {

                        throw new DynamoDBMappingException(
                                "Keys must be scalar values (String, Number, "
                                + "or Binary). Got " + newAttributeValue
                                + " for key " + mapping.getter());
                    }

                    onPrimaryKeyAttributeValue(mapping.getAttributeName(), newAttributeValue);
                }
            }

            /*
             * Next construct an update for every non-key property
             */
            for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getMappings() ) {

                // Skip any key methods, since they are handled separately
                if ( mappings.getPrimaryKeys().contains(mapping) ) {
                    continue;
                }

                Object getterResult = mapping.getValueOf(object);

                if ( mapping.canAutoGenerate(getterResult, object, getLocalSaveBehavior()) ) {
                    if ( mapping.isAutoGeneratedKey() ) {
                        // There still might be index keys that need to be auto-generated
                        onAutoGenerateAssignableKey(mapping, getterResult);
                    } else if ( mapping.isVersion() ) {
                        // If this is a versioned field, update it
                        onVersionAttribute(mapping, getterResult);
                    } else {
                        onAutoGenerate(mapping, getterResult);
                    }
                } else {
                    // Otherwise apply the update value for this attribute.
                    AttributeValue currentValue = converter.convert(mapping.getter(), getterResult);
                    if ( currentValue != null ) {
                        onNonKeyAttribute(mapping.getAttributeName(), currentValue);
                    } else {
                        onNullNonKeyAttribute(mapping.getAttributeName());
                    }
                }
            }

            /*
             * Execute the implementation of the low level request.
             */
            executeLowLevelRequest();

            /*
             * Finally, after the service call has succeeded, update the
             * in-memory object with new field values as appropriate. This
             * currently takes into account of auto-generated keys and versioned
             * attributes.
             */
            for ( ValueUpdate update : inMemoryUpdates ) {
                update.apply();
            }
        }

        /**
         * Implement this method to do the necessary operations when a primary key
         * attribute is set with some value.
         *
         * @param attributeName
         *            The name of the primary key attribute.
         * @param keyAttributeValue
         *            The AttributeValue of the primary key attribute as specified in
         *            the object.
         */
        protected abstract void onPrimaryKeyAttributeValue(String attributeName, AttributeValue keyAttributeValue);

        /**
         * Implement this method for necessary operations when a non-key
         * attribute is set a non-null value in the object.
         * The default implementation simply adds a "PUT" update for the given attribute.
         *
         * @param attributeName
         *            The name of the non-key attribute.
         * @param currentValue
         *            The updated value of the given attribute.
         */
        protected void onNonKeyAttribute(String attributeName, AttributeValue currentValue) {
            updateValues.put(attributeName, new AttributeValueUpdate()
                    .withValue(currentValue).withAction("PUT"));
        }

        /**
         * Implement this method for necessary operations when a non-key
         * attribute is set null in the object.
         *
         * @param attributeName
         *            The name of the non-key attribute.
         */
        protected abstract void onNullNonKeyAttribute(String attributeName);

        /**
         * Implement this method to send the low-level request that is necessary
         * to complete the save operation.
         */
        protected abstract void executeLowLevelRequest();

        /** Get the SaveBehavior used locally for this save operation. **/
        protected SaveBehavior getLocalSaveBehavior() {
            return saveConfig.getSaveBehavior();
        }

        /** Get the table name **/
        protected String getTableName() {
            return tableName;
        }

        /** Get the map of all the specified primamry keys of the saved object. **/
        protected Map<String, AttributeValue> getPrimaryKeyAttributeValues() {
            return primaryKeys;
        }

        /** Get the map of AttributeValueUpdate on each modeled attribute. **/
        protected Map<String, AttributeValueUpdate> getAttributeValueUpdates() {
            return updateValues;
        }

        /**
         * Merge and return all the expected value conditions (either
         * user-specified or imposed by the internal implementation of
         * DynamoDBMapper) for this save operation.
         */
        protected Map<String, ExpectedAttributeValue> mergeExpectedAttributeValueConditions() {
            return DynamoDBMapper.mergeExpectedAttributeValueConditions(
                    internalExpectedValueAssertions,
                    userProvidedExpectedValueConditions,
                    userProvidedConditionOperator);
        }

        /** Get the list of all the necessary in-memory update on the object. **/
        protected List<ValueUpdate> getInMemoryUpdates() {
            return inMemoryUpdates;
        }

        /**
         * Save the item using a UpdateItem request. The handler will call this
         * method if
         * <ul>
         * <li>CLOBBER configuration is not being used;
         * <li>AND the item does not contain auto-generated key value;
         * </ul>
         * <p>
         * The ReturnedValues parameter for the UpdateItem request is set as
         * ALL_NEW, which means the service should return all of the attributes
         * of the new version of the item after the update. The handler will use
         * the returned attributes to detect silent failure on the server-side.
         */
        protected UpdateItemResult doUpdateItem() {
            UpdateItemRequest req = new UpdateItemRequest()
                    .withTableName(getTableName())
                    .withKey(getPrimaryKeyAttributeValues())
                    .withAttributeUpdates(
                            transformAttributeUpdates(
                                    this.clazz,
                                    getTableName(),
                                    getPrimaryKeyAttributeValues(),
                                    getAttributeValueUpdates(),
                                    saveConfig))
                    .withExpected(mergeExpectedAttributeValueConditions())
                    .withConditionalOperator(userProvidedConditionOperator)
                    .withReturnValues(ReturnValue.ALL_NEW)
                    .withRequestMetricCollector(saveConfig.getRequestMetricCollector());

            return db.updateItem(applyUserAgent(req));
        }

        /**
         * Save the item using a PutItem request. The handler will call this
         * method if
         * <ul>
         *  <li> CLOBBER configuration is being used;
         *  <li> OR the item contains auto-generated key value;
         *  <li> OR an UpdateItem request has silently failed (200 response with
         *          no affected attribute), which indicates the key-only-put scenario
         *          that we used to handle by the keyOnlyPut(...) hack.
         * </ul>
         */
        protected PutItemResult doPutItem() {
            Map<String, AttributeValue> attributeValues = convertToItem(getAttributeValueUpdates());

            attributeValues = transformAttributes(
                    toParameters(attributeValues,
                                 this.clazz,
                                 getTableName(),
                                 saveConfig));
            PutItemRequest req = new PutItemRequest()
                    .withTableName(getTableName())
                    .withItem(attributeValues)
                    .withExpected(mergeExpectedAttributeValueConditions())
                    .withConditionalOperator(userProvidedConditionOperator)
                    .withRequestMetricCollector(saveConfig.getRequestMetricCollector());

            return db.putItem(applyUserAgent(req));
        }

        /**
         * Auto-generates the attribute value.
         * @param mapping The mapping details.
         * @param getterResult The current attribute value.
         */
        private void onAutoGenerate(DynamoDBMappingsRegistry.Mapping mapping, Object getterResult) {
            Object newVersion = mapping.autoGenerate(getterResult);
            AttributeValue newVersionValue = converter.convert(mapping.getter(), newVersion);
            updateValues.put(mapping.getAttributeName(), new AttributeValueUpdate().withAction("PUT").withValue(newVersionValue));
            inMemoryUpdates.add(new ValueUpdate(mapping.getter(), newVersionValue, object, converter));
        }

        /**
         * Auto-generates the key.
         * @param mapping The mapping details.
         * @param getterResult The current attribute value.
         */
        private void onAutoGenerateAssignableKey(DynamoDBMappingsRegistry.Mapping mapping, Object getterResult) {
            // Generate the new key value first, then ensure it doesn't exist.
            onAutoGenerate(mapping, getterResult);

            if ( getLocalSaveBehavior() != SaveBehavior.CLOBBER
                    && !internalExpectedValueAssertions.containsKey(mapping.getAttributeName())) {
                // Add an expect clause to make sure that the item
                // doesn't already exist, since it's supposed to be new
                ExpectedAttributeValue expected = new ExpectedAttributeValue();
                expected.setExists(false);
                internalExpectedValueAssertions.put(mapping.getAttributeName(), expected);
            }
        }

        /**
         * Auto-generates the version.
         * @param mapping The mapping details.
         * @param getterResult The current attribute value.
         */
        private void onVersionAttribute(DynamoDBMappingsRegistry.Mapping mapping, Object getterResult) {
            if ( getLocalSaveBehavior() != SaveBehavior.CLOBBER
                    && !internalExpectedValueAssertions.containsKey(mapping.getAttributeName())) {
                // First establish the expected (current) value for the
                // update call
                ExpectedAttributeValue expected = new ExpectedAttributeValue();

                // For new objects, insist that the value doesn't exist.
                // For existing ones, insist it has the old value.
                AttributeValue currentValue = converter.convert(mapping.getter(), getterResult);
                expected.setExists(currentValue != null);
                if ( currentValue != null ) {
                    expected.setValue(currentValue);
                }
                internalExpectedValueAssertions.put(mapping.getAttributeName(), expected);
            }

            // Generate the new version value
            onAutoGenerate(mapping, getterResult);
        }
    }

    @Override
    public void delete(Object object) {
        delete(object, null, this.config);
    }

    @Override
    public void delete(Object object, DynamoDBDeleteExpression deleteExpression) {
        delete(object, deleteExpression, this.config);
    }

    @Override
    public void delete(Object object, DynamoDBMapperConfig config) {
        delete(object, null, config);
    }

    @Override
    public <T> void delete(T object, DynamoDBDeleteExpression deleteExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        ItemConverter converter = getConverter(config);

        @SuppressWarnings("unchecked")
        Class<T> clazz = (Class<T>) object.getClass();

        String tableName = getTableName(clazz, object, config);

        Map<String, AttributeValue> key = getKey(converter, object, clazz);

        /*
         * If there is a version field, make sure we assert its value. If the
         * version field is null (only should happen in unusual circumstances),
         * pretend it doesn't have a version field after all.
         */
        Map<String, ExpectedAttributeValue> internalAssertions = new HashMap<String, ExpectedAttributeValue>();
        if ( config.getSaveBehavior() != SaveBehavior.CLOBBER ) {
            final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);
            for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getMappings() ) {

                if ( mapping.isVersion() ) {
                    Object getterResult = mapping.getValueOf(object);
                    String attributeName = mapping.getAttributeName();

                    ExpectedAttributeValue expected = new ExpectedAttributeValue();
                    AttributeValue currentValue = converter.convert(mapping.getter(), getterResult);
                    expected.setExists(currentValue != null);
                    if ( currentValue != null )
                        expected.setValue(currentValue);
                    internalAssertions.put(attributeName, expected);
                    break;
                }
            }
        }

        DeleteItemRequest req = new DeleteItemRequest().withKey(key)
                .withTableName(tableName).withExpected(internalAssertions)
                .withRequestMetricCollector(config.getRequestMetricCollector());

        if (deleteExpression != null) {
            String conditionalExpression = deleteExpression.getConditionExpression();

            if (conditionalExpression != null) {
                if (internalAssertions != null && !internalAssertions.isEmpty()) {
                    throw new AmazonClientException(
                            "Condition Expressions cannot be used if a versioned attribute is present");
                }

                req = req
                        .withConditionExpression(conditionalExpression)
                        .withExpressionAttributeNames(
                                deleteExpression.getExpressionAttributeNames())
                        .withExpressionAttributeValues(
                                deleteExpression.getExpressionAttributeValues());
            }

            req = req.withExpected(
                    mergeExpectedAttributeValueConditions(internalAssertions,
                            deleteExpression.getExpected(),
                            deleteExpression.getConditionalOperator()))
                    .withConditionalOperator(
                            deleteExpression.getConditionalOperator());

        }
        db.deleteItem(applyUserAgent(req));
    }

    @Override
    public List<FailedBatch> batchDelete(List<? extends Object> objectsToDelete) {
        return batchDelete((Iterable<?>) objectsToDelete);
    }

    @Override
    public List<FailedBatch> batchDelete(Iterable<? extends Object> objectsToDelete) {
        return batchWrite(Collections.emptyList(), objectsToDelete, this.config);
    }

    @Override
    public List<FailedBatch> batchDelete(Object... objectsToDelete) {
        return batchWrite(Collections.emptyList(), Arrays.asList(objectsToDelete), this.config);
    }

    @Override
    public List<FailedBatch> batchSave(List<? extends Object> objectsToSave) {
        return batchSave((Iterable<?>) objectsToSave);
    }

    @Override
    public List<FailedBatch> batchSave(Iterable<? extends Object> objectsToSave) {
        return batchWrite(objectsToSave, Collections.emptyList(), this.config);
    }

    @Override
    public List<FailedBatch> batchSave(Object... objectsToSave) {
        return batchWrite(Arrays.asList(objectsToSave), Collections.emptyList(), this.config);
    }

    @Override
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite, List<? extends Object> objectsToDelete) {
        return batchWrite((Iterable<?>) objectsToWrite, (Iterable<?>) objectsToDelete);
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete) {
        return batchWrite(objectsToWrite, objectsToDelete, this.config);
    }

    @Override
    public List<FailedBatch> batchWrite(List<? extends Object> objectsToWrite,
                                        List<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        return batchWrite((Iterable<?>) objectsToWrite, (Iterable<?>) objectsToDelete, config);
    }

    @Override
    public List<FailedBatch> batchWrite(Iterable<? extends Object> objectsToWrite,
                                        Iterable<? extends Object> objectsToDelete,
                                        DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        List<FailedBatch> totalFailedBatches = new LinkedList<FailedBatch>();

        HashMap<String, List<WriteRequest>> requestItems = new HashMap<String, List<WriteRequest>>();

        ItemConverter converter = getConverter(config);

        List<ValueUpdate> inMemoryUpdates = new LinkedList<ValueUpdate>();
        for ( Object toWrite : objectsToWrite ) {
            Class<?> clazz = toWrite.getClass();
            String tableName = getTableName(clazz, toWrite, config);

            Map<String, AttributeValue> attributeValues = new HashMap<String, AttributeValue>();

            // Look at every getter and construct a value object for it
            final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);
            for ( final DynamoDBMappingsRegistry.Mapping mapping : mappings.getMappings() ) {
                Object getterResult =
                        mapping.getValueOf(toWrite);

                String attributeName = mapping.getAttributeName();

                AttributeValue currentValue = null;
                if ( mapping.canAutoGenerate(getterResult, toWrite, config.getSaveBehavior()) && !mapping.isVersion() ) {
                    Object newVersion = mapping.autoGenerate(getterResult);
                    currentValue = converter.convert(mapping.getter(), newVersion);
                    inMemoryUpdates.add(new ValueUpdate(mapping.getter(), currentValue, toWrite, converter));
                } else {
                    currentValue = converter.convert(mapping.getter(), getterResult);
                }

                if ( currentValue != null ) {
                    attributeValues.put(attributeName, currentValue);
                }
            }

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            AttributeTransformer.Parameters<?> parameters =
                toParameters(attributeValues, clazz, tableName, config);

            requestItems.get(tableName).add(
                new WriteRequest().withPutRequest(
                    new PutRequest().withItem(
                        transformAttributes(parameters))));
        }

        for ( Object toDelete : objectsToDelete ) {
            Class<?> clazz = toDelete.getClass();

            String tableName = getTableName(clazz, toDelete, config);

            Map<String, AttributeValue> key = getKey(converter, toDelete);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(tableName, new LinkedList<WriteRequest>());
            }

            requestItems.get(tableName).add(
                    new WriteRequest().withDeleteRequest(new DeleteRequest().withKey(key)));
        }

        // Break into chunks of 25 items and make service requests to DynamoDB
        while ( !requestItems.isEmpty() ) {

            HashMap<String, List<WriteRequest>> batch =
                    new HashMap<String, List<WriteRequest>>();

            int i = 0;

            Iterator<Entry<String, List<WriteRequest>>> tableIter = requestItems.entrySet().iterator();
            while ( tableIter.hasNext() && i < MAX_ITEMS_PER_BATCH ) {

                Entry<String, List<WriteRequest>> tableRequest = tableIter.next();

                batch.put(tableRequest.getKey(), new LinkedList<WriteRequest>());
                Iterator<WriteRequest> writeRequestIter = tableRequest.getValue().iterator();

                while ( writeRequestIter.hasNext() && i++ < MAX_ITEMS_PER_BATCH ) {
                    WriteRequest writeRequest = writeRequestIter.next();
                    batch.get(tableRequest.getKey()).add(writeRequest);
                    writeRequestIter.remove();
                }

                // If we've processed all the write requests for this table,
                // remove it from the parent iterator.
                if ( !writeRequestIter.hasNext() ) {
                    tableIter.remove();
                }
            }

            List<FailedBatch> failedBatches = writeOneBatch(batch, config.getBatchWriteRetryStrategy());
            if (failedBatches != null) {
                totalFailedBatches.addAll(failedBatches);

                // If contains throttling exception, we do a backoff
                if (containsThrottlingException(failedBatches)) {
                    try {
                        Thread.sleep(1000 * 2);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new AmazonClientException(e.getMessage(), e);
                    }
                }
            }
        }



        // Once the entire batch is processed, update assigned keys in memory
        for ( ValueUpdate update : inMemoryUpdates ) {
            update.apply();
        }

        return totalFailedBatches;
    }

    /**
     * Process one batch of requests(max 25). It will divide the batch if
     * receives request too large exception(the total size of the request is beyond 1M).
     */
    private List<FailedBatch> writeOneBatch(
            Map<String, List<WriteRequest>> batch,
            BatchWriteRetryStrategy batchWriteRetryStrategy) {

        List<FailedBatch> failedBatches = new LinkedList<FailedBatch>();
        Map<String, List<WriteRequest>> firstHalfBatch = new HashMap<String, List<WriteRequest>>();
        Map<String, List<WriteRequest>> secondHalfBatch = new HashMap<String, List<WriteRequest>>();
        FailedBatch failedBatch = doBatchWriteItemWithRetry(batch, batchWriteRetryStrategy);

        if (failedBatch != null) {
            // If the exception is request entity too large, we divide the batch
            // into smaller parts.

            if (failedBatch.getException() instanceof AmazonServiceException
            && RetryUtils.isRequestEntityTooLargeException((AmazonServiceException) failedBatch.getException())) {

                // If only one item left, the item size must beyond 64k, which
                // exceedes the limit.

                if (computeFailedBatchSize(failedBatch) == 1) {
                    failedBatches.add(failedBatch);
                } else {
                    divideBatch(batch, firstHalfBatch, secondHalfBatch);
                    failedBatches.addAll(writeOneBatch(firstHalfBatch, batchWriteRetryStrategy));
                    failedBatches.addAll(writeOneBatch(secondHalfBatch, batchWriteRetryStrategy));
                }

            } else {
                failedBatches.add(failedBatch);
            }

        }
        return failedBatches;
    }

    /**
     * Check whether there are throttling exception in the failed batches.
     */
    private boolean containsThrottlingException (List<FailedBatch> failedBatches) {
        for (FailedBatch failedBatch : failedBatches) {
           Exception e = failedBatch.getException();
            if (e instanceof AmazonServiceException
                    && RetryUtils.isThrottlingException((AmazonServiceException) e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Divide the batch of objects to save into two smaller batches. Each contains half of the elements.
     */
    private void divideBatch(Map<String, List<WriteRequest>> batch, Map<String, List<WriteRequest>> firstHalfBatch, Map<String, List<WriteRequest>> secondHalfBatch) {
        for (String key : batch.keySet()) {

            List<WriteRequest> requests = batch.get(key);

            List<WriteRequest> firstHalfRequests = requests.subList(0, requests.size() / 2);

            List<WriteRequest> secondHalfRequests = requests.subList(requests.size() / 2, requests.size());

            firstHalfBatch.put(key, firstHalfRequests);

            secondHalfBatch.put(key, secondHalfRequests);

        }

    }

    /**
     * Count the total number of unprocessed items in the failed batch.
     */

    private int computeFailedBatchSize(FailedBatch failedBatch) {

        int count = 0;

        for (String tableName : failedBatch.getUnprocessedItems().keySet()) {
            count += failedBatch.getUnprocessedItems().get(tableName).size();
        }
        return count;
    }

    /**
     * Continue trying to process the batch and retry on UnproccessedItems as
     * according to the specified BatchWriteRetryStrategy
     */
    private FailedBatch doBatchWriteItemWithRetry(
            Map<String, List<WriteRequest>> batch,
            BatchWriteRetryStrategy batchWriteRetryStrategy) {

        BatchWriteItemResult result = null;
        int retries = 0;
        int maxRetries = batchWriteRetryStrategy
                .getMaxRetryOnUnprocessedItems(Collections
                        .unmodifiableMap(batch));

        FailedBatch failedBatch = null;
        Map<String, List<WriteRequest>> pendingItems = batch;

        while (true) {
            try {
                result = db.batchWriteItem(applyBatchOperationUserAgent(
                        new BatchWriteItemRequest().withRequestItems(pendingItems)));
            } catch (Exception e) {
                failedBatch = new FailedBatch();
                failedBatch.setUnprocessedItems(pendingItems);
                failedBatch.setException(e);
                return failedBatch;
            }
            pendingItems = result.getUnprocessedItems();

            if (pendingItems.size() > 0) {

                // return pendingItems as a FailedBatch if we have exceeded max retry
                if (maxRetries >= 0 && retries >= maxRetries) {
                    failedBatch = new FailedBatch();
                    failedBatch.setUnprocessedItems(pendingItems);
                    failedBatch.setException(null);
                    return failedBatch;
                }

                pause(batchWriteRetryStrategy.getDelayBeforeRetryUnprocessedItems(
                        Collections.unmodifiableMap(pendingItems), retries));
                retries++;
            } else {
                break;
            }
        }
        return failedBatch;
    }

    @Override
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet) {
        return batchLoad((Iterable<Object>) itemsToGet);
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet) {
        return batchLoad(itemsToGet, this.config);
    }

    @Override
    public Map<String, List<Object>> batchLoad(List<Object> itemsToGet, DynamoDBMapperConfig config) {
        return batchLoad((Iterable<Object>) itemsToGet, config);
    }

    @Override
    public Map<String, List<Object>> batchLoad(Iterable<? extends Object> itemsToGet, DynamoDBMapperConfig config) {
        config = mergeConfig(config);
        boolean consistentReads = (config.getConsistentReads() == ConsistentReads.CONSISTENT);

        if (itemsToGet == null) {
            return new HashMap<String, List<Object>>();
        }

        Map<String, KeysAndAttributes> requestItems = new HashMap<String, KeysAndAttributes>();
        Map<String, Class<?>> classesByTableName = new HashMap<String, Class<?>>();
        Map<String, List<Object>> resultSet = new HashMap<String, List<Object>>();
        int count = 0;

        ItemConverter converter = getConverter(config);

        for ( Object keyObject : itemsToGet ) {
            Class<?> clazz = keyObject.getClass();

            String tableName = getTableName(clazz, keyObject, config);
            classesByTableName.put(tableName, clazz);

            if ( !requestItems.containsKey(tableName) ) {
                requestItems.put(
                        tableName,
                        new KeysAndAttributes().withConsistentRead(consistentReads).withKeys(
                                new LinkedList<Map<String, AttributeValue>>()));
            }

            requestItems.get(tableName).getKeys().add(
                    getKey(converter, keyObject));

            // Reach the maximum number which can be handled in a single batchGet
            if ( ++count == 100 ) {
                processBatchGetRequest(classesByTableName, requestItems, resultSet, config, converter);
                requestItems.clear();
                count = 0;
            }
        }

        if ( count > 0 ) {
            processBatchGetRequest(classesByTableName, requestItems, resultSet, config, converter);
        }

        return resultSet;
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet) {
        return batchLoad(itemsToGet, this.config);
    }

    @Override
    public Map<String, List<Object>> batchLoad(Map<Class<?>, List<KeyPair>> itemsToGet, DynamoDBMapperConfig config) {

        List<Object> keys = new ArrayList<Object>();
        if ( itemsToGet != null ) {
            for ( Class<?> clazz : itemsToGet.keySet() ) {
                if ( itemsToGet.get(clazz) != null ) {
                    for ( KeyPair keyPair : itemsToGet.get(clazz) ) {
                        keys.add(createKeyObject(clazz, keyPair.getHashKey(), keyPair.getRangeKey()));
                    }
                }
            }
        }

        return batchLoad(keys, config);
    }

    /**
     * @param config never null
     */
    private void processBatchGetRequest(
            final Map<String, Class<?>> classesByTableName,
            final Map<String, KeysAndAttributes> requestItems,
            final Map<String, List<Object>> resultSet,
            final DynamoDBMapperConfig config,
            final ItemConverter converter) {

        BatchGetItemResult batchGetItemResult = null;
        BatchGetItemRequest batchGetItemRequest = new BatchGetItemRequest()
            .withRequestMetricCollector(config.getRequestMetricCollector());
        batchGetItemRequest.setRequestItems(requestItems);

        int retries = 0;
        int noOfItemsInOriginalRequest = requestItems.size();

        do {
            if ( batchGetItemResult != null ) {
                retries++;

                if (noOfItemsInOriginalRequest == batchGetItemResult
                        .getUnprocessedKeys().size()){
                    pauseExponentially(retries);
                    if (retries > BATCH_GET_MAX_RETRY_COUNT_ALL_KEYS) {
                        throw new AmazonClientException(
                                "Batch Get Item request to server hasn't received any data. "
                                + "Please try again later.");
                    }
                }

                batchGetItemRequest.setRequestItems(
                        batchGetItemResult.getUnprocessedKeys());
            }

            batchGetItemResult = db.batchGetItem(
                    applyBatchOperationUserAgent(batchGetItemRequest));

            Map<String, List<Map<String, AttributeValue>>> responses = batchGetItemResult.getResponses();
            for ( String tableName : responses.keySet() ) {
                List<Object> objects = null;
                if ( resultSet.get(tableName) != null ) {
                    objects = resultSet.get(tableName);
                } else {
                    objects = new LinkedList<Object>();
                }

                Class<?> clazz = classesByTableName.get(tableName);

                for ( Map<String, AttributeValue> item : responses.get(tableName) ) {
                    AttributeTransformer.Parameters<?> parameters =
                        toParameters(item, clazz, tableName, config);
                    objects.add(privateMarshallIntoObject(converter, parameters));
                }

                resultSet.put(tableName, objects);
            }
            // To see whether there are unprocessed keys.
        } while ( batchGetItemResult.getUnprocessedKeys() != null && batchGetItemResult.getUnprocessedKeys().size() > 0 );

    }

    private final class ValueUpdate {

        private final Method method;
        private final AttributeValue newValue;
        private final Object target;
        private final ItemConverter converter;

        public ValueUpdate(
                Method method,
                AttributeValue newValue,
                Object target,
                ItemConverter converter) {

            this.method = method;
            this.newValue = newValue;
            this.target = target;
            this.converter = converter;
        }

        public void apply() {
            final DynamoDBMappingsRegistry.Mapping mapping = registry.mappingOf(method);
            Object pojo = converter.unconvert(method, mapping.setter(), newValue);
            mapping.setValueOf(target, pojo);
        }
    }

    /**
     * Converts the {@link AttributeValueUpdate} map given to an equivalent
     * {@link AttributeValue} map.
     */
    private Map<String, AttributeValue> convertToItem(Map<String, AttributeValueUpdate> putValues) {
        Map<String, AttributeValue> map = new HashMap<String, AttributeValue>();
        for ( Entry<String, AttributeValueUpdate> entry : putValues.entrySet() ) {
            String attributeName = entry.getKey();
            AttributeValue attributeValue = entry.getValue().getValue();
            String attributeAction = entry.getValue().getAction();

            /*
             * AttributeValueUpdate allows nulls for its values, since they are
             * semantically meaningful. AttributeValues never have null values.
             */
            if ( attributeValue != null
                    && !AttributeAction.DELETE.toString().equals(attributeAction)) {
                map.put(attributeName, attributeValue);
            }
        }
        return map;
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scan(clazz, scanExpression, config);
    }

    @Override
    public <T> PaginatedScanList<T> scan(Class<T> clazz,
                                         DynamoDBScanExpression scanExpression,
                                         DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        return new PaginatedScanList<T>(this, clazz, db, scanRequest, scanResult, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments) {
        return parallelScan(clazz, scanExpression, totalSegments, config);
    }

    @Override
    public <T> PaginatedParallelScanList<T> parallelScan(Class<T> clazz,
                                                         DynamoDBScanExpression scanExpression,
                                                         int totalSegments,
                                                         DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        // Create hard copies of the original scan request with difference segment number.
        List<ScanRequest> parallelScanRequests = createParallelScanRequestsFromExpression(clazz, scanExpression, totalSegments, config);
        ParallelScanTask parallelScanTask = new ParallelScanTask(db, parallelScanRequests);

        return new PaginatedParallelScanList<T>(this, clazz, db, parallelScanTask, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz,
                                          DynamoDBScanExpression scanExpression,
                                          DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);

        ScanResult scanResult = db.scan(applyUserAgent(scanRequest));
        ScanResultPage<T> result = new ScanResultPage<T>();
        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(scanResult.getItems(), clazz, scanRequest.getTableName(), config);

        result.setResults(marshallIntoObjects(parameters));
        result.setLastEvaluatedKey(scanResult.getLastEvaluatedKey());
        result.setCount(scanResult.getCount());
        result.setScannedCount(scanResult.getScannedCount());
        result.setConsumedCapacity(scanResult.getConsumedCapacity());

        return result;
    }

    @Override
    public <T> ScanResultPage<T> scanPage(Class<T> clazz, DynamoDBScanExpression scanExpression) {
        return scanPage(clazz, scanExpression, this.config);
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return query(clazz, queryExpression, config);
    }

    @Override
    public <T> PaginatedQueryList<T> query(Class<T> clazz,
                                           DynamoDBQueryExpression<T> queryExpression,
                                           DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        return new PaginatedQueryList<T>(this, clazz, db, queryRequest, queryResult, config.getPaginationLoadingStrategy(), config);
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return queryPage(clazz, queryExpression, this.config);
    }

    @Override
    public <T> QueryResultPage<T> queryPage(Class<T> clazz,
                                            DynamoDBQueryExpression<T> queryExpression,
                                            DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);

        QueryResult queryResult = db.query(applyUserAgent(queryRequest));
        QueryResultPage<T> result = new QueryResultPage<T>();
        List<AttributeTransformer.Parameters<T>> parameters =
            toParameters(queryResult.getItems(), clazz, queryRequest.getTableName(), config);

        result.setResults(marshallIntoObjects(parameters));
        result.setLastEvaluatedKey(queryResult.getLastEvaluatedKey());
        result.setCount(queryResult.getCount());
        result.setScannedCount(queryResult.getScannedCount());
        result.setConsumedCapacity(queryResult.getConsumedCapacity());

        return result;
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression) {
        return count(clazz, scanExpression, config);
    }

    @Override
    public int count(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);
        scanRequest.setSelect(Select.COUNT);

        // Count scans can also be truncated for large datasets
        int count = 0;
        ScanResult scanResult = null;
        do {
            scanResult = db.scan(applyUserAgent(scanRequest));
            count += scanResult.getCount();
            scanRequest.setExclusiveStartKey(scanResult.getLastEvaluatedKey());
        } while (scanResult.getLastEvaluatedKey() != null);

        return count;
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression) {
        return count(clazz, queryExpression, config);
    }

    @Override
    public <T> int count(Class<T> clazz, DynamoDBQueryExpression<T> queryExpression, DynamoDBMapperConfig config) {
        config = mergeConfig(config);

        QueryRequest queryRequest = createQueryRequestFromExpression(clazz, queryExpression, config);
        queryRequest.setSelect(Select.COUNT);

        // Count queries can also be truncated for large datasets
        int count = 0;
        QueryResult queryResult = null;
        do {
            queryResult = db.query(applyUserAgent(queryRequest));
            count += queryResult.getCount();
            queryRequest.setExclusiveStartKey(queryResult.getLastEvaluatedKey());
        } while (queryResult.getLastEvaluatedKey() != null);

        return count;
    }

    /**
     * Merges the config object given with the one specified at construction and
     * returns the result.
     */
    private DynamoDBMapperConfig mergeConfig(DynamoDBMapperConfig config) {
        if ( config != this.config )
            config = new DynamoDBMapperConfig(this.config, config);
        return config;
    }

    /**
     * @param config never null
     */
    private ScanRequest createScanRequestFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, DynamoDBMapperConfig config) {
        ScanRequest scanRequest = new ScanRequest();

        scanRequest.setTableName(getTableName(clazz, config));
        scanRequest.setIndexName(scanExpression.getIndexName());
        scanRequest.setScanFilter(scanExpression.getScanFilter());
        scanRequest.setLimit(scanExpression.getLimit());
        scanRequest.setExclusiveStartKey(scanExpression.getExclusiveStartKey());
        scanRequest.setTotalSegments(scanExpression.getTotalSegments());
        scanRequest.setSegment(scanExpression.getSegment());
        scanRequest.setConditionalOperator(scanExpression.getConditionalOperator());
        scanRequest.setFilterExpression(scanExpression.getFilterExpression());
        scanRequest.setExpressionAttributeNames(scanExpression
                .getExpressionAttributeNames());
        scanRequest.setExpressionAttributeValues(scanExpression
                .getExpressionAttributeValues());
        scanRequest.setRequestMetricCollector(config.getRequestMetricCollector());
        scanRequest.setSelect(scanExpression.getSelect());
        scanRequest.setProjectionExpression(scanExpression.getProjectionExpression());
        scanRequest.setReturnConsumedCapacity(scanExpression.getReturnConsumedCapacity());
        scanRequest.setConsistentRead(scanExpression.isConsistentRead());

        return applyUserAgent(scanRequest);
    }

    /**
     * @param config never null
     */
    private List<ScanRequest> createParallelScanRequestsFromExpression(Class<?> clazz, DynamoDBScanExpression scanExpression, int totalSegments, DynamoDBMapperConfig config) {
        if (totalSegments < 1) {
            throw new IllegalArgumentException("Parallel scan should have at least one scan segment.");
        }
        if (scanExpression.getExclusiveStartKey() != null) {
            log.info("The ExclusiveStartKey parameter specified in the DynamoDBScanExpression is ignored,"
                    + " since the individual parallel scan request on each segment is applied on a separate key scope.");
        }
        if (scanExpression.getSegment() != null || scanExpression.getTotalSegments() != null) {
            log.info("The Segment and TotalSegments parameters specified in the DynamoDBScanExpression are ignored.");
        }

        List<ScanRequest> parallelScanRequests= new LinkedList<ScanRequest>();
        for (int segment = 0; segment < totalSegments; segment++) {
            ScanRequest scanRequest = createScanRequestFromExpression(clazz, scanExpression, config);
            parallelScanRequests.add(scanRequest
                    .withSegment(segment).withTotalSegments(totalSegments)
                    .withExclusiveStartKey(null));
        }
        return parallelScanRequests;
    }

    private <T> QueryRequest createQueryRequestFromExpression(Class<T> clazz,
            DynamoDBQueryExpression<T> xpress, DynamoDBMapperConfig config) {
        QueryRequest req = new QueryRequest();
        req.setConsistentRead(xpress.isConsistentRead());
        req.setTableName(getTableName(clazz, xpress.getHashKeyValues(), config));
        req.setIndexName(xpress.getIndexName());

        ItemConverter converter = getConverter(config);

        // Hash key (primary or index) conditions
        Map<String, Condition> hashKeyConditions = getHashKeyEqualsConditions(
                converter, xpress.getHashKeyValues());

        // Range key (primary or index) conditions
        Map<String, Condition> rangeKeyConditions = xpress.getRangeKeyConditions();
        req.setKeyConditionExpression(xpress.getKeyConditionExpression());
        processKeyConditions(clazz, req, hashKeyConditions, rangeKeyConditions);

        req.withScanIndexForward(xpress.isScanIndexForward())
           .withLimit(xpress.getLimit())
           .withExclusiveStartKey(xpress.getExclusiveStartKey())
           .withQueryFilter(xpress.getQueryFilter())
           .withConditionalOperator(xpress.getConditionalOperator())
           .withSelect(xpress.getSelect())
           .withProjectionExpression(xpress.getProjectionExpression())
           .withFilterExpression(xpress.getFilterExpression())
           .withExpressionAttributeNames(xpress.getExpressionAttributeNames())
           .withExpressionAttributeValues(xpress.getExpressionAttributeValues())
           .withReturnConsumedCapacity(xpress.getReturnConsumedCapacity())
           .withRequestMetricCollector(config.getRequestMetricCollector())
           ;
        return applyUserAgent(req);
    }

    /**
     * Utility method for checking the validity of both hash and range key
     * conditions. It also tries to infer the correct index name from the POJO
     * annotation, if such information is not directly specified by the user.
     *
     * @param clazz
     *            The domain class of the queried items.
     * @param queryRequest
     *            The QueryRequest object to be sent to service.
     * @param hashKeyConditions
     *            All the hash key EQ conditions extracted from the POJO object.
     *            The mapper will choose one of them that could be applied together with
     *            the user-specified (if any) index name and range key conditions. Or it
     *            throws error if more than one conditions are applicable for the query.
     * @param rangeKeyConditions
     *            The range conditions specified by the user. We currently only
     *            allow at most one range key condition.
     */
    private void processKeyConditions(Class<?> clazz,
                                      QueryRequest queryRequest,
                                      Map<String, Condition> hashKeyConditions,
                                      Map<String, Condition> rangeKeyConditions) {
        // There should be least one hash key condition.
        final String keyCondExpression = queryRequest.getKeyConditionExpression();
        if (keyCondExpression == null) {
            if (hashKeyConditions == null || hashKeyConditions.isEmpty()) {
                throw new IllegalArgumentException(
                    "Illegal query expression: No hash key condition is found in the query");
            }
        } else {
            if (hashKeyConditions != null && !hashKeyConditions.isEmpty()) {
                throw new IllegalArgumentException(
                    "Illegal query expression: Either the hash key conditions or the key condition expression must be specified but not both.");
            }
            if (rangeKeyConditions != null && !rangeKeyConditions.isEmpty()) {
                throw new IllegalArgumentException(
                    "Illegal query expression: The range key conditions can only be specified when the key condition expression is not specified.");
            }
            // key condition expression is in use
            return;
        }
        // We don't allow multiple range key conditions.
        if (rangeKeyConditions != null && rangeKeyConditions.size() > 1) {
            throw new IllegalArgumentException(
                    "Illegal query expression: Conditions on multiple range keys ("
                    + rangeKeyConditions.keySet().toString()
                    + ") are found in the query. DynamoDB service only accepts up to ONE range key condition.");
        }
        final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(clazz);
        final boolean hasRangeKeyCondition = (rangeKeyConditions != null)
                                            && (!rangeKeyConditions.isEmpty());
        final String userProvidedIndexName = queryRequest.getIndexName();
        final String primaryHashKeyName = mappings.getHashKey().getAttributeName();
        final TableIndexesInfo parsedIndexesInfo = schemaParser.parseTableIndexes(clazz, registry);

        // First collect the names of all the global/local secondary indexes that could be applied to this query.
        // If the user explicitly specified an index name, we also need to
        //   1) check the index is applicable for both hash and range key conditions
        //   2) choose one hash key condition if there are more than one of them
        boolean hasPrimaryHashKeyCondition = false;
        final Map<String, Set<String>> annotatedGSIsOnHashKeys = new HashMap<String, Set<String>>();
        String hashKeyNameForThisQuery = null;

        boolean hasPrimaryRangeKeyCondition = false;
        final Set<String> annotatedLSIsOnRangeKey = new HashSet<String>();
        final Set<String> annotatedGSIsOnRangeKey = new HashSet<String>();

        // Range key condition
        String rangeKeyNameForThisQuery = null;
        if (hasRangeKeyCondition) {
            for (String rangeKeyName : rangeKeyConditions.keySet()) {
                rangeKeyNameForThisQuery = rangeKeyName;

                if (mappings.hasRangeKey()
                    && rangeKeyName.equals(mappings.getRangeKey().getAttributeName())) {
                    hasPrimaryRangeKeyCondition = true;
                }

                Collection<String> annotatedLSI = parsedIndexesInfo.getLsiNamesByIndexRangeKey(rangeKeyName);
                if (annotatedLSI != null) {
                    annotatedLSIsOnRangeKey.addAll(annotatedLSI);
                }
                Collection<String> annotatedGSI = parsedIndexesInfo.getGsiNamesByIndexRangeKey(rangeKeyName);
                if (annotatedGSI != null) {
                    annotatedGSIsOnRangeKey.addAll(annotatedGSI);
                }
            }

            if ( !hasPrimaryRangeKeyCondition
                 && annotatedLSIsOnRangeKey.isEmpty()
                 && annotatedGSIsOnRangeKey.isEmpty()) {
                throw new DynamoDBMappingException(
                        "The query contains a condition on a range key (" +
                        rangeKeyNameForThisQuery + ") " +
                        "that is not annotated with either @DynamoDBRangeKey or @DynamoDBIndexRangeKey.");
            }
        }

        final boolean userProvidedLSIWithRangeKeyCondition = (userProvidedIndexName != null)
                                        && (annotatedLSIsOnRangeKey.contains(userProvidedIndexName));
        final boolean hashOnlyLSIQuery = (userProvidedIndexName != null)
                                        && ( !hasRangeKeyCondition )
                                        && parsedIndexesInfo.getAllLsiNames().contains(userProvidedIndexName);
        final boolean userProvidedLSI = userProvidedLSIWithRangeKeyCondition || hashOnlyLSIQuery;

        final boolean userProvidedGSIWithRangeKeyCondition = (userProvidedIndexName != null)
                                        && (annotatedGSIsOnRangeKey.contains(userProvidedIndexName));
        final boolean hashOnlyGSIQuery = (userProvidedIndexName != null)
                                        && ( !hasRangeKeyCondition )
                                        && parsedIndexesInfo.getAllGsiNames().contains(userProvidedIndexName);
        final boolean userProvidedGSI = userProvidedGSIWithRangeKeyCondition || hashOnlyGSIQuery;

        if (userProvidedLSI && userProvidedGSI ) {
            throw new DynamoDBMappingException(
                    "Invalid query: " +
                    "Index \"" + userProvidedIndexName + "\" " +
                    "is annotateded as both a LSI and a GSI for attribute.");
        }

        // Hash key conditions
        for (String hashKeyName : hashKeyConditions.keySet()) {
            if (hashKeyName.equals(primaryHashKeyName)) {
                hasPrimaryHashKeyCondition = true;
            }

            Collection<String> annotatedGSINames = parsedIndexesInfo.getGsiNamesByIndexHashKey(hashKeyName);
            annotatedGSIsOnHashKeys.put(hashKeyName,
                    annotatedGSINames == null ? new HashSet<String>() : new HashSet<String>(annotatedGSINames));

            // Additional validation if the user provided an index name.
            if (userProvidedIndexName != null) {
                boolean foundHashKeyConditionValidWithUserProvidedIndex = false;
                if (userProvidedLSI && hashKeyName.equals(primaryHashKeyName)) {
                    // found an applicable hash key condition (primary hash + LSI range)
                    foundHashKeyConditionValidWithUserProvidedIndex = true;
                } else if (userProvidedGSI &&
                        annotatedGSINames != null && annotatedGSINames.contains(userProvidedIndexName)) {
                    // found an applicable hash key condition (GSI hash + range)
                    foundHashKeyConditionValidWithUserProvidedIndex = true;
                }
                if (foundHashKeyConditionValidWithUserProvidedIndex) {
                    if ( hashKeyNameForThisQuery != null ) {
                        throw new IllegalArgumentException(
                                "Ambiguous query expression: More than one hash key EQ conditions (" +
                                hashKeyNameForThisQuery + ", " + hashKeyName +
                                ") are applicable to the specified index ("
                                + userProvidedIndexName + "). " +
                                "Please provide only one of them in the query expression.");
                    } else {
                        // found an applicable hash key condition
                        hashKeyNameForThisQuery = hashKeyName;
                    }
                }
            }
        }

        // Collate all the key conditions
        Map<String, Condition> keyConditions = new HashMap<String, Condition>();

        // With user-provided index name
        if (userProvidedIndexName != null) {
            if (hasRangeKeyCondition
                    && ( !userProvidedLSI )
                    && ( !userProvidedGSI )) {
                throw new IllegalArgumentException(
                        "Illegal query expression: No range key condition is applicable to the specified index ("
                        + userProvidedIndexName + "). ");
            }
            if (hashKeyNameForThisQuery == null) {
                throw new IllegalArgumentException(
                        "Illegal query expression: No hash key condition is applicable to the specified index ("
                        + userProvidedIndexName + "). ");
            }

            keyConditions.put(hashKeyNameForThisQuery, hashKeyConditions.get(hashKeyNameForThisQuery));
            if (hasRangeKeyCondition) {
                keyConditions.putAll(rangeKeyConditions);
            }
        }
        // Infer the index name by finding the index shared by both hash and range key annotations.
        else {
            if (hasRangeKeyCondition) {
                String inferredIndexName = null;
                hashKeyNameForThisQuery = null;
                if (hasPrimaryHashKeyCondition && hasPrimaryRangeKeyCondition) {
                    // Found valid query: primary hash + range key conditions
                    hashKeyNameForThisQuery = primaryHashKeyName;
                } else {
                    // Intersect the set of all the indexes applicable to the range key
                    // with the set of indexes applicable to each hash key condition.
                    for (String hashKeyName : annotatedGSIsOnHashKeys.keySet()) {
                        boolean foundValidQueryExpressionWithInferredIndex = false;
                        String indexNameInferredByThisHashKey = null;
                        if (hashKeyName.equals(primaryHashKeyName)) {
                            if (annotatedLSIsOnRangeKey.size() == 1) {
                                // Found valid query (Primary hash + LSI range conditions)
                                foundValidQueryExpressionWithInferredIndex = true;
                                indexNameInferredByThisHashKey = annotatedLSIsOnRangeKey.iterator().next();
                            }
                        }

                        Set<String> annotatedGSIsOnHashKey = annotatedGSIsOnHashKeys.get(hashKeyName);
                        // We don't need the data in annotatedGSIsOnHashKeys afterwards,
                        // so it's safe to do the intersection in-place.
                        annotatedGSIsOnHashKey.retainAll(annotatedGSIsOnRangeKey);
                        if (annotatedGSIsOnHashKey.size() == 1) {
                            // Found valid query (Hash + range conditions on a GSI)
                            if (foundValidQueryExpressionWithInferredIndex) {
                                hashKeyNameForThisQuery = hashKeyName;
                                inferredIndexName = indexNameInferredByThisHashKey;
                            }

                            foundValidQueryExpressionWithInferredIndex = true;
                            indexNameInferredByThisHashKey = annotatedGSIsOnHashKey.iterator().next();
                        }

                        if (foundValidQueryExpressionWithInferredIndex) {
                            if (hashKeyNameForThisQuery != null) {
                                throw new IllegalArgumentException(
                                        "Ambiguous query expression: Found multiple valid queries: " +
                                        "(Hash: \"" + hashKeyNameForThisQuery + "\", Range: \"" + rangeKeyNameForThisQuery + "\", Index: \"" + inferredIndexName + "\") and " +
                                        "(Hash: \"" + hashKeyName + "\", Range: \"" + rangeKeyNameForThisQuery + "\", Index: \"" + indexNameInferredByThisHashKey + "\").");
                            } else {
                                hashKeyNameForThisQuery = hashKeyName;
                                inferredIndexName = indexNameInferredByThisHashKey;
                            }
                        }
                    }
                }

                if (hashKeyNameForThisQuery != null) {
                    keyConditions.put(hashKeyNameForThisQuery, hashKeyConditions.get(hashKeyNameForThisQuery));
                    keyConditions.putAll(rangeKeyConditions);
                    queryRequest.setIndexName(inferredIndexName);
                } else {
                    throw new IllegalArgumentException(
                            "Illegal query expression: Cannot infer the index name from the query expression.");
                }

            } else {
                // No range key condition is specified.
                if (hashKeyConditions.size() > 1) {
                    if ( hasPrimaryHashKeyCondition ) {
                        keyConditions.put(primaryHashKeyName, hashKeyConditions.get(primaryHashKeyName));
                    } else {
                        throw new IllegalArgumentException(
                                "Ambiguous query expression: More than one index hash key EQ conditions (" +
                                hashKeyConditions.keySet() +
                                ") are applicable to the query. " +
                                "Please provide only one of them in the query expression, or specify the appropriate index name.");
                    }

                } else {
                    // Only one hash key condition
                    String hashKeyName = annotatedGSIsOnHashKeys.keySet().iterator().next();
                    if ( !hasPrimaryHashKeyCondition ) {
                        if (annotatedGSIsOnHashKeys.get(hashKeyName).size() == 1) {
                            // Set the index if the index hash key is only annotated with one GSI.
                            queryRequest.setIndexName(annotatedGSIsOnHashKeys.get(hashKeyName).iterator().next());
                        } else if (annotatedGSIsOnHashKeys.get(hashKeyName).size() > 1) {
                            throw new IllegalArgumentException(
                                    "Ambiguous query expression: More than one GSIs (" +
                                    annotatedGSIsOnHashKeys.get(hashKeyName) +
                                    ") are applicable to the query. " +
                                    "Please specify one of them in your query expression.");
                        } else {
                            throw new IllegalArgumentException(
                                    "Illegal query expression: No GSI is found in the @DynamoDBIndexHashKey annotation for attribute " +
                                    "\"" + hashKeyName + "\".");
                        }
                    }
                    keyConditions.putAll(hashKeyConditions);
                }

            }
        }

        queryRequest.setKeyConditions(keyConditions);
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig) {

        return toParameters(attributeValues, false, modelClass, tableName, mapperConfig);
    }

    private <T> AttributeTransformer.Parameters<T> toParameters(
            final Map<String, AttributeValue> attributeValues,
            final boolean partialUpdate,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig) {

        return new TransformerParameters<T>(
                registry,
                attributeValues,
                partialUpdate,
                modelClass,
                mapperConfig,
                tableName);
    }

    final <T> List<AttributeTransformer.Parameters<T>> toParameters(
            final List<Map<String, AttributeValue>> attributeValues,
            final Class<T> modelClass,
            final String tableName,
            final DynamoDBMapperConfig mapperConfig
    ) {
        List<AttributeTransformer.Parameters<T>> rval =
            new ArrayList<AttributeTransformer.Parameters<T>>(
                attributeValues.size());

        for (Map<String, AttributeValue> item : attributeValues) {
            rval.add(toParameters(item, modelClass, tableName, mapperConfig));
        }

        return rval;
    }

    /**
     * The one true implementation of AttributeTransformer.Parameters.
     */
    private static class TransformerParameters<T>
            implements AttributeTransformer.Parameters<T> {

        private final DynamoDBMappingsRegistry registry;
        private final Map<String, AttributeValue> attributeValues;
        private final boolean partialUpdate;
        private final Class<T> modelClass;
        private final DynamoDBMapperConfig mapperConfig;
        private final String tableName;

        private String hashKeyName;
        private String rangeKeyName;

        public TransformerParameters(
                final DynamoDBMappingsRegistry registry,
                final Map<String, AttributeValue> attributeValues,
                final boolean partialUpdate,
                final Class<T> modelClass,
                final DynamoDBMapperConfig mapperConfig,
                final String tableName) {

            this.registry = registry;
            this.attributeValues =
                Collections.unmodifiableMap(attributeValues);
            this.partialUpdate = partialUpdate;
            this.modelClass = modelClass;
            this.mapperConfig = mapperConfig;
            this.tableName = tableName;
        }

        @Override
        public Map<String, AttributeValue> getAttributeValues() {
            return attributeValues;
        }

        @Override
        public boolean isPartialUpdate() {
            return partialUpdate;
        }

        @Override
        public Class<T> getModelClass() {
            return modelClass;
        }

        @Override
        public DynamoDBMapperConfig getMapperConfig() {
            return mapperConfig;
        }

        @Override
        public String getTableName() {
            return tableName;
        }

        @Override
        public String getHashKeyName() {
            if (hashKeyName == null) {
                final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(modelClass);
                hashKeyName = mappings.getHashKey().getAttributeName();
            }
            return hashKeyName;
        }

        @Override
        public String getRangeKeyName() {
            if (rangeKeyName == null) {
                final DynamoDBMappingsRegistry.Mappings mappings = registry.mappingsOf(modelClass);
                if (!mappings.hasRangeKey()) {
                    rangeKeyName = NO_RANGE_KEY;
                } else {
                    rangeKeyName = mappings.getRangeKey().getAttributeName();
                }
            }
            if (rangeKeyName == NO_RANGE_KEY) {
                return null;
            }
            return rangeKeyName;
        }
    }

    private Map<String, AttributeValue> untransformAttributes(
            final AttributeTransformer.Parameters<?> parameters
    ) {
        if (transformer != null) {
            return transformer.untransform(parameters);
        } else {
            return parameters.getAttributeValues();
        }
    }

    private Map<String, AttributeValue> transformAttributes(
            final AttributeTransformer.Parameters<?> parameters) {

        if (transformer != null) {
            return transformer.transform(parameters);
        } else {
            return parameters.getAttributeValues();
        }
    }

    private Map<String, AttributeValueUpdate> transformAttributeUpdates(
            final Class<?> clazz,
            final String tableName,
            final Map<String, AttributeValue> keys,
            final Map<String, AttributeValueUpdate> updateValues,
            final DynamoDBMapperConfig config
    ) {
        Map<String, AttributeValue> item = convertToItem(updateValues);

        HashSet<String> keysAdded = new HashSet<String>();
        for (Map.Entry<String, AttributeValue> e : keys.entrySet()) {
            if (!item.containsKey(e.getKey())) {
                keysAdded.add(e.getKey());
                item.put(e.getKey(), e.getValue());
            }
        }

        AttributeTransformer.Parameters<?> parameters =
            toParameters(item, true, clazz, tableName, config);

        String hashKey = parameters.getHashKeyName();

        if (!item.containsKey(hashKey)) {
            item.put(hashKey, keys.get(hashKey));
        }

        item = transformAttributes(parameters);

        for(Map.Entry<String, AttributeValue> entry: item.entrySet()) {
            if (keysAdded.contains(entry.getKey())) {
                // This was added in for context before calling
                // transformAttributes, but isn't actually being changed.
                continue;
            }

            AttributeValueUpdate update = updateValues.get(entry.getKey());
            if (update != null) {
                update.getValue()
                    .withB( entry.getValue().getB() )
                    .withBS(entry.getValue().getBS())
                    .withN( entry.getValue().getN() )
                    .withNS(entry.getValue().getNS())
                    .withS( entry.getValue().getS() )
                    .withSS(entry.getValue().getSS());
            } else {
                updateValues.put(entry.getKey(),
                                 new AttributeValueUpdate(entry.getValue(),
                                                          "PUT"));
            }
        }

        return updateValues;
    }

    private ItemConverter getConverter(DynamoDBMapperConfig config) {
        ConversionSchema schema = config.getConversionSchema();

        ConversionSchema.Dependencies params = new ConversionSchema.Dependencies()
                .with(S3ClientCache.class, s3cc);

        return schema.getConverter(params);
    }

    private void pauseExponentially(int retries) {
        if (retries == 0) {
            return;
        }

        Random random = new Random();
        long delay = 0;
        long scaleFactor = 500 + random.nextInt(100);
        delay = (long) (Math.pow(2, retries) * scaleFactor);
        delay = Math.min(delay, MAX_BACKOFF_IN_MILLISECONDS);

        pause(delay);
    }

    private void pause(long delay) {
        if (delay <= 0) {
            return;
        }
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AmazonClientException(e.getMessage(), e);
        }
    }

    /**
     * Returns a new map object that merges the two sets of expected value
     * conditions (user-specified or imposed by the internal implementation of
     * DynamoDBMapper). Internal assertion on an attribute will be overridden by
     * any user-specified condition on the same attribute.
     * <p>
     * Exception is thrown if the two sets of conditions cannot be combined
     * together.
     */
    private static Map<String, ExpectedAttributeValue> mergeExpectedAttributeValueConditions(
            Map<String, ExpectedAttributeValue> internalAssertions,
            Map<String, ExpectedAttributeValue> userProvidedConditions,
            String userProvidedConditionOperator) {
        // If any of the condition map is null, simply return a copy of the other one.
        if ((internalAssertions == null || internalAssertions.isEmpty())
                && (userProvidedConditions == null || userProvidedConditions.isEmpty())) {
            return null;
        } else if (internalAssertions == null) {
            return new HashMap<String, ExpectedAttributeValue>(userProvidedConditions);
        } else if (userProvidedConditions == null) {
            return new HashMap<String, ExpectedAttributeValue>(internalAssertions);
        }

        // Start from a copy of the internal conditions
        Map<String, ExpectedAttributeValue> mergedExpectedValues =
                new HashMap<String, ExpectedAttributeValue>(internalAssertions);

        // Remove internal conditions that are going to be overlaid by user-provided ones.
        for (String attrName : userProvidedConditions.keySet()) {
            mergedExpectedValues.remove(attrName);
        }

        // All the generated internal conditions must be joined by AND.
        // Throw an exception if the user specifies an OR operator, and that the
        // internal conditions are not totally overlaid by the user-provided
        // ones.
        if ( ConditionalOperator.OR.toString().equals(userProvidedConditionOperator)
                && !mergedExpectedValues.isEmpty() ) {
            throw new IllegalArgumentException("Unable to assert the value of the fields "
                    + mergedExpectedValues.keySet() + ", since the expected value conditions cannot be combined "
                    + "with user-specified conditions joined by \"OR\". You can use SaveBehavior.CLOBBER to "
                    + "skip the assertion on these fields.");
        }

        mergedExpectedValues.putAll(userProvidedConditions);

        return mergedExpectedValues;
    }

    static <X extends AmazonWebServiceRequest> X applyUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT);
        return request;
    }

    static <X extends AmazonWebServiceRequest> X applyBatchOperationUserAgent(X request) {
        request.getRequestClientOptions().appendUserAgent(USER_AGENT_BATCH_OPERATION);
        return request;
    }

    /**
     * The return type of batchWrite, batchDelete and batchSave. It contains the information about the unprocessed items
     * and the exception causing the failure.
     *
     */
    public static class FailedBatch {

        private Map<String, java.util.List<WriteRequest>> unprocessedItems;

        private Exception exception;

        public void setUnprocessedItems(Map<String, java.util.List<WriteRequest>> unprocessedItems) {
            this.unprocessedItems = unprocessedItems;
        }

        public Map<String, java.util.List<WriteRequest>> getUnprocessedItems() {
            return unprocessedItems;
        }

        public void setException(Exception excetpion) {
            this.exception = excetpion;
        }

        public Exception getException() {
            return exception;
        }

    }

    @Override
    public S3ClientCache getS3ClientCache() {
        return s3cc;
    }

    @Override
    public S3Link createS3Link(String bucketName, String key) {
        return createS3Link(null, bucketName, key);
    }

    @Override
    public S3Link createS3Link(Region s3region, String bucketName, String key) {
        if ( s3cc == null ) {
            throw new IllegalStateException("Mapper must be constructed with S3 AWS Credentials to create S3Link");
        }
        return new S3Link(s3cc, s3region, bucketName , key);
    }

    @Override
    public CreateTableRequest generateCreateTableRequest(Class<?> clazz) {
        ItemConverter converter = getConverter(config);
        return schemaParser.parseTablePojoToCreateTableRequest(
                clazz, config, registry, converter);
    }

    @Override
    public DeleteTableRequest generateDeleteTableRequest(Class<?> clazz) {
        return schemaParser.parseTablePojoToDeleteTableRequest(clazz, config);
    }
}
