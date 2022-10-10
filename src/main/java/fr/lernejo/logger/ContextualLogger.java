package fr.lernejo.logger;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class ContextualLogger implements Logger{

    private final Logger logger;
    private String className;

    public ContextualLogger(Logger logger, String className){
        this.logger=logger;
        this.className=className;

    }

    public void log(String message){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        logger.log(LocalDateTime.now().format(formatter) + " " + className + " " + message);
    }
}
