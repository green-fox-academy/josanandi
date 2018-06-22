package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceButterfly {
    Butterfly butterfly;
    ListOfButterflies listOfButterflies;
    ActualFood actualFood;
    ActualDrink actualDrink;

    public ServiceButterfly() {}

    public ListOfButterflies createList(){
        listOfButterflies = new ListOfButterflies();
        return listOfButterflies;
    }

    public Butterfly createButterfly(String name){
       butterfly = new Butterfly(name);
       return butterfly;
    }

    public void addToList(Butterfly butterfly){
        listOfButterflies.addButterflies(butterfly);
    }

    public Butterfly getButterflyByName(String name){
        Butterfly actual = new Butterfly();
         for (Butterfly butterfly:this.listOfButterflies.getButterflies()) {
            if(butterfly.getName().equals(name)){
                actual = butterfly;
            }
        }
        return actual;
    }
    
}
