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
 * The type File.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class File extends ODataBaseEntity {

    public File(){
        setODataType("#microsoft.graph.file");
    }

    private Hashes hashes;

    /**
    * Gets the hashes.
    *
    * @return the Hashes
    */
    public Hashes getHashes() {
        return this.hashes; 
    }

    /**
    * Sets the hashes.
    *
    * @param value the Hashes
    */
    public void setHashes(Hashes value) { 
        this.hashes = value;
        valueChanged("hashes", value);

    }

    private String mimeType;

    /**
    * Gets the mime Type.
    *
    * @return the String
    */
    public String getMimeType() {
        return this.mimeType; 
    }

    /**
    * Sets the mime Type.
    *
    * @param value the String
    */
    public void setMimeType(String value) { 
        this.mimeType = value;
        valueChanged("mimeType", value);

    }
}
