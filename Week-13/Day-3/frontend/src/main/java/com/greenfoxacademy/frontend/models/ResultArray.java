package com.greenfoxacademy.frontend.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ResultArray {
    private Integer result;
    private List<Integer> resultlist;

    public ResultArray() {
        resultlist = new ArrayList<>();
    }

    public ResultArray(ArraySender arraySender) {
        if (arraySender.getWhat().equals("sum")) {
            this.result = 0;
        } else if (arraySender.getWhat().equals("multiply")) {
            this.result = 1;
        } else if (arraySender.getWhat().equals("double")) {
            this.resultlist = new ArrayList<>();
        }
    }

    public Integer getResult() {
        return result;
    }

    public List<Integer> getResultlist() {
        return resultlist;
    }

    public void setResult(ArraySender arraySender) {
        if (arraySender.getWhat().equals("sum")) {
            for (Integer number : arraySender.getNumbers()) {
                this.result += number;
            }
        } else if (arraySender.getWhat().equals("multiply")) {
            for (Integer number : arraySender.getNumbers()) {
                this.result *= number;
            }
        } else if (arraySender.getWhat().equals("double")) {
            for (Integer number : arraySender.getNumbers()) {
                this.resultlist.add(number * number);
            }
        }
    }

}
