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

    @ManyToOne( cascade = CascadeType.ALL)
    User user;

    public Message( String text, User user) {
        this.id = (Double)(Math.random()*9000000 + 1000000);
        this.text = text;
        this.timestamp = LocalDateTime.now();
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
