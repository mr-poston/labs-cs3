import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    private Stack<Double> stack;
    private String expression;

    // call setExpression with an empty String
    public Postfix() {

    }

    // call setExpression with exp
    public Postfix(String exp) {

    }

    // initialize stack and expression here
    public void setExpression(String exp) {

    }

    // perform the given operation (+ - * /) between one and two
    public double calc(double one, double two, char op) {

        return 0.0;
    }

    // read each character from expression
    // determine if the character is a digit or an operator
    // solve the expression
    public double solve() {
        Scanner scan = new Scanner(expression);


        return stack.peek();
    }

    @Override
    public String toString() {
        return expression + " = " + stack.pop();
    }
}