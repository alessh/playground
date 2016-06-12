/*
 * Copyright 2011-2016 Amazon Technologies, Inc.
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

package com.amazonaws.auth;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.annotation.ThreadSafe;
import com.amazonaws.internal.StaticCredentialsProvider;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClient;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.amazonaws.util.ValidationUtils;

import java.util.concurrent.Callable;

/**
 * AWSCredentialsProvider implementation that uses the AWS Security Token Service to assume a Role
 * and create temporary, short-lived sessions to use for authentication.
 */
@ThreadSafe
public class STSAssumeRoleSessionCredentialsProvider implements AWSSessionCredentialsProvider {

    /**
     * Default duration for started sessions.
     */
    public static final int DEFAULT_DURATION_SECONDS = 900;

    /**
     * The client for starting STS sessions.
     */
    private final AWSSecurityTokenService securityTokenService;

    /**
     * The arn of the role to be assumed.
     */
    private final String roleArn;

    /**
     * An identifier for the assumed role session.
     */
    private final String roleSessionName;

    /**
     * An external Id parameter for the assumed role session
     */
    private final String roleExternalId;

    /**
     * The Duration for assume role sessions.
     */
    private final int roleSessionDurationSeconds;

    private final Callable<SessionCredentialsHolder> refreshCallable = new Callable<SessionCredentialsHolder>() {
        @Override
        public SessionCredentialsHolder call() throws Exception {
            return newSession();
        }
    };

    /**
     * Handles the refreshing of sessions. Ideally this should be final but #setSTSClientEndpoint
     * forces us to create a new one.
     */
    private volatile RefreshableTask<SessionCredentialsHolder> refreshableTask;

    /**
     * Constructs a new STSAssumeRoleSessionCredentialsProvider, which makes a request to the AWS
     * Security Token Service (STS), uses the provided {@link #roleArn} to assume a role and then
     * request short lived session credentials, which will then be returned by this class's {@link
     * #getCredentials()} method.
     *
     * @param roleArn         The ARN of the Role to be assumed.
     * @param roleSessionName An identifier for the assumed role session.
     */
    public STSAssumeRoleSessionCredentialsProvider(String roleArn, String roleSessionName) {
        this(new Builder(roleArn, roleSessionName));
    }


    /**
     * Constructs a new STSAssumeRoleSessionCredentialsProvider, which will use the specified long
     * lived AWS credentials to make a request to the AWS Security Token Service (STS), uses the
     * provided {@link #roleArn} to assume a role and then request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentials The main AWS credentials for a user's account.
     * @param roleArn              The ARN of the Role to be assumed.
     * @param roleSessionName      An identifier for the assumed role session.
     */
    public STSAssumeRoleSessionCredentialsProvider(AWSCredentials longLivedCredentials,
                                                   String roleArn, String roleSessionName) {
        this(longLivedCredentials, roleArn, roleSessionName, new ClientConfiguration());
    }

    /**
     * Constructs a new STSAssumeRoleSessionCredentialsProvider, which will use the specified long
     * lived AWS credentials to make a request to the AWS Security Token Service (STS), uses the
     * provided {@link #roleArn} to assume a role and then request short lived session credentials,
     * which will then be returned by this class's {@link #getCredentials()} method.
     *
     * @param longLivedCredentials The main AWS credentials for a user's account.
     * @param roleArn              The ARN of the Role to be assumed.
     * @param roleSessionName      An identifier for the assumed role session.
     * @param clientConfiguration  Client configuration connection parameters.
     */
    public STSAssumeRoleSessionCredentialsProvider(AWSCredentials longLivedCredentials,
                                                   String roleArn, String roleSessionName,
                                                   ClientConfiguration clientConfiguration) {
        this(new Builder(roleArn, roleSessionName).withLongLivedCredentials(longLivedCredentials)
                     .withClientConfiguration(clientConfiguration));
    }


    /**
     * Constructs a new STSAssumeRoleSessionCredentialsProvider, which will use the specified
     * credentials provider (which vends long lived AWS credentials) to make a request to the AWS
     * Security Token Service (STS), usess the provided {@link #roleArn} to assume a role and then
     * request short lived session credentials, which will then be returned by this class's {@link
     * #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider Credentials provider for the main AWS credentials for a
     *                                     user's account.
     * @param roleArn                      The ARN of the Role to be assumed.
     * @param roleSessionName              An identifier for the assumed role session.
     */
    public STSAssumeRoleSessionCredentialsProvider(
            AWSCredentialsProvider longLivedCredentialsProvider, String roleArn,
            String roleSessionName) {
        this(new Builder(roleArn, roleSessionName)
                     .withLongLivedCredentialsProvider(longLivedCredentialsProvider));
    }

    /**
     * Constructs a new STSAssumeRoleSessionCredentialsProvider, which will use the specified
     * credentials provider (which vends long lived AWS credentials) to make a request to the AWS
     * Security Token Service (STS), uses the provided {@link #roleArn} to assume a role and then
     * request short lived session credentials, which will then be returned by this class's {@link
     * #getCredentials()} method.
     *
     * @param longLivedCredentialsProvider Credentials provider for the main AWS credentials for a
     *                                     user's account.
     * @param roleArn                      The ARN of the Role to be assumed.
     * @param roleSessionName              An identifier for the assumed role session.
     * @param clientConfiguration          Client configuration connection parameters.
     */
    public STSAssumeRoleSessionCredentialsProvider(
            AWSCredentialsProvider longLivedCredentialsProvider, String roleArn,
            String roleSessionName, ClientConfiguration clientConfiguration) {
        this(new Builder(roleArn, roleSessionName)
                     .withLongLivedCredentialsProvider(longLivedCredentialsProvider)
                     .withClientConfiguration(clientConfiguration));
    }

    private RefreshableTask<SessionCredentialsHolder> createRefreshableTask() {
        return new RefreshableTask.Builder<SessionCredentialsHolder>()
                .withRefreshCallable(refreshCallable)
                .withBlockingRefreshPredicate(new ShouldDoBlockingSessionRefresh())
                .withAsyncRefreshPredicate(new ShouldDoAsyncSessionRefresh()).build();
    }

    /**
     * The following private constructor reads state from the builder and sets the appropriate
     * parameters accordingly
     *
     * When public constructors are called, this constructors is deferred to with a null value for
     * roleExternalId and endpoint The inner Builder class can be used to construct an object that
     * actually has a value for roleExternalId and endpoint
     *
     * @throws IllegalArgumentException if both an AWSCredentials and AWSCredentialsProvider have
     *                                  been set on the builder
     */
    private STSAssumeRoleSessionCredentialsProvider(Builder builder) {
        if (builder.sts != null) {
            ValidationUtils.assertAllAreNull(
                    "If a custom STS client is set you must not set any other client related fields (ClientConfiguration, AWSCredentials, Endpoint, etc",
                    builder.longLivedCredentials, builder.longLivedCredentialsProvider,
                    builder.clientConfiguration, builder.serviceEndpoint);
            this.securityTokenService = builder.sts;
        } else {
            this.securityTokenService = buildStsClient(builder);

            if (builder.serviceEndpoint != null) {
                securityTokenService.setEndpoint(builder.serviceEndpoint);
            }
        }

        //required parameters are null checked in the builder constructor
        this.roleArn = builder.roleArn;
        this.roleSessionName = builder.roleSessionName;

        //roleExternalId may be null
        this.roleExternalId = builder.roleExternalId;

        //Assume Role Session duration may not be provided, in which case we fall back to default value of 15min
        if (builder.roleSessionDurationSeconds != 0) {
            this.roleSessionDurationSeconds = builder.roleSessionDurationSeconds;
        } else {
            this.roleSessionDurationSeconds = DEFAULT_DURATION_SECONDS;
        }

        this.refreshableTask = createRefreshableTask();
    }

    /**
     * Construct a new STS client from the settings in the builder.
     *
     * @param builder Configured builder
     * @return New instance of AWSSecurityTokenService
     * @throws IllegalArgumentException if builder configuration is inconsistent
     */
    private static AWSSecurityTokenService buildStsClient(Builder builder) throws
                                                                           IllegalArgumentException {
        /**
         * Passing two types of credential interfaces is not permitted
         */
        if (builder.longLivedCredentials != null && builder.longLivedCredentialsProvider != null) {
            throw new IllegalArgumentException(
                    "It is illegal to set both an AWSCredentials and an AWSCredentialsProvider for an " +
                    STSAssumeRoleSessionCredentialsProvider.class.getName());
        }

        AWSCredentialsProvider longLivedCredentialsProvider = null;
        if (builder.longLivedCredentials != null) {
            longLivedCredentialsProvider = new StaticCredentialsProvider(
                    builder.longLivedCredentials);
        } else if (builder.longLivedCredentialsProvider != null) {
            longLivedCredentialsProvider = builder.longLivedCredentialsProvider;
        }

        // Depending on which options are explicitly provided we have to call the right overloaded constructor so
        // defaults are properly applied.
        if (longLivedCredentialsProvider == null) {
            if (builder.clientConfiguration == null) {
                return new AWSSecurityTokenServiceClient();
            } else {
                return new AWSSecurityTokenServiceClient(builder.clientConfiguration);
            }
        } else {
            if (builder.clientConfiguration == null) {
                return new AWSSecurityTokenServiceClient(longLivedCredentialsProvider);
            } else {
                return new AWSSecurityTokenServiceClient(longLivedCredentialsProvider,
                                                         builder.clientConfiguration);
            }
        }
    }

    /**
     * Sets the AWS Security Token Service (STS) endpoint where session credentials are retrieved
     * from. <p></p> The default AWS Security Token Service (STS) endpoint ("sts.amazonaws.com")
     * works for all accounts that are not for China (Beijing) region or GovCloud. You only need to
     * change the endpoint to "sts.cn-north-1.amazonaws.com.cn" when you are requesting session
     * credentials for services in China(Beijing) region or "sts.us-gov-west-1.amazonaws.com" for
     * GovCloud. <p></p> Setting this invalidates existing session credentials.
     *
     * @deprecated This method may be removed in a future major version. Create multiple providers
     * if you need to work with multiple STS endpoints.
     */
    @Deprecated
    public synchronized void setSTSClientEndpoint(String endpoint) {
        securityTokenService.setEndpoint(endpoint);
        this.refreshableTask = createRefreshableTask();
    }


    @Override
    public AWSSessionCredentials getCredentials() {
        return refreshableTask.getValue().getSessionCredentials();
    }

    @Override
    public void refresh() {
        refreshableTask.forceGetValue();
    }

    /**
     * Starts a new session by sending a request to the AWS Security Token Service (STS) to assume a
     * Role using the long lived AWS credentials. This class then vends the short lived session
     * credentials for the assumed Role sent back from STS.
     */
    private SessionCredentialsHolder newSession() {
        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest().withRoleArn(roleArn)
                .withDurationSeconds(roleSessionDurationSeconds)
                .withRoleSessionName(roleSessionName);
        if (roleExternalId != null) {
            assumeRoleRequest = assumeRoleRequest.withExternalId(roleExternalId);
        }

        AssumeRoleResult assumeRoleResult = securityTokenService.assumeRole(assumeRoleRequest);
        return new SessionCredentialsHolder(assumeRoleResult.getCredentials());
    }

    /**
     * Provides a builder pattern to avoid combinatorial explosion of the number of parameters that
     * are passed to constructors. The builder introspects which parameters have been set and calls
     * the appropriate constructor.
     */
    public static final class Builder {

        private final String roleArn;
        private final String roleSessionName;

        private AWSCredentialsProvider longLivedCredentialsProvider;
        private AWSCredentials longLivedCredentials;
        private ClientConfiguration clientConfiguration;
        private String roleExternalId;
        private String serviceEndpoint;
        private int roleSessionDurationSeconds;
        private AWSSecurityTokenService sts;

        /**
         * @param roleArn         Required roleArn parameter used when starting a session
         * @param roleSessionName Required roleSessionName parameter used when starting a session
         */
        public Builder(String roleArn, String roleSessionName) {
            if (roleArn == null || roleSessionName == null) {
                throw new NullPointerException(
                        "You must specify a value for roleArn and roleSessionName");
            }
            this.roleArn = roleArn;
            this.roleSessionName = roleSessionName;
        }

        /**
         * Set credentials to use when retrieving session credentials This is not the recommended
         * approach. Instead, consider using the CredentialsProvider field.
         *
         * @param longLivedCredentials Credentials used to generate sessions in the assumed role
         * @return the builder itself for chained calls
         */
        public Builder withLongLivedCredentials(AWSCredentials longLivedCredentials) {
            this.longLivedCredentials = longLivedCredentials;
            return this;
        }

        /**
         * Set credentials provider to use when retrieving session credentials
         *
         * @param longLivedCredentialsProvider A credentials provider used to generate sessions in
         *                                     the assumed role
         * @return the builder itself for chained calls
         */
        public Builder withLongLivedCredentialsProvider(
                AWSCredentialsProvider longLivedCredentialsProvider) {
            this.longLivedCredentialsProvider = longLivedCredentialsProvider;
            return this;
        }

        /**
         * Set the client configuration used to create the AWSSecurityTokenService
         *
         * @param clientConfiguration ClientConfiguration for the AWSSecurityTokenService client
         * @return the builder itself for chained calls
         */
        public Builder withClientConfiguration(ClientConfiguration clientConfiguration) {
            this.clientConfiguration = clientConfiguration;
            return this;
        }

        /**
         * Set the roleExternalId parameter that is used when retrieving session credentials under
         * an assumed role.
         *
         * @param roleExternalId An external id used in the service call used to retrieve session
         *                       credentials
         * @return the builder itself for chained calls
         */
        public Builder withExternalId(String roleExternalId) {
            this.roleExternalId = roleExternalId;
            return this;
        }

        /**
         * Set the roleSessionDurationSeconds that is used when creating a new assumed role
         * session.
         *
         * @param roleSessionDurationSeconds The duration for which we want to have an assumed role
         *                                   session to be active.
         * @return the itself for chained calls
         */
        public Builder withRoleSessionDurationSeconds(int roleSessionDurationSeconds) {
            if (roleSessionDurationSeconds < 900 || roleSessionDurationSeconds > 3600) {
                throw new IllegalArgumentException(
                        "Assume Role session duration should be in the range of 15min - 1Hr");
            }
            this.roleSessionDurationSeconds = roleSessionDurationSeconds;
            return this;
        }

        /**
         * Sets the AWS Security Token Service (STS) endpoint where session credentials are
         * retrieved from. <p></p> The default AWS Security Token Service (STS) endpoint
         * ("sts.amazonaws.com") works for all accounts that are not for China (Beijing) region or
         * GovCloud. You only need to change the endpoint to "sts.cn-north-1.amazonaws.com.cn" when
         * you are requesting session credentials for services in China(Beijing) region or
         * "sts.us-gov-west-1.amazonaws.com" for GovCloud. <p></p>
         */
        public Builder withServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            return this;
        }

        /**
         * Sets a preconfigured STS client to use for the credentials provider. A custom client is
         * mutually exclusive to any other client related settings ({@link
         * #withClientConfiguration(ClientConfiguration)}, {@link #withLongLivedCredentials(AWSCredentials)},
         * {@link #withServiceEndpoint(String)}, etc).
         *
         * @param sts Custom STS client to use.
         * @return This object for chained calls.
         */
        public Builder withStsClient(AWSSecurityTokenService sts) {
            this.sts = sts;
            return this;
        }

        /**
         * Build the configured provider
         *
         * @return the configured STSAssumeRoleSessionCredentialsProvider
         */
        public STSAssumeRoleSessionCredentialsProvider build() {
            return new STSAssumeRoleSessionCredentialsProvider(this);
        }
    }

}
