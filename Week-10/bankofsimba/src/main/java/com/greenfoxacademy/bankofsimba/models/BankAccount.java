package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private boolean isKing;
    private boolean isGoodGuy;

    public BankAccount() {
    }

    public BankAccount(String name, double balance, String animalType, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isKing = false;
        this.isGoodGuy = isGoodGuy;

    }

    public String getName() {
        return name;
    }

    public double    getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }

    public void setGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }
}
