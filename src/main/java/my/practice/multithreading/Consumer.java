package my.practice.multithreading;

class Consumer extends Thread {
    Shared s;
    Consumer(Shared s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                s.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
