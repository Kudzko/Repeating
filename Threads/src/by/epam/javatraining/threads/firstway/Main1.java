package by.epam.javatraining.threads.firstway;

import java.util.Random;

public class Main1 {
    public static void main(String[] args) {
        // to run thread - create instance
        FirstThread firstThread = new FirstThread();
        // then create thread with method start, witch call method run()
        // of class FirstThread
        firstThread.start();

    //    new  FirstThread().start();

        for (int i = 0; i < 10; i++){
            System.out.println(" main thread ");
            // we can manage by thread
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end main thread");
    }
}
