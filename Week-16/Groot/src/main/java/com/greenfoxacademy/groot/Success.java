package com.greenfoxacademy.groot;

import org.springframework.stereotype.Component;

@Component
public class Success {
    private String received;
    private String translated;

    public Success() {
    }

    public Success(String received) {
        this.received = received;
        this.translated = "I am Groot";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
