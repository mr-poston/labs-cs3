public class HistoNode {
    private char letter;
    private int letterCount;
    private HistoNode next;
    
    public HistoNode(char letter, int letterCount, HistoNode next) {
        this.letter = letter;
        this.letterCount = letterCount;
        this.next = next;
    }
    
    public char getLetter() {
        return letter;
    }
    
    public int getLetterCount() {
        return letterCount;
    }
    
    public HistoNode getNext() {
        return next;
    }
    
    public void setLetter(char letter) {
        this.letter = letter;
    }
    
    public void setLetterCount(int count) {
        this.letterCount = count;
    }
    
    public void setNext(HistoNode next) {
        this.next = next;
    }
}