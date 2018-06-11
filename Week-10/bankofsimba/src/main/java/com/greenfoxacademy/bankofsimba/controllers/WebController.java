package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import com.greenfoxacademy.bankofsimba.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class WebController {
    private final BankService bankService;

    @Autowired
    public WebController(BankService bankService) {
        this.bankService = bankService;
        this.bankService.create();
           }
    BankAccount account = new BankAccount("Simba", 2000.00, "lion", true);

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
        model.addAttribute("accounts", bankService.getAllAcccount());
        return "allaccounts";
    }

    @RequestMapping("form")
    public String getForm(Model model){
        model.addAttribute("accounts", bankService.getAllAcccount());
        return "form";

    }
    @PostMapping(value = "allaccounts")
    public String postForm(@ModelAttribute(value="account") BankAccount account){
        bankService.raiseBalance(account);
        return "redirect:/allaccounts";

    }

    @RequestMapping("newaccount")
    public String newAccountCreation(Model model){
        return "newaccount";
    }

    @PostMapping(value = "addnewaccount")
    public String creatNewAccountForm(@ModelAttribute(value="name") String name,
                                      @ModelAttribute(value="balance") double balance,
                                      @ModelAttribute(value="animalType") String animalType,
                                      @ModelAttribute(value="isGoodGuy") boolean isGoodGuy){
        System.out.println(name);
        bankService.add(new BankAccount(name, balance, animalType, isGoodGuy));
        return "redirect:/allaccounts";

    }
}
