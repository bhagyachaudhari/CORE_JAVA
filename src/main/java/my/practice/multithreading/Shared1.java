package my.practice.multithreading;

class Shared1 {

    private boolean available = false;
    private int number;

    public synchronized void producer(int number) throws InterruptedException {

        while(available) {
            wait();
        }

        this.number = number;
        available = true;
        System.out.println("producer produced = " + number);
        notify();
    }

    public synchronized void consumer() throws InterruptedException {

        while(!available) {
            wait();
        }

        this.number = number;
        available = false;
        System.out.println("consumer consume = " + number);
        notify();
    }
}
