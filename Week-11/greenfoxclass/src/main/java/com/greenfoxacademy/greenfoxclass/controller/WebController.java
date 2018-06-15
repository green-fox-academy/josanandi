package com.greenfoxacademy.greenfoxclass.controller;

import com.greenfoxacademy.greenfoxclass.services.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebController {
    @Autowired
    StudentServiceImpl students = new StudentServiceImpl();

    @GetMapping("gfa")
    public String getHomePage(Model model){
        model.addAttribute("counter", students.counter());
        return"gfa";
    }

    @GetMapping("/gfa/list")
    public String getAllStudentsList(Model model){
        model.addAttribute("students", students.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String newStudentForm(){
        return "add";
    }

    @PostMapping("gfa/save")
    public String saveNewStudent(@ModelAttribute(value="name") String name){
        students.save(name);
        return "redirect:/gfa/list";
    }

    @GetMapping("/gfa/checker")
    public String studentCheckerForm(){
        return "checker";
    }



    @PostMapping(value = "gfa/checker")
    public String isStudentIn(@RequestParam(value="name") String name, Model model){
        System.out.println((students.checkStudent(name)));
        model.addAttribute("name",students.checkStudent(name));
        return "checker";
    }

}
