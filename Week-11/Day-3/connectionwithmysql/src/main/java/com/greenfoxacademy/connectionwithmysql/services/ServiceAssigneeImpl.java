package com.greenfoxacademy.connectionwithmysql.services;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceAssigneeImpl implements ServiceAssignee{
    AssigneeRepository assigneeRepository;

    @Autowired
    public ServiceAssigneeImpl(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    @Override
    public List<Assignee> findAllAssignees() {
        return (List<Assignee>) assigneeRepository.findAll();
    }

    @Override
    public void saveAssignee(String name, String email) {
        Assignee assignee =  new Assignee(name, email);
        assigneeRepository.save(assignee);
    }

    @Override
    public void remove(Long idx) {
        assigneeRepository.deleteById(idx);
    }

    @Override
    public Assignee findAssigneeById(Long idx) {
        return assigneeRepository.findById(idx).get();
    }

    @Override
    public void edit(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    @Override
    public String findEmailById(Long idx) {
        return assigneeRepository.findById(idx).get().getEmail();

    }

    @Override
    public Assignee findAssigneeByName(String assigneeName) {
        return assigneeRepository.findAssigneeByName(assigneeName);
    }
}
