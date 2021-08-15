public class GraderTemp {
    public static void main(String[] args) {
        String[][] m = {{"@", "-", "@", "-", "-", "@", "-", "@", "@", "@"},
                        {"@", "@", "@", "-", "@", "@", "-", "@", "-", "@"},
                        {"-", "-", "-", "-", "-", "-", "-", "@", "@", "@"},
                        {"-", "@", "@", "@", "@", "@", "-", "@", "-", "@"},
                        {"-", "@", "-", "@", "-", "@", "-", "@", "-", "@"},
                        {"@", "@", "@", "@", "@", "@", "-", "@", "@", "@"},
                        {"-", "@", "-", "@", "-", "@", "-", "-", "-", "@"},
                        {"-", "@", "@", "@", "-", "@", "-", "-", "-", "-"},
                        {"-", "@", "-", "@", "-", "@", "-", "@", "@", "@"},
                        {"-", "@", "@", "@", "@", "@", "-", "@", "@", "@"}};
        AtCounter test = new AtCounter(m);
        System.out.println(test);
        System.out.println("0 0 has " + test.countAts(0, 0) + "\n");
        System.out.println("2 5 has " + test.countAts(2, 5) + "\n");
        System.out.println("5 0 has " + test.countAts(5, 0) + "\n");
        System.out.println("9 9 has " + test.countAts(9, 9) + "\n");
        System.out.println("3 9 has " + test.countAts(3, 9) + "\n");
    }
}