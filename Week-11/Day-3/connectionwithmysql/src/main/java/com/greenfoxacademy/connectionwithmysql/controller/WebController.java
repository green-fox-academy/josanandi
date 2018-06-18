package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.repository.ToDoRepository;
import com.greenfoxacademy.connectionwithmysql.services.ServiceToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class WebController {

    ServiceToDo serviceToDo;

    @Autowired
    public WebController(ServiceToDo serviceToDo) {
        this.serviceToDo = serviceToDo;
    }

    @GetMapping("/list")
    public String worksFine(Model model) {
        model.addAttribute("todos", serviceToDo.findAll());
        return "todolist";
    }

    @GetMapping("/active")
    public String showActiveTasks(Model model, @RequestParam(value ="isActive", required = false) Boolean isActive){
        model.addAttribute("todos", serviceToDo.findActiveTasks());
        return "activetasks";
    }
}

