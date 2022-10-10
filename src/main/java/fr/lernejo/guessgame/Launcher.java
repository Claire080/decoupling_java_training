package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {

    public static void main(String[] args){

        Player HPlayer=new HumanPlayer();
        Player CPlayer=new ComputerPlayer();
        Simulation simulation;


        if(args.length==1 && args[0].equals("-interactive")){
            simulation=new Simulation(HPlayer);

            SecureRandom random = new SecureRandom();
            long randomNumber = random.nextLong(100);

            System.out.println("Computer generes the guess number...");
            simulation.initialize(randomNumber);

            simulation.loopUntilPlayerSucceed(Long.MAX_VALUE);
        }


        else if(args.length==2 && args[0].equals("-auto")){
            try{
                simulation=new Simulation(CPlayer);

                long NumberInArgs=Long.parseLong(args[1]);

                System.out.println("The guess number have been already choosen");
                simulation.initialize(NumberInArgs);

                simulation.loopUntilPlayerSucceed(1000);
            }

            catch ( NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

        else{
            System.out.print("Type <<javac -cp target/classes fr.lernejo.guessgame.Launcher -interactive>> to launch interactif mode");
            System.out.print(" and <<javac -cp target/classes fr.lernejo.guessgame.Launcher -auto NumberToGuess>> to choose the Guess number");
        }
        /*Trouver la bonne syntaxe pour éxecuter le code*/
    }
}
