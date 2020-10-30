import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {
    private Set<Integer> one;
    private Set<Integer> two;

    public MathSet() {
        this("", "");
    }

    public MathSet(String o, String t) {
        // Suggested implementation: ignore or follow - your choice
        // Instantiate one and two as empty TreeSet objects
        // Create a Scanner to read the integers from o
        // Loop through the Scanner and assign each integer to one
        // Create a Scanner to read the integers from t
        // Loop through the Scanner and assign each integer to two
    }

    // Complete the following five methods so that they behave like the 
    // Mathematical Set Operations

    public Set<Integer> union() {
        return null;
    }

    public Set<Integer> intersection() {
        return null;
    }

    public Set<Integer> differenceAMinusB() {
        return null;
    }

    public Set<Integer> differenceBMinusA() {
        return null;
    }

    public Set<Integer> symmetricDifference() {
        return null;
    }

    @Override
    public String toString() {
        return "Set one " + one + "\n" + "Set two " + two + "\n";
    }
}
