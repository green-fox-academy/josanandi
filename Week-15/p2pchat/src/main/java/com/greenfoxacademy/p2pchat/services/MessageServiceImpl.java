package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.Message;
import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.MessageRepository;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    MessageRepository messageRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void saveMessage(String message, String username) {
        Message newMessage = new Message(message, username);
        messageRepository.save(newMessage);

    }

    public void updateMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public List<Message> getAllMessagesByUsername(String username) {
        return (List<Message>) messageRepository.findAllByUsername(username);
    }
}
