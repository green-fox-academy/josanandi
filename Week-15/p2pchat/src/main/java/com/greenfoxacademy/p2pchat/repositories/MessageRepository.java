package com.greenfoxacademy.p2pchat.repositories;

import com.greenfoxacademy.p2pchat.models.Message;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Message, Double> {
    List<Message> findAllByUsername(String username);
}
