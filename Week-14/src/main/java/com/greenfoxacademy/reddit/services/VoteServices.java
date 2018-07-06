package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Vote;

import java.util.List;

public interface VoteServices {
    void addUpvote(String username);

    void addDownVote(String username);

    List<Vote> getAllVotes();
}
