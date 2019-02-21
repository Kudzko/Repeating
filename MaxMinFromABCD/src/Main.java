import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int bound = 10;
        Random random = new Random();
        int a = random.nextInt(bound);
        int b = random.nextInt(bound);
        int c = random.nextInt(bound);
        int d = random.nextInt(bound);

        int max = MaxMinFromABCD.findMax(a,b,c,d);
        int min = MaxMinFromABCD.findMin(a,b,c,d);

        System.out.println("a = "+ a +", b = " + b +", c = " + c + ", d = " + d);
        System.out.println("max :" + max);
        System.out.println("min :" + min);

        a = random.nextInt(bound);
        b = random.nextInt(bound);
        c = random.nextInt(bound);
        d = random.nextInt(bound);

         max = MaxMinFromABCDvTwo.findMax(a,b,c,d);
         min = MaxMinFromABCDvTwo.findMin(a,b,c,d);

        System.out.println("a = "+ a +", b = " + b +", c = " + c + ", d = " + d);
        System.out.println("max :" + max);
        System.out.println("min :" + min);
    }
}
