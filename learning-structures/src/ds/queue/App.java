package ds.queue;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue myQueue = new Queue(5);
		myQueue.insert(100);
		myQueue.insert(1000);
		myQueue.insert(12);
		myQueue.insert(15);
		myQueue.insert(29);
		myQueue.insert(33);
		myQueue.view();
		}

}
