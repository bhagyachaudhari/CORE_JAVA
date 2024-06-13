package org.example.designpatterns.structural.adapter;

public class Client {

    public static void main(String[] args) {

        //Old code
        /*PhonePay phonePay = new PhonePay(new YesBankAPI());
        phonePay.print();*/

        // Suddenly, phone pay decides to switch to ICICI Bank API

        PhonePay phonePay = new PhonePay(new ICICIBankAdapter());
        phonePay.print();

        PhonePay phonePay1 = new PhonePay(new YesBankAdapter());
        phonePay1.print();
    }
}
