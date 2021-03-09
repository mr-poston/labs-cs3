/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        
        if (args[0].equals("toStringEmpty")) {
            MyLinkedList a = new MyLinkedList();
            out.println(a);
        }
        if (args[0].equals("toStringOne")) {
            MyLinkedList a = new MyLinkedList(20);
            out.println(a);
        }
        if (args[0].equals("add")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		System.out.println(list);
        }
        if (args[0].equals("indexOf")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		System.out.println(list.indexOf(6));
        }
        if (args[0].equals("size")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		System.out.println(list.size());
        }
        if (args[0].equals("set")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		list.set(100, 2);
    		System.out.println(list);
        }
        if (args[0].equals("remove")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		System.out.println(list.remove(1));
        }
        if (args[0].equals("add2")) {
            MyLinkedList list = new MyLinkedList();
    		list.add(4); list.add(5); list.add(6);
    		list.add(50, 2);
    		System.out.println(list);
        }
    }
}