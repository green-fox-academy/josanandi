package com.greenfoxacademy.p2pchat.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Random;

@Entity
public class Message {
    @Id
    Double id;

    String text;
    LocalDateTime timestamp;
    String username;

    public Message( String text, String username) {
        this.id = (Double)(Math.random()*9000000 + 1000000);
        this.text = text;
        this.timestamp = LocalDateTime.now();
        this.username = username;
    }

    public Message(Double id, LocalDateTime timestamp) {
        this.id = (Double)(Math.random()*9000000 + 1000000);
        this.timestamp = LocalDateTime.now();
    }

    public Message() {
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
