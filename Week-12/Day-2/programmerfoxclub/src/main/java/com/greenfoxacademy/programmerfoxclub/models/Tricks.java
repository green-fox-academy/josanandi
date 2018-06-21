package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tricks {
  List<String> tricks;

    public Tricks() {
        this.tricks = new ArrayList<>();
        tricks.addAll(Arrays.asList("Make Spring Magic", "Loves Thymeleaf", "Fly"));
    }

    public List<String> getTricks() {
        return this.tricks;
    }
}
