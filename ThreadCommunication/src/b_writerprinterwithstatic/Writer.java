package b_writerprinterwithstatic;

public class Writer implements Runnable {
    private String text;
    private Thread thread;

    public Writer(String text) {
        this.text = text;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {

        Printer.print(text);


    }

}
