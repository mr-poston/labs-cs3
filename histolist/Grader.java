/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        HistoList test = new HistoList();
        char[] letters = {'A','A','A','A','B','V','S','E','A','S','A','A'};
        for (char c : letters) {
            test.addLetter(c);
        }
        if (args[0].equals("toString")) {
            out.println(test);
        }
        if (args[0].equals("addLetter")) {
            test = new HistoList();
            test.addLetter('Z');
            out.println(test);
        }
        if (args[0].equals("indexOf")) {
            out.println(test.indexOf('B'));
        }
        if (args[0].equals("nodeAt")) {
            out.println(test.nodeAt(2).equals(test.getFront().getNext().getNext()));
        }
    }
}
