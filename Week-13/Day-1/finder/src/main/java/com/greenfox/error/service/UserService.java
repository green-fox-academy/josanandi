package com.greenfox.error.service;

import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private ArrayList<User> users;


    @Autowired
    public UserService() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getAll() {
        return this.users;
    }

    public void save(User user) {
        users.add(user);
    }

}
