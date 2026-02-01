package my.practice.multithreading;

class DaemonTask implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " is running in background...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Daemon thread interrupted");
            }
        }
    }
}
