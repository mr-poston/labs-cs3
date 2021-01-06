import java.util.Stack;
import static java.lang.System.*;

public class StackTest {
	private Stack<String> stack;

	public StackTest() {
		setStack("");
	}

	public StackTest(String line) {
		setStack(line);
	}

	public void setStack(String line) {
		stack = new Stack<>();
		for (String s : line.split(" ")) {
			stack.push(s);
		}
	}

	public void popEmAll() {
		out.println("popping all items from the stack");
		while (!stack.isEmpty()) {
			out.print(stack.pop() + " ");
		}
	}

	@Override
	public String toString() {
		return "" + stack + "\n";
	}
}
