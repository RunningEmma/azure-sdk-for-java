/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.CacheContractInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing CacheContract.
 */
public interface CacheContract extends HasInner<CacheContractInner>, Indexable, Updatable<CacheContract.Update>, HasManager<ApiManagementManager> {
    /**
     * @return the connectionString value.
     */
    String connectionString();

    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the CacheContract definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithResourceGroupName, DefinitionStages.WithServiceName, DefinitionStages.WithIfMatch, DefinitionStages.WithConnectionString, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of CacheContract definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a CacheContract definition.
         */
        interface Blank extends WithResourceGroupName {
        }

        /**
         * The stage of the cachecontract definition allowing to specify ResourceGroupName.
         */
        interface WithResourceGroupName {
           /**
            * Specifies resourceGroupName.
            * @param resourceGroupName The name of the resource group
            * @return the next definition stage
            */
            WithServiceName withResourceGroupName(String resourceGroupName);
        }

        /**
         * The stage of the cachecontract definition allowing to specify ServiceName.
         */
        interface WithServiceName {
           /**
            * Specifies serviceName.
            * @param serviceName The name of the API Management service
            * @return the next definition stage
            */
            WithIfMatch withServiceName(String serviceName);
        }

        /**
         * The stage of the cachecontract definition allowing to specify IfMatch.
         */
        interface WithIfMatch {
           /**
            * Specifies ifMatch.
            * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
            * @return the next definition stage
            */
            WithConnectionString withIfMatch(String ifMatch);
        }

        /**
         * The stage of the cachecontract definition allowing to specify ConnectionString.
         */
        interface WithConnectionString {
           /**
            * Specifies connectionString.
            * @param connectionString Runtime connection string to cache
            * @return the next definition stage
            */
            WithCreate withConnectionString(String connectionString);
        }

        /**
         * The stage of the cachecontract definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Cache description
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the cachecontract definition allowing to specify ResourceId.
         */
        interface WithResourceId {
            /**
             * Specifies resourceId.
             * @param resourceId Original uri of entity in external system cache points to
             * @return the next definition stage
             */
            WithCreate withResourceId(String resourceId);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<CacheContract>, DefinitionStages.WithDescription, DefinitionStages.WithResourceId {
        }
    }
    /**
     * The template for a CacheContract update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<CacheContract>, UpdateStages.WithIfMatch, UpdateStages.WithDescription, UpdateStages.WithResourceId {
    }

    /**
     * Grouping of CacheContract update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the cachecontract update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the cachecontract update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description Cache description
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the cachecontract update allowing to specify ResourceId.
         */
        interface WithResourceId {
            /**
             * Specifies resourceId.
             * @param resourceId Original uri of entity in external system cache points to
             * @return the next update stage
             */
            Update withResourceId(String resourceId);
        }

    }
}
