public class RecursionThree {
    public void run(int x) {
        if (x < 10) {
            run(x + 1);
        }
        System.out.println(x);
    }

    public static void main(String[] args) {
        RecursionThree test = new RecursionThree();
        test.run(1);
    }
}