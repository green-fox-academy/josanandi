package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private long id;
    private String controller;

    public Greeting(){

    }

    public Greeting(long id, String controller) {
        this.id = id;
        this.controller = controller;
    }

    public long getId() {
        return id;
    }

    public String getController() {
        return controller;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setController(String controller) {
        this.controller = controller;
    }
}
