import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Relatives {
    private Map<String, Set<String>> map;

    public Relatives() {

    }

    public void setPersonRelative(String line) {

    }

    public String getRelatives(String person) {
        return null;
    }

    @Override
    public String toString() {
        String output = "";
        for (String person : map.keySet()) {
            output += person + " is related to ";
            for (String s : map.get(person)) {
                output += s + " ";
            }
            output += "\n";
        }
        return output;
    }
}
