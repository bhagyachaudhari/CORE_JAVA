package org.example.multithreading.reentrant;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    private final ReentrantLock lock = new ReentrantLock();

    void printNumbers(int n) {
        lock.lock();  // Lock the resource
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();  // Always unlock
        }
    }
}
