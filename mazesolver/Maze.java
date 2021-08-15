public class Maze {
    private int[][] maze;
    private boolean exitFound;

    /**
     * TODO
     * Set up the maze as a 2d array.
     * You may use nested for loops here.
     */
    public Maze(int size, String line) {

    }

    /**
     * TODO
     * Recursively check for an exit path.
     */
    public void checkForExitPath(int r, int c) {

    }

    /**
     * TODO
     * Make a String representation of the maze.
     */
    @Override
    public String toString() {

    }

    public String result() {
       return exitFound == true ? "exit found\n\n" : "exit not found\n\n";
    }
}