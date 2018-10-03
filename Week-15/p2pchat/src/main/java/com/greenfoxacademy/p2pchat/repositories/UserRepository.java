package com.greenfoxacademy.p2pchat.repositories;

import com.greenfoxacademy.p2pchat.models.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findUserByUsername(String username);

//    Optional findByUsername(String username);
}
