package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean checkIfUserPresent() {
        if (userRepository.findById(1l) != null){
            return true;
        }
        else{
            return false;
        }
    }
}
