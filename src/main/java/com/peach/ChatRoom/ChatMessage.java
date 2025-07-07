package com.peach.ChatRoom;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sender;
    private String message;
    private String timestamp;


    public ChatMessage() {
    }
    public ChatMessage(String sender, String message,String timestamp) {
        this.sender = sender;
        this.message = message;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }
    public String getSender() {
        return sender;
    }
    public String getMessage() {
        return message;
    }
    public String getTimestamp() {
        return timestamp;
    }
}
