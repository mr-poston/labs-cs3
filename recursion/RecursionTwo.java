public class RecursionTwo {
    public void run(int x) {
        System.out.println(x);
        if (x < 10) {
            run(x + 1);
        }
    }

    public static void main(String[] args) {
        RecursionTwo test = new RecursionTwo();
        test.run(1);
    }
}