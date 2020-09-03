/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        Dealer dealer = new Dealer();
        dealer.resetHand();
        dealer.addCardToHand(new BlackJackCard(1, "HEARTS"));
        if (args[0].equals("yes")) {
            dealer.addCardToHand(new BlackJackCard(5, "CLUBS"));
        } else if (args[0].equals("no")) {
            dealer.addCardToHand(new BlackJackCard(6, "SPADES"));
        } else {
            return;
        }
        out.println(dealer.hit();
    }
}
