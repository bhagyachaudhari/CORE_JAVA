import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test3 {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        Thread t1 = new Thread(()->{

            try {
                queue.put(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //queue.take();

        }, "THREAD-1");

    }
}
