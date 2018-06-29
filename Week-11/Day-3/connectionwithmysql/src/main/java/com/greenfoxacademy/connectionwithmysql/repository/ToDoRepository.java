package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
    List<ToDo> findAllByDone(Boolean done);

    List<ToDo> findAllByTitle(String title);

    List<ToDo> findAllByTitleContaining(String title);
}
