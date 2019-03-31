package a_writerprinter;

public class Writer implements Runnable {
    private String text;
    private Printer printer;
    private Thread thread;

    public Writer(String text, Printer printer) {
        this.text = text;
        this.printer = printer;
        thread = new Thread(this);
        thread.start();
    }

    public void write() {
        printer.print(text);
    }

    @Override
    public void run() {
        synchronized (printer) {
            // if Printer printer is not available for synchronization
            printer.print(text);
        }

    }
    /*
    * we also can synchronize threads on any object ( for example Object o
    * and pass it as a parameter in method run() in Thread)
    * only condition is that this object was one*/
}
