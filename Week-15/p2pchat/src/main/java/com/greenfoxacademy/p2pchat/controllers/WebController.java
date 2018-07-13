package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.services.MessageService;
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
    MessageService messageService;

    @Autowired
    public WebController(UserService userService, MessageService messageService) {
        this.userService = userService;
        this.messageService = messageService;
    }


    @GetMapping("/")
    public String getMainPage(@ModelAttribute(value = "username") String username, Model model){
        if (userService.checkIfUserPresent()){
            model.addAttribute("username", userService.findUserNameByFirstId());
            model.addAttribute("messages", messageService.getAllMessages());
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

    @PostMapping("/updateaccount")
    public String updateUser(@ModelAttribute(value = "username") String username){
        if(username.equals("")){
            return "indexnouser";
        }
        userService.updateUser(username);
        return "redirect:/";
    }

    @PostMapping("/savemessage")
    public String saveMessage(@ModelAttribute(value = "message") String message){
        messageService.saveMessage(message);
        return "redirect:/";
    }
}
