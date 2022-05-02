package za.co.apexcrm.chatclient.domain;


import java.util.List;

public class User {
    private String firstName;
    private int id;
    private String lastName;
    private List<String> notifications;
    private String system;
    private String username;
    private String type;

    public User(){
        
    }
    
    public String getFirstName(){
        return firstName;
    }

    public int getId(){
        return id;
    }

    public String getLastName(){
        return lastName;
    }

    public List<String> notifications(){
        return notifications;
    }

    public String system(){
        return system;
    }

    public String type(){
        return type;
    }

    public String username(){
        return username;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFirstName(List<String> notifications){
        this.notifications = notifications;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public void setSystem(String system){
        this.system = system;
    }
}