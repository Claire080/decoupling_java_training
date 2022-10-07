package fr.lernejo.guessgame;
import java.security.SecureRandom;

public class Launcher {

    public static void main(String args[]){

        Player player=new HumanPlayer();
        Simulation simulation=new Simulation(player);

        System.out.println("Computer generes the guess number...");
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextInt(100);
        simulation.initialize(randomNumber);

        simulation.loopUntilPlayerSucceed();
    }
}
