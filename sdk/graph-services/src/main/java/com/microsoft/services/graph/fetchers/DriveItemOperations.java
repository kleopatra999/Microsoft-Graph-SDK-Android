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
package com.microsoft.services.graph.fetchers;

import com.microsoft.services.graph.*;
import com.google.common.util.concurrent.*;
import com.microsoft.services.orc.core.*;
import com.microsoft.services.orc.http.*;
import static com.microsoft.services.orc.core.Helpers.*;
import com.microsoft.services.orc.serialization.JsonSerializer;

/**
 * The type DriveItemOperations.
 */
public class DriveItemOperations extends EntityOperations {

     /**
      * Instantiates a new DriveItemOperations.
      *
      * @param urlComponent the url component
      * @param parent the parent
      */
    public DriveItemOperations(String urlComponent, OrcExecutable parent) {
            super(urlComponent, parent);
    }

    /**
     * Add parameter.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DriveItemOperations addParameter(String name, Object value) {
        addCustomParameter(name, value);
        return this;
    }

     /**
     * Add header.
     *
     * @param name the name
     * @param value the value
     * @return the operations
     */
    public DriveItemOperations addHeader(String name, String value) {
        addCustomHeader(name, value);
        return this;
    }

    
    
    /**
     * invite listenable future.
     * @param recipients the recipients @param message the message @param requireSignIn the requireSignIn @param sendInvitation the sendInvitation @param roles the roles 
     * @return the listenable future
     */         
    public ListenableFuture<Permission> invite(java.util.List<Recipients> recipients, String message, Boolean requireSignIn, Boolean sendInvitation, java.util.List<String> roles) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedrecipients = serializer.serialize(recipients);
		String serializedmessage = serializer.serialize(message);
		String serializedrequireSignIn = serializer.serialize(requireSignIn);
		String serializedsendInvitation = serializer.serialize(sendInvitation);
		String serializedroles = serializer.serialize(roles);
		  
        
		
		ListenableFuture<String> future = inviteRaw(serializedrecipients, serializedmessage, serializedrequireSignIn, serializedsendInvitation, serializedroles);
		return transformToEntityListenableFuture(future, Permission.class, getResolver());
        
    }

     /**
     * inviteRaw listenable future.
     * @param recipients the recipients @param message the message @param requireSignIn the requireSignIn @param sendInvitation the sendInvitation @param roles the roles 
     * @return the listenable future
     */ 
    public ListenableFuture<String> inviteRaw(String recipients, String message, String requireSignIn, String sendInvitation, String roles){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("recipients", recipients);
		map.put("message", message);
		map.put("requireSignIn", requireSignIn);
		map.put("sendInvitation", sendInvitation);
		map.put("roles", roles);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.invite");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * copy listenable future.
     * @param parentReference the parentReference @param name the name 
     * @return the listenable future
     */         
    public ListenableFuture<DriveItem> copy(ItemReference parentReference, String name) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedparentReference = serializer.serialize(parentReference);
		String serializedname = serializer.serialize(name);
		  
        
		
		ListenableFuture<String> future = copyRaw(serializedparentReference, serializedname);
		return transformToEntityListenableFuture(future, DriveItem.class, getResolver());
        
    }

     /**
     * copyRaw listenable future.
     * @param parentReference the parentReference @param name the name 
     * @return the listenable future
     */ 
    public ListenableFuture<String> copyRaw(String parentReference, String name){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("parentReference", parentReference);
		map.put("name", name);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.copy");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * createLink listenable future.
     * @param type the type 
     * @return the listenable future
     */         
    public ListenableFuture<Permission> createLink(String type) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializedtype = serializer.serialize(type);
		  
        
		
		ListenableFuture<String> future = createLinkRaw(serializedtype);
		return transformToEntityListenableFuture(future, Permission.class, getResolver());
        
    }

     /**
     * createLinkRaw listenable future.
     * @param type the type 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createLinkRaw(String type){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("type", type);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.createLink");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
    /**
     * createSession listenable future.
     * @param item the item 
     * @return the listenable future
     */         
    public ListenableFuture<UploadSession> createSession(ChunkedUploadSessionDescriptor item) { 
        
		JsonSerializer serializer = getResolver().getJsonSerializer();      
        
		String serializeditem = serializer.serialize(item);
		  
        
		
		ListenableFuture<String> future = createSessionRaw(serializeditem);
		return transformToEntityListenableFuture(future, UploadSession.class, getResolver());
        
    }

     /**
     * createSessionRaw listenable future.
     * @param item the item 
     * @return the listenable future
     */ 
    public ListenableFuture<String> createSessionRaw(String item){
        
        java.util.Map<String, String> map = new java.util.HashMap<String, String>();
        
        map.put("item", item);
		
        Request request = getResolver().createRequest();
        request.setVerb(HttpVerb.POST);
        
        request.setContent(getResolver().getJsonSerializer()
               .jsonObjectFromJsonMap(map).getBytes(Constants.UTF8));
                        
        request.getUrl().appendPathComponent("microsoft.graph.createSession");
        
        ListenableFuture<OrcResponse> future = oDataExecute(request);
        return transformToStringListenableFuture(future);
    }


    
    
     /**
     * allPhotos listenable future.
     * 
     * @return the listenable future
     */         
    public ListenableFuture<DriveItem> allPhotos() { 
		
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
        

		Request request = getResolver().createRequest();
		request.setVerb(HttpVerb.GET);
		String parameters = getFunctionParameters(map);
        
		        
		request.getUrl().appendPathComponent("microsoft.graph.allPhotos(" + parameters + ")");   
        
		
		ListenableFuture<OrcResponse> future = oDataExecute(request);
		   
        
		return transformToEntityListenableFuture(transformToStringListenableFuture(future), DriveItem.class, getResolver());
        
        
   }
    
    
    
     /**
     * search listenable future.
     * @param q the q 
     * @return the listenable future
     */         
    public ListenableFuture<DriveItem> search(String q) { 
		
		java.util.Map<String, Object> map = new java.util.HashMap<String, Object>();
        map.put("q", q);
		

		Request request = getResolver().createRequest();
		request.setVerb(HttpVerb.GET);
		String parameters = getFunctionParameters(map);
        
		        
		request.getUrl().appendPathComponent("microsoft.graph.search(" + parameters + ")");   
        
		
		ListenableFuture<OrcResponse> future = oDataExecute(request);
		   
        
		return transformToEntityListenableFuture(transformToStringListenableFuture(future), DriveItem.class, getResolver());
        
        
   }
    
}
