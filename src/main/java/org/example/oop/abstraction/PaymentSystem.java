package org.example.oop.abstraction;

public class PaymentSystem {

    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.processPayment(100.0);

        payment = new PayPalPayment();
        payment.processPayment(200.0);
    }
}
