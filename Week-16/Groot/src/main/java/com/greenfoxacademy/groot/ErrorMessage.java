package com.greenfoxacademy.groot;

import org.springframework.stereotype.Component;

@Component
public class ErrorMessage {
    public String error;

    public ErrorMessage() {
        this.error = "I am Groot";
    }
}
