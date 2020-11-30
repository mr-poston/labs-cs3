/****************************************
 * DO NOT DELETE OR CHANGE THIS FILE!!! *
 ****************************************/
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
public class Grader {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("acro.dat"));
            Acronyms test = new Acronyms();
            int num = in.nextInt();
            in.nextLine();
            for (int i = 0; i < num; i++) {
                test.putEntry(in.nextLine());
            }
            while (in.hasNext()) {
                out.println(test.convert(in.nextLine()));
            }
        } catch (IOException e) {
            out.println("Error - could not read file `acro.dat`");
        }
    }
}
