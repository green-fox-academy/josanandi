package com.greenfoxacademy.greenfoxclass.services;

import java.util.List;

public interface StudentService {
    public List<String> findAll();
    public void save(String student);
    public Integer counter();
    public String checkStudent(String student);
}
