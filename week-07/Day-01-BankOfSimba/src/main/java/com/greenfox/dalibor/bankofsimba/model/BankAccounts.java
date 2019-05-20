package com.greenfox.dalibor.bankofsimba.model;

import java.util.ArrayList;
import java.util.List;

public class BankAccounts {
    private List<BankAccount> accounts;

    public BankAccounts() {
        this.accounts = new ArrayList<>();
        accounts.add(new BankAccount("Simba",2000,"lion"));
        accounts.add(new BankAccount("Timon",500,"surikata"));
        accounts.add(new BankAccount("Pumbaa",700,"warthog"));
        accounts.add(new BankAccount("Scar",3000,"lion"));
        accounts.add(new BankAccount("Mufasa",10568,"lion"));
        accounts.add(new BankAccount("Azizi",350,"dog"));
        accounts.get(4).makeKing();
    }

    public List<BankAccount> getAccounts() {
        return accounts;
    }
}
