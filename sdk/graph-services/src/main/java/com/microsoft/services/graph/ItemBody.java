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
package com.microsoft.services.graph;

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Item Body.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class ItemBody extends ODataBaseEntity {

    public ItemBody(){
        setODataType("#microsoft.graph.itemBody");
    }

    private BodyType contentType;

    /**
    * Gets the content Type.
    *
    * @return the BodyType
    */
    public BodyType getContentType() {
        return this.contentType; 
    }

    /**
    * Sets the content Type.
    *
    * @param value the BodyType
    */
    public void setContentType(BodyType value) { 
        this.contentType = value;
        valueChanged("contentType", value);

    }

    private String content;

    /**
    * Gets the content.
    *
    * @return the String
    */
    public String getContent() {
        return this.content; 
    }

    /**
    * Sets the content.
    *
    * @param value the String
    */
    public void setContent(String value) { 
        this.content = value;
        valueChanged("content", value);

    }
}
