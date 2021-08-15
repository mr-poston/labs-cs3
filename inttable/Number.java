public class Number implements Comparable<Number> {
    private int value;

    /**
     * Constructor for Number objects
     */
    public Number(int value) {

    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Number other) {
        return value - other.getValue();
    }

    /**
     * Is this Number equal to obj?
     */
    @Override
    public boolean equals(Object obj) {
        return false;
    }

    /**
     * hashCode is orginally defined in Object
     * Override it here according to the given specifications
     */
    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}