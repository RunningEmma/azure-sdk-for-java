/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of a lab's support banner.
 */
public class LabSupportProperties {
    /**
     * Is the lab support banner active/enabled at this time?. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "enabled")
    private EnableStatus enabled;

    /**
     * The markdown text (if any) that this lab displays in the UI. If left
     * empty/null, nothing will be shown.
     */
    @JsonProperty(value = "markdown")
    private String markdown;

    /**
     * Get is the lab support banner active/enabled at this time?. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the enabled value
     */
    public EnableStatus enabled() {
        return this.enabled;
    }

    /**
     * Set is the lab support banner active/enabled at this time?. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param enabled the enabled value to set
     * @return the LabSupportProperties object itself.
     */
    public LabSupportProperties withEnabled(EnableStatus enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     *
     * @return the markdown value
     */
    public String markdown() {
        return this.markdown;
    }

    /**
     * Set the markdown text (if any) that this lab displays in the UI. If left empty/null, nothing will be shown.
     *
     * @param markdown the markdown value to set
     * @return the LabSupportProperties object itself.
     */
    public LabSupportProperties withMarkdown(String markdown) {
        this.markdown = markdown;
        return this;
    }

}
