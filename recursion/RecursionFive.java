public class RecursionFive {
    public int fun(int x, int y) {
        if (y < 1) {
            return x;
        }
        return fun(x, y - 2) + x;
    }
    
    public static void main(String[] args) {
        RecursionFive test = new RecursionFive();
        System.out.println(test.fun(4, 3));
    }
}