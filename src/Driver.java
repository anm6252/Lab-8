public class Driver {

	public static void main(String[] args) {
		
		
		ArrayQ arrayQ = new ArrayQ();


		arrayQ.enqueue(1);
		arrayQ.enqueue(7);
		arrayQ.enqueue(3);
		arrayQ.enqueue(4);
		arrayQ.enqueue(9);
		arrayQ.enqueue(2);

		
		while (!arrayQ.isEmpty()) {
			
			System.out.println("INTEGER REMOVED:\n " + arrayQ.dequeue());
			
		}

		
		System.out.println("QUEUE IS EMPTY\n");


		LinkedQueue linkedQueue = new LinkedQueue();
		

		linkedQueue.enqueue(1);
		linkedQueue.enqueue(7);
		linkedQueue.enqueue(3);
		linkedQueue.enqueue(4);
		linkedQueue.enqueue(9);
		linkedQueue.enqueue(2);

		
			while (!linkedQueue.isEmpty()) {
				System.out.println("INTEGER REMOVED:\n" + linkedQueue.dequeue());
				
		}

		System.out.println("STACK IS EMPTY\n");

	//remove middle integer	
		
		LinkedQueue linkedQueue2 = new LinkedQueue();
		

		linkedQueue2.enqueue(5);
		linkedQueue2.enqueue(6);
		linkedQueue2.enqueue(90);
		linkedQueue2.enqueue(21);
		linkedQueue2.enqueue(1);
		linkedQueue2.enqueue(14);
		linkedQueue2.enqueue(0);

			linkedQueue2.removeMiddle();
			
		System.out.println("Number Removed: 21");
		
	
	}
}