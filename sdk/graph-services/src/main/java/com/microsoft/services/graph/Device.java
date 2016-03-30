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





/**
 * The type Device.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class Device extends DirectoryObject {

    public Device(){
        setODataType("#microsoft.graph.device");
    }
            
    private Boolean accountEnabled;
     
    /**
    * Gets the account Enabled.
    *
    * @return the Boolean
    */
    public Boolean getAccountEnabled() {
        return this.accountEnabled; 
    }

    /**
    * Sets the account Enabled.
    *
    * @param value the Boolean
    */
    public void setAccountEnabled(Boolean value) { 
        this.accountEnabled = value; 
        valueChanged("accountEnabled", value);

    }
    
        
    private java.util.List<AlternativeSecurityId> alternativeSecurityIds = null;
    
    
     
    /**
    * Gets the alternative Security Ids.
    *
    * @return the java.util.List<AlternativeSecurityId>
    */
    public java.util.List<AlternativeSecurityId> getAlternativeSecurityIds() {
        return this.alternativeSecurityIds; 
    }

    /**
    * Sets the alternative Security Ids.
    *
    * @param value the java.util.List<AlternativeSecurityId>
    */
    public void setAlternativeSecurityIds(java.util.List<AlternativeSecurityId> value) { 
        this.alternativeSecurityIds = value; 
        valueChanged("alternativeSecurityIds", value);

    }
            
    private java.util.Calendar approximateLastSignInDateTime;
     
    /**
    * Gets the approximate Last Sign In Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getApproximateLastSignInDateTime() {
        return this.approximateLastSignInDateTime; 
    }

    /**
    * Sets the approximate Last Sign In Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setApproximateLastSignInDateTime(java.util.Calendar value) { 
        this.approximateLastSignInDateTime = value; 
        valueChanged("approximateLastSignInDateTime", value);

    }
            
    private String deviceId;
     
    /**
    * Gets the device Id.
    *
    * @return the String
    */
    public String getDeviceId() {
        return this.deviceId; 
    }

    /**
    * Sets the device Id.
    *
    * @param value the String
    */
    public void setDeviceId(String value) { 
        this.deviceId = value; 
        valueChanged("deviceId", value);

    }
            
    private String deviceMetadata;
     
    /**
    * Gets the device Metadata.
    *
    * @return the String
    */
    public String getDeviceMetadata() {
        return this.deviceMetadata; 
    }

    /**
    * Sets the device Metadata.
    *
    * @param value the String
    */
    public void setDeviceMetadata(String value) { 
        this.deviceMetadata = value; 
        valueChanged("deviceMetadata", value);

    }
            
    private Integer deviceVersion;
     
    /**
    * Gets the device Version.
    *
    * @return the Integer
    */
    public Integer getDeviceVersion() {
        return this.deviceVersion; 
    }

    /**
    * Sets the device Version.
    *
    * @param value the Integer
    */
    public void setDeviceVersion(Integer value) { 
        this.deviceVersion = value; 
        valueChanged("deviceVersion", value);

    }
            
    private String displayName;
     
    /**
    * Gets the display Name.
    *
    * @return the String
    */
    public String getDisplayName() {
        return this.displayName; 
    }

    /**
    * Sets the display Name.
    *
    * @param value the String
    */
    public void setDisplayName(String value) { 
        this.displayName = value; 
        valueChanged("displayName", value);

    }
            
    private Boolean isCompliant;
     
    /**
    * Gets the is Compliant.
    *
    * @return the Boolean
    */
    public Boolean getIsCompliant() {
        return this.isCompliant; 
    }

    /**
    * Sets the is Compliant.
    *
    * @param value the Boolean
    */
    public void setIsCompliant(Boolean value) { 
        this.isCompliant = value; 
        valueChanged("isCompliant", value);

    }
            
    private Boolean isManaged;
     
    /**
    * Gets the is Managed.
    *
    * @return the Boolean
    */
    public Boolean getIsManaged() {
        return this.isManaged; 
    }

    /**
    * Sets the is Managed.
    *
    * @param value the Boolean
    */
    public void setIsManaged(Boolean value) { 
        this.isManaged = value; 
        valueChanged("isManaged", value);

    }
            
    private java.util.Calendar onPremisesLastSyncDateTime;
     
    /**
    * Gets the on Premises Last Sync Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getOnPremisesLastSyncDateTime() {
        return this.onPremisesLastSyncDateTime; 
    }

    /**
    * Sets the on Premises Last Sync Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setOnPremisesLastSyncDateTime(java.util.Calendar value) { 
        this.onPremisesLastSyncDateTime = value; 
        valueChanged("onPremisesLastSyncDateTime", value);

    }
            
    private Boolean onPremisesSyncEnabled;
     
    /**
    * Gets the on Premises Sync Enabled.
    *
    * @return the Boolean
    */
    public Boolean getOnPremisesSyncEnabled() {
        return this.onPremisesSyncEnabled; 
    }

    /**
    * Sets the on Premises Sync Enabled.
    *
    * @param value the Boolean
    */
    public void setOnPremisesSyncEnabled(Boolean value) { 
        this.onPremisesSyncEnabled = value; 
        valueChanged("onPremisesSyncEnabled", value);

    }
            
    private String operatingSystem;
     
    /**
    * Gets the operating System.
    *
    * @return the String
    */
    public String getOperatingSystem() {
        return this.operatingSystem; 
    }

    /**
    * Sets the operating System.
    *
    * @param value the String
    */
    public void setOperatingSystem(String value) { 
        this.operatingSystem = value; 
        valueChanged("operatingSystem", value);

    }
            
    private String operatingSystemVersion;
     
    /**
    * Gets the operating System Version.
    *
    * @return the String
    */
    public String getOperatingSystemVersion() {
        return this.operatingSystemVersion; 
    }

    /**
    * Sets the operating System Version.
    *
    * @param value the String
    */
    public void setOperatingSystemVersion(String value) { 
        this.operatingSystemVersion = value; 
        valueChanged("operatingSystemVersion", value);

    }
    
        
    private java.util.List<String> physicalIds = null;
    
    
     
    /**
    * Gets the physical Ids.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getPhysicalIds() {
        return this.physicalIds; 
    }

    /**
    * Sets the physical Ids.
    *
    * @param value the java.util.List<String>
    */
    public void setPhysicalIds(java.util.List<String> value) { 
        this.physicalIds = value; 
        valueChanged("physicalIds", value);

    }
            
    private String trustType;
     
    /**
    * Gets the trust Type.
    *
    * @return the String
    */
    public String getTrustType() {
        return this.trustType; 
    }

    /**
    * Sets the trust Type.
    *
    * @param value the String
    */
    public void setTrustType(String value) { 
        this.trustType = value; 
        valueChanged("trustType", value);

    }
    
        
    private java.util.List<DirectoryObject> registeredOwners = null;
    
    
     
    /**
    * Gets the registered Owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getRegisteredOwners() {
        return this.registeredOwners; 
    }

    /**
    * Sets the registered Owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setRegisteredOwners(java.util.List<DirectoryObject> value) { 
        this.registeredOwners = value; 
        valueChanged("registeredOwners", value);

    }
    
        
    private java.util.List<DirectoryObject> registeredUsers = null;
    
    
     
    /**
    * Gets the registered Users.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getRegisteredUsers() {
        return this.registeredUsers; 
    }

    /**
    * Sets the registered Users.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setRegisteredUsers(java.util.List<DirectoryObject> value) { 
        this.registeredUsers = value; 
        valueChanged("registeredUsers", value);

    }
}

