public class RecursionEight {
    public String recur(String s) {
        if (s.length() > 0) {
            return s.charAt(s.length() - 1) + recur(s.substring(0, s.length() - 1));
        }
        return "";
    }
    
    public static void main(String[] args) {
        RecursionEight test = new RecursionEight();
        System.out.println(test.recur("zebra"));
    }
}