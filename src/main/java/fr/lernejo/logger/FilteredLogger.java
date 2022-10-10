package fr.lernejo.logger;
import java.util.function.Predicate;

public class FilteredLogger implements Logger{

    Logger logger;
    Predicate<String> condition;

    public FilteredLogger(Logger logger, Predicate<String> condition) {
        this.logger=logger;
        this.condition=condition;
    }

    public void log(String message){
        
    }
}
