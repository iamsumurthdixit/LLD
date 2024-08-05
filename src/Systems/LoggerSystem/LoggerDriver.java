package Systems.LoggerSystem;

public class LoggerDriver {
    public static void driver() {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logObject.log(LogProcessor.ERROR, "error");  // [ERROR] error
        logObject.log(LogProcessor.DEBUG, "debug"); //  [DEBUG] debug
        logObject.log(LogProcessor.INFO, "info");    // [INFO] info
        logObject.log(5, "invalid arguments"); // nothing printed
    }
}
