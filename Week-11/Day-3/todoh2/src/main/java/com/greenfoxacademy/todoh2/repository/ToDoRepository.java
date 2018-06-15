package com.greenfoxacademy.todoh2.repository;

import com.greenfoxacademy.todoh2.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {

}
