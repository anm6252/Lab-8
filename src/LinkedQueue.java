// This class implements a queue using a linked list
// It requires the LinkedNode class to be defined
public class LinkedQueue {

	LinkedNode front;
	LinkedNode rear;
	int count;
	private char[] toString;

	LinkedQueue() {
		front = rear = null;
		count = 0;
	}

	void enqueue(int x) {
		LinkedNode newNode = new LinkedNode(x);
		if (rear != null)
			rear.next = newNode;
		else
			front = newNode;
		rear = newNode;
		count++;
	}

	int dequeue() {
		if (front == null) {
			return -1;
		}

		if (front != rear) {
			int x = front.x;
			front = front.next;
			count--;
			return x;
		} else {
			int x = front.x;
			front = null;
			rear = null;
			count--;
			return x;
		}
	}

	int first() {
		return front.x;
	}

	boolean isEmpty() {
		return count == 0;
	}

	int size() {
		return count;
	}

	
	//Added Code
	
	public String toString() {
		String string = "";

		LinkedNode list = front;
		
			while (list != null) {
			
				string += list.x + " ";
				list = list.next;
			
		}
		
		return string;
		
	}

	public void removeMiddle() {

		LinkedQueue newQueue = new LinkedQueue();

		int half = count / 2;

			while (size() > 0) {
				
				int vals = dequeue();
				newQueue.enqueue(vals);
				
		if (size() - 1 == half) {
			
			dequeue();
				
			}
		}

		
		while (newQueue.size() > 0) {
			
			enqueue(newQueue.dequeue());
			
		}

		System.out.println(toString());
		
	}
}