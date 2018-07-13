package com.greenfoxacademy.p2pchat.services;

import com.greenfoxacademy.p2pchat.models.Message;

import java.util.List;

public interface MessageService {
    void saveMessage(String message);

    List<Message> getAllMessages();
}
