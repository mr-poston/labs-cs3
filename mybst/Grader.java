/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        MyBST test = new MyBST();
        test.insert(5); test.insert(2); test.insert(6); test.insert(1); test.insert(3); test.insert(9);
        if (args[0].equals("inOrder")) {
            test.inOrder();
        }
        if (args[0].equals("contains")) {
            out.println(test.contains(3));
        }
        if (args[0].equals("delete0")) {
            out.println(test.delete(9));
        }
        if (args[0].equals("delete1")) {
            out.println(test.delete(6));
        }
        if (args[0].equals("delete2")) {
            out.println(test.delete(5));
        }
        if (args[0].equals("deleteNo")) {
            out.println(test.delete(88));
        }
        if (args[0].equals("getMax")) {
            out.println(test.getMax());
        }
        if (args[0].equals("getMin")) {
            out.println(test.getMin());
        }
        if (args[0].equals("print")) {
            test.print();
        }
    }
}