package com.greenfoxacademy.greenfoxclass.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    ArrayList<String> names;

    public StudentServiceImpl() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    @Override
    public List<String> findAll() {
        return names;
    }

    @Override
    public void save(String student) {
        names.add(student);
    }

    @Override
    public Integer counter(){
        return names.size();
    }

    @Override
    public String checkStudent(String student){
        if (!names.contains(student)){
            student += " isn't enrolled at Greenfox Academy";
        }
        else{
            student += " is enrolled at Greenfox Academy";
        }
        return student;
    }
}
