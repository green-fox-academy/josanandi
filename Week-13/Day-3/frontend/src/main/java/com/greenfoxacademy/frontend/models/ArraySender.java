package com.greenfoxacademy.frontend.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ArraySender {
    private String what;
    private List<Integer> numbers;

    public ArraySender() {
        this.numbers = new ArrayList<>();
    }

    public ArraySender(String what, List<Integer> numbers) {
        this.what = what;
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
