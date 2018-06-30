package com.greenfoxacademy.frontend.models;

import org.springframework.stereotype.Component;

@Component
public class DoUntil {
    private Integer until;
    private Integer result;

    public DoUntil() {
    }

    public DoUntil(Integer until, String input) {
        this.until = until;
        if (input.equals("sum")){
          this.result = 0;
        }
        else if (input.equals("factor")){
           this.result = 1;
        }

    }

    public void setResult(String input) {
        if (input.equals("sum")){
            for (int i = 0; i <= until ; i++) {
                this.result += i;
            }
        }
        else if (input.equals("factor")){
            for (int i = 1; i <= until ; i++) {
                this.result *= i;
            }
        }

    }


}
