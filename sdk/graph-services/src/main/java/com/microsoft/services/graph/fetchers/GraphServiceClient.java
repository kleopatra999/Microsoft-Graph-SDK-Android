
/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Corporation. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/

package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.DependencyResolver;

/**
 * The type GraphServiceClient.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class GraphServiceClient extends BaseOrcContainer {

     /**
     * Instantiates a new GraphServiceClient.
     *
     * @param url the url
     * @param resolver the resolver
     */
    public GraphServiceClient(String url, DependencyResolver resolver) {
        super(url, resolver);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the client
     */
    public GraphServiceClient addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

     /**
     * Gets DirectoryObject.
     *
     * @return the DirectoryObject
     */
    public OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations> getDirectoryObjects() {
        return new OrcCollectionFetcher<DirectoryObject, DirectoryObjectFetcher, DirectoryObjectCollectionOperations>("directoryObjects", this, DirectoryObject.class,DirectoryObjectCollectionOperations.class);
    }
     /**
     * Gets Device.
     *
     * @return the Device
     */
    public OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations> getDevices() {
        return new OrcCollectionFetcher<Device, DeviceFetcher, DeviceCollectionOperations>("devices", this, Device.class,DeviceCollectionOperations.class);
    }
     /**
     * Gets Group.
     *
     * @return the Group
     */
    public OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations> getGroups() {
        return new OrcCollectionFetcher<Group, GroupFetcher, GroupCollectionOperations>("groups", this, Group.class,GroupCollectionOperations.class);
    }
     /**
     * Gets DirectoryRole.
     *
     * @return the DirectoryRole
     */
    public OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations> getDirectoryRoles() {
        return new OrcCollectionFetcher<DirectoryRole, DirectoryRoleFetcher, DirectoryRoleCollectionOperations>("directoryRoles", this, DirectoryRole.class,DirectoryRoleCollectionOperations.class);
    }
     /**
     * Gets DirectoryRoleTemplate.
     *
     * @return the DirectoryRoleTemplate
     */
    public OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations> getDirectoryRoleTemplates() {
        return new OrcCollectionFetcher<DirectoryRoleTemplate, DirectoryRoleTemplateFetcher, DirectoryRoleTemplateCollectionOperations>("directoryRoleTemplates", this, DirectoryRoleTemplate.class,DirectoryRoleTemplateCollectionOperations.class);
    }
     /**
     * Gets Organization.
     *
     * @return the Organization
     */
    public OrcCollectionFetcher<Organization, OrganizationFetcher, OrganizationCollectionOperations> getOrganization() {
        return new OrcCollectionFetcher<Organization, OrganizationFetcher, OrganizationCollectionOperations>("organization", this, Organization.class,OrganizationCollectionOperations.class);
    }
     /**
     * Gets SubscribedSku.
     *
     * @return the SubscribedSku
     */
    public OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations> getSubscribedSkus() {
        return new OrcCollectionFetcher<SubscribedSku, SubscribedSkuFetcher, SubscribedSkuCollectionOperations>("subscribedSkus", this, SubscribedSku.class,SubscribedSkuCollectionOperations.class);
    }
     /**
     * Gets User.
     *
     * @return the User
     */
    public OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations> getUsers() {
        return new OrcCollectionFetcher<User, UserFetcher, UserCollectionOperations>("users", this, User.class,UserCollectionOperations.class);
    }
     /**
     * Gets Drive.
     *
     * @return the Drive
     */
    public OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations> getDrives() {
        return new OrcCollectionFetcher<Drive, DriveFetcher, DriveCollectionOperations>("drives", this, Drive.class,DriveCollectionOperations.class);
    }
     /**
     * Gets me.
     *
     * @return the me
     */
    public UserFetcher getMe() {
        return new UserFetcher("me", this);
    }
     /**
     * Gets drive.
     *
     * @return the drive
     */
    public DriveFetcher getDrive() {
        return new DriveFetcher("drive", this);
    }
}