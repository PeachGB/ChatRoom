package com.peach.ChatRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageRestController {
@Autowired
private ChatMessageService service;

@PostMapping
    public ChatMessage sendMessages(@RequestBody ChatMessage message) {
    return service.saveMessage(message.getSender(),message.getMessage());
    }

    @GetMapping
    public List<ChatMessage> getMessages(){
        return service.getMessages();
    }
    @GetMapping("/sender/{sender}")
    public List<ChatMessage> getMessagesBySender(@PathVariable String sender){
        return service.getMessagesBySender(sender);
    }

}
