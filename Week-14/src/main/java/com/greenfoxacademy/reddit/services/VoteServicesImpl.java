package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Vote;
import com.greenfoxacademy.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoteServicesImpl implements VoteServices {
    VoteRepository voteRepository;

    @Autowired

    public VoteServicesImpl(VoteRepository voteRepository) {
        this.voteRepository = voteRepository;
    }

    @Override
    public void addUpvote(String username) {
        Vote vote = new Vote(username);
        vote.setVoteUpvote();
        voteRepository.save(vote);
    }

    @Override
    public void addDownVote(String username) {
        Vote vote = new Vote(username);
        vote.setVoteDownvote();
        voteRepository.save(vote);
    }

    @Override
    public List<Vote> getAllVotes() {
        return (List<Vote>) voteRepository.findAll();
    }
}
