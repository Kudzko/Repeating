package by.epam.javatraining.threads.thirdway;

import java.util.Random;

public class SecondThread implements Runnable {
    private  Thread thread;

    public SecondThread() {
        thread = new Thread(this);
        thread.start();
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++){
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Child thread");
        }
        System.out.println("End child thread");
    }
}
