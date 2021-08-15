public class HashTable {
    private MyLinkedList[] table;

    public HashTable() {
        // Calls the one-parameter constructor with an
        // argument of 10 - DONE!
        this(10);
    }

    public HashTable(int size) {
        table = new MyLinkedList[size];
        // fill the array with empty MyLinkedLists
    }

    public MyLinkedList add(Comparable value) {
        Number num = new Number((Integer)value);
        int i = num.hashCode();
        // If `value` doesn't already exist in the table,
        // add it to the list in the appropriate bucket
        // Otherwise, do nothing
        return table[i];
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