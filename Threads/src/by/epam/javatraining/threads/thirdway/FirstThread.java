package by.epam.javatraining.threads.thirdway;

import java.util.Random;

public class FirstThread extends Thread {

    public FirstThread() {
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++){
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread :"+ this.getName() );
        }
        System.out.println("End Thread " + this.getName());
    }
}
