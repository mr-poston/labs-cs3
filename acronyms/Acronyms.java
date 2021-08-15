import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Acronyms {
    private Map<String, String> acronymTable;

    public Acronyms() {

    }

    public void putEntry(String entry) {
        String[] list = entry.split(" \\- ");
    }

    public String convert(String line) {
        Scanner scan = new Scanner(line);
        String output = "";

        return output;
    }

    @Override
    public String toString() {
        return acronymTable.toString().replaceAll("\\,", "\n");
    }
}
