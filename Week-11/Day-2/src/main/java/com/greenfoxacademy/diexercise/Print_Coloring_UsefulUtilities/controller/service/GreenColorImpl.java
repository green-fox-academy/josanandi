package com.greenfoxacademy.diexercise.Print_Coloring_UsefulUtilities.controller.service;

import org.springframework.stereotype.Service;

@Service
public class GreenColorImpl implements MyColor {
    @Override
    public void printColor() {
        System.out.println("It is green colored.");
    }
}
