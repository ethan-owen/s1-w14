import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    private boolean stay;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = -1;//do this ...;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    public int guess2 (int openedDoor) {
        if (stay){
            return myInitialGuess;
        } else {
            return 6 
        }
    }
}
