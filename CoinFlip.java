import java.util.Scanner; // imports Java 
/**
 * @author Bianca
 * @version 20/02/26
 */
public class CoinFlip {
    // declare instance variables
    private Coin coin1;
    private Coin coin2;
    
    // stores streak variables for each coin
    int streak1 = 0;
    int streak2 = 0; 
    private int winCondition; // user inputs how many times in a streak is a win
    
    // stores previous side coin is facing
    private int lastResult1;
    private int lastResult2;
    
    // stores current side coin is facing 
    private int currentResult1;
    private int currentResult2; 
     
    /**
     * Constructor for objects of class CoinFlip
     */
    public CoinFlip(int winningNum) {
        // initialise instance variables
        this.coin1 = new Coin(); 
        this.coin2 = new Coin();
        this.winCondition = winningNum;
    }
    
    public void StartRace() { 
        while (streak1 < winCondition && streak2 < winCondition) {
            // run loop until coin hits the user's streak input
            coin1.flip(); // flips the first coin
            currentResult1 = coin1.getFaceValue(); // stores the current side of the first coin
            if (lastResult1 == currentResult1) { // if results are the same, add a point to the streak
                streak1 ++; // increase the streak by 1
            } else {
                streak1 = 1; // reset the streak
            }
            if (currentResult1 == 1) { // print statement if result equals to one
                System.out.println("Coin 1 has flipped to heads. Streak: " + streak1);
            } else { // print statement if result equals to zero
                System.out.println("Coin 1 has flipped to tails. Streak: " + streak1);
            }
            lastResult1 = currentResult1; // changes from previous result to new result
            
            coin2.flip(); // flips the second coin
            currentResult2 = coin2.getFaceValue(); // stores the current side of the first coin
            if (lastResult2 == currentResult2) { // if results are the same, add a point to the streak
                streak2 ++; // increase the streak by 1
            } else {
                streak2 = 1; // reset the streak
            }
            if (currentResult2 == 1) { // print statement if result equals to one
                System.out.println("Coin 2 has flipped to heads. Streak: " + streak2);
            } else { // print statement if result equals to zero
                System.out.println("Coin 2 has flipped to tails. Streak: " + streak2);
            }
            lastResult2 = currentResult2; // changes from previous result to new result
            System.out.println("--------------------------------------"); // prints line for better readability
            
            if (streak1 == winCondition && streak2 == winCondition) {  // print statement if both coins' streak are equal to the user's input
                System.out.println("Both sides have tied. Streak: " + winCondition + ".");
                System.out.println(); // prints out new line
            } else if (streak1 == winCondition) { // print statement if first coin's streak is equal to the user's input
                System.out.println("Coin 1 has won! Streak: " + winCondition + ".");
                System.out.println(); // prints out new line
            } else if (streak2 == winCondition) { // print statement if second coin's streak is equal to the user's input
                System.out.println("Coin 2 has won! Streak: " + winCondition + ".");
                System.out.println(); // prints out new line
            }
        }
    }
}                      