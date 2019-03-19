package by.epam.javatraining.threads.secondway;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {


        // create instance of our thread
        SecondThread secondThread = new SecondThread();
        // give it to Thread, to run and manipulate thread
        Thread thread = new Thread(secondThread);
        // and then start
        thread.start();


//        Thread thread2 = new Thread(new SecondThread());
//        thread2.start();


//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(" doing something");
//
//            }
//        }).start();


        for (int i = 0; i < 10; i++) {
            System.out.println(" main thread 2");
            // we can manage by thread
            try {
                Thread.sleep(new Random().nextInt(100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end main thread 2");

    }
}
