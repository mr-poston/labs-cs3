import static java.lang.System.*;

public class PalinListRunner {
    public static void main(String[] args) {
        PalinList test = new PalinList();
        
        test.setList("one two three two one");
        out.print(test + " ");
        if (test.isPalin()) {
            out.println("is a palinlist.\n");
        } else {
            out.println("is not a palinlist.\n");
        }
    }
}