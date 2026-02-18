package org.example.designpatterns.structural.adapter;


public class PhonePay {

    BankAPI bankAPI;


    public PhonePay(BankAPI bankAPI){
        this.bankAPI = bankAPI;
    }

    public void print(){
        System.out.println("balance: "+bankAPI.checkBalance());
        bankAPI.moneyTransfer();
    }
}

//Old code

/*public class PhonePay {

    YesBankAPI yesBankAPI;


    // old code
    public PhonePay(YesBankAPI yesBankAPI){
        this.yesBankAPI = yesBankAPI;
    }

    public void print(){
        System.out.println("balance: "+yesBankAPI.getBalance());
        yesBankAPI.transferMoney();
    }
}*/
