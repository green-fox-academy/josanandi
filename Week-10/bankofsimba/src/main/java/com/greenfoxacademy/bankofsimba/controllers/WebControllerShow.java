package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebControllerShow {

    BankAccount account = new BankAccount("Simba", 2000.00, "lion");

    @GetMapping("show")
    public String showAccount( Model model){
        model.addAttribute("account", account);
        model.addAttribute("accountBalance", String.format("%,.2f", account.getBalance()));
        return "show";
    }

    @GetMapping("htmlception")
    public String htmlCeption(Model model){
        String textPart= "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";
        model.addAttribute("text", textPart);
        return "htmlception";
    }
}
