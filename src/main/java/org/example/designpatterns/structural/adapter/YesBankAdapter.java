package org.example.designpatterns.structural.adapter;

public class YesBankAdapter implements BankAPI{

    YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public void moneyTransfer() {
        yesBankAPI.transferMoney();
    }
}
