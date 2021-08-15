import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class HashTableRunner1 {
    public static void main(String[] args) {
        try {
            HashTable table = new HashTable();
            Scanner file = new Scanner(new File("numbers.dat"));

            int runCount = file.nextInt();
            for (int i = 0; i < runCount; i++) {
                Number num = new Number(file.nextInt());
                table.add(num.getValue());
            }
            System.out.println(table);
        } catch (IOException e) {
            System.out.println("Houston, we have a problem!");
        }
    }
}