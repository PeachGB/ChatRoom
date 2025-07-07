package com.peach.ChatRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ChatMessageService {
    @Autowired
    private ChatMessageRepository repository;
    public ChatMessage saveMessage(String sender, String content){
        ChatMessage message = new ChatMessage(sender, content, LocalDateTime.now().toString());
        return repository.save(message);
    }
    public List<ChatMessage> getMessages(){
        return repository.findAll();
    }
    public List<ChatMessage> getMessagesBySender(String sender){
        return repository.findBySender(sender);
    }
}
