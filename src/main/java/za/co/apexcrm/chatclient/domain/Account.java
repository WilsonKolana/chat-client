package za.co.apexcrm.chatclient.domain;

public class Account {
    private int id;
    private String name;
    private String topic;

    public Account(){

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getTopic(){
        return topic;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTopic(String topic){
        this.topic = topic;
    }
}