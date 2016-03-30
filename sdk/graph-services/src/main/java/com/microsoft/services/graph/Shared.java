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
 * The type Shared.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class Shared extends ODataBaseEntity {

    public Shared(){
        setODataType("#microsoft.graph.shared");
    }

    private IdentitySet owner;

    /**
    * Gets the owner.
    *
    * @return the IdentitySet
    */
    public IdentitySet getOwner() {
        return this.owner; 
    }

    /**
    * Sets the owner.
    *
    * @param value the IdentitySet
    */
    public void setOwner(IdentitySet value) { 
        this.owner = value;
        valueChanged("owner", value);

    }

    private String scope;

    /**
    * Gets the scope.
    *
    * @return the String
    */
    public String getScope() {
        return this.scope; 
    }

    /**
    * Sets the scope.
    *
    * @param value the String
    */
    public void setScope(String value) { 
        this.scope = value;
        valueChanged("scope", value);

    }
}
