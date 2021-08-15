import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        if (args[0].equals("1")) {
            out.println(Recur.numEars(3));
        }
        if (args[0].equals("2")) {
            Recur.countdown(5);
        }
        if (args[0].equals("3")) {
            out.println(Recur.factorial(5));
        }
        if (args[0].equals("4")) {
            out.println(Recur.cheerlead("Go Team!", 3));
        }
        if (args[0].equals("5")) {
            out.println(Recur.pow(2, 3));
        }
        if (args[0].equals("6")) {
            out.println(Recur.fibo(8));
        }
        if (args[0].equals("7")) {
            Recur.pattern(16);
            Recur.pattern(10);
        }
        if (args[0].equals("8")) {
            out.println(Recur.countNumA("aaHELLOa"));
        }
        if (args[0].equals("9")) {
            Recur.printAtoBbyC(10, 30, 5);
        }
        if (args[0].equals("10")) {
            out.println(Recur.countOdds(123456));
        }
        if (args[0].equals("11")) {
            out.println(Recur.sumDigits(128));
        }
    }
}