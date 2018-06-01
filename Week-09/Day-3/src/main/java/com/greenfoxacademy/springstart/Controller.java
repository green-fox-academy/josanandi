package com.greenfoxacademy.springstart;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String hello(){
        return "Hello world";

    }
}
