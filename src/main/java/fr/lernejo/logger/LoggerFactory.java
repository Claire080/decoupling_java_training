package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {

    public static Logger getLogger(String name){
        Predicate<String> condition= message-> message.contains("Simulation");
        return new ContextualLogger(new CompositeLogger(new FilteredLogger(new FileLogger("logger.log"),condition), new ConsoleLogger()),name);
    }
}
