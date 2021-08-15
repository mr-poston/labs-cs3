/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        if (args[0].equals("0")) {
            String[][] matrix = {{"-", "-", "-"},
                                 {"@", "-", "-"},
                                 {"@", "@", "-"}};
            AtCounter test = new AtCounter(matrix);
            out.println(test);
        }
        if (args[0].equals("1")) {
            AtCounter test = new AtCounter("pattern1.dat");
            out.println(test.countAts(5, 0));
        }
        if (args[0].equals("2")) {
            AtCounter test = new AtCounter("pattern2.dat");
            out.println(test.countAts(0, 0));
        }
        if (args[0].equals("3")) {
            AtCounter test = new AtCounter("pattern3.dat");
            out.println(test.countAts(2, 2));
        }
        if (args[0].equals("4")) {
            AtCounter test = new AtCounter("pattern4.dat");
            out.println(test.countAts(0, 2));
        }
    }
}