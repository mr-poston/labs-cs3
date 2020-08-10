/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (int i = 0; i < Deck.NUMCARDS; i++) {
            deck.nextCard();
        }
        out.println(deck.numCardsLeft());
        deck.shuffle();
        out.println(deck.numCardsLeft());
        deck.nextCard();
        out.println(deck.numCardsLeft());
        for (int i = 0; i < 7; i++) {
            deck.nextCard();
        }
        out.println(deck.numCardsLeft());
        out.println(deck.size());
    }
}
