package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.repository.ToDoRepository;
import com.greenfoxacademy.connectionwithmysql.services.ServiceToDo;
import com.sun.org.apache.xalan.internal.xsltc.compiler.Parser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


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

    @GetMapping("/add")
    public String addNewToDo(){
        return "add";
    }

    @PostMapping("/add")
    public String saveNewTodo(@ModelAttribute(value="title") String title){
        serviceToDo.add(new ToDo(title));
        return "redirect:/list";
    }

    @GetMapping(value ="/{id}/delete")
    public String deleteToDo(@PathVariable("id") Long idx){
        serviceToDo.remove(idx);
        return "redirect:/list";
    }

    @GetMapping(value = "/{id}/edit")
    public String editToDo(@PathVariable("id") Long idx, Model model){
        ToDo actual = serviceToDo.findTodoById(idx);
        model.addAttribute("toDo", actual);
        return "edit";
    }

    @PostMapping(value = "/{id}/post")
    public String editPostToDo(@PathVariable("id") Long idx, @ModelAttribute("toDo") ToDo toDo){
        toDo.setId(idx);
        serviceToDo.edit(toDo);
        return "redirect:/list";
    }


}

