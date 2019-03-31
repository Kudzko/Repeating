package a_writerprinter;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Printer {

    public  /*synchronized  object of synchronization printer
    when we can synchronize object. otherwise we use block of synchronization*/ void print
    (String text){

        try {

        System.out.print("[");
        for (int i  = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));

               // Thread.sleep(new Random().nextInt(100));
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(100));
        }
        System.out.println("]");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
