package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import com.greenfoxacademy.connectionwithmysql.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServiceToDoImpl implements ServiceToDo{
    ToDoRepository toDoRepository;
    @Autowired
    public ServiceToDoImpl(ToDoRepository toDoRepository) {
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

    public void edit(ToDo toDo) {
        toDoRepository.save(toDo);
    }

    @Override
    public List<ToDo> findAllByTitle(String title) {
        return toDoRepository.findAllByTitle(title);
    }

    public  List<ToDo> findAllBySearchLike(String title){
        return toDoRepository.findAllByTitleContaining(title);
    }

    public List<ToDo> findAllbyAssigneeId(Long id) {
        return toDoRepository.findAllByAssignee_Id(id);
    }
}
