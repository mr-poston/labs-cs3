import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {
	private Set<Integer> odds;
	private Set<Integer> evens;
	
	public OddEvenSets() {
		// Instantiate odds and evens as empty TreeSet objects
	}
	
	public OddEvenSets(String line) {
		// Convert line to a String array
        // Loop through the array and assign each number to the appropriate set
	}
	
	@Override
	public String toString() {
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
