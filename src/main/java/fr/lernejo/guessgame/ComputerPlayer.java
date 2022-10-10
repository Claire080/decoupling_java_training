package fr.lernejo.guessgame;

import fr.lernejo.logger.ConsoleLogger;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class ComputerPlayer implements Player{

    private final Logger logger=new LoggerFactory().getLogger("ComputerPlayer");
    public long bornInf=Long.MIN_VALUE;
    public long bornSup=Long.MAX_VALUE;
    public long middle=0;

    public long askNextGuess(){
        middle=(bornSup+bornInf)/2;
        logger.log(""+middle);
        return middle;
    }

    public void respond(boolean lowerOrGreater){

        if(lowerOrGreater){
            bornInf=middle;
        }

        else{
            bornSup=middle;
        }
    }
}
