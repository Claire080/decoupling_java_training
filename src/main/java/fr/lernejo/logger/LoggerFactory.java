package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger log;

    public LoggerFactory(Logger logger){
        log=logger;
    }

    public static Logger getLogger(String name){
        return log;
    }
}
