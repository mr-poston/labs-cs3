import static java.lang.System.*;

public class ListFunHouseRunner {
    public static void main(String[] args) {
        ListNode z = new ListNode("go",
                                  new ListNode("on", 
                                               new ListNode("at", 
                                                       new ListNode("34", 
                                                               new ListNode("2.1", 
                                                                       new ListNode("-a-2-1", 
                                                                               new ListNode("up", 
                                                                                       new ListNode("over", null))))))));

        out.println("Test Code\n\n");
        
        out.println("Original list values\n");
        out.println(ListFunHouse.print(z));
        out.println("\n");
        
        out.println("num nodes = " + ListFunHouse.nodeCount(z));
        
        out.println("\nList values after calling nodeCount\n");
        out.println(ListFunHouse.print(z));
        out.println();
        
        ListFunHouse.doubleFirst(z);
        out.println("\nList values after calling doubleFirst\n");
        out.println(ListFunHouse.print(z));
        out.println();
        
        ListFunHouse.doubleLast(z);
        out.println("\nList values after calling doubleLast\n");
        out.println(ListFunHouse.print(z));
        out.println();
        
        ListFunHouse.removeXthNode(z, 2);
        out.println("\nList values after calling removeXthNode(2)\n");
        out.println(ListFunHouse.print(z));
        out.println();
        
        ListFunHouse.setXthNode(z, 2, "one");
        out.println("\nList values after calling removeXthNode(2, one)\n");
        out.println(ListFunHouse.print(z));
        out.println();
    }
}