package threadscommunication;

public class Queue {
    private int product;
    boolean empty = true;

    public Queue() {
    }

    public synchronized void send(int product) {
        while (!empty) {

            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("send: " + product);
        this.product = product;
        empty = false;
        notify();
    }

    public synchronized int getProduct() {
        while (empty) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("get: " + product);
        empty = true;
        notify();

        return product;
    }
}
