import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    // Instance variables
    private ArrayList<Card> hand;
    private int winCount;

    // Constructor
    public Player() {
        // Complete this constructor
    }

    public Player(int numWins) {
        // Complete this constructor
    }

    // Modifiers
    public void addCardToHand(Card temp) {
        // Complete this method
    }

    public void resetHand() {
        // Complete this method
    }

    public void setWinCount(int numWins) {
        // Complete this method
    }

    // Accessors
    public int getWinCount() {
        // Complete this method
        return 0;
    }

    public int getHandSize() {
        // Complete this method
        return 0;
    }

    public int getHandValue() {
        // Return total value of all Cards in hand
        return 0;
    }

    // Other methods
    public boolean hit() {
        Scanner keyboard = new Scanner(System.in);

        // Display current hand value
        // Ask: Do you want to hit? [Y/N]
        // Get answer from user input

        return false; // <- Replace this with appropriate return value.
    }

    @Override
    public String toString() {
        return "hand " + hand.toString().replaceAll(",", "\n") + " - " + getHandValue();
    }
}
