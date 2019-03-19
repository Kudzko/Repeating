package by.epam.javatraining.threads.thirdway;

import java.util.Random;

public class ThirdThread implements Runnable {
    private Thread thread;
    private volatile boolean flow = true; // to forbid jvm copy value

    public ThirdThread() {
       thread = new Thread(this);
       thread.start();
    }

        @Override
    public void run() {
        while (flow){
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread created by third way");
        }
    }

    public Thread getThread() {
        return thread;
    }

    public void stopThread() {
        this.flow = false;
    }
}
