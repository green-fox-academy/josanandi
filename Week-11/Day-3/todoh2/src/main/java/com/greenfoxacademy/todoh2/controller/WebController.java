package com.greenfoxacademy.todoh2.controller;

import com.greenfoxacademy.todoh2.model.ToDo;
import com.greenfoxacademy.todoh2.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller(value = "/todo")
public class WebController {

    ToDoRepository toDoRepository;

    @Autowired
    public WebController(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }


    @GetMapping(value = {"/", "/list"})

    public String worksFine(Model model){

        model.addAttribute("todos", toDoRepository.findAll());
        return "todoslist";
    }
}
