package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostsController {

    PostServices postServices;

    @Autowired

    public PostsController(PostServices postServices) {
        this.postServices = postServices;
    }

    @GetMapping("/reddit")
    private List<Post> getMainPage(){
        return postServices.getAllPosts();
    }

    
}
