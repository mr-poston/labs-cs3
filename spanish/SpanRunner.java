import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpanRunner {
    public static void main(String[] args) {
        try {
            // Create a Scanner to read from `spantoeng.dat`
            
            // Create a SanishToEnglish object

            // Read an integer from the file and save to an int variable..
            // This is the number of entries contained in the file.

            // Put each entry into the map, using `putEntry()`.

            out.println("\n====\tMAP CONTENTS\t====\n\n");

            // Print the SpanishToEnglish object

            out.println("\n\n\n====\tREAD Lines\t====\n\n");
            // Read the rest of the lines in `spantoeng.dat`
            // For each line, call `translate()`

        } catch (IOException e) {
            out.println("Oops! I can't open that file for some reason.");
        }
    }
}
