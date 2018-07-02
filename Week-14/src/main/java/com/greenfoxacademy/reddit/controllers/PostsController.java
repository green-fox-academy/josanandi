package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.services.PostServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostsController {

    PostServices postServices;
    
    @Autowired

    public PostsController(PostServices postServices) {
        this.postServices = postServices;
    }
}
