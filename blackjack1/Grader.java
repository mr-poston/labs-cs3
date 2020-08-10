/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length == 0) {
            Card card = new BlackJackCard();
            out.println(card);
        } else {
            Card card = new BlackJackCard(Integer.parseInt(args[0]), args[1]);
            out.println(card);
        }
    }
}
