package org.example.oop.coupling;

public class PaymentService {
    private Database db;

    public PaymentService(Database db) {
        this.db = db;
    }

    public void processPayment() {
        db.connect();
        System.out.println("Processing payment...");
    }

    public static void main(String[] args) {
        Database database = new MySQLDatabase();
        PaymentService paymentService = new PaymentService(database);
        paymentService.processPayment();
    }
}
