package com.greenfoxacademy.p2pchat.controllers;

import com.greenfoxacademy.p2pchat.services.MessageService;
import com.greenfoxacademy.p2pchat.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String getIndexPage(){
        return "/index";
    }

    @PostMapping("/login")
    public String loginUser(@ModelAttribute(value = "username") String username) {
        if (userService.checkIfUserPresent(username)) {
            return "redirect:/home/" + username;
        } else {
            return "register";
        }
    }

    @GetMapping("/home/{username}")
    public String getMainPage(@PathVariable(value = "username") String username, Model model){
        model.addAttribute("username", username);
        model.addAttribute("messages", messageService.getAllMessagesByUsername(username));
        return "redirect:/home/"+username;
    }

    @GetMapping("/register")
    public String getRegisterPage(){
        return "/register";
    }

    @PostMapping("/registeraccount")
    public String saveNewUser(@ModelAttribute(value = "username") String username){

        if (userService.checkIfUserPresent(username)){
            return "redirect:/home/" + username;
        }
        else{
            userService.saveUser(username);
            return "redirect:/home/" + username;
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

    @PostMapping("/savemessage/{username}")
    public String saveMessage(@PathVariable String username, @ModelAttribute(value = "message") String message){
        messageService.saveMessage(message, username);
        return "redirect:/home/" + username;
    }
}
