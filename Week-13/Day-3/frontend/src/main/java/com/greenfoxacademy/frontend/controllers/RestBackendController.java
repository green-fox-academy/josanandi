package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestBackendController {

    @GetMapping("doubling")
    public Object getDouble(@RequestParam(required = false) Integer input){
        if (input == null){
            return new Error("Please provide an input!");
        }
        else{
            return new Result(input);
        }
    }
}
