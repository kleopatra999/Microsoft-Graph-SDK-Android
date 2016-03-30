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
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.core.Readable;

/**
 * The type  Entity
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class EntityFetcher extends OrcEntityFetcher<Entity,EntityOperations> 
                                     implements Readable<Entity> {

     /**
     * Instantiates a new EntityFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public EntityFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, Entity.class, EntityOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public EntityFetcher addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }
	
	/**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public EntityFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    public DirectoryObjectFetcher asDirectoryObject(){
        return new DirectoryObjectFetcher(this.urlComponent, this.parent);
    }   

    public ConversationThreadFetcher asConversationThread(){
        return new ConversationThreadFetcher(this.urlComponent, this.parent);
    }   

    public CalendarFetcher asCalendar(){
        return new CalendarFetcher(this.urlComponent, this.parent);
    }   

    public OutlookItemFetcher asOutlookItem(){
        return new OutlookItemFetcher(this.urlComponent, this.parent);
    }   

    public ConversationFetcher asConversation(){
        return new ConversationFetcher(this.urlComponent, this.parent);
    }   

    public ProfilePhotoFetcher asProfilePhoto(){
        return new ProfilePhotoFetcher(this.urlComponent, this.parent);
    }   

    public DriveFetcher asDrive(){
        return new DriveFetcher(this.urlComponent, this.parent);
    }   

    public SubscribedSkuFetcher asSubscribedSku(){
        return new SubscribedSkuFetcher(this.urlComponent, this.parent);
    }   

    public MailFolderFetcher asMailFolder(){
        return new MailFolderFetcher(this.urlComponent, this.parent);
    }   

    public CalendarGroupFetcher asCalendarGroup(){
        return new CalendarGroupFetcher(this.urlComponent, this.parent);
    }   

    public ContactFolderFetcher asContactFolder(){
        return new ContactFolderFetcher(this.urlComponent, this.parent);
    }   

    public AttachmentFetcher asAttachment(){
        return new AttachmentFetcher(this.urlComponent, this.parent);
    }   

    public DriveItemFetcher asDriveItem(){
        return new DriveItemFetcher(this.urlComponent, this.parent);
    }   

    public PermissionFetcher asPermission(){
        return new PermissionFetcher(this.urlComponent, this.parent);
    }   

    public ThumbnailSetFetcher asThumbnailSet(){
        return new ThumbnailSetFetcher(this.urlComponent, this.parent);
    }   

    
    
}
