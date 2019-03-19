package by.epam.javatraining.threads.secondway;

import java.util.Random;

public class SecondThread implements Runnable {
    /*Disadvantage of this way - we can not use
     *functionality of thread
     * */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" child thread 2");
            // Cause we overwrite method run(), and method don't throws
            // exceptions
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end child thread 2");
    }
}
