package org.example.designpatterns.structural.adapter;

public class ICICIBankAdapter implements BankAPI{

    ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    @Override
    public double checkBalance() {
        return iciciBankAPI.getBalance();
    }

    @Override
    public void moneyTransfer() {
        iciciBankAPI.transferMoney();
    }
}
