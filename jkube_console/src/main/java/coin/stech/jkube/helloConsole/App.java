package coin.stech.jkube.helloConsole;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        logger.info("Application - Started");
        System.out.println("Hello Jkube World Console!");
        logger.info("Application - End of main function");
        System.exit(0);
    }
}
