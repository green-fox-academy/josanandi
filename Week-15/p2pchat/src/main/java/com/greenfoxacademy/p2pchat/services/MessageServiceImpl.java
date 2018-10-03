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
    UserRepository userRepository;

    @Autowired
    public MessageServiceImpl(MessageRepository messageRepository, UserRepository userRepository) {
        this.messageRepository = messageRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void saveMessage(String message, String username) {
        User existingUser =  userRepository.findUserByUsername(username);
        Message newMessage = new Message(message, existingUser);
        messageRepository.save(newMessage);

    }

    @Override
    public List<Message> getAllMessagesByUsername(String username) {
        return (List<Message>) messageRepository.findAllByUser_Username(username);
    }
}
