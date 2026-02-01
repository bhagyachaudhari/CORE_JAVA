package my.practice;

public class Test {

    public static void main(String[] args) throws InterruptedException {

        Producer t1 = new Producer();
        t1.setName("Worker-1");

        Producer t2 = new Producer();
        t2.setName("Worker-2");

        t1.start(); // Start first thread

        try {
            t1.join(); // Main thread waits for t1 to finish
            System.out.println("Main thread waited for Worker-1 to finish.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start(); // Start second thread

        try {
            Thread.sleep(1000); // Main sleeps 1 second
            t2.interrupt(); // Interrupts t2 while it's sleeping
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        Thread c = new Thread(new Consumer());
        Thread c1 = new Thread(new Consumer());

        c1.setPriority(Thread.MAX_PRIORITY);
        c.setPriority(Thread.MIN_PRIORITY);

        c.start();
        c1.start();

        System.out.println(c.isAlive());
        System.out.println("main thread");
    }
}

class Producer extends Thread {
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is going to sleep...");
            Thread.sleep(3000); // sleep for 3 seconds
            System.out.println(Thread.currentThread().getName() + " woke up and finished.");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted!");
        }
    }
}

class Consumer implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("Consumer Thread Name: " + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
