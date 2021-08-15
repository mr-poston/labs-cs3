public class HashTableOne {
    public static void main(String[] args) {
        Object[] hashTable = new Object[10];

        Character c = '1';
        hashTable[c.hashCode() % 10] = c;

        Integer num = 113;
        hashTable[num.hashCode() % 10] = num;

        String s = "e";
        hashTable[s.hashCode() % 10] = s;

        //add more objects to the hashtable






        for (Object thing : hashTable) {
            System.out.println(thing);
        }
    }
}