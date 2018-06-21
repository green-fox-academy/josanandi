package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.beans.factory.annotation.Autowired;

import javax.print.DocFlavor;
import java.util.List;

public class Butterfly {
    private String name;
    Tricks tricks;
    Food foods;
    Drink drinks;

    @Autowired
    public Butterfly(String name) {
        this.name = name;
        this.foods = new Food();
        this.drinks = new Drink();
        this.tricks = new Tricks();
    }

    public Butterfly() {
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getFoods() {
        return foods.getFood();
    }

    public String getDrinks() {
        return drinks.getDrink();
    }

    public List<String> getTricks(){
        return tricks.getTricks();
    }

    public Integer getTricksNumber() {
        return tricks.getTricks().size();
    }
}
