package com.greenfoxacademy.groot;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

    @GetMapping("/groot")
    public ResponseEntity<Object> groot(@RequestParam(required = false) String message){
        if (message == null){
            return new ResponseEntity<>(new ErrorMessage(), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new Success(message), HttpStatus.CREATED);
    }
}
