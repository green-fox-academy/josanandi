package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.models.Butterfly;
import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.ListOfButterflies;
import com.greenfoxacademy.programmerfoxclub.services.ServiceButterfly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@Controller
//
//public class ButterflyController {
//    ServiceButterfly serviceButterfly;
//    Food foodlist;
//    Drink drinklist;
//
//
//    @Autowired
//    public ButterflyController() {
//        this.serviceButterfly = new ServiceButterfly();
//    }
//
//    @GetMapping("/nutritionstore")
//    public String getNutritionStore(@RequestParam( value = "name", required = false) String name, Model model) {
//        Butterfly actual;
//        if (name == null) {
//            return "login";
//        } else {
//            model.addAttribute("name", name);
//            foodlist = new Food();
//            model.addAttribute("foods", foodlist.getFoods());
//            drinklist = new Drink();
//            model.addAttribute("drinks", drinklist.getDrinks());
//        }
//
//        return "nutritionstore";
//    }
//
//    @PostMapping("/nutritionstorepost")
//    public String getFoodAndDrink( @ModelAttribute(value = "name") String name,
//                                   @ModelAttribute(value = "food") String food,
//                                   @ModelAttribute(value = "drink") String drink) {
//        ListOfButterflies list = serviceButterfly.getButterfliesList();
//        Butterfly actual = serviceButterfly.getButterflyByName(name);
//        actual.setFood(food);
//        actual.setDrink(drink);
//        serviceButterfly.updateToList(actual);
//
//        return "redirect:/?name=" + name;
//    }
//
//}
