import static java.lang.System.*;

public class HistoListRunner {
    public static void main(String[] args) {
        
        HistoList test;
        
        // A A A A B V S E A S A A
        test = new HistoList();
        test.addLetter('A');
        test.addLetter('A');
        test.addLetter('A');
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('V');
        test.addLetter('S');
        test.addLetter('E');
        test.addLetter('A');
        test.addLetter('S');
        test.addLetter('A');
        test.addLetter('A');
        out.println(test);  //E - 1    S - 2    V - 1    B - 1    A - 7   
        
        // Indexing the list
        out.println("Index of 'A': " + test.indexOf('A'));  // 4
        out.println("Index of 'B': " + test.indexOf('B'));  // 3
        out.println("Index of 'V': " + test.indexOf('V'));  // 2
        out.println("Index of 'S': " + test.indexOf('S'));  // 1
        out.println("Index of 'E': " + test.indexOf('E'));  // 0
        out.println("Index of 'C': " + test.indexOf('C'));  // -1
        
        // A B C
        test = new HistoList();
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        out.println(test);  //C - 1    B - 1    A - 1	
        
        // A B C A B C A B C A B C A B C
        test = new HistoList();
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        test.addLetter('A');
        test.addLetter('B');
        test.addLetter('C');
        out.println(test);  //C - 5    B - 5    A - 5	
    }
}