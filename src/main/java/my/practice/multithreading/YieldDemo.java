package my.practice.multithreading;

public class YieldDemo implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - iteration " + i);
            Thread.yield(); // Hint to scheduler
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new YieldDemo(), "Thread-A");
        Thread t2 = new Thread(new YieldDemo(), "Thread-B");

        t1.start();
        t2.start();
    }
}
