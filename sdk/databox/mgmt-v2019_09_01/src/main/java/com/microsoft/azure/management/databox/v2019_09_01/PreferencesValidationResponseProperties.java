/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Properties of data center and transport preference validation response.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "validationType", defaultImpl = PreferencesValidationResponseProperties.class)
@JsonTypeName("ValidatePreferences")
public class PreferencesValidationResponseProperties extends ValidationInputResponse {
    /**
     * Validation status of requested data center and transport. Possible
     * values include: 'Valid', 'Invalid', 'Skipped'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ValidationStatus status;

    /**
     * Get validation status of requested data center and transport. Possible values include: 'Valid', 'Invalid', 'Skipped'.
     *
     * @return the status value
     */
    public ValidationStatus status() {
        return this.status;
    }

}
