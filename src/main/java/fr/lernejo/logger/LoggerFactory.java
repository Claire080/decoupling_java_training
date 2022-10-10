package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name){
        return new ContextualLogger(new CompositeLogger(new FileLogger("logger.log"), new ConsoleLogger()),name);
    }
}
