public class HashTable {
    private MyLinkedList[] table;

    public HashTable() {
        this(10);
    }

    public HashTable(int size) {
        table = new MyLinkedList[size];
        for (int i = 0; i < table.length; i++) {
            table[i] = new MyLinkedList();
        }
    }

    public void add(Comparable value) {
        int i = value.hashCode();
        if (table[i].contains(value) == false) {
            table[i].add(value);
        }
    }

    @Override
    public String toString() {
        String output = "HASHTABLE\n";
        for (int i = 0; i < table.length; i++) {
            output += "bucket " + i + " ";
            MyLinkedList current = table[i];
            if (current != null) {
                output += current;
            }
            output += "\n";
        }
        output += "\n";
        return output;
    }
}