package com.greenfoxacademy.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class Error {
    String error;

    public Error() {
    }

    public Error(String error) {
        this.error = error;
    }

    public String getMessage() {
        return error;
    }

    public void setMessage(String error) {
        this.error =error;
    }
}
