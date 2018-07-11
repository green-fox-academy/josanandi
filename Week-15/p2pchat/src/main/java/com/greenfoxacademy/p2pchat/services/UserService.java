package com.greenfoxacademy.p2pchat.services;


public interface UserService {
    void saveUser(String username);

    boolean checkIfUserPresent();
}
