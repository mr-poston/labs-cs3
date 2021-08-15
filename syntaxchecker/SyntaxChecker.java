import java.util.Arrays;
import java.util.Stack;

import static java.lang.System.*;

public class SyntaxChecker {
    private String exp;
    private Stack<String> symbols;

    /** call setExpression with an empty String */
    public SyntaxChecker() {

    }

    /** call setExpression with s */
    public SyntaxChecker(String s) {

    }

    /** initialize instance variables here */
    public void setExpression(String s) {

    }

    /**
     * open symbols should include { ( < [
     * close symbols should include } ) > ]
     * see assignment for algorithm help
     */
    public boolean checkExpression() {
        return false;
    }

    @Override
    public String toString() {
        if (checkExpression()) {
            return exp + " is correct.";
        }
        return exp + " is incorrect.";
    }
}