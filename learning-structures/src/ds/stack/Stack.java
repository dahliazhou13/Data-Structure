package ds.stack;

public class Stack {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public Stack(int size) {
		this.maxSize = size;
		stackArray = new long[this.maxSize];
		this.top = -1;
	}

	public void push(long j) {
		if (this.isFull()) {
			return;
		}
		this.top++;
		stackArray[this.top] = j;
	}

	public long pop() {
		if (this.isEmpty()) {
			System.out.println("The Stack is already empty");
			return -1;
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
