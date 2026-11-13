import java.util.*;

public class SimContestant {
    
    private int myInitialGuess;
    //private boolean stay = true;
    private Random myRandoms;
    
    public SimContestant (Random randoms) {
        myRandoms = randoms;
    }
    
    // The contestant makes his/her first guess.
    public int guess1 ( ) {
        myInitialGuess = myRandoms.nextInt(3) + 1;
        return myInitialGuess;
    }
    
    //The contestant sticks, switches, or randomly 
    //sticks or switches. You find the percentages
    // 0 is random, 1 is stay, 2 is switch
    public int guess2 (int openedDoor, int stay) {
        if (stay == 0) {
            int option = myRandoms.nextInt(2)+1;
            if (option == 1){
                return myInitialGuess;
            } else {
                return 6 - (openedDoor + myInitialGuess);
            } 
        } else {
            if (stay == 1){
                return myInitialGuess;
            } else {
                return 6 - (openedDoor + myInitialGuess);
            } 
        }
    }
}
