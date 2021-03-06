/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Route table resource.
 */
@JsonFlatten
@SkipParentValidation
public class RouteTableInner extends Resource {
    /**
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "properties.routes")
    private List<RouteInner> routes;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /**
     * Whether to disable the routes learned by BGP on that route table. True
     * means disable.
     */
    @JsonProperty(value = "properties.disableBgpRoutePropagation")
    private Boolean disableBgpRoutePropagation;

    /**
     * The provisioning state of the route table resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get collection of routes contained within a route table.
     *
     * @return the routes value
     */
    public List<RouteInner> routes() {
        return this.routes;
    }

    /**
     * Set collection of routes contained within a route table.
     *
     * @param routes the routes value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutes(List<RouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get a collection of references to subnets.
     *
     * @return the subnets value
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get whether to disable the routes learned by BGP on that route table. True means disable.
     *
     * @return the disableBgpRoutePropagation value
     */
    public Boolean disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
    }

    /**
     * Set whether to disable the routes learned by BGP on that route table. True means disable.
     *
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        return this;
    }

    /**
     * Get the provisioning state of the route table resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
        this.id = id;
        return this;
    }

}
