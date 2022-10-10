package fr.lernejo.guessgame;
import fr.lernejo.logger.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("Simulation");
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

    public void loopUntilPlayerSucceed(long maxI) {
        Long currentStartTime = System.currentTimeMillis();
        boolean round=false;

        while(maxI!=0){

            if(round){
                break;
            }
            round=nextRound();
            maxI--;
        }

        if(maxI==0){
            logger.log("You have exhausted all your attempts! END OF THE PART!!!");
        }

        Long currentEndTime = System.currentTimeMillis();
        Long currentTime = currentEndTime - currentStartTime;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("mm:ss:SS");
        Date date = new Date(currentTime);
        String time = simpleDateFormat.format(date);
        System.out.println("This part takes:"+time);
    }
}
