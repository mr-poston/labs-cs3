import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MazeRunner {
    public static void main(String[] args) {
        try {
            Scanner file = new Scanner(new File("maze.dat"));
            while (file.hasNext()) {
                int size = file.nextInt();
                file.nextLine();
                Maze test = new Maze(size, file.nextLine());
                test.checkForExitPath(0, 0);
                System.out.print(test);
                System.out.println(test.result());
            }
        } catch (IOException e) {
            System.out.println("d'oh. Can't open the file!");
        }
    }
}