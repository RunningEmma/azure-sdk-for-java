/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A prediction and label pair of an example.
 */
public class LabeledUtterance {
    /**
     * ID of Labeled Utterance.
     */
    @JsonProperty(value = "id")
    private Integer id;

    /**
     * The utterance. E.g.: what's the weather like in seattle?.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * The utterance tokenized.
     */
    @JsonProperty(value = "tokenizedText")
    private List<String> tokenizedText;

    /**
     * The intent matching the example.
     */
    @JsonProperty(value = "intentLabel")
    private String intentLabel;

    /**
     * The entities matching the example.
     */
    @JsonProperty(value = "entityLabels")
    private List<EntityLabel> entityLabels;

    /**
     * List of suggested intents.
     */
    @JsonProperty(value = "intentPredictions")
    private List<IntentPrediction> intentPredictions;

    /**
     * List of suggested entities.
     */
    @JsonProperty(value = "entityPredictions")
    private List<EntityPrediction> entityPredictions;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public Integer id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the tokenizedText value.
     *
     * @return the tokenizedText value
     */
    public List<String> tokenizedText() {
        return this.tokenizedText;
    }

    /**
     * Set the tokenizedText value.
     *
     * @param tokenizedText the tokenizedText value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withTokenizedText(List<String> tokenizedText) {
        this.tokenizedText = tokenizedText;
        return this;
    }

    /**
     * Get the intentLabel value.
     *
     * @return the intentLabel value
     */
    public String intentLabel() {
        return this.intentLabel;
    }

    /**
     * Set the intentLabel value.
     *
     * @param intentLabel the intentLabel value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withIntentLabel(String intentLabel) {
        this.intentLabel = intentLabel;
        return this;
    }

    /**
     * Get the entityLabels value.
     *
     * @return the entityLabels value
     */
    public List<EntityLabel> entityLabels() {
        return this.entityLabels;
    }

    /**
     * Set the entityLabels value.
     *
     * @param entityLabels the entityLabels value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withEntityLabels(List<EntityLabel> entityLabels) {
        this.entityLabels = entityLabels;
        return this;
    }

    /**
     * Get the intentPredictions value.
     *
     * @return the intentPredictions value
     */
    public List<IntentPrediction> intentPredictions() {
        return this.intentPredictions;
    }

    /**
     * Set the intentPredictions value.
     *
     * @param intentPredictions the intentPredictions value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withIntentPredictions(List<IntentPrediction> intentPredictions) {
        this.intentPredictions = intentPredictions;
        return this;
    }

    /**
     * Get the entityPredictions value.
     *
     * @return the entityPredictions value
     */
    public List<EntityPrediction> entityPredictions() {
        return this.entityPredictions;
    }

    /**
     * Set the entityPredictions value.
     *
     * @param entityPredictions the entityPredictions value to set
     * @return the LabeledUtterance object itself.
     */
    public LabeledUtterance withEntityPredictions(List<EntityPrediction> entityPredictions) {
        this.entityPredictions = entityPredictions;
        return this;
    }

}
