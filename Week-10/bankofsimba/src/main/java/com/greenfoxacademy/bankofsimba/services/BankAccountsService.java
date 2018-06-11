package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankAccountsService implements BankService {
    ArrayList<BankAccount> list = new ArrayList<>() ;

    @Override
    public void create() {
        list.add(new BankAccount("Simba", 2000.00, "lion", true));
        list.add(new BankAccount("Nala", 1000.00, "lion", true));
        list.add(new BankAccount("Scar", 4000.00, "lion", false));
        list.add(new BankAccount("Timon", 50.00, "meerkat", true));
        list.add(new BankAccount("Pumbaa", 1000.00, "warthdog", true));
        for (BankAccount account:list) {
            if (account.getName() == "Simba"){
                account.setKing(true);
            }
        }
    }

    @Override
    public void add(BankAccount bankAccount) {
        list.add(bankAccount);
    }

    @Override
    public ArrayList<BankAccount> getAllAcccount() {
        return list;
    }

    @Override
    public ArrayList<String> getAllAcccountNames() {
        ArrayList<String> namelist= new ArrayList<>();
        for (BankAccount listaccount: list) {
            namelist.add(listaccount.getName());
        }
        return namelist;
    }

    @Override
    public void raiseBalance(BankAccount account) {
        for (BankAccount listAccount: this.list) {
           if(listAccount.getName().equals(account.getName())){
               if (listAccount.isKing()){
                   listAccount.setBalance(listAccount.getBalance()+100);
               }
               else{
                   listAccount.setBalance(listAccount.getBalance()+10);
               }
           }
        }
    }
}
