package com.greenfoxacademy.todoh2;

import com.greenfoxacademy.todoh2.model.ToDo;
import com.greenfoxacademy.todoh2.repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Todoh2Application implements CommandLineRunner {

    private final ToDoRepository toDoRepository;

    @Autowired
    public Todoh2Application(ToDoRepository toDoRepository){
        this.toDoRepository = toDoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(Todoh2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        toDoRepository.save(new ToDo("Start the day", true, true));
        toDoRepository.save(new ToDo("Finish H2 Workshop1", true, true));
        toDoRepository.save(new ToDo("Finish JPA Workshop2", false, false));
        toDoRepository.save(new ToDo("Create a CRUD Project", false, false));
    }
}
