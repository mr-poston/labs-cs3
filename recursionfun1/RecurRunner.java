import static java.lang.System.out;

public class RecurRunner {
    public static void main(String[] args) {
        out.println("numEars(3) >>> " + Recur.numEars(3));
        out.print("countdown(5) >>> ");
        Recur.countdown(5);
        out.println("factorial(5) >>> " + Recur.factorial(5));
        out.println("cheerlead(\"Go team!\", 3) >>> " + Recur.cheerlead("Go Team!", 3));
        out.println("pow(2, 3) >>> " + Recur.pow(2, 3));
        out.println("fibo(8) >>> " + Recur.fibo(8));
        out.print("pattern(16) >>> ");
        Recur.pattern(16);
        out.print("pattern(10) >>> ");
        Recur.pattern(10);
        out.println("contNumA(\"aaHELLOa\") >>> " + Recur.countNumA("aaHELLOa"));
        out.print("printAtoBbyC(10, 30, 5) >>> ");
        Recur.printAtoBbyC(10, 30, 5);
        out.println("countOdds(123456) >>> " + Recur.countOdds(123456));
        out.println("sumDigits(128) >>> " + Recur.sumDigits(128));
    }
}