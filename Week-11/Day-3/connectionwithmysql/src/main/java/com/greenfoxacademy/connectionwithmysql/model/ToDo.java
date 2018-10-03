package com.greenfoxacademy.connectionwithmysql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
    public class ToDo {
        @Id
        @GeneratedValue
        private Long id;
        private String title;
        private Boolean urgent;
        private Boolean done;
        private LocalDateTime creationTime;
        private Date dueDate;

        @ManyToOne
        Assignee assignee;

        public ToDo(String title, Boolean urgent, Boolean done, Date dueDate) {
            this.title = title;
            this.urgent = urgent;
            this.done = done;
            this.assignee = null;
            this.creationTime = LocalDateTime.now();
            this.dueDate = dueDate;
        }

    public ToDo(String title, Boolean urgent, Boolean done, Assignee assignee, Date dueDate) {
        this.title = title;
        this.urgent = urgent;
        this.done = done;
        this.assignee = assignee;
        this.creationTime = LocalDateTime.now();
        this.dueDate = dueDate;

    }

    public ToDo(String title) {
            this.title = title;
            this.urgent = false;
            this.done = false;
            this.assignee = null;
            this.creationTime = LocalDateTime.now();
            this.dueDate = null;
        }

    public ToDo() {
        this.creationTime = LocalDateTime.now();
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public void setId(Long id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setUrgent(Boolean urgent) {
            this.urgent = urgent;
        }

        public void setDone(Boolean done) {
            this.done = done;
        }

        public Long getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public Boolean getUrgent() {
            return urgent;
        }

        public Boolean getDone() {
            return done;
        }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
