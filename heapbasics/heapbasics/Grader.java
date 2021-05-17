/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        if (args[0].equals("empty")) {
            Heap heap = new Heap();
            out.println(heap); //[]
        } else {
            Heap heap = new Heap();
            heap.add(1); heap.add(2); heap.add(8); heap.add(9); heap.add(10);
            heap.add(7); heap.add(75); heap.add(17); heap.add(5);
            if (args[0].equals("add")) {
                out.println(heap); //[75, 17, 10, 9, 8, 2, 7, 1, 5]
            }
            if (args[0].equals("remove")) {
                heap.remove();
                out.println(heap); //[17, 9, 10, 5, 8, 2, 7, 1]
            }
        }
    }
}