package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Butterfly;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceButterfly {
    Butterfly butterfly;
    List<Butterfly> butterflies;

    public ServiceButterfly() {
    }

    public void createButterfly(String name){
        butterfly = new Butterfly(name);
        butterflies = new ArrayList<>();
        butterflies.add(butterfly);
    }

    public Butterfly getButterflyByName(String name){
        Butterfly actual = new Butterfly();
         for (Butterfly butterfly:this.butterflies) {
            if(butterfly.getName().equals(name)){
                actual = butterfly;
            }
        }
        return actual;
    }



}
