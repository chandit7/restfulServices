package com.ramesh.server.main.helloworld;

public class HelloworldBean {
    public String message;
    public HelloworldBean(String message){
        this.message = message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    //generate toString
    public String toString(){
        return String.format("HelloworldBean message",message);
    }
}
