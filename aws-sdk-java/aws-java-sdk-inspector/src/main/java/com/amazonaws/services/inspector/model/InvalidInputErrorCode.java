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

package com.amazonaws.services.inspector.model;

/**
 * 
 */
public enum InvalidInputErrorCode {

    INVALID_ASSESSMENT_TARGET_ARN("INVALID_ASSESSMENT_TARGET_ARN"),
    INVALID_ASSESSMENT_TEMPLATE_ARN("INVALID_ASSESSMENT_TEMPLATE_ARN"),
    INVALID_ASSESSMENT_RUN_ARN("INVALID_ASSESSMENT_RUN_ARN"),
    INVALID_FINDING_ARN("INVALID_FINDING_ARN"),
    INVALID_RESOURCE_GROUP_ARN("INVALID_RESOURCE_GROUP_ARN"),
    INVALID_RULES_PACKAGE_ARN("INVALID_RULES_PACKAGE_ARN"),
    INVALID_RESOURCE_ARN("INVALID_RESOURCE_ARN"),
    INVALID_SNS_TOPIC_ARN("INVALID_SNS_TOPIC_ARN"),
    INVALID_IAM_ROLE_ARN("INVALID_IAM_ROLE_ARN"),
    INVALID_ASSESSMENT_TARGET_NAME("INVALID_ASSESSMENT_TARGET_NAME"),
    INVALID_ASSESSMENT_TARGET_NAME_PATTERN(
            "INVALID_ASSESSMENT_TARGET_NAME_PATTERN"),
    INVALID_ASSESSMENT_TEMPLATE_NAME("INVALID_ASSESSMENT_TEMPLATE_NAME"),
    INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN(
            "INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN"),
    INVALID_ASSESSMENT_TEMPLATE_DURATION("INVALID_ASSESSMENT_TEMPLATE_DURATION"),
    INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE(
            "INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE"),
    INVALID_ASSESSMENT_RUN_DURATION_RANGE(
            "INVALID_ASSESSMENT_RUN_DURATION_RANGE"),
    INVALID_ASSESSMENT_RUN_START_TIME_RANGE(
            "INVALID_ASSESSMENT_RUN_START_TIME_RANGE"),
    INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE(
            "INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE"),
    INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE(
            "INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE"),
    INVALID_ASSESSMENT_RUN_STATE("INVALID_ASSESSMENT_RUN_STATE"),
    INVALID_TAG("INVALID_TAG"),
    INVALID_TAG_KEY("INVALID_TAG_KEY"),
    INVALID_TAG_VALUE("INVALID_TAG_VALUE"),
    INVALID_RESOURCE_GROUP_TAG_KEY("INVALID_RESOURCE_GROUP_TAG_KEY"),
    INVALID_RESOURCE_GROUP_TAG_VALUE("INVALID_RESOURCE_GROUP_TAG_VALUE"),
    INVALID_ATTRIBUTE("INVALID_ATTRIBUTE"),
    INVALID_USER_ATTRIBUTE("INVALID_USER_ATTRIBUTE"),
    INVALID_USER_ATTRIBUTE_KEY("INVALID_USER_ATTRIBUTE_KEY"),
    INVALID_USER_ATTRIBUTE_VALUE("INVALID_USER_ATTRIBUTE_VALUE"),
    INVALID_PAGINATION_TOKEN("INVALID_PAGINATION_TOKEN"),
    INVALID_MAX_RESULTS("INVALID_MAX_RESULTS"),
    INVALID_AGENT_ID("INVALID_AGENT_ID"),
    INVALID_AUTO_SCALING_GROUP("INVALID_AUTO_SCALING_GROUP"),
    INVALID_RULE_NAME("INVALID_RULE_NAME"),
    INVALID_SEVERITY("INVALID_SEVERITY"),
    INVALID_LOCALE("INVALID_LOCALE"),
    INVALID_EVENT("INVALID_EVENT"),
    ASSESSMENT_TARGET_NAME_ALREADY_TAKEN("ASSESSMENT_TARGET_NAME_ALREADY_TAKEN"),
    ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN(
            "ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN"),
    INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS(
            "INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS"),
    INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS(
            "INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS"),
    INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS(
            "INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS"),
    INVALID_NUMBER_OF_FINDING_ARNS("INVALID_NUMBER_OF_FINDING_ARNS"),
    INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS(
            "INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS"),
    INVALID_NUMBER_OF_RULES_PACKAGE_ARNS("INVALID_NUMBER_OF_RULES_PACKAGE_ARNS"),
    INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES(
            "INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES"),
    INVALID_NUMBER_OF_TAGS("INVALID_NUMBER_OF_TAGS"),
    INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS(
            "INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS"),
    INVALID_NUMBER_OF_ATTRIBUTES("INVALID_NUMBER_OF_ATTRIBUTES"),
    INVALID_NUMBER_OF_USER_ATTRIBUTES("INVALID_NUMBER_OF_USER_ATTRIBUTES"),
    INVALID_NUMBER_OF_AGENT_IDS("INVALID_NUMBER_OF_AGENT_IDS"),
    INVALID_NUMBER_OF_AUTO_SCALING_GROUPS(
            "INVALID_NUMBER_OF_AUTO_SCALING_GROUPS"),
    INVALID_NUMBER_OF_RULE_NAMES("INVALID_NUMBER_OF_RULE_NAMES"),
    INVALID_NUMBER_OF_SEVERITIES("INVALID_NUMBER_OF_SEVERITIES");

    private String value;

    private InvalidInputErrorCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return InvalidInputErrorCode corresponding to the value
     */
    public static InvalidInputErrorCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        } else if ("INVALID_ASSESSMENT_TARGET_ARN".equals(value)) {
            return INVALID_ASSESSMENT_TARGET_ARN;
        } else if ("INVALID_ASSESSMENT_TEMPLATE_ARN".equals(value)) {
            return INVALID_ASSESSMENT_TEMPLATE_ARN;
        } else if ("INVALID_ASSESSMENT_RUN_ARN".equals(value)) {
            return INVALID_ASSESSMENT_RUN_ARN;
        } else if ("INVALID_FINDING_ARN".equals(value)) {
            return INVALID_FINDING_ARN;
        } else if ("INVALID_RESOURCE_GROUP_ARN".equals(value)) {
            return INVALID_RESOURCE_GROUP_ARN;
        } else if ("INVALID_RULES_PACKAGE_ARN".equals(value)) {
            return INVALID_RULES_PACKAGE_ARN;
        } else if ("INVALID_RESOURCE_ARN".equals(value)) {
            return INVALID_RESOURCE_ARN;
        } else if ("INVALID_SNS_TOPIC_ARN".equals(value)) {
            return INVALID_SNS_TOPIC_ARN;
        } else if ("INVALID_IAM_ROLE_ARN".equals(value)) {
            return INVALID_IAM_ROLE_ARN;
        } else if ("INVALID_ASSESSMENT_TARGET_NAME".equals(value)) {
            return INVALID_ASSESSMENT_TARGET_NAME;
        } else if ("INVALID_ASSESSMENT_TARGET_NAME_PATTERN".equals(value)) {
            return INVALID_ASSESSMENT_TARGET_NAME_PATTERN;
        } else if ("INVALID_ASSESSMENT_TEMPLATE_NAME".equals(value)) {
            return INVALID_ASSESSMENT_TEMPLATE_NAME;
        } else if ("INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN".equals(value)) {
            return INVALID_ASSESSMENT_TEMPLATE_NAME_PATTERN;
        } else if ("INVALID_ASSESSMENT_TEMPLATE_DURATION".equals(value)) {
            return INVALID_ASSESSMENT_TEMPLATE_DURATION;
        } else if ("INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE".equals(value)) {
            return INVALID_ASSESSMENT_TEMPLATE_DURATION_RANGE;
        } else if ("INVALID_ASSESSMENT_RUN_DURATION_RANGE".equals(value)) {
            return INVALID_ASSESSMENT_RUN_DURATION_RANGE;
        } else if ("INVALID_ASSESSMENT_RUN_START_TIME_RANGE".equals(value)) {
            return INVALID_ASSESSMENT_RUN_START_TIME_RANGE;
        } else if ("INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE".equals(value)) {
            return INVALID_ASSESSMENT_RUN_COMPLETION_TIME_RANGE;
        } else if ("INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE"
                .equals(value)) {
            return INVALID_ASSESSMENT_RUN_STATE_CHANGE_TIME_RANGE;
        } else if ("INVALID_ASSESSMENT_RUN_STATE".equals(value)) {
            return INVALID_ASSESSMENT_RUN_STATE;
        } else if ("INVALID_TAG".equals(value)) {
            return INVALID_TAG;
        } else if ("INVALID_TAG_KEY".equals(value)) {
            return INVALID_TAG_KEY;
        } else if ("INVALID_TAG_VALUE".equals(value)) {
            return INVALID_TAG_VALUE;
        } else if ("INVALID_RESOURCE_GROUP_TAG_KEY".equals(value)) {
            return INVALID_RESOURCE_GROUP_TAG_KEY;
        } else if ("INVALID_RESOURCE_GROUP_TAG_VALUE".equals(value)) {
            return INVALID_RESOURCE_GROUP_TAG_VALUE;
        } else if ("INVALID_ATTRIBUTE".equals(value)) {
            return INVALID_ATTRIBUTE;
        } else if ("INVALID_USER_ATTRIBUTE".equals(value)) {
            return INVALID_USER_ATTRIBUTE;
        } else if ("INVALID_USER_ATTRIBUTE_KEY".equals(value)) {
            return INVALID_USER_ATTRIBUTE_KEY;
        } else if ("INVALID_USER_ATTRIBUTE_VALUE".equals(value)) {
            return INVALID_USER_ATTRIBUTE_VALUE;
        } else if ("INVALID_PAGINATION_TOKEN".equals(value)) {
            return INVALID_PAGINATION_TOKEN;
        } else if ("INVALID_MAX_RESULTS".equals(value)) {
            return INVALID_MAX_RESULTS;
        } else if ("INVALID_AGENT_ID".equals(value)) {
            return INVALID_AGENT_ID;
        } else if ("INVALID_AUTO_SCALING_GROUP".equals(value)) {
            return INVALID_AUTO_SCALING_GROUP;
        } else if ("INVALID_RULE_NAME".equals(value)) {
            return INVALID_RULE_NAME;
        } else if ("INVALID_SEVERITY".equals(value)) {
            return INVALID_SEVERITY;
        } else if ("INVALID_LOCALE".equals(value)) {
            return INVALID_LOCALE;
        } else if ("INVALID_EVENT".equals(value)) {
            return INVALID_EVENT;
        } else if ("ASSESSMENT_TARGET_NAME_ALREADY_TAKEN".equals(value)) {
            return ASSESSMENT_TARGET_NAME_ALREADY_TAKEN;
        } else if ("ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN".equals(value)) {
            return ASSESSMENT_TEMPLATE_NAME_ALREADY_TAKEN;
        } else if ("INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_ASSESSMENT_TARGET_ARNS;
        } else if ("INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_ASSESSMENT_TEMPLATE_ARNS;
        } else if ("INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_ASSESSMENT_RUN_ARNS;
        } else if ("INVALID_NUMBER_OF_FINDING_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_FINDING_ARNS;
        } else if ("INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_RESOURCE_GROUP_ARNS;
        } else if ("INVALID_NUMBER_OF_RULES_PACKAGE_ARNS".equals(value)) {
            return INVALID_NUMBER_OF_RULES_PACKAGE_ARNS;
        } else if ("INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES".equals(value)) {
            return INVALID_NUMBER_OF_ASSESSMENT_RUN_STATES;
        } else if ("INVALID_NUMBER_OF_TAGS".equals(value)) {
            return INVALID_NUMBER_OF_TAGS;
        } else if ("INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS".equals(value)) {
            return INVALID_NUMBER_OF_RESOURCE_GROUP_TAGS;
        } else if ("INVALID_NUMBER_OF_ATTRIBUTES".equals(value)) {
            return INVALID_NUMBER_OF_ATTRIBUTES;
        } else if ("INVALID_NUMBER_OF_USER_ATTRIBUTES".equals(value)) {
            return INVALID_NUMBER_OF_USER_ATTRIBUTES;
        } else if ("INVALID_NUMBER_OF_AGENT_IDS".equals(value)) {
            return INVALID_NUMBER_OF_AGENT_IDS;
        } else if ("INVALID_NUMBER_OF_AUTO_SCALING_GROUPS".equals(value)) {
            return INVALID_NUMBER_OF_AUTO_SCALING_GROUPS;
        } else if ("INVALID_NUMBER_OF_RULE_NAMES".equals(value)) {
            return INVALID_NUMBER_OF_RULE_NAMES;
        } else if ("INVALID_NUMBER_OF_SEVERITIES".equals(value)) {
            return INVALID_NUMBER_OF_SEVERITIES;
        } else {
            throw new IllegalArgumentException("Cannot create enum from "
                    + value + " value!");
        }
    }
}