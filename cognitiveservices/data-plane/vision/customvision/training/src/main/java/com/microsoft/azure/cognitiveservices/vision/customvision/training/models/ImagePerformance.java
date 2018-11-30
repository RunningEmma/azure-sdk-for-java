/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import java.util.List;
import java.util.UUID;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image performance model.
 */
public class ImagePerformance {
    /**
     * The predictions property.
     */
    @JsonProperty(value = "predictions", access = JsonProperty.Access.WRITE_ONLY)
    private List<Prediction> predictions;

    /**
     * The id property.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private UUID id;

    /**
     * The created property.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime created;

    /**
     * The width property.
     */
    @JsonProperty(value = "width", access = JsonProperty.Access.WRITE_ONLY)
    private int width;

    /**
     * The height property.
     */
    @JsonProperty(value = "height", access = JsonProperty.Access.WRITE_ONLY)
    private int height;

    /**
     * The imageUri property.
     */
    @JsonProperty(value = "imageUri", access = JsonProperty.Access.WRITE_ONLY)
    private String imageUri;

    /**
     * The thumbnailUri property.
     */
    @JsonProperty(value = "thumbnailUri", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbnailUri;

    /**
     * The tags property.
     */
    @JsonProperty(value = "tags", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageTag> tags;

    /**
     * The regions property.
     */
    @JsonProperty(value = "regions", access = JsonProperty.Access.WRITE_ONLY)
    private List<ImageRegion> regions;

    /**
     * Get the predictions value.
     *
     * @return the predictions value
     */
    public List<Prediction> predictions() {
        return this.predictions;
    }

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public UUID id() {
        return this.id;
    }

    /**
     * Get the created value.
     *
     * @return the created value
     */
    public DateTime created() {
        return this.created;
    }

    /**
     * Get the width value.
     *
     * @return the width value
     */
    public int width() {
        return this.width;
    }

    /**
     * Get the height value.
     *
     * @return the height value
     */
    public int height() {
        return this.height;
    }

    /**
     * Get the imageUri value.
     *
     * @return the imageUri value
     */
    public String imageUri() {
        return this.imageUri;
    }

    /**
     * Get the thumbnailUri value.
     *
     * @return the thumbnailUri value
     */
    public String thumbnailUri() {
        return this.thumbnailUri;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<ImageTag> tags() {
        return this.tags;
    }

    /**
     * Get the regions value.
     *
     * @return the regions value
     */
    public List<ImageRegion> regions() {
        return this.regions;
    }

}