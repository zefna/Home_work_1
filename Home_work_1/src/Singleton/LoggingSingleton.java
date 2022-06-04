package Singleton;

public class LoggingSingleton {

    private static LoggingSingleton logging;

    public static Class clas;

    public LoggingSingleton(){
    }
    public static Class<? extends LoggingSingleton> getInstance(){
        if (logging == null) {
            logging = new LoggingSingleton();
        }
        Class<? extends LoggingSingleton> l = logging.getClass();
        return l;
    }
}
