package za.co.apexcrm.chatclient.domain;

import java.util.List;

public class Chat{
    private String channel;
    private String dateCreated;
    private List<Event> events;
    private int id;
    private String lastUpdated;
    private String latestEvent;
    private User lockedBy;
    private String name;
    private String notes;
    private User startedBy;
    private List<String> tags;
    private int unread;
    private int version;
    private boolean complete;

    public Chat(){

    }

    public int getId() {
        return id;
    }

    public List<Event> getEvents() {
        return events;
    }

    public String getChannel() {
        return channel;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public String getLatestEvent() {
        return latestEvent;
    }

    public boolean isComplete() {
        return complete;
    }

    public int getUnread() {
        return unread;
    }

    public int getVersion() {
        return version;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public String getName() {
        return name;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getNotes() {
        return notes;
    }

    public User getLockedBy() {
        return lockedBy;
    }

    public User getStartedBy() {
        return startedBy;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setLatestEvent(String latestEvent) {
        this.latestEvent = latestEvent;
    }

    public void setLockedBy(User lockedBy) {
        this.lockedBy = lockedBy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setStartedBy(User startedBy) {
        this.startedBy = startedBy;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public void setUnread(int unread) {
        this.unread = unread;
    }

    public void setVersion(int version) {
        this.version = version;
    }

}