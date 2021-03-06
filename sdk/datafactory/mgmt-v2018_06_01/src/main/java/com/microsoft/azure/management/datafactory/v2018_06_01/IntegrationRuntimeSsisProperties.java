/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSIS properties for managed integration runtime.
 */
public class IntegrationRuntimeSsisProperties {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Catalog information for managed dedicated integration runtime.
     */
    @JsonProperty(value = "catalogInfo")
    private IntegrationRuntimeSsisCatalogInfo catalogInfo;

    /**
     * License type for bringing your own license scenario. Possible values
     * include: 'BasePrice', 'LicenseIncluded'.
     */
    @JsonProperty(value = "licenseType")
    private IntegrationRuntimeLicenseType licenseType;

    /**
     * Custom setup script properties for a managed dedicated integration
     * runtime.
     */
    @JsonProperty(value = "customSetupScriptProperties")
    private IntegrationRuntimeCustomSetupScriptProperties customSetupScriptProperties;

    /**
     * Data proxy properties for a managed dedicated integration runtime.
     */
    @JsonProperty(value = "dataProxyProperties")
    private IntegrationRuntimeDataProxyProperties dataProxyProperties;

    /**
     * The edition for the SSIS Integration Runtime. Possible values include:
     * 'Standard', 'Enterprise'.
     */
    @JsonProperty(value = "edition")
    private IntegrationRuntimeEdition edition;

    /**
     * Custom setup without script properties for a SSIS integration runtime.
     */
    @JsonProperty(value = "expressCustomSetupProperties")
    private List<CustomSetupBase> expressCustomSetupProperties;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get catalog information for managed dedicated integration runtime.
     *
     * @return the catalogInfo value
     */
    public IntegrationRuntimeSsisCatalogInfo catalogInfo() {
        return this.catalogInfo;
    }

    /**
     * Set catalog information for managed dedicated integration runtime.
     *
     * @param catalogInfo the catalogInfo value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withCatalogInfo(IntegrationRuntimeSsisCatalogInfo catalogInfo) {
        this.catalogInfo = catalogInfo;
        return this;
    }

    /**
     * Get license type for bringing your own license scenario. Possible values include: 'BasePrice', 'LicenseIncluded'.
     *
     * @return the licenseType value
     */
    public IntegrationRuntimeLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set license type for bringing your own license scenario. Possible values include: 'BasePrice', 'LicenseIncluded'.
     *
     * @param licenseType the licenseType value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withLicenseType(IntegrationRuntimeLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get custom setup script properties for a managed dedicated integration runtime.
     *
     * @return the customSetupScriptProperties value
     */
    public IntegrationRuntimeCustomSetupScriptProperties customSetupScriptProperties() {
        return this.customSetupScriptProperties;
    }

    /**
     * Set custom setup script properties for a managed dedicated integration runtime.
     *
     * @param customSetupScriptProperties the customSetupScriptProperties value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withCustomSetupScriptProperties(IntegrationRuntimeCustomSetupScriptProperties customSetupScriptProperties) {
        this.customSetupScriptProperties = customSetupScriptProperties;
        return this;
    }

    /**
     * Get data proxy properties for a managed dedicated integration runtime.
     *
     * @return the dataProxyProperties value
     */
    public IntegrationRuntimeDataProxyProperties dataProxyProperties() {
        return this.dataProxyProperties;
    }

    /**
     * Set data proxy properties for a managed dedicated integration runtime.
     *
     * @param dataProxyProperties the dataProxyProperties value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withDataProxyProperties(IntegrationRuntimeDataProxyProperties dataProxyProperties) {
        this.dataProxyProperties = dataProxyProperties;
        return this;
    }

    /**
     * Get the edition for the SSIS Integration Runtime. Possible values include: 'Standard', 'Enterprise'.
     *
     * @return the edition value
     */
    public IntegrationRuntimeEdition edition() {
        return this.edition;
    }

    /**
     * Set the edition for the SSIS Integration Runtime. Possible values include: 'Standard', 'Enterprise'.
     *
     * @param edition the edition value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withEdition(IntegrationRuntimeEdition edition) {
        this.edition = edition;
        return this;
    }

    /**
     * Get custom setup without script properties for a SSIS integration runtime.
     *
     * @return the expressCustomSetupProperties value
     */
    public List<CustomSetupBase> expressCustomSetupProperties() {
        return this.expressCustomSetupProperties;
    }

    /**
     * Set custom setup without script properties for a SSIS integration runtime.
     *
     * @param expressCustomSetupProperties the expressCustomSetupProperties value to set
     * @return the IntegrationRuntimeSsisProperties object itself.
     */
    public IntegrationRuntimeSsisProperties withExpressCustomSetupProperties(List<CustomSetupBase> expressCustomSetupProperties) {
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        return this;
    }

}
