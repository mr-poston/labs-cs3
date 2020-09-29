/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 1) {
            return;
        }
        Monster m;
        if (args[0].equals("0")) {
            m = new Monster();
            out.print(m);
        } else if (args[0].equals("1")) {
            m = new Monster(8);
            out.print(m);
        } else if (args[0].equals("2")) {
            m = new Monster(9, 4);
            out.println(m);
        } else if (args[0].equals("3")) {
            m = new Monster(1, 2, 3);
            out.println(m);
        } else if (args[0].equals("4")) {
            m = new Monster(1, 2, 3);
            m.setHeight(7);
            m.setWeight(6);
            m.setAge(5);
            out.println(m);
        } else if (args[0].equals("5")) {
            m = new Monster(7, 6, 5);
            Monster a = m.clone();
            out.println(a);
        }
        Monster m1 = new Monster(33, 33, 11);
        Monster m2 = new Monster(55, 33, 11);
        Monster m3 = new Monster(33, 44, 11);
        Monster m4 = new Monster(33, 33, 22);
        Monster m5 = new Monster(33, 33, 11);
        if (args[0].equals("6")) {
            out.print(m1.compareTo(m2));
        }
        if (args[0].equals("7")) {
            out.print(m3.compareTo(m4));
        }
        if (args[0].equals("8")) {
            out.print(m1.compareTo(m5));
        }
    }
}
