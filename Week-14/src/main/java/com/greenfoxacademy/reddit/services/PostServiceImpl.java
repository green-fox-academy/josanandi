package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.Vote;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostServiceImpl implements PostServices {


    PostRepository postRepository;


    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getAllPosts() {
        return (List<Post>) postRepository.findAll();
    }

    @Override
    public void add(Post newPost) {
        postRepository.save(newPost);
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.findById(id).get();
    }

    @Override
    public void setScoreAndVoteUpvote(Long id, String username) {
        Post actualPost = getPostById(id);
        actualPost.setScoreUpvote();
        Vote vote = new Vote(username);
        vote.setVoteUpvote();
        actualPost.votelist.add(vote);
        postRepository.save(actualPost);
    }

    public void setScoreAndVoteDownvote(Long id, String username){
        Post actualPost = getPostById(id);
        actualPost.setScoreDownVote();
        Vote vote = new Vote(username);
        vote.setVoteDownvote();
        actualPost.votelist.add(vote);
        postRepository.save(actualPost);
    }

}