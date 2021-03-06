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
 * The type Group.
* @deprecated This SDK is deprecated. Please review the README for further information (https://github.com/OfficeDev/Microsoft-Graph-SDK-Android).
 */
@Deprecated
public class Group extends DirectoryObject {

    public Group(){
        setODataType("#microsoft.graph.group");
    }
            
    private String description;
     
    /**
    * Gets the description.
    *
    * @return the String
    */
    public String getDescription() {
        return this.description; 
    }

    /**
    * Sets the description.
    *
    * @param value the String
    */
    public void setDescription(String value) { 
        this.description = value; 
        valueChanged("description", value);

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
    
        
    private java.util.List<String> groupTypes = null;
    
    
     
    /**
    * Gets the group Types.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getGroupTypes() {
        return this.groupTypes; 
    }

    /**
    * Sets the group Types.
    *
    * @param value the java.util.List<String>
    */
    public void setGroupTypes(java.util.List<String> value) { 
        this.groupTypes = value; 
        valueChanged("groupTypes", value);

    }
            
    private String mail;
     
    /**
    * Gets the mail.
    *
    * @return the String
    */
    public String getMail() {
        return this.mail; 
    }

    /**
    * Sets the mail.
    *
    * @param value the String
    */
    public void setMail(String value) { 
        this.mail = value; 
        valueChanged("mail", value);

    }
            
    private Boolean mailEnabled;
     
    /**
    * Gets the mail Enabled.
    *
    * @return the Boolean
    */
    public Boolean getMailEnabled() {
        return this.mailEnabled; 
    }

    /**
    * Sets the mail Enabled.
    *
    * @param value the Boolean
    */
    public void setMailEnabled(Boolean value) { 
        this.mailEnabled = value; 
        valueChanged("mailEnabled", value);

    }
            
    private String mailNickname;
     
    /**
    * Gets the mail Nickname.
    *
    * @return the String
    */
    public String getMailNickname() {
        return this.mailNickname; 
    }

    /**
    * Sets the mail Nickname.
    *
    * @param value the String
    */
    public void setMailNickname(String value) { 
        this.mailNickname = value; 
        valueChanged("mailNickname", value);

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
            
    private String onPremisesSecurityIdentifier;
     
    /**
    * Gets the on Premises Security Identifier.
    *
    * @return the String
    */
    public String getOnPremisesSecurityIdentifier() {
        return this.onPremisesSecurityIdentifier; 
    }

    /**
    * Sets the on Premises Security Identifier.
    *
    * @param value the String
    */
    public void setOnPremisesSecurityIdentifier(String value) { 
        this.onPremisesSecurityIdentifier = value; 
        valueChanged("onPremisesSecurityIdentifier", value);

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
    
        
    private java.util.List<String> proxyAddresses = null;
    
    
     
    /**
    * Gets the proxy Addresses.
    *
    * @return the java.util.List<String>
    */
    public java.util.List<String> getProxyAddresses() {
        return this.proxyAddresses; 
    }

    /**
    * Sets the proxy Addresses.
    *
    * @param value the java.util.List<String>
    */
    public void setProxyAddresses(java.util.List<String> value) { 
        this.proxyAddresses = value; 
        valueChanged("proxyAddresses", value);

    }
            
    private Boolean securityEnabled;
     
    /**
    * Gets the security Enabled.
    *
    * @return the Boolean
    */
    public Boolean getSecurityEnabled() {
        return this.securityEnabled; 
    }

    /**
    * Sets the security Enabled.
    *
    * @param value the Boolean
    */
    public void setSecurityEnabled(Boolean value) { 
        this.securityEnabled = value; 
        valueChanged("securityEnabled", value);

    }
            
    private String visibility;
     
    /**
    * Gets the visibility.
    *
    * @return the String
    */
    public String getVisibility() {
        return this.visibility; 
    }

    /**
    * Sets the visibility.
    *
    * @param value the String
    */
    public void setVisibility(String value) { 
        this.visibility = value; 
        valueChanged("visibility", value);

    }
            
    private Boolean allowExternalSenders;
     
    /**
    * Gets the allow External Senders.
    *
    * @return the Boolean
    */
    public Boolean getAllowExternalSenders() {
        return this.allowExternalSenders; 
    }

    /**
    * Sets the allow External Senders.
    *
    * @param value the Boolean
    */
    public void setAllowExternalSenders(Boolean value) { 
        this.allowExternalSenders = value; 
        valueChanged("allowExternalSenders", value);

    }
            
    private Boolean autoSubscribeNewMembers;
     
    /**
    * Gets the auto Subscribe New Members.
    *
    * @return the Boolean
    */
    public Boolean getAutoSubscribeNewMembers() {
        return this.autoSubscribeNewMembers; 
    }

    /**
    * Sets the auto Subscribe New Members.
    *
    * @param value the Boolean
    */
    public void setAutoSubscribeNewMembers(Boolean value) { 
        this.autoSubscribeNewMembers = value; 
        valueChanged("autoSubscribeNewMembers", value);

    }
            
    private Boolean isSubscribedByMail;
     
    /**
    * Gets the is Subscribed By Mail.
    *
    * @return the Boolean
    */
    public Boolean getIsSubscribedByMail() {
        return this.isSubscribedByMail; 
    }

    /**
    * Sets the is Subscribed By Mail.
    *
    * @param value the Boolean
    */
    public void setIsSubscribedByMail(Boolean value) { 
        this.isSubscribedByMail = value; 
        valueChanged("isSubscribedByMail", value);

    }
            
    private Integer unseenCount;
     
    /**
    * Gets the unseen Count.
    *
    * @return the Integer
    */
    public Integer getUnseenCount() {
        return this.unseenCount; 
    }

    /**
    * Sets the unseen Count.
    *
    * @param value the Integer
    */
    public void setUnseenCount(Integer value) { 
        this.unseenCount = value; 
        valueChanged("unseenCount", value);

    }
    
        
    private java.util.List<DirectoryObject> members = null;
    
    
     
    /**
    * Gets the members.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMembers() {
        return this.members; 
    }

    /**
    * Sets the members.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMembers(java.util.List<DirectoryObject> value) { 
        this.members = value; 
        valueChanged("members", value);

    }
    
        
    private java.util.List<DirectoryObject> memberOf = null;
    
    
     
    /**
    * Gets the member Of.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getMemberOf() {
        return this.memberOf; 
    }

    /**
    * Sets the member Of.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setMemberOf(java.util.List<DirectoryObject> value) { 
        this.memberOf = value; 
        valueChanged("memberOf", value);

    }
            
    private DirectoryObject createdOnBehalfOf;
     
    /**
    * Gets the created On Behalf Of.
    *
    * @return the DirectoryObject
    */
    public DirectoryObject getCreatedOnBehalfOf() {
        return this.createdOnBehalfOf; 
    }

    /**
    * Sets the created On Behalf Of.
    *
    * @param value the DirectoryObject
    */
    public void setCreatedOnBehalfOf(DirectoryObject value) { 
        this.createdOnBehalfOf = value; 
        valueChanged("createdOnBehalfOf", value);

    }
    
        
    private java.util.List<DirectoryObject> owners = null;
    
    
     
    /**
    * Gets the owners.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getOwners() {
        return this.owners; 
    }

    /**
    * Sets the owners.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setOwners(java.util.List<DirectoryObject> value) { 
        this.owners = value; 
        valueChanged("owners", value);

    }
    
        
    private java.util.List<ConversationThread> threads = null;
    
    
     
    /**
    * Gets the threads.
    *
    * @return the java.util.List<ConversationThread>
    */
    public java.util.List<ConversationThread> getThreads() {
        return this.threads; 
    }

    /**
    * Sets the threads.
    *
    * @param value the java.util.List<ConversationThread>
    */
    public void setThreads(java.util.List<ConversationThread> value) { 
        this.threads = value; 
        valueChanged("threads", value);

    }
            
    private Calendar calendar;
     
    /**
    * Gets the calendar.
    *
    * @return the Calendar
    */
    public Calendar getCalendar() {
        return this.calendar; 
    }

    /**
    * Sets the calendar.
    *
    * @param value the Calendar
    */
    public void setCalendar(Calendar value) { 
        this.calendar = value; 
        valueChanged("calendar", value);

    }
    
        
    private java.util.List<Event> calendarView = null;
    
    
     
    /**
    * Gets the calendar View.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getCalendarView() {
        return this.calendarView; 
    }

    /**
    * Sets the calendar View.
    *
    * @param value the java.util.List<Event>
    */
    public void setCalendarView(java.util.List<Event> value) { 
        this.calendarView = value; 
        valueChanged("calendarView", value);

    }
    
        
    private java.util.List<Event> events = null;
    
    
     
    /**
    * Gets the events.
    *
    * @return the java.util.List<Event>
    */
    public java.util.List<Event> getEvents() {
        return this.events; 
    }

    /**
    * Sets the events.
    *
    * @param value the java.util.List<Event>
    */
    public void setEvents(java.util.List<Event> value) { 
        this.events = value; 
        valueChanged("events", value);

    }
    
        
    private java.util.List<Conversation> conversations = null;
    
    
     
    /**
    * Gets the conversations.
    *
    * @return the java.util.List<Conversation>
    */
    public java.util.List<Conversation> getConversations() {
        return this.conversations; 
    }

    /**
    * Sets the conversations.
    *
    * @param value the java.util.List<Conversation>
    */
    public void setConversations(java.util.List<Conversation> value) { 
        this.conversations = value; 
        valueChanged("conversations", value);

    }
            
    private ProfilePhoto photo;
     
    /**
    * Gets the photo.
    *
    * @return the ProfilePhoto
    */
    public ProfilePhoto getPhoto() {
        return this.photo; 
    }

    /**
    * Sets the photo.
    *
    * @param value the ProfilePhoto
    */
    public void setPhoto(ProfilePhoto value) { 
        this.photo = value; 
        valueChanged("photo", value);

    }
    
        
    private java.util.List<DirectoryObject> acceptedSenders = null;
    
    
     
    /**
    * Gets the accepted Senders.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getAcceptedSenders() {
        return this.acceptedSenders; 
    }

    /**
    * Sets the accepted Senders.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setAcceptedSenders(java.util.List<DirectoryObject> value) { 
        this.acceptedSenders = value; 
        valueChanged("acceptedSenders", value);

    }
    
        
    private java.util.List<DirectoryObject> rejectedSenders = null;
    
    
     
    /**
    * Gets the rejected Senders.
    *
    * @return the java.util.List<DirectoryObject>
    */
    public java.util.List<DirectoryObject> getRejectedSenders() {
        return this.rejectedSenders; 
    }

    /**
    * Sets the rejected Senders.
    *
    * @param value the java.util.List<DirectoryObject>
    */
    public void setRejectedSenders(java.util.List<DirectoryObject> value) { 
        this.rejectedSenders = value; 
        valueChanged("rejectedSenders", value);

    }
            
    private Drive drive;
     
    /**
    * Gets the drive.
    *
    * @return the Drive
    */
    public Drive getDrive() {
        return this.drive; 
    }

    /**
    * Sets the drive.
    *
    * @param value the Drive
    */
    public void setDrive(Drive value) { 
        this.drive = value; 
        valueChanged("drive", value);

    }
}

