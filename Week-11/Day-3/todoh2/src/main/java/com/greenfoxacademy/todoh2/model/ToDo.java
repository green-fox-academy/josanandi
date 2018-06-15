package com.greenfoxacademy.todoh2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor


@Entity
public class ToDo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private Boolean urgent;
    private Boolean done;

    public ToDo(String title, Boolean urgent, Boolean done) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
    }
}
