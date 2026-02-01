package my.practice.multithreading;

public class DaemonDemo {
    public static void main(String[] args) {
        Thread daemon = new Thread(new DaemonTask(), "Daemon-Thread");
        daemon.setDaemon(true); // MUST call before start()

        daemon.start();

        System.out.println("Main thread is finishing in 3 seconds...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}
        System.out.println("Main thread finished. JVM will exit since only daemon remains.");
    }
}
