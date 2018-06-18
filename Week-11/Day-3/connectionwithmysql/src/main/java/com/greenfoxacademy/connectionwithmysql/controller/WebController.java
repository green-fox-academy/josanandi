package com.greenfoxacademy.connectionwithmysql.controller;


import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WebController {

    ToDoRepository toDoRepository;

    @Autowired
    public WebController(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }


    @GetMapping("/list")
    public String worksFine(Model model) {
        model.addAttribute("todos", toDoRepository.findAll());
        return "todolist";
    }
}

