package com.greenfoxacademy.diexercise.Print_Coloring_UsefulUtilities.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
    public class Printer {

    private final MyColor color;

    @Autowired
    public Printer(@Qualifier("blueColorImpl") MyColor color) {

        this.color = color;
    }

    public void log(String message) {
            System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
            color.printColor();
        }
    }
