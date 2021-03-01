/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        ListNode z = new ListNode("go",
                                  new ListNode("on",
                                               new ListNode("at",
                                                       new ListNode("34",
                                                               new ListNode("2.1",
                                                                       new ListNode("-a-2-1",
                                                                               new ListNode("up",
                                                                                       new ListNode("over", null))))))));

        if (args[0].equals("print")) {
            out.println(ListFunHouse.print(z));
        }
        if (args[0].equals("nodeCount")) {
            out.println(ListFunHouse.nodeCount(z));
        }
        if (args[0].equals("doubleFirst")) {
            ListFunHouse.doubleFirst(z);
            out.println(ListFunHouse.print(z));
        }
        if (args[0].equals("doubleLast")) {
            ListFunHouse.doubleLast(z);
            out.println(ListFunHouse.print(z));
        }
        if (args[0].equals("removeX")) {
            ListFunHouse.removeXthNode(z, 2);
            out.println(ListFunHouse.print(z));
        }
        if (args[0].equals("setX")) {
            ListFunHouse.setXthNode(z, 2, "one");
            out.println(ListFunHouse.print(z));
        }

    }
}