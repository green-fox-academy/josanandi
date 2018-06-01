package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {
    Greeting object =  new Greeting( "Hello, Andi!");
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(
            @RequestParam(value ="name", required = false) String name)
    {
        object.incrementCount();
        return object;
    }
}
