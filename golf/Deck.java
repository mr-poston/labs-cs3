import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;

    public static final String[] SUITS = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck() {
        // Initialize instance variables


        // Loop through suits
        //     Loop through faces
        //         Add in a new card
    }

    // Modifiers
    public void suffle() {
        // Shuffle the Deck
        // Reset variables as needed
    }

    // Accessors
    public int size() {
        return 0;
    }

    public int numCardsLeft() {
        return 0;
    }

    public Card nextCard() {
        return stackOfCards.get(topCardIndex--);
    }

    @Override
    public String toString() {
        return stackOfCards + "  topCardIndex = " + topCardIndex;
    }
}
