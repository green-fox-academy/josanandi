package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Food {
    private List<String> food;

    public Food() {
        this.food = new ArrayList<>();
        food.addAll(Arrays.asList("nectar","honey", "magic powder"));
    }


    public String getFirstFood() {
        return food.get(0);
    }

    public void setFood(String food) {
        this.food.add(food);
    }

    public List<String> getFoods(){
        return this.food;
    }
}
