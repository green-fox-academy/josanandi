package com.greenfoxacademy.cargo;

import org.springframework.stereotype.Component;

@Component
public class Errormessage {
    private String message;

    public Errormessage() {
    }

    public Errormessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
