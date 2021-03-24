/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        
        if (args[0].equals("wordHash")) {
            Word x = new Word("boot");
            out.println(x.hashCode());
        }
        if (args[0].equals("numberEquals")) {
            Word x = new Word("foo");
            Word y = new Word("foo");
            Word z = new Word("bar");
            out.println("" + x.equals(y) + x.equals(z));
        }
        if (args[0].equals("add")) {
            HashTable table = new HashTable();
            table.add(one);
            table.add(two);
            table.add(dog);
            table.add(cat);
            table.add(chicken);
            table.add(pig);
            table.add(owl);
            table.add(jump);
            table.add(run);
            table.add(hop);
            table.add(shortcut);
            table.add(ferret);
            table.add(goat);
            table.add(hootowl);
            table.add(owl);
            table.add(go);
            table.add(alligator);
            table.add(onimonapia);
            table.add(food);
            table.add(a);
    		out.println(table);
        }
    }
}