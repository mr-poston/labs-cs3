/**
 * N.B. Part has to implement Comparable if it is
 * going to be stored in a TreeMap!
 */
public class Part implements Comparable<Part> {
    private String make;
    private String model;
    private String leftOver;
    private int year;

    /**
     * Creates a part object
     */
    public Part(String line) {
        String[] partPieces = line.split(" ");
        int end = partPieces.length;
        // Instantiate make, model, and leftOver
        // year has been instantiated for you!

        year = Integer.parseInt(partPieces[end - 1]);
    }

    // Have to have compareTo if it implements Comparable
    @Override
    public int compareTo(Part other) {
        
        return 0;
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year + " " + leftOver;
    }
}
