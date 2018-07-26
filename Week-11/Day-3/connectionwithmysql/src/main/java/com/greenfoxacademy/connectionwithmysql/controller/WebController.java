package com.greenfoxacademy.connectionwithmysql.controller;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.services.ServiceAssignee;
import com.greenfoxacademy.connectionwithmysql.services.ServiceToDo;
import com.greenfoxacademy.connectionwithmysql.services.ServiceToDoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class WebController {

    ServiceToDo serviceToDo;
    ServiceAssignee serviceAssignee;

    @Autowired
    public WebController(ServiceToDo serviceToDo, ServiceAssignee serviceAssignee) {
        this.serviceToDo = serviceToDo;
        this.serviceAssignee = serviceAssignee;
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
        List<Assignee> assigneeList = serviceAssignee.findAllAssignees();
        model.addAttribute("assignees", assigneeList);
        return "edit";
    }

    @PostMapping(value = "/{id}/post")
    public String editPostToDo(@PathVariable("id") Long idx,
                               @RequestParam(value = "title" ) String title,
                               @RequestParam (value="urgent",defaultValue = "false") Boolean urgent,
                               @RequestParam(value="done", defaultValue = "false") Boolean done,
                               @RequestParam("assignee") String assigneeName){
        Assignee assigneeLive = serviceAssignee.findAssigneeByName(assigneeName);
        ToDo toDo = serviceToDo.findTodoById(idx);
        toDo.setTitle(title);
        toDo.setUrgent(urgent);
        toDo.setDone(done);
        toDo.setAssignee(assigneeLive);
        serviceToDo.edit(toDo);
        return "redirect:/list";
    }

    @GetMapping("/searchresults")
    public String searchResults(@RequestParam("search") String search, Model model){
        model.addAttribute("toDoList", serviceToDo.findAllBySearchLike(search));
        return "searchresults";
    }

    @PostMapping("/search")
    public String searchToDo(@ModelAttribute("search") String search){
        return "redirect:/searchresults/?search=" + search;
    }

    @GetMapping("/assigneelist")
    public String getAssigneelist(Model model){
        List<Assignee> assigneeList = serviceAssignee.findAllAssignees();
        model.addAttribute("assignees", assigneeList);
        return "/assigneelist";
    }

    @GetMapping("/addassignee")
    public String addNewAssignee(){
        return "addassignee";
    }

    @PostMapping("/addassignee")
    public String saveNewAssignee(@ModelAttribute(value="name") String name,
                                  @ModelAttribute(value="email") String email){
        serviceAssignee.saveAssignee(name, email);
        return "redirect:/assigneelist";
    }

    @GetMapping(value ="/{id}/deleteassignee")
    public String deleteAssignee(@PathVariable("id") Long idx){
        serviceAssignee.remove(idx);
        return "redirect:/assigneelist";
    }

    @GetMapping(value = "/{id}/editassignee")
    public String editAssignee(@PathVariable("id") Long idx, Model model){
        Assignee assignee = serviceAssignee.findAssigneeById(idx);
        model.addAttribute("assignee", assignee);
        return "editassignee";
    }

    @PostMapping(value = "/{id}/editassignee")
    public String editAssignee(@PathVariable("id") Long idx, @ModelAttribute("assignee") Assignee assignee){
        assignee.setId(idx);
        String email = serviceAssignee.findEmailById(idx);
        assignee.setEmail(email);
        serviceAssignee.edit(assignee);
        return "redirect:/assigneelist";
    }
    @GetMapping("/{id}/listoftodos")
    public String toDoListResult(Model model, @PathVariable("id") Long id){
        model.addAttribute("todos", serviceToDo.findAllbyAssigneeId(id));
        return "todolistbyassignee";

    }


}

