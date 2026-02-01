package my.practice.multithreading;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityBlockingQueueExample {

    public static void main(String[] args) throws InterruptedException, IllegalArgumentException {

        PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        // Producer thread: adds tasks
        Thread producer = new Thread(() -> {
            String[] tasks = {"Task1", "Task2", "Task3", "Task4", "Task5"};
            int[] priorities = {3, 1, 4, 2, 5};

            for (int i = 0; i < tasks.length; i++) {
                Task task = new Task(tasks[i], priorities[i]);
                queue.add(task);
                System.out.println("Produced: " + task);
                try {
                    Thread.sleep(100); // simulate delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            queue.add(new Task("FinalTask", 6));
        });

        // Consumer thread: processes tasks
        Thread consumer = new Thread(() -> {
            while (true) {
                try {
                    Task task = queue.take(); // blocks if empty
                    System.out.println("Consumed: " + task);
                    if(task.getName().equals("FinalTask")) {
                        break;
                    }
                    Thread.sleep(200); // simulate task processing
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    break;
                }
            }
        });

        producer.start();
        producer.join();
        consumer.start();
    }
}

