/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstanceKey;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ServerKeyType;
import org.joda.time.DateTime;

class ManagedInstanceKeyImpl extends CreatableUpdatableImpl<ManagedInstanceKey, ManagedInstanceKeyInner, ManagedInstanceKeyImpl> implements ManagedInstanceKey, ManagedInstanceKey.Definition, ManagedInstanceKey.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String managedInstanceName;
    private String keyName;

    ManagedInstanceKeyImpl(String name, SqlManager manager) {
        super(name, new ManagedInstanceKeyInner());
        this.manager = manager;
        // Set resource name
        this.keyName = name;
        //
    }

    ManagedInstanceKeyImpl(ManagedInstanceKeyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.keyName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.managedInstanceName = IdParsingUtils.getValueFromIdByName(inner.id(), "managedInstances");
        this.keyName = IdParsingUtils.getValueFromIdByName(inner.id(), "keys");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ManagedInstanceKey> createResourceAsync() {
        ManagedInstanceKeysInner client = this.manager().inner().managedInstanceKeys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ManagedInstanceKey> updateResourceAsync() {
        ManagedInstanceKeysInner client = this.manager().inner().managedInstanceKeys();
        return client.createOrUpdateAsync(this.resourceGroupName, this.managedInstanceName, this.keyName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ManagedInstanceKeyInner> getInnerAsync() {
        ManagedInstanceKeysInner client = this.manager().inner().managedInstanceKeys();
        return client.getAsync(this.resourceGroupName, this.managedInstanceName, this.keyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public ServerKeyType serverKeyType() {
        return this.inner().serverKeyType();
    }

    @Override
    public String thumbprint() {
        return this.inner().thumbprint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uri() {
        return this.inner().uri();
    }

    @Override
    public ManagedInstanceKeyImpl withExistingManagedInstance(String resourceGroupName, String managedInstanceName) {
        this.resourceGroupName = resourceGroupName;
        this.managedInstanceName = managedInstanceName;
        return this;
    }

    @Override
    public ManagedInstanceKeyImpl withServerKeyType(ServerKeyType serverKeyType) {
        this.inner().withServerKeyType(serverKeyType);
        return this;
    }

    @Override
    public ManagedInstanceKeyImpl withUri(String uri) {
        this.inner().withUri(uri);
        return this;
    }

}
