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
 * The type Drive.
*/
public class Drive extends Entity {

    public Drive(){
        setODataType("#microsoft.graph.drive");
    }
            
    private String driveType;
     
    /**
    * Gets the drive Type.
    *
    * @return the String
    */
    public String getDriveType() {
        return this.driveType; 
    }

    /**
    * Sets the drive Type.
    *
    * @param value the String
    */
    public void setDriveType(String value) { 
        this.driveType = value; 
        valueChanged("driveType", value);

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
            
    private Quota quota;
     
    /**
    * Gets the quota.
    *
    * @return the Quota
    */
    public Quota getQuota() {
        return this.quota; 
    }

    /**
    * Sets the quota.
    *
    * @param value the Quota
    */
    public void setQuota(Quota value) { 
        this.quota = value; 
        valueChanged("quota", value);

    }
    
        
    private java.util.List<DriveItem> items = null;
    
    
     
    /**
    * Gets the items.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getItems() {
        return this.items; 
    }

    /**
    * Sets the items.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setItems(java.util.List<DriveItem> value) { 
        this.items = value; 
        valueChanged("items", value);

    }
    
        
    private java.util.List<DriveItem> shared = null;
    
    
     
    /**
    * Gets the shared.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getShared() {
        return this.shared; 
    }

    /**
    * Sets the shared.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setShared(java.util.List<DriveItem> value) { 
        this.shared = value; 
        valueChanged("shared", value);

    }
    
        
    private java.util.List<DriveItem> special = null;
    
    
     
    /**
    * Gets the special.
    *
    * @return the java.util.List<DriveItem>
    */
    public java.util.List<DriveItem> getSpecial() {
        return this.special; 
    }

    /**
    * Sets the special.
    *
    * @param value the java.util.List<DriveItem>
    */
    public void setSpecial(java.util.List<DriveItem> value) { 
        this.special = value; 
        valueChanged("special", value);

    }
            
    private DriveItem root;
     
    /**
    * Gets the root.
    *
    * @return the DriveItem
    */
    public DriveItem getRoot() {
        return this.root; 
    }

    /**
    * Sets the root.
    *
    * @param value the DriveItem
    */
    public void setRoot(DriveItem value) { 
        this.root = value; 
        valueChanged("root", value);

    }
}

