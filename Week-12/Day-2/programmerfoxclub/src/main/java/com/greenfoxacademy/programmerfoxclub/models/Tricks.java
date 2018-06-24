package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Tricks {
  List<String> tricks;

    public Tricks() {
        this.tricks = new ArrayList<>();
    }

    public List<String> getTricks() {
        return this.tricks;
    }

    public void addTricks(String trick) {
        this.tricks.add(trick);
    }
}
