import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SpanishToEnglish {
    private Map<String, String> pairs;

    public SpanishToEnglish() {
        // Instantiate `pairs` as an empty TreeMap

    }

    public void putEntry(String entry) {
        // String `entry` will be two words, separated by a space
        // The first word should be used as the key
        // The second word should be used as the value

    }

    public String translate(String sentence) {
        Scanner scan = new Scanner(sentence);
        String output = "";
        // Scan through `sentence` using each word as a key for values in `pairs`
        // Remember to add a space between each word in the output.


        return output;
    }

    public String toString() {
        return pairs.toString().replaceAll("\\,", "\n");
    }
}
