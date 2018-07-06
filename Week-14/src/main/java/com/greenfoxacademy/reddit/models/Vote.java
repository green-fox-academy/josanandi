package com.greenfoxacademy.reddit.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Vote {
    @Id
    @GeneratedValue
    private Long id;
    private Integer vote;
    private String username;


    public Vote() {
        this.vote = 0;
    }

    public Vote(String username) {
        this.username = username;
        this.vote = 0;
    }

    public Vote(Integer vote, String username) {
        this.vote = vote;
        this.username = username;
    }

    public void setVoteUpvote() {
        this.vote += 1;
    }

    public void setVoteDownvote() {
        this.vote -= 1;
    }

}
