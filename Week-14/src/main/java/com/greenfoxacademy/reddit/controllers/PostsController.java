package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    PostServices postServices;

    @Autowired

    public PostsController(PostServices postServices) {
        this.postServices = postServices;
    }

    @GetMapping("/posts")
    private List<Post> getMainPage(){
        return postServices.getAllPosts();
    }

    @PostMapping("/addnewpost")
    private List<Post> addNewPost(@RequestBody (required = false) Post newPost){
        postServices.add(newPost);
        return postServices.getAllPosts();
    }

    @PutMapping("/posts/{id}/upvote")
    private List<Post> upvotePost(@PathVariable Long id){
        Post actualPost = postServices.getPostById(id);
        actualPost.setScoreUpvote();
        postServices.add(actualPost);
        return postServices.getAllPosts();
    }

    @PutMapping("/posts/{id}/downvote")
    private List<Post> downvotePost(@PathVariable Long id){
        Post actualPost = postServices.getPostById(id);
        actualPost.setScoreDownVote();
        postServices.add(actualPost);
        return postServices.getAllPosts();
    }


}
