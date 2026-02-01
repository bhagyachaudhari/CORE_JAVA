package my.practice.multithreading;

public class Main {

    public static void main(String[] args) {
        Account from = new Account(101, 1000.0);
        Account to = new Account(102, 500.0);
        Runnable thread1 = () -> {
            try {
                FundTransferService.transfer(from, to, 100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        thread1.run();

        Runnable thread2 = () -> {
            try {
                FundTransferService.transfer(from, to, 200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };
        thread2.run();
    }
}
