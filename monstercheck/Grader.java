/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;

public class Grader {
    public static void main(String[] args) {
        if (args.length != 5) {
            return;
        }
        Skeleton mon1, mon2;
        String name1, name2;
        int size1, size2;
        try {
            mon1 = new Skeleton(args[0], Integer.parseInt(args[1]));
            name1 = args[0];
            size1 = Integer.parseInt(args[1]);
        } catch (Exception e) {
            mon1 = new Skeleton(Integer.parseInt(args[0]), args[1]);
            name1 = args[1];
            size1 = Integer.parseInt(args[0]);
        }
        try {
            mon2 = new Skeleton(args[2], Integer.parseInt(args[3]));
            name2 = args[2];
            size2 = Integer.parseInt(args[3]);
        } catch (Exception e) {
            mon2 = new Skeleton(Integer.parseInt(args[2]), args[3]);
            name2 = args[3];
            size2 = Integer.parseInt(args[2]);
        }
        if (args[4].equals("toString")) {
            out.print(mon1 + " " + mon2)
        }
        if (args[4].equals("getHowBig")) {
            out.print(mon1.getHowBig() == size1);
        }
        if (args[4].equals("getName")) {
            out.print(mon2.getName().equals(name2));
        }
        if (args[4].equals("isBigger")) {
            out.print(mon1.isBigger(mon2));
        }
        if (args[4].equals("isSmaller")) {
            out.print(mon1.isSmaller(mon2));
        }
        if (args[4].equals("namesTheSame")) {
            out.print(mon1.namesTheSame(mon2));
        }
    }
}
