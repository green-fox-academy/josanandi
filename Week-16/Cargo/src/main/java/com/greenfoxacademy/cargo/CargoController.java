package com.greenfoxacademy.cargo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CargoController {

    Ship actualShip;

    @Autowired
    public CargoController(Ship actualShip) {
        this.actualShip = actualShip;
    }

    @GetMapping("/rocket")
    public ResponseEntity<Object> getActualStatus(){
        return new ResponseEntity<>(actualShip, HttpStatus.CREATED);
    }

    @GetMapping("/fill")
    public ResponseEntity<Object> fillShip(@RequestParam(required = false) String caliber, @RequestParam(required =false) Integer amount){
        if (caliber == null || amount == null){
            return new ResponseEntity<>(new Errormessage("Amount, caliber is missing"), HttpStatus.BAD_REQUEST);
        }
        ShipStatus actualStatus = new ShipStatus(caliber, amount);
        return new ResponseEntity<>(actualStatus,HttpStatus.CREATED);

    }

}
