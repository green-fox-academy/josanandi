package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.Vote;
import com.greenfoxacademy.reddit.services.PostServices;
import com.greenfoxacademy.reddit.services.VoteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {

    PostServices postServices;
    VoteServices voteServices;

    @Autowired
    public PostsController(PostServices postServices, VoteServices voteServices) {
        this.postServices = postServices;
        this.voteServices = voteServices;
    }

    @GetMapping("/posts")
    public List<Post> getMainPage(@RequestHeader("username") String username){
        return postServices.getAllPosts();
    }

//    @GetMapping("/postsbyuseractivity")
//    public List<Post> getUserActivity(@RequestHeader("username") String username){
//    }

    @PostMapping("/addnewpost")
    public List<Post> addNewPost(@RequestBody (required = false) Post newPost, @RequestHeader("username") String username){
        postServices.add(newPost);
        return postServices.getAllPosts();
    }

    @PutMapping("/posts/{id}/upvote")
    public List<Vote> upvotePost(@PathVariable Long id, @RequestHeader("username") String username){
        voteServices.addUpvote(username);
        Post actualPost = postServices.getPostById(id);
        actualPost.setScoreUpvote();
        postServices.add(actualPost);
        return voteServices.getAllVotes();
    }

    @PutMapping("/posts/{id}/downvote")
    public List<Post> downvotePost(@PathVariable Long id, @RequestHeader("username") String username){
        voteServices.addDownVote(username);
        Post actualPost = postServices.getPostById(id);
        actualPost.setScoreDownVote();
        postServices.add(actualPost);
        return postServices.getAllPosts();
    }




}
