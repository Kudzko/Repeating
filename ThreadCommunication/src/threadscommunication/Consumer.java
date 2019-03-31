package threadscommunication;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Consumer implements Runnable {
    private Queue queue;
    private Thread thread;


    public Consumer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {


            while (true) {
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
                queue.getProduct();
            }

        } catch (InterruptedException e) {
            // log
        }
    }
}
