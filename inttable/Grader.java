/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        
        if (args[0].equals("numberHash")) {
            Number x = new Number(34);
            out.println(x.hashCode());
        }
        if (args[0].equals("numberEquals")) {
            Number x = new Number(34);
            Number y = new Number(34);
            Number z = new Number(88);
            out.println("" + x.equals(y) + x.equals(z));
        }
        if (args[0].equals("add")) {
            HashTable table = new HashTable(10);
    		System.out.println(table.add(10));
        }
    }
}