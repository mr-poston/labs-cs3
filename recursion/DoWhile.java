public class DoWhile {
    public void run() {
        int x = 0;
        do {
            x++;
            System.out.println(x);
        } while (x < 20);
    }
    
    public static void main(String[] args) {
        DoWhile test = new DoWhile();
        test.run();
    }
}