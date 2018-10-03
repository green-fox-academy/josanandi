package com.greenfoxacademy.cargo;

import org.springframework.stereotype.Component;

@Component
public class ShipStatus {
    private String received;
    private Integer amount;
    private Integer shipStatus;
    private boolean ready;

    public ShipStatus() {
    }

    public ShipStatus(String received, Integer amount) {
        this.received = received;
        this.amount = amount;
        Integer status = (amount/12500)*100;
        this.shipStatus = status;
        if (this.amount<12500){
            this.ready = false;
        }
        else this.ready =true;
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Integer getShipStatus() {
        return shipStatus;
    }
//
//    public void setShipStatus(String shipStatus) {
//        this.shipStatus = shipStatus;
//    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }
}
