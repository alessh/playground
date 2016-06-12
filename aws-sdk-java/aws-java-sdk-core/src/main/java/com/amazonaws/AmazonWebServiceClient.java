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
package com.amazonaws;

import com.amazonaws.auth.RegionAwareSigner;
import com.amazonaws.auth.Signer;
import com.amazonaws.auth.SignerFactory;
import com.amazonaws.handlers.RequestHandler;
import com.amazonaws.handlers.RequestHandler2;
import com.amazonaws.http.AmazonHttpClient;
import com.amazonaws.http.ExecutionContext;
import com.amazonaws.internal.DefaultServiceEndpointBuilder;
import com.amazonaws.log.CommonsLogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.RequestMetricCollector;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.util.AWSRequestMetrics;
import com.amazonaws.util.AWSRequestMetrics.Field;
import com.amazonaws.util.AwsHostNameUtils;
import com.amazonaws.util.Classes;
import com.amazonaws.util.HttpUtils;
import com.amazonaws.util.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.URI;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.amazonaws.SDKGlobalConfiguration.PROFILING_SYSTEM_PROPERTY;

/**
 * Abstract base class for Amazon Web Service Java clients.
 * <p>
 * Responsible for basic client capabilities that are the same across all AWS
 * SDK Java clients (ex: setting the client endpoint).
 */
public abstract class AmazonWebServiceClient {
    private static final String AMAZON = "Amazon";
    private static final String AWS = "AWS";
    public static final boolean LOGGING_AWS_REQUEST_METRIC = true;

    private static final Log log =
        LogFactory.getLog(AmazonWebServiceClient.class);

    static {
        // Configures the internal logging of the signers and core
        // classes to use Jakarta Commons Logging to stay consistent with the
        // rest of the library.
        boolean success = com.amazonaws.log.InternalLogFactory.configureFactory(
                            new CommonsLogFactory());
        if (log.isDebugEnabled())
            log.debug("Internal logging succesfully configured to commons logger: "
                    + success);
    }

    /**
     * The service endpoint to which this client will send requests.
     * <p>
     * Subclass should only read but not assign to this field, at least not
     * without synchronization on the enclosing object for thread-safety
     * reason.
     */
    protected volatile URI endpoint;

    /**
     * Used to explicitly override the internal signer region computed by the
     * default implementation. This field is typically null.
     */
    private volatile String signerRegionOverride;

    /** The client configuration */
    protected ClientConfiguration clientConfiguration;

    /** Low level client for sending requests to AWS services. */
    protected AmazonHttpClient client;

    /** Optional request handlers for additional request processing. */
    protected final List<RequestHandler2> requestHandler2s;

    /** Optional offset (in seconds) to use when signing requests */
    protected int timeOffset;

    /** AWS signer for authenticating requests. */
    private volatile Signer signer;

    /**
     * The cached service abbreviation for this service, used for identifying
     * service endpoints by region, identifying the necessary signer, etc.
     * Thread safe so it's backward compatible.
     */
    private volatile String serviceName;

    /**
     * The service name in region metadata, i.e. the prefix of endpoint.
     */
    private volatile String endpointPrefix;

    /**
     * Constructs a new AmazonWebServiceClient object using the specified
     * configuration.
     *
     * @param clientConfiguration
     *            The client configuration for this client.
     */
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration) {
        this(clientConfiguration, null);
    }

    /**
     * Constructs a new AmazonWebServiceClient object using the specified
     * configuration and request metric collector.
     *
     * @param clientConfiguration
     *            The client configuration for this client.
     * @param requestMetricCollector
     *            optional request metric collector to be used at the http
     *            client level; can be null.
     */
    public AmazonWebServiceClient(ClientConfiguration clientConfiguration,
            RequestMetricCollector requestMetricCollector) {
        this.clientConfiguration = clientConfiguration;
        client = new AmazonHttpClient(clientConfiguration, requestMetricCollector);
        requestHandler2s = new CopyOnWriteArrayList<RequestHandler2>();
    }

    /**
     * Returns the signer.
     * <p>
     * Note, however, the signer configured for S3 is incomplete at this stage
     * as the information on the S3 bucket and key is not yet known.
     */
    protected Signer getSigner() { return signer; }

    /**
     * Overrides the default endpoint for this client. Callers can use this
     * method to control which AWS region they want to work with.
     * <p>
     * <b>This method is not threadsafe. Endpoints should be configured when the
     * client is created and before any service requests are made. Changing it
     * afterwards creates inevitable race conditions for any service requests in
     * transit.</b>
     * <p>
     * Callers can pass in just the endpoint (ex: "ec2.amazonaws.com") or a full
     * URL, including the protocol (ex: "https://ec2.amazonaws.com"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see:
     * <a href="http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912">
     * http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "ec2.amazonaws.com") or a full URL,
     *            including the protocol (ex: "https://ec2.amazonaws.com") of
     *            the region specific AWS endpoint this client will communicate
     *            with.
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     */
    public void setEndpoint(String endpoint) throws IllegalArgumentException {
        URI uri = toURI(endpoint);
        Signer signer = computeSignerByURI(uri, signerRegionOverride, false);
        synchronized(this)  {
            this.endpoint = uri;
            this.signer = signer;
        }
    }

    /** Returns the endpoint as a URI. */
    private URI toURI(String endpoint) throws IllegalArgumentException {
        return HttpUtils.toUri(endpoint, clientConfiguration);
    }

    /**
     * An internal method that is not expected to be normally
     * called except for AWS internal development purposes.
     * <p>
     * Overrides the default endpoint for this client
     * ("http://dynamodb.us-east-1.amazonaws.com/") and explicitly provides an
     * AWS region ID and AWS service name to use when the client calculates a
     * signature for requests. In almost all cases, this region ID and service
     * name are automatically determined from the endpoint, and callers should
     * use the simpler one-argument form of setEndpoint instead of this method.
     * <p>
     * Callers can pass in just the endpoint (ex:
     * "dynamodb.us-east-1.amazonaws.com/") or a full URL, including the
     * protocol (ex: "http://dynamodb.us-east-1.amazonaws.com/"). If the
     * protocol is not specified here, the default protocol from this client's
     * {@link ClientConfiguration} will be used, which by default is HTTPS.
     * <p>
     * For more information on using AWS regions with the AWS SDK for Java, and
     * a complete list of all available endpoints for all AWS services, see: <a
     * href=
     * "http://developer.amazonwebservices.com/connect/entry.jspa?externalID=3912"
     * > http://developer.amazonwebservices.com/connect/entry.jspa?externalID=
     * 3912</a>
     *
     * @param endpoint
     *            The endpoint (ex: "dynamodb.us-east-1.amazonaws.com/") or a
     *            full URL, including the protocol (ex:
     *            "http://dynamodb.us-east-1.amazonaws.com/") of the region
     *            specific AWS endpoint this client will communicate with.
     * @param serviceName
     *            This parameter is ignored.
     * @param regionId
     *            The ID of the region in which this service resides AND the
     *            overriding region for signing purposes.
     *
     * @throws IllegalArgumentException
     *             If any problems are detected with the specified endpoint.
     * @deprecated
     */
    @Deprecated
    public void setEndpoint(String endpoint, String serviceName, String regionId) {
        URI uri = toURI(endpoint);
        Signer signer = computeSignerByServiceRegion(serviceName, regionId,
                regionId, true);
        synchronized(this)  {
            this.signer = signer;
            this.endpoint = uri;
            this.signerRegionOverride = regionId;
        }
    }

    /**
     * @deprecated this method is now a no-op, as overriding the signer from
     *             sublcass is no longer supported.
     */
    @Deprecated protected void configSigner(URI uri) {}
    /**
     * @deprecated this method is now a no-op, as overriding the signer from
     *             sublcass is no longer supported.
     */
    @Deprecated protected void configSigner(String serviceName, String regionId) {}

    /**
     * Returns the signer based on the given URI and the current AWS client
     * configuration. Currently only the SQS client can have different region on
     * a per request basis. For other AWS clients, the region remains the same
     * on a per AWS client level.
     * <p>
     * Note, however, the signer returned for S3 is incomplete at this stage as
     * the information on the S3 bucket and key is not yet known.
     */
    public Signer getSignerByURI(URI uri) {
        return computeSignerByURI(uri, signerRegionOverride, true);
    }

    /**
     * Returns the signer for the given uri and the current client
     * configuration.
     * <p>
     * Note, however, the signer returned for S3 is incomplete at this stage as
     * the information on the S3 bucket and key is not yet known.
     *
     * @param signerRegionOverride
     *            the overriding signer region; or null if there is none.
     * @param isRegionIdAsSignerParam
     *            true if the "regionId" is used to configure the signer if
     *            applicable; false if this method is called for the purpose of
     *            purely setting the communication end point of this AWS client,
     *            and therefore the "regionId" parameter will not be used
     *            directly for configuring the signer.
     */
    private Signer computeSignerByURI(URI uri, String signerRegionOverride,
            boolean isRegionIdAsSignerParam) {
        if (uri == null) {
            throw new IllegalArgumentException(
                    "Endpoint is not set. Use setEndpoint to set an endpoint before performing any request.");
        }
        String service = getServiceNameIntern();
        String region = AwsHostNameUtils.parseRegionName(uri.getHost(), service);
        return computeSignerByServiceRegion(
                service, region, signerRegionOverride, isRegionIdAsSignerParam);
    }

    /**
     * Returns the signer for the given service name, region id, and the current
     * client configuration.
     * <p>
     * Note, however, the signer returned for S3 is incomplete at this stage as
     * the information on the S3 bucket and key is not yet known.
     *
     * @param regionId
     *            the region for sending AWS requests
     * @param signerRegionOverride
     *            the overriding signer region; or null if there is none.
     * @param isRegionIdAsSignerParam
     *            true if the "regionId" is used to configure the signer if
     *            applicable; false if this method is called for the purpose of
     *            purely setting the communication end point of this AWS client,
     *            and therefore the "regionId" parameter will not be used
     *            directly for configuring the signer.
     */
    private Signer computeSignerByServiceRegion(
            String serviceName, String regionId,
            String signerRegionOverride,
            boolean isRegionIdAsSignerParam) {
        String signerType = clientConfiguration.getSignerOverride();
        Signer signer = signerType == null
             ? SignerFactory.getSigner(serviceName, regionId)
             : SignerFactory.getSignerByTypeAndService(signerType, serviceName)
             ;
         if (signer instanceof RegionAwareSigner) {
             // Overrides the default region computed
             RegionAwareSigner regionAwareSigner = (RegionAwareSigner)signer;
            // (signerRegionOverride != null) means that it is likely to be AWS
            // internal dev work, as "signerRegionOverride" is typically null
             // when used in the external release
             if (signerRegionOverride != null)
                 regionAwareSigner.setRegionName(signerRegionOverride);
             else if (regionId != null && isRegionIdAsSignerParam)
                 regionAwareSigner.setRegionName(regionId);
         }
         return signer;
    }

    /**
     * An alternative to {@link AmazonWebServiceClient#setEndpoint(String)}, sets the regional
     * endpoint for this client's service calls. Callers can use this method to control which AWS
     * region they want to work with.
     * <p>
     * <b>This method is not threadsafe. A region should be configured when the client is created
     * and before any service requests are made. Changing it afterwards creates inevitable race
     * conditions for any service requests in transit or retrying.</b>
     * <p>
     * By default, all service endpoints in all regions use the https protocol. To use http instead,
     * specify it in the {@link ClientConfiguration} supplied at construction.
     *
     * @param region
     *            The region this client will communicate with. See
     *            {@link Region#getRegion(com.amazonaws.regions.Regions)} for accessing a given
     *            region.
     * @throws java.lang.IllegalArgumentException
     *             If the given region is null, or if this service isn't available in the given
     *             region. See {@link Region#isServiceSupported(String)}
     * @see Region#getRegion(com.amazonaws.regions.Regions)
     * @see Region#createClient(Class, com.amazonaws.auth.AWSCredentialsProvider,
     *      ClientConfiguration)
     */
    public void setRegion(Region region) throws IllegalArgumentException {
        if (region == null) {
            throw new IllegalArgumentException("No region provided");
        }
        final String serviceNameForEndpoint = getEndpointPrefix();
        final String serviceNameForSigner = getServiceNameIntern();
        URI uri = new DefaultServiceEndpointBuilder(serviceNameForEndpoint, clientConfiguration.getProtocol()
                .toString()).withRegion(region).getServiceEndpoint();
        Signer signer = computeSignerByServiceRegion(serviceNameForSigner, region.getName(), signerRegionOverride, false);
        synchronized (this) {
            this.endpoint = uri;
            this.signer = signer;
        }
    }

    /**
     * Convenient method for setting region.
     *
     * @param region region to set to; must not be null.
     *
     * @see #setRegion(Region)
     */
    public final void configureRegion(Regions region) {
        if (region == null)
            throw new IllegalArgumentException("No region provided");
        this.setRegion(Region.getRegion(region));
    }

    /**
     * Shuts down this client object, releasing any resources that might be held
     * open. This is an optional method, and callers are not expected to call
     * it, but can if they want to explicitly release any open resources. Once a
     * client has been shutdown, it should not be used to make any more
     * requests.
     */
    public void shutdown() {
        client.shutdown();
    }

    /**
     * @deprecated by {@link #addRequestHandler(RequestHandler2)}.
     *
     * Appends a request handler to the list of registered handlers that are run
     * as part of a request's lifecycle.
     *
     * @param requestHandler
     *            The new handler to add to the current list of request
     *            handlers.
     */
    @Deprecated
    public void addRequestHandler(RequestHandler requestHandler) {
        requestHandler2s.add(RequestHandler2.adapt(requestHandler));
    }

    /**
     * Appends a request handler to the list of registered handlers that are run
     * as part of a request's lifecycle.
     *
     * @param requestHandler2
     *            The new handler to add to the current list of request
     *            handlers.
     */
    public void addRequestHandler(RequestHandler2 requestHandler2) {
        requestHandler2s.add(requestHandler2);
    }

    /**
     * Removes a request handler from the list of registered handlers that are run
     * as part of a request's lifecycle.
     *
     * @param requestHandler
     *            The handler to remove from the current list of request
     *            handlers.
     */
    public void removeRequestHandler(RequestHandler requestHandler) {
        requestHandler2s.remove(RequestHandler2.adapt(requestHandler));
    }

    public void removeRequestHandler(RequestHandler2 requestHandler2) {
        requestHandler2s.remove(requestHandler2);
    }

    /**
     * Runs the {@code beforeMarshalling} method of any
     * {@code RequestHandler2}s associated with this client.
     *
     * @param request the request passed in from the user
     * @return the (possibly different) request to marshal
     */
    @SuppressWarnings("unchecked")
    protected final <T extends AmazonWebServiceRequest> T beforeMarshalling(
            T request) {

        T local = request;
        for (RequestHandler2 handler : requestHandler2s) {
            local = (T) handler.beforeMarshalling(local);
        }
        return local;
    }

    protected ExecutionContext createExecutionContext(AmazonWebServiceRequest req) {
        boolean isMetricsEnabled = isRequestMetricsEnabled(req) || isProfilingEnabled();
        return new ExecutionContext(requestHandler2s, isMetricsEnabled, this);
    }

    protected final ExecutionContext createExecutionContext(Request<?> req) {
        return createExecutionContext(req.getOriginalRequest());
    }

    /**
     * @deprecated by {@link #createExecutionContext(AmazonWebServiceRequest)}.
     *
     *             This method exists only for backward compatiblity reason, so
     *             that clients compiled against the older version of this class
     *             won't get {@link NoSuchMethodError} at runtime. However,
     *             calling this methods would effectively ignore and disable the
     *             request metric collector, if any, specified at the request
     *             level. Request metric collector specified at the service
     *             client or AWS SDK level will still be honored.
     */
    @Deprecated
    protected final ExecutionContext createExecutionContext() {
        boolean isMetricsEnabled = isRMCEnabledAtClientOrSdkLevel() || isProfilingEnabled();
        return new ExecutionContext(requestHandler2s, isMetricsEnabled, this);
    }

    /* Check the profiling system property and return true if set */
    protected static boolean isProfilingEnabled() {
        return System.getProperty(PROFILING_SYSTEM_PROPERTY) != null;
    }

    /**
     * Returns true if request metric collection is applicable to the given
     * request; false otherwise.
     */
    protected final boolean isRequestMetricsEnabled(AmazonWebServiceRequest req) {
        RequestMetricCollector c = req.getRequestMetricCollector(); // request level collector
        if (c != null && c.isEnabled()) {
            return true;
        }
        return isRMCEnabledAtClientOrSdkLevel();
    }

    /**
     * Returns true if request metric collection is enabled at the service
     * client or AWS SDK level request; false otherwise.
     */
    private boolean isRMCEnabledAtClientOrSdkLevel() {
        RequestMetricCollector c = requestMetricCollector();
        return c != null && c.isEnabled();
    }

    /**
     * Sets the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @param timeOffset
     *            The optional value for time offset (in seconds) for this client.
     */
    public void setTimeOffset(int timeOffset) {
        this.timeOffset = timeOffset;
    }

    /**
     * Sets the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @param timeOffset
     *            The optional value for time offset (in seconds) for this client.
     *
     * @return the updated web service client
     */
    public AmazonWebServiceClient withTimeOffset(int timeOffset) {
        setTimeOffset(timeOffset);
        return this;
    }

    /**
     * Returns the optional value for time offset for this client.  This
     * value will be applied to all requests processed through this client.
     * Value is in seconds, positive values imply the current clock is "fast",
     * negative values imply clock is slow.
     *
     * @return The optional value for time offset (in seconds) for this client.
     */
    public int getTimeOffset() {
        return timeOffset;
    }

    /**
     * Returns the client specific {@link RequestMetricCollector}; or null if
     * there is none.
     */
    public RequestMetricCollector getRequestMetricsCollector() {
        return client.getRequestMetricCollector();
    }

    /**
     * Returns the client specific request metric collector if there is one; or
     * the one at the AWS SDK level otherwise.
     */
    protected RequestMetricCollector requestMetricCollector() {
        RequestMetricCollector mc = client.getRequestMetricCollector();
        return mc == null ? AwsSdkMetrics.getRequestMetricCollector() : mc;
    }

    /**
     * Returns the most specific request metric collector, starting from the
     * request level, then client level, then finally the AWS SDK level.
     */
    protected final RequestMetricCollector findRequestMetricCollector(Request<?> req) {
        AmazonWebServiceRequest origReq = req.getOriginalRequest();
        RequestMetricCollector mc = origReq.getRequestMetricCollector();
        if (mc != null) {
            return mc;
        }
        mc = getRequestMetricsCollector();
        return mc == null ? AwsSdkMetrics.getRequestMetricCollector() : mc;
    }

    /**
     * Convenient method to end the client execution without logging the
     * awsRequestMetrics.
     */
    protected final void endClientExecution(
            AWSRequestMetrics awsRequestMetrics, Request<?> request,
            Response<?> response) {
        this.endClientExecution(awsRequestMetrics, request, response,
                !LOGGING_AWS_REQUEST_METRIC);
    }

    /**
     * Common routine to end a client AWS request/response execution and collect
     * the request metrics.  Caller of this routine is responsible for starting
     * the event for {@link Field#ClientExecuteTime} and call this method
     * in a try-finally block.
     *
     * @param loggingAwsRequestMetrics deprecated and ignored
     */
    protected final void endClientExecution(
            AWSRequestMetrics awsRequestMetrics, Request<?> request,
            Response<?> response, @Deprecated boolean loggingAwsRequestMetrics) {
        if (request != null) {
            awsRequestMetrics.endEvent(Field.ClientExecuteTime);
            awsRequestMetrics.getTimingInfo().endTiming();
            RequestMetricCollector c = findRequestMetricCollector(request);
            c.collectMetrics(request, response);
            awsRequestMetrics.log();
        }
    }

    /**
     * @deprecated by {@link #getServiceName()}.
     */
    @Deprecated
    protected String getServiceAbbreviation() {
        return getServiceNameIntern();
    }

    /**
     * Returns the service abbreviation for this service, used for identifying
     * service endpoints by region, identifying the necessary signer, etc.
     * Used to be call "getServiceAbbreviation".
     */
    public String getServiceName() {
        return getServiceNameIntern();
    }

    /**
     * @return the service name that should be used when computing the region
     *         endpoints. This method returns the value of the
     *         regionMetadataServiceName configuration in the internal config
     *         file if such configuration is specified for the current client,
     *         otherwise it returns the same service name that is used for
     *         request signing.
     */
    String getEndpointPrefix() {

        if (endpointPrefix != null) return endpointPrefix;

        String httpClientName = getHttpClientName();
        String serviceNameInRegionMetadata = ServiceNameFactory
                .getServiceNameInRegionMetadata(httpClientName);

        synchronized(this) {
            if (endpointPrefix != null) return endpointPrefix;
            if (serviceNameInRegionMetadata != null) {
                return endpointPrefix = serviceNameInRegionMetadata;
            } else {
                return endpointPrefix = getServiceNameIntern();
            }
        }

    }

    /**
     * An internal method used to explicitly override the service name for region metadata.
     * This service name is used to compute the region endpoints.
     */
    protected void setEndpointPrefix(String endpointPrefix) {
        if (endpointPrefix == null) {
            throw new IllegalArgumentException(
                    "The parameter endpointPrefix must be specified!");
        }
        this.endpointPrefix = endpointPrefix;
    }

    /**
     * Internal method for implementing {@link #getServiceName()}. Method is
     * protected by intent so peculiar subclass that don't follow the class
     * naming convention can choose to return whatever service name as needed.
     */
    protected String getServiceNameIntern() {
        if (serviceName == null) {
            synchronized(this) {
                if (serviceName == null) {
                    return serviceName = computeServiceName();
                }
            }
        }
        return serviceName;
    }

    /**
     * An internal method used to explicitly override the service name
     * computed by the default implementation. This method is not expected to be
     * normally called except for AWS internal development purposes.
     */
    public final void setServiceNameIntern(String serviceName) {
        if (serviceName == null)
            throw new IllegalArgumentException(
                    "The parameter serviceName must be specified!");
        this.serviceName = serviceName;
    }

    /**
     * Returns the service name of this AWS http client by first looking it up
     * from the SDK internal configuration, and if not found, derive it from the
     * class name of the immediate subclass of {@link AmazonWebServiceClient}.
     * No configuration is necessary if the simple class name of the http client
     * follows the convention of <code>(Amazon|AWS).*(JavaClient|Client)</code>.
     */
    private String computeServiceName() {
        final String httpClientName = getHttpClientName();
        String service = ServiceNameFactory.getServiceName(httpClientName);
        if (service != null) {
            return service; // only if it is so explicitly configured
        }
        // Otherwise, make use of convention over configuration
        int j = httpClientName.indexOf("JavaClient");
        if (j == -1) {
            j = httpClientName.indexOf("Client");
            if (j == -1) {
                throw new IllegalStateException(
                        "Unrecognized suffix for the AWS http client class name "
                                + httpClientName);
            }
        }
        int i = httpClientName.indexOf(AMAZON);
        int len;
        if (i == -1) {
            i = httpClientName.indexOf(AWS);
            if (i == -1) {
                throw new IllegalStateException(
                        "Unrecognized prefix for the AWS http client class name "
                                + httpClientName);
            }
            len = AWS.length();
        } else {
            len = AMAZON.length();
        }
        if (i >= j) {
            throw new IllegalStateException(
                    "Unrecognized AWS http client class name " + httpClientName);
        }
        String serviceName = httpClientName.substring(i + len, j);
        return StringUtils.lowerCase(serviceName);
    }

    private String getHttpClientName() {
        Class<?> httpClientClass = Classes.childClassOf(
                AmazonWebServiceClient.class, this);
        return httpClientClass.getSimpleName();
    }

    /**
     * Returns the signer region override.
     *
     * @see #setSignerRegionOverride(String).
     */
    public final String getSignerRegionOverride() {
        return signerRegionOverride;
    }

    /**
     * An internal method used to explicitly override the internal signer region
     * computed by the default implementation. This method is not expected to be
     * normally called except for AWS internal development purposes.
     */
    public final void setSignerRegionOverride(String signerRegionOverride) {
        Signer signer = computeSignerByURI(endpoint, signerRegionOverride, true);
        synchronized(this)  {
            this.signer = signer;
            this.signerRegionOverride = signerRegionOverride;
        }
    }

    /**
     * Fluent method for {@link #setRegion(Region)}.
     *<pre>
     * Example:
     *
     *   AmazonDynamoDBClient client = new AmazonDynamoDBClient(...).<AmazonDynamoDBClient>withRegion(...);
     *</pre>
     * @see #setRegion(Region)
     */
    public <T extends AmazonWebServiceClient> T withRegion(Region region) {
        setRegion(region);
        @SuppressWarnings("unchecked") T t= (T)this;
        return t;
    }

    /**
     * Convenient fluent method for setting region.
     *
     * @param region region to set to; must not be null.
     *
     * @see #withRegion(Region)
     */
    public <T extends AmazonWebServiceClient> T withRegion(Regions region) {
        configureRegion(region);
        @SuppressWarnings("unchecked") T t= (T)this;
        return t;
    }
    /**
     * Fluent method for {@link #setEndpoint(String)}.
     *<pre>
     * Example:
     *
     *   AmazonDynamoDBClient client = new AmazonDynamoDBClient(...).<AmazonDynamoDBClient>withEndPoint(...);
     *</pre>
     * @see #setEndpoint(String)
     */
    public <T extends AmazonWebServiceClient> T withEndpoint(String endpoint) {
        setEndpoint(endpoint);
        @SuppressWarnings("unchecked") T t= (T)this;
        return t;
    }
}
