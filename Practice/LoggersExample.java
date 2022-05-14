import java.util.logging.*;

public class LoggersExample {
       
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("LoggersExample.class");
        logger.info("This is an information Log");
        logger.warning("Warning Log");
        logger.log(Level.FINE, "Ola");
        logger.log(Level.SEVERE, "Danger");
        logger.log(Level.WARNING, "This is my warning");

        // logger.
    }
}
