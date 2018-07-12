package com.greenfoxacademy.p2pchat.services;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    void saveUser(String username);

    boolean checkIfUserPresent();

    String findUserNameByFirstId();
}
