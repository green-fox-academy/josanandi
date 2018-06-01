package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
    private AtomicLong id;
    private String controller;

    public Greeting(){

    }

    public Greeting( String controller) {
        this.id = new AtomicLong(0);
        this.controller = controller;
    }

    public long getId() {
        return id.get();
    }

    public String getController() {
        return controller;
    }

    public void incrementCount() {
        id.incrementAndGet();
    }
    public void setController(String controller) {
        this.controller = controller;
    }
}


