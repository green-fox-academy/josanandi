package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class ListOfButterflies {
    List<Butterfly> theList;

    public ListOfButterflies() {
        theList = new ArrayList<>();
    }

    public void addButterflies(Butterfly butterfly){
        theList.add(butterfly);
    }

    public Butterfly getButterflyByName(String name){
        Butterfly actualOne = new Butterfly();
        for (Butterfly butterfly: theList) {
            if(name.equals(butterfly.getName())){
                actualOne = butterfly;
            }
        }
        return actualOne;
    }

    public List<Butterfly> getButterflies() {
        return theList;
    }
}
