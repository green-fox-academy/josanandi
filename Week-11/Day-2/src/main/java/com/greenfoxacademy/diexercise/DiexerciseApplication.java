package com.greenfoxacademy.diexercise;

import com.greenfoxacademy.diexercise.service.MyColor;
import com.greenfoxacademy.diexercise.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiexerciseApplication implements CommandLineRunner {
    @Autowired
    Printer printer;


    public static void main(String[] args) {
        SpringApplication.run(DiexerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("Hello");

    }
}
