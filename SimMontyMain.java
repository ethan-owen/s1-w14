public class SimMontyMain {
    //you can embed the main method any where you want!
    public static void main(String[] args){
        SimMontyMain m = new SimMontyMain();
        m.runSimulation(100000); 
    }

    private int myWinTotal;


    //implement this method
    public void runSimulation (int numGames) {
         SimMonty m = new SimMonty(1);
         int countRuns = 0;
         myWinTotal = 0;
         while(numGames > countRuns){
            myWinTotal += m.playGame();
            countRuns ++;   
         }
         //stop here...
         System.out.println("Win percentage for stay: " + (int)(100*((myWinTotal * 1.0)/numGames)) + "%");
         SimMonty m1 = new SimMonty(0);
         int countRuns1 = 0;
         myWinTotal = 0;
         while(numGames > countRuns1){
            myWinTotal += m1.playGame();
            countRuns1 ++;   
         }
         //stop here...
         System.out.println("Win percentage for random: " + (int)(100*((myWinTotal * 1.0)/numGames)) + "%");
         SimMonty m2 = new SimMonty(2);
         int countRuns2 = 0;
         myWinTotal = 0;
         while(numGames > countRuns2){
            myWinTotal += m2.playGame();
            countRuns2 ++;   
         }
         //stop here...
         System.out.println("Win percentage for switch: " + (int)(100*((myWinTotal * 1.0)/numGames)) + "%");
    }
    
    
}      
