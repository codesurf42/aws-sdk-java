/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.inspector.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.inspector.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * AssessmentRun JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentRunJsonUnmarshaller implements Unmarshaller<AssessmentRun, JsonUnmarshallerContext> {

    public AssessmentRun unmarshall(JsonUnmarshallerContext context) throws Exception {
        AssessmentRun assessmentRun = new AssessmentRun();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("arn", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("name", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("assessmentTemplateArn", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setAssessmentTemplateArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("state", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setState(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("durationInSeconds", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setDurationInSeconds(context.getUnmarshaller(Integer.class).unmarshall(context));
                }
                if (context.testExpression("rulesPackageArns", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setRulesPackageArns(new ListUnmarshaller<String>(context.getUnmarshaller(String.class)).unmarshall(context));
                }
                if (context.testExpression("userAttributesForFindings", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setUserAttributesForFindings(new ListUnmarshaller<Attribute>(AttributeJsonUnmarshaller.getInstance()).unmarshall(context));
                }
                if (context.testExpression("createdAt", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setCreatedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("startedAt", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setStartedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("completedAt", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setCompletedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("stateChangedAt", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setStateChangedAt(context.getUnmarshaller(java.util.Date.class).unmarshall(context));
                }
                if (context.testExpression("dataCollected", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setDataCollected(context.getUnmarshaller(Boolean.class).unmarshall(context));
                }
                if (context.testExpression("stateChanges", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setStateChanges(new ListUnmarshaller<AssessmentRunStateChange>(AssessmentRunStateChangeJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
                if (context.testExpression("notifications", targetDepth)) {
                    context.nextToken();
                    assessmentRun.setNotifications(new ListUnmarshaller<AssessmentRunNotification>(AssessmentRunNotificationJsonUnmarshaller.getInstance())
                            .unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return assessmentRun;
    }

    private static AssessmentRunJsonUnmarshaller instance;

    public static AssessmentRunJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AssessmentRunJsonUnmarshaller();
        return instance;
    }
}
