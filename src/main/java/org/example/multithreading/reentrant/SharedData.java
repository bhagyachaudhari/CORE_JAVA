package org.example.multithreading.reentrant;

import java.util.concurrent.locks.ReentrantReadWriteLock;

class SharedData {
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int data = 0;

    void read() {
        lock.readLock().lock();
        try {
            System.out.println("Reading: " + data);
        } finally {
            lock.readLock().unlock();
        }
    }

    void write(int value) {
        lock.writeLock().lock();
        try {
            data = value;
            System.out.println("Writing: " + data);
        } finally {
            lock.writeLock().unlock();
        }
    }
}
