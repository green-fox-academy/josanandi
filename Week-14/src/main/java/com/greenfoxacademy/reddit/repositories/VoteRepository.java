package com.greenfoxacademy.reddit.repositories;

import com.greenfoxacademy.reddit.models.Vote;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends CrudRepository<Vote, Long> {
}
