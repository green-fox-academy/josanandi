package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TricksToLearn {
    List<String> tricklist;

    public TricksToLearn() {
        this.tricklist = new ArrayList<>();
        tricklist.addAll(Arrays.asList("Make Spring Magic", "Loves Thymeleaf", "Fly"));
    }

    public List<String> getTricks() {
        return this.tricklist;
    }
}