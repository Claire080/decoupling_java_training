package fr.lernejo.guessgame;
import fr.lernejo.logger.*;


public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;
    private long numberToGuess;

    public Simulation(Player player) {
        this.player=player;
    }

    public void initialize(long numberToGuess) {
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        long pGuest= player.askNextGuess();
        if(pGuest==numberToGuess){
            logger.log("the user found the guess number");
            return true;
        }

        else if(pGuest<numberToGuess){
           player.respond(true);
        }

        else if(pGuest>numberToGuess){
            player.respond(false);
        }

        logger.log("the user doesn't found the guess number");
        return false;
    }

    public void loopUntilPlayerSucceed() {
        boolean round=false;
        while(!round){
            round=nextRound();
        }
    }
}
