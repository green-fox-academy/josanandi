package com.greenfoxacademy.programmerfoxclub.controller;

import com.greenfoxacademy.programmerfoxclub.models.Butterfly;
import com.greenfoxacademy.programmerfoxclub.services.ServiceButterfly;
import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
    ServiceButterfly serviceButterfly;

    @Autowired
    public WebController() {
        this.serviceButterfly = new ServiceButterfly();
    }




    @GetMapping("/")
    public String getIndex(@RequestParam(value = "name", required =false) String name, Model model){
        Butterfly actual;
        if (name == null){
            return "login";
        }
        else{

            actual = serviceButterfly.getButterflyByName(name);

            model.addAttribute("name", name);
            model.addAttribute("food", actual.getFoods() );
            model.addAttribute("drink", actual.getDrinks());
            model.addAttribute("tricks", actual.getTricks());
            model.addAttribute("tricknumber", actual.getTricksNumber());

        }
        return "index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "login";
    }

    @PostMapping("/submitname")
    public String postLogin(@ModelAttribute(value="name") String name) {
        serviceButterfly.createButterfly(name);
        return "redirect:/?name=" + name;
    }
}
