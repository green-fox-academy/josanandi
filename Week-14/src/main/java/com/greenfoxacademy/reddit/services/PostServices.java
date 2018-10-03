package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostServices {
    List<Post> getAllPosts();

    void add(Post newPost);

    Post getPostById(Long id);

    void setScoreAndVoteUpvote(Long id, String username);

    void setScoreAndVoteDownvote(Long id, String username);
}
