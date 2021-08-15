public class NumberTester {
    public static void main(String[] args) {
        Number one = new Number(45);
        System.out.println(one.hashCode()); // 5

        Number two = new Number(107);
        System.out.println(two.hashCode()); // 7

        Number three = new Number(213);
        System.out.println(three.hashCode()); // 3
    }
}