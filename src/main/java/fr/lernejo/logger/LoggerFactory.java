package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(Logger logger,String name){
        return new ContextualLogger(logger,name);
    }
}
