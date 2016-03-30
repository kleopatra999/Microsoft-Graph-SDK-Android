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
 * The type  ItemAttachment
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class ItemAttachmentFetcher extends OrcEntityFetcher<ItemAttachment,ItemAttachmentOperations> 
                                     implements Readable<ItemAttachment> {

     /**
     * Instantiates a new ItemAttachmentFetcher.
     *
     * @param urlComponent the url component
     * @param parent the parent
     */
     public ItemAttachmentFetcher(String urlComponent, OrcExecutable parent) {
        super(urlComponent, parent, ItemAttachment.class, ItemAttachmentOperations.class);
    }

     /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the fetcher
     */
    public ItemAttachmentFetcher addParameter(String name, Object value) {
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
    public ItemAttachmentFetcher addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
         /**
     * Gets item.
     *
     * @return the item
     */
    public OutlookItemFetcher getItem() {
        return new OutlookItemFetcher("item", this);
    }

}
