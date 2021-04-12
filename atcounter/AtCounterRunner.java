public class AtCounterRunner {
    public static void main(String[] args) {
        AtCounter test = new AtCounter(10, 10);
        System.out.println(test);
        System.out.println("0 0 has " + test.countAts(0, 0) + "\n\n");

        test = new AtCounter(10, 10);
        System.out.println(test);
        System.out.println("5 5 has " + test.countAts(5, 5) + "\n\n");

        test = new AtCounter("pattern3.dat");
        System.out.println(test);
        System.out.println("2 2 has " + test.countAts(2, 2) + "\n\n");
    }
}