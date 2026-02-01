package my.practice.multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(2);  // Capacity of 2
        new Thread(new QProducer(queue)).start();
        new Thread(new QConsumer(queue)).start();
    }


}
