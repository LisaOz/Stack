package stack;

import java.util.ArrayList;

public class Stack {

	private ArrayList<String> stack;

	public Stack() {
		this.stack = new ArrayList<>();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public void add(String value) {
		stack.add(value);
	}

	public ArrayList<String> values() {
		return stack;
	}

	public String pop() {
		if (stack.isEmpty()) {
			return null;
		}
		return stack.remove(stack.size() - 1); // remove the topmost element
	}

	public String peek() {
		if (stack.isEmpty()) {
			return null;
		}
		return stack.get(stack.size() - 1); // return the top element
	}

}
