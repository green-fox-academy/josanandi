package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public interface BankService {
    public void create();
    public void add(BankAccount bankAccount);

    ArrayList<BankAccount> getAllAcccount();

}
