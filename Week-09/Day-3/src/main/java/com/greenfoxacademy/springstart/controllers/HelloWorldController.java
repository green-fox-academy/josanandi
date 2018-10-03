package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

import static java.lang.System.lineSeparator;

@Controller
public class HelloWorldController {

    InternationalGreeting greeting = new InternationalGreeting();


    @RequestMapping("/web/greeting/world")
    public String greeting(Model model) {
        String[] greetings = greeting.hellos;
        System.out.println(greetings[1  ]);
        String valueColor ="rgb(" + (int)(Math.random()*256) + ", "+(int)(Math.random()*256)+ ", "+ (int)(Math.random()*256) + ")";
        String valueFont = (int)(Math.random()*101 +10) +"px";
        model.addAttribute("name", greeting.getController()) ;
        model.addAttribute("valueColor", valueColor);
        model.addAttribute("valueFont", valueFont);
        model.addAttribute("greetings", greetings);



        return "greetingworld.html";
    }

}
