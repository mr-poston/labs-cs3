import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HashTableRunner2 {
    public static void main(String[] args) {
        try {
            HashTable table = new HashTable();
            Scanner file = new Scanner(new File("words.dat"));

            int runCount = file.nextInt();
            for (int i = 0; i < runCount; i++) {
                Word word = new Word(file.next());
                table.add(word);
            }
            System.out.println(table);
        } catch (IOException e) {
            System.out.println("Houston, we have a problem!");
        }
    }
}