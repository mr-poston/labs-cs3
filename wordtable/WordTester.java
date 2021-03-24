public class WordTester {
    public static void main(String[] args) {
        Word one = new Word("45alligator");
        System.out.println(one.hashCode()); // 4

        Word two = new Word("cat");
        System.out.println(two.hashCode()); // 3

        Word three = new Word("whatchamacallit");
        System.out.println(three.hashCode()); // 5
    }
}