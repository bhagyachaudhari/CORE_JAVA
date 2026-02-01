package my.practice.multithreading;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Account {
    private double balance;
    private final int id;
    private final Lock lock = new ReentrantLock();

    public Account(int id, double balance) {
        this.balance = balance;
        this.id = id;
    }

    // implement methods

    public void credit(double amount) {
        balance+=amount;
        System.out.println("Amount credited = " + amount + ", Current balance = " + balance);
    }

    public void debit(double amount) {
        balance-=amount;
        System.out.println("Amount debited = " + amount + ", Current balance = " + balance);
    }

    public double getBalance() {
        System.out.println("Current balance = "+balance);
        return balance;
    }

    public Lock getLock() {
        return lock;
    }

    public int getId() {
        return id;
    }
}

public class FundTransferService {
    public static void transfer(Account from, Account to, int amount) throws InterruptedException {

        Account firstLock = from.getId() < to.getId() ? from : to;
        Account secondLock = from.getId() < to.getId() ? to : from;

        /*firstLock.getLock().lock();
        secondLock.getLock().lock();*/
        firstLock.getLock().tryLock(1, TimeUnit.SECONDS);
        secondLock.getLock().tryLock(1, TimeUnit.SECONDS);

        try {
            if(amount > from.getBalance()) {
                throw new RuntimeException("Insufficient balance");
            }

            from.debit(amount);
            to.credit(amount);
        } finally {
            secondLock.getLock().unlock();
            firstLock.getLock().unlock();
        }

    }
}



