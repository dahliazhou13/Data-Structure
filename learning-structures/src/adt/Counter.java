package adt;

public class Counter {
	private int count;
	String name;
	public Counter(String str){
		this.count = 0;
		this.name = str;
	}
	public void increment() {
		this.count ++;
	}
	public int getCurrentValue() {
		return this.count;
	}
	public String toString() {
		return this.name + ": " + this.getCurrentValue();
	}
}
