package my.practice.multithreading;

class Producer extends Thread {
    Shared s;
    Producer(Shared s) { this.s = s; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                s.produce(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
