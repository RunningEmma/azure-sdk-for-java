/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The target of the event.
 */
public class ContainerRegistryArtifactEventTarget {
    /**
     * The MIME type of the artifact.
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /**
     * The size in bytes of the artifact.
     */
    @JsonProperty(value = "size")
    private Long size;

    /**
     * The digest of the artifact.
     */
    @JsonProperty(value = "digest")
    private String digest;

    /**
     * The repository name of the artifact.
     */
    @JsonProperty(value = "repository")
    private String repository;

    /**
     * The tag of the artifact.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * The name of the artifact.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The version of the artifact.
     */
    @JsonProperty(value = "version")
    private String version;

    /**
     * Get the MIME type of the artifact.
     *
     * @return the mediaType value
     */
    public String mediaType() {
        return this.mediaType;
    }

    /**
     * Set the MIME type of the artifact.
     *
     * @param mediaType the mediaType value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the size in bytes of the artifact.
     *
     * @return the size value
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size in bytes of the artifact.
     *
     * @param size the size value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the digest of the artifact.
     *
     * @return the digest value
     */
    public String digest() {
        return this.digest;
    }

    /**
     * Set the digest of the artifact.
     *
     * @param digest the digest value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withDigest(String digest) {
        this.digest = digest;
        return this;
    }

    /**
     * Get the repository name of the artifact.
     *
     * @return the repository value
     */
    public String repository() {
        return this.repository;
    }

    /**
     * Set the repository name of the artifact.
     *
     * @param repository the repository value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withRepository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get the tag of the artifact.
     *
     * @return the tag value
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the tag of the artifact.
     *
     * @param tag the tag value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the name of the artifact.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the artifact.
     *
     * @param name the name value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the version of the artifact.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version of the artifact.
     *
     * @param version the version value to set
     * @return the ContainerRegistryArtifactEventTarget object itself.
     */
    public ContainerRegistryArtifactEventTarget withVersion(String version) {
        this.version = version;
        return this;
    }

}
