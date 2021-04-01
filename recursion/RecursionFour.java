public class RecursionFour {
    public int fun(int y) {
        if (y <= 1) {
            return 1;
        }
        return fun(y - 2) + y;
    }
    
    public static void main(String[] args) {
        RecursionFour test = new RecursionFour();
        System.out.println(test.fun(5));
    }
}