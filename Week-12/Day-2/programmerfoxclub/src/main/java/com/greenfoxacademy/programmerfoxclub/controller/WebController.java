package com.greenfoxacademy.programmerfoxclub.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String getIndex(@RequestParam(value = "name", required =false) String name){
        if (name == null){
            return "login";
        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/submitname")
    public String postLogin(@RequestParam(value="name") String name){
        return "redirect:/?name=" + name;
    }
}
