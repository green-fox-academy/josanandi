package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class WebController {
    UserService userService;

    @Autowired
    public WebController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/")
    public String getMainPage(@ModelAttribute(value = "username") String username, Model model){
        if (userService.checkIfUserPresent()){
            model.addAttribute("username", userService.findUserNameByFirstId());
            return "index";
        }
        else{
            return "register";

        }
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "/register";
    }

    @PostMapping("/registeraccount")
    public String saveNewUser(@ModelAttribute(value = "username") String username){
        userService.saveUser(username);
        if (userService.checkIfUserPresent()){
            return "redirect:/";
        }
        else{
            return "redirect:/register";

        }

    }
}
