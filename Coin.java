
/**
 * @author Bianca
 * @version 20/02/26
 */
public class Coin
{
    // initialise instance variables
        private final int SIDES = 2;    // number of sides
        private final int HEADS = 1;    // define head side
        private int faceValue;          // store the current face value (0 or 1)
        
    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
        // Flip on creation
        this.flip();
    }

    /**
     * Flip the coin
     */
    public void flip() {
        // Generate a random number either 0 or 1, stores number to faceValue
        faceValue = (int)(Math.random() * SIDES);
    }
    
    /**
     * Getter current side showing
     */
    public int getFaceValue() {
        // Returns the current face value of the coin
        return this.faceValue;
    }
}