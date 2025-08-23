package org.example.multithreading.lockfree;

import java.util.concurrent.atomic.AtomicInteger;

class LockFreeCounter {
    private final AtomicInteger counter = new AtomicInteger(0);

    void increment() {
        counter.incrementAndGet();  // Thread-safe without locks
    }

    int get() {
        return counter.get();
    }
}
