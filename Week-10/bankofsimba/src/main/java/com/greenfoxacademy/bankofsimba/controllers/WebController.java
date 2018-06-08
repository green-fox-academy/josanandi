package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {
    private final BankService bankService;

    @Autowired
    public WebController(BankService bankService) {
        this.bankService = bankService;
           }
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

    @GetMapping("allaccounts")
    public String showAllAccounts(Model model){
        bankService.create();
        model.addAttribute("accounts", bankService.getAllAcccount());
        return "allaccounts";
    }
}