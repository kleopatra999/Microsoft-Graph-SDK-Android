/*******************************************************************************
**NOTE** This code was generated by a tool and will occasionally be
overwritten. We welcome comments and issues regarding this code; they will be
addressed in the generation tool. If you wish to submit pull requests, please
do so for the templates in that tool.

This code was generated by Vipr (https://github.com/microsoft/vipr) using
the T4TemplateWriter (https://github.com/msopentech/vipr-t4templatewriter).

Copyright (c) Microsoft Open Technologies, Inc. All Rights Reserved.
Licensed under the Apache License 2.0; see LICENSE in the source repository
root for authoritative license information.﻿
******************************************************************************/
package com.microsoft.services.graph;





/**
 * The type Outlook Item.
*/
public class OutlookItem extends Entity {

    public OutlookItem(){
        setODataType("#microsoft.graph.outlookItem");
    }
            
    private java.util.Calendar CreatedDateTime;
     
    /**
    * Gets the Created Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getCreatedDateTime() {
        return this.CreatedDateTime; 
    }

    /**
    * Sets the Created Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setCreatedDateTime(java.util.Calendar value) { 
        this.CreatedDateTime = value; 
        valueChanged("CreatedDateTime", value);

    }
            
    private java.util.Calendar LastModifiedDateTime;
     
    /**
    * Gets the Last Modified Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getLastModifiedDateTime() {
        return this.LastModifiedDateTime; 
    }

    /**
    * Sets the Last Modified Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setLastModifiedDateTime(java.util.Calendar value) { 
        this.LastModifiedDateTime = value; 
        valueChanged("LastModifiedDateTime", value);

    }
            
    private String ChangeKey;
     
    /**
    * Gets the Change Key.
    *
    * @return the String
    */
    public String getChangeKey() {
        return this.ChangeKey; 
    }

    /**
    * Sets the Change Key.
    *
    * @param value the String
    */
    public void setChangeKey(String value) { 
        this.ChangeKey = value; 
        valueChanged("ChangeKey", value);

    }
    
        
    private java.util.List<String> Categories = null;
    
    
     
    /**
    * Gets the Categories.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getCategories() {
        return this.Categories; 
    }

    /**
    * Sets the Categories.
    *
    * @param value the java.util.List<String>
    */
    public void setCategories(java.util.List<String> value) { 
        this.Categories = value; 
        valueChanged("Categories", value);

    }
}

