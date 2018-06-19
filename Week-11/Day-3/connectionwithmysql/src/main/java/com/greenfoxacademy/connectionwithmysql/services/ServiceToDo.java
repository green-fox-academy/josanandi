package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceToDo {
    ToDoRepository toDoRepository;
    @Autowired
    public ServiceToDo(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findActiveTasks(){
        return (List<ToDo>) toDoRepository.findAllByDone(false);

    }
    public List<ToDo> findAll(){
        return (List<ToDo>) toDoRepository.findAll();

    }

    public void add(ToDo toDo) {
        toDoRepository.save(toDo);
    }


    public ToDo findTodoById(Long id) {
        return toDoRepository.findById(id).get();
    }

    public void remove(Long idx) {
        toDoRepository.deleteById(idx);
    }
}
