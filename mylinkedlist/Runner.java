import static java.lang.System.out;

public class Runner {
    public static void main(String[] args) {
        MyLinkedList a = new MyLinkedList();
        MyLinkedList b = new MyLinkedList(20);

        out.println(a); // []
        out.println(b); // [20]

        MyLinkedList list = new MyLinkedList();
        list.add(4); list.add(5); list.add(6);
        out.println(list); // [4, 5, 6]
        out.println(list.size()); // 3

        out.println(list.indexOf(6)); // 2

        list.add(10);
        out.println(list.get(list.size() - 1)); // 10

        list.add(7); list.add(8); list.add(9);
        list.set(100, 4);
        out.println(list); // [4, 5, 6, 10, 100, 8, 9]
        out.println(list.size()); // 7

        out.println(list.remove(1)); // 5
        out.println(list); // [4, 6, 10, 100, 8, 9]

        list.add(1000, 2);
        out.println(list); // [4, 6, 1000, 10, 100, 8, 9]

        while (!list.isEmpty()) {
            out.print(list.remove(0) + " "); // 4 6 1000 10 100 8 9
        }

        out.println("\n" + list.size()); // 0
    }
}