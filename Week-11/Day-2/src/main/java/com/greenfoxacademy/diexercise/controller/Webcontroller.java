package com.greenfoxacademy.diexercise.controller;

import com.greenfoxacademy.diexercise.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Webcontroller {

    @Autowired
    UtilityService color = new UtilityService();

    @GetMapping("useful")
    public String getUsefulLinks(){
        return "useful";
    }

    @GetMapping("useful/colored")
    public String getColoredBackground(Model model){
        model.addAttribute("color", color.randomColor());
        return "colored";
    }

    @GetMapping("useful/email")
    public String validateEmail(Model model, @RequestParam(value ="email", required = false) String email){
        model.addAttribute("emailValidator", color.validateEmail(email));
        model.addAttribute("email", email);
        return "email";
    }
    @GetMapping("useful/caesarendecoding")
    public String caesarEnDecoding(Model model, @RequestParam(value ="text", required = false) String text,
                                   @RequestParam(value ="number", required = false) Integer number) {
        model.addAttribute("result", color.caesar(text, number));
        model.addAttribute("text", text);
        model.addAttribute("number", number);
        return "caesarendecoding";
    }
}
