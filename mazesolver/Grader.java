/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        if (args[0].equals("0")) {
            Maze test = new Maze(5, "1 0 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 1 1 0 0 0 0 0 1");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("1")) {
            Maze test = new Maze(7, "1 0 0 0 0 1 1 1 1 1 1 0 1 0 0 0 1 0 0 1 0 0 1 1 1 0 1 0 0 1 0 1 0 1 0 0 1 0 1 1 1 0 0 1 0 1 0 0 1");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("2")) {
            Maze test = new Maze(7, "1 0 0 0 0 1 0 1 1 1 1 0 1 0 0 0 1 0 0 1 0 0 1 1 1 0 1 0 0 1 0 1 0 1 0 0 1 0 1 1 1 0 0 1 0 1 0 1 0");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("3")) {
            Maze test = new Maze(7, "1 0 1 1 0 1 0 1 1 1 1 1 1 0 0 0 1 0 0 0 1 0 1 1 1 1 1 1 0 1 0 1 0 1 0 1 1 1 1 1 1 0 0 1 0 1 0 1 0");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("4")) {
            Maze test = new Maze(10, "1 0 1 1 0 1 0 1 1 1 1 1 1 1 1 1 0 1 0 1 0 0 1 0 0 0 1 1 1 1 0 1 1 1 1 1 1 1 0 1 0 1 0 1 0 1 0 1 0 1 1 1 1 1 1 1 0 1 1 1 0 1 0 1 0 1 0 0 0 1 0 1 1 1 0 1 0 0 0 0 0 1 0 1 0 1 0 1 1 1 0 1 1 1 1 1 0 1 1 1");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("5")) {
            Maze test = new Maze(10, "1 0 1 1 0 1 1 1 1 0 1 1 1 1 1 1 0 1 0 1 0 0 1 0 0 0 1 1 1 0 0 1 1 1 1 1 1 1 0 1 0 1 0 1 0 1 0 1 0 1 1 1 1 1 1 1 0 1 1 0 0 1 0 1 0 1 0 0 0 0 0 1 1 1 0 1 0 0 1 1 0 1 0 1 0 1 0 1 1 1 0 1 1 1 1 1 0 1 1 1");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("6")) {
            Maze test = new Maze(4, "1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
        if (args[0].equals("7")) {
            Maze test = new Maze(4, "0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0");
            test.checkForExitPath(0, 0);
            System.out.println(test.result());
        }
    }
}