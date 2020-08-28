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
        out.print(deck.numCardsLeft());
        deck.shuffle();
        out.print(deck.numCardsLeft());
        deck.nextCard();
        out.print(deck.numCardsLeft());
        for (int i = 0; i < 7; i++) {
            deck.nextCard();
        }
        out.print(deck.numCardsLeft());
        out.print(deck.size());
    }
}
