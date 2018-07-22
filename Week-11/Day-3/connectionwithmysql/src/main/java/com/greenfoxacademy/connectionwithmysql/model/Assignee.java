package com.greenfoxacademy.connectionwithmysql.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Assignee {

    @Id
    @GeneratedValue
    Long id;
    String name;
    String email;

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setId(Long idx) {
        this.id  = idx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String emailById) {
        this.email = emailById;
    }
}
