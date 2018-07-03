package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;

import java.util.List;

public interface PostServices {
    List<Post> getAllPosts();

    void add(Post newPost);
}
