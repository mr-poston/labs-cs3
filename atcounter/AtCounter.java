import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AtCounter {
    private String[][] atMat;

    public AtCounter(String[][] matrix) {
        atMat = matrix;
    }

    public AtCounter(String filename) {
        try {
            Scanner scan = new Scanner(new File(filename));
            // TODO:
            // Read data from the given file
            // to fill the matrix
        } catch (IOException e) {
            System.out.println("d'oh!");
        }
    }

    public AtCounter(int rows, int cols) {
        // TODO:
        // Size the matrix
        // Use nested loops to randomly load the matrix
        // You will need to use Math.random()
    }

    public int countAts(int r, int c) {
        // TODO:
        // Add in recursive code to count up the # of @s connected
        // Start checking at spot [r][c]
        // Use * symbol to mark spot as visited
        return 0;
    }

    public void reset() {
        for (int r = 0; r < atMat.length; r++) {
            for (int c = 0; c < atMat[0].length; c++) {
                if (atMat[r][c].equals("*")) {
                    atMat[r][c] = "@";
                }
            }
        }
    }

    /**
     * This method will return all values in the matrix
     * This method should return a view of the matrix
     * that looks like a matrix.
     */
    @Override
    public String toString() {
        String output = "";
        // TODO:

        return output;
    }
}
