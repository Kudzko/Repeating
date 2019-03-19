package by.epam.javatraining.threads.firstway;

import java.util.Random;

public class FirstThread extends Thread {

    /*Disadvantage of this way - don't match SRP
    * and we cann't extends any class
    * */
    @Override
    public void run() {
       for (int i = 0; i < 10; i++){
           System.out.println(" child thread ");
           // Cause we overwrite method run(), and method don't throws
           // exceptions
           try {
               Thread.sleep(new Random().nextInt(100));
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }

        System.out.println("end child thread");
    }
}
