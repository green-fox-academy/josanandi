package com.greenfoxacademy.diexercise.service;

import org.springframework.stereotype.Service;

@Service
public class BlueColorImpl implements MyColor {


    @Override
    public void printColor() {
        System.out.println("It is blue colored.");
    }
}
