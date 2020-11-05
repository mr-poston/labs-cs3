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
        one = new TreeSet<>();
        two = new TreeSet<>();
        Scanner s1 = new Scanner(o);
        while (s1.hasNextInt()) {
            one.add(s1.nextInt());
        }
        Scanner s2 = new Scanner(t);
        while (s2.hasNextInt()) {
            two.add(s2.nextInt());
        }
    }

    // Complete the following five methods so that they behave like the 
    // Mathematical Set Operations

    public Set<Integer> union() {
        TreeSet<Integer> union = new TreeSet<>();
        union.addAll(one);
        union.addAll(two);
        return union;
    }

    public Set<Integer> intersection() {
        TreeSet<Integer> test = new TreeSet<>();
        test.addAll(one);
        test.retainAll(two);
        return test;
    }

    public Set<Integer> differenceAMinusB() {
        TreeSet<Integer> test = new TreeSet<>();
        test.addAll(one);
        test.removeAll(two);
        return test;
    }

    public Set<Integer> differenceBMinusA() {
        TreeSet<Integer> test = new TreeSet<>();
        test.addAll(two);
        test.removeAll(one);
        return test;
    }

    public Set<Integer> symmetricDifference() {
        Set<Integer> test = union();
        test.removeAll(intersection());
        return test;
    }

    @Override
    public String toString() {
        return "Set one " + one + "\n" + "Set two " + two + "\n";
    }
}
