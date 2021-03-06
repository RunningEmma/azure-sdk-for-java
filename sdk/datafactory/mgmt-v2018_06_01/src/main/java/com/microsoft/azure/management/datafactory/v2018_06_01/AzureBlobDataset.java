/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactory.v2018_06_01.implementation.DatasetInner;

/**
 * The Azure Blob storage.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = AzureBlobDataset.class)
@JsonTypeName("AzureBlob")
@JsonFlatten
public class AzureBlobDataset extends DatasetInner {
    /**
     * The path of the Azure Blob storage. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.folderPath")
    private Object folderPath;

    /**
     * The root of blob path. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tableRootLocation")
    private Object tableRootLocation;

    /**
     * The name of the Azure Blob. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.fileName")
    private Object fileName;

    /**
     * The start of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeStart")
    private Object modifiedDatetimeStart;

    /**
     * The end of Azure Blob's modified datetime. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "typeProperties.modifiedDatetimeEnd")
    private Object modifiedDatetimeEnd;

    /**
     * The format of the Azure Blob storage.
     */
    @JsonProperty(value = "typeProperties.format")
    private DatasetStorageFormat format;

    /**
     * The data compression method used for the blob storage.
     */
    @JsonProperty(value = "typeProperties.compression")
    private DatasetCompression compression;

    /**
     * Get the path of the Azure Blob storage. Type: string (or Expression with resultType string).
     *
     * @return the folderPath value
     */
    public Object folderPath() {
        return this.folderPath;
    }

    /**
     * Set the path of the Azure Blob storage. Type: string (or Expression with resultType string).
     *
     * @param folderPath the folderPath value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFolderPath(Object folderPath) {
        this.folderPath = folderPath;
        return this;
    }

    /**
     * Get the root of blob path. Type: string (or Expression with resultType string).
     *
     * @return the tableRootLocation value
     */
    public Object tableRootLocation() {
        return this.tableRootLocation;
    }

    /**
     * Set the root of blob path. Type: string (or Expression with resultType string).
     *
     * @param tableRootLocation the tableRootLocation value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withTableRootLocation(Object tableRootLocation) {
        this.tableRootLocation = tableRootLocation;
        return this;
    }

    /**
     * Get the name of the Azure Blob. Type: string (or Expression with resultType string).
     *
     * @return the fileName value
     */
    public Object fileName() {
        return this.fileName;
    }

    /**
     * Set the name of the Azure Blob. Type: string (or Expression with resultType string).
     *
     * @param fileName the fileName value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFileName(Object fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * Get the start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     *
     * @return the modifiedDatetimeStart value
     */
    public Object modifiedDatetimeStart() {
        return this.modifiedDatetimeStart;
    }

    /**
     * Set the start of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     *
     * @param modifiedDatetimeStart the modifiedDatetimeStart value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withModifiedDatetimeStart(Object modifiedDatetimeStart) {
        this.modifiedDatetimeStart = modifiedDatetimeStart;
        return this;
    }

    /**
     * Get the end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     *
     * @return the modifiedDatetimeEnd value
     */
    public Object modifiedDatetimeEnd() {
        return this.modifiedDatetimeEnd;
    }

    /**
     * Set the end of Azure Blob's modified datetime. Type: string (or Expression with resultType string).
     *
     * @param modifiedDatetimeEnd the modifiedDatetimeEnd value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withModifiedDatetimeEnd(Object modifiedDatetimeEnd) {
        this.modifiedDatetimeEnd = modifiedDatetimeEnd;
        return this;
    }

    /**
     * Get the format of the Azure Blob storage.
     *
     * @return the format value
     */
    public DatasetStorageFormat format() {
        return this.format;
    }

    /**
     * Set the format of the Azure Blob storage.
     *
     * @param format the format value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withFormat(DatasetStorageFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the data compression method used for the blob storage.
     *
     * @return the compression value
     */
    public DatasetCompression compression() {
        return this.compression;
    }

    /**
     * Set the data compression method used for the blob storage.
     *
     * @param compression the compression value to set
     * @return the AzureBlobDataset object itself.
     */
    public AzureBlobDataset withCompression(DatasetCompression compression) {
        this.compression = compression;
        return this;
    }

}
