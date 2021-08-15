import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    public static final int NUMFACES = 13;
    public static final int NUMSUITS = 4;
    public static final int NUMCARDS = 52;

    public static final String[] SUITS = {"CLUBS", "SPADES", "DIAMONDS", "HEARTS"};

    private int topCardIndex;
    private ArrayList<Card> stackOfCards;

    public Deck() {
        // Initialize data: stackOfCards - topCardIndex


        // Loop through suits
        //     Loop through faces
        //         Add in a new card
    }

    // Modifiers
    public void shuffle() {
        // Shuffle the deck - Collections has a shuffle method!
        // Reset variables as needed
    }

    // Accessors
    public int size() {
        // Return the total number of cards in the deck
        return 0;
    }

    public int numCardsLeft() {
        // Return the number of cards that have not been dealt
        return 0;
    }

    public Card nextCard() {
        return stackOfCards.get(topCardIndex--);
    }

    @Override
    public String toString() {
        return stackOfCards + "   topCardIndex = " + topCardIndex;
    }
}
