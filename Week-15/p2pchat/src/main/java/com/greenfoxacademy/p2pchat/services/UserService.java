package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(String username);

    boolean checkIfUserPresent(String username);

    String findUserNameByFirstId();

    User findUserByUsername(String username);

    void updateUser(String username, String newName);
}