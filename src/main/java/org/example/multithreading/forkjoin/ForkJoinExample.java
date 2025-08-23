package org.example.multithreading.forkjoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumTask extends RecursiveTask<Integer> {
    int start, end;

    SumTask(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (end - start <= 10) {  // Small enough to compute directly
            int sum = 0;
            for (int i = start; i <= end; i++) sum += i;
            return sum;
        }

        int mid = (start + end) / 2;
        SumTask left = new SumTask(start, mid);
        SumTask right = new SumTask(mid + 1, end);

        left.fork();  // Compute in parallel
        return right.compute() + left.join();
    }
}

public class ForkJoinExample {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int result = pool.invoke(new SumTask(1, 100));
        System.out.println("Sum = " + result);
    }
}
