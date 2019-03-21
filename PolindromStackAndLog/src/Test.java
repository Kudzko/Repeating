import org.apache.log4j.Logger;

public class Test {
    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        String[] wods = {"ABBA", "Abba", "AbcbA", "adsfagfsgasfа"};


        for (int i=0; i < wods.length; i++){
            LOGGER.info("Word " + i);
            PolindromChecker.checkPolindrom(wods[i]);
        }
    }
}
