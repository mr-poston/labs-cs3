public class RecursionSix {
    public static int fun(int x, int y) {
        if (x == 0) {
            return x;
        }
        return x + fun(y - 1, x);
    }
    
    public static void main(String[] args) {
        System.out.println(fun(4, 4));
    }
}