/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        Card one = new BlackJackCard(4, "HEARTS");
        Card two = new BlackJackCard(5, "SPADES");
        Card three = new BlackJackCard(2, "SPADES");
        Card four = new BlackJackCard(11, "HEARTS");
        Player player = new Player();
        if (args[0].equals("0")) {
            player.addCardToHand(one);
            player.addCardToHand(two);
            out.print(player.getHandValue());
            player.addCardToHand(three);
            player.addCardToHand(four);
            out.println(player.getHandValue());
        }
        if (args[0].equals("1")) {
            Player winner = new Player(42);
            out.println(winner.getWinCount());
        }
        if (args[0].equals("2")) {
            player.setWinCount(12);
            out.println(player.getWinCount());
        }
        if (args[0].equals("3")) {
            out.println(player.getHandValue());
        }
    }
}
