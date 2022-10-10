package fr.lernejo.guessgame;
import fr.lernejo.logger.*;
import java.util.Scanner;



public class HumanPlayer implements Player{
    private final Logger logger=new LoggerFactory().getLogger("HumanPlayer");

    public long askNextGuess(){
        logger.log("Try to guess the number; it's between 0-100");
        Scanner scanner = new Scanner(System.in);
        //long number=scanner.nextLong();
        //logger.txt(""+number);
        return scanner.nextLong();
    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater){
            logger.log("the guess number is Greater");
        }

        else{
            logger.log("the guess number is lower");
        }
    }

}
