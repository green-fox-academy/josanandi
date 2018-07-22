package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceAssignee {
    List<Assignee> findAllAssignees();

    void saveAssignee(String name, String email);

    void remove(Long idx);

    Assignee findAssigneeById(Long idx);

    void edit(Assignee assignee);

    String findEmailById(Long idx);
}
