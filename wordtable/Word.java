public class Word implements Comparable<Word> {
    private String value;
    
    public Word(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }
    
    @Override
    public int compareTo(Word other) {
        return value.compareTo(other.getValue());
    }
    
    @Override
    public boolean equals(Object obj) {
        String loc = ((Word)obj).getValue();
        return value.compareTo(loc) == 0;
    }
    
    @Override
    public int hashCode() {
        int count = 0;
        for (char c : value.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) > -1) {
                count++;
            }
        }
        return (value.length() * count) % 10;
    }
    
    @Override
    public String toString() {
        return "" + value;
    }
}