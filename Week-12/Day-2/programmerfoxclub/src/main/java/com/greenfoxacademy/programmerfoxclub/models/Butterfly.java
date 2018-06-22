package com.greenfoxacademy.programmerfoxclub.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Butterfly {
    private String name;
    Tricks tricks;
    Food foodList;
    Drink drinkList;
    ActualFood food;
    ActualDrink drink;

    @Autowired
    public Butterfly(String name) {
        this.name = name;
        this.foodList = new Food();
        this.drinkList = new Drink();
        this.tricks = new Tricks();
        this.food = new ActualFood();
        this.drink = new ActualDrink();
    }

    @Autowired
    public Butterfly() {
        this.foodList = new Food();
        this.drinkList = new Drink();
        this.tricks = new Tricks();
        this.food = new ActualFood();
        this.drink = new ActualDrink();
    }

    public String getName() {
        return name;
    }


    public String getFood() {
        return this.food.getActualFood();
    }

    public String getDrink() { return this.drink.getActualDrink();
    }


    public List<String> getTricks(){
        return tricks.getTricks();
    }

    public Integer getTricksNumber() {
        return tricks.getTricks().size();
    }


    public void setFood(String newFood) {

        this.food.setActualFood(newFood);
    }

    public void setDrink(String newDrink) {
        this.drink.setActualDrink(newDrink);
    }
}
