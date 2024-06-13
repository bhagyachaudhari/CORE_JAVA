package org.example.designpatterns.structural.adapter;

public class YesBankAPI {

    public double getBalance(){
        return 10;
    }

    public void transferMoney(){
        System.out.println("YesBank: Money transfer...");
    }
}
