package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
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
    public String findUserNameByFirstId() {
        return userRepository.findById(1l).get().getUsername();
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public void updateUser(String username) {
        User existingUser =  userRepository.findById(1l).get();
        existingUser.setUsername(username);
        userRepository.save(existingUser);
    }


}