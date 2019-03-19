package by.epam.javatraining.threads.thirdway;

import java.util.Random;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        ThirdThread thirdThread = new ThirdThread();

        firstThread.join();
        secondThread.getThread().join();
        thirdThread.getThread().join(2000);
        thirdThread.stopThread();


    }
}
