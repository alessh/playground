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

package com.amazonaws.services.kms.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateGrantRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * To specify this value, use the globally unique key ID or the Amazon
     * Resource Name (ARN) of the key. Examples:
     * <ul>
     * <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     * <li>Key ARN:
     * arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234-1234
     * -123456789012</li>
     * </ul>
     * </p>
     */
    private String keyId;
    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     */
    private String granteePrincipal;
    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     */
    private String retiringPrincipal;
    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> operations;
    /**
     * <p>
     * The conditions under which the operations permitted by the grant are
     * allowed.
     * </p>
     * <p>
     * You can use this value to allow the operations permitted by the grant
     * only when a specified encryption context is present. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private GrantConstraints constraints;
    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> grantTokens;
    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * To specify this value, use the globally unique key ID or the Amazon
     * Resource Name (ARN) of the key. Examples:
     * <ul>
     * <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     * <li>Key ARN:
     * arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234-1234
     * -123456789012</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the customer master key (CMK) that the
     *        grant applies to.</p>
     *        <p>
     *        To specify this value, use the globally unique key ID or the
     *        Amazon Resource Name (ARN) of the key. Examples:
     *        <ul>
     *        <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     *        <li>Key ARN:
     *        arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234
     *        -1234-123456789012</li>
     *        </ul>
     */

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * To specify this value, use the globally unique key ID or the Amazon
     * Resource Name (ARN) of the key. Examples:
     * <ul>
     * <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     * <li>Key ARN:
     * arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234-1234
     * -123456789012</li>
     * </ul>
     * </p>
     * 
     * @return The unique identifier for the customer master key (CMK) that the
     *         grant applies to.</p>
     *         <p>
     *         To specify this value, use the globally unique key ID or the
     *         Amazon Resource Name (ARN) of the key. Examples:
     *         <ul>
     *         <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     *         <li>Key ARN:
     *         arn:aws:kms:us-west-2:123456789012:key/12345678-1234-
     *         1234-1234-123456789012</li>
     *         </ul>
     */

    public String getKeyId() {
        return this.keyId;
    }

    /**
     * <p>
     * The unique identifier for the customer master key (CMK) that the grant
     * applies to.
     * </p>
     * <p>
     * To specify this value, use the globally unique key ID or the Amazon
     * Resource Name (ARN) of the key. Examples:
     * <ul>
     * <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     * <li>Key ARN:
     * arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234-1234
     * -123456789012</li>
     * </ul>
     * </p>
     * 
     * @param keyId
     *        The unique identifier for the customer master key (CMK) that the
     *        grant applies to.</p>
     *        <p>
     *        To specify this value, use the globally unique key ID or the
     *        Amazon Resource Name (ARN) of the key. Examples:
     *        <ul>
     *        <li>Globally unique key ID: 12345678-1234-1234-1234-123456789012</li>
     *        <li>Key ARN:
     *        arn:aws:kms:us-west-2:123456789012:key/12345678-1234-1234
     *        -1234-123456789012</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withKeyId(String keyId) {
        setKeyId(keyId);
        return this;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that is given permission to perform the operations
     *        that the grant permits.</p>
     *        <p>
     *        To specify the principal, use the <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *        principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax to
     *        use for specifying a principal, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *        >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     */

    public void setGranteePrincipal(String granteePrincipal) {
        this.granteePrincipal = granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The principal that is given permission to perform the operations
     *         that the grant permits.</p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *         principals include AWS accounts (root), IAM users, federated
     *         users, and assumed role users. For examples of the ARN syntax to
     *         use for specifying a principal, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *         section of the <i>AWS General Reference</i>.
     */

    public String getGranteePrincipal() {
        return this.granteePrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to perform the operations that the
     * grant permits.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param granteePrincipal
     *        The principal that is given permission to perform the operations
     *        that the grant permits.</p>
     *        <p>
     *        To specify the principal, use the <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *        principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax to
     *        use for specifying a principal, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *        >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withGranteePrincipal(String granteePrincipal) {
        setGranteePrincipal(granteePrincipal);
        return this;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that is given permission to retire the grant by
     *        using <a>RetireGrant</a> operation.</p>
     *        <p>
     *        To specify the principal, use the <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *        principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax to
     *        use for specifying a principal, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *        >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     */

    public void setRetiringPrincipal(String retiringPrincipal) {
        this.retiringPrincipal = retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @return The principal that is given permission to retire the grant by
     *         using <a>RetireGrant</a> operation.</p>
     *         <p>
     *         To specify the principal, use the <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *         >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *         principals include AWS accounts (root), IAM users, federated
     *         users, and assumed role users. For examples of the ARN syntax to
     *         use for specifying a principal, see <a href=
     *         "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *         >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *         section of the <i>AWS General Reference</i>.
     */

    public String getRetiringPrincipal() {
        return this.retiringPrincipal;
    }

    /**
     * <p>
     * The principal that is given permission to retire the grant by using
     * <a>RetireGrant</a> operation.
     * </p>
     * <p>
     * To specify the principal, use the <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     * >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS principals
     * include AWS accounts (root), IAM users, federated users, and assumed role
     * users. For examples of the ARN syntax to use for specifying a principal,
     * see <a href=
     * "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     * >AWS Identity and Access Management (IAM)</a> in the Example ARNs section
     * of the <i>AWS General Reference</i>.
     * </p>
     * 
     * @param retiringPrincipal
     *        The principal that is given permission to retire the grant by
     *        using <a>RetireGrant</a> operation.</p>
     *        <p>
     *        To specify the principal, use the <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html"
     *        >Amazon Resource Name (ARN)</a> of an AWS principal. Valid AWS
     *        principals include AWS accounts (root), IAM users, federated
     *        users, and assumed role users. For examples of the ARN syntax to
     *        use for specifying a principal, see <a href=
     *        "http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-iam"
     *        >AWS Identity and Access Management (IAM)</a> in the Example ARNs
     *        section of the <i>AWS General Reference</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withRetiringPrincipal(String retiringPrincipal) {
        setRetiringPrincipal(retiringPrincipal);
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     * 
     * @return A list of operations that the grant permits. The list can contain
     *         any combination of one or more of the following values:
     *         <ul>
     *         <li>Decrypt</li>
     *         <li>Encrypt</li>
     *         <li>GenerateDataKey</li>
     *         <li>GenerateDataKeyWithoutPlaintext</li>
     *         <li>ReEncryptFrom</li>
     *         <li>ReEncryptTo</li>
     *         <li>CreateGrant</li>
     *         <li>RetireGrant</li>
     *         </ul>
     * @see GrantOperation
     */

    public java.util.List<String> getOperations() {
        if (operations == null) {
            operations = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return operations;
    }

    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits. The list can contain
     *        any combination of one or more of the following values:
     *        <ul>
     *        <li>Decrypt</li>
     *        <li>Encrypt</li>
     *        <li>GenerateDataKey</li>
     *        <li>GenerateDataKeyWithoutPlaintext</li>
     *        <li>ReEncryptFrom</li>
     *        <li>ReEncryptTo</li>
     *        <li>CreateGrant</li>
     *        <li>RetireGrant</li>
     *        </ul>
     * @see GrantOperation
     */

    public void setOperations(java.util.Collection<String> operations) {
        if (operations == null) {
            this.operations = null;
            return;
        }

        this.operations = new com.amazonaws.internal.SdkInternalList<String>(
                operations);
    }

    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setOperations(java.util.Collection)} or
     * {@link #withOperations(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits. The list can contain
     *        any combination of one or more of the following values:
     *        <ul>
     *        <li>Decrypt</li>
     *        <li>Encrypt</li>
     *        <li>GenerateDataKey</li>
     *        <li>GenerateDataKeyWithoutPlaintext</li>
     *        <li>ReEncryptFrom</li>
     *        <li>ReEncryptTo</li>
     *        <li>CreateGrant</li>
     *        <li>RetireGrant</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GrantOperation
     */

    public CreateGrantRequest withOperations(String... operations) {
        if (this.operations == null) {
            setOperations(new com.amazonaws.internal.SdkInternalList<String>(
                    operations.length));
        }
        for (String ele : operations) {
            this.operations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits. The list can contain
     *        any combination of one or more of the following values:
     *        <ul>
     *        <li>Decrypt</li>
     *        <li>Encrypt</li>
     *        <li>GenerateDataKey</li>
     *        <li>GenerateDataKeyWithoutPlaintext</li>
     *        <li>ReEncryptFrom</li>
     *        <li>ReEncryptTo</li>
     *        <li>CreateGrant</li>
     *        <li>RetireGrant</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GrantOperation
     */

    public CreateGrantRequest withOperations(
            java.util.Collection<String> operations) {
        setOperations(operations);
        return this;
    }

    /**
     * <p>
     * A list of operations that the grant permits. The list can contain any
     * combination of one or more of the following values:
     * <ul>
     * <li>Decrypt</li>
     * <li>Encrypt</li>
     * <li>GenerateDataKey</li>
     * <li>GenerateDataKeyWithoutPlaintext</li>
     * <li>ReEncryptFrom</li>
     * <li>ReEncryptTo</li>
     * <li>CreateGrant</li>
     * <li>RetireGrant</li>
     * </ul>
     * </p>
     * 
     * @param operations
     *        A list of operations that the grant permits. The list can contain
     *        any combination of one or more of the following values:
     *        <ul>
     *        <li>Decrypt</li>
     *        <li>Encrypt</li>
     *        <li>GenerateDataKey</li>
     *        <li>GenerateDataKeyWithoutPlaintext</li>
     *        <li>ReEncryptFrom</li>
     *        <li>ReEncryptTo</li>
     *        <li>CreateGrant</li>
     *        <li>RetireGrant</li>
     *        </ul>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see GrantOperation
     */

    public CreateGrantRequest withOperations(GrantOperation... operations) {
        com.amazonaws.internal.SdkInternalList<String> operationsCopy = new com.amazonaws.internal.SdkInternalList<String>(
                operations.length);
        for (GrantOperation value : operations) {
            operationsCopy.add(value.toString());
        }
        if (getOperations() == null) {
            setOperations(operationsCopy);
        } else {
            getOperations().addAll(operationsCopy);
        }
        return this;
    }

    /**
     * <p>
     * The conditions under which the operations permitted by the grant are
     * allowed.
     * </p>
     * <p>
     * You can use this value to allow the operations permitted by the grant
     * only when a specified encryption context is present. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param constraints
     *        The conditions under which the operations permitted by the grant
     *        are allowed.</p>
     *        <p>
     *        You can use this value to allow the operations permitted by the
     *        grant only when a specified encryption context is present. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     *        >Encryption Context</a> in the <i>AWS Key Management Service
     *        Developer Guide</i>.
     */

    public void setConstraints(GrantConstraints constraints) {
        this.constraints = constraints;
    }

    /**
     * <p>
     * The conditions under which the operations permitted by the grant are
     * allowed.
     * </p>
     * <p>
     * You can use this value to allow the operations permitted by the grant
     * only when a specified encryption context is present. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return The conditions under which the operations permitted by the grant
     *         are allowed.</p>
     *         <p>
     *         You can use this value to allow the operations permitted by the
     *         grant only when a specified encryption context is present. For
     *         more information, see <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     *         >Encryption Context</a> in the <i>AWS Key Management Service
     *         Developer Guide</i>.
     */

    public GrantConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * <p>
     * The conditions under which the operations permitted by the grant are
     * allowed.
     * </p>
     * <p>
     * You can use this value to allow the operations permitted by the grant
     * only when a specified encryption context is present. For more
     * information, see <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     * >Encryption Context</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param constraints
     *        The conditions under which the operations permitted by the grant
     *        are allowed.</p>
     *        <p>
     *        You can use this value to allow the operations permitted by the
     *        grant only when a specified encryption context is present. For
     *        more information, see <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/encrypt-context.html"
     *        >Encryption Context</a> in the <i>AWS Key Management Service
     *        Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withConstraints(GrantConstraints constraints) {
        setConstraints(constraints);
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @return A list of grant tokens.</p>
     *         <p>
     *         For more information, go to <a href=
     *         "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *         >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *         Guide</i>.
     */

    public java.util.List<String> getGrantTokens() {
        if (grantTokens == null) {
            grantTokens = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return grantTokens;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     */

    public void setGrantTokens(java.util.Collection<String> grantTokens) {
        if (grantTokens == null) {
            this.grantTokens = null;
            return;
        }

        this.grantTokens = new com.amazonaws.internal.SdkInternalList<String>(
                grantTokens);
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGrantTokens(java.util.Collection)} or
     * {@link #withGrantTokens(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withGrantTokens(String... grantTokens) {
        if (this.grantTokens == null) {
            setGrantTokens(new com.amazonaws.internal.SdkInternalList<String>(
                    grantTokens.length));
        }
        for (String ele : grantTokens) {
            this.grantTokens.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of grant tokens.
     * </p>
     * <p>
     * For more information, go to <a href=
     * "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     * >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     * Guide</i>.
     * </p>
     * 
     * @param grantTokens
     *        A list of grant tokens.</p>
     *        <p>
     *        For more information, go to <a href=
     *        "http://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#grant_token"
     *        >Grant Tokens</a> in the <i>AWS Key Management Service Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withGrantTokens(
            java.util.Collection<String> grantTokens) {
        setGrantTokens(grantTokens);
        return this;
    }

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     * 
     * @param name
     *        A friendly name for identifying the grant. Use this value to
     *        prevent unintended creation of duplicate grants when retrying this
     *        request.</p>
     *        <p>
     *        When this value is absent, all <code>CreateGrant</code> requests
     *        result in a new grant with a unique <code>GrantId</code> even if
     *        all the supplied parameters are identical. This can result in
     *        unintended duplicates when you retry the <code>CreateGrant</code>
     *        request.
     *        </p>
     *        <p>
     *        When this value is present, you can retry a
     *        <code>CreateGrant</code> request with identical parameters; if the
     *        grant already exists, the original <code>GrantId</code> is
     *        returned without creating a new grant. Note that the returned
     *        grant token is unique with every <code>CreateGrant</code> request,
     *        even when a duplicate <code>GrantId</code> is returned. All grant
     *        tokens obtained in this way can be used interchangeably.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     * 
     * @return A friendly name for identifying the grant. Use this value to
     *         prevent unintended creation of duplicate grants when retrying
     *         this request.</p>
     *         <p>
     *         When this value is absent, all <code>CreateGrant</code> requests
     *         result in a new grant with a unique <code>GrantId</code> even if
     *         all the supplied parameters are identical. This can result in
     *         unintended duplicates when you retry the <code>CreateGrant</code>
     *         request.
     *         </p>
     *         <p>
     *         When this value is present, you can retry a
     *         <code>CreateGrant</code> request with identical parameters; if
     *         the grant already exists, the original <code>GrantId</code> is
     *         returned without creating a new grant. Note that the returned
     *         grant token is unique with every <code>CreateGrant</code>
     *         request, even when a duplicate <code>GrantId</code> is returned.
     *         All grant tokens obtained in this way can be used
     *         interchangeably.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for identifying the grant. Use this value to prevent
     * unintended creation of duplicate grants when retrying this request.
     * </p>
     * <p>
     * When this value is absent, all <code>CreateGrant</code> requests result
     * in a new grant with a unique <code>GrantId</code> even if all the
     * supplied parameters are identical. This can result in unintended
     * duplicates when you retry the <code>CreateGrant</code> request.
     * </p>
     * <p>
     * When this value is present, you can retry a <code>CreateGrant</code>
     * request with identical parameters; if the grant already exists, the
     * original <code>GrantId</code> is returned without creating a new grant.
     * Note that the returned grant token is unique with every
     * <code>CreateGrant</code> request, even when a duplicate
     * <code>GrantId</code> is returned. All grant tokens obtained in this way
     * can be used interchangeably.
     * </p>
     * 
     * @param name
     *        A friendly name for identifying the grant. Use this value to
     *        prevent unintended creation of duplicate grants when retrying this
     *        request.</p>
     *        <p>
     *        When this value is absent, all <code>CreateGrant</code> requests
     *        result in a new grant with a unique <code>GrantId</code> even if
     *        all the supplied parameters are identical. This can result in
     *        unintended duplicates when you retry the <code>CreateGrant</code>
     *        request.
     *        </p>
     *        <p>
     *        When this value is present, you can retry a
     *        <code>CreateGrant</code> request with identical parameters; if the
     *        grant already exists, the original <code>GrantId</code> is
     *        returned without creating a new grant. Note that the returned
     *        grant token is unique with every <code>CreateGrant</code> request,
     *        even when a duplicate <code>GrantId</code> is returned. All grant
     *        tokens obtained in this way can be used interchangeably.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public CreateGrantRequest withName(String name) {
        setName(name);
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
        if (getKeyId() != null)
            sb.append("KeyId: " + getKeyId() + ",");
        if (getGranteePrincipal() != null)
            sb.append("GranteePrincipal: " + getGranteePrincipal() + ",");
        if (getRetiringPrincipal() != null)
            sb.append("RetiringPrincipal: " + getRetiringPrincipal() + ",");
        if (getOperations() != null)
            sb.append("Operations: " + getOperations() + ",");
        if (getConstraints() != null)
            sb.append("Constraints: " + getConstraints() + ",");
        if (getGrantTokens() != null)
            sb.append("GrantTokens: " + getGrantTokens() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateGrantRequest == false)
            return false;
        CreateGrantRequest other = (CreateGrantRequest) obj;
        if (other.getKeyId() == null ^ this.getKeyId() == null)
            return false;
        if (other.getKeyId() != null
                && other.getKeyId().equals(this.getKeyId()) == false)
            return false;
        if (other.getGranteePrincipal() == null
                ^ this.getGranteePrincipal() == null)
            return false;
        if (other.getGranteePrincipal() != null
                && other.getGranteePrincipal().equals(
                        this.getGranteePrincipal()) == false)
            return false;
        if (other.getRetiringPrincipal() == null
                ^ this.getRetiringPrincipal() == null)
            return false;
        if (other.getRetiringPrincipal() != null
                && other.getRetiringPrincipal().equals(
                        this.getRetiringPrincipal()) == false)
            return false;
        if (other.getOperations() == null ^ this.getOperations() == null)
            return false;
        if (other.getOperations() != null
                && other.getOperations().equals(this.getOperations()) == false)
            return false;
        if (other.getConstraints() == null ^ this.getConstraints() == null)
            return false;
        if (other.getConstraints() != null
                && other.getConstraints().equals(this.getConstraints()) == false)
            return false;
        if (other.getGrantTokens() == null ^ this.getGrantTokens() == null)
            return false;
        if (other.getGrantTokens() != null
                && other.getGrantTokens().equals(this.getGrantTokens()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null
                && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getKeyId() == null) ? 0 : getKeyId().hashCode());
        hashCode = prime
                * hashCode
                + ((getGranteePrincipal() == null) ? 0 : getGranteePrincipal()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getRetiringPrincipal() == null) ? 0
                        : getRetiringPrincipal().hashCode());
        hashCode = prime * hashCode
                + ((getOperations() == null) ? 0 : getOperations().hashCode());
        hashCode = prime
                * hashCode
                + ((getConstraints() == null) ? 0 : getConstraints().hashCode());
        hashCode = prime
                * hashCode
                + ((getGrantTokens() == null) ? 0 : getGrantTokens().hashCode());
        hashCode = prime * hashCode
                + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public CreateGrantRequest clone() {
        return (CreateGrantRequest) super.clone();
    }
}