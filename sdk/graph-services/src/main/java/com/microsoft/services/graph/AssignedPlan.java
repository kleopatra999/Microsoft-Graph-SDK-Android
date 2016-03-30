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
 * The type Assigned Plan.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class AssignedPlan extends ODataBaseEntity {

    public AssignedPlan(){
        setODataType("#microsoft.graph.assignedPlan");
    }

    private java.util.Calendar assignedDateTime;

    /**
    * Gets the assigned Date Time.
    *
    * @return the java.util.Calendar
    */
    public java.util.Calendar getAssignedDateTime() {
        return this.assignedDateTime; 
    }

    /**
    * Sets the assigned Date Time.
    *
    * @param value the java.util.Calendar
    */
    public void setAssignedDateTime(java.util.Calendar value) { 
        this.assignedDateTime = value;
        valueChanged("assignedDateTime", value);

    }

    private String capabilityStatus;

    /**
    * Gets the capability Status.
    *
    * @return the String
    */
    public String getCapabilityStatus() {
        return this.capabilityStatus; 
    }

    /**
    * Sets the capability Status.
    *
    * @param value the String
    */
    public void setCapabilityStatus(String value) { 
        this.capabilityStatus = value;
        valueChanged("capabilityStatus", value);

    }

    private String service;

    /**
    * Gets the service.
    *
    * @return the String
    */
    public String getService() {
        return this.service; 
    }

    /**
    * Sets the service.
    *
    * @param value the String
    */
    public void setService(String value) { 
        this.service = value;
        valueChanged("service", value);

    }

    private java.util.UUID servicePlanId;

    /**
    * Gets the service Plan Id.
    *
    * @return the java.util.UUID
    */
    public java.util.UUID getServicePlanId() {
        return this.servicePlanId; 
    }

    /**
    * Sets the service Plan Id.
    *
    * @param value the java.util.UUID
    */
    public void setServicePlanId(java.util.UUID value) { 
        this.servicePlanId = value;
        valueChanged("servicePlanId", value);

    }
}
