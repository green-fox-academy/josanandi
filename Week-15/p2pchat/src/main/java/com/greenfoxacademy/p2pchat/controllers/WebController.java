package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.models.User;
import com.greenfoxacademy.p2pchat.services.MessageService;
import com.greenfoxacademy.p2pchat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


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
    public String getIndexPage(){
        return "/index";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute(value = "username") String username) {
        if (userService.checkIfUserPresent(username)) {
            return "redirect:/home/?username=" + username;
        } else {
            return "register";
        }
    }

    @GetMapping(value="/home")
    public String getMainPage(@RequestParam(value = "username", required = false) String username, Model model){
        model.addAttribute("username", username);
        model.addAttribute("messages", messageService.getAllMessagesByUsername(username));
        return "home";
                  }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "/register";
    }

    @PostMapping("/registeraccount")
    public String saveNewUser(@ModelAttribute(value = "username") String username){

        if (userService.checkIfUserPresent(username)){
            return "redirect:/home/?username=" + username;
        }
        else{
            userService.saveUser(username);
            return "redirect:/home/?username=" + username;
        }
    }

    @PostMapping("/updateaccount")
    public String updateUser(@RequestParam String username, @ModelAttribute(value = "name") String newName){
        if(newName.equals("")){
            return "indexnouser";
        }

        userService.updateUser(username, newName);
        return "redirect:/home/?username=" +newName;
    }

    @PostMapping("/savemessage")
    public String saveMessage(@RequestParam String username, @ModelAttribute(value = "message") String message){
        messageService.saveMessage(message, username);
        return "redirect:/home/?username=" + username;
    }
}
