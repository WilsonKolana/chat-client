package za.co.apexcrm.chatclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Event{
   private String channel;
   private String dateCreated; 

   @JsonProperty("event")
   private String eventName;

   private User user;

   public Event(){

   } 

    public String getChannel(){
       return channel;
    }

    public String getEventName(){
        return eventName;
    }

    public User getUser(){
        return user;
    }

    public String getDateCreated(){
        return dateCreated;
    }

    public void setChannel(String channel){
        this.channel = channel;
    }

    public void setDateCreated(String dateCreated){
        this.dateCreated = dateCreated;
    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public void setUser(User user){
        this.user = user;
    }

 
}
