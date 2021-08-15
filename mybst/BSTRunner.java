import static java.lang.System.out;

public class BSTRunner {
    public static void main(String[] args) {
        MyBST a = new MyBST();

        a.insert(3);  a.insert(8); a.insert(1);  a.insert(4);  a.insert(6);  a.insert(2);
        a.insert(10); a.insert(9); a.insert(20); a.insert(25); a.insert(15); a.insert(16);

        out.println("Original Tree >>> ");
        a.inOrder();

        out.println("\n\nCheck whether Node with value 4 exists >>> " + a.contains(4));
        out.println("\nDelete Node with no chilren (2) >>> " + a.delete(2));
        a.inOrder();

        out.println("\n\nDelete Node with one child (4) >>> " + a.delete(4));
        a.inOrder();

        out.println("\n\nDelete Node with two children (10) >>> " + a.delete(10));
        a.inOrder();

        out.println("\n\nFinal state of tree:");
        a.inOrder();

        out.println("\n\nMinimum value >>> " + a.getMin());
        out.println("\nMaximum value >>> " + a.getMax());

        MyBST b = new MyBST();
        b.insert(5); b.insert(2); b.insert(6); b.insert(1); b.insert(3); b.insert(9);
        b.print();
    }
}