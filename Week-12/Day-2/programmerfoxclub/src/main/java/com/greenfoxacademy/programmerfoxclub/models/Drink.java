package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Drink {
    private List<String> drink;

    public Drink() {
        this.drink = new ArrayList<>();
        drink.addAll(Arrays.asList("water","syrup", "lemonade"));
    }

    public String getFirstDrink() {
        return drink.get(0);
    }

    public void setDrink(String drink) {
        this.drink.add(drink);
    }
    public List<String> getDrinks(){
        return this.drink;
    }

    public String getDrinkById(Integer id ){
        String drinkById = "";
        for (int i = 0; i < this.drink.size() ; i++) {
            if (i == id){
                drinkById = this.drink.get(i);
            }
        }
        return drinkById;
    }
}

