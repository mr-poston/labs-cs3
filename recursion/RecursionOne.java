public class RecursionOne {
    public void run(int x) {
        System.out.println(x);
        run(x + 1);
    }

    public static void main(String[] args) {
        RecursionOne test = new RecursionOne();
        test.run(1);
    }
}