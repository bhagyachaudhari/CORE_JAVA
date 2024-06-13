package org.example.designpatterns.structural.adapter;

public class ICICIBankAPI {

    public double getBalance(){
        return 50;
    }

    public void transferMoney(){
        System.out.println("ICICIBank: Money transfer...");
    }
}
