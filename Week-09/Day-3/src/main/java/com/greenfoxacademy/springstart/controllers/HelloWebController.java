package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloWebController {
    Greeting object =  new Greeting( "Andi");
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
        model.addAttribute("name", object.getController());
        object.incrementCount();
        model.addAttribute("counter", object.getId());
        return "greeting";
    }


}
