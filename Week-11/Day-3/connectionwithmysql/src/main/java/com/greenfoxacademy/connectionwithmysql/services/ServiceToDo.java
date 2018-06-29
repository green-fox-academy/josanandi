package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceToDo {

    List<ToDo> findActiveTasks();
    List<ToDo> findAll();
    void add(ToDo toDo);
    ToDo findTodoById(Long id);
    void remove(Long idx);
    void edit(ToDo toDo);
    List<ToDo> findAllByTitle(String title);
}
