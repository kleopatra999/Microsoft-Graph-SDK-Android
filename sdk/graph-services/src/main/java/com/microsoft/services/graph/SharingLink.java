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
 * The type Sharing Link.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class SharingLink extends ODataBaseEntity {

    public SharingLink(){
        setODataType("#microsoft.graph.sharingLink");
    }

    private Identity application;

    /**
    * Gets the application.
    *
    * @return the Identity
    */
    public Identity getApplication() {
        return this.application; 
    }

    /**
    * Sets the application.
    *
    * @param value the Identity
    */
    public void setApplication(Identity value) { 
        this.application = value;
        valueChanged("application", value);

    }

    private String type;

    /**
    * Gets the type.
    *
    * @return the String
    */
    public String getType() {
        return this.type; 
    }

    /**
    * Sets the type.
    *
    * @param value the String
    */
    public void setType(String value) { 
        this.type = value;
        valueChanged("type", value);

    }

    private String webUrl;

    /**
    * Gets the web Url.
    *
    * @return the String
    */
    public String getWebUrl() {
        return this.webUrl; 
    }

    /**
    * Sets the web Url.
    *
    * @param value the String
    */
    public void setWebUrl(String value) { 
        this.webUrl = value;
        valueChanged("webUrl", value);

    }
}
