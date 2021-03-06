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
 * The type Password Profile.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class PasswordProfile extends ODataBaseEntity {

    public PasswordProfile(){
        setODataType("#microsoft.graph.passwordProfile");
    }

    private String password;

    /**
    * Gets the password.
    *
    * @return the String
    */
    public String getPassword() {
        return this.password; 
    }

    /**
    * Sets the password.
    *
    * @param value the String
    */
    public void setPassword(String value) { 
        this.password = value;
        valueChanged("password", value);

    }

    private Boolean forceChangePasswordNextSignIn;

    /**
    * Gets the force Change Password Next Sign In.
    *
    * @return the Boolean
    */
    public Boolean getForceChangePasswordNextSignIn() {
        return this.forceChangePasswordNextSignIn; 
    }

    /**
    * Sets the force Change Password Next Sign In.
    *
    * @param value the Boolean
    */
    public void setForceChangePasswordNextSignIn(Boolean value) { 
        this.forceChangePasswordNextSignIn = value;
        valueChanged("forceChangePasswordNextSignIn", value);

    }
}
