/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The set of changes to be made to a user account on a node.
 */
public class NodeUpdateUserParameter {
    /**
     * The password of the account.
     * The password is required for Windows nodes (those created with
     * 'cloudServiceConfiguration', or created with
     * 'virtualMachineConfiguration' using a Windows image reference). For
     * Linux compute nodes, the password can optionally be specified along with
     * the sshPublicKey property. If omitted, any existing password is removed.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * The time at which the account should expire.
     * If omitted, the default is 1 day from the current time. For Linux
     * compute nodes, the expiryTime has a precision up to a day.
     */
    @JsonProperty(value = "expiryTime")
    private DateTime expiryTime;

    /**
     * The SSH public key that can be used for remote login to the compute
     * node.
     * The public key should be compatible with OpenSSH encoding and should be
     * base 64 encoded. This property can be specified only for Linux nodes. If
     * this is specified for a Windows node, then the Batch service rejects the
     * request; if you are calling the REST API directly, the HTTP status code
     * is 400 (Bad Request). If omitted, any existing SSH public key is
     * removed.
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /**
     * Get the password is required for Windows nodes (those created with 'cloudServiceConfiguration', or created with 'virtualMachineConfiguration' using a Windows image reference). For Linux compute nodes, the password can optionally be specified along with the sshPublicKey property. If omitted, any existing password is removed.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password is required for Windows nodes (those created with 'cloudServiceConfiguration', or created with 'virtualMachineConfiguration' using a Windows image reference). For Linux compute nodes, the password can optionally be specified along with the sshPublicKey property. If omitted, any existing password is removed.
     *
     * @param password the password value to set
     * @return the NodeUpdateUserParameter object itself.
     */
    public NodeUpdateUserParameter withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get if omitted, the default is 1 day from the current time. For Linux compute nodes, the expiryTime has a precision up to a day.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set if omitted, the default is 1 day from the current time. For Linux compute nodes, the expiryTime has a precision up to a day.
     *
     * @param expiryTime the expiryTime value to set
     * @return the NodeUpdateUserParameter object itself.
     */
    public NodeUpdateUserParameter withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be specified only for Linux nodes. If this is specified for a Windows node, then the Batch service rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). If omitted, any existing SSH public key is removed.
     *
     * @return the sshPublicKey value
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the public key should be compatible with OpenSSH encoding and should be base 64 encoded. This property can be specified only for Linux nodes. If this is specified for a Windows node, then the Batch service rejects the request; if you are calling the REST API directly, the HTTP status code is 400 (Bad Request). If omitted, any existing SSH public key is removed.
     *
     * @param sshPublicKey the sshPublicKey value to set
     * @return the NodeUpdateUserParameter object itself.
     */
    public NodeUpdateUserParameter withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

}