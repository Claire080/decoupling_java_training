package fr.lernejo.guessgame;
import fr.lernejo.logger.*;
import java.util.Scanner;

public class HumanPlayer implements Player{
    private final Logger logger=new LoggerFactory().getLogger("player");

    public long askNextGuess(){
        System.out.println("Try to guess the number");
        Scanner scanner = new Scanner(System.in);
        /*logger.log("the user already enter his number");*/
        return scanner.nextLong();
    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater){
            System.out.println("is Greater");
        }

        else{
            System.out.println("is lower");
        }
    }

}
