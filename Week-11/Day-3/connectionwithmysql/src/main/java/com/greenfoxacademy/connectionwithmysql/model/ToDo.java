package com.greenfoxacademy.connectionwithmysql.model;

import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

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

        public ToDo(String title) {
            this.title = title;
            this.urgent = false;
            this.done = false;
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

        public Boolean isUrgent() {
            Boolean condition = false;
            if (this.urgent ) { condition = true;}
            return condition;
        }

        public Boolean isDone() {
            Boolean condition = false;
            if (this.done ) { condition = true;}
            return condition;
        }
    }
