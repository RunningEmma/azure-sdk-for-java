/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for SubtaskState.
 */
public enum SubtaskState {
    /** The task has been assigned to a compute node, but is waiting for a required Job Preparation task to complete on the node. If the Job Preparation task succeeds, the task will move to running. If the Job Preparation task fails, the task will return to active and will be eligible to be assigned to a different node. */
    PREPARING("preparing"),

    /** The task is running on a compute node. This includes task-level preparation such as downloading resource files or deploying application packages specified on the task - it does not necessarily mean that the task command line has started executing. */
    RUNNING("running"),

    /** The task is no longer eligible to run, usually because the task has finished successfully, or the task has finished unsuccessfully and has exhausted its retry limit. A task is also marked as completed if an error occurred launching the task, or when the task has been terminated. */
    COMPLETED("completed");

    /** The actual serialized value for a SubtaskState instance. */
    private String value;

    SubtaskState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SubtaskState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SubtaskState object, or null if unable to parse.
     */
    @JsonCreator
    public static SubtaskState fromString(String value) {
        SubtaskState[] items = SubtaskState.values();
        for (SubtaskState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}