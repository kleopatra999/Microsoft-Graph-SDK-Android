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
 * The type File System Info.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class FileSystemInfo extends ODataBaseEntity {

    public FileSystemInfo(){
        setODataType("#microsoft.graph.fileSystemInfo");
    }

    private java.util.Calendar createdDateTime;

    /**
    * Gets the created Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedDateTime() {
        return this.createdDateTime; 
    }

    /**
    * Sets the created Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedDateTime(java.util.Calendar value) { 
        this.createdDateTime = value;
        valueChanged("createdDateTime", value);

    }

    private java.util.Calendar lastModifiedDateTime;

    /**
    * Gets the last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.lastModifiedDateTime; 
    }

    /**
    * Sets the last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.lastModifiedDateTime = value;
        valueChanged("lastModifiedDateTime", value);

    }
}
