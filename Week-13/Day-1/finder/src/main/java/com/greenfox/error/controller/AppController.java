package com.greenfox.error.controller;

import com.greenfox.error.service.UserService;
import com.greenfox.error.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


/**
 * Created by aze on 25/10/17.
 */
@Controller
public class AppController {


    UserService service;
    @Autowired
    public AppController() {
        service = new UserService();
    }

    @GetMapping("/")
    public String index(Model model) {
        User new_user = new User();
        model.addAttribute("new_user", new_user);
        model.addAttribute("yolo", service.getAll());
        return "index";
    }

    @PostMapping("/app")
    public String create(@ModelAttribute("new_user") User new_user) {
        service.save(new_user);
        return "redirect:/ ";
    }
}