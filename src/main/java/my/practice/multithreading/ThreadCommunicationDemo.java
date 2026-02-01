package my.practice.multithreading;

public class ThreadCommunicationDemo {
    public static void main(String[] args) {
        Shared s = new Shared();
        new Producer(s).start();
        new Consumer(s).start();

       /* Shared1 s1 = new Shared1();
        new Producer(s1).start();
        new Consumer(s1).start();*/
    }
}
