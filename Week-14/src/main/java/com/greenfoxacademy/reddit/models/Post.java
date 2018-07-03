package com.greenfoxacademy.reddit.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter

@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;
    private LocalDateTime timestamp;
    private Long score;

    public Post(String title, String url, Date timestamp, Long score) {
        this.title = title;
        this.url = url;
        this.timestamp = LocalDateTime.now();
        this.score = score;
    }

    public Post() {
    }
}
