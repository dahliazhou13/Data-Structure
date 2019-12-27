package ds.stack;

public class StackString {
	private int maxSize;
	private char[] stackArray;
	private int top;

	public StackString(int size) {
		this.maxSize = size;
		stackArray = new char[this.maxSize];
		this.top = -1;
	}

	public void push(char j) {
		if (this.isFull()) {
			return;
		}
		this.top++;
		stackArray[this.top] = j;
	}

	public char pop() {
		if (this.isEmpty()) {
			System.out.println("The Stack is already empty");
			return 'n';
		}
		int oldTop = top;
		this.top--;
		return stackArray[oldTop];

	}

	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}
}
