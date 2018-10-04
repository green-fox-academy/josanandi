package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.Message;
import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.Iterable;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;
    MessageService messageService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, MessageService messageService) {
        this.userRepository = userRepository;
        this.messageService = messageService;
    }

    @Override
    public void saveUser(String username) {
        userRepository.save(new User(username));
    }

    @Override
    public boolean checkIfUserPresent(String username) {
        User userCheck = userRepository.findUserByUsername(username);
        if (userCheck == null){
            return false;
        }
        else{
            return true;
        }
    }


    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void updateUser(String username,String newName) {
        List<Message> messages = messageService.getAllMessagesByUsername(username);
        for (Message message : messages) {
            message.setUsername(newName);
            messageService.updateMessage(message);
        }
        User actualUser = findUserByUsername(username);
        actualUser.setUsername(newName);
        userRepository.save(actualUser);

    }


}