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

import com.microsoft.services.orc.core.ODataBaseEntity;




/**
 * The type Image.
*/
public class Image extends ODataBaseEntity {

    public Image(){
        setODataType("#microsoft.graph.image");
    }

    private Integer height;

    /**
    * Gets the height.
    *
    * @return the Integer
    */
    public Integer getHeight() {
        return this.height; 
    }

    /**
    * Sets the height.
    *
    * @param value the Integer
    */
    public void setHeight(Integer value) { 
        this.height = value;
        valueChanged("height", value);

    }

    private Integer width;

    /**
    * Gets the width.
    *
    * @return the Integer
    */
    public Integer getWidth() {
        return this.width; 
    }

    /**
    * Sets the width.
    *
    * @param value the Integer
    */
    public void setWidth(Integer value) { 
        this.width = value;
        valueChanged("width", value);

    }
}
