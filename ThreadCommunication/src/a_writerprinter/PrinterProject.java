package a_writerprinter;

public class PrinterProject {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Writer[] writers = new Writer[5];
        String[] strings = {"first", "second", "third", "fourth", "fifth"};

        for (int i = 0; i < writers.length; i++){
            writers[i] = new Writer(strings[i], printer );

        }

    }
}
