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
            table.add(new Word("one"));
            table.add(new Word("two"));
            table.add(new Word("dog"));
            table.add(new Word("cat"));
            table.add(new Word("chicken"));
            table.add(new Word("pig"));
            table.add(new Word("owl"));
            table.add(new Word("jump"));
            table.add(new Word("run"));
            table.add(new Word("hop"));
            table.add(new Word("shortcut"));
            table.add(new Word("ferret"));
            table.add(new Word("goat"));
            table.add(new Word("hootowl"));
            table.add(new Word("owl"));
            table.add(new Word("go"));
            table.add(new Word("alligator"));
            table.add(new Word("onimonapia"));
            table.add(new Word("food"));
            table.add(new Word("a"));
    		out.println(table);
        }
    }
}
