package threadscommunication;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    Queue queue;
    Thread thread;


    public Producer(Queue queue) {
        this.queue = queue;
        thread = new Thread(this);
        thread.start();

    }

    @Override
    public void run() {
        int product = 0;

        try {


            while (true) {
                TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
                queue.send(product++);
            }

        } catch (InterruptedException e) {
            // log
        }


    }
}
